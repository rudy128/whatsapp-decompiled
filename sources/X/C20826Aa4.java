package X;

import com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.Aa4  reason: case insensitive filesystem */
public class C20826Aa4 implements BBR {
    public final /* synthetic */ BrazilHostedPaymentPageBottomSheet A00;
    public final /* synthetic */ BrazilOrderDetailsActivity A01;
    public final /* synthetic */ AnonymousClass206 A02;

    public C20826Aa4(BrazilHostedPaymentPageBottomSheet brazilHostedPaymentPageBottomSheet, BrazilOrderDetailsActivity brazilOrderDetailsActivity, AnonymousClass206 r3) {
        this.A01 = brazilOrderDetailsActivity;
        this.A02 = r3;
        this.A00 = brazilHostedPaymentPageBottomSheet;
    }

    public void C96() {
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        C21426Ajt.A00(brazilOrderDetailsActivity.A05, this, 16);
        C20098A7b.A02(this.A00, brazilOrderDetailsActivity.getSupportFragmentManager());
    }

    public void C97(AW0 aw0) {
        this.A01.A05.A0J(new C21435Ak2(this, this.A02, aw0, 35));
    }
}
