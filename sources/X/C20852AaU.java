package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.AaU  reason: case insensitive filesystem */
public class C20852AaU implements BDv {
    public final /* synthetic */ C20274AEh A00;
    public final /* synthetic */ AnonymousClass8pI A01;
    public final /* synthetic */ C20284AEs A02;
    public final /* synthetic */ C20809AZm A03;
    public final /* synthetic */ PaymentBottomSheet A04;

    public C20852AaU(C20274AEh aEh, AnonymousClass8pI r2, C20284AEs aEs, C20809AZm aZm, PaymentBottomSheet paymentBottomSheet) {
        this.A03 = aZm;
        this.A04 = paymentBottomSheet;
        this.A02 = aEs;
        this.A01 = r2;
        this.A00 = aEh;
    }

    public void BIr() {
        this.A03.A05.A28();
    }

    public void By9(AnonymousClass34B r7) {
        C20809AZm aZm = this.A03;
        PaymentBottomSheet paymentBottomSheet = this.A04;
        C20284AEs aEs = this.A02;
        C20809AZm.A00(this.A00, this.A01, aEs, r7, aZm, paymentBottomSheet);
    }

    public void CEc() {
        PaymentView paymentView = this.A03.A03.A0W;
        if (paymentView != null) {
            paymentView.A0C();
        }
    }

    public void CEx() {
        this.A03.A03.CEx();
    }

    public void CF3() {
        PaymentView paymentView = this.A03.A03.A0W;
        if (paymentView != null) {
            paymentView.A0D();
        }
    }
}
