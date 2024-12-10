package com.whatsapp.base;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass1Bd;
import X.AnonymousClass1DC;
import X.AnonymousClass1HS;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1TA;
import X.AnonymousClass1TD;
import X.AnonymousClass1V9;
import X.AnonymousClass1VP;
import X.C000200d;
import X.C008603v;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C18000vb;
import X.C18030ve;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C22621Co;
import X.C24051Ir;
import X.C24671Lf;
import X.C24901Mc;
import X.C27081Uq;
import X.C27201Vd;
import X.C36241nZ;
import X.C36271nc;
import X.C36401np;
import X.C40241uO;
import X.C40251uP;
import X.C40261uQ;
import X.C40751vD;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.whatsapp.Hilt_ConversationFragment;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.calling.callhistory.view.Hilt_CallsHistoryFragment;
import com.whatsapp.community.CommunityFragment;
import com.whatsapp.community.Hilt_CommunityFragment;

public abstract class Hilt_WaFragment extends Fragment implements AnonymousClass009 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C008803x.A00(r0) == r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r5) {
        /*
            r4 = this;
            r0 = 1
            r4.A0X = r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.base.Hilt_WaFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        C008903z r1;
        Hilt_ConversationFragment hilt_ConversationFragment;
        if (this instanceof Hilt_CommunityFragment) {
            Hilt_CommunityFragment hilt_CommunityFragment = (Hilt_CommunityFragment) this;
            if (!hilt_CommunityFragment.A00) {
                hilt_CommunityFragment.A00 = true;
                CommunityFragment communityFragment = (CommunityFragment) hilt_CommunityFragment;
                C36241nZ r3 = (C36241nZ) ((C008903z) hilt_CommunityFragment.generatedComponent());
                AnonymousClass10E r2 = r3.A2Q;
                AnonymousClass10G r4 = r2.A00;
                communityFragment.A00 = AnonymousClass10G.A8i(r4);
                communityFragment.A0D = (C18030ve) r2.A04.get();
                communityFragment.A00 = (AnonymousClass1L9) r2.A0E.get();
                communityFragment.A0E = C000200d.A00(r2.A1K);
                communityFragment.A0B = (C22621Co) r2.A27.get();
                communityFragment.A0F = C000200d.A00(r2.A2A);
                communityFragment.A0G = C000200d.A00(r2.A2F);
                communityFragment.A0H = C000200d.A00(r2.A2L);
                communityFragment.A0I = C000200d.A00(r2.A2M);
                communityFragment.A02 = (C40241uO) r3.A0Q.get();
                communityFragment.A06 = (C24671Lf) r2.A2g.get();
                communityFragment.A07 = (C27201Vd) r2.A2j.get();
                communityFragment.A0C = (AnonymousClass1NN) r2.A2q.get();
                communityFragment.A03 = (C40251uP) r3.A0R.get();
                communityFragment.A04 = (AnonymousClass1KB) r2.A4b.get();
                communityFragment.A0J = C000200d.A00(r2.A4u);
                communityFragment.A0K = C000200d.A00(r2.A74);
                communityFragment.A0L = C000200d.A00(r4.A4a);
                communityFragment.A01 = (C40261uQ) r3.A2O.A1n.get();
                communityFragment.A08 = (AnonymousClass11P) r2.AAv.get();
                communityFragment.A09 = (C19830z4) r2.ABl.get();
                communityFragment.A0A = (C18000vb) r2.ABz.get();
            }
        } else if (this instanceof Hilt_CallsHistoryFragment) {
            Hilt_CallsHistoryFragment hilt_CallsHistoryFragment = (Hilt_CallsHistoryFragment) this;
            if (!hilt_CallsHistoryFragment.A00) {
                hilt_CallsHistoryFragment.A00 = true;
                CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) hilt_CallsHistoryFragment;
                C36241nZ r42 = (C36241nZ) ((C008903z) hilt_CallsHistoryFragment.generatedComponent());
                AnonymousClass10E r32 = r42.A2Q;
                AnonymousClass10G r22 = r32.A00;
                callsHistoryFragment.A00 = AnonymousClass10G.A8i(r22);
                callsHistoryFragment.A0M = (AnonymousClass11P) r32.AAv.get();
                callsHistoryFragment.A0T = (C18030ve) r32.A04.get();
                callsHistoryFragment.A0B = (C40751vD) r32.AB7.get();
                callsHistoryFragment.A08 = (AnonymousClass1KB) r32.A4b.get();
                callsHistoryFragment.A0X = (C36401np) r22.A30.get();
                callsHistoryFragment.A09 = (AnonymousClass11S) r32.A63.get();
                callsHistoryFragment.A0f = (AnonymousClass10I) r32.AC1.get();
                C19890zB r5 = C19890zB.A00;
                callsHistoryFragment.A06 = r5;
                callsHistoryFragment.A0W = (C24901Mc) r32.AA5.get();
                callsHistoryFragment.A0A = (C36271nc) r22.A4x.get();
                callsHistoryFragment.A0D = (AnonymousClass1VP) r32.A1l.get();
                callsHistoryFragment.A07 = (AnonymousClass1L9) r32.A0E.get();
                callsHistoryFragment.A0J = (C27201Vd) r32.A2j.get();
                callsHistoryFragment.A05 = r5;
                callsHistoryFragment.A0V = (AnonymousClass1Bd) r32.AA7.get();
                callsHistoryFragment.A0Y = (AnonymousClass1DC) r32.A95.get();
                callsHistoryFragment.A0S = AnonymousClass10E.A84(r32);
                callsHistoryFragment.A04 = (C19880zA) r32.A7g.get();
                callsHistoryFragment.A0F = (AnonymousClass1HS) r32.A98.get();
                callsHistoryFragment.A0G = (AnonymousClass1M9) r32.A2f.get();
                callsHistoryFragment.A0K = AnonymousClass10G.A4A(r22);
                callsHistoryFragment.A0L = (AnonymousClass11C) r32.AAp.get();
                callsHistoryFragment.A0N = (C18000vb) r32.ABz.get();
                callsHistoryFragment.A0U = (AnonymousClass126) r32.A4h.get();
                callsHistoryFragment.A0O = (AnonymousClass1TD) r32.A1m.get();
                callsHistoryFragment.A0o = C000200d.A00(r22.A4a);
                callsHistoryFragment.A0m = C000200d.A00(r42.A03);
                callsHistoryFragment.A0i = C000200d.A00(r32.A2b);
                callsHistoryFragment.A0R = (C27081Uq) r32.A9g.get();
                callsHistoryFragment.A0Q = (AnonymousClass1TA) r32.A5X.get();
                callsHistoryFragment.A0E = (AnonymousClass1V9) r32.A1e.get();
                callsHistoryFragment.A0k = C000200d.A00(r32.A74);
                callsHistoryFragment.A0n = C000200d.A00(r22.A4R);
                callsHistoryFragment.A0j = C000200d.A00(r32.A3J);
                callsHistoryFragment.A0P = (AnonymousClass1MZ) r32.A4t.get();
                callsHistoryFragment.A0r = C000200d.A00(r32.ABd);
                callsHistoryFragment.A0q = C000200d.A00(r32.ABV);
                callsHistoryFragment.A0l = C000200d.A00(r32.A8W);
                callsHistoryFragment.A0p = C000200d.A00(r22.A4w);
                callsHistoryFragment.A0h = C000200d.A00(r32.A22);
                callsHistoryFragment.A0g = C000200d.A00(r22.A0p);
            }
        } else {
            if (this instanceof Hilt_ConversationFragment) {
                Hilt_ConversationFragment hilt_ConversationFragment2 = (Hilt_ConversationFragment) this;
                if (!hilt_ConversationFragment2.A00) {
                    hilt_ConversationFragment2.A00 = true;
                    r1 = (C008903z) hilt_ConversationFragment2.generatedComponent();
                    hilt_ConversationFragment = hilt_ConversationFragment2;
                } else {
                    return;
                }
            } else if (!this.A02) {
                this.A02 = true;
                r1 = (C008903z) generatedComponent();
                hilt_ConversationFragment = (WaFragment) this;
            } else {
                return;
            }
            hilt_ConversationFragment.A00 = AnonymousClass10G.A8i(((C36241nZ) r1).A2Q.A00);
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C008803x(this);
                }
            }
        }
        return this.A04.generatedComponent();
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

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
