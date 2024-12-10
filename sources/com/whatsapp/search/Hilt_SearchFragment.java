package com.whatsapp.search;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass198;
import X.AnonymousClass1HS;
import X.AnonymousClass1K1;
import X.AnonymousClass1MC;
import X.AnonymousClass1NN;
import X.AnonymousClass1Q9;
import X.AnonymousClass1VT;
import X.AnonymousClass1WP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass88M;
import X.C000200d;
import X.C008703w;
import X.C108715cB;
import X.C124956aG;
import X.C124966aH;
import X.C19880zA;
import X.C19890zB;
import X.C22621Co;
import X.C25161Nd;
import X.C30801eX;
import X.C31131f4;
import X.C34771l3;
import X.C36241nZ;
import X.C36921og;
import X.C36961ok;
import X.C36981om;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_SearchFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            SearchFragment searchFragment = (SearchFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r5 = r2.A00;
            AnonymousClass3MX.A1M(r5, searchFragment);
            searchFragment.A0P = AnonymousClass10E.A6O(r2);
            searchFragment.A0X = AnonymousClass10E.A8r(r2);
            searchFragment.A0F = AnonymousClass10E.A12(r2);
            searchFragment.A0Q = AnonymousClass3MZ.A0l(r2);
            searchFragment.A0w = C000200d.A00(r2.A5n);
            searchFragment.A1A = AnonymousClass3MW.A0s(r2);
            searchFragment.A0i = AnonymousClass10E.AL1(r2);
            searchFragment.A0l = C000200d.A00(r5.A00);
            searchFragment.A0T = (C22621Co) r2.A27.get();
            searchFragment.A0G = AnonymousClass3MZ.A0U(r2);
            searchFragment.A0A = AnonymousClass3MZ.A0N(r2);
            searchFragment.A0K = AnonymousClass3MZ.A0i(r2);
            searchFragment.A0H = (AnonymousClass1HS) r2.A98.get();
            searchFragment.A0O = AnonymousClass3Ma.A0a(r2);
            searchFragment.A0r = C000200d.A00(r2.A24);
            searchFragment.A0R = AnonymousClass10E.A6Q(r2);
            searchFragment.A0I = (AnonymousClass1MC) r2.A21.get();
            searchFragment.A0h = (AnonymousClass198) r2.AC0.get();
            searchFragment.A0e = AnonymousClass3MZ.A11(r2);
            searchFragment.A0t = C000200d.A00(r2.A2A);
            searchFragment.A0u = C000200d.A00(r2.A2F);
            AnonymousClass1K1 r3 = r4.A2O;
            searchFragment.A0y = C000200d.A00(r3.A4n);
            searchFragment.A0o = C000200d.A00(r2.A14);
            searchFragment.A0s = C000200d.A00(r2.A25);
            searchFragment.A0L = (C25161Nd) r2.A2v.get();
            searchFragment.A09 = C19890zB.A00;
            searchFragment.A0m = C000200d.A00(r3.A0E);
            searchFragment.A0x = C000200d.A00(r3.A4k);
            searchFragment.A0q = C000200d.A00(r2.A1K);
            searchFragment.A0v = C000200d.A00(r2.A4u);
            searchFragment.A0V = (AnonymousClass1Q9) r2.A3j.get();
            searchFragment.A0W = (AnonymousClass1WP) r2.A3k.get();
            searchFragment.A0M = (C31131f4) r2.A6M.get();
            searchFragment.A0J = AnonymousClass3Ma.A0S(r2);
            searchFragment.A0U = (AnonymousClass1NN) r2.A2q.get();
            searchFragment.A0Z = (C36921og) r5.A1S.get();
            searchFragment.A14 = C000200d.A00(r5.A3f);
            searchFragment.A0f = (C34771l3) r5.A0E.get();
            searchFragment.A0S = (C30801eX) r2.AL8.get();
            searchFragment.A18 = C000200d.A00(r2.AkJ);
            searchFragment.A0N = (C108715cB) r5.A17.get();
            searchFragment.A0D = (C124956aG) r4.A0w.get();
            searchFragment.A08 = C19880zA.A01(new Object());
            searchFragment.A0j = (AnonymousClass88M) r3.A28.get();
            searchFragment.A0E = (C124966aH) r4.A10.get();
            searchFragment.A0C = (C36961ok) r4.A0h.get();
            searchFragment.A0B = (C36981om) r3.A1p.get();
            searchFragment.A11 = C000200d.A00(r2.A6o);
            searchFragment.A0n = C000200d.A00(r2.A11);
            searchFragment.A10 = C000200d.A00(r4.A1I);
            searchFragment.A0k = (AnonymousClass1VT) r2.A1X.get();
            searchFragment.A1B = C000200d.A00(r2.ABj);
            searchFragment.A12 = C000200d.A00(r5.A3E);
            searchFragment.A0z = C000200d.A00(r3.A4l);
            searchFragment.A13 = C000200d.A00(r5.A3F);
            searchFragment.A19 = C000200d.A00(r5.A4w);
            searchFragment.A15 = C000200d.A00(r4.A1Y);
            searchFragment.A16 = C000200d.A00(r2.AAN);
            searchFragment.A17 = C000200d.A00(r3.A0B);
            searchFragment.A0p = C000200d.A00(r2.A19);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A00();
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
            r2.A00()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.Hilt_SearchFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
