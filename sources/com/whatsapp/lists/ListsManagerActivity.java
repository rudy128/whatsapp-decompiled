package com.whatsapp.lists;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4H1;
import X.C003401n;
import X.C34001jj;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import android.os.Bundle;

public final class ListsManagerActivity extends AnonymousClass1FY {
    public boolean A00;

    public ListsManagerActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624071);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0S(getString(2131892483));
            supportActionBar.A0W(true);
        }
        if (bundle == null) {
            boolean A1a = AnonymousClass3MY.A1a(getIntent(), "EXTRA_SKIP_CONTACTS");
            int intExtra = getIntent().getIntExtra("EXTRA_ENTRY_POINT", -1);
            Integer valueOf = Integer.valueOf(intExtra);
            if (intExtra == -1) {
                valueOf = null;
            }
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0G = true;
            A0H.A08(AnonymousClass4H1.A00(valueOf, A1a), 2131430999);
            A0H.A01();
        }
    }

    public ListsManagerActivity(int i) {
        this.A00 = false;
        C91014f0.A00(this, 39);
    }
}
