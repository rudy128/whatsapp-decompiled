package com.whatsapp.expressionstray.search;

import X.A59;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C000200d;
import X.C008703w;
import X.C108975cc;
import X.C108995ce;
import X.C27021Uk;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.expressions.BaseExpressionsTray;

public abstract class Hilt_ExpressionsSearchView extends BaseExpressionsTray {
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
            ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r1 = r2.A00;
            expressionsSearchView.A0I = C108995ce.A0O(r2, r1, expressionsSearchView);
            expressionsSearchView.A0M = (C27021Uk) r2.A0R.get();
            expressionsSearchView.A0Q = C000200d.A00(r4.A2O.A09);
            expressionsSearchView.A0D = (A59) r1.A1h.get();
            expressionsSearchView.A0O = C108975cc.A0P(r1);
            expressionsSearchView.A0K = AnonymousClass3MY.A0Z(r2);
            expressionsSearchView.A0C = AnonymousClass10E.A6Q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.search.Hilt_ExpressionsSearchView.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
