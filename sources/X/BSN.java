package X;

public final class BSN extends C25268CcD {
    public final /* synthetic */ BRM A00;

    public BSN(BRM brm) {
        this.A00 = brm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r3 = r4.A06.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r3.hasNext() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r0 = (android.util.Pair) r3.next();
        X.C27076DTa.A01(r4, r0.first, (java.util.concurrent.Executor) r0.second, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(float r6) {
        /*
            r5 = this;
            X.BRM r4 = r5.A00
            monitor-enter(r4)
            boolean r0 = r4.A05     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            java.lang.Integer r1 = r4.A01     // Catch:{ all -> 0x0035 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0035 }
            if (r1 != r0) goto L_0x0033
            float r0 = r4.A00     // Catch:{ all -> 0x0035 }
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            r4.A00 = r6     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r4.A06
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0 = 4
            X.C27076DTa.A01(r4, r2, r1, r0)
            goto L_0x001c
        L_0x0033:
            monitor-exit(r4)
        L_0x0034:
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSN.A09(float):void");
    }
}
