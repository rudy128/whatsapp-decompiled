package com.whatsapp.payments.ui;

import X.A5Y;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.C000200d;
import X.C008703w;
import X.C191389mW;
import X.C19944A0b;
import X.C20037A4g;
import X.C20074A6a;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BrazilConfirmReceivePaymentFragment extends ConfirmReceivePaymentFragment {
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
        if (!this.A02) {
            this.A02 = true;
            BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r4.A2Q;
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass3MX.A1M(r2, brazilConfirmReceivePaymentFragment);
            brazilConfirmReceivePaymentFragment.A02 = AnonymousClass3MZ.A0z(r3);
            brazilConfirmReceivePaymentFragment.A04 = C000200d.A00(r3.AcC);
            brazilConfirmReceivePaymentFragment.A02 = AnonymousClass10E.A6O(r3);
            brazilConfirmReceivePaymentFragment.A05 = AnonymousClass10E.A8r(r3);
            brazilConfirmReceivePaymentFragment.A00 = AnonymousClass10E.A12(r3);
            brazilConfirmReceivePaymentFragment.A01 = AnonymousClass10E.A17(r3);
            brazilConfirmReceivePaymentFragment.A0G = C000200d.A00(r3.A6N);
            brazilConfirmReceivePaymentFragment.A03 = AnonymousClass10E.A6Q(r3);
            brazilConfirmReceivePaymentFragment.A0F = AnonymousClass8BT.A0V(r3);
            brazilConfirmReceivePaymentFragment.A06 = (C19944A0b) r2.A70.get();
            brazilConfirmReceivePaymentFragment.A0D = (C20037A4g) r2.A71.get();
            brazilConfirmReceivePaymentFragment.A09 = AnonymousClass8BU.A0R(r3);
            brazilConfirmReceivePaymentFragment.A0A = AnonymousClass3Ma.A0q(r3);
            brazilConfirmReceivePaymentFragment.A0C = (C191389mW) r3.AaX.get();
            brazilConfirmReceivePaymentFragment.A04 = AnonymousClass8BT.A0I(r3);
            brazilConfirmReceivePaymentFragment.A0I = C000200d.A00(r3.A87);
            brazilConfirmReceivePaymentFragment.A0B = AnonymousClass8BU.A0S(r3);
            brazilConfirmReceivePaymentFragment.A07 = AnonymousClass1K1.A1M(r4.A2O);
            brazilConfirmReceivePaymentFragment.A08 = (C20074A6a) r3.AFz.get();
            brazilConfirmReceivePaymentFragment.A0H = C000200d.A00(r3.A84);
            brazilConfirmReceivePaymentFragment.A0E = (A5Y) r2.A7B.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_BrazilConfirmReceivePaymentFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
