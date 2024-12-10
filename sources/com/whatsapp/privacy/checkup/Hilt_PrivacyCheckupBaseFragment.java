package com.whatsapp.privacy.checkup;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1NT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C008903z;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_PrivacyCheckupBaseFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (this instanceof Hilt_PrivacyCheckupMoreSecurityFragment) {
            Hilt_PrivacyCheckupMoreSecurityFragment hilt_PrivacyCheckupMoreSecurityFragment = (Hilt_PrivacyCheckupMoreSecurityFragment) this;
            if (!hilt_PrivacyCheckupMoreSecurityFragment.A00) {
                hilt_PrivacyCheckupMoreSecurityFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_PrivacyCheckupMoreSecurityFragment);
                PrivacyCheckupMoreSecurityFragment privacyCheckupMoreSecurityFragment = (PrivacyCheckupMoreSecurityFragment) hilt_PrivacyCheckupMoreSecurityFragment;
                C36241nZ r3 = (C36241nZ) A0S;
                AnonymousClass10E r2 = r3.A2Q;
                AnonymousClass10G r1 = r2.A00;
                C72483Me.A0p(r3, r1, C72473Md.A0T(r2, r1, privacyCheckupMoreSecurityFragment), privacyCheckupMoreSecurityFragment);
                privacyCheckupMoreSecurityFragment.A01 = AnonymousClass3Ma.A0g(r2);
                privacyCheckupMoreSecurityFragment.A01 = C000200d.A00(r2.A0J);
                privacyCheckupMoreSecurityFragment.A00 = AnonymousClass10E.A17(r2);
            }
        } else if (this instanceof Hilt_PrivacyCheckupMorePrivacyFragment) {
            Hilt_PrivacyCheckupMorePrivacyFragment hilt_PrivacyCheckupMorePrivacyFragment = (Hilt_PrivacyCheckupMorePrivacyFragment) this;
            if (!hilt_PrivacyCheckupMorePrivacyFragment.A00) {
                hilt_PrivacyCheckupMorePrivacyFragment.A00 = true;
                C008903z A0S2 = AnonymousClass3MX.A0S(hilt_PrivacyCheckupMorePrivacyFragment);
                PrivacyCheckupMorePrivacyFragment privacyCheckupMorePrivacyFragment = (PrivacyCheckupMorePrivacyFragment) hilt_PrivacyCheckupMorePrivacyFragment;
                C36241nZ r32 = (C36241nZ) A0S2;
                AnonymousClass10E r22 = r32.A2Q;
                AnonymousClass10G r12 = r22.A00;
                C72483Me.A0p(r32, r12, C72473Md.A0T(r22, r12, privacyCheckupMorePrivacyFragment), privacyCheckupMorePrivacyFragment);
                privacyCheckupMorePrivacyFragment.A01 = AnonymousClass3Ma.A0g(r22);
                privacyCheckupMorePrivacyFragment.A02 = AnonymousClass3MZ.A0h(r22);
                privacyCheckupMorePrivacyFragment.A01 = (AnonymousClass1NT) r22.A3f.get();
                privacyCheckupMorePrivacyFragment.A00 = AnonymousClass10E.A17(r22);
            }
        } else if (!this.A02) {
            this.A02 = true;
            PrivacyCheckupBaseFragment privacyCheckupBaseFragment = (PrivacyCheckupBaseFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r23 = r4.A2Q;
            AnonymousClass10G r13 = r23.A00;
            C72483Me.A0p(r4, r13, C72473Md.A0T(r23, r13, privacyCheckupBaseFragment), privacyCheckupBaseFragment);
            privacyCheckupBaseFragment.A01 = AnonymousClass3Ma.A0g(r23);
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
            r2.A00()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.checkup.Hilt_PrivacyCheckupBaseFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
