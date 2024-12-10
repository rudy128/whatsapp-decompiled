package X;

public class AW2 implements BDR {
    public final /* synthetic */ C20038A4h A00;

    public AW2(C20038A4h a4h) {
        this.A00 = a4h;
    }

    public void Bno() {
        C20038A4h.A00(this.A00, 2);
    }

    public void Bnp() {
        C20038A4h.A00(this.A00, 7);
    }

    public void BpM(boolean z) {
        if (z) {
            C20038A4h.A00(this.A00, 5);
        }
    }

    public void Bvm() {
        C20038A4h.A00(this.A00, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r4 == 101) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1V(int r4) {
        /*
            r3 = this;
            r0 = 301(0x12d, float:4.22E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 104(0x68, float:1.46E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 101(0x65, float:1.42E-43)
            r2 = 0
            if (r4 != r0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            X.A4h r1 = r3.A00
            r0 = 3
            if (r2 == 0) goto L_0x0015
            r0 = 18
        L_0x0015:
            X.C20038A4h.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW2.C1V(int):void");
    }

    public void C1W() {
        C20038A4h.A00(this.A00, 17);
    }

    public void C20(int i) {
        C20038A4h a4h = this.A00;
        C20038A4h.A00(a4h, 3);
        synchronized (a4h) {
            a4h.A00 = i;
        }
    }

    public void onError(int i) {
        C20038A4h.A00(this.A00, C181469Qp.A00(i));
    }
}
