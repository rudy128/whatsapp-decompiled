package com.whatsapp.ctwa;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CtwaFMXAdPreviewFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            CtwaFMXAdPreviewFragment ctwaFMXAdPreviewFragment = (CtwaFMXAdPreviewFragment) this;
            AnonymousClass10E A0N = C72473Md.A0N(ctwaFMXAdPreviewFragment, AnonymousClass3MX.A0S(this));
            ctwaFMXAdPreviewFragment.A02 = AnonymousClass3MZ.A0N(A0N);
            ctwaFMXAdPreviewFragment.A07 = C000200d.A00(A0N.AJi);
            ctwaFMXAdPreviewFragment.A08 = C000200d.A00(A0N.A8r);
            ctwaFMXAdPreviewFragment.A09 = C000200d.A00(A0N.A4b);
            ctwaFMXAdPreviewFragment.A0A = C000200d.A00(A0N.A63);
            ctwaFMXAdPreviewFragment.A0B = C000200d.A00(A0N.AA9);
            ctwaFMXAdPreviewFragment.A0C = C000200d.A00(A0N.ABY);
            ctwaFMXAdPreviewFragment.A0D = C000200d.A00(A0N.A0n);
            ctwaFMXAdPreviewFragment.A0E = C000200d.A00(A0N.AC1);
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
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ctwa.Hilt_CtwaFMXAdPreviewFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
