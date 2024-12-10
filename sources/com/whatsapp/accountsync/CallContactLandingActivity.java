package com.whatsapp.accountsync;

import X.AGB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1VP;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.C000200d;
import X.C137116uw;
import X.C166708dq;
import X.C18030ve;
import X.C19890zB;
import X.C26911Ty;
import X.C33621j7;
import X.C63662tU;
import X.C63932tv;
import X.C678831f;

public class CallContactLandingActivity extends ProfileActivity {
    public C26911Ty A00;
    public AnonymousClass1VP A01;
    public C678831f A02;
    public C18030ve A03;
    public AnonymousClass00H A04;
    public boolean A05;

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A01 = AnonymousClass3MY.A0Z(r2);
            this.A00 = AnonymousClass10G.A51(r1);
            this.A01 = AnonymousClass3MY.A0N(r2);
            this.A08 = AnonymousClass3MY.A0Z(r2);
            this.A00 = C19890zB.A00;
            this.A04 = (C33621j7) r2.A0g.get();
            C166708dq.A03(r2, this, AnonymousClass10E.A4z(r2));
            this.A01 = AnonymousClass3MZ.A0W(r2);
            this.A04 = C000200d.A00(r2.ABV);
            this.A03 = AnonymousClass10E.A8r(r2);
            this.A00 = AnonymousClass8BT.A0D(r2);
            this.A02 = (C678831f) r1.A10.get();
        }
    }

    public CallContactLandingActivity(int i) {
        this.A05 = false;
        AGB.A00(this, 8);
    }

    public CallContactLandingActivity() {
        this(0);
    }
}
