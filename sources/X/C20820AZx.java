package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZx  reason: case insensitive filesystem */
public final /* synthetic */ class C20820AZx implements B91 {
    public final /* synthetic */ C20284AEs A00;
    public final /* synthetic */ ARR A01;
    public final /* synthetic */ AnonymousClass92s A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public final void Bss(A7B a7b) {
        AnonymousClass92s r4 = this.A02;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        ARR arr = this.A01;
        C20284AEs aEs = this.A00;
        paymentBottomSheet.A28();
        if (!AnonymousClass8BX.A1R(r4, a7b) || a7b.A00 != 21034) {
            r4.BhR(r4.A5s(a7b));
        } else {
            r4.A5S(aEs, arr, (PaymentBottomSheet) null, AnonymousClass000.A0i());
        }
    }

    public /* synthetic */ C20820AZx(C20284AEs aEs, ARR arr, AnonymousClass92s r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A03 = paymentBottomSheet;
        this.A01 = arr;
        this.A00 = aEs;
    }
}
