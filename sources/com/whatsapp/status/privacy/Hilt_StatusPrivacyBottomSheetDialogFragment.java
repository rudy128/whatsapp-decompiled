package com.whatsapp.status.privacy;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C108965cb;
import X.C108995ce;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_StatusPrivacyBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r3.A2Q;
            AnonymousClass10G r4 = r2.A00;
            C108995ce.A18(r4, statusPrivacyBottomSheetDialogFragment);
            statusPrivacyBottomSheetDialogFragment.A04 = AnonymousClass10E.A8r(r2);
            statusPrivacyBottomSheetDialogFragment.A0B = C000200d.A00(r2.A34);
            statusPrivacyBottomSheetDialogFragment.A0A = C108965cb.A0h(r2);
            statusPrivacyBottomSheetDialogFragment.A00 = AnonymousClass3Ma.A0c(r2);
            statusPrivacyBottomSheetDialogFragment.A0C = C000200d.A00(r2.A9u);
            statusPrivacyBottomSheetDialogFragment.A0D = C000200d.A00(r4.A4e);
            statusPrivacyBottomSheetDialogFragment.A0E = C000200d.A00(r2.AAB);
            statusPrivacyBottomSheetDialogFragment.A0F = C000200d.A00(r2.AAD);
            statusPrivacyBottomSheetDialogFragment.A0G = C000200d.A00(r3.A1b);
            statusPrivacyBottomSheetDialogFragment.A03 = C108955ca.A0M(r2);
            statusPrivacyBottomSheetDialogFragment.A06 = C108965cb.A0Z(r2);
            statusPrivacyBottomSheetDialogFragment.A05 = AnonymousClass3MY.A0Z(r2);
            statusPrivacyBottomSheetDialogFragment.A0H = C000200d.A00(r2.ABv);
            statusPrivacyBottomSheetDialogFragment.A01 = AnonymousClass10E.A6Q(r2);
            statusPrivacyBottomSheetDialogFragment.A0I = C000200d.A00(r2.AC9);
            statusPrivacyBottomSheetDialogFragment.A0J = C000200d.A00(r2.Anv);
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
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.privacy.Hilt_StatusPrivacyBottomSheetDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
