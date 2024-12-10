package com.whatsapp.product.newsletterenforcements.integrityappeals;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.C000200d;
import X.C103265Jq;
import X.C103275Jr;
import X.C103285Js;
import X.C104405Oa;
import X.C105855Tp;
import X.C18100vl;
import X.C72473Md;
import X.C72483Me;
import X.C89964dJ;
import X.C91024f1;
import X.C91634g0;
import X.C99274sY;
import android.os.Bundle;

public final class NewsletterRequestCopyrightReviewActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public NewsletterRequestCopyrightReviewActivity() {
        this(0);
        this.A04 = C99274sY.A00(new C103285Js(this), new C103275Jr(this), new C104405Oa(this), AnonymousClass3MW.A15(NewsletterRequestReviewViewModel.class));
        this.A03 = AnonymousClass1DF.A01(new C103265Jq(this));
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0K.A5B);
            this.A01 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131892795);
        A3f();
        C72473Md.A18(this);
        setContentView(2131626242);
        C91634g0.A00(this, ((NewsletterRequestReviewViewModel) this.A04.getValue()).A00, new C105855Tp(this), 11);
        C89964dJ.A00(this.A00.findViewById(2131434609), this, 21);
    }

    public NewsletterRequestCopyrightReviewActivity(int i) {
        this.A02 = false;
        C91024f1.A00(this, 24);
    }
}
