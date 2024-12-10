package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.AbP  reason: case insensitive filesystem */
public final /* synthetic */ class C20909AbP implements B9H {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public final void CCh(C29621ca r6) {
        C29621ca A0K;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        String str = this.A01;
        C29621ca A0K2 = r6.A0K("pay");
        if (A0K2 != null && (A0K = A0K2.A0K("card")) != null) {
            brazilPaymentActivity.A0Q.A01().A04(new ARE(), C170278pb.A02(brazilPaymentActivity.A08, new AnonymousClass8pT(), A0K), str);
        }
    }

    public /* synthetic */ C20909AbP(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }
}
