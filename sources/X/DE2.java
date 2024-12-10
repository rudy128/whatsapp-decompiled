package X;

import java.util.List;

public class DE2 implements E8l {
    public int A00;
    public DE4 A01;
    public final CWU A02;
    public final CJI A03;
    public final C26780DDk A04;
    public final Object A05 = C17880vN.A0p();
    public final List A06;
    public final C25639CjS A07;

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r2.remove(0);
        X.C26159CtX.A01(r0);
        r6.A01 = (X.DE4) r0;
        r3 = r6.A03.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r3 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        android.opengl.GLES30.glWaitSync(r3, 0, -1);
        r0 = r6.A01.A08;
        r5.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = X.AnonymousClass8BR.A0w("can't wait for non existing fence");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.EA3 BRy() {
        /*
            r6 = this;
            java.lang.Object r5 = r6.A05
            monitor-enter(r5)
            X.DE4 r1 = r6.A01     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x000c
            X.CWU r0 = r6.A02     // Catch:{ all -> 0x005a }
            r0.A00(r1)     // Catch:{ all -> 0x005a }
        L_0x000c:
            int r0 = r6.A00     // Catch:{ all -> 0x005a }
            int r0 = r0 + -1
            r6.A00 = r0     // Catch:{ all -> 0x005a }
        L_0x0012:
            java.util.List r2 = r6.A06     // Catch:{ all -> 0x005a }
            boolean r0 = X.AnonymousClass000.A1a(r2)     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0020
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.wait(r0)     // Catch:{ InterruptedException -> 0x004c }
            goto L_0x004c
        L_0x0020:
            r0 = 0
            java.lang.Object r0 = r2.remove(r0)     // Catch:{ all -> 0x005a }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x005a }
            X.DE4 r0 = (X.DE4) r0     // Catch:{ all -> 0x005a }
            r6.A01 = r0     // Catch:{ all -> 0x005a }
            X.CJI r0 = r6.A03     // Catch:{ all -> 0x005a }
            long r3 = r0.A00     // Catch:{ all -> 0x005a }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
            r2 = 0
            r0 = -1
            android.opengl.GLES30.glWaitSync(r3, r2, r0)     // Catch:{ all -> 0x005a }
            X.DE4 r0 = r6.A01     // Catch:{ all -> 0x005a }
            X.DE1 r0 = r0.A08     // Catch:{ all -> 0x005a }
            r5.notifyAll()     // Catch:{ all -> 0x005a }
            monitor-exit(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0059
        L_0x0045:
            java.lang.String r0 = "can't wait for non existing fence"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x004c:
            boolean r0 = X.AnonymousClass000.A1a(r2)     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "decoding took too long :("
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            throw r0     // Catch:{ all -> 0x005a }
        L_0x0059:
            return r0
        L_0x005a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE2.BRy():X.EA3");
    }

    public /* synthetic */ int BT4() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.CJI, java.lang.Object] */
    public DE2(C25639CjS cjS) {
        this.A07 = cjS;
        this.A06 = AnonymousClass000.A13();
        this.A02 = new CWU(cjS);
        this.A04 = new C26780DDk(cjS);
        this.A03 = new Object();
    }

    public void CJe(C28497E4c e4c) {
        throw C17880vN.A0y();
    }
}
