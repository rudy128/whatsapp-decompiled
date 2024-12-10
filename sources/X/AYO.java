package X;

public class AYO implements C22450B8i {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AYO(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C3f(A7B a7b) {
        C188629hj r1;
        C41731wy r0;
        AnonymousClass10I r2;
        int i;
        AW0 aw0;
        int i2 = this.A00;
        AnonymousClass8GL r4 = (AnonymousClass8GL) this.A01;
        Object obj = this.A02;
        if (i2 == 0) {
            AW0 aw02 = (AW0) obj;
            if (a7b != null) {
                A46.A01(r4.A01);
                r1 = C188629hj.A00(2);
                r1.A06 = a7b;
                r0 = r4.A09;
                r0.A0F(r1);
                return;
            }
            C170318pf r02 = (C170318pf) aw02.A0A;
            C17960vV.A07(r02);
            C196219ue r03 = r02.A0H;
            C17960vV.A07(r03);
            AnonymousClass9O4 r12 = r03.A0C;
            r12.A08 = "ACCEPT";
            r12.A09 = "PENDING";
            r2 = r4.A0M;
            i = 45;
            aw0 = aw02;
        } else if (a7b == null) {
            r2 = r4.A0M;
            i = 49;
            aw0 = obj;
        } else {
            r1 = C188629hj.A00(2);
            r1.A06 = a7b;
            r0 = r4.A09;
            r0.A0F(r1);
            return;
        }
        r2.CGF(new C21432Ajz(r4, aw0, i));
    }
}
