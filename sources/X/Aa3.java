package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

public final /* synthetic */ class Aa3 implements B94 {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void BuI(C20284AEs aEs) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        if (aEs != null) {
            Intent A09 = AnonymousClass8BW.A09(indiaUpiQrTabActivity, aEs, IndiaUpiInternationalActivationActivity.class);
            A09.putExtra("INTERNATIONAL_QR_SOURCE", str);
            A09.putExtra("EXTRA_INTERNATIONAL_QR_ACTIVATION_FROM_SCAN", true);
            A09.putExtra("INTERNATIONAL_QR_PAYLOAD", AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str2, "invoiceUrl"));
            indiaUpiQrTabActivity.CNh(A09, 1019);
        }
    }

    public /* synthetic */ Aa3(IndiaUpiQrTabActivity indiaUpiQrTabActivity, String str, String str2) {
        this.A00 = indiaUpiQrTabActivity;
        this.A01 = str;
        this.A02 = str2;
    }
}
