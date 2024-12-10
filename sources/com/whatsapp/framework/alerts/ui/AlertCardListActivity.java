package com.whatsapp.framework.alerts.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass3Ma;
import X.C003401n;
import X.C102635Hf;
import X.C18100vl;
import X.C24261Jm;
import X.C34001jj;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class AlertCardListActivity extends AnonymousClass1FU {
    public boolean A00;
    public final C18100vl A01;

    public AlertCardListActivity() {
        this(0);
        this.A01 = AnonymousClass1DF.A01(new C102635Hf(this));
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            C72453Mb.A1K(r1, this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624182);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131886639);
        }
        C72473Md.A18(this);
        C003401n supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A0O(C24261Jm.A00(this, 2131231675));
        }
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        A0H.A0C((Fragment) this.A01.getValue(), (String) null, 2131427761);
        A0H.A01();
    }

    public AlertCardListActivity(int i) {
        this.A00 = false;
        C91014f0.A00(this, 9);
    }
}
