package com.whatsapp.email;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C825048f;
import X.C91014f0;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class EmailVerifiedSecurityCheckActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public boolean A01;

    public EmailVerifiedSecurityCheckActivity() {
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
            this.A00 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625176);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(this.A00, 2131430305);
        AnonymousClass3MY.A0z(this, wDSTextLayout, 2131898925);
        wDSTextLayout.setPrimaryButtonClickListener(new C825048f(this, 46));
        AnonymousClass3MY.A10(this, wDSTextLayout, 2131889694);
        View view = this.A00;
        C18070vi.A0X(view);
        AnonymousClass3MW.A0J(view, 2131435038).setText(2131889693);
    }

    public EmailVerifiedSecurityCheckActivity(int i) {
        this.A01 = false;
        C91014f0.A00(this, 0);
    }
}
