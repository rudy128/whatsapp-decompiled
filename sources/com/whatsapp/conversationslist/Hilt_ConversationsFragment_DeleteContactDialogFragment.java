package com.whatsapp.conversationslist;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1NN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BY;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C36741oO;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;

public abstract class Hilt_ConversationsFragment_DeleteContactDialogFragment extends WaDialogFragment {
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
            ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = (ConversationsFragment.DeleteContactDialogFragment) this;
            AnonymousClass10E r3 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass8BY.A0t(r3, deleteContactDialogFragment);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3MX.A1L(r1, deleteContactDialogFragment);
            deleteContactDialogFragment.A04 = AnonymousClass10E.A6O(r3);
            deleteContactDialogFragment.A08 = AnonymousClass10E.AL1(r3);
            deleteContactDialogFragment.A00 = AnonymousClass3MZ.A0U(r3);
            deleteContactDialogFragment.A01 = AnonymousClass10E.A4z(r3);
            deleteContactDialogFragment.A03 = AnonymousClass3Ma.A0a(r3);
            deleteContactDialogFragment.A02 = AnonymousClass3MZ.A0g(r3);
            deleteContactDialogFragment.A09 = C000200d.A00(r1.A4a);
            deleteContactDialogFragment.A05 = AnonymousClass3Ma.A0c(r3);
            deleteContactDialogFragment.A06 = (AnonymousClass1NN) r3.A2q.get();
            deleteContactDialogFragment.A07 = (C36741oO) r1.A1L.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_ConversationsFragment_DeleteContactDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
