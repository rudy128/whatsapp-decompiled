package com.whatsapp.conversationslist;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass12L;
import X.AnonymousClass18K;
import X.AnonymousClass1Bd;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Cd;
import X.AnonymousClass1DC;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MC;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NH;
import X.AnonymousClass1NN;
import X.AnonymousClass1Nb;
import X.AnonymousClass1PU;
import X.AnonymousClass1PW;
import X.AnonymousClass1QB;
import X.AnonymousClass1QO;
import X.AnonymousClass1R5;
import X.AnonymousClass1RK;
import X.AnonymousClass1VD;
import X.AnonymousClass1VT;
import X.AnonymousClass1XN;
import X.C000200d;
import X.C008603v;
import X.C008703w;
import X.C008903z;
import X.C18000vb;
import X.C18030ve;
import X.C18600wl;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C199610h;
import X.C22621Co;
import X.C23631Ha;
import X.C23651Hc;
import X.C24671Lf;
import X.C24791Lr;
import X.C24901Mc;
import X.C24921Me;
import X.C25161Nd;
import X.C25181Nf;
import X.C25491Ok;
import X.C26911Ty;
import X.C27201Vd;
import X.C27231Vg;
import X.C29781cr;
import X.C30251dd;
import X.C32531hL;
import X.C32791hl;
import X.C33451iq;
import X.C34591kk;
import X.C34771l3;
import X.C36241nZ;
import X.C36261nb;
import X.C36271nc;
import X.C36451nu;
import X.C36461nv;
import X.C36491nz;
import X.C36501o0;
import X.C36511o1;
import X.C36521o2;
import X.C36531o3;
import X.C36711oL;
import X.C36731oN;
import X.C36741oO;
import X.C36751oP;
import X.C36761oQ;
import X.C36781oS;
import X.C36801oU;
import X.C36841oY;
import X.C36861oa;
import X.C36871ob;
import X.C36881oc;
import X.C36891od;
import X.C36901oe;
import X.C36911of;
import X.C36921og;
import X.C36931oh;
import X.C36951oj;
import X.C36961ok;
import X.C36971ol;
import X.C36981om;
import X.C36991on;
import X.C37281pG;
import X.C37311pJ;
import X.C37331pL;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.suggestions.SuggestionsEngine;

