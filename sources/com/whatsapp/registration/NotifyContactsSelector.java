package com.whatsapp.registration;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass3gf;
import X.C003401n;
import X.C17880vN;
import X.C19880zA;
import X.C19890zB;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C91024f1;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

public final class NotifyContactsSelector extends AnonymousClass3gf {
    public C19880zA A00;
    public boolean A01;

    public NotifyContactsSelector() {
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
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A00 = C19890zB.A00;
        }
    }

    public void A4u(int i) {
        if (i <= 0) {
            C003401n supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0L(2131886472);
                return;
            }
            throw C17880vN.A0g();
        }
        super.A4u(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("NotifyContactsSelector/permissions denied");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !C72463Mc.A1W(this.A0L) && !AnonymousClass3MX.A1W(this.A0E)) {
            C72453Mb.A15(this, 2131894321, 2131894320);
        }
    }

    public NotifyContactsSelector(int i) {
        this.A01 = false;
        C91024f1.A00(this, 46);
    }
}
