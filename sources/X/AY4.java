package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

public class AY4 implements BB9 {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;

    public AY4(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity) {
        this.A00 = brazilPaymentCardDetailsActivity;
    }

    public void Bo0(AnonymousClass8pK r3) {
        Log.i("PAY: BrazilPaymentCardDetailsActivity BrazilGetVerificationMethods - onCardVerified");
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.CEx();
        A5I.A01(brazilPaymentCardDetailsActivity.A0A.A01(), r3, this, 16);
    }

    public void C3s(A7B a7b, List list) {
        int i;
        C21347Aib aib;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.CEx();
        if (a7b == null) {
            if (list != null && !list.isEmpty()) {
                int A02 = AnonymousClass8BX.A02(brazilPaymentCardDetailsActivity, list);
                JSONArray A01 = brazilPaymentCardDetailsActivity.A02.A01(list);
                if (A01 != null && !C19944A0b.A00(list)) {
                    int A0d = BrazilPayBloksActivity.A0d(list);
                    if (!C18020vd.A05(C18040vf.A02, brazilPaymentCardDetailsActivity.A0E, A02) || A0d == -1) {
                        aib = null;
                    } else {
                        aib = (C21347Aib) list.get(A0d);
                    }
                    Intent A03 = brazilPaymentCardDetailsActivity.A0B.A03(brazilPaymentCardDetailsActivity, (AnonymousClass8pK) brazilPaymentCardDetailsActivity.A04, aib, A01.toString(), A0d);
                    AnonymousClass8k7.A03(A03, "referral_screen", "payment_method_details");
                    brazilPaymentCardDetailsActivity.CNh(A03, 1);
                    return;
                }
            }
            i = 0;
        } else {
            int i2 = a7b.A00;
            if (i2 == 443 || i2 == 10229 || (list != null && !list.isEmpty())) {
                i = a7b.A00;
            } else {
                i = -233;
            }
        }
        C17900vP.A0j("PAY: BrazilGetVerificationMethods Error: ", AnonymousClass000.A10(), i);
        brazilPaymentCardDetailsActivity.A03.A01(brazilPaymentCardDetailsActivity, brazilPaymentCardDetailsActivity.A0E, brazilPaymentCardDetailsActivity.A06, i, 2131893770).show();
    }
}
