package com.whatsapp.conversationslist;

import X.AnonymousClass02B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1NK;
import X.AnonymousClass1YL;
import X.AnonymousClass4Z9;
import X.C006602x;
import X.C18180vt;
import X.C19620yd;
import X.C19830z4;
import X.C28281Zt;
import X.C34001jj;
import X.C70633Bw;
import X.C91004ez;
import android.os.Bundle;
import android.view.MenuItem;

public class ArchivedConversationsActivity extends AnonymousClass1FY {
    public AnonymousClass1NK A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0J = AnonymousClass1FB.A0J((AnonymousClass1K1) ((C006602x) generatedComponent()), this);
            AnonymousClass1FB.A0M(A0J, this);
            AnonymousClass10G r1 = A0J.A00;
            AnonymousClass1FB.A0K(A0J, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0J, r1, this, r1.A5A);
            this.A00 = (AnonymousClass1NK) A0J.A9b.get();
        }
    }

    public ArchivedConversationsActivity(int i) {
        this.A01 = false;
        A2L(new C91004ez(this, 39));
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void C81(AnonymousClass02B r2) {
        super.C81(r2);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
    }

    public void C82(AnonymousClass02B r3) {
        super.C82(r3);
        C28281Zt.A05(this, AnonymousClass1YL.A00(this, 2130968626, 2131099689));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 2131886736;
        if (this.A0A.A2Q()) {
            i = 2131886741;
        }
        setTitle(i);
        getSupportActionBar().A0W(true);
        setContentView(2131624217);
        if (bundle == null) {
            C34001jj r2 = new C34001jj(this.A03.A00.A03);
            r2.A08(new Hilt_ArchivedConversationsFragment(), 2131429504);
            r2.A00(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        AnonymousClass10I r4 = this.A05;
        AnonymousClass1NK r3 = this.A00;
        C19830z4 r2 = this.A0A;
        if (r2.A2Q() && !r2.A2R()) {
            r4.CGF(new C70633Bw(r2, r3, 4));
        }
    }

    public ArchivedConversationsActivity() {
        this(0);
    }
}
