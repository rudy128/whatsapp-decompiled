package com.whatsapp.biz.education;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.C008703w;
import X.C108975cc;
import X.C183959aB;
import X.C18600wl;
import X.C189759jn;
import X.C19880zA;
import X.C19890zB;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_MetaVerifiedEducationBottomSheet extends WDSBottomSheetDialogFragment {
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
            MetaVerifiedEducationBottomSheet metaVerifiedEducationBottomSheet = (MetaVerifiedEducationBottomSheet) this;
            AnonymousClass10E r4 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r3 = r4.A00;
            metaVerifiedEducationBottomSheet.A08 = C72473Md.A0U(r4, r3, metaVerifiedEducationBottomSheet);
            metaVerifiedEducationBottomSheet.A0E = AnonymousClass8BT.A0f(r4);
            metaVerifiedEducationBottomSheet.A09 = C108975cc.A0O(r4);
            metaVerifiedEducationBottomSheet.A0G = AnonymousClass3MZ.A1B(r4);
            metaVerifiedEducationBottomSheet.A0A = AnonymousClass3MY.A0e(r3);
            metaVerifiedEducationBottomSheet.A0H = (C18600wl) r4.A9F.get();
            metaVerifiedEducationBottomSheet.A07 = (C183959aB) r3.ADc.get();
            C19890zB r1 = C19890zB.A00;
            metaVerifiedEducationBottomSheet.A00 = r1;
            metaVerifiedEducationBottomSheet.A0B = (C189759jn) r4.AdV.get();
            metaVerifiedEducationBottomSheet.A01 = AnonymousClass8BV.A0A(r4);
            metaVerifiedEducationBottomSheet.A02 = (C19880zA) r4.A7l.get();
            metaVerifiedEducationBottomSheet.A03 = r1;
            metaVerifiedEducationBottomSheet.A04 = (C19880zA) r4.A7k.get();
            metaVerifiedEducationBottomSheet.A0F = AnonymousClass3MW.A0s(r4);
            metaVerifiedEducationBottomSheet.A06 = C72463Mc.A0Y(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.education.Hilt_MetaVerifiedEducationBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
