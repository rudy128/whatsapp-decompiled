package X;

import com.whatsapp.payments.ui.MessageWithLinkWebViewActivity;
import com.whatsapp.payments.ui.PaymentWebViewActivity;

/* renamed from: X.93T  reason: invalid class name */
public abstract class AnonymousClass93T extends PaymentWebViewActivity {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            MessageWithLinkWebViewActivity messageWithLinkWebViewActivity = (MessageWithLinkWebViewActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A01 = C137116uw.A01(r4, messageWithLinkWebViewActivity);
            C63932tv.A02(A01, messageWithLinkWebViewActivity);
            AnonymousClass10G r1 = A01.A00;
            C63932tv.A01(A01, r1, messageWithLinkWebViewActivity);
            C63662tU.A00(A01, r1, messageWithLinkWebViewActivity, r1.A5A);
            C114925sD.A03(r4, A01, r1, messageWithLinkWebViewActivity);
            messageWithLinkWebViewActivity.A01 = AnonymousClass10E.A8r(A01);
            messageWithLinkWebViewActivity.A00 = (AnonymousClass1RK) A01.A2R.get();
            messageWithLinkWebViewActivity.A06 = AnonymousClass3Ma.A0s(A01);
            messageWithLinkWebViewActivity.A05 = (A19) A01.AZd.get();
            messageWithLinkWebViewActivity.A03 = AnonymousClass3MZ.A0z(A01);
            messageWithLinkWebViewActivity.A07 = r1.AEh();
            messageWithLinkWebViewActivity.A02 = AnonymousClass3MY.A0Z(A01);
            messageWithLinkWebViewActivity.A08 = (AnonymousClass19K) A01.AC4.get();
        }
    }

    public AnonymousClass93T() {
        AGD.A00(this, 37);
    }
}
