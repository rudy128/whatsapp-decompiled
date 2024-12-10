package com.whatsapp.businessupsell;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3Ma;
import X.C170888qp;
import X.C189759jn;
import X.C72473Md;
import X.C72483Me;
import X.C89874dA;
import X.C90994ey;
import android.os.Bundle;

public class BusinessAppEducation extends AnonymousClass1FY {
    public AnonymousClass18K A00;
    public C189759jn A01;
    public boolean A02;

    public BusinessAppEducation() {
        this(0);
    }

    public static void A03(BusinessAppEducation businessAppEducation, int i) {
        C170888qp r1 = new C170888qp();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = 12;
        businessAppEducation.A00.CC7(r1);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3Ma.A0g(A0L);
            this.A01 = (C189759jn) A0L.AdV.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624348);
        C89874dA.A00(findViewById(2131429132), this, 4);
        C89874dA.A00(findViewById(2131431700), this, 5);
        A03(this, 1);
    }

    public BusinessAppEducation(int i) {
        this.A02 = false;
        C90994ey.A00(this, 20);
    }
}
