package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

public class ARF implements C22442B7y {
    public final int A00;
    public final Object A01;

    public ARF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BlH(List list) {
        C33661jB r1;
        C176008zd r0;
        switch (this.A00) {
            case 0:
            case 1:
                r1 = (C33661jB) this.A01;
                C176018ze r02 = new C176018ze();
                r02.A00 = list;
                r0 = r02;
                break;
            case 2:
                r1 = (C33661jB) this.A01;
                r0 = new C176008zd();
                break;
            case 5:
                BrazilPaymentActivity brazilPaymentActivity = ((AY5) this.A01).A00;
                brazilPaymentActivity.CEx();
                if (brazilPaymentActivity.A0T != null && list.size() > 0) {
                    brazilPaymentActivity.A0T.C0I((C20284AEs) C108955ca.A0p(list));
                    return;
                }
                return;
            default:
                ((C194839sN) this.A01).A00("on_success");
                return;
        }
        r1.C3Y(r0);
    }
}
