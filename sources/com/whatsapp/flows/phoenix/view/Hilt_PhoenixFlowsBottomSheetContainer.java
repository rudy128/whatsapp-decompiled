package com.whatsapp.flows.phoenix.view;

import X.AnonymousClass3MW;
import X.C008703w;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

public abstract class Hilt_PhoenixFlowsBottomSheetContainer extends FcsBottomSheetBaseContainer {
    public boolean A00 = false;
    public ContextWrapper A01;
    public boolean A02;

    private void A00() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A02 = C008703w.A00(super.A1n());
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A02) {
            return null;
        }
        A00();
        return this.A01;
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
            android.content.ContextWrapper r0 = r2.A01
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.phoenix.view.Hilt_PhoenixFlowsBottomSheetContainer.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
