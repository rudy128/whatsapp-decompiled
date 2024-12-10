package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1TA  reason: invalid class name */
public class AnonymousClass1TA {
    public AnonymousClass00H A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass1DL A02;

    public AnonymousClass2Q4 A04(String str) {
        boolean containsKey;
        AnonymousClass2Q4 A012;
        AnonymousClass2Q4 r0;
        if (str == null) {
            return null;
        }
        AnonymousClass00H r6 = this.A00;
        HashMap hashMap = ((C57192ig) r6.get()).A00;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(str);
        }
        if (containsKey) {
            HashMap hashMap2 = ((C57192ig) r6.get()).A00;
            synchronized (hashMap2) {
                r0 = (AnonymousClass2Q4) hashMap2.get(str);
            }
            return r0;
        }
        C28781at A04 = this.A01.get();
        try {
            Cursor A0A = ((C28801av) A04).A02.A0A("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE call_id = ? ", "joinable_call_log_store/GET_JOINABLE_CALL_LOG_BY_CALL_ID", new String[]{str});
            try {
                if (!A0A.moveToLast() || (A012 = A01(A0A)) == null) {
                    HashMap hashMap3 = ((C57192ig) r6.get()).A00;
                    synchronized (hashMap3) {
                        hashMap3.put(str, (Object) null);
                    }
                    A0A.close();
                    A04.close();
                    return null;
                }
                ((C57192ig) r6.get()).A00(A012);
                A0A.close();
                A04.close();
                return A012;
            } catch (Throwable th) {
                if (A0A != null) {
                    A0A.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public static ContentValues A00(AnonymousClass1TA r3, AnonymousClass2Q4 r4) {
        long j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("call_log_row_id", Long.valueOf(r4.A01()));
        contentValues.put("call_id", r4.A00);
        contentValues.put("joinable_video_call", Boolean.valueOf(r4.A01));
        if (r4.A02 != null) {
            j = r3.A02.A09(r4.A02);
        } else {
            j = 0;
        }
        contentValues.put("group_jid_row_id", Long.valueOf(j));
        return contentValues;
    }

    public AnonymousClass2Q4 A01(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("call_log_row_id");
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        long j = cursor.getLong(columnIndex);
        String string = cursor.getString(cursor.getColumnIndexOrThrow("call_id"));
        boolean z = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("joinable_video_call")) > 0) {
            z = true;
        }
        Jid A0B = this.A02.A0B(cursor.getLong(cursor.getColumnIndexOrThrow("group_jid_row_id")));
        C36321nh r0 = GroupJid.Companion;
        return new AnonymousClass2Q4(C36321nh.A00(A0B), string, j, z);
    }

    public AnonymousClass2Q4 A02(GroupJid groupJid) {
        AnonymousClass2Q4 r0;
        HashMap hashMap = ((C57192ig) this.A00.get()).A01;
        synchronized (hashMap) {
            r0 = (AnonymousClass2Q4) hashMap.get(groupJid);
        }
        return r0;
    }

    public AnonymousClass2Q4 A03(GroupJid groupJid) {
        boolean containsKey;
        AnonymousClass2Q4 A012;
        AnonymousClass2Q4 r0;
        AnonymousClass00H r5 = this.A00;
        HashMap hashMap = ((C57192ig) r5.get()).A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        if (containsKey) {
            HashMap hashMap2 = ((C57192ig) r5.get()).A01;
            synchronized (hashMap2) {
                r0 = (AnonymousClass2Q4) hashMap2.get(groupJid);
            }
            return r0;
        }
        C28781at A04 = this.A01.get();
        try {
            Cursor A0A = ((C28801av) A04).A02.A0A("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE group_jid_row_id = ? ", "joinable_call_log_store/GET_JOINABLE_CALL_LOG_BY_GROUP_JID", new String[]{String.valueOf(this.A02.A09(groupJid))});
            try {
                if (!A0A.moveToLast() || (A012 = A01(A0A)) == null) {
                    HashMap hashMap3 = ((C57192ig) r5.get()).A01;
                    synchronized (hashMap3) {
                        hashMap3.put(groupJid, (Object) null);
                    }
                    A0A.close();
                    A04.close();
                    return null;
                }
                ((C57192ig) r5.get()).A00(A012);
                A0A.close();
                A04.close();
                return A012;
            } catch (Throwable th) {
                if (A0A != null) {
                    A0A.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public ArrayList A05() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A04 = this.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log", "joinable_call_log_store/GET_ALL_JOINABLE_CALL_LOG", (String[]) null);
            while (A0A.moveToNext()) {
                arrayList.add(C40811vJ.A09(A0A.getString(A0A.getColumnIndexOrThrow("call_id"))));
            }
            A0A.close();
            A04.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A06(AnonymousClass2Q4 r8) {
        int i;
        C28791au A05 = this.A01.A05();
        try {
            C41851xA BD0 = A05.BD0();
            try {
                synchronized (r8) {
                    r8.A04();
                    i = r8.A01;
                }
                ((C28801av) A05).A02.A06("joinable_call_log", "joinable_call_log_store/insert", A00(this, r8));
                ((C57192ig) this.A00.get()).A00(r8);
                synchronized (r8) {
                    int i2 = r8.A01;
                    if (i == i2) {
                        r8.A02 = false;
                        r8.A01 = i2 + 1;
                    }
                }
                BD0.A00();
                StringBuilder sb = new StringBuilder();
                sb.append("JoinableCallLogStore/insertOnCurrentThread/inserted; joinableCallLog.callId=");
                sb.append(r8.A00);
                Log.i(sb.toString());
                BD0.close();
                A05.close();
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A05.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public boolean A07(GroupJid groupJid) {
        boolean containsKey;
        HashMap hashMap = ((C57192ig) this.A00.get()).A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        return containsKey;
    }

    public AnonymousClass1TA(AnonymousClass1DL r1, AnonymousClass1Cd r2, AnonymousClass00H r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
