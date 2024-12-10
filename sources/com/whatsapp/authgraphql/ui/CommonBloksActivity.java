package com.whatsapp.authgraphql.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C109005cf;
import X.C114935sU;
import com.whatsapp.wabloks.ui.WaBloksActivity;

public final class CommonBloksActivity extends WaBloksActivity {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114935sU.A03(A0K, A0A, r1, this);
        }
    }

    public CommonBloksActivity(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 12);
    }

    public CommonBloksActivity() {
        this(0);
    }
}
