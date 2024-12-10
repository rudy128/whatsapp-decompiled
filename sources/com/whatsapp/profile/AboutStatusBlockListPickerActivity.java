package com.whatsapp.profile;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C114635rQ;
import X.C1423279a;

public class AboutStatusBlockListPickerActivity extends C114635rQ {
    public AnonymousClass00H A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114635rQ.A10(this, A0K, A0A, r1);
            this.A00 = C000200d.A00(A0K.A00);
        }
    }

    public AboutStatusBlockListPickerActivity(int i) {
        this.A01 = false;
        C1423279a.A00(this, 30);
    }

    public AboutStatusBlockListPickerActivity() {
        this(0);
    }
}
