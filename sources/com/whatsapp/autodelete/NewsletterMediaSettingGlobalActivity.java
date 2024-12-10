package com.whatsapp.autodelete;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C72473Md;
import X.C72483Me;
import X.C75663i0;
import X.C90994ey;
import android.os.Bundle;

public final class NewsletterMediaSettingGlobalActivity extends C75663i0 {
    public boolean A00;

    public NewsletterMediaSettingGlobalActivity() {
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
            this.A02 = C000200d.A00(r1.A6C);
            this.A00 = AnonymousClass3Ma.A0t(A0L);
            this.A01 = AnonymousClass3MY.A0e(r1);
            this.A03 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A4c(false);
    }

    public NewsletterMediaSettingGlobalActivity(int i) {
        this.A00 = false;
        C90994ey.A00(this, 10);
    }
}
