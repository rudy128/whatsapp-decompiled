package com.whatsapp.interopui.setting;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1L8;
import X.AnonymousClass206;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C003401n;
import X.C137506vZ;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C33971jg;
import X.C34001jj;
import X.C39541tF;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C86254Qx;
import X.C91014f0;
import X.C91644g1;
import X.C99154sM;
import X.C99244sV;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public final class InteropSettingsActivity extends AnonymousClass1FY {
    public AnonymousClass1L8 A00;
    public C33971jg A01;
    public AnonymousClass129 A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public final C18100vl A05;

    public InteropSettingsActivity() {
        this(0);
        this.A05 = C99154sM.A01(this, 33);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820589, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A03(InteropSettingsActivity interopSettingsActivity) {
        Fragment hilt_InteropSettingsOptinFragment;
        String str;
        boolean A052 = C18020vd.A05(C18040vf.A02, interopSettingsActivity.A0E, 11518);
        C34001jj A0H = AnonymousClass3Ma.A0H(interopSettingsActivity);
        if (A052) {
            hilt_InteropSettingsOptinFragment = new Hilt_InteropSettingsMainFragment();
            str = "InteropSettingsMainFragment/";
        } else {
            hilt_InteropSettingsOptinFragment = new Hilt_InteropSettingsOptinFragment();
            str = "InteropSettingsOptinFragment";
        }
        A0H.A0D(hilt_InteropSettingsOptinFragment, str, 2131431776);
        A0H.A02();
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (AnonymousClass1L8) A0L.A5h.get();
            this.A02 = AnonymousClass3Ma.A0t(A0L);
            this.A03 = C000200d.A00(A0L.A5U);
            this.A01 = (C33971jg) A0L.A5V.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624066);
        Toolbar A0T = C72463Mc.A0T(this);
        super.setSupportActionBar(A0T);
        C003401n supportActionBar = getSupportActionBar();
        C72473Md.A16(supportActionBar);
        String A0F = C18070vi.A0F(this, 2131899386);
        supportActionBar.A0S(A0F);
        C137506vZ.A01(A0T, this.A00, A0F);
        C91644g1.A00(this, ((InteropSettingsViewModel) this.A05.getValue()).A00, C99244sV.A00(this, 39), 43);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C72453Mb.A0B(menuItem) != 2131431628) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass129 r1 = this.A02;
        if (r1 != null) {
            Uri A032 = r1.A03("317021344671277");
            C18070vi.A0X(A032);
            AnonymousClass1L8 r12 = this.A00;
            if (r12 != null) {
                r12.CGU(this, A032, (AnonymousClass206) null);
                return true;
            }
            str = "activityLauncher";
        } else {
            str = "faqLinkFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            r0.get();
            AnonymousClass00H r02 = this.A03;
            if (r02 != null) {
                if (!((C39541tF) r02.get()).A01()) {
                    return;
                }
                if (!C72463Mc.A1X(((C86254Qx) ((InteropSettingsViewModel) this.A05.getValue()).A04.get()).A01)) {
                    A03(this);
                    return;
                }
                C34001jj A0H = AnonymousClass3Ma.A0H(this);
                A0H.A0D(new InteropSettingsConfigFragment(), "InteropSettingsConfigFragment", 2131431776);
                A0H.A02();
                return;
            }
        }
        C18070vi.A11("interopRolloutManager");
        throw null;
    }

    public InteropSettingsActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 34);
    }
}
