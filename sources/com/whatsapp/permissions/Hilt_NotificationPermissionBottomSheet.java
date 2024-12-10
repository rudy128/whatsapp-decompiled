package com.whatsapp.permissions;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C18070vi;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_NotificationPermissionBottomSheet extends RequestPermissionsBottomSheet {
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
            NotificationPermissionBottomSheet notificationPermissionBottomSheet = (NotificationPermissionBottomSheet) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r1 = r2.A00;
            C72483Me.A0v(r1, notificationPermissionBottomSheet);
            notificationPermissionBottomSheet.A05 = AnonymousClass10E.A8r(r2);
            notificationPermissionBottomSheet.A00 = AnonymousClass3MZ.A0N(r2);
            notificationPermissionBottomSheet.A06 = C000200d.A00(r2.A4U);
            notificationPermissionBottomSheet.A01 = AnonymousClass10E.A12(r2);
            notificationPermissionBottomSheet.A03 = AnonymousClass3Ma.A0a(r2);
            notificationPermissionBottomSheet.A02 = C72463Mc.A0Y(r1);
            notificationPermissionBottomSheet.A04 = AnonymousClass3Ma.A0c(r2);
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r2);
            C18070vi.A0d(A6O, 0);
            notificationPermissionBottomSheet.A00 = A6O;
            AnonymousClass18K A0g = AnonymousClass3Ma.A0g(r2);
            C18070vi.A0d(A0g, 0);
            notificationPermissionBottomSheet.A01 = A0g;
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.permissions.Hilt_NotificationPermissionBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
