package com.whatsapp.gallerypicker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1Q5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C108965cb;
import X.C31191fA;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_GalleryPickerFragment extends WaFragment {
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
            GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            galleryPickerFragment.A0G = C72473Md.A0T(r2, r3, galleryPickerFragment);
            galleryPickerFragment.A07 = C108965cb.A0K(r2);
            galleryPickerFragment.A08 = (C31191fA) r2.A25.get();
            galleryPickerFragment.A09 = AnonymousClass10E.A4z(r2);
            galleryPickerFragment.A0A = AnonymousClass3MZ.A0i(r2);
            galleryPickerFragment.A0L = C000200d.A00(r4.A1B);
            galleryPickerFragment.A05 = AnonymousClass10E.A12(r2);
            galleryPickerFragment.A0M = C000200d.A00(r4.A2O.A4e);
            galleryPickerFragment.A0N = C000200d.A00(r3.ADC);
            galleryPickerFragment.A0J = (AnonymousClass1Q5) r2.A8O.get();
            galleryPickerFragment.A0O = C000200d.A00(r2.A9c);
            galleryPickerFragment.A0B = AnonymousClass3Ma.A0a(r2);
            galleryPickerFragment.A0C = AnonymousClass10E.A6O(r2);
            galleryPickerFragment.A0D = AnonymousClass3MZ.A0l(r2);
            galleryPickerFragment.A0P = AnonymousClass3MW.A0s(r2);
            galleryPickerFragment.A0E = AnonymousClass3Ma.A0b(r2);
            galleryPickerFragment.A0F = AnonymousClass10E.A6Q(r2);
            galleryPickerFragment.A0K = AnonymousClass10E.AL1(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.Hilt_GalleryPickerFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
