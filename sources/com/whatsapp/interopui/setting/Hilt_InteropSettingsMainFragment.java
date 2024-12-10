package com.whatsapp.interopui.setting;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass3MW;
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

public abstract class Hilt_InteropSettingsMainFragment extends Fragment implements AnonymousClass009 {
    public boolean A00 = false;
    public ContextWrapper A01;
    public boolean A02;
    public final Object A03 = C17880vN.A0p();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r4) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r4) {
        /*
            r3 = this;
            r2 = 1
            r3.A0X = r2
            android.content.ContextWrapper r0 = r3.A01
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r4) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r3.A00()
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0029
            r3.A00 = r2
            java.lang.Object r1 = r3.generatedComponent()
            X.03z r1 = (X.C008903z) r1
            r0 = r3
            com.whatsapp.interopui.setting.InteropSettingsMainFragment r0 = (com.whatsapp.interopui.setting.InteropSettingsMainFragment) r0
            X.1nZ r1 = (X.C36241nZ) r1
            X.C36241nZ.A1u(r1, r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.setting.Hilt_InteropSettingsMainFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass3MW.A0t(super.A1n(), this);
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
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        if (!this.A00) {
            this.A00 = true;
            C36241nZ.A1u((C36241nZ) ((C008903z) generatedComponent()), (InteropSettingsMainFragment) this);
        }
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
