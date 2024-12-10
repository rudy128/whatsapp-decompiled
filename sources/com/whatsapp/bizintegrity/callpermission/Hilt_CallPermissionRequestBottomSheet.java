package com.whatsapp.bizintegrity.callpermission;

import X.A2A;
import X.AnonymousClass10E;
import X.AnonymousClass121;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C170008nw;
import X.C183019Wp;
import X.C183999aF;
import X.C190949lm;
import X.C191709n3;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CallPermissionRequestBottomSheet extends WDSBottomSheetDialogFragment {
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
            CallPermissionRequestBottomSheet callPermissionRequestBottomSheet = (CallPermissionRequestBottomSheet) this;
            AnonymousClass10E A0N = C72473Md.A0N(callPermissionRequestBottomSheet, AnonymousClass3MX.A0S(this));
            callPermissionRequestBottomSheet.A06 = (C191709n3) A0N.A0r.get();
            callPermissionRequestBottomSheet.A0G = C000200d.A00(A0N.A0s);
            callPermissionRequestBottomSheet.A08 = (C183019Wp) A0N.AGh.get();
            callPermissionRequestBottomSheet.A0A = (A2A) A0N.A1Y.get();
            callPermissionRequestBottomSheet.A0B = (C190949lm) A0N.AGj.get();
            callPermissionRequestBottomSheet.A0C = (C183999aF) A0N.AF1.get();
            callPermissionRequestBottomSheet.A0E = (AnonymousClass121) A0N.A2y.get();
            callPermissionRequestBottomSheet.A07 = (C170008nw) A0N.AGg.get();
            callPermissionRequestBottomSheet.A03 = AnonymousClass3MZ.A0U(A0N);
            callPermissionRequestBottomSheet.A0F = AnonymousClass10E.AL1(A0N);
            callPermissionRequestBottomSheet.A0D = AnonymousClass10E.A6Q(A0N);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.callpermission.Hilt_CallPermissionRequestBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
