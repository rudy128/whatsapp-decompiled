package X;

import java.util.List;

public class AGT implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;

    public AGT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.A00) {
            case 0:
                C61312pT r4 = (C61312pT) obj;
                if (r4 == null) {
                    r4 = new C61312pT(-3);
                }
                ((C57062iT) this.A01).A00(r4);
                return;
            case 1:
                AnonymousClass8GM r2 = (AnonymousClass8GM) this.A01;
                List list = ((C184349ao) obj).A00;
                if (list.size() > 0) {
                    AnonymousClass8GM.A03(r2, ((C184339an) C108955ca.A0p(list)).A00);
                    return;
                }
                AnonymousClass3MY.A1M(r2.A03, false);
                C72463Mc.A1B(r2.A02);
                return;
            case 2:
                AnonymousClass8GM.A03((AnonymousClass8GM) this.A01, AnonymousClass000.A0M(obj));
                return;
            default:
                ((C48532Mv) this.A01).A01.A0K((C60132nR) obj);
                return;
        }
    }
}
