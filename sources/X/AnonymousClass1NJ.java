package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1NJ  reason: invalid class name */
public class AnonymousClass1NJ {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1LY A04;

    public long A04(long j) {
        Cursor A0A;
        long j2;
        String[] strArr = {String.valueOf(j)};
        C28781at A042 = this.A02.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT sort_id FROM message WHERE _id = ?", "GET_SORT_ID_OF_MESSAGE_SQL", strArr);
            if (A0A.moveToNext()) {
                j2 = A0A.getLong(A0A.getColumnIndexOrThrow("sort_id"));
            } else {
                j2 = Long.MIN_VALUE;
            }
            A0A.close();
            A042.close();
            return j2;
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

    public long A05(AnonymousClass1BI r6) {
        Cursor A0A;
        String[] strArr = {String.valueOf(this.A00.A09(r6))};
        C28781at A042 = this.A02.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1", "GET_FIRST_SORT_REF_SQL", strArr);
            if (A0A.moveToFirst()) {
                long j = A0A.getLong(A0A.getColumnIndexOrThrow("sort_id"));
                A0A.close();
                A042.close();
                return j;
            }
            A0A.close();
            A042.close();
            StringBuilder sb = new StringBuilder();
            sb.append("SortIdStore/ getFirstSortId can't get value for ");
            sb.append(r6);
            Log.w(sb.toString());
            return Long.MIN_VALUE;
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

    public long A06(AnonymousClass1BI r6) {
        Cursor A0A;
        long j;
        String[] strArr = {String.valueOf(this.A00.A09(r6)), String.valueOf(AnonymousClass11P.A01(this.A03))};
        C28781at A042 = this.A02.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT 1", "LAST_CHAT_MESSAGE_SORT_ID_SQL_SKIP_EXPIRED_DM", strArr);
            if (A0A.moveToNext()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("sort_id"));
            } else {
                j = Long.MIN_VALUE;
            }
            A0A.close();
            A042.close();
            return j;
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

    public int A00(C199410f r6, AnonymousClass1BI r7, long j, long j2) {
        Cursor A0A;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(this.A00.A09(r7)));
        arrayList.add(Long.toString(j));
        arrayList.add(Long.toString(j2));
        AnonymousClass1IZ it = r6.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        C28781at A042 = this.A02.get();
        try {
            C23141Ev r2 = ((C28801av) A042).A02;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND sort_id <= ?");
            sb.append(AnonymousClass203.A00(r6.size()));
            A0A = r2.A0A(sb.toString(), "GET_CHAT_MESSAGE_COUNT_RANGE_BY_SORT_ID_SQL", strArr);
            if (A0A.moveToNext()) {
                i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
            } else {
                i = 0;
            }
            A0A.close();
            A042.close();
            return i;
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

    public int A02(AnonymousClass1BI r8, long j) {
        Cursor A0A;
        C28781at A042 = this.A02.get();
        try {
            int i = 0;
            A0A = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND (message_type != '7') AND from_me = 0", "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_REF_EXCLUDE_SYSTEM_MESSAGES_SQL", new String[]{String.valueOf(this.A00.A09(r8)), String.valueOf(j)});
            if (A0A.moveToNext()) {
                i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(r8);
                Log.i(sb.toString());
            }
            A0A.close();
            A042.close();
            return i;
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

    public int A03(AnonymousClass1BI r8, long j) {
        Cursor A0A;
        C28781at A042 = this.A02.get();
        try {
            int i = 0;
            A0A = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND (message_type = '10') AND sort_id > ?", "GET_CHAT_MISSED_CALLS_COUNT_NEWER_THAN_REF_SQL", new String[]{String.valueOf(this.A00.A09(r8)), String.valueOf(j)});
            if (A0A.moveToNext()) {
                i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(r8);
                Log.i(sb.toString());
            }
            A0A.close();
            A042.close();
            return i;
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

    public AnonymousClass1NJ(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1CJ r3, AnonymousClass1LY r4, AnonymousClass1Cd r5) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public int A01(AnonymousClass1BI r10, long j) {
        Cursor A0A;
        long uptimeMillis = SystemClock.uptimeMillis();
        C28781at A042 = this.A02.get();
        try {
            int i = 0;
            A0A = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ?", "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_SORT_REF_SQL", new String[]{String.valueOf(this.A00.A09(r10)), String.valueOf(j)});
            if (A0A.moveToNext()) {
                i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(r10);
                Log.i(sb.toString());
            }
            A0A.close();
            A042.close();
            this.A04.A01("SortIdStore/getMessagesNewerThanCount", SystemClock.uptimeMillis() - uptimeMillis);
            return i;
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 >= r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.AnonymousClass1BI r6, long r7) {
        /*
            r5 = this;
            X.C17960vV.A07(r6)
            long r3 = r5.A05(r6)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r0 = X.C22971Dz.A0V(r6)
            if (r0 == 0) goto L_0x0031
            if (r1 != 0) goto L_0x002d
            X.1CJ r0 = r5.A01
            X.1ci r1 = r0.A0A(r6)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x002f
            X.2Dk r1 = (X.C46162Dk) r1
            boolean r0 = r1.A0C
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002f
        L_0x002d:
            r0 = 1
            return r0
        L_0x002f:
            r0 = 0
            return r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NJ.A07(X.1BI, long):boolean");
    }
}
