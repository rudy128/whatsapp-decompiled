package X;

/* renamed from: X.6n9  reason: invalid class name */
public final class AnonymousClass6n9 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;
    public final C53912dI A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C42621yT r7, X.AnonymousClass1BI r8) {
        /*
            r6 = this;
            r5 = 0
            X.C18070vi.A0d(r8, r5)
            X.1LW r0 = r6.A00
            long r0 = r0.A09(r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.1Cd r0 = r6.A01
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0046 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "SELECT COUNT(*) AS count FROM message_link WHERE chat_row_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r1, r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "MESSAGE_LINK_TABLE_GET_COUNT"
            X.26f r2 = r3.A0C(r7, r2, r0, r1)     // Catch:{ all -> 0x0046 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "count"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x003f }
            r2.close()     // Catch:{ all -> 0x0046 }
            r4.close()
            return r0
        L_0x0038:
            r2.close()     // Catch:{ all -> 0x0046 }
            r4.close()
            return r5
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6n9.A00(X.1yT, X.1BI):int");
    }

    public AnonymousClass6n9(AnonymousClass1LW r2, AnonymousClass1Cd r3, C53912dI r4, AnonymousClass00H r5) {
        C18070vi.A0j(r2, r5);
        C18070vi.A0d(r3, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }
}
