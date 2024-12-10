package X;

import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel;
import java.util.Calendar;

/* renamed from: X.AaD  reason: case insensitive filesystem */
public class C20835AaD implements B97 {
    public final /* synthetic */ BrazilOrderDetailsActivity A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public C20835AaD(BrazilOrderDetailsActivity brazilOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = brazilOrderDetailsActivity;
        this.A01 = paymentBottomSheet;
    }

    public void BqA(Calendar calendar) {
        BrazilPaymentComplianceViewModel brazilPaymentComplianceViewModel = this.A00.A0D;
        brazilPaymentComplianceViewModel.A02.A02(new C20788AYr(new C20787AYq(this, 0), brazilPaymentComplianceViewModel), "p2m-lite-buyer-check", (String) null, calendar.get(1), calendar.get(2), AnonymousClass8BT.A02(calendar));
    }
}
