package X;

/* renamed from: X.2vz  reason: invalid class name and case insensitive filesystem */
public class C65192vz implements C38691rj {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C65192vz(C38631rd r1, String str, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = str;
    }

    public final void CGH() {
        int i = this.A00;
        C38631rd r1 = (C38631rd) this.A01;
        String str = this.A02;
        switch (i) {
            case 0:
                r1.A0I(str);
                return;
            case 1:
                r1.A0H(str);
                return;
            default:
                r1.A0J(str);
                return;
        }
    }
}
