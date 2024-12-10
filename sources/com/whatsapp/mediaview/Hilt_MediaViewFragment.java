package com.whatsapp.mediaview;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1RU;
import X.AnonymousClass1ST;
import X.AnonymousClass1W6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aW;
import X.AnonymousClass689;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C136776uN;
import X.C19890zB;
import X.C24791Lr;
import X.C26521Sl;
import X.C27071Up;
import X.C29781cr;
import X.C31131f4;
import X.C32091gc;
import X.C32211gp;
import X.C32431hB;
import X.C32571hP;
import X.C32861hs;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_MediaViewFragment extends MediaViewBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0j() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            C36241nZ r2 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r2.A2Q;
            AnonymousClass10G r5 = r3.A00;
            AnonymousClass3MX.A1M(r5, mediaViewFragment);
            mediaViewFragment.A0S = AnonymousClass10E.A6O(r3);
            mediaViewFragment.A0e = AnonymousClass10E.A8r(r3);
            mediaViewFragment.A0F = AnonymousClass10E.A12(r3);
            mediaViewFragment.A1A = C108975cc.A0P(r5);
            mediaViewFragment.A0r = (C32091gc) r3.A6G.get();
            mediaViewFragment.A0J = C108965cb.A0K(r3);
            mediaViewFragment.A0E = AnonymousClass3MY.A0N(r3);
            mediaViewFragment.A0G = AnonymousClass10E.A17(r3);
            mediaViewFragment.A0H = AnonymousClass3MZ.A0R(r3);
            mediaViewFragment.A0T = AnonymousClass3MZ.A0l(r3);
            mediaViewFragment.A1D = AnonymousClass10E.AL1(r3);
            mediaViewFragment.A19 = (C136776uN) r5.A0G.get();
            mediaViewFragment.A0f = AnonymousClass3Ma.A0g(r3);
            mediaViewFragment.A0d = AnonymousClass3Ma.A0f(r3);
            mediaViewFragment.A0I = AnonymousClass3MZ.A0U(r3);
            mediaViewFragment.A0c = C108985cd.A0T(r3);
            mediaViewFragment.A1O = C000200d.A00(r3.AVb);
            mediaViewFragment.A0D = AnonymousClass3MZ.A0N(r3);
            mediaViewFragment.A0i = (AnonymousClass689) r3.A5q.get();
            mediaViewFragment.A0K = AnonymousClass10E.A4z(r3);
            mediaViewFragment.A1B = (C26521Sl) r3.A69.get();
            mediaViewFragment.A1X = C000200d.A00(r5.AGC);
            mediaViewFragment.A0Q = AnonymousClass3Ma.A0a(r3);
            mediaViewFragment.A0W = AnonymousClass10E.A6Q(r3);
            mediaViewFragment.A0M = AnonymousClass3MZ.A0g(r3);
            mediaViewFragment.A0L = AnonymousClass3Ma.A0S(r3);
            mediaViewFragment.A15 = (AnonymousClass1W6) r3.A3w.get();
            mediaViewFragment.A0Z = AnonymousClass3MZ.A0o(r3);
            mediaViewFragment.A0s = C108965cb.A0T(r3);
            mediaViewFragment.A0t = AnonymousClass10E.AFe(r3);
            mediaViewFragment.A14 = (AnonymousClass4aW) r5.A5C.get();
            mediaViewFragment.A17 = AnonymousClass10E.AKo(r3);
            mediaViewFragment.A1I = C000200d.A00(r3.A2D);
            mediaViewFragment.A1W = C000200d.A00(r5.AFx);
            mediaViewFragment.A0Y = (AnonymousClass1ST) r3.A6C.get();
            mediaViewFragment.A1C = C108955ca.A0b(r3);
            mediaViewFragment.A0R = (C29781cr) r3.AAq.get();
            mediaViewFragment.A0N = (C24791Lr) r3.A2h.get();
            mediaViewFragment.A1L = C108965cb.A0i(r5);
            mediaViewFragment.A0k = (C32571hP) r3.AY0.get();
            AnonymousClass1K1 r4 = r2.A2O;
            mediaViewFragment.A1R = C000200d.A00(r4.A4i);
            mediaViewFragment.A0w = (C27071Up) r3.Ae9.get();
            mediaViewFragment.A0a = (C32211gp) r3.A9r.get();
            mediaViewFragment.A0U = AnonymousClass3Ma.A0b(r3);
            mediaViewFragment.A0V = AnonymousClass3Ma.A0c(r3);
            mediaViewFragment.A0l = (C32431hB) r3.A66.get();
            mediaViewFragment.A0j = (C32861hs) r3.Agw.get();
            mediaViewFragment.A0v = AnonymousClass3Ma.A0r(r3);
            mediaViewFragment.A1S = C000200d.A00(r3.A6V);
            mediaViewFragment.A1Y = C000200d.A00(r5.A4e);
            mediaViewFragment.A0P = (C31131f4) r3.A6M.get();
            mediaViewFragment.A0p = C36241nZ.A0c(r2);
            mediaViewFragment.A1M = C108965cb.A0j(r5);
            mediaViewFragment.A0u = (AnonymousClass1RU) r3.A6L.get();
            mediaViewFragment.A1U = C000200d.A00(r5.A3S);
            mediaViewFragment.A1a = C000200d.A00(r3.ABc);
            mediaViewFragment.A1Q = C000200d.A00(r3.A5R);
            mediaViewFragment.A0X = AnonymousClass3Ma.A0d(r3);
            mediaViewFragment.A0C = C19890zB.A00;
            mediaViewFragment.A1N = C000200d.A00(r5.A2V);
            mediaViewFragment.A1T = C000200d.A00(r3.A7L);
            mediaViewFragment.A1b = AnonymousClass3MW.A0s(r3);
            mediaViewFragment.A12 = AnonymousClass1K1.A1b(r4);
            mediaViewFragment.A0q = C36241nZ.A0d(r2);
            mediaViewFragment.A1H = C000200d.A00(r3.A14);
            mediaViewFragment.A1Z = C000200d.A00(r2.A1g);
            mediaViewFragment.A1P = C000200d.A00(r2.A1D);
            mediaViewFragment.A1G = C000200d.A00(r3.A13);
            mediaViewFragment.A1J = C000200d.A00(r3.A2I);
            mediaViewFragment.A1V = C000200d.A00(r2.A1T);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A0j();
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
            r2.A0j()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.Hilt_MediaViewFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A0j();
        A25();
    }
}
