package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1SB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C000200d;
import X.C008703w;
import X.C108965cb;
import X.C139076yA;
import X.C25311Ns;
import X.C36241nZ;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_StickerExpressionsFragment extends WaDialogFragment {
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
            StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            C72483Me.A0t(r2, stickerExpressionsFragment);
            AnonymousClass10G r3 = r2.A00;
            stickerExpressionsFragment.A03 = AnonymousClass10G.A8i(r3);
            stickerExpressionsFragment.A0K = C000200d.A00(r3.A8n);
            stickerExpressionsFragment.A0L = C108965cb.A0j(r3);
            stickerExpressionsFragment.A0M = C000200d.A00(r3.A9l);
            stickerExpressionsFragment.A08 = C108965cb.A0G(r2);
            stickerExpressionsFragment.A0N = C000200d.A00(r3.ABQ);
            stickerExpressionsFragment.A0O = C000200d.A00(r3.A2J);
            stickerExpressionsFragment.A09 = AnonymousClass10E.A12(r2);
            stickerExpressionsFragment.A0P = C000200d.A00(r3.AD5);
            stickerExpressionsFragment.A0Q = C000200d.A00(r2.Ag2);
            stickerExpressionsFragment.A0A = (C25311Ns) r2.A9R.get();
            stickerExpressionsFragment.A0R = C000200d.A00(r3.AH3);
            stickerExpressionsFragment.A0S = C000200d.A00(r3.AH5);
            stickerExpressionsFragment.A0H = C108965cb.A0a(r2);
            stickerExpressionsFragment.A0D = (C139076yA) r3.AHl.get();
            stickerExpressionsFragment.A0I = (AnonymousClass1SB) r2.AAS.get();
            stickerExpressionsFragment.A0T = C000200d.A00(r4.A1c);
            stickerExpressionsFragment.A0U = C000200d.A00(r3.AHo);
            stickerExpressionsFragment.A0V = C000200d.A00(r3.A4w);
            stickerExpressionsFragment.A0B = AnonymousClass10E.A6O(r2);
            stickerExpressionsFragment.A0W = AnonymousClass3MW.A0s(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.Hilt_StickerExpressionsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
