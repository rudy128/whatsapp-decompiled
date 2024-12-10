package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C105905Tu;
import X.C18070vi;
import X.C30391dr;
import X.C41561wd;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import X.C91634g0;
import X.C97244p9;
import X.C97294pE;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.util.Log;

public final class NewsletterUserReportsActivity extends AnonymousClass1FY {
    public NewsletterUserReportsViewModel A00;
    public boolean A01;

    public NewsletterUserReportsActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624082);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = (NewsletterUserReportsViewModel) AnonymousClass3MW.A0N(this).A00(NewsletterUserReportsViewModel.class);
        this.A00 = newsletterUserReportsViewModel;
        if (newsletterUserReportsViewModel != null) {
            C91634g0.A00(this, newsletterUserReportsViewModel.A02, new C105905Tu(this), 15);
            NewsletterUserReportsViewModel newsletterUserReportsViewModel2 = this.A00;
            if (newsletterUserReportsViewModel2 != null) {
                Log.i("NewsletterUserReportsViewModel init");
                newsletterUserReportsViewModel2.A02.A0E(C97294pE.A00);
                Log.i("Fetching user reports");
                newsletterUserReportsViewModel2.A00.A0E(C97244p9.A00);
                AnonymousClass3MX.A1Q(new NewsletterUserReportsViewModel$fetchReports$1(newsletterUserReportsViewModel2, (C30391dr) null), C41561wd.A00(newsletterUserReportsViewModel2));
                return;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A0K() != 0) {
                supportFragmentManager.A0b();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public NewsletterUserReportsActivity(int i) {
        this.A01 = false;
        C91024f1.A00(this, 30);
    }
}
