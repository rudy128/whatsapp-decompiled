package X;

/* renamed from: X.Ck5  reason: case insensitive filesystem */
public abstract class C25674Ck5 {
    public double A00;
    public long A01;
    public final long A02;
    public final CAE A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ((r3 - r7.A01) >= r7.A02) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(java.lang.Object r8, double r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0090
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
            boolean r0 = r7.A04     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0018
            double r1 = r7.A00     // Catch:{ all -> 0x008d }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008d }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r9 - r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            r1 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            long r0 = r7.A01     // Catch:{ all -> 0x008d }
            long r5 = r3 - r0
            long r1 = r7.A02     // Catch:{ all -> 0x008d }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0090
        L_0x003a:
            r7.A00 = r9     // Catch:{ all -> 0x008d }
            r7.A01 = r3     // Catch:{ all -> 0x008d }
            r1 = r7
            X.BVx r1 = (X.C22930BVx) r1     // Catch:{ all -> 0x008d }
            int r0 = r1.A00     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x008d }
            X.E9F r0 = (X.E9F) r0     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0090
            r0.C23(r9)     // Catch:{ all -> 0x008d }
            goto L_0x0090
        L_0x004f:
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x008d }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x008d }
            X.3C3 r0 = (X.AnonymousClass3C3) r0     // Catch:{ all -> 0x008d }
            java.lang.Object r4 = r0.A02     // Catch:{ all -> 0x008d }
            X.Cyg r4 = (X.C26380Cyg) r4     // Catch:{ all -> 0x008d }
            float r6 = (float) r9     // Catch:{ all -> 0x008d }
            if (r8 == 0) goto L_0x008a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x008d }
            long r0 = r8.longValue()     // Catch:{ all -> 0x008d }
            long r2 = r2.toMillis(r0)     // Catch:{ all -> 0x008d }
        L_0x0066:
            X.CLu r0 = r4.A0L     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0090
            android.os.Handler r0 = r4.A0C     // Catch:{ all -> 0x008d }
            X.C199610h.A04(r0)     // Catch:{ all -> 0x008d }
            r5 = 1
            r0.removeMessages(r5)     // Catch:{ all -> 0x008d }
            X.CLu r1 = r4.A0L     // Catch:{ all -> 0x008d }
            android.os.Handler r4 = r4.A0C     // Catch:{ all -> 0x008d }
            X.C199610h.A04(r4)     // Catch:{ all -> 0x008d }
            r0 = 3
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r1, r0)     // Catch:{ all -> 0x008d }
            X.BE6.A1T(r1, r6, r5)     // Catch:{ all -> 0x008d }
            r0 = 2
            X.AnonymousClass3MX.A1S(r1, r0, r2)     // Catch:{ all -> 0x008d }
            X.BE7.A18(r4, r1, r5)     // Catch:{ all -> 0x008d }
            goto L_0x0090
        L_0x008a:
            r2 = 0
            goto L_0x0066
        L_0x008d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0090:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25674Ck5.A00(java.lang.Object, double):void");
    }

    public C25674Ck5(CAE cae, long j, boolean z, boolean z2) {
        this.A00 = -1.0d;
        this.A03 = cae;
        this.A04 = z;
        this.A02 = !z2 ? Math.max(j, 300) : j;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.CAE] */
    public C25674Ck5() {
        this(new Object(), 0, true, false);
    }
}
