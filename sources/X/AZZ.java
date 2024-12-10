package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

public class AZZ implements BBP {
    public final /* synthetic */ C20274AEh A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ C20284AEs A02;
    public final /* synthetic */ AnonymousClass34B A03;
    public final /* synthetic */ PinBottomSheetDialogFragment A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public AZZ(C20274AEh aEh, AnonymousClass1KN r2, C20284AEs aEs, AnonymousClass34B r4, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A04 = pinBottomSheetDialogFragment;
        this.A01 = r2;
        this.A02 = aEs;
        this.A07 = str;
        this.A00 = aEh;
        this.A06 = str2;
        this.A03 = r4;
    }

    public void BpL(String str) {
        this.A04.A2N();
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        int intValue = this.A01.A00.scaleByPowerOfTen(3).intValue();
        AnonymousClass1KJ r3 = AnonymousClass1KL.A0A;
        C17960vV.A07(r3);
        ARR A002 = C196669vR.A00(r3, 1000, (long) intValue);
        C198809yw A4n = brazilPaymentActivity.A4n(this.A00, this.A02, A002, this.A07, "payment_pin", brazilPaymentActivity.A0k);
        AYY ayy = new AYY(this);
        C17890vO.A0v(A4n.A0R, A4n, 44);
        AZ2 A012 = A4n.A0I.A01("FB", "PIN");
        String str2 = str;
        if (A012 != null) {
            C198959zC r5 = new C198959zC(A012);
            A4n.A0G.A00(new C20770AXz(ayy, A4n, r5, (Object) null, 1), r5, str);
            return;
        }
        A4n.A0H.A00(new C20777AYg(ayy, A4n, ayy.A00.A05.A0O.A02.A00("get-provider-key"), str2, 1), "FB");
    }

    public void Buu() {
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        AnonymousClass9Y7 r3 = new AnonymousClass9Y7(brazilPaymentActivity);
        C17890vO.A0u(new C177799Aq(r3, brazilPaymentActivity.A0Q), brazilPaymentActivity.A05);
    }
}
