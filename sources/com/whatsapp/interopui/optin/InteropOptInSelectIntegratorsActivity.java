package com.whatsapp.interopui.optin;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass42F;
import X.AnonymousClass4SJ;
import X.C000200d;
import X.C003401n;
import X.C137506vZ;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C39541tF;
import X.C41561wd;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C86254Qx;
import X.C89954dI;
import X.C91014f0;
import X.C91644g1;
import X.C99154sM;
import X.C99204sR;
import X.C99244sV;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

public final class InteropOptInSelectIntegratorsActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public final C18100vl A05;

    public InteropOptInSelectIntegratorsActivity() {
        this(0);
        this.A05 = C99154sM.A01(this, 29);
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
            this.A00 = C000200d.A00(r1.A2q);
            this.A01 = C000200d.A00(r2.A5U);
            this.A02 = C000200d.A00(A0K.A4U);
            this.A03 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            r0.get();
            AnonymousClass00H r02 = this.A01;
            if (r02 != null) {
                if (((C39541tF) r02.get()).A01()) {
                    setContentView(2131624064);
                    Toolbar A0T = C72463Mc.A0T(this);
                    super.setSupportActionBar(A0T);
                    C003401n supportActionBar = getSupportActionBar();
                    C72473Md.A16(supportActionBar);
                    supportActionBar.A0S(getString(2131895605));
                    C18100vl r5 = this.A05;
                    C91644g1.A00(this, ((InteropOptInSelectIntegratorsViewModel) r5.getValue()).A04, new C99204sR(this, supportActionBar, 6), 41);
                    C137506vZ.A01(A0T, this.A00, getString(2131895605));
                    ((TextView) AnonymousClass3MY.A0H(this, 2131435084)).setText(2131896008);
                    TextView A0L = AnonymousClass3MX.A0L(this, 2131428594);
                    View findViewById = findViewById(2131428585);
                    AnonymousClass00H r03 = this.A02;
                    if (r03 != null) {
                        boolean A1X = C72463Mc.A1X(((C86254Qx) r03.get()).A01);
                        int i = 2131887451;
                        if (A1X) {
                            i = 2131895378;
                        }
                        A0L.setText(i);
                        C89954dI.A00(A0L, this, 25);
                        AnonymousClass00H r04 = this.A02;
                        if (r04 != null) {
                            if (C72463Mc.A1X(((C86254Qx) r04.get()).A01)) {
                                findViewById.setVisibility(8);
                            } else {
                                findViewById.setVisibility(0);
                                C89954dI.A00(findViewById, this, 26);
                            }
                            InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel = (InteropOptInSelectIntegratorsViewModel) r5.getValue();
                            AnonymousClass00H r05 = this.A00;
                            if (r05 != null) {
                                AnonymousClass42F r3 = new AnonymousClass42F((AnonymousClass4SJ) C18070vi.A0E(r05), interopOptInSelectIntegratorsViewModel);
                                RecyclerView recyclerView = (RecyclerView) AnonymousClass3MY.A0H(this, 2131431752);
                                C72483Me.A0f(this, recyclerView);
                                recyclerView.setAdapter(r3);
                                C91644g1.A00(this, ((InteropOptInSelectIntegratorsViewModel) r5.getValue()).A00, new C99204sR(this, r3, 5), 41);
                                C91644g1.A00(this, ((InteropOptInSelectIntegratorsViewModel) r5.getValue()).A01, C99244sV.A00(this, 36), 41);
                                InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel2 = (InteropOptInSelectIntegratorsViewModel) r5.getValue();
                                AnonymousClass3MX.A1Q(new InteropOptInSelectIntegratorsViewModel$loadIntegrators$1(interopOptInSelectIntegratorsViewModel2, (C30391dr) null), C41561wd.A00(interopOptInSelectIntegratorsViewModel2));
                                return;
                            }
                            str = "imageLoader";
                            C18070vi.A11(str);
                            throw null;
                        }
                    }
                    str = "optinManager";
                    C18070vi.A11(str);
                    throw null;
                }
                return;
            }
        }
        str = "interopRolloutManager";
        C18070vi.A11(str);
        throw null;
    }

    public InteropOptInSelectIntegratorsActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 31);
    }
}
