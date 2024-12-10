package com.whatsapp.payments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass44O;
import X.AnonymousClass44P;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;

public class BrazilPaymentIntegrityAppealActivity extends BrazilPaymentContactSupportActivity {
    public AnonymousClass44P A00;
    public boolean A01;

    public BrazilPaymentIntegrityAppealActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = (AnonymousClass44O) A0K.A0I.get();
            this.A00 = (AnonymousClass44P) A0K.A0K.get();
        }
    }

    public BrazilPaymentIntegrityAppealActivity(int i) {
        this.A01 = false;
        C91024f1.A00(this, 10);
    }
}
