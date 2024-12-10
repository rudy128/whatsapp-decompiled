package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.Aa1  reason: case insensitive filesystem */
public final /* synthetic */ class C20824Aa1 implements B92 {
    public final /* synthetic */ C20284AEs A00;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A01;
    public final /* synthetic */ AnonymousClass92s A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public final void C7M(AnonymousClass9NG r7) {
        AnonymousClass92s r5 = this.A02;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        C20284AEs aEs = this.A00;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        if (paymentBottomSheet.A1b()) {
            r5.A5l(aEs, r7.A01, r7.A00, paymentBottomSheet);
        }
        WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment.A01;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A01();
        }
    }

    public /* synthetic */ C20824Aa1(C20284AEs aEs, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, AnonymousClass92s r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A03 = paymentBottomSheet;
        this.A00 = aEs;
        this.A01 = hybridPaymentMethodPickerFragment;
    }
}
