package com.whatsapp.payments.ui;

import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.C137116uw;
import X.C166928eK;
import X.C63662tU;
import X.C63932tv;

public class IndiaPaymentTransactionHistoryActivity extends PaymentTransactionHistoryActivity {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C166928eK.A03(r2, r1, this, r2.ABz);
        }
    }

    public IndiaPaymentTransactionHistoryActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 37);
    }

    public IndiaPaymentTransactionHistoryActivity() {
        this(0);
    }
}
