package X;

import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel;

/* renamed from: X.AaF  reason: case insensitive filesystem */
public class C20837AaF implements BBU {
    public final /* synthetic */ BrazilOrderDetailsActivity A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public C20837AaF(BrazilOrderDetailsActivity brazilOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = brazilOrderDetailsActivity;
        this.A01 = paymentBottomSheet;
    }

    public void Bnj() {
        PaymentBottomSheet paymentBottomSheet = this.A01;
        AnonymousClass1GP A1E = paymentBottomSheet.A1E();
        int A0K = A1E.A0K();
        for (int i = 0; i < A0K; i++) {
            A1E.A0b();
        }
        paymentBottomSheet.A2K();
    }

    public void Bq9(PaymentBottomSheet paymentBottomSheet, String str) {
        BrazilPaymentComplianceViewModel brazilPaymentComplianceViewModel = this.A00.A0D;
        C20792AYv aYv = new C20792AYv(this, 0);
        C18070vi.A0d(str, 1);
        brazilPaymentComplianceViewModel.A02.A03(new C20793AYw(brazilPaymentComplianceViewModel, aYv, 1), str, "p2m-lite-buyer-check");
    }
}
