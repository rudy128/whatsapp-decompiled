package X;

public class AWL implements C1600887b {
    public final int A00;
    public final Object A01;

    public AWL(AP6 ap6, int i) {
        this.A00 = i;
        this.A01 = ap6;
    }

    public final void BwF(Object obj) {
        if (this.A00 != 0) {
            AP6 ap6 = (AP6) this.A01;
            AnonymousClass1E7 r5 = (AnonymousClass1E7) obj;
            synchronized (AP6.class) {
                C188309hD r1 = ap6.A06;
                r1.A02 = 14;
                r1.A06 = r5;
                ap6.A0A();
            }
            return;
        }
        AP6 ap62 = (AP6) this.A01;
        C188309hD r12 = ap62.A06;
        r12.A02 = 13;
        r12.A05 = (AF0) obj;
        ap62.A0A();
    }
}
