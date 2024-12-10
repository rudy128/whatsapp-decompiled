package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;

/* renamed from: X.9BL  reason: invalid class name */
public class AnonymousClass9BL extends A34 {
    public final /* synthetic */ AnonymousClass1KJ A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ C20284AEs A02;
    public final /* synthetic */ AnonymousClass34B A03;
    public final /* synthetic */ C170308pe A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ AnonymousClass210 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public AnonymousClass9BL(AnonymousClass1KJ r1, AnonymousClass1KN r2, C20284AEs aEs, AnonymousClass34B r4, C170308pe r5, BrazilPaymentActivity brazilPaymentActivity, AnonymousClass210 r7, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = aEs;
        this.A04 = r5;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = r7;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AW0 aw0 = (AW0) obj;
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        brazilPaymentActivity.A0O.Bix("send_payment", brazilPaymentActivity.A00);
        C17880vN.A0V(brazilPaymentActivity.A0i).registerObserver(brazilPaymentActivity.A0p);
        brazilPaymentActivity.A0n = true;
        if (!brazilPaymentActivity.A11 || aw0 == null) {
            brazilPaymentActivity.A4d();
            return;
        }
        Intent A072 = AnonymousClass8BR.A07(brazilPaymentActivity, BrazilPaymentTransactionDetailActivity.class);
        AnonymousClass4aU.A00(A072, AnonymousClass205.A01(aw0.A0C, aw0.A0L, aw0.A0Q));
        A072.putExtra("extra_transaction_id", aw0.A0K);
        A072.putExtra("referral_screen", brazilPaymentActivity.A0j);
        A072.setFlags(67108864);
        A072.putExtra("extra_action_bar_display_close", true);
        brazilPaymentActivity.A3q(A072, true);
        brazilPaymentActivity.CEx();
    }
}
