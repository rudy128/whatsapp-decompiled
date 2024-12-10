package X;

/* renamed from: X.7G8  reason: invalid class name */
public class AnonymousClass7G8 implements C107375Zl {
    public final int A00;
    public final Object A01;

    public AnonymousClass7G8(C113605nM r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void C5m(int[] iArr) {
        int i = this.A00;
        C113605nM r3 = (C113605nM) this.A01;
        AnonymousClass737 r2 = new AnonymousClass737(iArr);
        r3.A05.BsY(r2, r3.A00);
        int i2 = r3.A00;
        r3.A01 = r2;
        r3.A00 = i2;
        C18010vc r0 = r3.A06;
        if (i != 0) {
            C1409873v.A04(r0, iArr);
        } else {
            C1409873v.A03(r0, iArr);
        }
        C113605nM.A00(r3);
    }
}
