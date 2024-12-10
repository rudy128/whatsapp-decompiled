package X;

import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.Aa0  reason: case insensitive filesystem */
public class C20823Aa0 implements B92 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20823Aa0(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void C7M(AnonymousClass9NG r7) {
        PaymentBottomSheet paymentBottomSheet;
        if (this.A00 != 0) {
            AnonymousClass92u r4 = (AnonymousClass92u) this.A01;
            PaymentBottomSheet paymentBottomSheet2 = (PaymentBottomSheet) this.A02;
            C20284AEs aEs = (C20284AEs) this.A03;
            if (paymentBottomSheet2.A1b()) {
                r4.A5l(aEs, r7.A01, r7.A00, paymentBottomSheet2);
                return;
            }
            return;
        }
        AnonymousClass92u r5 = (AnonymousClass92u) this.A01;
        PaymentBottomSheet paymentBottomSheet3 = (PaymentBottomSheet) this.A02;
        AnonymousClass8pQ r3 = (AnonymousClass8pQ) this.A03;
        if (paymentBottomSheet3 == null) {
            r5.A5p(false);
        }
        ARR arr = r7.A01;
        ARR arr2 = r7.A00;
        if (paymentBottomSheet3 != null) {
            paymentBottomSheet = paymentBottomSheet3;
        } else {
            paymentBottomSheet = new PaymentBottomSheet();
        }
        ConfirmPaymentFragment A5g = r5.A5g(r3, arr, arr2, paymentBottomSheet);
        if (paymentBottomSheet3 != null) {
            paymentBottomSheet3.A2L(A5g);
            return;
        }
        paymentBottomSheet.A02 = A5g;
        r5.CMl(paymentBottomSheet);
        r5.A5Q(paymentBottomSheet);
    }
}
