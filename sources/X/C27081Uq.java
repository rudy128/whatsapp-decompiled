package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1Uq  reason: invalid class name and case insensitive filesystem */
public class C27081Uq {
    public final AnonymousClass11S A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11P A05;

    public C59822mw A02(AnonymousClass1BI r6, String str) {
        Cursor A0A;
        String[] strArr = {str, String.valueOf(this.A01.A09(r6))};
        C28781at A042 = this.A03.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_id = ?  AND key_chat_row_id = ? ", "ScheduledCallsStore/GET_SCHEDULED_CALL_BY_KEY_ID_AND_CHAT", strArr);
            if (!A0A.moveToLast()) {
                A0A.close();
                A042.close();
                return null;
            }
            C59822mw A002 = A00(A0A, this);
            A0A.close();
            A042.close();
            return A002;
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

    public static C59822mw A00(Cursor cursor, C27081Uq r26) {
        long j;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("creation_message_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("key_from_me");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("key_chat_row_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("call_type");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("scheduled_timestamp");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("call_title");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("creator_jid_row_id");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("is_upcoming");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("call_log_row_id");
        long j2 = cursor2.getLong(columnIndexOrThrow);
        String string = cursor2.getString(columnIndexOrThrow2);
        boolean z = false;
        if (cursor2.getLong(columnIndexOrThrow3) == 1) {
            z = true;
        }
        C27081Uq r5 = r26;
        AnonymousClass1BI A0B = r5.A01.A0B(cursor2.getLong(columnIndexOrThrow4));
        int i = cursor2.getInt(columnIndexOrThrow5);
        long j3 = cursor2.getLong(columnIndexOrThrow6);
        String string2 = cursor2.getString(columnIndexOrThrow7);
        UserJid userJid = (UserJid) r5.A02.A0B(cursor2.getLong(columnIndexOrThrow8));
        boolean z2 = false;
        if (cursor2.getInt(columnIndexOrThrow9) == 1) {
            z2 = true;
        }
        if (cursor2.isNull(columnIndexOrThrow10)) {
            j = -1;
        } else {
            j = cursor2.getLong(columnIndexOrThrow10);
        }
        if (A0B == null || userJid == null) {
            return null;
        }
        return new C59822mw(A0B, userJid, string, string2, i, j2, j3, j, z2, z);
    }

    public C59822mw A01(long j) {
        Cursor A0A;
        C28781at A042 = this.A03.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE creation_message_row_id = ? ", "ScheduledCallsStore/GET_SCHEDULED_CALL_BY_ROW_ID", new String[]{Long.toString(j)});
            if (!A0A.moveToFirst()) {
                A0A.close();
                A042.close();
                return null;
            }
            C59822mw A002 = A00(A0A, this);
            A0A.close();
            A042.close();
            return A002;
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

    public String A03(C178119Bw r4) {
        C59822mw A022;
        if (r4.A0F == null || r4.A0C == null || (A022 = A02(r4.A0C, r4.A0F.A00)) == null) {
            return null;
        }
        return A022.A00();
    }

    public ArrayList A04() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A042 = this.A03.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ?  ORDER BY scheduled_timestamp ASC ", "SELECT_ALL_UPCOMING_CALLS", new String[]{Long.toString(System.currentTimeMillis() - 900000)});
            while (A0A.moveToNext()) {
                C59822mw A002 = A00(A0A, this);
                if (A002 != null) {
                    arrayList.add(A002);
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

    public C27081Uq(AnonymousClass11S r1, AnonymousClass11P r2, AnonymousClass1LW r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, AnonymousClass00H r6) {
        this.A05 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = r6;
        this.A03 = r5;
    }
}
