package com.whatsapp.events;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4K8;
import X.AnonymousClass689;
import X.C000200d;
import X.C008703w;
import X.C218617r;
import X.C32021gV;
import X.C32981i4;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_EventCreateOrEditFragment extends WaFragment {
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
            EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            eventCreateOrEditFragment.A0N = C72473Md.A0T(r2, r3, eventCreateOrEditFragment);
            eventCreateOrEditFragment.A0I = AnonymousClass3Ma.A0d(r2);
            eventCreateOrEditFragment.A0J = (C32981i4) r2.A3G.get();
            eventCreateOrEditFragment.A0L = AnonymousClass3Ma.A0f(r2);
            eventCreateOrEditFragment.A0K = C72463Mc.A0c(r3);
            eventCreateOrEditFragment.A03 = (AnonymousClass4K8) r4.A0j.get();
            eventCreateOrEditFragment.A0e = C000200d.A00(r2.A3m);
            eventCreateOrEditFragment.A0f = C000200d.A00(r3.A9g);
            eventCreateOrEditFragment.A0g = C000200d.A00(r2.A3n);
            eventCreateOrEditFragment.A04 = (C218617r) r2.A8v.get();
            eventCreateOrEditFragment.A05 = AnonymousClass10E.A12(r2);
            eventCreateOrEditFragment.A0R = AnonymousClass3Ma.A0w(r3);
            eventCreateOrEditFragment.A0i = AnonymousClass3MZ.A1B(r2);
            eventCreateOrEditFragment.A0O = (AnonymousClass689) r2.A5q.get();
            eventCreateOrEditFragment.A0j = AnonymousClass3MZ.A1C(r2);
            eventCreateOrEditFragment.A0S = (C32021gV) r2.A6k.get();
            eventCreateOrEditFragment.A0Q = C72453Mb.A0p(r2);
            eventCreateOrEditFragment.A0P = AnonymousClass3Ma.A0r(r2);
            eventCreateOrEditFragment.A0E = AnonymousClass3Ma.A0a(r2);
            eventCreateOrEditFragment.A0F = AnonymousClass10E.A6O(r2);
            eventCreateOrEditFragment.A0h = AnonymousClass3MW.A0s(r2);
            eventCreateOrEditFragment.A0G = AnonymousClass3Ma.A0b(r2);
            eventCreateOrEditFragment.A0H = AnonymousClass10E.A6Q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.Hilt_EventCreateOrEditFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
