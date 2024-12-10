package X;

import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

public class AH6 implements C24051Ir {
    public final /* synthetic */ C175828zL A00;
    public final /* synthetic */ C175848zN A01;
    public final /* synthetic */ IndiaUpiMandatePaymentActivity A02;

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public AH6(C175828zL r1, C175848zN r2, IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity) {
        this.A02 = indiaUpiMandatePaymentActivity;
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = this.A02;
        AnonymousClass9V0 r4 = indiaUpiMandatePaymentActivity.A01;
        AW0 aw0 = ((ADI) indiaUpiMandatePaymentActivity.getIntent().getParcelableExtra("payment_transaction_info")).A00;
        C175838zM r6 = indiaUpiMandatePaymentActivity.A07;
        C175848zN r5 = this.A01;
        C175828zL r3 = this.A00;
        C175758zE r2 = indiaUpiMandatePaymentActivity.A06;
        int i = indiaUpiMandatePaymentActivity.A00;
        String A012 = AXS.A01(indiaUpiMandatePaymentActivity);
        AnonymousClass10E r42 = r4.A00.A01;
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r42);
        AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r42);
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r42);
        AnonymousClass11S A17 = AnonymousClass10E.A17(r42);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r42);
        AnonymousClass1QS A0z = AnonymousClass3MZ.A0z(r42);
        AnonymousClass1QD A0Q = AnonymousClass8BU.A0Q(r42);
        AZ6 A0T = AnonymousClass8BU.A0T(r42);
        C175848zN r20 = r5;
        C175838zM r21 = r6;
        C175828zL r18 = r3;
        C175758zE r19 = r2;
        return new AnonymousClass8GL(A12, A17, A6O, A0l, (AnonymousClass1KH) r42.A94.get(), aw0, AnonymousClass8BT.A0Q(r42), A0Q, (AnonymousClass2L2) r42.A8C.get(), A0z, r18, r19, r20, r21, A0T, AL1, A012, i);
    }
}
