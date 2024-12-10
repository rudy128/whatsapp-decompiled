package com.whatsapp.interopui.optin;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3WZ;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C86254Qx;
import X.C89954dI;
import X.C91014f0;
import X.C91644g1;
import X.C99154sM;
import X.C99244sV;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.button.WDSButton;

public final class InteropUnifiedInboxOptionActivity extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public C86254Qx A01;
    public WDSButton A02;
    public WDSButton A03;
    public boolean A04;
    public final C18100vl A05;

    public InteropUnifiedInboxOptionActivity() {
        this(0);
        this.A05 = C99154sM.A01(this, 30);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = (C86254Qx) A0K.A4U.get();
            this.A00 = AnonymousClass3MY.A0Z(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624067);
        super.setSupportActionBar(C72463Mc.A0T(this));
        C72473Md.A16(getSupportActionBar());
        this.A03 = (WDSButton) findViewById(2131428594);
        this.A02 = (WDSButton) findViewById(2131428585);
        C86254Qx r0 = this.A01;
        if (r0 != null) {
            boolean A1X = C72463Mc.A1X(r0.A01);
            WDSButton wDSButton = this.A03;
            if (A1X) {
                if (wDSButton != null) {
                    wDSButton.setVisibility(8);
                }
                WDSButton wDSButton2 = this.A02;
                if (wDSButton2 != null) {
                    wDSButton2.setVisibility(8);
                }
            } else {
                if (wDSButton != null) {
                    wDSButton.setVisibility(0);
                }
                WDSButton wDSButton3 = this.A02;
                if (wDSButton3 != null) {
                    wDSButton3.setVisibility(0);
                }
                WDSButton wDSButton4 = this.A03;
                if (wDSButton4 != null) {
                    C89954dI.A00(wDSButton4, this, 27);
                }
                WDSButton wDSButton5 = this.A02;
                if (wDSButton5 != null) {
                    C89954dI.A00(wDSButton5, this, 28);
                }
            }
            C18100vl r4 = this.A05;
            AnonymousClass3WZ r3 = new AnonymousClass3WZ((InteropOptInSelectInboxViewModel) r4.getValue());
            RecyclerView recyclerView = (RecyclerView) AnonymousClass3MY.A0H(this, 2131431589);
            C72483Me.A0f(this, recyclerView);
            recyclerView.setAdapter(r3);
            AnonymousClass3MX.A1Q(new InteropUnifiedInboxOptionActivity$initObservables$1(r3, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            C91644g1.A00(this, ((InteropOptInSelectInboxViewModel) r4.getValue()).A00, C99244sV.A00(this, 38), 42);
            return;
        }
        C18070vi.A11("interopOptInManager");
        throw null;
    }

    public InteropUnifiedInboxOptionActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 32);
    }
}
