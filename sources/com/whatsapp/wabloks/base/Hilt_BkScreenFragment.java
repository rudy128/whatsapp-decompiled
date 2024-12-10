package com.whatsapp.wabloks.base;

import X.A2V;
import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C000200d;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C109005cf;
import X.C17880vN;
import X.C24051Ir;
import X.C36241nZ;
import X.C57112iY;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BkScreenFragment extends BkFragment implements AnonymousClass009 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C17880vN.A0p();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
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
            r2.A2B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.base.Hilt_BkScreenFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2B() {
        if (this instanceof Hilt_BkFcsPreloadingScreenFragment) {
            Hilt_BkFcsPreloadingScreenFragment hilt_BkFcsPreloadingScreenFragment = (Hilt_BkFcsPreloadingScreenFragment) this;
            if (!hilt_BkFcsPreloadingScreenFragment.A00) {
                hilt_BkFcsPreloadingScreenFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_BkFcsPreloadingScreenFragment);
                BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = (BkFcsPreloadingScreenFragment) hilt_BkFcsPreloadingScreenFragment;
                C36241nZ r3 = (C36241nZ) A0S;
                AnonymousClass10E r2 = r3.A2Q;
                AnonymousClass10G r1 = r2.A00;
                bkFcsPreloadingScreenFragment.A05 = C000200d.A00(r1.AFQ);
                bkFcsPreloadingScreenFragment.A04 = (C57112iY) r1.AJ4.get();
                C109005cf.A0Y(r3, r2, r1, AnonymousClass10E.A8r(r2), bkFcsPreloadingScreenFragment);
                bkFcsPreloadingScreenFragment.A03 = r2.AL6();
                bkFcsPreloadingScreenFragment.A02 = (A2V) r2.AB2.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            BkScreenFragment bkScreenFragment = (BkScreenFragment) this;
            C36241nZ r4 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r22 = r4.A2Q;
            AnonymousClass10G r12 = r22.A00;
            bkScreenFragment.A05 = C000200d.A00(r12.AFQ);
            bkScreenFragment.A04 = (C57112iY) r12.AJ4.get();
            C109005cf.A0Y(r4, r22, r12, AnonymousClass10E.A8r(r22), bkScreenFragment);
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
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2B();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
