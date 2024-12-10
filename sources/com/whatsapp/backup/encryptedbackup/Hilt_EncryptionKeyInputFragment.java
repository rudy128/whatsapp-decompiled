package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_EncryptionKeyInputFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            EncryptionKeyInputFragment encryptionKeyInputFragment = (EncryptionKeyInputFragment) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r1 = r2.A00;
            encryptionKeyInputFragment.A09 = C72473Md.A0T(r2, r1, encryptionKeyInputFragment);
            encryptionKeyInputFragment.A02 = AnonymousClass3MZ.A0N(r2);
            encryptionKeyInputFragment.A03 = AnonymousClass3MY.A0N(r2);
            encryptionKeyInputFragment.A04 = AnonymousClass10E.A12(r2);
            encryptionKeyInputFragment.A0B = C000200d.A00(r2.A5j);
            encryptionKeyInputFragment.A08 = AnonymousClass3Ma.A0a(r2);
            encryptionKeyInputFragment.A0A = AnonymousClass3MY.A0Z(r2);
            encryptionKeyInputFragment.A05 = C72463Mc.A0Y(r1);
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
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.Hilt_EncryptionKeyInputFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A25();
    }
}
