package com.whatsapp.dialogs;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BY;
import X.C008703w;
import X.C108975cc;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_FAQLearnMoreDialogFragment extends WaDialogFragment {
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
        if (this instanceof Hilt_HFMLearnMoreDialogFragment) {
            Hilt_HFMLearnMoreDialogFragment hilt_HFMLearnMoreDialogFragment = (Hilt_HFMLearnMoreDialogFragment) this;
            if (!hilt_HFMLearnMoreDialogFragment.A00) {
                hilt_HFMLearnMoreDialogFragment.A00 = true;
                AnonymousClass10E A0W = C72463Mc.A0W(hilt_HFMLearnMoreDialogFragment);
                AnonymousClass8BY.A0t(A0W, hilt_HFMLearnMoreDialogFragment);
                AnonymousClass3MX.A1L(A0W.A00, hilt_HFMLearnMoreDialogFragment);
                hilt_HFMLearnMoreDialogFragment.A00 = AnonymousClass3MZ.A0N(A0W);
                hilt_HFMLearnMoreDialogFragment.A01 = AnonymousClass3Ma.A0f(A0W);
                hilt_HFMLearnMoreDialogFragment.A02 = C108975cc.A0O(A0W);
            }
        } else if (this instanceof Hilt_ForwardLimitToGroupsLearnMoreDialogFragment) {
            Hilt_ForwardLimitToGroupsLearnMoreDialogFragment hilt_ForwardLimitToGroupsLearnMoreDialogFragment = (Hilt_ForwardLimitToGroupsLearnMoreDialogFragment) this;
            if (!hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A00) {
                hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A00 = true;
                AnonymousClass10E A0W2 = C72463Mc.A0W(hilt_ForwardLimitToGroupsLearnMoreDialogFragment);
                AnonymousClass8BY.A0t(A0W2, hilt_ForwardLimitToGroupsLearnMoreDialogFragment);
                AnonymousClass3MX.A1L(A0W2.A00, hilt_ForwardLimitToGroupsLearnMoreDialogFragment);
                hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A00 = AnonymousClass3MZ.A0N(A0W2);
                hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A01 = AnonymousClass3Ma.A0f(A0W2);
                hilt_ForwardLimitToGroupsLearnMoreDialogFragment.A02 = C108975cc.A0O(A0W2);
            }
        } else if (!this.A02) {
            this.A02 = true;
            FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment = (FAQLearnMoreDialogFragment) this;
            AnonymousClass10E r1 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass8BY.A0t(r1, fAQLearnMoreDialogFragment);
            AnonymousClass3MX.A1L(r1.A00, fAQLearnMoreDialogFragment);
            fAQLearnMoreDialogFragment.A00 = AnonymousClass3MZ.A0N(r1);
            fAQLearnMoreDialogFragment.A01 = AnonymousClass3Ma.A0f(r1);
            fAQLearnMoreDialogFragment.A02 = C108975cc.A0O(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
