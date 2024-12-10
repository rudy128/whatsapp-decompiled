package X;

import com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2;
import com.whatsapp.util.Log;

/* renamed from: X.Azl  reason: case insensitive filesystem */
public final class C22231Azl extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BrazilPaymentPixOnboardingActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22231Azl(BrazilPaymentPixOnboardingActivityV2 brazilPaymentPixOnboardingActivityV2) {
        super(1);
        this.this$0 = brazilPaymentPixOnboardingActivityV2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        if (!str.equals("loaded")) {
            if (str.equals("dismissed")) {
                this.this$0.finish();
            } else {
                Log.e("BrazilPaymentPixOnboardingActivityV2 invalid UI state");
            }
        }
        return C27621Wu.A00;
    }
}
