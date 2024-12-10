package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X2;
import X.AnonymousClass4OB;
import X.AnonymousClass5JX;
import X.AnonymousClass5JY;
import X.AnonymousClass5OM;
import X.AnonymousClass5ON;
import X.AnonymousClass5YE;
import X.C105775Th;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C29681ch;
import X.C30391dr;
import X.C36401np;
import X.C41561wd;
import X.C72473Md;
import X.C72483Me;
import X.C84454Jo;
import X.C91024f1;
import X.C91634g0;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public final class NewsletterAlertsActivity extends AnonymousClass1FY {
    public RecyclerView A00;
    public C84454Jo A01;
    public AnonymousClass3X2 A02;
    public AnonymousClass5YE A03;
    public C36401np A04;
    public C28931bI A05;
    public C28931bI A06;
    public C28931bI A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;

    public NewsletterAlertsActivity() {
        this(0);
        this.A0B = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5OM(this));
        this.A0C = C99274sY.A00(new AnonymousClass5JX(this), new AnonymousClass5JY(this), new AnonymousClass5ON(this), AnonymousClass3MW.A15(NewsletterAlertsViewModel.class));
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A08 = AnonymousClass3MX.A10(r2);
            this.A04 = AnonymousClass3MY.A0e(r1);
            this.A01 = (C84454Jo) A0K.A3L.get();
            this.A03 = (AnonymousClass5YE) A0K.A3M.get();
            this.A09 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            NewsletterAlertsViewModel newsletterAlertsViewModel = (NewsletterAlertsViewModel) this.A0C.getValue();
            AnonymousClass3MW.A1X(newsletterAlertsViewModel.A03, new NewsletterAlertsViewModel$refreshAlerts$1(newsletterAlertsViewModel, (C30391dr) null), C41561wd.A00(newsletterAlertsViewModel));
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTitle(2131888099);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624080);
        this.A00 = (RecyclerView) AnonymousClass3MY.A0H(this, 2131429018);
        this.A07 = AnonymousClass3Ma.A0x(this, 2131427767);
        this.A05 = AnonymousClass3Ma.A0x(this, 2131427764);
        this.A06 = AnonymousClass3Ma.A0x(this, 2131427765);
        C84454Jo r5 = this.A01;
        if (r5 != null) {
            C18100vl r1 = this.A0B;
            C29681ch A0o = AnonymousClass3MX.A0o(r1);
            AnonymousClass00H r0 = this.A09;
            if (r0 != null) {
                C29681ch A0o2 = AnonymousClass3MX.A0o(r1);
                AnonymousClass1L9 r02 = this.A01;
                C18070vi.A0W(r02);
                AnonymousClass4OB r3 = new AnonymousClass4OB(r02, (AnonymousClass1LU) C18070vi.A0E(r0), A0o2, this);
                AnonymousClass10E r03 = r5.A00.A01;
                AnonymousClass3X2 r2 = new AnonymousClass3X2(AnonymousClass3MZ.A0N(r03), AnonymousClass10E.A6Q(r03), A0o, r3);
                this.A02 = r2;
                RecyclerView recyclerView = this.A00;
                str = "recyclerView";
                if (recyclerView != null) {
                    recyclerView.setAdapter(r2);
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        AnonymousClass3Ma.A15(this, recyclerView2);
                        C18100vl r32 = this.A0C;
                        C91634g0.A00(this, ((NewsletterAlertsViewModel) r32.getValue()).A00, new C105775Th(this), 6);
                        NewsletterAlertsViewModel newsletterAlertsViewModel = (NewsletterAlertsViewModel) r32.getValue();
                        AnonymousClass3MW.A1X(newsletterAlertsViewModel.A03, new NewsletterAlertsViewModel$refreshAlerts$1(newsletterAlertsViewModel, (C30391dr) null), C41561wd.A00(newsletterAlertsViewModel));
                        return;
                    }
                }
            } else {
                str = "waIntents";
            }
        } else {
            str = "newsletterAlertsAdapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public NewsletterAlertsActivity(int i) {
        this.A0A = false;
        C91024f1.A00(this, 19);
    }
}
