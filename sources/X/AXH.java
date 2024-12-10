package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AXH implements C33661jB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AXH(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj;
        this.A04 = obj2;
    }

    public void C3L(A7B a7b) {
        switch (this.A00) {
            case 0:
                C17900vP.A0X(a7b, "PAY: InteractiveMessageCheckoutInfoManager verifyFromServer/onRequestError. paymentNetworkError: ", AnonymousClass000.A10());
                ((C22500BAh) this.A01).C6i();
                return;
            case 1:
                ((AOX) this.A01).A00.CGP(new C70653Bz(this.A02, this.A03, 43));
                return;
            default:
                AnonymousClass92s r3 = (AnonymousClass92s) this.A01;
                r3.A5p(false);
                r3.A0H = new AtomicBoolean(false);
                r3.BhQ(2131893867);
                return;
        }
    }

    public void C3X(A7B a7b) {
        switch (this.A00) {
            case 0:
                C17900vP.A0X(a7b, "PAY: InteractiveMessageCheckoutInfoManager verifyFromServer/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
                ((C22500BAh) this.A01).C6i();
                return;
            case 1:
                ((AOX) this.A01).A00.CGP(new C70653Bz(this.A02, this.A03, 45));
                return;
            default:
                AnonymousClass92s r3 = (AnonymousClass92s) this.A01;
                r3.A5p(false);
                r3.A0H = new AtomicBoolean(false);
                r3.BhQ(2131893867);
                return;
        }
    }

    public void C3Y(C186089dd r6) {
        AnonymousClass1QD r0;
        switch (this.A00) {
            case 0:
                if (r6 instanceof C176028zf) {
                    List list = ((C176028zf) r6).A01;
                    if (list != null && list.size() > 0) {
                        int i = ((AW0) C108955ca.A0p(list)).A02;
                        Set set = A63.A01;
                        Integer valueOf = Integer.valueOf(i);
                        if (!set.contains(valueOf) && !A63.A00.contains(valueOf)) {
                            ((AnonymousClass10I) this.A04).CGF(new C70733Ch(this.A03, this.A02, 28));
                            ((C22500BAh) this.A01).C6l();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                ((C22500BAh) this.A01).C6i();
                return;
            case 1:
                AOX aox = (AOX) this.A01;
                aox.A05.A01(true, false);
                aox.A00.CGP(new C70653Bz(this.A02, this.A04, 44));
                return;
            default:
                int A0M = AnonymousClass000.A0M(this.A03);
                if (A0M != 0) {
                    if (A0M == 1) {
                        r0 = ((AnonymousClass91T) this.A01).A0Q;
                    } else if (A0M == 2) {
                        AnonymousClass91T r1 = (AnonymousClass91T) this.A01;
                        r1.A0Q.A0A();
                        r0 = r1.A0Q;
                    }
                    C17880vN.A1F(AnonymousClass8BU.A07(r0), "pref_p2m_hybrid_v2_tos_accepted", true);
                } else {
                    ((AnonymousClass91T) this.A01).A0Q.A0A();
                }
                ((IndiaUpiCheckOrderDetailsActivity) this.A01).A5u((ARR) this.A04, (C20279AEn) this.A02);
                return;
        }
    }
}
