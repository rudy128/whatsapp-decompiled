package X;

import android.os.Handler;

/* renamed from: X.Ckd  reason: case insensitive filesystem */
public final class C25707Ckd {
    public static final Handler A00 = C17890vO.A0D();
    public static final C24982CSh A01;
    public static final C25707Ckd A02 = new Object();

    public final void A00(BFG bfg) {
        C18070vi.A0d(bfg, 0);
        Handler handler = A00;
        C27082DTh dTh = bfg.A0F;
        handler.removeCallbacks(dTh);
        C24982CSh cSh = A01;
        synchronized (cSh.A03) {
            cSh.A00.remove(dTh);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r2.A02.post(r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.BFG r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            android.os.Handler r0 = A00
            X.DTh r3 = r5.A0F
            r0.removeCallbacks(r3)
            X.CSh r2 = A01
            java.lang.Thread r1 = X.BE8.A0k()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L_0x003f
            java.lang.Object r1 = r2.A03
            monitor-enter(r1)
            java.util.ArrayList r0 = r2.A00     // Catch:{ all -> 0x003c }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r1)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            java.util.ArrayList r0 = r2.A00     // Catch:{ all -> 0x003c }
            r0.add(r3)     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            boolean r0 = X.C17890vO.A1R(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0046
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A04
            r1.post(r0)
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            java.lang.Object r0 = r3.A01
            X.BFG r0 = (X.BFG) r0
            r0.A01()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25707Ckd.A01(X.BFG):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ckd, java.lang.Object] */
    static {
        C24982CSh cSh;
        synchronized (C24982CSh.class) {
            cSh = C24982CSh.A05;
            if (cSh == null) {
                cSh = new C24982CSh();
                C24982CSh.A05 = cSh;
            }
        }
        A01 = cSh;
    }
}
