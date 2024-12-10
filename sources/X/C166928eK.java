package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.8eK  reason: invalid class name and case insensitive filesystem */
public abstract class C166928eK extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = (PaymentTransactionHistoryActivity) this;
            AnonymousClass10E A01 = C137116uw.A01((AnonymousClass1K1) AnonymousClass3MX.A0R(this), paymentTransactionHistoryActivity);
            C63932tv.A02(A01, paymentTransactionHistoryActivity);
            AnonymousClass10G r1 = A01.A00;
            C63932tv.A00(A01, r1, r1, paymentTransactionHistoryActivity);
            C63662tU.A00(A01, r1, paymentTransactionHistoryActivity, r1.A5A);
            A03(A01, r1, paymentTransactionHistoryActivity, A01.ABz);
        }
    }

    public C166928eK() {
        AGE.A00(this, 0);
    }

    public static void A03(AnonymousClass10E r1, AnonymousClass10G r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, C18140vp r4) {
        paymentTransactionHistoryActivity.A04 = (C18000vb) r4.get();
        paymentTransactionHistoryActivity.A06 = (AnonymousClass1QB) r1.A4T.get();
        paymentTransactionHistoryActivity.A0A = (AnonymousClass1QS) r1.A8J.get();
        paymentTransactionHistoryActivity.A09 = (AnonymousClass1QO) r1.A8G.get();
        paymentTransactionHistoryActivity.A08 = (C33301ib) r1.A6m.get();
        paymentTransactionHistoryActivity.A0H = C000200d.A00(r1.A74);
        paymentTransactionHistoryActivity.A0B = (AQF) r2.A3k.get();
        paymentTransactionHistoryActivity.A0J = C000200d.A00(r1.A8C);
        paymentTransactionHistoryActivity.A0F = (AnonymousClass1R2) r1.A8L.get();
        paymentTransactionHistoryActivity.A05 = (AnonymousClass122) r1.A2y.get();
        paymentTransactionHistoryActivity.A0I = C000200d.A00(r1.A86);
        paymentTransactionHistoryActivity.A0D = (C193179pf) r2.AEg.get();
    }
}
