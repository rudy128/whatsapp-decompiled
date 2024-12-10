package com.whatsapp.status.posting;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C008703w;
import X.C108955ca;
import X.C108965cb;
import X.C25001Mm;
import X.C36241nZ;
import X.C41911xI;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_FirstStatusConfirmationDialogFragment extends WaDialogFragment {
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
            FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment = (FirstStatusConfirmationDialogFragment) this;
            AnonymousClass10E r1 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            C72483Me.A0t(r1, firstStatusConfirmationDialogFragment);
            C108965cb.A15(r1, firstStatusConfirmationDialogFragment);
            firstStatusConfirmationDialogFragment.A02 = C108955ca.A0M(r1);
            firstStatusConfirmationDialogFragment.A01 = (C41911xI) r1.AAl.get();
            firstStatusConfirmationDialogFragment.A00 = (C25001Mm) r1.ABf.get();
            firstStatusConfirmationDialogFragment.A04 = AnonymousClass10E.AL1(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.posting.Hilt_FirstStatusConfirmationDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
