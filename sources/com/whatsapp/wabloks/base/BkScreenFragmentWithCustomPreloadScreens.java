package com.whatsapp.wabloks.base;

import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass198;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass6NJ;
import X.AnonymousClass6NK;
import X.AnonymousClass7AS;
import X.AnonymousClass7xQ;
import X.AnonymousClass89U;
import X.C108945cZ;
import X.C154807rj;
import X.C154817rk;
import X.C154827rl;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C197609wy;
import X.C19943A0a;
import X.C56382hN;
import X.CXN;
import X.CXY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.Map;

public class BkScreenFragmentWithCustomPreloadScreens extends Hilt_BkScreenFragmentWithCustomPreloadScreens implements AnonymousClass89U {
    public FrameLayout A00;
    public FrameLayout A01;
    public C56382hN A02;
    public C19943A0a A03;
    public CXN A04;
    public C18030ve A05;
    public AnonymousClass198 A06;
    public AnonymousClass00H A07;
    public Map A08;
    public Map A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(AnonymousClass7xQ.A00);
    public final C18100vl A0B = AnonymousClass1DF.A01(new C154807rj(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C154817rk(this));
    public final C18100vl A0D = AnonymousClass1DF.A01(new C154827rl(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        C18030ve r2 = this.A05;
        if (r2 != null) {
            int i = 2131625348;
            if (C18020vd.A05(C18040vf.A02, r2, 10401)) {
                i = 2131625347;
            }
            return layoutInflater.inflate(i, viewGroup, false);
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A01 = C108945cZ.A0P(view, 2131434015);
        this.A00 = C108945cZ.A0P(view, 2131428242);
        ((GenericBkLayoutViewModelWithReload) this.A08).A00.A0F(AnonymousClass6NJ.A00);
        AnonymousClass7AS.A00(A1G(), ((GenericBkLayoutViewModelWithReload) this.A08).A00, C108945cZ.A1K(this, 36), 39);
        super.A21(bundle, view);
    }

    public void A28() {
        String str;
        ((GenericBkLayoutViewModelWithReload) this.A08).A00.A0F(AnonymousClass6NK.A00);
        Bundle bundle = this.A06;
        if (bundle != null) {
            str = bundle.getString("qpl_params");
        } else {
            str = null;
        }
        C19943A0a a0a = this.A03;
        if (a0a != null) {
            a0a.A01(str);
        } else {
            C18070vi.A11("bloksQplHelper");
            throw null;
        }
    }

    public CXN BNV() {
        CXN cxn = this.A04;
        if (cxn != null) {
            return cxn;
        }
        C18070vi.A11("bloksInstallHelper");
        throw null;
    }

    public CXY Bbg() {
        String str;
        C56382hN r3 = this.A02;
        if (r3 != null) {
            AnonymousClass1GP A1F = A1F();
            AnonymousClass1FL A1B = A1B();
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            AnonymousClass01E r1 = (AnonymousClass01E) A1B;
            Map map = this.A08;
            if (map != null) {
                return C197609wy.A00(r1, A1F, r3, map);
            }
            str = "additionalBloksDataModules";
        } else {
            str = "waBloksHostFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        super.A1s();
        ((GenericBkLayoutViewModelWithReload) this.A08).A00.A09(A1G());
        this.A01 = null;
        this.A00 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            AnonymousClass198 r0 = this.A06;
            if (r0 != null) {
                r0.A00();
            } else {
                C18070vi.A11("whatsAppSoLoader");
                throw null;
            }
        } catch (IOException unused) {
        }
    }
}
