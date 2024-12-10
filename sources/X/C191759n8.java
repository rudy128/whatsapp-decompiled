package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9n8  reason: invalid class name and case insensitive filesystem */
public class C191759n8 {
    public IndiaUpiSendPaymentToVpaFragment A00;
    public PaymentBottomSheet A01;
    public final Activity A02;
    public final Context A03;
    public final AnonymousClass1FR A04;
    public final ALX A05;
    public final C191339mR A06;
    public final String A07;
    public final boolean A08;

    public void A00(PaymentBottomSheet paymentBottomSheet) {
        IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = this.A00;
        if (indiaUpiSendPaymentToVpaFragment == null) {
            String str = this.A07;
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("extra_payment_handle", (Parcelable) null);
            A0D.putString("extra_referral_screen", str);
            indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
            indiaUpiSendPaymentToVpaFragment.A1R(A0D);
            this.A00 = indiaUpiSendPaymentToVpaFragment;
        }
        indiaUpiSendPaymentToVpaFragment.A0G = this;
        if (paymentBottomSheet != null) {
            this.A01 = paymentBottomSheet;
            paymentBottomSheet.A2L(indiaUpiSendPaymentToVpaFragment);
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A01 = paymentBottomSheet2;
        paymentBottomSheet2.A02 = this.A00;
        this.A04.CMl(paymentBottomSheet2);
    }

    public C191759n8(Activity activity, AnonymousClass1FR r2, ALX alx, C191339mR r4, String str, boolean z) {
        this.A02 = activity;
        this.A03 = activity;
        this.A07 = str;
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = alx;
        this.A08 = z;
    }
}
