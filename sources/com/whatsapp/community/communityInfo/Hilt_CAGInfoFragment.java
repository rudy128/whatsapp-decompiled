package com.whatsapp.community.communityInfo;

import X.AnonymousClass10E;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C106935Xt;
import X.C106955Xv;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_CAGInfoFragment extends WaFragment {
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
            CAGInfoFragment cAGInfoFragment = (CAGInfoFragment) this;
            C36241nZ r1 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r1.A2Q;
            cAGInfoFragment.A04 = C72473Md.A0T(r3, r3.A00, cAGInfoFragment);
            cAGInfoFragment.A01 = AnonymousClass3MY.A0S(r3);
            cAGInfoFragment.A09 = C000200d.A00(r3.A2L);
            cAGInfoFragment.A02 = AnonymousClass10E.A4z(r3);
            cAGInfoFragment.A00 = AnonymousClass10E.A12(r3);
            AnonymousClass1K1 r12 = r1.A2O;
            cAGInfoFragment.A07 = (C106955Xv) r12.A49.get();
            cAGInfoFragment.A06 = (C106935Xt) r12.A1b.get();
            cAGInfoFragment.A03 = AnonymousClass10E.A6O(r3);
            cAGInfoFragment.A08 = AnonymousClass10E.AL1(r3);
            cAGInfoFragment.A05 = AnonymousClass3Ma.A0g(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.communityInfo.Hilt_CAGInfoFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
