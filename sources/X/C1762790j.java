package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;

/* renamed from: X.90j  reason: invalid class name and case insensitive filesystem */
public abstract class C1762790j extends BrazilPaymentActivity {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            BrazilSmbPaymentActivity brazilSmbPaymentActivity = (BrazilSmbPaymentActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A01 = C137116uw.A01(r4, brazilSmbPaymentActivity);
            C63932tv.A02(A01, brazilSmbPaymentActivity);
            AnonymousClass10G r1 = A01.A00;
            C63932tv.A01(A01, r1, brazilSmbPaymentActivity);
            C63662tU.A00(A01, r1, brazilSmbPaymentActivity, r1.A5A);
            AnonymousClass91U.A1V(A01, r1, brazilSmbPaymentActivity);
            AnonymousClass91U.A1Q(r4, A01, r1, brazilSmbPaymentActivity, A01.A7z);
            AnonymousClass91U.A1R(r4, A01, r1, brazilSmbPaymentActivity, AnonymousClass91U.A1L(A01, AnonymousClass8BU.A0E(A01), brazilSmbPaymentActivity));
            brazilSmbPaymentActivity.A0B = (C19944A0b) r1.A70.get();
            AnonymousClass91U.A1U(A01, r1, AnonymousClass8BU.A0Q(A01), brazilSmbPaymentActivity);
            AnonymousClass91U.A1X(A01, brazilSmbPaymentActivity);
            brazilSmbPaymentActivity.A0a = AnonymousClass3Ma.A0r(A01);
            AnonymousClass91U.A1S(r4, A01, r1, brazilSmbPaymentActivity, r1.AER);
            brazilSmbPaymentActivity.A01 = C000200d.A00(A01.A4Z);
            brazilSmbPaymentActivity.A00 = AnonymousClass3MY.A0Z(A01);
        }
    }

    public C1762790j() {
        AGC.A00(this, 29);
    }
}
