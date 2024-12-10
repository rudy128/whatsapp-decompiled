package com.whatsapp.product.newsletterenforcements.integrityappeals;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C103295Jt;
import X.C17880vN;
import X.C18100vl;
import X.C21448AkF;
import X.C36401np;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C89964dJ;
import X.C91024f1;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class NewsletterRequestReviewActivity extends AnonymousClass1FY {
    public C36401np A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C18100vl A04;

    public NewsletterRequestReviewActivity() {
        this(0);
        this.A04 = AnonymousClass1DF.A01(new C103295Jt(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131892795);
        A3f();
        int A1S = C72473Md.A1S(this);
        setContentView(2131626243);
        TextView A0E = C17880vN.A0E(this.A00, 2131434605);
        View findViewById = this.A00.findViewById(2131434607);
        C36401np r6 = this.A00;
        if (r6 != null) {
            A0E.setText(r6.A06(this, new C21448AkF(this, 45), C17880vN.A0q(this, "clickable-span", new Object[A1S], 0, 2131892786), "clickable-span", C72463Mc.A02(this)));
            AnonymousClass3Ma.A1I(A0E, this.A0E);
            C89964dJ.A00(findViewById, this, 22);
            return;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass3MX.A10(A0L);
            this.A00 = AnonymousClass3MY.A0e(r1);
            this.A02 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public NewsletterRequestReviewActivity(int i) {
        this.A03 = false;
        C91024f1.A00(this, 25);
    }
}
