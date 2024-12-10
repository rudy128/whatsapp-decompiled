package com.whatsapp.messaging;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C008703w;
import X.C134196qC;
import X.C31131f4;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ViewOnceAudioFragment extends BaseViewOnceMessageViewerFragment {
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
            ViewOnceAudioFragment viewOnceAudioFragment = (ViewOnceAudioFragment) this;
            C36241nZ r0 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r0.A2Q;
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass3MX.A1M(r1, viewOnceAudioFragment);
            viewOnceAudioFragment.A00 = AnonymousClass3Ma.A0W(r0.A2O);
            viewOnceAudioFragment.A03 = AnonymousClass3MX.A12(r2);
            viewOnceAudioFragment.A01 = AnonymousClass10E.AFe(r2);
            viewOnceAudioFragment.A00 = AnonymousClass3MZ.A0i(r2);
            viewOnceAudioFragment.A01 = (C134196qC) r1.A38.get();
            viewOnceAudioFragment.A02 = (C31131f4) r2.A6M.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.Hilt_ViewOnceAudioFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
