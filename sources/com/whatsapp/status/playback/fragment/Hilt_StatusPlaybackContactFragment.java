package com.whatsapp.status.playback.fragment;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18O;
import X.AnonymousClass1TG;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass72B;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C18600wl;
import X.C24631Lb;
import X.C25931Qe;
import X.C31191fA;
import X.C32951i1;
import X.C34771l3;
import X.C36241nZ;
import X.C36341nj;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_StatusPlaybackContactFragment extends StatusPlaybackBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0E() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass3MX.A1M(r3, statusPlaybackContactFragment);
            statusPlaybackContactFragment.A00 = AnonymousClass10E.A12(r2);
            statusPlaybackContactFragment.A01 = AnonymousClass10E.A17(r2);
            statusPlaybackContactFragment.A04 = C108965cb.A0X(r2);
            statusPlaybackContactFragment.A06 = C000200d.A00(r3.AHc);
            statusPlaybackContactFragment.A02 = AnonymousClass3Ma.A0a(r2);
            statusPlaybackContactFragment.A03 = AnonymousClass10E.A6Q(r2);
            statusPlaybackContactFragment.A0X = C000200d.A00(r2.A0E);
            statusPlaybackContactFragment.A07 = (AnonymousClass1VP) r2.A1l.get();
            statusPlaybackContactFragment.A08 = (C31191fA) r2.A25.get();
            statusPlaybackContactFragment.A0D = (C32951i1) r2.A28.get();
            statusPlaybackContactFragment.A0Y = C000200d.A00(r2.A2A);
            statusPlaybackContactFragment.A0Q = AnonymousClass3MZ.A11(r2);
            statusPlaybackContactFragment.A09 = AnonymousClass10E.A4z(r2);
            statusPlaybackContactFragment.A0A = AnonymousClass3Ma.A0S(r2);
            statusPlaybackContactFragment.A0C = AnonymousClass3MZ.A0i(r2);
            statusPlaybackContactFragment.A0G = AnonymousClass3MZ.A0n(r2);
            statusPlaybackContactFragment.A0Z = C000200d.A00(r2.AJF);
            statusPlaybackContactFragment.A0a = C000200d.A00(r3.A1F);
            statusPlaybackContactFragment.A0W = (AnonymousClass72B) r2.A34.get();
            statusPlaybackContactFragment.A0b = AnonymousClass3MX.A12(r2);
            statusPlaybackContactFragment.A0c = C000200d.A00(r2.AN9);
            statusPlaybackContactFragment.A0M = (C25931Qe) r2.A3z.get();
            statusPlaybackContactFragment.A0d = C000200d.A00(r2.A4u);
            statusPlaybackContactFragment.A0y = AnonymousClass3MZ.A1B(r2);
            statusPlaybackContactFragment.A02 = C108985cd.A0N(r2);
            statusPlaybackContactFragment.A0z = (C18600wl) r2.A9F.get();
            statusPlaybackContactFragment.A0e = C000200d.A00(r2.AXy);
            statusPlaybackContactFragment.A0H = AnonymousClass3MZ.A0o(r2);
            statusPlaybackContactFragment.A0f = C000200d.A00(r2.AaG);
            statusPlaybackContactFragment.A0g = C000200d.A00(r2.A7C);
            statusPlaybackContactFragment.A0O = (C36341nj) r2.A7L.get();
            statusPlaybackContactFragment.A03 = AnonymousClass3MZ.A0R(r2);
            statusPlaybackContactFragment.A04 = (AnonymousClass18O) r2.A9p.get();
            statusPlaybackContactFragment.A0h = C000200d.A00(r3.A4e);
            statusPlaybackContactFragment.A0i = C000200d.A00(r2.Aja);
            statusPlaybackContactFragment.A0I = (AnonymousClass1TG) r2.AAF.get();
            statusPlaybackContactFragment.A0j = C000200d.A00(r4.A2O.AAA);
            statusPlaybackContactFragment.A0J = (C24631Lb) r2.Ajh.get();
            statusPlaybackContactFragment.A0K = C108955ca.A0M(r2);
            statusPlaybackContactFragment.A0R = C108965cb.A0Z(r2);
            statusPlaybackContactFragment.A0S = (C34771l3) r3.A0E.get();
            statusPlaybackContactFragment.A0U = AnonymousClass3MZ.A13(r2);
            statusPlaybackContactFragment.A05 = AnonymousClass3MZ.A0T(r3);
            statusPlaybackContactFragment.A0E = AnonymousClass10E.A6O(r2);
            statusPlaybackContactFragment.A0k = C000200d.A00(r4.A1i);
            statusPlaybackContactFragment.A06 = AnonymousClass3MZ.A0U(r2);
            statusPlaybackContactFragment.A0l = C000200d.A00(r2.ABV);
            statusPlaybackContactFragment.A0B = AnonymousClass3MZ.A0g(r2);
            statusPlaybackContactFragment.A0m = AnonymousClass3MW.A0s(r2);
            statusPlaybackContactFragment.A0n = C000200d.A00(r2.ABj);
            statusPlaybackContactFragment.A0F = AnonymousClass3Ma.A0c(r2);
            statusPlaybackContactFragment.A0V = AnonymousClass10E.AL1(r2);
            statusPlaybackContactFragment.A0o = C000200d.A00(r2.AjT);
            statusPlaybackContactFragment.A0L = AnonymousClass3Ma.A0g(r2);
            statusPlaybackContactFragment.A0p = C000200d.A00(r2.ABv);
            statusPlaybackContactFragment.A0q = C000200d.A00(r2.Ane);
            statusPlaybackContactFragment.A0r = C000200d.A00(r3.A5I);
            statusPlaybackContactFragment.A0s = C000200d.A00(r2.AC9);
            statusPlaybackContactFragment.A0t = C000200d.A00(r2.Ans);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A0E();
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
            r2.A0E()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.Hilt_StatusPlaybackContactFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A0E();
        A25();
    }
}
