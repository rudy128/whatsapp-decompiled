package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass9VJ;
import X.AnonymousClass9VO;
import X.AnonymousClass9VP;
import X.C000200d;
import X.C008703w;
import X.C108975cc;
import X.C1193267r;
import X.C191899nN;
import X.C19949A0g;
import X.C218617r;
import X.C25001Mm;
import X.C26521Sl;
import X.C36241nZ;
import X.C56512ha;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CartFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            CartFragment cartFragment = (CartFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r3.A2Q;
            AnonymousClass10G r4 = r2.A00;
            cartFragment.A0a = C72473Md.A0U(r2, r4, cartFragment);
            cartFragment.A0e = AnonymousClass8BT.A0W(r2);
            cartFragment.A0k = C000200d.A00(r2.A0x);
            cartFragment.A0I = AnonymousClass8BT.A0D(r2);
            cartFragment.A0l = C000200d.A00(r3.A04);
            cartFragment.A0m = C000200d.A00(r2.A1o);
            cartFragment.A06 = (AnonymousClass9VJ) r3.A09.get();
            AnonymousClass1K1 r5 = r3.A2O;
            cartFragment.A0n = C000200d.A00(r5.A0V);
            cartFragment.A0o = C000200d.A00(r5.A0W);
            cartFragment.A0p = C000200d.A00(r2.AGs);
            cartFragment.A07 = (AnonymousClass9VO) r3.A0E.get();
            cartFragment.A08 = (AnonymousClass9VP) r3.A0K.get();
            cartFragment.A0N = AnonymousClass8BU.A0D(r2);
            cartFragment.A0q = C000200d.A00(r2.A1q);
            cartFragment.A0r = C000200d.A00(r2.A1u);
            cartFragment.A0P = (C191899nN) r4.A7i.get();
            cartFragment.A0s = C000200d.A00(r4.A7j);
            cartFragment.A0t = C000200d.A00(r2.A1w);
            cartFragment.A0u = C000200d.A00(r2.A1y);
            cartFragment.A0Q = AnonymousClass3Ma.A0S(r2);
            cartFragment.A05 = AnonymousClass3MY.A0N(r2);
            cartFragment.A0Z = AnonymousClass3Ma.A0f(r2);
            cartFragment.A0v = C000200d.A00(r4.A1c);
            cartFragment.A0w = C000200d.A00(r4.A1h);
            cartFragment.A0A = (C218617r) r2.A8v.get();
            cartFragment.A0d = (C19949A0g) r2.A4W.get();
            cartFragment.A0B = AnonymousClass10E.A12(r2);
            cartFragment.A0g = C108975cc.A0P(r4);
            cartFragment.A0D = AnonymousClass10E.A17(r2);
            cartFragment.A0h = (C26521Sl) r2.A69.get();
            cartFragment.A0x = C000200d.A00(r2.A6N);
            cartFragment.A0y = AnonymousClass8BT.A0h(r2);
            cartFragment.A0z = C000200d.A00(r3.A1S);
            cartFragment.A10 = C000200d.A00(r2.A8o);
            cartFragment.A09 = (C56512ha) r3.A0L.get();
            cartFragment.A0Y = (C1193267r) r2.A9P.get();
            cartFragment.A0f = AnonymousClass3Ma.A0r(r2);
            cartFragment.A0T = AnonymousClass3Ma.A0a(r2);
            cartFragment.A0U = AnonymousClass10E.A6O(r2);
            cartFragment.A0E = AnonymousClass3MZ.A0U(r2);
            cartFragment.A0R = AnonymousClass3MZ.A0f(r2);
            cartFragment.A0S = AnonymousClass3MZ.A0g(r2);
            cartFragment.A0F = (C25001Mm) r2.ABf.get();
            cartFragment.A0V = AnonymousClass3Ma.A0c(r2);
            cartFragment.A0i = AnonymousClass10E.AL1(r2);
            cartFragment.A0W = AnonymousClass10E.A6Q(r2);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A05();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1p(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A05()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.Hilt_CartFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A05();
        A2E();
    }
}
