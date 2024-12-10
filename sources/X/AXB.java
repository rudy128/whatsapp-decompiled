package X;

public class AXB implements B8Y {
    public final int A00;
    public final Object A01;

    public AXB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C3f(A7B a7b) {
        AnonymousClass1FU r2;
        switch (this.A00) {
            case 0:
                AnonymousClass1FU r22 = (AnonymousClass1FU) this.A01;
                r2 = r22;
                if (a7b != null) {
                    C21445AkC.A00(r22.A05, r22, 23);
                    return;
                }
                break;
            case 1:
                if (a7b == null) {
                    r2 = (AnonymousClass1FP) this.A01;
                    break;
                } else {
                    return;
                }
            default:
                ((C72073Kn) this.A01).C3p(AnonymousClass000.A1X(a7b));
                return;
        }
        C21445AkC.A01(r2.A05, r2, 22);
    }
}
