package com.whatsapp.community;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4K4;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C54832em;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_JoinGroupBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [X.31c, java.lang.Object] */
    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = (JoinGroupBottomSheetFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            C72483Me.A0v(r3, joinGroupBottomSheetFragment);
            joinGroupBottomSheetFragment.A0W = AnonymousClass10E.A6O(r2);
            joinGroupBottomSheetFragment.A0d = AnonymousClass10E.A8r(r2);
            joinGroupBottomSheetFragment.A0N = C72453Mb.A0d(r2);
            joinGroupBottomSheetFragment.A0i = AnonymousClass3MY.A0e(r3);
            joinGroupBottomSheetFragment.A0Y = AnonymousClass3Ma.A0d(r2);
            joinGroupBottomSheetFragment.A0c = AnonymousClass3Ma.A0f(r2);
            joinGroupBottomSheetFragment.A0G = AnonymousClass3MZ.A0N(r2);
            joinGroupBottomSheetFragment.A0U = AnonymousClass3MZ.A0i(r2);
            joinGroupBottomSheetFragment.A0k = AnonymousClass10E.AL1(r2);
            joinGroupBottomSheetFragment.A0e = AnonymousClass3MY.A0Z(r2);
            joinGroupBottomSheetFragment.A0S = AnonymousClass3MZ.A0e(r2);
            joinGroupBottomSheetFragment.A0V = AnonymousClass3Ma.A0a(r2);
            joinGroupBottomSheetFragment.A0X = AnonymousClass10E.A6Q(r2);
            joinGroupBottomSheetFragment.A0b = AnonymousClass3MZ.A0s(r2);
            joinGroupBottomSheetFragment.A0a = (C54832em) r2.AkC.get();
            joinGroupBottomSheetFragment.A0p = C000200d.A00(r2.A7s);
            joinGroupBottomSheetFragment.A0o = AnonymousClass3MX.A10(r2);
            joinGroupBottomSheetFragment.A0R = AnonymousClass10E.A48(r2);
            joinGroupBottomSheetFragment.A0I = (AnonymousClass4K4) r4.A0S.get();
            joinGroupBottomSheetFragment.A0Z = AnonymousClass3MY.A0V(r2);
            joinGroupBottomSheetFragment.A0g = AnonymousClass3Ma.A0r(r2);
            joinGroupBottomSheetFragment.A0L = AnonymousClass3MZ.A0T(r3);
            joinGroupBottomSheetFragment.A0Q = new Object();
            joinGroupBottomSheetFragment.A0H = AnonymousClass3MY.A0N(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_JoinGroupBottomSheetFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
