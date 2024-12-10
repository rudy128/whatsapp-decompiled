package X;

/* renamed from: X.4n2  reason: invalid class name and case insensitive filesystem */
public class C95934n2 implements AnonymousClass872 {
    public final int A00;
    public final Object A01;

    public C95934n2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BsY(AnonymousClass737 r3, int i) {
        C107395Zn r0;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                r0 = ((AnonymousClass4aY) obj).A2Q;
                break;
            case 1:
                r0 = ((AnonymousClass4UI) obj).A00;
                break;
            default:
                ((C96024nB) obj).A03.A01.BsW(r3.A00);
                return;
        }
        if (r0 != null) {
            r0.BsX(r3);
        }
    }
}
