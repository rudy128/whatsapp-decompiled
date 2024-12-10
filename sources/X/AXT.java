package X;

public class AXT implements B8Z {
    public final int A00;
    public final Object A01;

    public AXT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C2r(A7B a7b) {
        int i;
        if (this.A00 != 0) {
            AnonymousClass8GL r4 = (AnonymousClass8GL) this.A01;
            if (a7b != null) {
                AnonymousClass1KB r3 = r4.A0B;
                r3.A04();
                int i2 = 2131895259;
                if (a7b.A00 == 443) {
                    i2 = 2131894180;
                }
                r3.A08(i2, 0);
                r4.A09.A0E(C188629hj.A00(1));
                return;
            }
            C21427Aju.A00(r4.A0M, r4, 49);
            return;
        }
        AnonymousClass9B5 r32 = (AnonymousClass9B5) this.A01;
        if (a7b == null || (i = a7b.A00) != 11495) {
            B8Z b8z = r32.A02;
            if (b8z != null) {
                b8z.C2r(a7b);
                return;
            }
            return;
        }
        C17900vP.A0j("PAY: reject collect; error code: ", AnonymousClass000.A10(), i);
        C20746AXb aXb = r32.A03;
        C17890vO.A0v(aXb.A0B, r32, 26);
        aXb.A00.A04();
        AnonymousClass4Yv.A01(r32.A00, 100);
    }
}
