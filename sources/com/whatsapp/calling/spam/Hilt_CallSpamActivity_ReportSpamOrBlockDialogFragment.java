package com.whatsapp.calling.spam;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C108965cb;
import X.C129206hQ;
import X.C32291gx;
import X.C32791hl;
import X.C36241nZ;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.calling.spam.CallSpamActivity;

public abstract class Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment extends WaDialogFragment {
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
            CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment = (CallSpamActivity.ReportSpamOrBlockDialogFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r3.A2Q;
            C72483Me.A0t(r2, reportSpamOrBlockDialogFragment);
            C108965cb.A15(r2, reportSpamOrBlockDialogFragment);
            reportSpamOrBlockDialogFragment.A02 = AnonymousClass10E.A12(r2);
            reportSpamOrBlockDialogFragment.A0D = AnonymousClass10E.AL1(r2);
            reportSpamOrBlockDialogFragment.A04 = AnonymousClass10E.A4z(r2);
            reportSpamOrBlockDialogFragment.A05 = AnonymousClass3MZ.A0g(r2);
            reportSpamOrBlockDialogFragment.A0C = (C129206hQ) r2.AjB.get();
            reportSpamOrBlockDialogFragment.A0F = C000200d.A00(r2.A0x);
            reportSpamOrBlockDialogFragment.A07 = AnonymousClass3MZ.A0n(r2);
            reportSpamOrBlockDialogFragment.A0E = C000200d.A00(r3.A2O.A0D);
            reportSpamOrBlockDialogFragment.A0G = C000200d.A00(r2.AFS);
            reportSpamOrBlockDialogFragment.A0H = C000200d.A00(r3.A1X);
            reportSpamOrBlockDialogFragment.A0B = (C32291gx) r2.A6X.get();
            reportSpamOrBlockDialogFragment.A06 = (C32791hl) r2.A2t.get();
            reportSpamOrBlockDialogFragment.A03 = AnonymousClass3MZ.A0d(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.spam.Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
