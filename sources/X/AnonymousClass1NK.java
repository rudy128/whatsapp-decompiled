package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.1NK  reason: invalid class name */
public class AnonymousClass1NK {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass1LY A04;
    public final C22611Cn A05;
    public final AnonymousClass1NJ A06;

    @Deprecated
    public int A00(long j, long j2) {
        Cursor A0A;
        String str;
        int i = 0;
        String[] strArr = {Long.toString(j), Long.toString(j2)};
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE (message_type != '8') AND _id > ? AND _id <= ?", "GET_MESSAGE_COUNT_RANGE_SQL", strArr);
            if (A0A.moveToNext()) {
                i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getmessagesatid pos:");
                sb.append(i);
                str = sb.toString();
            } else {
                str = "msgstore/getmessagesatid/db no messages";
            }
            Log.i(str);
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

    public long A03(long j) {
        Cursor A0A;
        long j2;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez(false);
        r5.A05("rowidstore/getRowIdByTimestampExcludeSystemMessages");
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT _id FROM available_message_view WHERE (message_type != '7') AND timestamp > 0 AND timestamp <= ? ORDER BY sort_id DESC LIMIT 1", "GET_ROW_ID_BY_TIMESTAMP_EXCLUDE_SYSTEM_MESSAGES", new String[]{Long.toString(j)});
            if (A0A.moveToNext()) {
                j2 = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            } else {
                j2 = 0;
            }
            A0A.close();
            A042.close();
            StringBuilder sb = new StringBuilder();
            sb.append("rowidstore/getRowIdByTimestampExcludeSystemMessages ");
            sb.append(j2);
            sb.append(" | time spent:");
            sb.append(r5.A02());
            Log.i(sb.toString());
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

    public long A04(AnonymousClass1BI r6) {
        Cursor A0A;
        long j;
        String[] strArr = {String.valueOf(this.A00.A09(r6)), String.valueOf(AnonymousClass11P.A01(this.A02))};
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("   SELECT _id FROM available_message_view WHERE chat_row_id = ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT 1", "LAST_CHAT_MESSAGE_ID_SQL_SKIP_EXPIRED_DM", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/lastmsgid/count ");
            sb.append(A0A.getCount());
            Log.i(sb.toString());
            if (A0A.moveToNext()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            } else {
                j = 1;
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

    public long A05(AnonymousClass1BI r6, int i) {
        Cursor A0A;
        long j;
        String[] strArr = {String.valueOf(this.A00.A09(r6)), String.valueOf(i + 1)};
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A(" SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type != 7 ORDER BY sort_id DESC LIMIT ?", "CHAT_LAST_OFFSET_MESSAGE_ID_SQL", strArr);
            if (A0A.moveToLast()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            } else {
                j = 1;
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

    public long A07(AnonymousClass1BI r9, int[] iArr, long j) {
        Cursor A0A;
        long j2;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez(false);
        r5.A05("rowidstore/getRowIdByTimestampExcludeTypes");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT _id FROM available_message_view WHERE chat_row_id = ? AND ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C26121Qx.A00(iArr));
        sb2.append(" AND ");
        sb.append(sb2.toString());
        sb.append("timestamp > 0");
        sb.append(" AND ");
        sb.append("timestamp <= ?");
        sb.append(" ORDER BY sort_id DESC LIMIT 1");
        String obj = sb.toString();
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A(obj, "GET_ROW_ID_BY_TIMESTAMP_EXCLUDE_TYPES", new String[]{String.valueOf(this.A00.A09(r9)), Long.toString(j)});
            if (A0A.moveToNext()) {
                j2 = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            } else {
                j2 = 0;
            }
            A0A.close();
            A042.close();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rowidstore/getRowIdByTimestampExcludeTypes ");
            sb3.append(j2);
            sb3.append(" | time spent:");
            sb3.append(r5.A02());
            Log.i(sb3.toString());
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

    public boolean A08(AnonymousClass1BI r7) {
        Cursor A0A;
        boolean z = true;
        String[] strArr = {String.valueOf(this.A00.A09(r7))};
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT  1 FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7','87') AND from_me = 1 LIMIT 1", "OUTGOING_MESSAGE_EXISTS_RAW_SQL", strArr);
            if (A0A.getCount() <= 0) {
                z = false;
            }
            A0A.close();
            A042.close();
            return z;
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

    public long A01() {
        Cursor A0A;
        long j;
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A(" SELECT _id FROM available_message_view ORDER BY sort_id DESC LIMIT 1", "LAST_MESSAGE_ID_SQL", (String[]) null);
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/lastmsgid/count ");
            sb.append(A0A.getCount());
            Log.i(sb.toString());
            if (A0A.moveToNext()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            } else {
                j = 1;
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

    public long A02(long j) {
        Cursor A0A;
        long j2;
        C28781at A042 = this.A01.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT _id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1", "GET_ROW_ID_BY_TIMESTAMP", new String[]{Long.toString(j)});
            if (A0A.moveToNext()) {
                j2 = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
            } else {
                j2 = 0;
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

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (X.C22971Dz.A0e(r8) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(X.AnonymousClass1BI r18, int r19, long r20, long r22) {
        /*
            r17 = this;
            r4 = r20
            r3 = r17
            X.1CJ r0 = r3.A03
            r8 = r18
            X.1ci r0 = r0.A0A(r8)
            r15 = 1
            if (r0 != 0) goto L_0x0011
            return r15
        L_0x0011:
            long r13 = android.os.SystemClock.uptimeMillis()
            boolean r0 = X.C22971Dz.A0N(r8)
            r12 = 1
            r10 = 0
            if (r0 != 0) goto L_0x0024
            boolean r0 = X.C22971Dz.A0e(r8)
            r6 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/startref "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            X.1Ez r7 = new X.1Ez
            r7.<init>((java.lang.String) r0)
            java.lang.String r0 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.util.ArrayList r0 = X.C26121Qx.A01(r6, r10)
            X.C26121Qx.A02(r2, r0)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r2.append(r0)
            java.lang.String r1 = " "
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            r2.append(r1)
            java.lang.String r0 = " AND sort_id < ?"
            r2.append(r0)
        L_0x005c:
            r2.append(r1)
            java.lang.String r0 = " ORDER BY sort_id DESC"
            r2.append(r0)
            java.lang.String r0 = " LIMIT ?"
            r2.append(r0)
            java.lang.String r9 = r2.toString()
            r11 = 2
            r6 = 3
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            X.1LW r0 = r3.A00
            long r0 = r0.A09(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r10] = r0
            java.lang.String r0 = java.lang.String.valueOf(r22)
            r2[r12] = r0
            X.1NJ r0 = r3.A06
            long r0 = r0.A04(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r11] = r0
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2[r6] = r0
            goto L_0x00b5
        L_0x009b:
            java.lang.String[] r2 = new java.lang.String[r6]
            X.1LW r0 = r3.A00
            long r0 = r0.A09(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r10] = r0
            java.lang.String r0 = java.lang.String.valueOf(r22)
            r2[r12] = r0
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2[r11] = r0
        L_0x00b5:
            X.1Cd r0 = r3.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
            X.1at r6 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0102 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "ROW_ID_STORE_GET_START_REF"
            android.database.Cursor r2 = r1.A0A(r9, r0, r2)     // Catch:{ all -> 0x0102 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            long r4 = r2.getLong(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00d6:
            r7.A02()     // Catch:{ all -> 0x00f6 }
            goto L_0x00ef
        L_0x00da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r1.<init>()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "msgstore/startref can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            r1.append(r8)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f6 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x00d6
        L_0x00ef:
            r2.close()     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
            goto L_0x0115
        L_0x00f6:
            r1 = move-exception
            if (r2 == 0) goto L_0x0101
            r2.close()     // Catch:{ all -> 0x00fd }
            goto L_0x0101
        L_0x00fd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0102 }
        L_0x0101:
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
        L_0x010b:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
        L_0x010c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r3.A05
            r0.A03()
        L_0x0115:
            X.1LY r3 = r3.A04
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r13
            java.lang.String r0 = "RowIdStore/getStartRef"
            r3.A01(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NK.A06(X.1BI, int, long, long):long");
    }

    public boolean A09(AnonymousClass1BI r7) {
        C29691ci r0;
        AnonymousClass1CJ r1 = this.A03;
        if ((r1.A0T(r7) || (r0 = (C29691ci) AnonymousClass1CJ.A01(r1).get(r7)) == null || r0.A0P == 1) && A04(r7) == 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass1NK(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1CJ r3, AnonymousClass1LY r4, C22611Cn r5, AnonymousClass1Cd r6, AnonymousClass1NJ r7) {
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A06 = r7;
        this.A04 = r4;
        this.A01 = r6;
        this.A05 = r5;
    }
}
