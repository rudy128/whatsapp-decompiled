package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.AaZ  reason: case insensitive filesystem */
public class C20857AaZ implements BBZ {
    public final /* synthetic */ AnonymousClass1KN A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ ADQ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C20857AaZ(AnonymousClass1KN r1, BrazilPaymentActivity brazilPaymentActivity, ADQ adq, String str, String str2) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = adq;
    }

    public void Bsl() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        brazilPaymentActivity.A05.A0M(brazilPaymentActivity.getString(2131893930), brazilPaymentActivity.getString(2131893867), 1);
    }

    public void Bvq() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        AnonymousClass1KN r1 = this.A00;
        boolean z = brazilPaymentActivity.A0m;
        brazilPaymentActivity.A4r(r1, this.A02, this.A03, this.A04, z);
    }
}
