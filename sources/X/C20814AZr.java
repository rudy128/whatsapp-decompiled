package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZr  reason: case insensitive filesystem */
public final /* synthetic */ class C20814AZr implements C22467B8z {
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;
    public final /* synthetic */ boolean A02;

    public final void BqC(String str) {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A01;
        boolean z = this.A02;
        paymentBottomSheet.A28();
        String str2 = str;
        if (z || indiaUpiPaymentSettingsFragment.A0G.A0S()) {
            IndiaUpiPaymentSettingsFragment.A0B(indiaUpiPaymentSettingsFragment, "settingsAddPayment", str2, 2, 5, z, true);
        } else {
            IndiaUpiPaymentSettingsFragment.A0A(indiaUpiPaymentSettingsFragment, str);
        }
    }

    public /* synthetic */ C20814AZr(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, PaymentBottomSheet paymentBottomSheet, boolean z) {
        this.A00 = indiaUpiPaymentSettingsFragment;
        this.A01 = paymentBottomSheet;
        this.A02 = z;
    }
}
