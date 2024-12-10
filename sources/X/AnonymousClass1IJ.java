package X;

/* renamed from: X.1IJ  reason: invalid class name */
public abstract class AnonymousClass1IJ extends C18600wl {
    public long A00;
    public AnonymousClass1JD A01;
    public boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        if (((int) ((1073741823 & r1) >> 0)) == ((int) ((r1 & 1152921503533105152L) >> 30))) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0082 A[EDGE_INSN: B:74:0x0082->B:39:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0E() {
        /*
            r14 = this;
            r9 = r14
            X.1IL r9 = (X.AnonymousClass1IL) r9
            boolean r0 = r9.A0I()
            r12 = 0
            if (r0 != 0) goto L_0x0065
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = X.AnonymousClass1IL.A01
            java.lang.Object r7 = r8.get(r9)
            X.2tG r7 = (X.C63532tG) r7
            if (r7 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C63532tG.A01
            int r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0046
            long r10 = java.lang.System.nanoTime()
        L_0x0021:
            monitor-enter(r7)
            X.3KX[] r1 = r7.A00     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r6 = r1[r0]     // Catch:{ all -> 0x00db }
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            r5 = 0
            if (r6 == 0) goto L_0x0043
            X.3Cy r6 = (X.C70903Cy) r6     // Catch:{ all -> 0x00db }
            long r3 = r6.A01     // Catch:{ all -> 0x00db }
            long r1 = r10 - r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            boolean r0 = X.AnonymousClass1IL.A00(r6, r9)     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x0043
            r0 = 0
            X.3KX r5 = r7.A02(r0)     // Catch:{ all -> 0x00db }
        L_0x0043:
            monitor-exit(r7)
            if (r5 != 0) goto L_0x0021
        L_0x0046:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.AnonymousClass1IL.A02
        L_0x0048:
            java.lang.Object r4 = r3.get(r9)
            r1 = 0
            if (r4 == 0) goto L_0x0082
            boolean r0 = r4 instanceof X.AnonymousClass1IB
            if (r0 == 0) goto L_0x0074
            r2 = r4
            X.1IB r2 = (X.AnonymousClass1IB) r2
            java.lang.Object r1 = r2.A03()
            X.1I8 r0 = X.AnonymousClass1IB.A04
            if (r1 == r0) goto L_0x0068
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L_0x0060:
            if (r1 == 0) goto L_0x0082
            r1.run()
        L_0x0065:
            r2 = 0
        L_0x0067:
            return r2
        L_0x0068:
            long r0 = X.AnonymousClass1IB.A00(r2)
            X.1IB r0 = X.AnonymousClass1IB.A01(r2, r0)
            X.C30561e9.A00(r9, r4, r0, r3)
            goto L_0x0048
        L_0x0074:
            X.1I8 r0 = X.AnonymousClass2WX.A00
            if (r4 == r0) goto L_0x0082
            boolean r0 = X.C30561e9.A00(r9, r4, r1, r3)
            if (r0 == 0) goto L_0x0048
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r1 = r4
            goto L_0x0060
        L_0x0082:
            X.1JD r0 = r9.A01
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0065
        L_0x008c:
            java.lang.Object r1 = r3.get(r9)
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1 instanceof X.AnonymousClass1IB
            if (r0 == 0) goto L_0x00d1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.AnonymousClass1IB.A05
            long r1 = r0.get(r1)
            r3 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r3 = r3 & r1
            r0 = 0
            long r3 = r3 >> r0
            int r5 = (int) r3
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r0 = 30
            long r1 = r1 >> r0
            int r0 = (int) r1
            if (r5 != r0) goto L_0x0065
        L_0x00af:
            java.lang.Object r2 = r8.get(r9)
            X.2tG r2 = (X.C63532tG) r2
            if (r2 == 0) goto L_0x00d5
            monitor-enter(r2)
            X.3KX[] r1 = r2.A00     // Catch:{ all -> 0x00de }
            r0 = 0
            if (r1 == 0) goto L_0x00c0
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00de }
        L_0x00c0:
            monitor-exit(r2)
            X.3Cy r0 = (X.C70903Cy) r0
            if (r0 == 0) goto L_0x00d5
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            goto L_0x0065
        L_0x00d1:
            X.1I8 r0 = X.AnonymousClass2WX.A00
            if (r1 != r0) goto L_0x0065
        L_0x00d5:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r2
        L_0x00db:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00de:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IJ.A0E():long");
    }

    public abstract void A0F();

    public final void A0G(C30601eD r2) {
        AnonymousClass1JD r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass1JD();
            this.A01 = r0;
        }
        r0.addLast(r2);
    }

    public final void A0H(boolean z) {
        long j;
        long j2 = this.A00;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.A00 = j3;
        if (j3 <= 0 && this.A02) {
            A0F();
        }
    }

    public final boolean A0I() {
        C30601eD r0;
        AnonymousClass1JD r02 = this.A01;
        if (r02 == null || (r0 = (C30601eD) r02.A0W()) == null) {
            return false;
        }
        r0.run();
        return true;
    }
}
