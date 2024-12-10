package X;

/* renamed from: X.1MB  reason: invalid class name */
public final class AnonymousClass1MB {
    public String[] A00;
    public String[] A01;
    public String[] A02;
    public final C18030ve A03;
    public final AnonymousClass1M9 A04;
    public final C18000vb A05;

    public AnonymousClass1MB(AnonymousClass1M9 r2, C18000vb r3, C18030ve r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r2, 3);
        this.A03 = r4;
        this.A05 = r3;
        this.A04 = r2;
    }

    public final boolean A01(AnonymousClass1BI r4) {
        C18070vi.A0d(r4, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A03, 3003) || !A00() || !A03(r4)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r5 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r6 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A02(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = X.C22971Dz.A0d(r8)     // Catch:{ all -> 0x0066 }
            r6 = 0
            if (r0 == 0) goto L_0x004e
            boolean r0 = r7.A03(r8)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r8, r0)     // Catch:{ all -> 0x0066 }
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x0066 }
            java.lang.String[] r5 = r7.A02     // Catch:{ all -> 0x0066 }
            if (r5 != 0) goto L_0x0047
            X.0ve r2 = r7.A03     // Catch:{ all -> 0x0066 }
            r1 = 11708(0x2dbc, float:1.6406E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ all -> 0x0066 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0066 }
            int r0 = r2.length()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0031
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x0066 }
        L_0x002e:
            r7.A02 = r5     // Catch:{ all -> 0x0066 }
            goto L_0x0045
        L_0x0031:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = ","
            r1[r6] = r0     // Catch:{ all -> 0x0066 }
            java.util.List r1 = X.AnonymousClass1YF.A0S(r2, r1, r6)     // Catch:{ all -> 0x0066 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0066 }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x0066 }
            goto L_0x002e
        L_0x0045:
            if (r5 == 0) goto L_0x0064
        L_0x0047:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x0066 }
            int r3 = r5.length     // Catch:{ all -> 0x0066 }
            r2 = 0
            goto L_0x0052
        L_0x004c:
            if (r0 == 0) goto L_0x0050
        L_0x004e:
            monitor-exit(r7)
            return r6
        L_0x0050:
            int r2 = r2 + 1
        L_0x0052:
            if (r2 >= r3) goto L_0x0064
            r1 = r5[r2]     // Catch:{ all -> 0x0066 }
            int r0 = r1.length()     // Catch:{ all -> 0x0066 }
            if (r0 <= 0) goto L_0x0050
            X.C18070vi.A0d(r4, r6)     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x0066 }
            goto L_0x004c
        L_0x0064:
            r6 = 1
            goto L_0x004e
        L_0x0066:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MB.A02(com.whatsapp.jid.Jid):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r5 != null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A03(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r8 instanceof X.AnonymousClass1BI     // Catch:{ all -> 0x00bd }
            r6 = 0
            if (r0 == 0) goto L_0x005a
            boolean r0 = X.C22971Dz.A0e(r8)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0018
            X.1M9 r0 = r7.A04     // Catch:{ all -> 0x00bd }
            X.1BI r8 = (X.AnonymousClass1BI) r8     // Catch:{ all -> 0x00bd }
            X.1E7 r0 = r0.A0H(r8)     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.A0j     // Catch:{ all -> 0x00bd }
            monitor-exit(r7)
            return r0
        L_0x0018:
            boolean r0 = X.C22971Dz.A0d(r8)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x005a
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x00bd }
            java.lang.String[] r5 = r7.A01     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x0052
            X.0ve r2 = r7.A03     // Catch:{ all -> 0x00bd }
            r1 = 1031(0x407, float:1.445E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ all -> 0x00bd }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x00bd }
            int r0 = r2.length()     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x003c
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x00bd }
        L_0x0039:
            r7.A01 = r5     // Catch:{ all -> 0x00bd }
            goto L_0x0050
        L_0x003c:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = ","
            r1[r6] = r0     // Catch:{ all -> 0x00bd }
            java.util.List r1 = X.AnonymousClass1YF.A0S(r2, r1, r6)     // Catch:{ all -> 0x00bd }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x00bd }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x00bd }
            goto L_0x0039
        L_0x0050:
            if (r5 == 0) goto L_0x0070
        L_0x0052:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x00bd }
            int r3 = r5.length     // Catch:{ all -> 0x00bd }
            r2 = 0
            goto L_0x005e
        L_0x0057:
            if (r0 == 0) goto L_0x005c
        L_0x0059:
            r6 = 1
        L_0x005a:
            monitor-exit(r7)
            return r6
        L_0x005c:
            int r2 = r2 + 1
        L_0x005e:
            if (r2 >= r3) goto L_0x0070
            r1 = r5[r2]     // Catch:{ all -> 0x00bd }
            int r0 = r1.length()     // Catch:{ all -> 0x00bd }
            if (r0 <= 0) goto L_0x005c
            X.C18070vi.A0d(r4, r6)     // Catch:{ all -> 0x00bd }
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x0057
        L_0x0070:
            java.lang.String[] r5 = r7.A00     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x00a2
            X.0ve r2 = r7.A03     // Catch:{ all -> 0x00bd }
            r1 = 4799(0x12bf, float:6.725E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ all -> 0x00bd }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x00bd }
            int r0 = r2.length()     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x008c
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x00bd }
        L_0x0089:
            r7.A00 = r5     // Catch:{ all -> 0x00bd }
            goto L_0x00a0
        L_0x008c:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = ","
            r1[r6] = r0     // Catch:{ all -> 0x00bd }
            java.util.List r1 = X.AnonymousClass1YF.A0S(r2, r1, r6)     // Catch:{ all -> 0x00bd }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x00bd }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x00bd }
            goto L_0x0089
        L_0x00a0:
            if (r5 == 0) goto L_0x005a
        L_0x00a2:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x00bd }
            int r3 = r5.length     // Catch:{ all -> 0x00bd }
            r2 = 0
        L_0x00a6:
            if (r2 >= r3) goto L_0x005a
            r1 = r5[r2]     // Catch:{ all -> 0x00bd }
            int r0 = r1.length()     // Catch:{ all -> 0x00bd }
            if (r0 <= 0) goto L_0x00ba
            X.C18070vi.A0d(r4, r6)     // Catch:{ all -> 0x00bd }
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00ba
            goto L_0x0059
        L_0x00ba:
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MB.A03(com.whatsapp.jid.Jid):boolean");
    }

    public final boolean A00() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 233)) {
            String A012 = C18020vd.A01(r1, r2, 379);
            C18070vi.A0X(A012);
            if (A012.length() != 0) {
                String A052 = this.A05.A05();
                for (Object A18 : AnonymousClass1YF.A0S(A012, new String[]{","}, 0)) {
                    if (C18070vi.A18(A18, A052)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
