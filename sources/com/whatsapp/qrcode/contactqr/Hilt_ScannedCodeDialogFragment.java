package com.whatsapp.qrcode.contactqr;

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
import X.C132996o0;
import X.C36241nZ;
import X.C36451nu;
import X.C37311pJ;
import X.C37511pf;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_ScannedCodeDialogFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) this;
            C36241nZ r1 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r1.A2Q;
            AnonymousClass10G r4 = r3.A00;
            C72483Me.A0v(r4, scannedCodeDialogFragment);
            scannedCodeDialogFragment.A0D = AnonymousClass10E.A6O(r3);
            scannedCodeDialogFragment.A02 = AnonymousClass10E.A17(r3);
            scannedCodeDialogFragment.A0L = AnonymousClass10E.AL1(r3);
            scannedCodeDialogFragment.A0G = AnonymousClass3Ma.A0f(r3);
            scannedCodeDialogFragment.A0A = AnonymousClass3MZ.A0i(r3);
            scannedCodeDialogFragment.A04 = AnonymousClass10E.A4z(r3);
            scannedCodeDialogFragment.A08 = AnonymousClass3MZ.A0g(r3);
            scannedCodeDialogFragment.A0E = AnonymousClass10E.A6Q(r3);
            scannedCodeDialogFragment.A05 = AnonymousClass3Ma.A0S(r3);
            scannedCodeDialogFragment.A0M = C000200d.A00(r3.A0F);
            scannedCodeDialogFragment.A0K = (C36451nu) r3.A0G.get();
            scannedCodeDialogFragment.A0C = AnonymousClass8BU.A0E(r3);
            scannedCodeDialogFragment.A07 = AnonymousClass3MZ.A0f(r3);
            AnonymousClass1K1 r12 = r1.A2O;
            scannedCodeDialogFragment.A0J = (C132996o0) r12.A5d.get();
            scannedCodeDialogFragment.A06 = (C37511pf) r3.AX7.get();
            scannedCodeDialogFragment.A0N = C000200d.A00(r3.A6p);
            scannedCodeDialogFragment.A03 = AnonymousClass3MZ.A0T(r4);
            scannedCodeDialogFragment.A0B = (C37311pJ) r12.A4y.get();
            scannedCodeDialogFragment.A0H = AnonymousClass10E.A8r(r3);
            scannedCodeDialogFragment.A0O = AnonymousClass3MW.A0s(r3);
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
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.contactqr.Hilt_ScannedCodeDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
