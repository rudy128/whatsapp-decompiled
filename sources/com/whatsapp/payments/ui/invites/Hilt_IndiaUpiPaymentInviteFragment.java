package com.whatsapp.payments.ui.invites;

import X.ALX;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.C000200d;
import X.C008703w;
import X.C191339mR;
import X.C33351ig;
import X.C33391ik;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiPaymentInviteFragment extends PaymentInviteFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r4.A2Q;
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass3MX.A1M(r2, indiaUpiPaymentInviteFragment);
            indiaUpiPaymentInviteFragment.A00 = (C33391ik) r3.Acb.get();
            indiaUpiPaymentInviteFragment.A04 = AnonymousClass10E.A6O(r3);
            indiaUpiPaymentInviteFragment.A05 = AnonymousClass10E.A8r(r3);
            indiaUpiPaymentInviteFragment.A07 = AnonymousClass8BU.A0Q(r3);
            indiaUpiPaymentInviteFragment.A03 = AnonymousClass3MZ.A0i(r3);
            indiaUpiPaymentInviteFragment.A00 = AnonymousClass10E.A4z(r3);
            indiaUpiPaymentInviteFragment.A02 = AnonymousClass3MZ.A0g(r3);
            indiaUpiPaymentInviteFragment.A01 = AnonymousClass3MZ.A0f(r3);
            indiaUpiPaymentInviteFragment.A08 = (C191339mR) r2.AEX.get();
            indiaUpiPaymentInviteFragment.A0A = AnonymousClass3Ma.A0q(r3);
            indiaUpiPaymentInviteFragment.A0B = AnonymousClass1K1.A1N(r4.A2O);
            indiaUpiPaymentInviteFragment.A06 = (ALX) r3.AcF.get();
            indiaUpiPaymentInviteFragment.A0D = (C33351ig) r3.A83.get();
            indiaUpiPaymentInviteFragment.A0C = AnonymousClass8BU.A0T(r3);
            indiaUpiPaymentInviteFragment.A09 = r2.A8N();
            indiaUpiPaymentInviteFragment.A0F = C000200d.A00(r2.ACO);
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
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.invites.Hilt_IndiaUpiPaymentInviteFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A25();
    }
}
