package X;

public class DEM implements E4h {
    public final int A00;
    public final Object A01;

    public DEM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r2 = -90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r3 != 1) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        r2 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        r14 = ((r14 + 360) + (r2 * r4)) % 360;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1f(X.C25089CXa r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0047;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A01
            X.DEs r2 = (X.C26810DEs) r2
            X.E4h r1 = r2.A04
            if (r1 != 0) goto L_0x0017
            r0 = 2
            X.DEM r1 = new X.DEM
            r1.<init>(r2, r0)
            r2.A04 = r1
        L_0x0017:
            r2.CEs(r1)
            X.CWY r3 = r2.A0K
            X.CYE r4 = r3.A00
            java.util.concurrent.locks.ReentrantLock r2 = r4.A01
            r2.lock()
            boolean r1 = r4.A00()     // Catch:{ all -> 0x0042 }
            r2.lock()     // Catch:{ all -> 0x0042 }
            boolean r0 = r4.A01()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0038
            int r0 = r4.A00     // Catch:{ all -> 0x003d }
            r0 = r0 | 2
            r0 = r0 & -2
            r4.A00 = r0     // Catch:{ all -> 0x003d }
        L_0x0038:
            r2.unlock()     // Catch:{ all -> 0x0042 }
            goto L_0x00d6
        L_0x003d:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x0047:
            java.lang.Object r3 = r1.A01
            X.BPw r3 = (X.C22808BPw) r3
            X.E48 r1 = r3.A0B
            X.EAk r2 = r3.A0i
            if (r2 == 0) goto L_0x00ff
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x00ff
            if (r1 == 0) goto L_0x00ff
            int r14 = r2.BZ0()     // Catch:{ DZg -> 0x00ff }
            int r4 = r3.A03
            r0 = -1
            if (r4 == r0) goto L_0x008f
            int r3 = r3.A00
            goto L_0x0082
        L_0x0065:
            java.lang.Object r3 = r1.A01
            X.DAU r3 = (X.DAU) r3
            X.E48 r1 = r3.A0A
            X.EAk r2 = r3.A0Q
            if (r2 == 0) goto L_0x00ff
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x00ff
            if (r1 == 0) goto L_0x00ff
            int r14 = r2.BZ0()
            int r4 = r3.A04
            r0 = -1
            if (r4 == r0) goto L_0x008f
            int r3 = r3.A00
        L_0x0082:
            r0 = 1
            r2 = -90
            if (r3 != r0) goto L_0x0089
            r2 = 90
        L_0x0089:
            int r0 = r14 + 360
            int r2 = r2 * r4
            int r0 = r0 + r2
            int r14 = r0 % 360
        L_0x008f:
            r10 = 0
            r2 = r19
            X.CPc[] r9 = r2.A0B
            if (r9 == 0) goto L_0x00b5
            int r8 = r9.length
            X.DAZ[] r7 = new X.DAZ[r8]
            r6 = 0
        L_0x009a:
            if (r6 >= r8) goto L_0x00b4
            r0 = r9[r6]
            if (r0 == 0) goto L_0x00b2
            java.nio.ByteBuffer r5 = r0.A02
            if (r5 == 0) goto L_0x00b2
            int r4 = r0.A00
            int r3 = r0.A01
            X.DAZ r0 = new X.DAZ
            r0.<init>(r5, r4, r3)
        L_0x00ad:
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x009a
        L_0x00b2:
            r0 = r10
            goto L_0x00ad
        L_0x00b4:
            r10 = r7
        L_0x00b5:
            byte[] r8 = r2.A09
            float[] r9 = r2.A0A
            android.util.Pair r4 = r2.A04
            java.lang.Long r6 = r2.A07
            java.lang.Float r5 = r2.A05
            java.lang.Long r7 = r2.A06
            int r11 = r2.A01
            long r15 = r2.A03
            boolean r0 = r2.A08
            int r12 = r2.A02
            int r13 = r2.A00
            X.CUB r3 = new X.CUB
            r17 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            r1.C1e(r3)
            return
        L_0x00d6:
            r2.unlock()
            if (r1 == 0) goto L_0x00ff
            r2 = 0
            r1 = 0
            r0 = 18
            X.C26175Cts.A01(r1, r0, r2)
            X.CXw r0 = r3.A03
            if (r0 == 0) goto L_0x00e9
            r0.A00()
        L_0x00e9:
            X.CZh r1 = r3.A01
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ff
            java.util.List r2 = r1.A00
            r1 = 14
            X.DTa r0 = new X.DTa
            r0.<init>(r3, r2, r1)
            X.C26078Crs.A00(r0)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEM.C1f(X.CXa):void");
    }
}
