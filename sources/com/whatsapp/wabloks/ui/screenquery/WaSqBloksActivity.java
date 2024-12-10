package com.whatsapp.wabloks.ui.screenquery;

import X.AnonymousClass00H;
import X.AnonymousClass1FG;
import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass74k;
import X.AnonymousClass785;
import X.AnonymousClass89U;
import X.C108955ca;
import X.C114915sC;
import X.C133986pp;
import X.C1425579x;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C181829Rz;
import X.C197609wy;
import X.C217517g;
import X.C26743DBw;
import X.C26744DBx;
import X.C29431cG;
import X.C34001jj;
import X.C56382hN;
import X.C72463Mc;
import X.C74743cP;
import X.CXN;
import X.CXY;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.List;
import java.util.Map;

public final class WaSqBloksActivity extends C114915sC implements AnonymousClass89U {
    public static boolean A09;
    public C56382hN A00;
    public CXN A01;
    public C133986pp A02;
    public WDSToolbar A03;
    public AnonymousClass00H A04;
    public Map A05;
    public CXY A06;
    public final C1425579x A07 = new Object();
    public final AnonymousClass00H A08 = C217517g.A00(49542);

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        List A042 = supportFragmentManager.A0U.A04();
        C18070vi.A0X(A042);
        Fragment fragment = (Fragment) C29431cG.A0e(A042);
        if (fragment != null) {
            supportFragmentManager.A0e(bundle, fragment, "bloks_fragment");
            return;
        }
        throw C17880vN.A0g();
    }

    private final void A03() {
        String str;
        if (this.A06 == null) {
            C56382hN r2 = this.A00;
            if (r2 != null) {
                AnonymousClass1GP A0O = AnonymousClass3MX.A0O(this);
                Map map = this.A05;
                if (map != null) {
                    this.A06 = C197609wy.A00(this, A0O, r2, map);
                    return;
                }
                str = "additionalBloksDataModules";
            } else {
                str = "waBloksHostFactory";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public final WDSToolbar A4b() {
        WDSToolbar wDSToolbar = this.A03;
        if (wDSToolbar != null) {
            return wDSToolbar;
        }
        C18070vi.A11("toolbar");
        throw null;
    }

    public CXN BNV() {
        CXN cxn = this.A01;
        if (cxn != null) {
            return cxn;
        }
        C18070vi.A11("bloksInstallHelper");
        throw null;
    }

    public CXY Bbg() {
        A03();
        CXY cxy = this.A06;
        if (cxy != null) {
            return cxy;
        }
        throw C17880vN.A0g();
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView(2131624123);
        C1425579x r1 = this.A07;
        r1.A01 = this;
        r1.A02 = null;
        BBL(r1);
        A03();
        WDSToolbar wDSToolbar = (WDSToolbar) AnonymousClass3MY.A0C(this, 2131436960);
        C18070vi.A0d(wDSToolbar, 0);
        this.A03 = wDSToolbar;
        setSupportActionBar(A4b());
        WDSToolbar A4b = A4b();
        C74743cP A002 = AnonymousClass3NL.A00(this, this.A00, 2131231675);
        A002.setColorFilter(AnonymousClass3Ma.A01(this, getResources(), 2130971791, 2131102909), PorterDuff.Mode.SRC_ATOP);
        A4b.setNavigationIcon((Drawable) A002);
        A4b().setTitleTextColor(AnonymousClass3Ma.A00(this, 2130971068, 2131102412));
        AnonymousClass3MX.A1A(this, A4b(), C108955ca.A02(this));
        WDSToolbar A4b2 = A4b();
        C72463Mc.A0x(A4b().getContext(), getResources(), A4b2, 2130971792, 2131102910);
        A4b().setNavigationOnClickListener(new AnonymousClass785(this, 8));
        C18030ve r12 = this.A0E;
        C18040vf r2 = C18040vf.A02;
        if ((C18020vd.A05(r2, r12, 8202) || C18020vd.A05(r2, this.A0E, 12585)) && !A09) {
            AnonymousClass00H r0 = this.A04;
            if (r0 != null) {
                C26744DBx.A01(new C26743DBw((AnonymousClass74k) C18070vi.A0E(r0)));
                A09 = true;
            } else {
                C18070vi.A11("bkImageLoader");
                throw null;
            }
        }
        if (bundle == null || (fragment = getSupportFragmentManager().A0P(bundle, "bloks_fragment")) == null) {
            Bundle A092 = AnonymousClass3MY.A09(this);
            if (A092 != null) {
                fragment = C181829Rz.A00(A092);
            } else {
                throw C17880vN.A0g();
            }
        }
        C18070vi.A0b(fragment);
        C34001jj r13 = new C34001jj(AnonymousClass3MX.A0O(this));
        r13.A0D(fragment, "bloks_fragment", 2131428247);
        r13.A01();
    }

    public void onDestroy() {
        super.onDestroy();
        C1425579x r1 = this.A07;
        AnonymousClass1FG r0 = r1.A01;
        if (r0 != null) {
            r0.CEn(r1);
        }
        r1.A01 = null;
        r1.A00 = null;
        r1.A02 = null;
    }
}
