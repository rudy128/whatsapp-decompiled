package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.AaT  reason: case insensitive filesystem */
public class C20851AaT implements BDv {
    public final /* synthetic */ C20808AZl A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public C20851AaT(C20808AZl aZl, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = aZl;
        this.A01 = paymentBottomSheet;
    }

    public void BIr() {
        PaymentBottomSheet paymentBottomSheet = this.A01;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A28();
        }
    }

    public void By9(AnonymousClass34B r4) {
        String str;
        C20808AZl aZl = this.A00;
        AnonymousClass91R r1 = aZl.A04;
        r1.A09 = r4;
        if (r4 == null) {
            str = null;
        } else {
            str = r4.A0N.A0D;
        }
        r1.A0W = str;
        r1.A5P(this.A01);
        BIr();
        r1.A5R(aZl.A01);
    }

    public void CEc() {
        PaymentView paymentView = this.A00.A04.A0J;
        if (paymentView != null) {
            paymentView.A0C();
        }
    }

    public void CEx() {
        this.A00.A04.CEx();
    }

    public void CF3() {
        PaymentView paymentView = this.A00.A04.A0J;
        if (paymentView != null) {
            paymentView.A0D();
        }
    }
}
