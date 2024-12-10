package com.whatsapp.payments.ui;

import X.A12;
import X.A7U;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1QR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass90Z;
import X.C000200d;
import X.C008703w;
import X.C108975cc;
import X.C196199uc;
import X.C20008A2y;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_IndiaUpiSendPaymentToVpaFragment extends WaFragment {
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
            IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this;
            AnonymousClass10E r3 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass3MX.A1M(r2, indiaUpiSendPaymentToVpaFragment);
            indiaUpiSendPaymentToVpaFragment.A0K = C108975cc.A0P(r2);
            indiaUpiSendPaymentToVpaFragment.A03 = AnonymousClass10E.A12(r3);
            indiaUpiSendPaymentToVpaFragment.A07 = AnonymousClass10E.A8r(r3);
            indiaUpiSendPaymentToVpaFragment.A0L = AnonymousClass10E.AL1(r3);
            indiaUpiSendPaymentToVpaFragment.A0N = C000200d.A00(r3.A6N);
            indiaUpiSendPaymentToVpaFragment.A04 = AnonymousClass10E.A6Q(r3);
            indiaUpiSendPaymentToVpaFragment.A0J = AnonymousClass8BT.A0V(r3);
            indiaUpiSendPaymentToVpaFragment.A0A = AnonymousClass8BU.A0M(r2);
            indiaUpiSendPaymentToVpaFragment.A0H = (C20008A2y) r3.AW4.get();
            indiaUpiSendPaymentToVpaFragment.A0B = (A7U) r3.A5E.get();
            indiaUpiSendPaymentToVpaFragment.A08 = (A12) r2.A6g.get();
            indiaUpiSendPaymentToVpaFragment.A0D = AnonymousClass8BU.A0R(r3);
            indiaUpiSendPaymentToVpaFragment.A06 = AnonymousClass8BT.A0I(r3);
            indiaUpiSendPaymentToVpaFragment.A05 = (AnonymousClass1QR) r3.A8D.get();
            indiaUpiSendPaymentToVpaFragment.A0F = AnonymousClass8BU.A0T(r3);
            indiaUpiSendPaymentToVpaFragment.A09 = (C196199uc) r2.A2l.get();
            indiaUpiSendPaymentToVpaFragment.A0O = C000200d.A00(r3.A84);
            indiaUpiSendPaymentToVpaFragment.A0C = AnonymousClass8BT.A0Q(r3);
            indiaUpiSendPaymentToVpaFragment.A0I = (AnonymousClass90Z) r2.A2n.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiSendPaymentToVpaFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
