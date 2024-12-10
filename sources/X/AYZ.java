package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

public class AYZ implements C22543BCa {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C20274AEh A01;
    public final /* synthetic */ AnonymousClass1KN A02;
    public final /* synthetic */ C20284AEs A03;
    public final /* synthetic */ AnonymousClass34B A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public AYZ(FingerprintBottomSheet fingerprintBottomSheet, C20274AEh aEh, AnonymousClass1KN r3, C20284AEs aEs, AnonymousClass34B r5, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A03 = aEs;
        this.A02 = r3;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = r5;
        this.A01 = aEh;
        this.A00 = fingerprintBottomSheet;
    }

    public void Bi3(A7B a7b, Integer num) {
        this.A05.A0O.A02.A01(a7b, num, "pay-precheck");
    }

    public Integer Bi6() {
        return this.A05.A0O.A02.A00("pay-precheck");
    }

    public void BiO(A7B a7b, Integer num) {
        this.A05.A0O.A02.A01(a7b, num, "get-provider-key");
    }

    public void BiP(Integer num) {
        this.A05.A0O.A04(num, "get-provider-key");
    }
}
