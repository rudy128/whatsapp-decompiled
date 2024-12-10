package com.whatsapp.newsletter.ui.delete;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C24921Me;
import X.C35681md;
import X.C72473Md;
import X.C72483Me;
import X.C822343w;
import X.C91024f1;

public final class DeleteNewsletterActivity extends C822343w {
    public C24921Me A00;
    public C35681md A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;

    public DeleteNewsletterActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MZ.A0i(A0L);
            this.A01 = AnonymousClass3MZ.A0y(A0L);
            this.A02 = AnonymousClass3MX.A11(A0L);
            this.A01 = (C35681md) A0L.A7N.get();
            this.A00 = AnonymousClass3MZ.A0g(A0L);
            this.A03 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(AnonymousClass3MX.A0m(this.A03), 33);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public DeleteNewsletterActivity(int i) {
        this.A04 = false;
        C91024f1.A00(this, 2);
    }
}
