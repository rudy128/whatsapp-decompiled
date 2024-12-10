package com.whatsapp.payments.ui;

import X.AXS;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QD;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEB;
import X.C000200d;
import X.C008603v;
import X.C008703w;
import X.C008903z;
import X.C108975cc;
import X.C109015cg;
import X.C191339mR;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public abstract class Hilt_IndiaUpiSendPayContactPickerFragment extends IndiaUpiContactPickerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiSendPayContactPickerFragment indiaUpiSendPayContactPickerFragment = (IndiaUpiSendPayContactPickerFragment) this;
            C36241nZ r5 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r2 = r5.A2Q;
            AnonymousClass10G r3 = r2.A00;
            BEB.A0z(r2, r3, indiaUpiSendPayContactPickerFragment);
            BEB.A0y(r2, r3, indiaUpiSendPayContactPickerFragment);
            BEB.A11(r2, indiaUpiSendPayContactPickerFragment, BE7.A0c(r2));
            C109015cg.A04(r2, r3, indiaUpiSendPayContactPickerFragment, C108975cc.A0O(r2));
            C109015cg.A02(r5, r2, r3, BE9.A0X(r3), indiaUpiSendPayContactPickerFragment);
            AnonymousClass1K1 A0P = BEB.A0P(r5, r2, r3, indiaUpiSendPayContactPickerFragment);
            BEB.A0u(A0P, r5, r2, indiaUpiSendPayContactPickerFragment, r3.AD4.get());
            BEB.A0v(r5, r2, r3, indiaUpiSendPayContactPickerFragment, C000200d.A00(r2.A25));
            C109015cg.A01(A0P, r2, r3, indiaUpiSendPayContactPickerFragment);
            BEB.A0w(r5, r2, r3, indiaUpiSendPayContactPickerFragment, BEB.A0X(r2, indiaUpiSendPayContactPickerFragment));
            BEB.A0t(A0P, r5, r2, r3, indiaUpiSendPayContactPickerFragment);
            BE8.A11(r5, indiaUpiSendPayContactPickerFragment);
            C109015cg.A00(A0P, r5, r2, r3, indiaUpiSendPayContactPickerFragment);
            BEB.A12(r2, indiaUpiSendPayContactPickerFragment);
            indiaUpiSendPayContactPickerFragment.A00 = (AnonymousClass1QD) r2.A89.get();
            indiaUpiSendPayContactPickerFragment.A01 = AnonymousClass1K1.A1N(A0P);
            indiaUpiSendPayContactPickerFragment.A02 = (AZ6) r2.A5D.get();
            indiaUpiSendPayContactPickerFragment.A01 = (AXS) r2.A5F.get();
            indiaUpiSendPayContactPickerFragment.A02 = (C191339mR) r3.AEX.get();
            indiaUpiSendPayContactPickerFragment.A00 = BE9.A0a(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiSendPayContactPickerFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
