package X;

import com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;

public final class B12 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ WDSButton $submitCta;
    public final /* synthetic */ BrazilHostedPaymentPageBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B12(BrazilHostedPaymentPageBottomSheet brazilHostedPaymentPageBottomSheet, WDSButton wDSButton) {
        super(1);
        this.this$0 = brazilHostedPaymentPageBottomSheet;
        this.$submitCta = wDSButton;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WDSButton wDSButton;
        int A0M = AnonymousClass000.A0M(obj);
        boolean z = true;
        if (A0M == 1) {
            C21426Ajt.A00(this.this$0.A2K(), this.this$0, 7);
            wDSButton = this.$submitCta;
            z = false;
            wDSButton.setEnabled(z);
        } else if (A0M == 2) {
            C21426Ajt.A00(this.this$0.A2K(), this.this$0, 8);
            wDSButton = this.$submitCta;
            wDSButton.setEnabled(z);
        } else if (A0M == 3) {
            C21426Ajt.A00(this.this$0.A2K(), this.this$0, 6);
        }
        return C27621Wu.A00;
    }
}
