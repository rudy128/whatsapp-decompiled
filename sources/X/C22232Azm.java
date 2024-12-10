package X;

import com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2;
import com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.Azm  reason: case insensitive filesystem */
public final class C22232Azm extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BrazilPaymentPixOnboardingActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22232Azm(BrazilPaymentPixOnboardingActivityV2 brazilPaymentPixOnboardingActivityV2) {
        super(1);
        this.this$0 = brazilPaymentPixOnboardingActivityV2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C198179xu r6 = (C198179xu) obj;
        C18070vi.A0d(r6, 0);
        int i = r6.A00;
        if (i == 0) {
            BrazilPaymentPixOnboardingActivityV2 brazilPaymentPixOnboardingActivityV2 = this.this$0;
            if (brazilPaymentPixOnboardingActivityV2.A0C || C18070vi.A18(brazilPaymentPixOnboardingActivityV2.A0A, "payment_home")) {
                this.this$0.finish();
            } else {
                C003401n supportActionBar = this.this$0.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.A0E();
                }
                BrazilPaymentPixOnboardingActivityV2 brazilPaymentPixOnboardingActivityV22 = this.this$0;
                Object obj2 = r6.A01;
                C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.data.payments.PixKey");
                C20339AGv.A00(brazilPaymentPixOnboardingActivityV22, ((AnonymousClass8FL) AnonymousClass3MW.A0N(brazilPaymentPixOnboardingActivityV22).A00(BrazilSendPixKeyViewModel.class)).A00, new C22231Azl(brazilPaymentPixOnboardingActivityV22), 36);
                C21132Af0 af0 = new C21132Af0();
                C21432Ajz.A00(brazilPaymentPixOnboardingActivityV22.A05, brazilPaymentPixOnboardingActivityV22, af0, 9);
                C21133Af1.A00(af0, obj2, brazilPaymentPixOnboardingActivityV22, 16);
            }
        } else if (i == 1) {
            Log.e("BrazilPaymentPixOnboardingActivity/onCreate failed to create pix key");
        }
        return C27621Wu.A00;
    }
}
