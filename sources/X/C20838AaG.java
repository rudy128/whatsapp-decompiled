package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AaG  reason: case insensitive filesystem */
public class C20838AaG implements BBU {
    public final /* synthetic */ B90 A00;
    public final /* synthetic */ AnonymousClass92s A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public C20838AaG(B90 b90, AnonymousClass92s r2, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2) {
        this.A01 = r2;
        this.A00 = b90;
        this.A02 = paymentBottomSheet;
        this.A03 = paymentBottomSheet2;
    }

    public void Bnj() {
        PaymentBottomSheet paymentBottomSheet = this.A02;
        AnonymousClass1GP A1E = paymentBottomSheet.A1E();
        int A0K = A1E.A0K();
        for (int i = 0; i < A0K; i++) {
            A1E.A0b();
        }
        paymentBottomSheet.A2K();
    }

    public void Bq9(PaymentBottomSheet paymentBottomSheet, String str) {
        AnonymousClass92s r4 = this.A01;
        r4.A03.A03(new C20792AYv(this, 1), str, "p2m-in-buyer-check");
        r4.BiK((C20112A7u) null, 1, C17880vN.A0l(), "enter_name");
    }
}
