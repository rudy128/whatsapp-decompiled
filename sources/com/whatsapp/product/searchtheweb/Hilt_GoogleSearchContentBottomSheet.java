package com.whatsapp.product.searchtheweb;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C38541rS;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_GoogleSearchContentBottomSheet extends WDSBottomSheetDialogFragment {
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
            GoogleSearchContentBottomSheet googleSearchContentBottomSheet = (GoogleSearchContentBottomSheet) this;
            AnonymousClass10E r1 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            googleSearchContentBottomSheet.A01 = C72473Md.A0U(r1, r1.A00, googleSearchContentBottomSheet);
            googleSearchContentBottomSheet.A04 = AnonymousClass3MX.A10(r1);
            googleSearchContentBottomSheet.A00 = AnonymousClass10E.A12(r1);
            googleSearchContentBottomSheet.A03 = (C38541rS) r1.A5j.get();
            googleSearchContentBottomSheet.A02 = AnonymousClass3MY.A0Z(r1);
            googleSearchContentBottomSheet.A05 = C000200d.A00(r1.A9B);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.searchtheweb.Hilt_GoogleSearchContentBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
