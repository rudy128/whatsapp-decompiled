package com.whatsapp.reactions;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1Q8;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C108955ca;
import X.C108995ce;
import X.C191569mo;
import X.C33251iW;
import X.C36241nZ;
import X.C56882iB;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_ReactionsBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
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
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r3 = r2.A00;
            C108995ce.A18(r3, reactionsBottomSheetDialogFragment);
            reactionsBottomSheetDialogFragment.A0G = AnonymousClass10E.A8r(r2);
            reactionsBottomSheetDialogFragment.A00 = AnonymousClass3MZ.A0N(r2);
            reactionsBottomSheetDialogFragment.A0C = (AnonymousClass1Q8) r2.AGY.get();
            reactionsBottomSheetDialogFragment.A0D = AnonymousClass3Ma.A0d(r2);
            reactionsBottomSheetDialogFragment.A0N = C000200d.A00(r2.A2L);
            reactionsBottomSheetDialogFragment.A06 = AnonymousClass3MZ.A0e(r2);
            reactionsBottomSheetDialogFragment.A07 = AnonymousClass10E.A4z(r2);
            reactionsBottomSheetDialogFragment.A09 = AnonymousClass3MZ.A0j(r2);
            reactionsBottomSheetDialogFragment.A0O = AnonymousClass3MX.A12(r2);
            reactionsBottomSheetDialogFragment.A01 = AnonymousClass10E.A12(r2);
            reactionsBottomSheetDialogFragment.A0E = AnonymousClass3MY.A0V(r2);
            reactionsBottomSheetDialogFragment.A02 = AnonymousClass10E.A17(r2);
            reactionsBottomSheetDialogFragment.A0L = C108955ca.A0b(r2);
            reactionsBottomSheetDialogFragment.A0F = (C56882iB) r2.AdX.get();
            reactionsBottomSheetDialogFragment.A0K = (C191569mo) r3.AG1.get();
            reactionsBottomSheetDialogFragment.A03 = (C33251iW) r2.AB9.get();
            reactionsBottomSheetDialogFragment.A08 = AnonymousClass3MZ.A0g(r2);
            reactionsBottomSheetDialogFragment.A0H = AnonymousClass3MY.A0Z(r2);
            reactionsBottomSheetDialogFragment.A0M = AnonymousClass10E.AL1(r2);
            reactionsBottomSheetDialogFragment.A0B = AnonymousClass10E.A6Q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reactions.Hilt_ReactionsBottomSheetDialogFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
