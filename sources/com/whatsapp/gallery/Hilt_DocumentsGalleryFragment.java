package com.whatsapp.gallery;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1CL;
import X.AnonymousClass1Cd;
import X.AnonymousClass1LW;
import X.AnonymousClass1QB;
import X.AnonymousClass384;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C32211gp;
import X.C36241nZ;
import X.C57172ie;
import X.C72453Mb;
import X.C88104Yi;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_DocumentsGalleryFragment extends GalleryFragmentBase {
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
            DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
            AnonymousClass10E r5 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r1 = r5.A00;
            AnonymousClass3MX.A1M(r1, documentsGalleryFragment);
            documentsGalleryFragment.A03 = AnonymousClass10E.A6O(r5);
            documentsGalleryFragment.A09 = AnonymousClass10E.A8r(r5);
            documentsGalleryFragment.A0F = AnonymousClass10E.AL1(r5);
            documentsGalleryFragment.A05 = AnonymousClass10E.A6Q(r5);
            documentsGalleryFragment.A0G = AnonymousClass3MX.A12(r5);
            documentsGalleryFragment.A06 = AnonymousClass3MZ.A0n(r5);
            documentsGalleryFragment.A07 = AnonymousClass3MZ.A0o(r5);
            documentsGalleryFragment.A08 = (AnonymousClass1CL) r5.AZZ.get();
            documentsGalleryFragment.A04 = AnonymousClass3Ma.A0b(r5);
            documentsGalleryFragment.A08 = C000200d.A00(r5.AYQ);
            documentsGalleryFragment.A02 = AnonymousClass10E.A12(r5);
            documentsGalleryFragment.A01 = AnonymousClass3MY.A0N(r5);
            documentsGalleryFragment.A00 = AnonymousClass3MZ.A0N(r5);
            documentsGalleryFragment.A05 = (C88104Yi) r1.AFS.get();
            documentsGalleryFragment.A06 = (C32211gp) r5.A9r.get();
            documentsGalleryFragment.A03 = (C57172ie) r1.A1Y.get();
            documentsGalleryFragment.A04 = new AnonymousClass384((AnonymousClass1LW) r5.A2G.get(), (AnonymousClass1QB) r5.A4T.get(), (AnonymousClass1Cd) r5.A6i.get());
            documentsGalleryFragment.A07 = AnonymousClass3MZ.A13(r5);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_DocumentsGalleryFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
