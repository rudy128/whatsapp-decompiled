package com.whatsapp.payments.ui;

import X.A27;
import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1QJ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6C1;
import X.AnonymousClass6MW;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8G9;
import X.C108965cb;
import X.C132216mP;
import X.C137116uw;
import X.C1763191m;
import X.C188919iD;
import X.C20751AXg;
import X.C21448AkF;
import X.C42011xT;
import X.C63662tU;
import X.C63932tv;
import android.content.Intent;
import android.view.ViewGroup;

public class BrazilMerchantDetailsListActivity extends C1763191m {
    public C132216mP A00;
    public AnonymousClass181 A01;
    public AnonymousClass1D9 A02;
    public AnonymousClass1LU A03;
    public C20751AXg A04;
    public AnonymousClass1QJ A05;
    public A27 A06;
    public AnonymousClass6MW A07;
    public AnonymousClass8G9 A08;
    public C188919iD A09;
    public boolean A0A;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            AnonymousClass8G9 r2 = this.A08;
            C21448AkF.A00(r2.A0P, r2, 2);
        }
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MZ.A0z(r2);
            this.A03 = AnonymousClass3MY.A0Z(r2);
            this.A01 = C108965cb.A0H(r2);
            this.A00 = AnonymousClass8BT.A0A(r1);
            this.A02 = AnonymousClass8BT.A0J(r2);
            this.A04 = AnonymousClass1K1.A1M(A002);
            this.A05 = AnonymousClass8BV.A0G(r2);
            this.A06 = AnonymousClass8BU.A0S(r2);
            this.A09 = (C188919iD) r1.A7F.get();
        }
    }

    public C42011xT A4b(ViewGroup viewGroup, int i) {
        if (i != 302) {
            return super.A4b(viewGroup, i);
        }
        return new AnonymousClass6C1(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626021));
    }

    public BrazilMerchantDetailsListActivity(int i) {
        this.A0A = false;
        AGC.A00(this, 17);
    }

    public void A3h(int i) {
        if (i == 2131895655) {
            finish();
        }
    }

    public BrazilMerchantDetailsListActivity() {
        this(0);
    }
}
