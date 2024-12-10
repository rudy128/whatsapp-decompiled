package X;

import android.content.Context;

public class D8N implements E8T {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DOZ A01;
    public final /* synthetic */ DFL A02;
    public final /* synthetic */ DFL A03;

    public D8N(Context context, DOZ doz, DFL dfl, DFL dfl2) {
        this.A03 = dfl;
        this.A00 = context;
        this.A02 = dfl2;
        this.A01 = doz;
    }

    public void C5v() {
        DFL dfl = this.A03;
        E8A A0A = dfl.A0A(42);
        if (A0A != null) {
            DFL dfl2 = this.A02;
            C26209Cul.A04(this.A01, dfl2, C108985cd.A0J(dfl2), A0A, 1);
            return;
        }
        E8A A0A2 = dfl.A0A(35);
        if (A0A2 != null) {
            C25681CkC.A03(this.A01, this.A02, new C20046A4p().A02(), A0A2);
        }
    }

    public void C5w(int i) {
        E8A A0A = this.A03.A0A(38);
        if (A0A != null) {
            DFL dfl = this.A02;
            C20046A4p A0J = C108985cd.A0J(dfl);
            DOZ doz = this.A01;
            A0J.A03(doz, 1);
            A0J.A03(Integer.valueOf((int) C25342Ce1.A01(this.A00, (float) i)), 2);
            C26209Cul.A03(doz, dfl, A0J, A0A);
        }
    }

    public void C5x(int i) {
        DFL dfl = this.A03;
        E8A A0A = dfl.A0A(43);
        if (A0A != null) {
            DFL dfl2 = this.A02;
            C20046A4p A0J = C108985cd.A0J(dfl2);
            DOZ doz = this.A01;
            A0J.A03(doz, 1);
            A0J.A03(Integer.valueOf((int) C25342Ce1.A01(this.A00, (float) i)), 2);
            C26209Cul.A03(doz, dfl2, A0J, A0A);
            return;
        }
        E8A A0A2 = dfl.A0A(36);
        if (A0A2 != null) {
            C25681CkC.A03(this.A01, this.A02, new C20046A4p().A02(), A0A2);
        }
    }
}
