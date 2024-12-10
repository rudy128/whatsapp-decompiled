package com.whatsapp.base;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.C008603v;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C18000vb;
import X.C18030ve;
import X.C24051Ir;
import X.C36241nZ;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.dialogs.Hilt_ProgressDialogFragment;

public abstract class Hilt_WaDialogFragment extends DialogFragment implements AnonymousClass009 {
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
            r4.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.base.Hilt_WaDialogFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        C008903z r1;
        Hilt_ProgressDialogFragment hilt_ProgressDialogFragment;
        if (this instanceof Hilt_ProgressDialogFragment) {
            Hilt_ProgressDialogFragment hilt_ProgressDialogFragment2 = (Hilt_ProgressDialogFragment) this;
            if (!hilt_ProgressDialogFragment2.A00) {
                hilt_ProgressDialogFragment2.A00 = true;
                r1 = (C008903z) hilt_ProgressDialogFragment2.generatedComponent();
                hilt_ProgressDialogFragment = hilt_ProgressDialogFragment2;
            } else {
                return;
            }
        } else if (!this.A02) {
            this.A02 = true;
            r1 = (C008903z) generatedComponent();
            hilt_ProgressDialogFragment = (WaDialogFragment) this;
        } else {
            return;
        }
        AnonymousClass10E r2 = ((C36241nZ) r1).A2Q;
        hilt_ProgressDialogFragment.A02 = (C18030ve) r2.A04.get();
        hilt_ProgressDialogFragment.A04 = (AnonymousClass10I) r2.AC1.get();
        hilt_ProgressDialogFragment.A01 = (C18000vb) r2.ABz.get();
        hilt_ProgressDialogFragment.A03 = AnonymousClass10G.A8i(r2.A00);
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
        A2E();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
