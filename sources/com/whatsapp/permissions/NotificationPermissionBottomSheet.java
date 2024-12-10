package com.whatsapp.permissions;

import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass3MW;
import X.C81043yb;
import android.content.DialogInterface;

public final class NotificationPermissionBottomSheet extends Hilt_NotificationPermissionBottomSheet {
    public AnonymousClass11P A00;
    public AnonymousClass18K A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0047, code lost:
        if (r1.A2a("android.permission.POST_NOTIFICATIONS") != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r7, android.view.View r8) {
        /*
            r6 = this;
            r4 = 0
            X.C18070vi.A0d(r8, r4)
            super.A21(r7, r8)
            r0 = 2131433770(0x7f0b192a, float:1.8489335E38)
            android.widget.TextView r5 = X.C17880vN.A0E(r8, r0)
            android.content.Context r3 = r8.getContext()
            android.content.Context r2 = r8.getContext()
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.C72463Mc.A0w(r2, r3, r5, r1, r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r8)
            r0 = 2131169436(0x7f07109c, float:1.7953202E38)
            float r0 = r1.getDimension(r0)
            r5.setTextSize(r4, r0)
            r0 = 2131435879(0x7f0b2167, float:1.8493613E38)
            android.widget.TextView r2 = X.AnonymousClass3Ma.A0E(r8, r0)
            X.0z4 r1 = r6.A04
            if (r1 == 0) goto L_0x0098
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = r1.A2a(r0)
            r0 = 2131889754(0x7f120e5a, float:1.941418E38)
            if (r1 == 0) goto L_0x004c
        L_0x0049:
            r0 = 2131894341(0x7f122045, float:1.9423484E38)
        L_0x004c:
            r2.setText(r0)
            X.C89964dJ.A00(r2, r6, r4)
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.view.View r1 = X.C18070vi.A05(r8, r0)
            r0 = 1
            X.C89964dJ.A00(r1, r6, r0)
            X.0z4 r1 = r6.A04
            if (r1 == 0) goto L_0x0098
            X.11P r0 = r6.A00
            if (r0 == 0) goto L_0x0095
            long r2 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r1)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "notification_nag_last_shown_time_key"
            X.C17880vN.A1D(r1, r0, r2)
            X.0z4 r3 = r6.A04
            if (r3 == 0) goto L_0x0098
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r2 = "notification_nag_count_key"
            int r0 = r0.getInt(r2, r4)
            int r1 = r0 + 1
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1C(r0, r2, r1)
            A00(r6, r4)
            return
        L_0x0095:
            java.lang.String r0 = "time"
            goto L_0x009a
        L_0x0098:
            java.lang.String r0 = "waSharedPreferences"
        L_0x009a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.permissions.NotificationPermissionBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        A00(this, 1);
        A29();
    }

    public static final void A00(NotificationPermissionBottomSheet notificationPermissionBottomSheet, int i) {
        C81043yb r1 = new C81043yb();
        r1.A00 = Integer.valueOf(i);
        AnonymousClass18K r0 = notificationPermissionBottomSheet.A01;
        if (r0 != null) {
            r0.CC7(r1);
        } else {
            AnonymousClass3MW.A1J();
            throw null;
        }
    }
}
