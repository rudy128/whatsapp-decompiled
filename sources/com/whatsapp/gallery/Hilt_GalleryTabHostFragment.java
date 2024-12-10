package com.whatsapp.gallery;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6ZQ;
import X.AnonymousClass7FZ;
import X.AnonymousClass87Y;
import X.C000200d;
import X.C008703w;
import X.C108965cb;
import X.C26521Sl;
import X.C34501ka;
import X.C36241nZ;
import X.C58432kg;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_GalleryTabHostFragment extends WaFragment {
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
            GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r3.A2Q;
            AnonymousClass10G r4 = r2.A00;
            galleryTabHostFragment.A0D = C72473Md.A0T(r2, r4, galleryTabHostFragment);
            galleryTabHostFragment.A07 = C108965cb.A0K(r2);
            galleryTabHostFragment.A0N = AnonymousClass3MX.A12(r2);
            galleryTabHostFragment.A06 = AnonymousClass10E.A12(r2);
            galleryTabHostFragment.A0O = C000200d.A00(r2.AVb);
            galleryTabHostFragment.A0P = C000200d.A00(r4.A2e);
            galleryTabHostFragment.A0F = (C34501ka) r2.A68.get();
            galleryTabHostFragment.A0K = (C26521Sl) r2.A69.get();
            AnonymousClass1K1 r32 = r3.A2O;
            galleryTabHostFragment.A0G = (AnonymousClass87Y) r32.A2g.get();
            galleryTabHostFragment.A0Q = C000200d.A00(r32.A4g);
            galleryTabHostFragment.A0R = C000200d.A00(r4.ADC);
            galleryTabHostFragment.A0J = (AnonymousClass7FZ) r4.ADD.get();
            galleryTabHostFragment.A0H = (C58432kg) r2.AYd.get();
            galleryTabHostFragment.A0S = C000200d.A00(r32.A5H);
            galleryTabHostFragment.A05 = (AnonymousClass6ZQ) r32.A5V.get();
            galleryTabHostFragment.A0I = AnonymousClass3Ma.A0r(r2);
            galleryTabHostFragment.A09 = AnonymousClass3Ma.A0a(r2);
            galleryTabHostFragment.A0A = AnonymousClass10E.A6O(r2);
            galleryTabHostFragment.A0T = C000200d.A00(r2.AlU);
            galleryTabHostFragment.A0U = C000200d.A00(r4.AIG);
            galleryTabHostFragment.A08 = AnonymousClass3MZ.A0f(r2);
            galleryTabHostFragment.A0V = C000200d.A00(r32.A61);
            galleryTabHostFragment.A0W = C000200d.A00(r4.AId);
            galleryTabHostFragment.A0X = C000200d.A00(r2.AmD);
            galleryTabHostFragment.A0B = AnonymousClass3MZ.A0l(r2);
            galleryTabHostFragment.A0Y = AnonymousClass3MW.A0s(r2);
            galleryTabHostFragment.A0Z = C000200d.A00(r2.ABl);
            galleryTabHostFragment.A0L = AnonymousClass10E.AL1(r2);
            galleryTabHostFragment.A0a = C000200d.A00(r32.A66);
            galleryTabHostFragment.A0C = AnonymousClass10E.A6Q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_GalleryTabHostFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
