package com.whatsapp.payments.ui;

import X.A54;
import X.A5H;
import X.ALX;
import X.AQF;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11O;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.C000200d;
import X.C008703w;
import X.C184789bW;
import X.C191339mR;
import X.C191529mk;
import X.C195929uA;
import X.C20080A6g;
import X.C32981i4;
import X.C33331ie;
import X.C33701jF;
import X.C36241nZ;
import X.C678831f;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiPaymentSettingsFragment extends PaymentSettingsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0D() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r4.A2Q;
            AnonymousClass8BY.A0t(r3, indiaUpiPaymentSettingsFragment);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass8BY.A0q(r3, r2, indiaUpiPaymentSettingsFragment, AnonymousClass10G.A8i(r2));
            indiaUpiPaymentSettingsFragment.A0B = AnonymousClass10E.A12(r3);
            indiaUpiPaymentSettingsFragment.A0L = AnonymousClass3MZ.A0l(r3);
            AnonymousClass8BY.A0r(r3, r2, indiaUpiPaymentSettingsFragment, r2.A30);
            AnonymousClass8BY.A0u(r3, indiaUpiPaymentSettingsFragment, r3.A8F.get());
            indiaUpiPaymentSettingsFragment.A0F = AnonymousClass3MY.A0Z(r3);
            indiaUpiPaymentSettingsFragment.A0N = (C191529mk) r2.AEk.get();
            indiaUpiPaymentSettingsFragment.A0c = C000200d.A00(r3.A6N);
            indiaUpiPaymentSettingsFragment.A05 = AnonymousClass3MZ.A0N(r3);
            indiaUpiPaymentSettingsFragment.A0E = (C32981i4) r3.A3G.get();
            indiaUpiPaymentSettingsFragment.A0A = AnonymousClass3Ma.A0a(r3);
            indiaUpiPaymentSettingsFragment.A0Z = AnonymousClass8BT.A0V(r3);
            indiaUpiPaymentSettingsFragment.A0b = C000200d.A00(r4.A1W);
            indiaUpiPaymentSettingsFragment.A0C = AnonymousClass3MZ.A0n(r3);
            indiaUpiPaymentSettingsFragment.A09 = (C678831f) r2.A10.get();
            indiaUpiPaymentSettingsFragment.A0D = AnonymousClass3MZ.A0q(r3);
            indiaUpiPaymentSettingsFragment.A0H = (C20080A6g) r3.A5G.get();
            indiaUpiPaymentSettingsFragment.A0K = (C191339mR) r2.AEX.get();
            AnonymousClass1K1 r42 = r4.A2O;
            indiaUpiPaymentSettingsFragment.A0d = C000200d.A00(r42.A5L);
            indiaUpiPaymentSettingsFragment.A0U = (C195929uA) r2.AEU.get();
            indiaUpiPaymentSettingsFragment.A0S = (C184789bW) r2.AEV.get();
            indiaUpiPaymentSettingsFragment.A0O = AnonymousClass1K1.A1N(r42);
            indiaUpiPaymentSettingsFragment.A0J = (ALX) r3.AcF.get();
            indiaUpiPaymentSettingsFragment.A0M = (C33701jF) r3.A8I.get();
            indiaUpiPaymentSettingsFragment.A0Q = AnonymousClass8BU.A0T(r3);
            indiaUpiPaymentSettingsFragment.A07 = AnonymousClass3MZ.A0d(r3);
            indiaUpiPaymentSettingsFragment.A0L = r2.A8N();
            indiaUpiPaymentSettingsFragment.A0G = AnonymousClass8BT.A0Q(r3);
            indiaUpiPaymentSettingsFragment.A0T = (A5H) r2.AER.get();
            indiaUpiPaymentSettingsFragment.A0P = (A54) r3.Acu.get();
            indiaUpiPaymentSettingsFragment.A0B = (AnonymousClass11O) r3.ABn.get();
            indiaUpiPaymentSettingsFragment.A0I = (C33331ie) r3.AcE.get();
            indiaUpiPaymentSettingsFragment.A0R = (AQF) r2.A3k.get();
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A0D();
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
            r2.A0D()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentSettingsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A0D();
        A2E();
    }
}
