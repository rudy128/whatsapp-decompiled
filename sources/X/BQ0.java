package X;

import java.util.List;

public class BQ0 extends DDR implements ED0 {
    public C28614EAk A00;
    public final CJS A01 = new CJS(this);
    public final C25132CZh A02 = new C25132CZh();
    public final Object A03 = C17880vN.A0p();
    public volatile CY3 A04;
    public volatile Integer A05 = AnonymousClass00R.A00;

    public static void A00(BQ0 bq0) {
        List list = bq0.A02.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0s("onVideoCaptureError");
        }
    }

    public C22892BUd BTg() {
        return ED0.A00;
    }

    public BQ0(C28592E9h e9h) {
        this.A00 = e9h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        X.BE9.A1L(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        throw X.AnonymousClass8BR.A0w("Timeout stopping video recording.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r6 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.BQ0 r5, boolean r6) {
        /*
            java.util.concurrent.CountDownLatch r4 = X.BE7.A0u()
            java.lang.Object r3 = r5.A03
            monitor-enter(r3)
            java.lang.Integer r1 = r5.A05     // Catch:{ all -> 0x0029 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0029 }
            if (r1 == r0) goto L_0x000f
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return
        L_0x000f:
            X.EAk r2 = r5.A00     // Catch:{ all -> 0x0029 }
            r1 = 1
            X.BUj r0 = new X.BUj     // Catch:{ all -> 0x0029 }
            r0.<init>(r5, r4, r1, r6)     // Catch:{ all -> 0x0029 }
            r2.COc(r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x0028
            X.BE9.A1L(r4)     // Catch:{ InterruptedException -> 0x0021 }
            return
        L_0x0021:
            java.lang.String r0 = "Timeout stopping video recording."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQ0.A01(X.BQ0, boolean):void");
    }
}
