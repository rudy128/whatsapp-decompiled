package X;

public class AWP implements C107525aA {
    public final int A00;
    public final Object A01;

    public AWP(AP6 ap6, int i) {
        this.A00 = i;
        this.A01 = ap6;
    }

    public final void CAa() {
        int i = this.A00;
        AP6 ap6 = (AP6) this.A01;
        synchronized (AP6.class) {
            if (i != 0) {
                ap6.A06.A02 = 16;
                ap6.A0A();
                return;
            }
            ap6.A06.A02 = 12;
            ap6.A0A();
        }
    }
}
