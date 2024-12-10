package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1N3  reason: invalid class name */
public class AnonymousClass1N3 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass1N2 A04;
    public final C18030ve A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11P A07;

    public static String[] A02(AnonymousClass1N3 r3, AnonymousClass205 r4) {
        String str;
        String[] strArr = new String[3];
        AnonymousClass1LW r1 = r3.A01;
        AnonymousClass1BI r0 = r4.A00;
        C17960vV.A07(r0);
        strArr[0] = String.valueOf(r1.A09(r0));
        if (r4.A02) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[1] = str;
        strArr[2] = r4.A01;
        return strArr;
    }

    public void A04(AnonymousClass206 r18, boolean z) {
        String str;
        String str2;
        ContentValues contentValues;
        C23141Ev r11;
        AnonymousClass205 r6;
        String[] strArr;
        Cursor A0A;
        AnonymousClass206 r3 = r18;
        r3.A14(1);
        C28791au A052 = this.A03.A05();
        if (z) {
            try {
                List<AnonymousClass1BI> A0T = r3.A0T();
                if (A0T == null || A0T.size() <= 0) {
                    contentValues = new ContentValues();
                    A01(contentValues, r3);
                    r6 = r3.A0v;
                    strArr = new String[]{r6.A01};
                    r11 = ((C28801av) A052).A02;
                    str2 = "broadcast = 1 AND from_me = 1 AND key_id = ?";
                    str = "UPDATE_MESSAGE_MAIN_BROADCAST_SCAN_SQL";
                } else {
                    ArrayList arrayList = new ArrayList(A0T.size() + 1);
                    AnonymousClass1LW r9 = this.A01;
                    r6 = r3.A0v;
                    arrayList.add(String.valueOf(r9.A09(r6.A00)));
                    for (AnonymousClass1BI A09 : A0T) {
                        arrayList.add(String.valueOf(r9.A09(A09)));
                    }
                    arrayList.add(r6.A01);
                    contentValues = new ContentValues();
                    A01(contentValues, r3);
                    StringBuilder sb = new StringBuilder();
                    sb.append("chat_row_id IN ");
                    sb.append(AnonymousClass1H2.A00(arrayList.size() - 1));
                    sb.append(" AND ");
                    sb.append("from_me = 1");
                    sb.append(" AND ");
                    sb.append("key_id = ?");
                    str2 = sb.toString();
                    r11 = ((C28801av) A052).A02;
                    strArr = (String[]) arrayList.toArray(new String[0]);
                    str = "UPDATE_MESSAGE_MAIN_BROADCAST_PARTICIPANTS_SQL";
                }
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            contentValues = new ContentValues();
            A00(contentValues, this, r3);
            r6 = r3.A0v;
            strArr = A02(this, r6);
            r11 = ((C28801av) A052).A02;
            str2 = "chat_row_id = ? AND from_me = ? AND key_id = ?";
            str = "UPDATE_MESSAGE_MAIN_SQL";
        }
        r11.A02(contentValues, "message", str2, str, strArr);
        if (r3.A0x <= 0 && !z) {
            A0A = r11.A0A("SELECT _id FROM message WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "FIND_MESSAGE_MAIN_SQL", A02(this, r6));
            if (A0A.moveToNext()) {
                r3.A0x = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            }
            A0A.close();
        }
        A052.close();
        return;
        throw th;
    }

    public Long A03(C28781at r5, AnonymousClass205 r6) {
        Cursor A0A = ((C28801av) r5).A02.A0A("SELECT _id FROM message WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "GET_MESSAGE_ROW_ID_FOR_MESSAGE_KEY_SQL", A02(this, r6));
        try {
            if (A0A.moveToNext()) {
                Long valueOf = Long.valueOf(A0A.getLong(A0A.getColumnIndexOrThrow("_id")));
                A0A.close();
                return valueOf;
            }
            A0A.close();
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public boolean A05(Set set, boolean z) {
        C443423b r1 = new C443423b(set.toArray(C19620yd.A0L), 975);
        C28791au A052 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues();
            Iterator it = r1.iterator();
            int i = 0;
            while (it.hasNext()) {
                Long[] lArr = (Long[]) it.next();
                int length = lArr.length;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = String.valueOf(lArr[i2]);
                }
                C63432t4.A02(contentValues, "starred", z);
                C23141Ev r7 = ((C28801av) A052).A02;
                StringBuilder sb = new StringBuilder();
                sb.append("_id IN ");
                sb.append(AnonymousClass1H2.A00(length));
                i += r7.A02(contentValues, "message", sb.toString(), "UPDATE_MESSAGE_STARRED_BY_ROW_ID_MAIN_SQL", strArr);
            }
            A052.close();
            if (i != set.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MainMessageStore/updateMessageStarredStatusV2/update failed; rowIds=");
                sb2.append(set);
                Log.e(sb2.toString());
            }
            return true;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1N3(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass1LW r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, AnonymousClass1N2 r6, C18030ve r7, AnonymousClass00H r8) {
        this.A07 = r2;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
    }

    public static void A00(ContentValues contentValues, AnonymousClass1N3 r6, AnonymousClass206 r7) {
        contentValues.put("status", Integer.valueOf(r7.A0D()));
        C63432t4.A02(contentValues, "broadcast", r7.A0l);
        contentValues.put("recipient_count", Integer.valueOf(r7.A0A));
        C63432t4.A01(contentValues, "participant_hash", r7.A0f);
        contentValues.put("origination_flags", Long.valueOf(r7.A0G()));
        contentValues.put("origin", Integer.valueOf(r7.A09));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        long j = r7.A0G;
        if (j == 0) {
            j = AnonymousClass11P.A01(r6.A07);
        }
        contentValues.put("received_timestamp", Long.valueOf(j));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Integer.valueOf(r7.A0u));
        C63432t4.A01(contentValues, "text_data", r7.A0R());
        C63432t4.A01(contentValues, "translated_text", r7.A0S());
        contentValues.put("lookup_tables", Long.valueOf(r7.A0F()));
        contentValues.put("sort_id", Long.valueOf(r7.A0y));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A08));
        int i = r7.A0S;
        if (i == null) {
            i = 0;
        }
        contentValues.put("view_mode", i);
    }

    private void A01(ContentValues contentValues, AnonymousClass206 r7) {
        contentValues.put("status", Integer.valueOf(r7.A0D()));
        contentValues.put("recipient_count", Integer.valueOf(r7.A0A));
        contentValues.put("origination_flags", Long.valueOf(r7.A0G()));
        contentValues.put("origin", Integer.valueOf(r7.A09));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        long j = r7.A0G;
        if (j == 0) {
            j = AnonymousClass11P.A01(this.A07);
        }
        contentValues.put("received_timestamp", Long.valueOf(j));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Integer.valueOf(r7.A0u));
        C63432t4.A01(contentValues, "text_data", r7.A0R());
        C63432t4.A01(contentValues, "translated_text", r7.A0S());
        contentValues.put("lookup_tables", Long.valueOf(r7.A0F()));
        contentValues.put("sort_id", Long.valueOf(r7.A0y));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A08));
    }
}
