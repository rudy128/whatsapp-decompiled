package com.whatsapp.product.newsletterenforcements.disputesettlement;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass443;
import X.AnonymousClass4UN;
import X.AnonymousClass5OR;
import X.AnonymousClass5OS;
import X.AnonymousClass5OT;
import X.C103175Jh;
import X.C103185Ji;
import X.C105805Tk;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C29681ch;
import X.C29691ci;
import X.C36531o3;
import X.C46162Dk;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C88014Xz;
import X.C89494cY;
import X.C91024f1;
import X.C91634g0;
import X.C99274sY;
import android.os.Bundle;
import android.view.MenuItem;

public final class NewsletterEnforcementSelectActionActivity extends AnonymousClass1FY {
    public C36531o3 A00;
    public AnonymousClass1LU A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public NewsletterEnforcementSelectActionActivity() {
        this(0);
        this.A05 = C99274sY.A00(new C103185Ji(this), new C103175Jh(this), new AnonymousClass5OT(this), AnonymousClass3MW.A15(NewsletterEnforcementSelectActionViewModel.class));
        Integer num = AnonymousClass00R.A01;
        this.A04 = AnonymousClass1DF.A00(num, new AnonymousClass5OR(this));
        this.A03 = AnonymousClass1DF.A00(num, new AnonymousClass5OS(this));
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3Ma.A0T(A0L);
            this.A01 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass1DT r1;
        C46162Dk r2;
        super.onCreate(bundle);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624082);
        C18100vl r3 = this.A05;
        C91634g0.A00(this, ((NewsletterEnforcementSelectActionViewModel) r3.getValue()).A02, new C105805Tk(this), 9);
        NewsletterEnforcementSelectActionViewModel newsletterEnforcementSelectActionViewModel = (NewsletterEnforcementSelectActionViewModel) r3.getValue();
        C29681ch A0o = AnonymousClass3MX.A0o(this.A04);
        C89494cY r4 = (C89494cY) this.A03.getValue();
        C17960vV.A07(r4);
        C18070vi.A0X(r4);
        C18070vi.A0d(A0o, 0);
        Boolean bool = null;
        if (r4 instanceof AnonymousClass443) {
            C29691ci A002 = AnonymousClass1CJ.A00(newsletterEnforcementSelectActionViewModel.A01, A0o);
            if (A002 instanceof C46162Dk) {
                r2 = (C46162Dk) A002;
            } else {
                r2 = null;
            }
            r1 = newsletterEnforcementSelectActionViewModel.A00;
            if (r2 != null) {
                bool = Boolean.valueOf(r2.A0Q());
            }
        } else {
            r1 = newsletterEnforcementSelectActionViewModel.A00;
        }
        r1.A0E(new AnonymousClass4UN(A0o, r4, bool));
        newsletterEnforcementSelectActionViewModel.A02.A0E(C88014Xz.A00);
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

    public NewsletterEnforcementSelectActionActivity(int i) {
        this.A02 = false;
        C91024f1.A00(this, 21);
    }
}
