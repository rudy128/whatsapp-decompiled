package X;

import java.io.Closeable;

public class DRN implements Closeable, Cloneable {
    public static final E4L A04 = new DBH();
    public static final E4M A05 = new DBK(0);
    public boolean A00 = false;
    public final E4L A01;
    public final C25979Cps A02;
    public final Throwable A03;

    public synchronized DRN A04() {
        if (!A06()) {
            return null;
        }
        return clone();
    }

    public synchronized Object A05() {
        Object A012;
        C26208Cuj.A05(!this.A00);
        A012 = this.A02.A01();
        C26208Cuj.A01(A012);
        return A012;
    }

    public synchronized boolean A06() {
        return !this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        X.C25979Cps.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C26208Cuj.A04(X.AnonymousClass000.A1R(r3.A00));
        r0 = r3.A00 - 1;
        r3.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r3.A01;
        r3.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        r3.A02.CEE(r1);
        r5 = X.C25979Cps.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0 = (java.lang.Integer) r5.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r0 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        r2 = new java.lang.Object[]{r1.getClass()};
        r1 = X.C26265CwA.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (r1.BfN(6) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        r1.CSX("SharedReference", X.BE7.A0o("No entry in sLiveObjects for value of type %s", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        if (r0 != 1) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        r5.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        X.C17880vN.A1P(r1, r5, r0 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r3 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A00     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x0075 }
            return
        L_0x0007:
            r0 = 1
            r6.A00 = r0     // Catch:{ all -> 0x0075 }
            monitor-exit(r6)     // Catch:{ all -> 0x0075 }
            X.Cps r3 = r6.A02
            monitor-enter(r3)
            X.C25979Cps.A00(r3)     // Catch:{ all -> 0x0072 }
            int r0 = r3.A00     // Catch:{ all -> 0x0072 }
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1R(r0)
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x0072 }
            int r0 = r3.A00     // Catch:{ all -> 0x0072 }
            int r0 = r0 - r2
            r3.A00 = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r3)
            if (r0 != 0) goto L_0x0071
            monitor-enter(r3)
            java.lang.Object r1 = r3.A01     // Catch:{ all -> 0x006e }
            r0 = 0
            r3.A01 = r0     // Catch:{ all -> 0x006e }
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0071
            X.E4M r0 = r3.A02
            r0.CEE(r1)
            java.util.Map r5 = X.C25979Cps.A03
            monitor-enter(r5)
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x006b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x005b
            java.lang.String r4 = "SharedReference"
            java.lang.String r3 = "No entry in sLiveObjects for value of type %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x006b }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x006b }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x006b }
            X.EAY r1 = X.C26265CwA.A00     // Catch:{ all -> 0x006b }
            r0 = 6
            boolean r0 = r1.BfN(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = X.BE7.A0o(r3, r2)     // Catch:{ all -> 0x006b }
            r1.CSX(r4, r0)     // Catch:{ all -> 0x006b }
        L_0x0059:
            monitor-exit(r5)     // Catch:{ all -> 0x006b }
            goto L_0x006a
        L_0x005b:
            int r0 = r0.intValue()     // Catch:{ all -> 0x006b }
            if (r0 != r2) goto L_0x0065
            r5.remove(r1)     // Catch:{ all -> 0x006b }
            goto L_0x0059
        L_0x0065:
            int r0 = r0 - r2
            X.C17880vN.A1P(r1, r5, r0)     // Catch:{ all -> 0x006b }
            goto L_0x0059
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0075:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0075 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRN.close():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r1 = X.C17890vO.A0U(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r2[2] = r1;
        X.C26265CwA.A06("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", r2);
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r1.CFN(r5, r6.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = r6.A02;
        r1 = r5.A01();
        r2 = X.AnonymousClass8BR.A1a();
        X.AnonymousClass000.A1L(r2, java.lang.System.identityHashCode(r6));
        X.AnonymousClass000.A1M(r2, java.lang.System.identityHashCode(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r6 = this;
            monitor-enter(r6)     // Catch:{ all -> 0x0042 }
            boolean r0 = r6.A00     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x003f }
            return
        L_0x0007:
            monitor-exit(r6)     // Catch:{ all -> 0x003f }
            X.Cps r5 = r6.A02     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r5.A01()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "DefaultCloseableReference"
            java.lang.String r3 = "Finalized without closing: %x %x (type = %s)"
            java.lang.Object[] r2 = X.AnonymousClass8BR.A1a()     // Catch:{ all -> 0x0042 }
            int r0 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass000.A1L(r2, r0)     // Catch:{ all -> 0x0042 }
            int r0 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass000.A1M(r2, r0)     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0028
            r1 = 0
            goto L_0x002c
        L_0x0028:
            java.lang.String r1 = X.C17890vO.A0U(r1)     // Catch:{ all -> 0x0042 }
        L_0x002c:
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x0042 }
            X.C26265CwA.A06(r4, r3, r2)     // Catch:{ all -> 0x0042 }
            X.E4L r1 = r6.A01     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x003b
            java.lang.Throwable r0 = r6.A03     // Catch:{ all -> 0x0042 }
            r1.CFN(r5, r0)     // Catch:{ all -> 0x0042 }
        L_0x003b:
            r6.close()     // Catch:{ all -> 0x0042 }
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRN.finalize():void");
    }

    public static DRN A00(E4M e4m, Object obj) {
        E4L e4l = A04;
        if (obj != null) {
            return new DRN(e4l, e4m, obj);
        }
        return null;
    }

    public static DRN A01(Closeable closeable) {
        return new DRN(A04, A05, (Object) closeable);
    }

    public static boolean A02(DRN drn) {
        if (drn == null || !drn.A06()) {
            return false;
        }
        return true;
    }

    public DRN(E4L e4l, C25979Cps cps, Throwable th) {
        C26208Cuj.A01(cps);
        this.A02 = cps;
        synchronized (cps) {
            C25979Cps.A00(cps);
            cps.A00++;
        }
        this.A01 = e4l;
        this.A03 = th;
    }

    /* renamed from: A03 */
    public DRN clone() {
        Throwable th;
        C26208Cuj.A05(A06());
        C25979Cps cps = this.A02;
        E4L e4l = this.A01;
        if (this.A03 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new DRN(e4l, cps, th);
    }

    public DRN(E4L e4l, E4M e4m, Object obj) {
        this.A02 = new C25979Cps(e4m, obj);
        this.A01 = e4l;
        this.A03 = null;
    }
}
