package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Aej  reason: case insensitive filesystem */
public final /* synthetic */ class C21115Aej implements AnonymousClass1TI {
    public final /* synthetic */ AnonymousClass1KN A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ String A02;

    public final void accept(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        AnonymousClass1KN r2 = this.A00;
        String str = this.A02;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8pX r0 = (AnonymousClass8pX) AnonymousClass8BR.A0P(it).A08;
                if (r0 != null && (r0.A01 & 1) > 0) {
                    brazilPaymentActivity.A4q(r2);
                    return;
                }
            }
        }
        if (str == null) {
            C21133Af1.A00(brazilPaymentActivity.A04, r2, brazilPaymentActivity, 15);
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(str)) {
            brazilPaymentActivity.A0X.A02(brazilPaymentActivity, "p2p_context", "request_flow");
        } else {
            BrazilPaymentActivity.A10(brazilPaymentActivity, str, "p2p_context", brazilPaymentActivity.A0j, true);
        }
    }

    public /* synthetic */ C21115Aej(AnonymousClass1KN r1, BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A02 = str;
    }
}
