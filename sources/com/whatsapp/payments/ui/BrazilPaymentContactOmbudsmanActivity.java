package com.whatsapp.payments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass8G3;
import X.C166718dr;
import X.C1767995r;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;

public class BrazilPaymentContactOmbudsmanActivity extends C166718dr {
    public C1767995r A00;
    public boolean A01;

    public BrazilPaymentContactOmbudsmanActivity() {
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
            this.A00 = (C1767995r) A0K.A0G.get();
        }
    }

    public AnonymousClass8G3 A4g() {
        return this.A00;
    }

    public int A4b() {
        return 2131888789;
    }

    public int A4c() {
        return 2131888876;
    }

    public int A4d() {
        return 2131888790;
    }

    public int A4e() {
        return 2131888791;
    }

    public int A4f() {
        return 2131899381;
    }

    public BrazilPaymentContactOmbudsmanActivity(int i) {
        this.A01 = false;
        C91024f1.A00(this, 7);
    }
}
