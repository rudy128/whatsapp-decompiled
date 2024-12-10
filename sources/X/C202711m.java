package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.11m  reason: invalid class name and case insensitive filesystem */
public class C202711m implements C201511a {
    public final AnonymousClass11P A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass00H A04;

    public Cursor A02(C28781at r5, int i, long j) {
        String[] strArr = {String.valueOf(j), String.valueOf(i), String.valueOf(AnonymousClass11P.A01(this.A00))};
        C23141Ev r2 = ((C28801av) r5).A02;
        String str = C63702tY.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(C63702tY.A00(i));
        sb.append(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)");
        return r2.A0A(sb.toString(), "GET_MESSAGE_ADD_ON_FOR_PARENT_MESSAGE_SQL", strArr);
    }

    public Cursor A03(C28781at r7, int i, long j, long j2, boolean z) {
        String str;
        String[] strArr = new String[5];
        strArr[0] = String.valueOf(j);
        strArr[1] = String.valueOf(i);
        strArr[2] = String.valueOf(AnonymousClass11P.A01(this.A00));
        strArr[3] = String.valueOf(j2);
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[4] = str;
        C23141Ev r4 = ((C28801av) r7).A02;
        String str2 = C63702tY.A01;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C63702tY.A00(i));
        sb2.append(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)");
        sb.append(sb2.toString());
        sb.append(" AND ");
        sb.append("message_add_on");
        sb.append(".");
        sb.append("sender_jid_row_id");
        sb.append(" = ? AND ");
        sb.append("message_add_on");
        sb.append(".");
        sb.append("from_me");
        sb.append(" = ? ");
        return r4.A0A(sb.toString(), "MessageAddOnStore/getMessageAddOnCursorForMessage", strArr);
    }

    public Cursor A04(C28781at r5, AnonymousClass205 r6) {
        AnonymousClass1LW r1 = this.A01;
        AnonymousClass1BI r0 = r6.A00;
        C17960vV.A07(r0);
        return ((C28801av) r5).A02.A0A(C63702tY.A04, "MessageAddOnStore/getSelectMessageAddOnForMessageKeyWithoutExtraTables", new String[]{String.valueOf(r1.A09(r0)), r6.A01, String.valueOf(r6.A02 ? 1 : 0), String.valueOf(AnonymousClass11P.A01(this.A00))});
    }

    public long A00(AnonymousClass212 r23) {
        long j;
        Cursor A0A;
        long j2;
        long j3;
        Integer num;
        Integer valueOf;
        long j4;
        String str;
        AnonymousClass212 r4 = r23;
        AnonymousClass205 r0 = r4.A0v;
        String str2 = r0.A01;
        boolean z = r0.A02;
        String valueOf2 = String.valueOf(z ? 1 : 0);
        AnonymousClass1LW r3 = this.A01;
        AnonymousClass1BI r2 = r0.A00;
        C17960vV.A07(r2);
        String valueOf3 = String.valueOf(r3.A09(r2));
        AnonymousClass1BI A0H = r4.A0H();
        if (A0H != null) {
            j = this.A02.A09(A0H);
        } else {
            j = -1;
        }
        String valueOf4 = String.valueOf(j);
        AnonymousClass1Cd r7 = this.A03;
        C28781at A042 = r7.get();
        try {
            A0A = ((C28801av) A042).A02.A0A(C63702tY.A01, "SELECT_ROW_ID_OF_PLACEHOLDER", new String[]{str2, valueOf2, valueOf3, valueOf4});
            if (A0A.moveToNext()) {
                j2 = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
                A0A.close();
                A042.close();
            } else {
                A0A.close();
                A042.close();
                j2 = -1;
            }
            if (j2 > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("parent_message_row_id", Long.valueOf(r4.A02));
                contentValues.put("status", Integer.valueOf(r4.A0D()));
                contentValues.put("message_add_on_type", Integer.valueOf(r4.A0u));
                contentValues.put("received_timestamp", Long.valueOf(r4.A0G));
                int A17 = r4.A17();
                Long l = null;
                if (A17 <= 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(A17);
                }
                contentValues.put("expiry_duration_in_secs", valueOf);
                if (r4 instanceof AnonymousClass22C) {
                    long j5 = r4.A01;
                    if (j5 > 0) {
                        l = Long.valueOf(j5);
                    }
                }
                contentValues.put("expiry_timestamp", l);
                AnonymousClass1BI A0H2 = r4.A0H();
                if (A0H2 != null) {
                    j4 = this.A02.A09(A0H2);
                } else {
                    j4 = -1;
                }
                String[] strArr = new String[4];
                strArr[0] = str2;
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[1] = str;
                C17960vV.A07(r2);
                strArr[2] = String.valueOf(r3.A09(r2));
                strArr[3] = String.valueOf(j4);
                C28791au A05 = r7.A05();
                try {
                    ((C28801av) A05).A02.A02(contentValues, "message_add_on", "message_add_on_type=11 AND key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", "MessageAddOnStore/updateMessageAddOnAfterRetry", strArr);
                    A05.close();
                    return j2;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            } else {
                C28791au A052 = r7.A05();
                try {
                    ContentValues contentValues2 = new ContentValues(15);
                    C17960vV.A07(r2);
                    contentValues2.put("chat_row_id", Long.valueOf(r3.A09(r2)));
                    contentValues2.put("from_me", Boolean.valueOf(z));
                    contentValues2.put("key_id", str2);
                    AnonymousClass1BI A0H3 = r4.A0H();
                    if (A0H3 != null) {
                        j3 = this.A02.A09(A0H3);
                    } else {
                        j3 = -1;
                    }
                    contentValues2.put("sender_jid_row_id", Long.valueOf(j3));
                    contentValues2.put("parent_message_row_id", Long.valueOf(r4.A02));
                    contentValues2.put("timestamp", Long.valueOf(r4.A0I));
                    contentValues2.put("status", Integer.valueOf(r4.A0D()));
                    contentValues2.put("message_add_on_type", Integer.valueOf(r4.A0u));
                    contentValues2.put("received_timestamp", Long.valueOf(r4.A0G));
                    int A172 = r4.A17();
                    Long l2 = null;
                    if (A172 <= 0) {
                        num = null;
                    } else {
                        num = Integer.valueOf(A172);
                    }
                    contentValues2.put("expiry_duration_in_secs", num);
                    if (r4 instanceof AnonymousClass22C) {
                        long j6 = r4.A01;
                        if (j6 > 0) {
                            l2 = Long.valueOf(j6);
                        }
                    }
                    contentValues2.put("expiry_timestamp", l2);
                    contentValues2.put("expiry_type", Integer.valueOf(r4.A00));
                    contentValues2.put("server_timestamp", Long.valueOf(r4.A03));
                    long A09 = ((C28801av) A052).A02.A09("message_add_on", "MessageAddOnStore/insertMessageAddOn", contentValues2, 4);
                    r4.A0x = A09;
                    A052.close();
                    return A09;
                } catch (Throwable th2) {
                    th = th2;
                    A052.close();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
        throw th;
    }

    public Cursor A01(C28781at r6, int i, long j) {
        C23141Ev r4 = ((C28801av) r6).A02;
        String str = C63702tY.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(C63702tY.A00(i));
        sb.append(" WHERE message_add_on._id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)");
        return r4.A0A(sb.toString(), "MessageAddOnStore/getMessageAddOnCursorForAddOnRowId", new String[]{String.valueOf(j), String.valueOf(i), String.valueOf(AnonymousClass11P.A01(this.A00))});
    }

    public AnonymousClass212 A05(Cursor cursor, HashMap hashMap) {
        int i;
        int i2;
        String str;
        HashMap hashMap2 = hashMap;
        int A012 = AnonymousClass1Eu.A01("from_me", hashMap2);
        int A013 = AnonymousClass1Eu.A01("key_id", hashMap2);
        int A014 = AnonymousClass1Eu.A01("chat_row_id", hashMap2);
        boolean z = false;
        if (cursor.getInt(A012) == 1) {
            z = true;
        }
        String string = cursor.getString(A013);
        AnonymousClass1BI A0B = this.A01.A0B(cursor.getLong(A014));
        if (A0B == null) {
            str = "MessageAddOnStore/createFMessageFromCursor unexpected jid for MessageAddOn";
        } else {
            AnonymousClass205 r10 = new AnonymousClass205(A0B, string, z);
            int A015 = AnonymousClass1Eu.A01("timestamp", hashMap2);
            int A016 = AnonymousClass1Eu.A01("received_timestamp", hashMap2);
            int A017 = AnonymousClass1Eu.A01("message_add_on_type", hashMap2);
            int A018 = AnonymousClass1Eu.A01("server_timestamp", hashMap2);
            int A019 = AnonymousClass1Eu.A01("expiry_duration_in_secs", hashMap2);
            int A0110 = AnonymousClass1Eu.A01("expiry_type", hashMap2);
            int A0111 = AnonymousClass1Eu.A01("expiry_timestamp", hashMap2);
            long j = cursor.getLong(A015);
            long j2 = cursor.getLong(A016);
            long j3 = 0;
            if (j2 == 0) {
                j2 = j;
            }
            int i3 = cursor.getInt(A017);
            if (!cursor.isNull(A018)) {
                j3 = cursor.getLong(A018);
            }
            if (cursor.isNull(A019)) {
                i = 0;
            } else {
                i = cursor.getInt(A019);
            }
            if (cursor.isNull(A0110)) {
                i2 = 0;
                if (i > 0) {
                    i2 = 1;
                }
            } else {
                i2 = cursor.getInt(A0110);
            }
            AnonymousClass206 A002 = ((AnonymousClass207) this.A04.get()).A00(r10, i3, j);
            if (!(A002 instanceof AnonymousClass212)) {
                str = "MessageAddOnStore/createFMessageFromCursor read fMessage with not supported messageAddOnType";
            } else {
                if (!r10.A02) {
                    A002.A0G = j2;
                }
                AnonymousClass212 r5 = (AnonymousClass212) A002;
                r5.A00 = i2;
                long j4 = cursor.getLong(A0111);
                if (r5 instanceof AnonymousClass22C) {
                    r5.A01 = j4;
                }
                r5.A19(i);
                r5.A1A(j3);
                return r5;
            }
        }
        Log.e(str);
        return null;
    }

    public AnonymousClass212 A06(AnonymousClass206 r7, int i) {
        Cursor A022;
        long j = r7.A0x;
        C28781at A042 = this.A03.get();
        try {
            A022 = A02(A042, i, j);
            if (!A022.moveToNext()) {
                A022.close();
                A042.close();
                return null;
            }
            HashMap A012 = C63792th.A01(A022, i);
            AnonymousClass212 A05 = A05(A022, A012);
            if (A05 != null) {
                A05.A1B(A022, this.A02, A012);
                A05.A05 = new A51(r7.A0H(), r7.A0v);
            }
            A022.close();
            A042.close();
            return A05;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A07(int i, long j) {
        String obj;
        Cursor A0A;
        C28781at A042 = this.A03.get();
        try {
            String[] strArr = {String.valueOf(j), String.valueOf(AnonymousClass11P.A01(this.A00))};
            C23141Ev r3 = ((C28801av) A042).A02;
            String str = C63702tY.A01;
            if (i <= -1) {
                obj = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" LIMIT ");
                sb.append(i);
                obj = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C63702tY.A00(79));
            sb2.append(" WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1");
            sb2.append(" ORDER BY CASE WHEN server_timestamp > 0 THEN server_timestamp ELSE timestamp END DESC");
            sb2.append(obj);
            A0A = r3.A0A(sb2.toString(), "MessageAddOnStore/getMessageAddOnCursorForPinnedMessagesInChat", strArr);
            ArrayList arrayList = new ArrayList(A0A.getCount());
            while (A0A.moveToNext()) {
                HashMap A012 = C63792th.A01(A0A, 79);
                AnonymousClass212 A05 = A05(A0A, A012);
                if (!(A05 instanceof AnonymousClass22C)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("MessageAddOnStore/getMessageAddOnsForPinnedMessagesInChat Unexpected FMessage ");
                    sb3.append(A05);
                    Log.e(sb3.toString());
                } else {
                    A05.A1B(A0A, this.A02, A012);
                    arrayList.add((AnonymousClass22C) A05);
                }
            }
            A0A.close();
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A08(long j) {
        C28791au A05 = this.A03.A05();
        try {
            ((C28801av) A05).A02.A04("message_add_on", "_id = ?", "MessageAddOnStore/deleteMessageAddOn", new String[]{String.valueOf(j)});
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A09(AnonymousClass212 r15, long j) {
        Integer num;
        C28791au A05 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues(6);
            contentValues.put("key_id", r15.A0v.A01);
            contentValues.put("timestamp", Long.valueOf(r15.A0I));
            contentValues.put("status", Integer.valueOf(r15.A0D()));
            int A17 = r15.A17();
            Long l = null;
            if (A17 <= 0) {
                num = null;
            } else {
                num = Integer.valueOf(A17);
            }
            contentValues.put("expiry_duration_in_secs", num);
            if (r15 instanceof AnonymousClass22C) {
                long j2 = r15.A01;
                if (j2 > 0) {
                    l = Long.valueOf(j2);
                }
            }
            contentValues.put("expiry_timestamp", l);
            contentValues.put("server_timestamp", Long.valueOf(r15.A03));
            ((C28801av) A05).A02.A02(contentValues, "message_add_on", "_id = ?", "MessageAddOnStore/updateMessageAddOn", new String[]{String.valueOf(j)});
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0A(Set set, int i) {
        C41851xA BD0;
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        C28791au A05 = this.A03.A05();
        try {
            BD0 = A05.BD0();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass205 r2 = (AnonymousClass205) it.next();
                String[] strArr = new String[3];
                AnonymousClass1LW r1 = this.A01;
                AnonymousClass1BI r0 = r2.A00;
                C17960vV.A07(r0);
                strArr[0] = String.valueOf(r1.A09(r0));
                if (r2.A02) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[1] = str;
                strArr[2] = r2.A01;
                ((C28801av) A05).A02.A02(contentValues, "message_add_on", "chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnStore/updateMessageAddOnsStatusForKeys", strArr);
            }
            BD0.A00();
            BD0.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C202711m(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1DL r3, AnonymousClass1Cd r4, AnonymousClass00H r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
    }
}
