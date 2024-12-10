package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZz  reason: case insensitive filesystem */
public class C20822AZz implements B92 {
    public final int A00;
    public final Object A01;

    public C20822AZz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C7M(AnonymousClass9NG r6) {
        AnonymousClass1KN r0;
        AnonymousClass1KN r02;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass91R r4 = (AnonymousClass91R) obj;
            r4.CEx();
            ARR arr = r6.A01;
            ARR arr2 = r6.A00;
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            AnonymousClass1KN r2 = arr.A02;
            if (arr2 != null) {
                r02 = arr2.A02;
            } else {
                r02 = null;
            }
            paymentBottomSheet.A02 = r4.A5H(r2, r02, (AnonymousClass1KN) null, paymentBottomSheet);
            r4.CMl(paymentBottomSheet);
            r4.A5Q(paymentBottomSheet);
            return;
        }
        AnonymousClass92u r42 = (AnonymousClass92u) obj;
        r42.A5p(false);
        ARR arr3 = r6.A01;
        ARR arr4 = r6.A00;
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        AnonymousClass1KN r22 = arr3.A02;
        if (arr4 != null) {
            r0 = arr4.A02;
        } else {
            r0 = null;
        }
        paymentBottomSheet2.A02 = r42.A5H(r22, r0, (AnonymousClass1KN) null, paymentBottomSheet2);
        r42.CMl(paymentBottomSheet2);
        r42.A5Q(paymentBottomSheet2);
    }
}
