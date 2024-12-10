package com.whatsapp.status;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11N;
import X.AnonymousClass11Q;
import X.AnonymousClass126;
import X.AnonymousClass1TF;
import X.AnonymousClass1TG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C108965cb;
import X.C19880zA;
import X.C19890zB;
import X.C23721Hj;
import X.C24631Lb;
import X.C27251Vi;
import X.C36241nZ;
import X.C36271nc;
import X.C40011u0;
import X.C40021u1;
import X.C41751x0;
import X.C51582Yv;
import X.C56622hl;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaListFragment;

public abstract class Hilt_StatusesFragment extends WaListFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A26() {
        if (!this.A02) {
            this.A02 = true;
            StatusesFragment statusesFragment = (StatusesFragment) this;
            AnonymousClass10E r3 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r4 = r3.A00;
            statusesFragment.A00 = AnonymousClass10G.A8i(r4);
            statusesFragment.A0Q = AnonymousClass10E.A6O(r3);
            statusesFragment.A0Z = AnonymousClass10E.A8r(r3);
            statusesFragment.A0D = AnonymousClass10E.A12(r3);
            statusesFragment.A0R = AnonymousClass3MZ.A0l(r3);
            statusesFragment.A0E = AnonymousClass10E.A17(r3);
            statusesFragment.A0p = AnonymousClass10E.AL1(r3);
            statusesFragment.A0P = (AnonymousClass11N) r3.A96.get();
            C19890zB r1 = C19890zB.A00;
            statusesFragment.A08 = r1;
            statusesFragment.A0Y = C108955ca.A0M(r3);
            statusesFragment.A0d = C108965cb.A0X(r3);
            statusesFragment.A0F = (C36271nc) r4.A4x.get();
            statusesFragment.A11 = C000200d.A00(r3.AAV);
            statusesFragment.A0A = AnonymousClass3MZ.A0N(r3);
            statusesFragment.A0L = AnonymousClass3MZ.A0i(r3);
            statusesFragment.A07 = r1;
            statusesFragment.A05 = (C19880zA) r3.A7g.get();
            statusesFragment.A17 = C000200d.A00(r3.AC9);
            statusesFragment.A0H = AnonymousClass10E.A4z(r3);
            statusesFragment.A0o = AnonymousClass3MZ.A13(r3);
            statusesFragment.A0O = AnonymousClass3Ma.A0a(r3);
            statusesFragment.A0J = AnonymousClass3MZ.A0g(r3);
            statusesFragment.A0U = AnonymousClass10E.A6Q(r3);
            statusesFragment.A0I = AnonymousClass3Ma.A0S(r3);
            statusesFragment.A0V = AnonymousClass3MZ.A0o(r3);
            statusesFragment.A0M = AnonymousClass10G.A4A(r4);
            statusesFragment.A0b = AnonymousClass3MZ.A11(r3);
            statusesFragment.A0m = (C41751x0) r4.A4r.get();
            statusesFragment.A14 = C000200d.A00(r3.ABv);
            statusesFragment.A0W = (AnonymousClass1TG) r3.AAF.get();
            statusesFragment.A0t = C000200d.A00(r3.A2b);
            statusesFragment.A0S = AnonymousClass3Ma.A0b(r3);
            statusesFragment.A0T = AnonymousClass3Ma.A0c(r3);
            statusesFragment.A0x = C000200d.A00(r3.AAG);
            statusesFragment.A10 = C000200d.A00(r4.A4s);
            statusesFragment.A0y = C000200d.A00(r3.AAI);
            statusesFragment.A0l = C108965cb.A0Z(r3);
            statusesFragment.A0v = C000200d.A00(r4.A4g);
            statusesFragment.A0X = (C24631Lb) r3.Ajh.get();
            statusesFragment.A0s = C000200d.A00(r3.ADW);
            statusesFragment.A0w = C000200d.A00(r3.AAD);
            statusesFragment.A0G = (C27251Vi) r4.A0q.get();
            statusesFragment.A09 = (C23721Hj) r4.A5b.get();
            statusesFragment.A16 = C000200d.A00(r4.A5I);
            statusesFragment.A0B = (C56622hl) r4.AAM.get();
            statusesFragment.A15 = C000200d.A00(r3.AnZ);
            statusesFragment.A0q = C000200d.A00(r4.A5W);
            statusesFragment.A0N = (AnonymousClass11Q) r3.A2T.get();
            statusesFragment.A0z = C000200d.A00(r3.AAK);
            statusesFragment.A13 = C000200d.A00(r3.AjT);
            statusesFragment.A18 = C000200d.A00(r3.Ans);
            statusesFragment.A0a = (AnonymousClass126) r3.A4h.get();
            statusesFragment.A0r = C000200d.A00(r4.A03);
            statusesFragment.A06 = r1;
            statusesFragment.A0h = (AnonymousClass1TF) r3.AAA.get();
            statusesFragment.A0g = (C40011u0) r4.A4d.get();
            statusesFragment.A0C = (C51582Yv) r4.AAN.get();
            statusesFragment.A0i = (C40021u1) r4.A4c.get();
            statusesFragment.A04 = r1;
            statusesFragment.A0u = AnonymousClass3MX.A11(r3);
            statusesFragment.A03 = r1;
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A01();
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
            r2.A01()
            r2.A26()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.Hilt_StatusesFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A26();
    }
}
