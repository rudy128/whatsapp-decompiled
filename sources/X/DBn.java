package X;

public final class DBn implements C28603E9u {
    public int A00 = -1;
    public DRN A01;

    private final synchronized void A00() {
        DRN drn = this.A01;
        if (drn != null) {
            drn.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (X.DRN.A02(r2.A01) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean BFj(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0011 }
            if (r3 != r0) goto L_0x000e
            X.DRN r0 = r2.A01     // Catch:{ all -> 0x0011 }
            boolean r1 = X.DRN.A02(r0)     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBn.BFj(int):boolean");
    }

    public synchronized DRN BNQ() {
        DRN drn;
        try {
            DRN drn2 = this.A01;
            if (drn2 != null) {
                drn = drn2.A04();
            } else {
                drn = null;
            }
            A00();
        } catch (Throwable th) {
            A00();
            throw th;
        }
        return drn;
    }

    public synchronized DRN BNy(int i) {
        DRN drn;
        DRN drn2;
        if (this.A00 != i || (drn2 = this.A01) == null) {
            drn = null;
        } else {
            drn = drn2.A04();
        }
        return drn;
    }

    public synchronized DRN BRZ() {
        DRN drn;
        DRN drn2 = this.A01;
        if (drn2 != null) {
            drn = drn2.A04();
        } else {
            drn = null;
        }
        return drn;
    }

    public void Bv3(DRN drn, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (X.C18070vi.A18(r1, r0) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void Bv4(X.DRN r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.DRN r0 = r2.A01     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r3.A05()     // Catch:{ all -> 0x002e }
            X.DRN r0 = r2.A01     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.A05()     // Catch:{ all -> 0x002e }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x002e }
        L_0x0013:
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x002e }
            goto L_0x002a
        L_0x0018:
            r0 = 0
            goto L_0x0013
        L_0x001a:
            X.DRN r0 = r2.A01     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ all -> 0x002e }
        L_0x0021:
            X.DRN r0 = r3.A04()     // Catch:{ all -> 0x002e }
            r2.A01 = r0     // Catch:{ all -> 0x002e }
            r2.A00 = r4     // Catch:{ all -> 0x002e }
            goto L_0x002c
        L_0x002a:
            if (r0 == 0) goto L_0x001a
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBn.Bv4(X.DRN, int):void");
    }

    public synchronized void clear() {
        A00();
    }
}
