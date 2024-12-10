package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZs  reason: case insensitive filesystem */
public class C20815AZs implements B90 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20815AZs(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BpS(PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass92u r1 = (AnonymousClass92u) this.A01;
        ARR arr = (ARR) this.A02;
        if (r1 instanceof AnonymousClass92s) {
            C21422Ajp ajp = new C21422Ajp(44);
            r1.A5n(arr, new C20815AZs(arr, r1, 1), new C20817AZu(), paymentBottomSheet, ajp);
        }
    }
}
