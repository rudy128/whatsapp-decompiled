package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;

public final class B14 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ WaButtonWithLoader $ctaButton;
    public final /* synthetic */ BrazilPaymentMethodAddPixBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B14(WaButtonWithLoader waButtonWithLoader, BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet) {
        super(1);
        this.$ctaButton = waButtonWithLoader;
        this.this$0 = brazilPaymentMethodAddPixBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C198179xu r3 = (C198179xu) obj;
        C18070vi.A0d(r3, 0);
        int i = r3.A00;
        if (i == 0) {
            this.this$0.A28();
        } else if (i == 1) {
            AnonymousClass1KB r1 = this.this$0.A01;
            if (r1 != null) {
                r1.A05(2131896261);
                this.$ctaButton.A01();
            } else {
                C18070vi.A11("globalUI");
                throw null;
            }
        } else if (i == 2) {
            this.$ctaButton.A02();
        }
        return C27621Wu.A00;
    }
}
