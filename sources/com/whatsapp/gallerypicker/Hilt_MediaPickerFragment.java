package com.whatsapp.gallerypicker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C008703w;
import X.C109005cf;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.gallery.Hilt_NewMediaPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.media.WamediaManager;

public abstract class Hilt_MediaPickerFragment extends MediaGalleryFragmentBase {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (this instanceof Hilt_NewMediaPickerFragment) {
            Hilt_NewMediaPickerFragment hilt_NewMediaPickerFragment = (Hilt_NewMediaPickerFragment) this;
            if (!hilt_NewMediaPickerFragment.A00) {
                hilt_NewMediaPickerFragment.A00 = true;
                C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(hilt_NewMediaPickerFragment);
                AnonymousClass10E r2 = r3.A2Q;
                AnonymousClass10G r1 = r2.A00;
                C109005cf.A0b(r3, r2, C72473Md.A0T(r2, r1, hilt_NewMediaPickerFragment), hilt_NewMediaPickerFragment);
                AnonymousClass1K1 r0 = r3.A2O;
                C109005cf.A0W(r0, r3, r2, r1, hilt_NewMediaPickerFragment);
                C109005cf.A0X(r0, r2, r1, hilt_NewMediaPickerFragment);
                hilt_NewMediaPickerFragment.A07 = AnonymousClass10E.A6O(r2);
                hilt_NewMediaPickerFragment.A06 = AnonymousClass3MZ.A0f(r2);
                hilt_NewMediaPickerFragment.A0A = (WamediaManager) r2.ABs.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r22 = r4.A2Q;
            AnonymousClass10G r12 = r22.A00;
            C109005cf.A0b(r4, r22, C72473Md.A0T(r22, r12, mediaPickerFragment), mediaPickerFragment);
            AnonymousClass1K1 r02 = r4.A2O;
            C109005cf.A0W(r02, r4, r22, r12, mediaPickerFragment);
            C109005cf.A0X(r02, r22, r12, mediaPickerFragment);
            mediaPickerFragment.A07 = AnonymousClass10E.A6O(r22);
            mediaPickerFragment.A06 = AnonymousClass3MZ.A0f(r22);
            mediaPickerFragment.A0A = (WamediaManager) r22.ABs.get();
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
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.Hilt_MediaPickerFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A25();
    }
}
