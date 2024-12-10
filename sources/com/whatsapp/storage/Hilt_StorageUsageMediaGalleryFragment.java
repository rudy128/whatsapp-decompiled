package com.whatsapp.storage;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1ST;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C109005cf;
import X.C32211gp;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

public abstract class Hilt_StorageUsageMediaGalleryFragment extends MediaGalleryFragmentBase {
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
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            C109005cf.A0b(r4, r2, C72473Md.A0T(r2, r3, storageUsageMediaGalleryFragment), storageUsageMediaGalleryFragment);
            C109005cf.A0W(r4.A2O, r4, r2, r3, storageUsageMediaGalleryFragment);
            storageUsageMediaGalleryFragment.A01 = AnonymousClass3MZ.A0N(r2);
            storageUsageMediaGalleryFragment.A02 = AnonymousClass3MY.A0N(r2);
            storageUsageMediaGalleryFragment.A09 = AnonymousClass3MX.A12(r2);
            storageUsageMediaGalleryFragment.A03 = (AnonymousClass1ST) r2.A6C.get();
            storageUsageMediaGalleryFragment.A0A = C000200d.A00(r2.AYQ);
            storageUsageMediaGalleryFragment.A0B = C000200d.A00(r2.A6L);
            storageUsageMediaGalleryFragment.A04 = AnonymousClass3MZ.A0o(r2);
            storageUsageMediaGalleryFragment.A07 = C108955ca.A0b(r2);
            storageUsageMediaGalleryFragment.A05 = (C32211gp) r2.A9r.get();
            storageUsageMediaGalleryFragment.A08 = AnonymousClass3MZ.A13(r2);
            storageUsageMediaGalleryFragment.A0C = C000200d.A00(r2.AAv);
            storageUsageMediaGalleryFragment.A0D = AnonymousClass3MW.A0s(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.Hilt_StorageUsageMediaGalleryFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
