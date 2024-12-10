package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ConsumerMarketingDisclosureFragment extends DisclosureFragment {
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
            ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = (ConsumerMarketingDisclosureFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r1 = r3.A2Q;
            AnonymousClass10G r0 = r1.A00;
            AnonymousClass3MY.A1N(r0, consumerMarketingDisclosureFragment);
            consumerMarketingDisclosureFragment.A06 = C72463Mc.A0Y(r0);
            consumerMarketingDisclosureFragment.A07 = AnonymousClass10E.A6Q(r1);
            consumerMarketingDisclosureFragment.A00 = AnonymousClass3MZ.A0N(r1);
            consumerMarketingDisclosureFragment.A01 = C000200d.A00(r1.A2Z);
            consumerMarketingDisclosureFragment.A02 = C000200d.A00(r3.A05);
            consumerMarketingDisclosureFragment.A03 = C000200d.A00(r1.AIP);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.datasharingdisclosure.ui.Hilt_ConsumerMarketingDisclosureFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
