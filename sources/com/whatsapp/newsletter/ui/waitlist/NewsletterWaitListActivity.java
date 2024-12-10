package com.whatsapp.newsletter.ui.waitlist;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass3MY;
import X.AnonymousClass5YB;
import X.AnonymousClass74D;
import X.C000200d;
import X.C17880vN;
import X.C18070vi;
import X.C27301Vn;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C81323z3;
import X.C90594eK;
import X.C91024f1;
import android.os.Bundle;

public final class NewsletterWaitListActivity extends AnonymousClass1FU implements AnonymousClass5YB {
    public C27301Vn A00;
    public C90594eK A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public NewsletterWaitListActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            C72453Mb.A1K(r1, this);
            this.A02 = C000200d.A00(A0L.A7M);
            this.A00 = (C27301Vn) A0L.A9A.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624093);
        if (bundle == null) {
            CMk(new Hilt_NewsletterWaitListSubscribeFragment(), "NewsletterWaitListSubscribeFragment");
            Bundle A09 = AnonymousClass3MY.A09(this);
            if (A09 != null) {
                AnonymousClass00H r0 = this.A02;
                if (r0 != null) {
                    AnonymousClass74D r5 = (AnonymousClass74D) r0.get();
                    boolean A1W = C17880vN.A1W(C72453Mb.A0M(this), "newsletter_wait_list_subscription");
                    boolean z = A09.getBoolean("is_external_link");
                    C81323z3 r2 = new C81323z3();
                    int i = 1;
                    r2.A01 = 1;
                    r2.A00 = Boolean.valueOf(A1W);
                    if (z) {
                        i = 2;
                    }
                    r2.A02 = Integer.valueOf(i);
                    r5.A05.CC7(r2);
                    return;
                }
                C18070vi.A11("newsletterLogging");
                throw null;
            }
        }
    }

    public NewsletterWaitListActivity(int i) {
        this.A03 = false;
        C91024f1.A00(this, 4);
    }
}
