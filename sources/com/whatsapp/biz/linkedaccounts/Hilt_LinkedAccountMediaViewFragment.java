package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass72R;
import X.C000200d;
import X.C008703w;
import X.C196089uR;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public abstract class Hilt_LinkedAccountMediaViewFragment extends MediaViewBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            AnonymousClass10E r3 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass3MX.A1M(r2, linkedAccountMediaViewFragment);
            linkedAccountMediaViewFragment.A09 = AnonymousClass10E.A6O(r3);
            linkedAccountMediaViewFragment.A0C = AnonymousClass10E.A8r(r3);
            linkedAccountMediaViewFragment.A0D = AnonymousClass3MY.A0Z(r3);
            linkedAccountMediaViewFragment.A04 = AnonymousClass3MZ.A0N(r3);
            linkedAccountMediaViewFragment.A0B = AnonymousClass10E.A6Q(r3);
            linkedAccountMediaViewFragment.A07 = AnonymousClass10E.A4z(r3);
            linkedAccountMediaViewFragment.A08 = AnonymousClass3MZ.A0f(r3);
            linkedAccountMediaViewFragment.A0A = AnonymousClass3Ma.A0b(r3);
            linkedAccountMediaViewFragment.A05 = (AnonymousClass72R) r2.A0h.get();
            linkedAccountMediaViewFragment.A0F = (C196089uR) r2.ACu.get();
            linkedAccountMediaViewFragment.A0G = C000200d.A00(r2.ACx);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A03();
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
            r2.A03()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.linkedaccounts.Hilt_LinkedAccountMediaViewFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A03();
        A25();
    }
}
