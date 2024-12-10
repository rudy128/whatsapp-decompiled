package com.whatsapp.payments.ui;

import X.AFP;
import X.AGD;
import X.ALX;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C003401n;
import X.C137116uw;
import X.C191339mR;
import X.C63662tU;
import X.C63932tv;
import X.C88554a7;
import android.os.Bundle;
import android.view.View;

public final class IndiaUpiInteropSendToUpiActivity extends AnonymousClass91T {
    public ALX A00;
    public C191339mR A01;
    public boolean A02;

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            this.A01 = (C191339mR) r1.AEX.get();
            this.A00 = (ALX) r2.AcF.get();
        }
    }

    public IndiaUpiInteropSendToUpiActivity(int i) {
        this.A02 = false;
        AGD.A00(this, 6);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625627);
        C003401n A0K = AnonymousClass3MY.A0K(this, AnonymousClass3Ma.A0G(this));
        if (A0K != null) {
            AnonymousClass8BU.A17(A0K, 2131892489);
        }
        View findViewById = findViewById(2131435198);
        C88554a7.A04(findViewById, 2131232278, 0, 2131231558, 2131895715, 0);
        AFP.A00(findViewById, this, 4);
    }

    public IndiaUpiInteropSendToUpiActivity() {
        this(0);
    }
}
