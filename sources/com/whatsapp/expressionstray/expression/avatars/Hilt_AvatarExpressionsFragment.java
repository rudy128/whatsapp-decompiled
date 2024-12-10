package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C108965cb;
import X.C25311Ns;
import X.C36241nZ;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;

public abstract class Hilt_AvatarExpressionsFragment extends WaDialogFragment {
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
            AvatarExpressionsFragment avatarExpressionsFragment = (AvatarExpressionsFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            C72483Me.A0t(r2, avatarExpressionsFragment);
            AnonymousClass10G r3 = r2.A00;
            avatarExpressionsFragment.A03 = AnonymousClass10G.A8i(r3);
            avatarExpressionsFragment.A09 = AnonymousClass10E.A84(r2);
            avatarExpressionsFragment.A0H = C108965cb.A0j(r3);
            avatarExpressionsFragment.A05 = (C25311Ns) r2.A9R.get();
            avatarExpressionsFragment.A0I = C000200d.A00(r3.AH3);
            avatarExpressionsFragment.A0E = (AvatarSquidConfiguration) r2.ADx.get();
            avatarExpressionsFragment.A0F = C108965cb.A0a(r2);
            avatarExpressionsFragment.A0J = C000200d.A00(r4.A1c);
            avatarExpressionsFragment.A0K = C000200d.A00(r3.A4w);
            avatarExpressionsFragment.A07 = AnonymousClass10E.A6O(r2);
            avatarExpressionsFragment.A08 = AnonymousClass3MZ.A0l(r2);
            avatarExpressionsFragment.A0L = AnonymousClass3MW.A0s(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.Hilt_AvatarExpressionsFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
