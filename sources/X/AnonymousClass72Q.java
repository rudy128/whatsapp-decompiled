package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.List;

/* renamed from: X.72Q  reason: invalid class name */
public final class AnonymousClass72Q {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A03(java.util.List r9) {
        /*
            r8 = this;
            r7 = 0
            java.util.HashMap r5 = X.C17880vN.A11()
            X.1Cd r0 = r8.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0070 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0070 }
            int r1 = r9.size()     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "SELECT * FROM status_crossposting WHERE status_message_row_id IN ("
            r2.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x0070 }
            r2.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = ")"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x0070 }
            java.util.ArrayList r2 = X.C29351c6.A0D(r9)     // Catch:{ all -> 0x0070 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x0070 }
        L_0x003a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0044
            X.C108995ce.A1R(r2, r1)     // Catch:{ all -> 0x0070 }
            goto L_0x003a
        L_0x0044:
            java.lang.String[] r1 = X.C17890vO.A1b(r2, r7)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r3 = r6.A0A(r3, r0, r1)     // Catch:{ all -> 0x0070 }
        L_0x004e:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0062
            X.6t0 r2 = A00(r3)     // Catch:{ all -> 0x0069 }
            long r0 = r2.A01     // Catch:{ all -> 0x0069 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0069 }
            r5.put(r0, r2)     // Catch:{ all -> 0x0069 }
            goto L_0x004e
        L_0x0062:
            r3.close()     // Catch:{ all -> 0x0070 }
            r4.close()
            return r5
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72Q.A03(java.util.List):java.util.HashMap");
    }

    public final void A04(long j, String str) {
        C18070vi.A0d(str, 1);
        ContentValues A08 = C17880vN.A08();
        A08.put("media_path", str);
        A01(A08, this, C18070vi.A0M(Long.valueOf(j)));
    }

    public final void A06(List list, int i) {
        C18070vi.A0d(list, 0);
        ContentValues A08 = C17880vN.A08();
        C17880vN.A18(A08, "state", i);
        A02().A02(list, i);
        A01(A08, this, list);
    }

    public final void A07(List list, String str) {
        ContentValues A08 = C17880vN.A08();
        C17880vN.A18(A08, "state", 1);
        A08.put("crossposting_session_id", str);
        A02().A02(list, 1);
        A01(A08, this, list);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.87L] */
    public static final C135936t0 A00(Cursor cursor) {
        AnonymousClass77S r2;
        String A0S = C17890vO.A0S(cursor, "crossposting_status_unique_id");
        if (A0S == null || A0S.length() == 0) {
            r2 = null;
        } else {
            r2 = new AnonymousClass77S(new C1418477e(new Object(), String.class, A0S, "XfamilyStatusUniqueId"), 2);
        }
        long A06 = C17890vO.A06(cursor, "status_message_row_id");
        return new C135936t0(r2, C17890vO.A0S(cursor, "crossposting_session_id"), C17890vO.A0S(cursor, "media_path"), C17890vO.A01(cursor, "state"), A06);
    }

    public final C62422rN A02() {
        AnonymousClass00H r1 = this.A01;
        C62422rN.A00((C62422rN) r1.get());
        return (C62422rN) C18070vi.A0E(r1);
    }

    public AnonymousClass72Q(AnonymousClass1Cd r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.ContentValues r10, X.AnonymousClass72Q r11, java.util.List r12) {
        /*
            java.lang.String r2 = X.AnonymousClass6WF.A00(r12)
            X.1Cd r0 = r11.A00
            X.1au r3 = r0.A05()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003c }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x003c }
            java.lang.String r6 = "status_crossposting"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "status_message_row_id IN "
            java.lang.String r7 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x003c }
            java.util.ArrayList r2 = X.C29351c6.A0D(r12)     // Catch:{ all -> 0x003c }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x003c }
        L_0x0023:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x002d
            X.C108995ce.A1R(r2, r1)     // Catch:{ all -> 0x003c }
            goto L_0x0023
        L_0x002d:
            r0 = 0
            java.lang.String[] r9 = X.C17890vO.A1b(r2, r0)     // Catch:{ all -> 0x003c }
            java.lang.String r8 = "XFamilyStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r10
            r4.A02(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x003c }
            r3.close()
            return
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72Q.A01(android.content.ContentValues, X.72Q, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r7, int r8, long r9) {
        /*
            r6 = this;
            android.content.ContentValues r5 = X.C17880vN.A08()
            int r0 = (int) r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_message_row_id"
            r5.put(r0, r1)
            java.lang.String r0 = "state"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r5.put(r0, r2)
            if (r7 == 0) goto L_0x0024
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0024
            java.lang.String r0 = "crossposting_session_id"
            r5.put(r0, r7)
        L_0x0024:
            X.2rN r0 = r6.A02()
            X.C62422rN.A00(r0)
            X.00p r1 = r0.A00
            monitor-enter(r1)
            r1.A0A(r9, r2)     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)
            X.1Cd r0 = r6.A00
            X.1au r4 = r0.A05()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0049 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "status_crossposting"
            r1 = 4
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/INSERT_CROSSPOSTING_RECORDS"
            r3.A09(r2, r0, r5, r1)     // Catch:{ all -> 0x0049 }
            r4.close()
            return
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0050:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72Q.A05(java.lang.String, int, long):void");
    }
}
