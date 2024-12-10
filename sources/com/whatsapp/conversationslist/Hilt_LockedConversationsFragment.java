package com.whatsapp.conversationslist;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.C008603v;
import X.C008703w;
import X.C008903z;
import X.C19890zB;
import X.C36241nZ;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public abstract class Hilt_LockedConversationsFragment extends FolderConversationsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            C36241nZ r5 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r4 = r5.A2Q;
            AnonymousClass10G r3 = r4.A00;
            Fragment.A0b(r4, r3, this);
            Fragment.A0c(r4, r3, this, r4.A9B);
            C19890zB r2 = C19890zB.A00;
            Fragment.A0V(r2, r4, this);
            Fragment.A0U(r2, r4, r3, this);
            Fragment.A0S(r2, r5, r4, r3, this);
            AnonymousClass1K1 r1 = r5.A2O;
            Fragment.A0W(r1, r4, r3, this);
            Fragment.A0X(r1, r4, r3, this, r4.A7g);
            Fragment.A0Q(r2, r1, r4, r3, this);
            Fragment.A0Z(r5, r4, r3, this);
            Fragment.A0R(r2, r1, r4, r3, this);
            Fragment.A0T(r2, r5, r4, r3, this);
            Fragment.A0Y(r1, r3, this);
            Fragment.A0N(r2, r1, r5, r4, this);
            Fragment.A0O(r2, r1, r5, r3, this);
            Fragment.A0P(r2, r1, r4, r3, this);
            Fragment.A0a(r5, r3, this);
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
        LayoutInflater A1o = super.A1o(bundle);
        return A1o.cloneInContext(new C008603v(A1o, (Fragment) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C008803x.A00(r0) == r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r5) {
        /*
            r4 = this;
            super.A1p(r5)
            android.content.ContextWrapper r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C008803x.A00(r0)
            r2 = 0
            if (r0 != r5) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.String r1 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C008303s.A00(r1, r0, r2)
            r4.A00()
            r4.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_LockedConversationsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
