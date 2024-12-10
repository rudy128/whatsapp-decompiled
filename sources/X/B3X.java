package X;

import com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet;

public final class B3X extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BrazilHostedPaymentPageBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B3X(BrazilHostedPaymentPageBottomSheet brazilHostedPaymentPageBottomSheet) {
        super(2);
        this.this$0 = brazilHostedPaymentPageBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        C18070vi.A0h(str, str2);
        AnonymousClass1FL A1B = this.this$0.A1B();
        if (A1B instanceof C22463B8v) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet.Callback");
            ((C22463B8v) A1B).Bv9(str, str2);
            this.this$0.A28();
        }
        return C27621Wu.A00;
    }
}
