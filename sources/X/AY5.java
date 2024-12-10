package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

public class AY5 implements BB9 {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public AY5(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    public void Bo0(AnonymousClass8pK r4) {
        Log.i("PAY: BrazilPaymentActivity BrazilGetVerificationMethods - onCardVerified");
        this.A00.A0Q.A01().A03(new ARF(this, 5), r4);
    }

    public void C3s(A7B a7b, List list) {
        int i;
        C18030ve r6;
        C20751AXg aXg;
        C21347Aib aib;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.CEx();
        if (a7b == null) {
            if (list == null || list.isEmpty()) {
                brazilPaymentActivity.A0O.A05("error_code", 0, brazilPaymentActivity.A00);
                aXg = brazilPaymentActivity.A0C;
                r6 = brazilPaymentActivity.A0E;
                i = 2131893610;
                aXg.A01(brazilPaymentActivity, r6, brazilPaymentActivity.A0K, 0, i).show();
            }
            int A02 = AnonymousClass8BX.A02(brazilPaymentActivity, list);
            JSONArray A012 = brazilPaymentActivity.A0B.A01(list);
            if (A012 != null && !C19944A0b.A00(list)) {
                int A0d = BrazilPayBloksActivity.A0d(list);
                if (!C18020vd.A05(C18040vf.A02, brazilPaymentActivity.A0E, A02) || A0d == -1) {
                    aib = null;
                } else {
                    aib = (C21347Aib) list.get(A0d);
                }
                String str = this.A01;
                String obj = A012.toString();
                AnonymousClass8pK r62 = (AnonymousClass8pK) AnonymousClass8BR.A0R(brazilPaymentActivity.A0Q).A08(str);
                if (r62 != null) {
                    Intent A03 = brazilPaymentActivity.A0S.A03(brazilPaymentActivity, r62, aib, obj, A0d);
                    AnonymousClass8k7.A03(A03, "referral_screen", "verify_to_pay");
                    brazilPaymentActivity.CNh(A03, 1);
                    return;
                }
                return;
            }
        }
        C17900vP.A0j("PAY: BrazilGetVerificationMethods Error: ", AnonymousClass000.A10(), 0);
        brazilPaymentActivity.A0O.A05("error_code", 0, brazilPaymentActivity.A00);
        aXg = brazilPaymentActivity.A0C;
        r6 = brazilPaymentActivity.A0E;
        i = 2131893770;
        aXg.A01(brazilPaymentActivity, r6, brazilPaymentActivity.A0K, 0, i).show();
    }
}
