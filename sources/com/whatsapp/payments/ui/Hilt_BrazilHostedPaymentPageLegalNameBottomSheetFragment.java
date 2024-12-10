package com.whatsapp.payments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BT;
import X.AnonymousClass8BY;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;

public abstract class Hilt_BrazilHostedPaymentPageLegalNameBottomSheetFragment extends ConfirmLegalNameBottomSheetFragment {
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
            BrazilHostedPaymentPageLegalNameBottomSheetFragment brazilHostedPaymentPageLegalNameBottomSheetFragment = (BrazilHostedPaymentPageLegalNameBottomSheetFragment) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass8BY.A0p(r2, r1, C72473Md.A0T(r2, r1, brazilHostedPaymentPageLegalNameBottomSheetFragment), brazilHostedPaymentPageLegalNameBottomSheetFragment);
            brazilHostedPaymentPageLegalNameBottomSheetFragment.A01 = AnonymousClass8BT.A0f(r2);
            brazilHostedPaymentPageLegalNameBottomSheetFragment.A00 = AnonymousClass8BT.A0T(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_BrazilHostedPaymentPageLegalNameBottomSheetFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
