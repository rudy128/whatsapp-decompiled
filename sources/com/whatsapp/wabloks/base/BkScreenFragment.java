package com.whatsapp.wabloks.base;

import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass198;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass7AS;
import X.AnonymousClass89U;
import X.C108945cZ;
import X.C108965cb;
import X.C1587181t;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C197609wy;
import X.C19943A0a;
import X.C56382hN;
import X.C72453Mb;
import X.CXN;
import X.CXY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.Map;

public class BkScreenFragment extends Hilt_BkScreenFragment implements AnonymousClass89U {
    public C56382hN A00;
    public C19943A0a A01;
    public CXN A02;
    public C18030ve A03;
    public AnonymousClass198 A04;
    public AnonymousClass00H A05;
    public Map A06;
    public boolean A07;
    public FrameLayout A08;
    public FrameLayout A09;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        C18030ve r2 = this.A03;
        if (r2 != null) {
            int i = 2131625346;
            if (C18020vd.A05(C18040vf.A02, r2, 10400)) {
                i = 2131625345;
            }
            return layoutInflater.inflate(i, viewGroup, false);
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A09 = C108945cZ.A0P(view, 2131428243);
        this.A08 = C108945cZ.A0P(view, 2131428242);
        A2D();
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A08;
        genericBkLayoutViewModel.A0T();
        AnonymousClass7AS.A00(A1G(), genericBkLayoutViewModel.A01, new C1587181t(this), 38);
        super.A21(bundle, view);
    }

    public void A2C() {
        C72453Mb.A1D(this.A09);
        C72453Mb.A1C(this.A08);
    }

    public void A2D() {
        C72453Mb.A1D(this.A08);
        boolean equals = "com.bloks.www.whatsapp.galaxy.flow.v2".equals(A15().getString("screen_name", (String) null));
        FrameLayout frameLayout = this.A09;
        if (frameLayout != null && !equals) {
            if (!this.A07) {
                C108965cb.A12(frameLayout, -1);
            }
            C72453Mb.A1C(this.A09);
        }
    }

    public CXN BNV() {
        CXN cxn = this.A02;
        if (cxn != null) {
            return cxn;
        }
        C18070vi.A11("bloksInstallHelper");
        throw null;
    }

    public CXY Bbg() {
        String str;
        C56382hN r3 = this.A00;
        if (r3 != null) {
            AnonymousClass1GP A1F = A1F();
            AnonymousClass1FL A1B = A1B();
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            AnonymousClass01E r1 = (AnonymousClass01E) A1B;
            Map map = this.A06;
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
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A08;
        genericBkLayoutViewModel.A0T();
        genericBkLayoutViewModel.A01.A09(A1G());
        this.A09 = null;
        this.A08 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            AnonymousClass198 r0 = this.A04;
            if (r0 != null) {
                r0.A00();
            } else {
                C18070vi.A11("whatsAppSoLoader");
                throw null;
            }
        } catch (IOException unused) {
        }
    }

    public void A28() {
        String str;
        A2C();
        Bundle bundle = this.A06;
        if (bundle != null) {
            str = bundle.getString("qpl_params");
        } else {
            str = null;
        }
        C19943A0a a0a = this.A01;
        if (a0a != null) {
            a0a.A01(str);
        } else {
            C18070vi.A11("bloksQplHelper");
            throw null;
        }
    }
}
