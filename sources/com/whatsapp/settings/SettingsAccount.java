package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4NQ;
import X.AnonymousClass4SS;
import X.AnonymousClass739;
import X.AnonymousClass7AH;
import X.C000200d;
import X.C146447Pd;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C192679on;
import X.C196039uM;
import X.C19880zA;
import X.C19890zB;
import X.C39541tF;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C83434Fc;
import X.C83444Fd;
import X.C86004Pu;
import X.C87824Xf;
import X.C90064dT;
import X.C91034f2;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.settings.securitycheckup.SecurityCheckupBannerViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

public class SettingsAccount extends AnonymousClass1FY {
    public ViewStub A00;
    public C19880zA A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public C19880zA A07;
    public C19880zA A08;
    public AnonymousClass1LU A09;
    public SecurityCheckupBannerViewModel A0A;
    public AnonymousClass129 A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public boolean A0P;
    public boolean A0Q;

    public SettingsAccount() {
        this(0);
    }

    public void A2y() {
        if (!this.A0Q) {
            this.A0Q = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A0M = C000200d.A00(r3.AGy);
            this.A0C = C000200d.A00(r2.A08);
            this.A0J = C000200d.A00(r3.A3h);
            this.A0N = C000200d.A00(A0K2.A5o);
            this.A0E = C000200d.A00(r2.A3c);
            this.A04 = AnonymousClass3MZ.A0M(r3.ACY);
            C19890zB r1 = C19890zB.A00;
            this.A01 = r1;
            this.A07 = r1;
            this.A0G = C000200d.A00(r2.A5U);
            this.A0D = C000200d.A00(r2.A0B);
            this.A0B = AnonymousClass3Ma.A0t(r2);
            this.A0F = C000200d.A00(r2.A51);
            this.A09 = AnonymousClass3MY.A0Z(r2);
            this.A0I = C000200d.A00(r3.A3V);
            this.A0L = C000200d.A00(A0K2.A5m);
            this.A08 = r1;
            this.A05 = r1;
            this.A06 = r1;
            this.A0O = C000200d.A00(r3.A3a);
            this.A0K = C000200d.A00(r3.A3Y);
            this.A0H = C000200d.A00(r2.A63);
            this.A03 = r1;
            this.A02 = r1;
        }
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(getPackageName(), "com.whatsapp.settings.SettingsTabActivity");
            finishAndRemoveTask();
            startActivity(A0A2);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        DialogFragment A002;
        super.onCreate(bundle);
        setTitle(2131895794);
        setContentView(2131626537);
        C72473Md.A17(this);
        C18030ve r1 = this.A0E;
        C18040vf r4 = C18040vf.A02;
        this.A0P = C18020vd.A05(r4, r1, 4023);
        findViewById(2131434084).setVisibility(8);
        WDSListItem wDSListItem = (WDSListItem) findViewById(2131435049);
        C90064dT.A00(wDSListItem, this, 29);
        View findViewById = findViewById(2131433462);
        boolean A012 = ((C192679on) this.A0J.get()).A01();
        View findViewById2 = findViewById(2131433462);
        if (A012) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(8);
        }
        C90064dT.A00(findViewById, this, 18);
        View findViewById3 = findViewById(2131432207);
        if (findViewById3 instanceof WDSListItem) {
            C17880vN.A0E(findViewById3, 2131434761).setTextColor(AnonymousClass3Ma.A01(this, getResources(), 2130971878, 2131100136));
        }
        if (getIntent().getBooleanExtra("is_companion", false) || C17880vN.A0H(this.A0H).A0N()) {
            C90064dT.A00(findViewById3, this, 19);
            AnonymousClass3MX.A1H(this, 2131436473, 8);
            AnonymousClass3MX.A1H(this, 2131428991, 8);
            AnonymousClass3MX.A1H(this, 2131429877, 8);
            C90064dT.A00(findViewById(2131429871), this, 21);
        } else {
            findViewById3.setVisibility(8);
            AnonymousClass3MX.A1H(this, 2131429871, 8);
            if (((C196039uM) this.A0E.get()).A02()) {
                WDSListItem wDSListItem2 = (WDSListItem) AnonymousClass3MY.A0I(AnonymousClass3Ma.A0x(this, 2131430299), 0);
                AnonymousClass3MZ.A1P(wDSListItem2, this, AnonymousClass1LU.A1O(this, C17890vO.A0Q(), 2), 10);
                if (this.A0P) {
                    wDSListItem2.setIcon(2131233159);
                }
            }
            WDSListItem wDSListItem3 = (WDSListItem) findViewById(2131436473);
            C90064dT.A00(wDSListItem3, this, 26);
            if (this.A0P) {
                wDSListItem3.setIcon(2131232159);
            }
            if (this.A05.A07() && C18020vd.A05(r4, this.A0E, 7382) && C18020vd.A05(r4, this.A0E, 10728)) {
                ViewStub A0H2 = AnonymousClass3MX.A0H(this, 2131435482);
                this.A00 = A0H2;
                if (A0H2 != null) {
                    this.A05.A03();
                    throw AnonymousClass000.A0s("getWebOnboardingSettingsListItemLayoutRes");
                }
            }
            WDSListItem wDSListItem4 = (WDSListItem) findViewById(2131428991);
            if (this.A0P) {
                wDSListItem4.setIcon(2131232277);
            }
            C90064dT.A00(wDSListItem4, this, 28);
            WDSListItem wDSListItem5 = (WDSListItem) findViewById(2131429877);
            if (this.A0P) {
                wDSListItem5.setIcon(2131231845);
            }
            C90064dT.A00(wDSListItem5, this, 22);
            if (C17880vN.A0I(this.A0C).A0E()) {
                WDSListItem wDSListItem6 = (WDSListItem) AnonymousClass3MY.A0I(AnonymousClass3Ma.A0x(this, 2131434476), 0);
                C90064dT.A00(wDSListItem6, this, 25);
                if (this.A0P) {
                    wDSListItem6.setIcon(2131233397);
                }
            }
            if (this.A0P) {
                wDSListItem.setIcon(2131232272);
            }
        }
        if (C17880vN.A0I(this.A0C).A0F() && C17880vN.A0I(this.A0C).A0A.A0E() + 1 < 2) {
            WDSListItem wDSListItem7 = (WDSListItem) AnonymousClass3MY.A0I(AnonymousClass3Ma.A0x(this, 2131427572), 0);
            C90064dT.A00(wDSListItem7, this, 23);
            if (this.A0P) {
                wDSListItem7.setIcon(2131233394);
            }
        }
        WDSListItem wDSListItem8 = (WDSListItem) findViewById(2131434574);
        C90064dT.A00(wDSListItem8, this, 20);
        if (this.A0P) {
            wDSListItem8.setIcon(2131231849);
        }
        this.A0G.get();
        if (((C39541tF) this.A0G.get()).A01()) {
            WDSListItem wDSListItem9 = (WDSListItem) AnonymousClass3MY.A0I(AnonymousClass3Ma.A0x(this, 2131431767), 0);
            boolean A003 = ((AnonymousClass4SS) this.A0I.get()).A00();
            C86004Pu r0 = (C86004Pu) this.A0L.get();
            if (A003) {
                r0.A00(wDSListItem9);
            } else if (wDSListItem9 != null) {
                wDSListItem9.setBadgeIcon((Drawable) null);
            } else {
                Log.e("SettingsBadgeUtils/clearBadge cannot find component view");
            }
            C90064dT.A00(wDSListItem9, this, 27);
            C19880zA r12 = this.A04;
            if (r12.A07()) {
                AnonymousClass4NQ r42 = (AnonymousClass4NQ) r12.A03();
                if (((C39541tF) r42.A01.get()).A00()) {
                    r42.A00.CGF(new C146447Pd(r42, 29));
                }
            }
        }
        ((C87824Xf) this.A0N.get()).A02(this.A00, "account", C72453Mb.A0w(this));
        Intent intent = getIntent();
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("account_switcher", false);
            boolean booleanExtra2 = intent.getBooleanExtra("account_switcher_add_account", false);
            ((AnonymousClass739) this.A0D.get()).A02();
            int intExtra = intent.getIntExtra("source", 15);
            if (booleanExtra) {
                A002 = C83434Fc.A00("settings_account", intExtra);
            } else if (booleanExtra2) {
                A002 = C83444Fd.A00("settings_account", intExtra);
            }
            CMl(A002);
        }
        this.A0A = (SecurityCheckupBannerViewModel) AnonymousClass3MW.A0N(this).A00(SecurityCheckupBannerViewModel.class);
        this.A0A.A00.A0A(this, new AnonymousClass7AH(AnonymousClass3Ma.A0x(this, 2131435035), this, 16));
        SecurityCheckupBannerViewModel.A00(this.A0A);
        this.A0O.get();
        this.A0K.get();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        SecurityCheckupBannerViewModel securityCheckupBannerViewModel = this.A0A;
        if (securityCheckupBannerViewModel != null) {
            SecurityCheckupBannerViewModel.A00(securityCheckupBannerViewModel);
        }
    }

    public SettingsAccount(int i) {
        this.A0Q = false;
        C91034f2.A00(this, 11);
    }
}
