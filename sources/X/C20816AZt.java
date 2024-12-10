package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZt  reason: case insensitive filesystem */
public class C20816AZt implements B90 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20816AZt(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void BpS(PaymentBottomSheet paymentBottomSheet) {
        int i = this.A00;
        Object obj = this.A01;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (1 - i != 0) {
            AnonymousClass92s r2 = (AnonymousClass92s) obj;
            ARR arr = (ARR) this.A02;
            C20284AEs aEs = (C20284AEs) this.A03;
            C20823Aa0 aa0 = new C20823Aa0(aEs, r2, paymentBottomSheet, 1);
            r2.A5t(arr, new C20816AZt(aEs, arr, r2, 0), new C20820AZx(aEs, arr, r2, paymentBottomSheet), aa0, paymentBottomSheet2, new C21422Ajp(43));
            return;
        }
        ((AnonymousClass92u) obj).A5j((AnonymousClass8pQ) this.A03, (ARR) this.A02, paymentBottomSheet);
    }
}
