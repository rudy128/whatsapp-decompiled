package X;

/* renamed from: X.2ie  reason: invalid class name and case insensitive filesystem */
public final class C57172ie {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C42621yT r7, X.AnonymousClass1BI r8) {
        /*
            r6 = this;
            r5 = 0
            X.C18070vi.A0d(r8, r5)
            X.1Cd r0 = r6.A01
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0041 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "SELECT COUNT(*) as count FROM available_message_view WHERE message_type IN ('9', '26' ) AND origin != 7 AND chat_row_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0041 }
            X.1LW r0 = r6.A00     // Catch:{ all -> 0x0041 }
            X.AnonymousClass1LW.A03(r0, r8, r1, r5)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "GET_DOCUMENT_MESSAGES_COUNT"
            X.26f r2 = r4.A0C(r7, r2, r0, r1)     // Catch:{ all -> 0x0041 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "count"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x003a }
            r2.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            return r0
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            return r5
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57172ie.A00(X.1yT, X.1BI):int");
    }

    public C57172ie(AnonymousClass1LW r1, AnonymousClass1Cd r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
