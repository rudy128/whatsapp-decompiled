package com.whatsapp.contact.picker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1L2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C008903z;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C36241nZ;
import X.C72453Mb;
import X.C72483Me;
import X.C87894Xm;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_BaseSharedPreviewDialogFragment extends WaDialogFragment {
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
        if (this instanceof Hilt_SharedTextPreviewDialogFragment) {
            Hilt_SharedTextPreviewDialogFragment hilt_SharedTextPreviewDialogFragment = (Hilt_SharedTextPreviewDialogFragment) this;
            if (!hilt_SharedTextPreviewDialogFragment.A00) {
                hilt_SharedTextPreviewDialogFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_SharedTextPreviewDialogFragment);
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) hilt_SharedTextPreviewDialogFragment;
                AnonymousClass10E r3 = ((C36241nZ) A0S).A2Q;
                C72483Me.A0t(r3, sharedTextPreviewDialogFragment);
                AnonymousClass10G r2 = r3.A00;
                sharedTextPreviewDialogFragment.A03 = AnonymousClass10G.A8i(r2);
                sharedTextPreviewDialogFragment.A05 = AnonymousClass10E.A12(r3);
                sharedTextPreviewDialogFragment.A04 = C108965cb.A0G(r3);
                sharedTextPreviewDialogFragment.A06 = AnonymousClass10E.A4z(r3);
                sharedTextPreviewDialogFragment.A08 = AnonymousClass3Ma.A0a(r3);
                sharedTextPreviewDialogFragment.A07 = AnonymousClass3MZ.A0g(r3);
                sharedTextPreviewDialogFragment.A0I = C108975cc.A0P(r2);
                sharedTextPreviewDialogFragment.A01 = AnonymousClass3MY.A0N(r3);
                sharedTextPreviewDialogFragment.A0J = AnonymousClass10E.AL1(r3);
                sharedTextPreviewDialogFragment.A0C = AnonymousClass3MY.A0d(r3);
                sharedTextPreviewDialogFragment.A0A = AnonymousClass3Ma.A0g(r3);
                sharedTextPreviewDialogFragment.A02 = C108965cb.A0H(r3);
                sharedTextPreviewDialogFragment.A09 = AnonymousClass3Ma.A0f(r3);
                sharedTextPreviewDialogFragment.A0M = C000200d.A00(r3.AYd);
                sharedTextPreviewDialogFragment.A08 = C108985cd.A0T(r3);
                sharedTextPreviewDialogFragment.A00 = AnonymousClass3MZ.A0N(r3);
                sharedTextPreviewDialogFragment.A0H = AnonymousClass3MZ.A12(r3);
                sharedTextPreviewDialogFragment.A0F = AnonymousClass10G.A9z(r2);
                sharedTextPreviewDialogFragment.A0K = C108965cb.A0i(r2);
                sharedTextPreviewDialogFragment.A05 = AnonymousClass3Ma.A0c(r3);
                sharedTextPreviewDialogFragment.A0N = C000200d.A00(r3.AAD);
                sharedTextPreviewDialogFragment.A0G = C108965cb.A0Z(r3);
                sharedTextPreviewDialogFragment.A0E = AnonymousClass3Ma.A0r(r3);
                sharedTextPreviewDialogFragment.A0B = (C87894Xm) r2.AH7.get();
                sharedTextPreviewDialogFragment.A0L = C108965cb.A0j(r2);
                sharedTextPreviewDialogFragment.A07 = (AnonymousClass1L2) r2.A40.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = (BaseSharedPreviewDialogFragment) this;
            AnonymousClass10E r1 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            C72483Me.A0t(r1, baseSharedPreviewDialogFragment);
            C108965cb.A15(r1, baseSharedPreviewDialogFragment);
            baseSharedPreviewDialogFragment.A05 = AnonymousClass10E.A12(r1);
            baseSharedPreviewDialogFragment.A04 = C108965cb.A0G(r1);
            baseSharedPreviewDialogFragment.A06 = AnonymousClass10E.A4z(r1);
            baseSharedPreviewDialogFragment.A08 = AnonymousClass3Ma.A0a(r1);
            baseSharedPreviewDialogFragment.A07 = AnonymousClass3MZ.A0g(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.Hilt_BaseSharedPreviewDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
