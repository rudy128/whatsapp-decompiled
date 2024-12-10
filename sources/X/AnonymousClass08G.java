package X;

/* renamed from: X.08G  reason: invalid class name */
public final class AnonymousClass08G extends AnonymousClass08M {
    public boolean A00;
    public final AnonymousClass08M A01;

    public void A0D() {
        if (!this.A03) {
            super.A0D();
            if (!this.A00) {
                this.A00 = true;
                this.A01.A0G();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r8.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r8.A00 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r8.A00 = true;
        r2.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        return X.AnonymousClass08O.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C01980Ce A0N() {
        /*
            r8 = this;
            X.08M r2 = r8.A01
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x009e
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x009e
            X.0aB r7 = r8.A0L()
            int r4 = r8.A04()
            r6 = 0
            if (r7 == 0) goto L_0x0021
            X.0Ye r0 = r2.A05()
            java.util.HashMap r5 = X.C05200Qx.A0J(r2, r8, r0)
        L_0x001d:
            java.lang.Object r3 = X.C05200Qx.A08
            monitor-enter(r3)
            goto L_0x0023
        L_0x0021:
            r5 = r6
            goto L_0x001d
        L_0x0023:
            X.C05200Qx.A0U(r8)     // Catch:{ all -> 0x009b }
            if (r7 == 0) goto L_0x0055
            int r0 = r7.size()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0055
            int r1 = r2.A04()     // Catch:{ all -> 0x009b }
            X.0Ye r0 = r2.A05()     // Catch:{ all -> 0x009b }
            X.0Ce r1 = r8.A0O(r0, r5, r1)     // Catch:{ all -> 0x009b }
            X.08O r0 = X.AnonymousClass08O.A00     // Catch:{ all -> 0x009b }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x0044
            monitor-exit(r3)
            return r1
        L_0x0044:
            X.0aB r0 = r2.A0L()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x004e
            r0.A02(r7)     // Catch:{ all -> 0x009b }
            goto L_0x0058
        L_0x004e:
            r2.A0T(r7)     // Catch:{ all -> 0x009b }
            r8.A0T(r6)     // Catch:{ all -> 0x009b }
            goto L_0x0058
        L_0x0055:
            r8.A03()     // Catch:{ all -> 0x009b }
        L_0x0058:
            int r0 = r2.A04()     // Catch:{ all -> 0x009b }
            if (r0 >= r4) goto L_0x0061
            r2.A0Q()     // Catch:{ all -> 0x009b }
        L_0x0061:
            X.0Ye r0 = r2.A05()     // Catch:{ all -> 0x009b }
            X.0Ye r1 = r0.A08(r4)     // Catch:{ all -> 0x009b }
            X.0Ye r0 = r8.A0P()     // Catch:{ all -> 0x009b }
            X.0Ye r0 = r1.A0A(r0)     // Catch:{ all -> 0x009b }
            r2.A07(r0)     // Catch:{ all -> 0x009b }
            r2.A0R(r4)     // Catch:{ all -> 0x009b }
            int r1 = r8.A01     // Catch:{ all -> 0x009b }
            r0 = -1
            r8.A01 = r0     // Catch:{ all -> 0x009b }
            r2.A0S(r1)     // Catch:{ all -> 0x009b }
            X.0Ye r0 = r8.A0P()     // Catch:{ all -> 0x009b }
            r2.A0U(r0)     // Catch:{ all -> 0x009b }
            int[] r0 = r8.A01     // Catch:{ all -> 0x009b }
            r2.A0V(r0)     // Catch:{ all -> 0x009b }
            monitor-exit(r3)
            r1 = 1
            r8.A00 = r1
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0098
            r8.A00 = r1
            r2.A0G()
        L_0x0098:
            X.08O r0 = X.AnonymousClass08O.A00
            return r0
        L_0x009b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x009e:
            X.08N r0 = new X.08N
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08G.A0N():X.0Ce");
    }

    public AnonymousClass08G(AnonymousClass08M r1, C06400Ye r2, C22821Di r3, C22821Di r4, int i) {
        super(r2, r3, r4, i);
        this.A01 = r1;
        r1.A0F();
    }
}
