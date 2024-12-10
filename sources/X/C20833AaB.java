package X;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.AaB  reason: case insensitive filesystem */
public final /* synthetic */ class C20833AaB implements B95 {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void C1m(BottomSheetDialogFragment bottomSheetDialogFragment) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        boolean z = this.A04;
        bottomSheetDialogFragment.A28();
        if (!C18020vd.A05(C18040vf.A02, brazilPaymentActivity.A0P.A02, 2928) || !"p2m_context".equals(str) || (!"brpay_p_add_card".equals(str2) && !"brpay_p_compliance_kyc_next_screen_router".equals(str2))) {
            Intent A032 = AnonymousClass8BS.A03(brazilPaymentActivity);
            A032.putExtra("screen_name", str2);
            A032.putExtra("hide_send_payment_cta", true);
            AnonymousClass8k7.A03(A032, "referral_screen", str3);
            AnonymousClass8k7.A03(A032, "onboarding_context", str);
            AnonymousClass8k7.A03(A032, "request_flow", AnonymousClass8BS.A0b(z ? 1 : 0));
            brazilPaymentActivity.startActivity(A032);
            return;
        }
        brazilPaymentActivity.CNA(2131893634);
        C192469oR r5 = brazilPaymentActivity.A0Y;
        if (TextUtils.isEmpty(str3)) {
            str3 = "get_started";
        }
        r5.A00(new C20868Aak(brazilPaymentActivity, 1), new C20900AbG(brazilPaymentActivity, 3), new C20909AbP(brazilPaymentActivity, str), str3);
    }

    public /* synthetic */ C20833AaB(BrazilPaymentActivity brazilPaymentActivity, String str, String str2, String str3, boolean z) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = z;
    }
}
