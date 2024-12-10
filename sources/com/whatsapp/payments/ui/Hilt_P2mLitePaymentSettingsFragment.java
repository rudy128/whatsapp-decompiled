package com.whatsapp.payments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass8BY;
import X.C000200d;
import X.C008703w;
import X.C33701jF;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_P2mLitePaymentSettingsFragment extends PaymentSettingsFragment {
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
            P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) this;
            AnonymousClass10E r3 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass8BY.A0t(r3, p2mLitePaymentSettingsFragment);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass8BY.A0q(r3, r2, p2mLitePaymentSettingsFragment, AnonymousClass10G.A8i(r2));
            p2mLitePaymentSettingsFragment.A0B = AnonymousClass10E.A12(r3);
            p2mLitePaymentSettingsFragment.A0L = AnonymousClass3MZ.A0l(r3);
            AnonymousClass8BY.A0r(r3, r2, p2mLitePaymentSettingsFragment, r2.A30);
            AnonymousClass8BY.A0u(r3, p2mLitePaymentSettingsFragment, r3.A8F.get());
            p2mLitePaymentSettingsFragment.A04 = AnonymousClass3MZ.A0n(r3);
            p2mLitePaymentSettingsFragment.A09 = C000200d.A00(r2.AEK);
            p2mLitePaymentSettingsFragment.A08 = AnonymousClass8BT.A0V(r3);
            p2mLitePaymentSettingsFragment.A05 = (C33701jF) r3.A8I.get();
            p2mLitePaymentSettingsFragment.A0A = C000200d.A00(r2.AEM);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_P2mLitePaymentSettingsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
