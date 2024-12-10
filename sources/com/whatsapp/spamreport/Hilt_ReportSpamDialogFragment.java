package com.whatsapp.spamreport;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C136876uY;
import X.C26031Qo;
import X.C36241nZ;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_ReportSpamDialogFragment extends WaDialogFragment {
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
            ReportSpamDialogFragment reportSpamDialogFragment = (ReportSpamDialogFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r3.A2Q;
            C72483Me.A0t(r2, reportSpamDialogFragment);
            AnonymousClass10G r4 = r2.A00;
            reportSpamDialogFragment.A03 = AnonymousClass10G.A8i(r4);
            reportSpamDialogFragment.A0F = C000200d.A00(r2.A12);
            reportSpamDialogFragment.A09 = AnonymousClass3Ma.A0d(r2);
            reportSpamDialogFragment.A0G = C000200d.A00(r2.A2L);
            reportSpamDialogFragment.A02 = AnonymousClass10E.A4z(r2);
            reportSpamDialogFragment.A0H = AnonymousClass3MX.A10(r2);
            reportSpamDialogFragment.A00 = AnonymousClass3MY.A0N(r2);
            reportSpamDialogFragment.A08 = (C26031Qo) r2.A32.get();
            reportSpamDialogFragment.A0I = AnonymousClass3MX.A12(r2);
            reportSpamDialogFragment.A01 = AnonymousClass10E.A12(r2);
            reportSpamDialogFragment.A0A = AnonymousClass3MY.A0V(r2);
            reportSpamDialogFragment.A0J = C000200d.A00(r2.A5V);
            reportSpamDialogFragment.A0E = AnonymousClass3MY.A0e(r4);
            reportSpamDialogFragment.A0K = C000200d.A00(r3.A1X);
            reportSpamDialogFragment.A0C = C36241nZ.A0h(r3);
            reportSpamDialogFragment.A04 = (C136876uY) r4.AHR.get();
            reportSpamDialogFragment.A0L = C000200d.A00(r3.A1a);
            reportSpamDialogFragment.A05 = AnonymousClass3Ma.A0a(r2);
            reportSpamDialogFragment.A03 = AnonymousClass3MZ.A0g(r2);
            reportSpamDialogFragment.A06 = AnonymousClass3MZ.A0l(r2);
            reportSpamDialogFragment.A0M = AnonymousClass3MW.A0s(r2);
            reportSpamDialogFragment.A07 = AnonymousClass3Ma.A0c(r2);
            reportSpamDialogFragment.A0B = AnonymousClass3Ma.A0g(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.Hilt_ReportSpamDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
