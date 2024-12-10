package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

public class AOG implements C72073Kn {
    public final int A00;
    public final Object A01;

    public AOG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C3p(boolean z) {
        if (this.A00 != 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A01;
            if (z) {
                IndiaUpiSendPaymentActivity.A0r(indiaUpiSendPaymentActivity);
            } else {
                AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, 22);
            }
        } else {
            BB6 bb6 = (BB6) this.A01;
            if (z) {
                bb6.onSuccess();
            } else {
                bb6.Bti();
            }
        }
    }
}
