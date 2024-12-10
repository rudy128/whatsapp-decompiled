package X;

/* renamed from: X.7S1  reason: invalid class name */
public class AnonymousClass7S1 implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass7S1(AnonymousClass1BI r1, AnonymousClass73F r2, String str, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r1;
        this.A03 = str;
    }

    public final Object invoke() {
        int i;
        int i2 = this.A00;
        AnonymousClass1BI r3 = (AnonymousClass1BI) this.A02;
        String str = this.A03;
        AnonymousClass706 A002 = AnonymousClass73F.A00((AnonymousClass73F) this.A01);
        switch (i2) {
            case 0:
                i = 4;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 8;
                break;
            default:
                i = 7;
                break;
        }
        A002.A03(r3, str, i);
        return C27621Wu.A00;
    }
}
