package com.whatsapp.statuscomposer.composer;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1Cd;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C108965cb;
import X.C133276oU;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public abstract class Hilt_CameraStatusFragment extends WaFragment {
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
            CameraStatusFragment cameraStatusFragment = (CameraStatusFragment) this;
            C36241nZ r1 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r3 = r1.A2Q;
            AnonymousClass10G r4 = r3.A00;
            cameraStatusFragment.A07 = C72473Md.A0T(r3, r4, cameraStatusFragment);
            cameraStatusFragment.A01 = C108965cb.A0K(r3);
            AnonymousClass1K1 r12 = r1.A2O;
            cameraStatusFragment.A03 = (C133276oU) r12.A0T.get();
            cameraStatusFragment.A06 = AnonymousClass10E.A84(r3);
            cameraStatusFragment.A0B = r12.A5c;
            cameraStatusFragment.A0A = C000200d.A00(r4.ADC);
            cameraStatusFragment.A05 = (AnonymousClass1Cd) r3.A6i.get();
            cameraStatusFragment.A09 = AnonymousClass1K1.A1b(r12);
            cameraStatusFragment.A04 = AnonymousClass3Ma.A0b(r3);
            cameraStatusFragment.A08 = (WhatsAppLibLoader) r3.ABy.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.Hilt_CameraStatusFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
