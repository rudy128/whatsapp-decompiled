package com.whatsapp.payments.ui;

import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.C137116uw;
import X.C189759jn;
import X.C20087A6p;
import X.C20112A7u;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.net.Uri;
import android.os.Bundle;

public class BrazilViralityLinkVerifierActivity extends ViralityLinkVerifierActivity {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A06 = C72453Mb.A0d(r2);
            this.A05 = AnonymousClass8BV.A0A(r2);
            this.A0E = AnonymousClass8BT.A0V(r2);
            this.A0C = AnonymousClass3MZ.A0z(r2);
            this.A09 = AnonymousClass8BU.A0Q(r2);
            this.A0F = (C189759jn) r2.AdV.get();
            this.A0I = AnonymousClass8BT.A0f(r2);
            this.A0A = AnonymousClass8BU.A0R(r2);
            this.A0B = AnonymousClass3Ma.A0q(r2);
        }
    }

    public BrazilViralityLinkVerifierActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 30);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri A06 = AnonymousClass8BT.A06(this);
        C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
        A03.A07("campaign_id", A06.getLastPathSegment());
        C20087A6p.A03(A03, this.A0C.A05("FBPAY").BRb(), "deeplink", (String) null);
    }

    public BrazilViralityLinkVerifierActivity() {
        this(0);
    }
}
