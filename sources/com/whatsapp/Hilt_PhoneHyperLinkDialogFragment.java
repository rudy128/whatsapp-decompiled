package com.whatsapp;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass733;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.C000200d;
import X.C008703w;
import X.C108985cd;
import X.C131906lr;
import X.C36241nZ;
import X.C36451nu;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_PhoneHyperLinkDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment = (PhoneHyperLinkDialogFragment) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass8BY.A0t(r2, phoneHyperLinkDialogFragment);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass3MX.A1L(r3, phoneHyperLinkDialogFragment);
            phoneHyperLinkDialogFragment.A01 = AnonymousClass10E.A12(r2);
            phoneHyperLinkDialogFragment.A03 = AnonymousClass10E.A17(r2);
            phoneHyperLinkDialogFragment.A09 = AnonymousClass3MY.A0Z(r2);
            phoneHyperLinkDialogFragment.A04 = AnonymousClass3MZ.A0W(r2);
            phoneHyperLinkDialogFragment.A02 = C108985cd.A0N(r2);
            phoneHyperLinkDialogFragment.A00 = AnonymousClass3MZ.A0N(r2);
            phoneHyperLinkDialogFragment.A05 = AnonymousClass10E.A4z(r2);
            phoneHyperLinkDialogFragment.A0B = (C36451nu) r2.A0G.get();
            phoneHyperLinkDialogFragment.A07 = AnonymousClass8BU.A0E(r2);
            phoneHyperLinkDialogFragment.A06 = (AnonymousClass733) r3.A2s.get();
            phoneHyperLinkDialogFragment.A0C = C000200d.A00(r2.A8X);
            phoneHyperLinkDialogFragment.A08 = (C131906lr) r3.AEh.get();
            phoneHyperLinkDialogFragment.A0D = C000200d.A00(r2.ABV);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A01();
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
            r2.A01()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Hilt_PhoneHyperLinkDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
