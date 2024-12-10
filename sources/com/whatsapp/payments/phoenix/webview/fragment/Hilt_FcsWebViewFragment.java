package com.whatsapp.payments.phoenix.webview.fragment;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass1RK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C17880vN;
import X.C24051Ir;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment;
import com.whatsapp.flows.phoenix.webview.Hilt_FcsFlowsWebViewFragment;

public abstract class Hilt_FcsWebViewFragment extends Fragment implements AnonymousClass009 {
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
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.Hilt_FcsWebViewFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (this instanceof Hilt_FcsFlowsWebViewFragment) {
            Hilt_FcsFlowsWebViewFragment hilt_FcsFlowsWebViewFragment = (Hilt_FcsFlowsWebViewFragment) this;
            if (!hilt_FcsFlowsWebViewFragment.A00) {
                hilt_FcsFlowsWebViewFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_FcsFlowsWebViewFragment);
                FcsFlowsWebViewFragment fcsFlowsWebViewFragment = (FcsFlowsWebViewFragment) hilt_FcsFlowsWebViewFragment;
                AnonymousClass10E r2 = ((C36241nZ) A0S).A2Q;
                fcsFlowsWebViewFragment.A01 = AnonymousClass10E.A8r(r2);
                fcsFlowsWebViewFragment.A03 = AnonymousClass3MX.A10(r2);
                fcsFlowsWebViewFragment.A02 = AnonymousClass10E.AKP(r2);
                fcsFlowsWebViewFragment.A04 = C000200d.A00(r2.ATO);
                fcsFlowsWebViewFragment.A05 = C000200d.A00(r2.AB2);
                fcsFlowsWebViewFragment.A00 = AnonymousClass3MZ.A0N(r2);
                fcsFlowsWebViewFragment.A04 = (AnonymousClass1RK) r2.A2R.get();
                fcsFlowsWebViewFragment.A03 = AnonymousClass3MZ.A0n(r2);
                fcsFlowsWebViewFragment.A06 = AnonymousClass3MX.A12(r2);
                fcsFlowsWebViewFragment.A07 = C000200d.A00(r2.ATr);
                fcsFlowsWebViewFragment.A01 = AnonymousClass10E.A12(r2);
                fcsFlowsWebViewFragment.A02 = AnonymousClass3MZ.A0f(r2);
                fcsFlowsWebViewFragment.A05 = AnonymousClass10E.AL1(r2);
                fcsFlowsWebViewFragment.A08 = C000200d.A00(r2.An3);
                fcsFlowsWebViewFragment.A09 = C000200d.A00(r2.An4);
            }
        } else if (!this.A02) {
            this.A02 = true;
            FcsWebViewFragment fcsWebViewFragment = (FcsWebViewFragment) this;
            AnonymousClass10E r1 = ((C36241nZ) ((C008903z) generatedComponent())).A2Q;
            fcsWebViewFragment.A01 = AnonymousClass10E.A8r(r1);
            fcsWebViewFragment.A03 = AnonymousClass3MX.A10(r1);
            fcsWebViewFragment.A02 = AnonymousClass10E.AKP(r1);
            fcsWebViewFragment.A04 = C000200d.A00(r1.ATO);
            fcsWebViewFragment.A05 = C000200d.A00(r1.AB2);
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
        A25();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
