package com.whatsapp.statuscomposer.composer;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1T6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4JA;
import X.AnonymousClass72B;
import X.AnonymousClass736;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C124856Zy;
import X.C124866Zz;
import X.C125026aN;
import X.C140126zz;
import X.C19890zB;
import X.C36241nZ;
import X.C56422hR;
import X.C61862qP;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_TextStatusComposerFragment extends WaFragment {
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
            TextStatusComposerFragment textStatusComposerFragment = (TextStatusComposerFragment) this;
            C36241nZ r5 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r5.A2Q;
            AnonymousClass10G r3 = r2.A00;
            textStatusComposerFragment.A0X = C72473Md.A0T(r2, r3, textStatusComposerFragment);
            textStatusComposerFragment.A0I = (C125026aN) r5.A15.get();
            textStatusComposerFragment.A0C = AnonymousClass3MY.A0N(r2);
            textStatusComposerFragment.A0y = C000200d.A00(r3.A1F);
            textStatusComposerFragment.A0u = (AnonymousClass72B) r2.A34.get();
            textStatusComposerFragment.A0z = C000200d.A00(r3.A8m);
            AnonymousClass1K1 r4 = r5.A2O;
            textStatusComposerFragment.A0Z = AnonymousClass1K1.A18(r4);
            textStatusComposerFragment.A0V = AnonymousClass3Ma.A0f(r2);
            textStatusComposerFragment.A10 = C108965cb.A0i(r3);
            textStatusComposerFragment.A11 = C000200d.A00(r5.A1h);
            textStatusComposerFragment.A0J = C108965cb.A0G(r2);
            textStatusComposerFragment.A0x = C108965cb.A0h(r2);
            textStatusComposerFragment.A0b = (AnonymousClass736) r2.AUc.get();
            textStatusComposerFragment.A0c = (C140126zz) r3.AFN.get();
            textStatusComposerFragment.A0K = AnonymousClass10E.A12(r2);
            textStatusComposerFragment.A0r = AnonymousClass3MZ.A12(r2);
            textStatusComposerFragment.A0s = C108975cc.A0P(r3);
            textStatusComposerFragment.A0E = (C61862qP) r4.A7g.get();
            textStatusComposerFragment.A0f = AnonymousClass3MY.A0d(r2);
            textStatusComposerFragment.A0g = (AnonymousClass1T6) r2.A6B.get();
            textStatusComposerFragment.A0U = C108985cd.A0T(r2);
            textStatusComposerFragment.A0h = AnonymousClass1K1.A1G(r4);
            textStatusComposerFragment.A0j = AnonymousClass3Ma.A0r(r2);
            textStatusComposerFragment.A0F = (C56422hR) r4.A2t.get();
            textStatusComposerFragment.A12 = C000200d.A00(r3.A4e);
            textStatusComposerFragment.A13 = C000200d.A00(r2.AAB);
            textStatusComposerFragment.A14 = C000200d.A00(r2.AAD);
            textStatusComposerFragment.A0T = C108955ca.A0M(r2);
            textStatusComposerFragment.A0k = C108965cb.A0Z(r2);
            textStatusComposerFragment.A0P = AnonymousClass3Ma.A0a(r2);
            textStatusComposerFragment.A0G = (C124856Zy) r5.A16.get();
            textStatusComposerFragment.A0B = C19890zB.A00;
            textStatusComposerFragment.A0Q = AnonymousClass10E.A6O(r2);
            textStatusComposerFragment.A0M = AnonymousClass3MZ.A0U(r2);
            textStatusComposerFragment.A0H = (C124866Zz) r5.A19.get();
            textStatusComposerFragment.A0e = AnonymousClass3MY.A0Z(r2);
            textStatusComposerFragment.A0R = AnonymousClass3Ma.A0c(r2);
            textStatusComposerFragment.A0t = AnonymousClass10E.AL1(r2);
            textStatusComposerFragment.A0Y = AnonymousClass3Ma.A0g(r2);
            textStatusComposerFragment.A0D = (AnonymousClass4JA) r4.A69.get();
            textStatusComposerFragment.A15 = C000200d.A00(r2.ABv);
            textStatusComposerFragment.A0S = AnonymousClass10E.A6Q(r2);
            textStatusComposerFragment.A16 = C000200d.A00(r3.A5I);
            textStatusComposerFragment.A17 = C000200d.A00(r2.AC9);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.Hilt_TextStatusComposerFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
