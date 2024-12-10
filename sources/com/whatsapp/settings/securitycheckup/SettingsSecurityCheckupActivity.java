package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WE;
import X.AnonymousClass5UQ;
import X.C003401n;
import X.C108465bk;
import X.C18070vi;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C37961qT;
import X.C41561wd;
import X.C72473Md;
import X.C72483Me;
import X.C89974dK;
import X.C91034f2;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class SettingsSecurityCheckupActivity extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public SettingsSecurityCheckupViewModel A01;
    public WDSTextLayout A02;
    public boolean A03;

    public SettingsSecurityCheckupActivity() {
        this(0);
    }

    public static final void A03(SettingsSecurityCheckupActivity settingsSecurityCheckupActivity, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((C108465bk) it.next()).BeK()) {
                    WDSTextLayout wDSTextLayout = settingsSecurityCheckupActivity.A02;
                    if (wDSTextLayout == null) {
                        C18070vi.A11("wdsTextLayout");
                        throw null;
                    }
                    wDSTextLayout.setPrimaryButtonText((String) null);
                    WDSTextLayout wDSTextLayout2 = settingsSecurityCheckupActivity.A02;
                    if (wDSTextLayout2 == null) {
                        C18070vi.A11("wdsTextLayout");
                        throw null;
                    } else {
                        wDSTextLayout2.setPrimaryButtonClickListener((View.OnClickListener) null);
                        return;
                    }
                }
            }
        }
        WDSTextLayout wDSTextLayout3 = settingsSecurityCheckupActivity.A02;
        if (wDSTextLayout3 == null) {
            C18070vi.A11("wdsTextLayout");
            throw null;
        }
        AnonymousClass3MY.A0z(settingsSecurityCheckupActivity, wDSTextLayout3, 2131898925);
        WDSTextLayout wDSTextLayout4 = settingsSecurityCheckupActivity.A02;
        if (wDSTextLayout4 == null) {
            C18070vi.A11("wdsTextLayout");
            throw null;
        } else {
            wDSTextLayout4.setPrimaryButtonClickListener(new C89974dK(settingsSecurityCheckupActivity, 28));
        }
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624107);
        this.A02 = (WDSTextLayout) AnonymousClass3MY.A0H(this, 2131435039);
        this.A01 = (SettingsSecurityCheckupViewModel) AnonymousClass3MW.A0N(this).A00(SettingsSecurityCheckupViewModel.class);
        WDSTextLayout wDSTextLayout = this.A02;
        if (wDSTextLayout != null) {
            View findViewById = wDSTextLayout.findViewById(2131429518);
            if (findViewById != null) {
                findViewById.setPadding(0, 0, 0, 0);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131168346);
            WDSTextLayout wDSTextLayout2 = this.A02;
            if (wDSTextLayout2 != null) {
                View findViewById2 = wDSTextLayout2.findViewById(2131431358);
                if (findViewById2 != null) {
                    findViewById2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                WDSTextLayout wDSTextLayout3 = this.A02;
                if (wDSTextLayout3 != null) {
                    AnonymousClass3MY.A10(this, wDSTextLayout3, 2131895569);
                    WDSTextLayout wDSTextLayout4 = this.A02;
                    if (wDSTextLayout4 != null) {
                        wDSTextLayout4.setDescriptionText(getString(2131895568));
                        SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel = this.A01;
                        if (settingsSecurityCheckupViewModel == null) {
                            AnonymousClass3MW.A1H();
                            throw null;
                        }
                        A03(this, (List) settingsSecurityCheckupViewModel.A04.getValue());
                        C003401n supportActionBar = getSupportActionBar();
                        C72473Md.A16(supportActionBar);
                        supportActionBar.A0M(2131895570);
                        RecyclerView recyclerView = (RecyclerView) findViewById(2131435040);
                        AnonymousClass3Ma.A15(this, recyclerView);
                        recyclerView.setItemAnimator((C37961qT) null);
                        AnonymousClass3WE r0 = new AnonymousClass3WE(new AnonymousClass5UQ(this));
                        recyclerView.setAdapter(r0);
                        C37581pm A0H = AnonymousClass3MZ.A0H(this);
                        Integer A0w = AnonymousClass3MW.A0w(AnonymousClass1OR.A00, new SettingsSecurityCheckupActivity$setupList$1(r0, this, (C30391dr) null), A0H);
                        SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel2 = this.A01;
                        if (settingsSecurityCheckupViewModel2 != null) {
                            AnonymousClass3MX.A1Q(new SettingsSecurityCheckupViewModel$updateItemStatus$1(settingsSecurityCheckupViewModel2, (C30391dr) null), C41561wd.A00(settingsSecurityCheckupViewModel2));
                            SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel3 = this.A01;
                            if (settingsSecurityCheckupViewModel3 != null) {
                                C30451dy.A02(A0w, settingsSecurityCheckupViewModel3.A02, new SettingsSecurityCheckupViewModel$refreshStatus$1(settingsSecurityCheckupViewModel3, (C30391dr) null), C41561wd.A00(settingsSecurityCheckupViewModel3));
                                return;
                            }
                        }
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                }
            }
        }
        C18070vi.A11("wdsTextLayout");
        throw null;
    }

    public void onResume() {
        super.onResume();
        SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel = this.A01;
        if (settingsSecurityCheckupViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        AnonymousClass3MX.A1Q(new SettingsSecurityCheckupViewModel$updateItemStatus$1(settingsSecurityCheckupViewModel, (C30391dr) null), C41561wd.A00(settingsSecurityCheckupViewModel));
    }

    public SettingsSecurityCheckupActivity(int i) {
        this.A03 = false;
        C91034f2.A00(this, 42);
    }
}
