package com.whatsapp.instrumentation.ui;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.C008603v;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C17880vN;
import X.C24051Ir;
import X.C36241nZ;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public abstract class Hilt_ConfirmFragment extends Fragment implements AnonymousClass009 {
    public boolean A00 = false;
    public ContextWrapper A01;
    public boolean A02;
    public final Object A03 = C17880vN.A0p();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C008803x.A00(r0) == r6) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r6) {
        /*
            r5 = this;
            r4 = 1
            r5.A0X = r4
            android.content.ContextWrapper r0 = r5.A01
            r3 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C008803x.A00(r0)
            r2 = 0
            if (r0 != r6) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.String r1 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C008303s.A00(r1, r0, r2)
            r5.A00()
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x002e
            r5.A00 = r4
            java.lang.Object r1 = r5.generatedComponent()
            X.03z r1 = (X.C008903z) r1
            r0 = r5
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = (com.whatsapp.instrumentation.ui.ConfirmFragment) r0
            X.1nZ r1 = (X.C36241nZ) r1
            X.C36241nZ.A1r(r1, r0)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.ui.Hilt_ConfirmFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A01 == null) {
            this.A01 = new C008603v(super.A1n(), (Fragment) this);
            this.A02 = C008703w.A00(super.A1n());
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
        if (super.A1n() == null && !this.A02) {
            return null;
        }
        A00();
        return this.A01;
    }

    public LayoutInflater A1o(Bundle bundle) {
        LayoutInflater A1o = super.A1o(bundle);
        return A1o.cloneInContext(new C008603v(A1o, (Fragment) this));
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        if (!this.A00) {
            this.A00 = true;
            C36241nZ.A1r((C36241nZ) ((C008903z) generatedComponent()), (ConfirmFragment) this);
        }
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
