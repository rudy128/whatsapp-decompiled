package com.whatsapp.registration.security;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48o;
import X.AnonymousClass4CF;
import X.C17880vN;
import X.C18070vi;
import X.C19830z4;
import X.C219217x;
import X.C30191dX;
import X.C33841jT;
import X.C72473Md;
import X.C72483Me;
import X.C88494Zy;
import X.C91034f2;
import android.os.Bundle;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class PCRSuccessfulActivity extends AnonymousClass1FY {
    public C30191dX A00;
    public C219217x A01;
    public AnonymousClass1LU A02;
    public C33841jT A03;
    public boolean A04;

    public PCRSuccessfulActivity() {
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
            this.A00 = (C30191dX) A0L.A2b.get();
            this.A03 = (C33841jT) A0L.A9T.get();
            this.A02 = AnonymousClass3MY.A0Z(A0L);
            this.A01 = AnonymousClass3Ma.A0b(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626445);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(this.A00, 2131436101);
        AnonymousClass3MY.A10(this, wDSTextLayout, 2131894258);
        wDSTextLayout.setDescriptionText(getString(2131894257));
        AnonymousClass3MY.A0z(this, wDSTextLayout, 2131887451);
        AnonymousClass48o.A02(wDSTextLayout, this, 15);
        AnonymousClass4CF.A00(wDSTextLayout, C18070vi.A0M(new C88494Zy(C18070vi.A0F(this, 2131894256), (CharSequence) null, 2131231896)));
        C17880vN.A1E(C19830z4.A00(this.A0A), "pcr_active_pn", (String) null);
        C17880vN.A1E(C19830z4.A00(this.A0A), "pcr_active_cc", (String) null);
    }

    public PCRSuccessfulActivity(int i) {
        this.A04 = false;
        C91034f2.A00(this, 7);
    }
}
