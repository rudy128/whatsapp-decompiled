package com.whatsapp.privacy.checkup;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass44k;
import X.C26261Rl;
import X.C62332rE;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;

public final class PrivacyCheckupHomeActivity extends AnonymousClass44k {
    public boolean A00;

    public PrivacyCheckupHomeActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = (C62332rE) A0L.A70.get();
            this.A00 = (C26261Rl) A0L.A8j.get();
        }
    }

    public PrivacyCheckupHomeActivity(int i) {
        this.A00 = false;
        C91024f1.A00(this, 18);
    }
}
