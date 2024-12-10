package com.whatsapp.profile;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1LU;
import X.AnonymousClass3MY;
import X.AnonymousClass3gA;
import X.C000200d;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;

public class AboutStatusPrivacyActivity extends AnonymousClass3gA {
    public AnonymousClass1LU A00;
    public AnonymousClass00H A01;
    public boolean A02;

    public AboutStatusPrivacyActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass3gA.A0V(A0L, r1, this);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
            this.A01 = C000200d.A00(A0L.A72);
        }
    }

    public AboutStatusPrivacyActivity(int i) {
        this.A02 = false;
        C91024f1.A00(this, 31);
    }
}
