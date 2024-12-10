package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BY;
import X.C008703w;
import X.C108975cc;
import X.C36241nZ;
import X.C36531o3;
import X.C58522kp;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_DeviceUpdateDialogFragment extends SecurityNotificationDialogFragment {
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
            DeviceUpdateDialogFragment deviceUpdateDialogFragment = (DeviceUpdateDialogFragment) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass8BY.A0t(r2, deviceUpdateDialogFragment);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass3MX.A1L(r1, deviceUpdateDialogFragment);
            deviceUpdateDialogFragment.A01 = AnonymousClass10E.A17(r2);
            deviceUpdateDialogFragment.A07 = AnonymousClass10E.AL1(r2);
            deviceUpdateDialogFragment.A05 = AnonymousClass3Ma.A0f(r2);
            deviceUpdateDialogFragment.A00 = AnonymousClass3MZ.A0N(r2);
            deviceUpdateDialogFragment.A02 = AnonymousClass10E.A4z(r2);
            deviceUpdateDialogFragment.A06 = C108975cc.A0O(r2);
            deviceUpdateDialogFragment.A03 = AnonymousClass3MZ.A0g(r2);
            deviceUpdateDialogFragment.A04 = (C36531o3) r2.A2n.get();
            deviceUpdateDialogFragment.A00 = (C58522kp) r1.A1M.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.Hilt_DeviceUpdateDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
