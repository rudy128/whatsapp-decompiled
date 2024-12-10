package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZw  reason: case insensitive filesystem */
public final /* synthetic */ class C20819AZw implements B91 {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ AnonymousClass92s A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public final void Bss(A7B a7b) {
        AnonymousClass92s r4 = this.A01;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        ARR arr = this.A00;
        if (paymentBottomSheet == null) {
            r4.A5p(false);
        }
        if (!AnonymousClass8BX.A1R(r4, a7b) || a7b.A00 != 21034) {
            r4.BhR(r4.A5s(a7b));
            return;
        }
        r4.A5S(r4.A0B, arr, (PaymentBottomSheet) null, AnonymousClass000.A0i());
    }

    public /* synthetic */ C20819AZw(ARR arr, AnonymousClass92s r2, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = r2;
        this.A02 = paymentBottomSheet;
        this.A00 = arr;
    }
}
