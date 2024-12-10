package com.whatsapp.payments.ui;

import X.A54;
import X.A5H;
import X.A5Y;
import X.AXR;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass8BY;
import X.C008703w;
import X.C170628qP;
import X.C170648qR;
import X.C184809bY;
import X.C188919iD;
import X.C191079lz;
import X.C191529mk;
import X.C195929uA;
import X.C20749AXe;
import X.C30921ej;
import X.C33331ie;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BrazilPaymentSettingsFragment extends PaymentSettingsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            AnonymousClass10E r3 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass8BY.A0t(r3, brazilPaymentSettingsFragment);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass8BY.A0q(r3, r2, brazilPaymentSettingsFragment, AnonymousClass10G.A8i(r2));
            brazilPaymentSettingsFragment.A0B = AnonymousClass10E.A12(r3);
            brazilPaymentSettingsFragment.A0L = AnonymousClass3MZ.A0l(r3);
            AnonymousClass8BY.A0r(r3, r2, brazilPaymentSettingsFragment, r2.A30);
            AnonymousClass8BY.A0u(r3, brazilPaymentSettingsFragment, r3.A8F.get());
            brazilPaymentSettingsFragment.A04 = AnonymousClass3MY.A0Z(r3);
            brazilPaymentSettingsFragment.A09 = (C191529mk) r2.AEk.get();
            brazilPaymentSettingsFragment.A01 = AnonymousClass3MZ.A0N(r3);
            brazilPaymentSettingsFragment.A02 = (C170648qR) r2.A6h.get();
            brazilPaymentSettingsFragment.A00 = AnonymousClass8BV.A0A(r3);
            brazilPaymentSettingsFragment.A05 = (AXR) r2.A6y.get();
            brazilPaymentSettingsFragment.A0H = (C20749AXe) r2.A73.get();
            brazilPaymentSettingsFragment.A0G = (C195929uA) r2.AEU.get();
            brazilPaymentSettingsFragment.A03 = AnonymousClass8BT.A0I(r3);
            brazilPaymentSettingsFragment.A0D = AnonymousClass8BT.A0T(r2);
            brazilPaymentSettingsFragment.A07 = r2.A8N();
            brazilPaymentSettingsFragment.A08 = (C30921ej) r3.A8H.get();
            brazilPaymentSettingsFragment.A0F = (A5H) r2.AER.get();
            brazilPaymentSettingsFragment.A0B = (A54) r3.Acu.get();
            brazilPaymentSettingsFragment.A0C = (C170628qP) r3.AcW.get();
            brazilPaymentSettingsFragment.A0I = (A5Y) r2.A7B.get();
            brazilPaymentSettingsFragment.A06 = (C33331ie) r3.AcE.get();
            brazilPaymentSettingsFragment.A0A = (C191079lz) r2.A75.get();
            brazilPaymentSettingsFragment.A0K = (C188919iD) r2.A7F.get();
            brazilPaymentSettingsFragment.A0E = (C184809bY) r2.A78.get();
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
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_BrazilPaymentSettingsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
