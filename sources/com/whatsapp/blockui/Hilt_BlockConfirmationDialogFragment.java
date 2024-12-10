package com.whatsapp.blockui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C108975cc;
import X.C108985cd;
import X.C136876uY;
import X.C138636xR;
import X.C18030ve;
import X.C24921Me;
import X.C33251iW;
import X.C36241nZ;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_BlockConfirmationDialogFragment extends WaDialogFragment {
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
            BlockConfirmationDialogFragment blockConfirmationDialogFragment = (BlockConfirmationDialogFragment) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r3.A2Q;
            C72483Me.A0t(r2, blockConfirmationDialogFragment);
            AnonymousClass10G r4 = r2.A00;
            blockConfirmationDialogFragment.A03 = AnonymousClass10G.A8i(r4);
            blockConfirmationDialogFragment.A00 = AnonymousClass3MZ.A0N(r2);
            blockConfirmationDialogFragment.A09 = C000200d.A00(r3.A2O.A0D);
            blockConfirmationDialogFragment.A03 = AnonymousClass10E.A4z(r2);
            blockConfirmationDialogFragment.A07 = C108975cc.A0O(r2);
            blockConfirmationDialogFragment.A0A = C000200d.A00(r2.A5V);
            blockConfirmationDialogFragment.A08 = AnonymousClass3MY.A0e(r4);
            blockConfirmationDialogFragment.A05 = AnonymousClass3Ma.A0a(r2);
            AnonymousClass11P A6P = AnonymousClass10E.A6P(r2);
            C18030ve A8q = AnonymousClass10E.A8q(r2);
            AnonymousClass10I AL0 = AnonymousClass10E.AL0(r2);
            C33251iW r5 = (C33251iW) r2.ABA.get();
            C24921Me A0R = C108985cd.A0R(r2);
            AnonymousClass00H A002 = C000200d.A00(r2.A0x);
            blockConfirmationDialogFragment.A02 = new C138636xR((AnonymousClass1KB) r2.A4b.get(), r5, A0R, (C136876uY) r2.A00.AHR.get(), A6P, A8q, (AnonymousClass1LU) r2.ABd.get(), C36241nZ.A0h(r3), AL0, A002);
            blockConfirmationDialogFragment.A04 = AnonymousClass3MZ.A0g(r2);
            blockConfirmationDialogFragment.A06 = AnonymousClass3MY.A0Z(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.blockui.Hilt_BlockConfirmationDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
