package com.whatsapp.biz.catalog;

import X.A8Q;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C20005A2v;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public abstract class Hilt_CatalogMediaViewFragment extends MediaViewBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A02() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass3MX.A1M(r3, catalogMediaViewFragment);
            catalogMediaViewFragment.A01 = AnonymousClass3MZ.A0N(r2);
            catalogMediaViewFragment.A05 = (A8Q) r2.A1p.get();
            catalogMediaViewFragment.A02 = AnonymousClass3MY.A0N(r2);
            catalogMediaViewFragment.A03 = AnonymousClass10E.A12(r2);
            catalogMediaViewFragment.A0E = C000200d.A00(r3.A2V);
            catalogMediaViewFragment.A06 = (C20005A2v) r4.A2O.A0X.get();
            catalogMediaViewFragment.A09 = AnonymousClass3Ma.A0b(r2);
            catalogMediaViewFragment.A0A = AnonymousClass10E.A8r(r2);
            catalogMediaViewFragment.A07 = AnonymousClass3Ma.A0a(r2);
            catalogMediaViewFragment.A08 = AnonymousClass3MZ.A0l(r2);
            catalogMediaViewFragment.A0C = AnonymousClass10E.AL1(r2);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A02();
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
            r2.A02()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.Hilt_CatalogMediaViewFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A02();
        A25();
    }
}
