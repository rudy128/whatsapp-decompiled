package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.AZp  reason: case insensitive filesystem */
public class C20812AZp implements C22467B8z {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20812AZp(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BqC(String str) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                AnonymousClass3MW.A1V(this.A02);
                ((AnonymousClass91R) obj).A5b(str);
                return;
            case 1:
                AnonymousClass3MW.A1V(this.A02);
                ((C20831Aa9) obj).A00.A5b(str);
                return;
            default:
                AnonymousClass3MW.A1V(this.A02);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C20865Aah) obj).A00;
                indiaUpiSendPaymentActivity.A5O(indiaUpiSendPaymentActivity, str, true);
                return;
        }
    }
}
