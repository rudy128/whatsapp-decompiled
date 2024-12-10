package com.whatsapp.payments.ui;

import X.AFP;
import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass91L;
import X.AnonymousClass91U;
import X.C003401n;
import X.C137116uw;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;

public final class IndiaUpiProvideMoreInfoActivity extends AnonymousClass91L {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
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
            this.A00 = AnonymousClass8BT.A0I(r2);
        }
    }

    public IndiaUpiProvideMoreInfoActivity(int i) {
        this.A00 = false;
        AGD.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625604);
        C003401n A1J = AnonymousClass91U.A1J(this);
        if (A1J != null) {
            AnonymousClass8BV.A17(A1J, getString(2131893788));
        }
        AFP.A00(AnonymousClass3MY.A0H(this, 2131427434), this, 41);
    }

    public IndiaUpiProvideMoreInfoActivity() {
        this(0);
    }
}
