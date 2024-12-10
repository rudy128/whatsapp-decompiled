package com.whatsapp.registration.accountdefence.ui;

import X.AFS;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C106485Wa;
import X.C110885hR;
import X.C24261Jm;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import android.os.Bundle;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public class OldDeviceSecureAccount2FaActivity extends AnonymousClass1FY implements C106485Wa {
    public AnonymousClass19D A00;
    public AnonymousClass1LU A01;
    public boolean A02;

    public OldDeviceSecureAccount2FaActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass3MY.A0Z(A0L);
            this.A00 = C72463Mc.A0e(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624012);
        AnonymousClass3MX.A0L(this, 2131436281).setText(2131886340);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) AnonymousClass1HF.A06(this.A00, 2131427553);
        wDSTextLayout.setHeaderImage(C24261Jm.A00(wDSTextLayout.getContext(), 2131232954));
        AnonymousClass3MY.A10(this, wDSTextLayout, 2131886332);
        wDSTextLayout.setDescriptionText(getString(2131886333));
        AnonymousClass3MY.A0z(this, wDSTextLayout, 2131886334);
        wDSTextLayout.setPrimaryButtonClickListener(new AFS(this, 13));
        wDSTextLayout.setSecondaryButtonText(getString(2131899432));
        wDSTextLayout.setSecondaryButtonClickListener(new AFS(this, 14));
        AnonymousClass3MZ.A1L(C110885hR.A0A(this, 2131429138), this, 15);
    }

    public OldDeviceSecureAccount2FaActivity(int i) {
        this.A02 = false;
        C91024f1.A00(this, 48);
    }
}
