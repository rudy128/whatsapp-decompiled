package X;

/* renamed from: X.1N4  reason: invalid class name */
public final class AnonymousClass1N4 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public AnonymousClass1N4(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.AnonymousClass1BI r10) {
        /*
            r9 = this;
            r7 = 0
            X.C18070vi.A0d(r10, r7)
            X.00H r0 = r9.A00
            java.lang.Object r2 = r0.get()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 12879(0x324f, float:1.8047E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001b
            X.00H r0 = r9.A01
            r0.get()
        L_0x001b:
            r8 = 0
            X.00H r0 = r9.A02
            java.lang.Object r0 = r0.get()
            X.1DL r0 = (X.AnonymousClass1DL) r0
            long r4 = r0.A09(r10)
            X.00H r0 = r9.A03
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0070 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "SELECT EXISTS ( SELECT 1 FROM premium_message_info WHERE chat_row_id = ?) AS smb_mm_exists"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0070 }
            r1[r7] = r0     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "PremiumMessageInfoStore/smb_mm_exists_for_chat_id"
            android.database.Cursor r5 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0070 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "smb_mm_exists"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0069 }
            long r3 = r5.getLong(r0)     // Catch:{ all -> 0x0069 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0062
            r8 = 1
        L_0x0062:
            r5.close()     // Catch:{ all -> 0x0070 }
            r6.close()
            return r8
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N4.A00(X.1BI):boolean");
    }
}
