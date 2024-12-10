package com.whatsapp.payments.ui;

import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass921;
import X.C137116uw;
import X.C63662tU;
import X.C63932tv;

public final class BrazilPaymentSettingsActivity extends AnonymousClass921 {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(r2);
            this.A01 = AnonymousClass3Ma.A0q(r2);
            this.A02 = AnonymousClass8BT.A0h(r2);
        }
    }

    public BrazilPaymentSettingsActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 26);
    }

    public BrazilPaymentSettingsActivity() {
        this(0);
    }
}
