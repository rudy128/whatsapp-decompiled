package com.whatsapp.bot.creation;

import X.AFB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5BR;
import X.AnonymousClass5BS;
import X.AnonymousClass5M1;
import X.C000200d;
import X.C18100vl;
import X.C30391dr;
import X.C34001jj;
import X.C72473Md;
import X.C72483Me;
import X.C77543qX;
import X.C90994ey;
import X.C99274sY;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public final class AiCreationActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final C18100vl A03;

    public AiCreationActivity() {
        this(0);
        this.A03 = C99274sY.A00(new AnonymousClass5BS(this), new AnonymousClass5BR(this), new AnonymousClass5M1(this), AnonymousClass3MW.A15(C77543qX.class));
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0L.A10);
            this.A01 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624154);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131427721);
        setSupportActionBar(toolbar);
        C72473Md.A18(this);
        toolbar.setNavigationOnClickListener(new AFB(this, 39));
        if (getSupportFragmentManager().A0U.A04().isEmpty()) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0D(new DescribeAiFragment(), "DescribeAiFragment", 2131431000);
            A0H.A01();
        }
        AnonymousClass3MX.A1Q(new AiCreationActivity$onCreate$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public AiCreationActivity(int i) {
        this.A02 = false;
        C90994ey.A00(this, 17);
    }
}
