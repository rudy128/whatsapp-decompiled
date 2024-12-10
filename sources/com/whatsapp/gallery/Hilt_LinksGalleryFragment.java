package com.whatsapp.gallery;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1CL;
import X.AnonymousClass1Cd;
import X.AnonymousClass1LW;
import X.AnonymousClass1QB;
import X.AnonymousClass385;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C008703w;
import X.C131596lM;
import X.C32021gV;
import X.C36241nZ;
import X.C36391no;
import X.C72453Mb;
import X.C88104Yi;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_LinksGalleryFragment extends GalleryFragmentBase {
    public boolean A00;
    public ContextWrapper A01;
    public boolean A02;

    private void A00() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A02 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A00) {
            this.A00 = true;
            LinksGalleryFragment linksGalleryFragment = (LinksGalleryFragment) this;
            C36241nZ r5 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r1 = r5.A2Q;
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass3MX.A1M(r2, linksGalleryFragment);
            linksGalleryFragment.A03 = AnonymousClass10E.A6O(r1);
            linksGalleryFragment.A09 = AnonymousClass10E.A8r(r1);
            linksGalleryFragment.A0F = AnonymousClass10E.AL1(r1);
            linksGalleryFragment.A05 = AnonymousClass10E.A6Q(r1);
            linksGalleryFragment.A0G = AnonymousClass3MX.A12(r1);
            linksGalleryFragment.A06 = AnonymousClass3MZ.A0n(r1);
            linksGalleryFragment.A07 = AnonymousClass3MZ.A0o(r1);
            linksGalleryFragment.A08 = (AnonymousClass1CL) r1.AZZ.get();
            linksGalleryFragment.A04 = AnonymousClass3Ma.A0b(r1);
            linksGalleryFragment.A0B = AnonymousClass3MW.A0s(r1);
            linksGalleryFragment.A08 = AnonymousClass3MY.A0d(r1);
            linksGalleryFragment.A06 = AnonymousClass3Ma.A0f(r1);
            linksGalleryFragment.A00 = AnonymousClass3MZ.A0N(r1);
            linksGalleryFragment.A03 = (AnonymousClass1QB) r1.A4T.get();
            linksGalleryFragment.A05 = (C36391no) r1.A8P.get();
            linksGalleryFragment.A04 = (C88104Yi) r2.AFS.get();
            linksGalleryFragment.A0A = (C32021gV) r1.A6k.get();
            linksGalleryFragment.A07 = (C131596lM) r2.AIX.get();
            linksGalleryFragment.A09 = new AnonymousClass385((AnonymousClass1LW) r1.A2G.get(), (AnonymousClass1QB) r1.A4T.get(), (AnonymousClass1Cd) r1.A6i.get());
            linksGalleryFragment.A01 = AnonymousClass3MZ.A0V(r5.A2O);
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
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_LinksGalleryFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
