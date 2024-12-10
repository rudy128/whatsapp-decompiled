package X;

import java.util.Set;

/* renamed from: X.32n  reason: invalid class name and case insensitive filesystem */
public final class C682232n implements C25341Nv {
    public final C52022aF A00;

    public C682232n(C52022aF r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2.A0z(65536);
    }

    public Set BZv() {
        return C18070vi.A0P(C97504pa.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r10) {
        /*
            r9 = this;
            X.206 r7 = X.C18070vi.A08(r10)
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = r7.A0z(r0)
            if (r0 == 0) goto L_0x0078
            X.2aF r0 = r9.A00
            r5 = 0
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.1Cd r0 = r0.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0071 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "SELECT start_index, end_index\n              FROM message_span_indices\n              WHERE message_row_id = ? AND span_type = ?\n              ORDER BY start_index ASC"
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0071 }
            long r0 = r7.A0x     // Catch:{ all -> 0x0071 }
            X.C17880vN.A1V(r2, r5, r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "1"
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "LinkIndicesStore/GET_SPAN_INDICES_BY_MESSAGE_ROW_ID"
            android.database.Cursor r5 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "start_index"
            int r4 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "end_index"
            int r3 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x006a }
            r2 = -1
        L_0x0042:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x005e
            int r0 = r5.getInt(r4)     // Catch:{ all -> 0x006a }
            if (r0 < r2) goto L_0x0042
            int r2 = r5.getInt(r3)     // Catch:{ all -> 0x006a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006a }
            X.AnonymousClass1D6.A02(r1, r0, r8)     // Catch:{ all -> 0x006a }
            goto L_0x0042
        L_0x005e:
            r5.close()     // Catch:{ all -> 0x0071 }
            r6.close()
            X.4pa r1 = new X.4pa
            r1.<init>(r8)
            goto L_0x0079
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x0078:
            r1 = 0
        L_0x0079:
            java.lang.Class<X.4pa> r0 = X.C97504pa.class
            X.25F r0 = X.C18070vi.A09(r7, r0)
            r0.A02(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682232n.Bhl(X.25F):void");
    }
}
