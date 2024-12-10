package com.whatsapp.registration.verifyphone;

import X.A8V;
import X.AnonymousClass10E;
import X.AnonymousClass1CM;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_RequestServerDrivenOtpCodeFullScreenFragment extends WaDialogFragment {
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
            RequestServerDrivenOtpCodeFullScreenFragment requestServerDrivenOtpCodeFullScreenFragment = (RequestServerDrivenOtpCodeFullScreenFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r1 = r3.A2Q;
            AnonymousClass8BY.A0t(r1, requestServerDrivenOtpCodeFullScreenFragment);
            AnonymousClass3MX.A1L(r1.A00, requestServerDrivenOtpCodeFullScreenFragment);
            requestServerDrivenOtpCodeFullScreenFragment.A07 = C72463Mc.A0e(r1);
            requestServerDrivenOtpCodeFullScreenFragment.A0A = (A8V) r1.A4U.get();
            requestServerDrivenOtpCodeFullScreenFragment.A08 = AnonymousClass8BU.A0c(r1);
            requestServerDrivenOtpCodeFullScreenFragment.A09 = (AnonymousClass1CM) r1.A9V.get();
            requestServerDrivenOtpCodeFullScreenFragment.A0B = AnonymousClass1K1.A1j(r3.A2O);
            requestServerDrivenOtpCodeFullScreenFragment.A05 = AnonymousClass3Ma.A0c(r1);
            requestServerDrivenOtpCodeFullScreenFragment.A06 = AnonymousClass10E.A6Q(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.Hilt_RequestServerDrivenOtpCodeFullScreenFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
