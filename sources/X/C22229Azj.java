package X;

import com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity;
import com.whatsapp.util.Log;

/* renamed from: X.Azj  reason: case insensitive filesystem */
public final class C22229Azj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BrazilPaymentPixOnboardingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22229Azj(BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity) {
        super(1);
        this.this$0 = brazilPaymentPixOnboardingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        if (!str.equals("loaded")) {
            if (str.equals("dismissed")) {
                BrazilPaymentPixOnboardingActivity.A03(this.this$0);
            } else {
                Log.e("BrazilPaymentPixOnboardingActivity invalid UI state");
            }
        }
        return C27621Wu.A00;
    }
}
