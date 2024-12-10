package X;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.Aa8  reason: case insensitive filesystem */
public class C20830Aa8 implements BDA {
    public final /* synthetic */ C20809AZm A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ void Bl9() {
    }

    public /* synthetic */ void Bm8() {
    }

    public C20830Aa8(C20809AZm aZm, String str) {
        this.A00 = aZm;
        this.A01 = str;
    }

    public String BUt(C20284AEs aEs) {
        return AnonymousClass8BR.A0c(this.A00.A03.A0h).A02(aEs);
    }

    public void Bl3() {
        BrazilPaymentActivity brazilPaymentActivity = this.A00.A03;
        String A012 = A5Y.A01(brazilPaymentActivity.A0S, "p2p_context", false);
        Intent A03 = AnonymousClass8BS.A03(brazilPaymentActivity);
        A03.putExtra("hide_send_payment_cta", true);
        if (A012 == null) {
            A012 = "brpay_p_add_card";
        }
        A03.putExtra("screen_name", A012);
        AnonymousClass8k7.A03(A03, "referral_screen", "payment_method_picker");
        AnonymousClass8k7.A03(A03, "onboarding_context", this.A01);
        brazilPaymentActivity.startActivity(A03);
    }

    public /* synthetic */ View BMa(LayoutInflater layoutInflater) {
        return null;
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        return 0;
    }

    public /* synthetic */ String BUu(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ void BWm() {
    }

    public /* synthetic */ boolean CLr(C20284AEs aEs) {
        return false;
    }

    public /* synthetic */ boolean CMF() {
        return true;
    }

    public /* synthetic */ boolean CMP() {
        return true;
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        if (A8e.A08(aEs)) {
            this.A00.A03.A0R.A02(aEs, paymentMethodRow);
        }
    }

    public /* synthetic */ View BRv(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return null;
    }
}