public abstract class Hilt_ConversationsFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            ConversationsFragment conversationsFragment = (ConversationsFragment) this;
            C36241nZ r3 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r4 = r3.A2Q;
            AnonymousClass10G r2 = r4.A00;
            conversationsFragment.A00 = AnonymousClass10G.A8i(r2);
            conversationsFragment.A1r = (AnonymousClass118) r4.ABY.get();
            conversationsFragment.A1q = (AnonymousClass11P) r4.AAv.get();
            conversationsFragment.A25 = (C18030ve) r4.A04.get();
            conversationsFragment.A0r = (AnonymousClass1KB) r4.A4b.get();
            conversationsFragment.A2d = (AnonymousClass1L4) r2.A2e.get();
            conversationsFragment.A0s = (AnonymousClass11S) r4.A63.get();
            conversationsFragment.A2f = (AnonymousClass10I) r4.AC1.get();
            conversationsFragment.A15 = (AnonymousClass1PW) r4.A13.get();
            conversationsFragment.A1v = (AnonymousClass1CJ) r4.A2H.get();
            conversationsFragment.A27 = (AnonymousClass18K) r4.A9B.get();
            conversationsFragment.A1u = (C22621Co) r4.A27.get();
            conversationsFragment.A2X = (C24901Mc) r4.AA5.get();
            conversationsFragment.A0t = (C36271nc) r2.A4x.get();
            conversationsFragment.A26 = (AnonymousClass12L) r4.A90.get();
            conversationsFragment.A3I = C000200d.A00(r4.A5n);
            conversationsFragment.A3c = C000200d.A00(r4.ABd);
            conversationsFragment.A0e = (AnonymousClass1L9) r4.A0E.get();
            conversationsFragment.A2g = (AnonymousClass1VT) r4.A1X.get();
            conversationsFragment.A1E = (C27201Vd) r4.A2j.get();
            conversationsFragment.A20 = (AnonymousClass1NH) r4.A5b.get();
            conversationsFragment.A2i = C000200d.A00(r2.A00);
            C19890zB r5 = C19890zB.A00;
            conversationsFragment.A0b = r5;
            conversationsFragment.A18 = (AnonymousClass1M9) r4.A2f.get();
            conversationsFragment.A2c = (AnonymousClass1PU) r4.A4j.get();
            conversationsFragment.A2K = (AnonymousClass1Bd) r4.AA7.get();
            conversationsFragment.A2e = (AnonymousClass1DC) r4.A95.get();
            conversationsFragment.A1o = (AnonymousClass11C) r4.AAp.get();
            conversationsFragment.A1A = (C24921Me) r4.ABX.get();
            conversationsFragment.A1t = (C18000vb) r4.ABz.get();
            conversationsFragment.A1y = (AnonymousClass1QB) r4.A4T.get();
            conversationsFragment.A2l = C000200d.A00(r4.A0p);
            conversationsFragment.A3Z = C000200d.A00(r2.A50);
            conversationsFragment.A0c = r5;
            conversationsFragment.A2a = (C27231Vg) r4.A0N.get();
            conversationsFragment.A16 = (AnonymousClass1MC) r4.A21.get();
            conversationsFragment.A19 = (C24671Lf) r4.A2g.get();
            conversationsFragment.A28 = (AnonymousClass126) r4.A4h.get();
            conversationsFragment.A1F = (C36261nb) r2.A2t.get();
            conversationsFragment.A2Y = AnonymousClass10E.AKo(r4);
            conversationsFragment.A0x = (C23651Hc) r4.ACD.get();
            conversationsFragment.A1f = AnonymousClass10G.A4A(r2);
            conversationsFragment.A2Z = (C36451nu) r4.A0G.get();
            conversationsFragment.A1B = (C25491Ok) r4.A1F.get();
            conversationsFragment.A2R = (AnonymousClass1Nb) r4.A2E.get();
            conversationsFragment.A13 = (C36461nv) r2.A3c.get();
            conversationsFragment.A2V = (SuggestionsEngine) r3.A1e.get();
            conversationsFragment.A1p = (C29781cr) r4.AAq.get();
            conversationsFragment.A2P = (C33451iq) r4.ABJ.get();
            conversationsFragment.A0v = (C32531hL) r4.ABm.get();
            conversationsFragment.A2o = C000200d.A00(r4.A12);
            conversationsFragment.A2p = C000200d.A00(r4.A14);
            conversationsFragment.A0Y = r5;
            AnonymousClass1K1 r6 = r3.A2O;
            conversationsFragment.A0f = (C36491nz) r6.A1l.get();
            conversationsFragment.A0g = (C36501o0) r6.A1m.get();
            conversationsFragment.A1C = (C24791Lr) r4.A2h.get();
            conversationsFragment.A2B = (AnonymousClass1MB) r4.AAb.get();
            conversationsFragment.A22 = (C34591kk) r4.AB5.get();
            conversationsFragment.A2z = C000200d.A00(r4.A2B);
            conversationsFragment.A3a = C000200d.A00(r2.A55);
            conversationsFragment.A0W = (C19880zA) r4.A7g.get();
            conversationsFragment.A29 = (C36511o1) r6.A4C.get();
            conversationsFragment.A21 = (AnonymousClass1Cd) r4.A6i.get();
            conversationsFragment.A1s = (C19830z4) r4.ABl.get();
            conversationsFragment.A2w = C000200d.A00(r4.A24);
            conversationsFragment.A2m = C000200d.A00(r4.A0x);
            conversationsFragment.A2v = C000200d.A00(r4.A1U);
            conversationsFragment.A3U = C000200d.A00(r4.A4Z);
            conversationsFragment.A2E = (AnonymousClass1XN) r2.A0d.get();
            conversationsFragment.A1H = (C36521o2) r4.A2l.get();
            conversationsFragment.A1K = (C25161Nd) r4.A2v.get();
            conversationsFragment.A2x = C000200d.A00(r4.A25);
            conversationsFragment.A39 = C000200d.A00(r4.A4J);
            conversationsFragment.A2j = C000200d.A00(r4.A0F);
            conversationsFragment.A3D = C000200d.A00(r4.A59);
            conversationsFragment.A3V = C000200d.A00(r2.A4X);
            conversationsFragment.A1I = (C36531o3) r4.A2n.get();
            conversationsFragment.A1x = (AnonymousClass1NN) r4.A2q.get();
            conversationsFragment.A2H = (AnonymousClass1R5) r4.A8A.get();
            conversationsFragment.A2I = (AnonymousClass1QO) r4.A8G.get();
            conversationsFragment.A2Q = (AnonymousClass1VD) r4.A9J.get();
            conversationsFragment.A17 = AnonymousClass10E.A48(r4);
            conversationsFragment.A2y = C000200d.A00(r4.A2A);
            conversationsFragment.A30 = C000200d.A00(r4.A2F);
            conversationsFragment.A3J = C000200d.A00(r6.A4n);
            conversationsFragment.A3X = C000200d.A00(r2.A4a);
            conversationsFragment.A0a = r5;
            conversationsFragment.A11 = AnonymousClass1K1.A08(r6);
            conversationsFragment.A12 = (C26911Ty) r4.A1J.get();
            conversationsFragment.A23 = (AnonymousClass1RK) r4.A2R.get();
            conversationsFragment.A3A = C000200d.A00(r4.A4K);
            conversationsFragment.A33 = C000200d.A00(r4.A2b);
            conversationsFragment.A3F = C000200d.A00(r3.A1E);
            conversationsFragment.A3N = C000200d.A00(r2.A3U);
            conversationsFragment.A3W = C000200d.A00(r4.AA1);
            conversationsFragment.A3e = C000200d.A00(r2.A5J);
            conversationsFragment.A3j = (C18600wl) r4.A9E.get();
            conversationsFragment.A1J = (C32791hl) r4.A2t.get();
            conversationsFragment.A2M = (C36711oL) r2.A4N.get();
            conversationsFragment.A2O = (C36731oN) r2.A56.get();
            conversationsFragment.A32 = C000200d.A00(r4.A2L);
            conversationsFragment.A3P = C000200d.A00(r4.A7s);
            conversationsFragment.A2b = (C36741oO) r2.A1L.get();
            conversationsFragment.A1z = (AnonymousClass1MZ) r4.A4t.get();
            conversationsFragment.A1R = (C36751oP) r2.A37.get();
            conversationsFragment.A3E = C000200d.A00(r4.A5U);
            conversationsFragment.A3H = C000200d.A00(r6.A4W);
            conversationsFragment.A3b = C000200d.A00(r2.A59);
            conversationsFragment.A3d = C000200d.A00(r4.ABj);
            conversationsFragment.A0Z = r5;
            conversationsFragment.A2k = C000200d.A00(r4.A0j);
            conversationsFragment.A1w = (C25181Nf) r4.A2o.get();
            conversationsFragment.A2u = C000200d.A00(r4.A1K);
            conversationsFragment.A3L = C000200d.A00(r2.A3E);
            conversationsFragment.A2W = new C36761oQ((C18030ve) r4.A04.get());
            conversationsFragment.A1c = (C36781oS) r2.A19.get();
            conversationsFragment.A3S = C000200d.A00(r4.A8f);
            conversationsFragment.A2T = (C34771l3) r2.A0E.get();
            conversationsFragment.A0y = (C36801oU) r4.A4c.get();
            conversationsFragment.A3B = C000200d.A00(r4.A4u);
            conversationsFragment.A0T = r5;
            conversationsFragment.A34 = C000200d.A00(r3.A06);
            conversationsFragment.A1n = (AnonymousClass11Q) r4.A2T.get();
            conversationsFragment.A10 = (C36861oa) r4.A4g.get();
            conversationsFragment.A3M = C000200d.A00(r2.A3F);
            conversationsFragment.A36 = C000200d.A00(r2.A17);
            conversationsFragment.A2J = (C36871ob) r6.A5Q.get();
            conversationsFragment.A3O = C000200d.A00(r2.A3f);
            conversationsFragment.A37 = C000200d.A00(r6.A0q);
            conversationsFragment.A3K = C000200d.A00(r6.A4l);
            conversationsFragment.A0i = (C36881oc) r3.A0b.get();
            conversationsFragment.A0z = (C36841oY) r4.A4f.get();
            conversationsFragment.A0Q = r5;
            conversationsFragment.A0j = (C36891od) r3.A0c.get();
            conversationsFragment.A0k = (C36901oe) r3.A0d.get();
            conversationsFragment.A3G = C000200d.A00(r4.A5c);
            conversationsFragment.A2t = C000200d.A00(r4.A1G);
            conversationsFragment.A0X = r5;
            conversationsFragment.A2s = C000200d.A00(r4.A1C);
            conversationsFragment.A2G = (C30251dd) r4.A7X.get();
            conversationsFragment.A0l = (C36911of) r3.A0f.get();
            conversationsFragment.A2F = (C36921og) r2.A1S.get();
            conversationsFragment.A14 = (C36931oh) r6.A3o.get();
            conversationsFragment.A0m = (C36951oj) r3.A0g.get();
            conversationsFragment.A0V = r5;
            conversationsFragment.A3Y = C000200d.A00(r3.A1d);
            conversationsFragment.A0U = r5;
            conversationsFragment.A0n = (C36961ok) r3.A0h.get();
            conversationsFragment.A2n = C000200d.A00(r6.A0E);
            conversationsFragment.A35 = C000200d.A00(r2.A16);
            conversationsFragment.A2D = (C36971ol) r2.A0o.get();
            conversationsFragment.A0h = (C36981om) r6.A1p.get();
            conversationsFragment.A0o = (C36991on) r3.A0i.get();
            Object obj = r4.A5J.get();
            C199610h.A04(obj);
            conversationsFragment.A0R = new C23631Ha(obj);
            conversationsFragment.A0d = r5;
            conversationsFragment.A2L = (C37281pG) r2.A2H.get();
            conversationsFragment.A3Q = C000200d.A00(r4.A8b);
            conversationsFragment.A3R = C000200d.A00(r2.A3r);
            conversationsFragment.A24 = (AnonymousClass1KW) r4.A3d.get();
            conversationsFragment.A1G = (C37311pJ) r6.A4y.get();
            conversationsFragment.A0S = r5;
            conversationsFragment.A2h = (C37331pL) r2.A33.get();
            conversationsFragment.A2q = C000200d.A00(r4.A19);
            conversationsFragment.A2r = C000200d.A00(r4.A1B);
            conversationsFragment.A3T = C000200d.A00(r3.A1Y);
            conversationsFragment.A3C = C000200d.A00(r2.A2c);
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
        LayoutInflater A1o = super.A1o(bundle);
        return A1o.cloneInContext(new C008603v(A1o, (Fragment) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C008803x.A00(r0) == r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r5) {
        /*
            r4 = this;
            super.A1p(r5)
            android.content.ContextWrapper r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C008803x.A00(r0)
            r2 = 0
            if (r0 != r5) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.String r1 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C008303s.A00(r1, r0, r2)
            r4.A00()
            r4.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_ConversationsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
