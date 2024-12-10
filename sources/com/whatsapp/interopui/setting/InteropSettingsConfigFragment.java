package com.whatsapp.interopui.setting;

import X.AnonymousClass1LU;
import X.C18070vi;
import X.C18100vl;
import X.C39541tF;
import X.C99154sM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.settings.SettingsRowIconText;

public final class InteropSettingsConfigFragment extends Hilt_InteropSettingsConfigFragment {
    public AnonymousClass1LU A00;
    public C39541tF A01;
    public SettingsRowIconText A02;
    public final C18100vl A03 = C99154sM.A01(this, 34);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625375, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r8, android.view.View r9) {
        /*
            r7 = this;
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            r0 = 2131435264(0x7f0b1f00, float:1.8492365E38)
            android.view.View r6 = r9.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r6 = (com.whatsapp.settings.SettingsRowIconText) r6
            X.0vl r0 = r7.A03
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.interopui.setting.InteropSettingsViewModel r0 = (com.whatsapp.interopui.setting.InteropSettingsViewModel) r0
            X.00H r0 = r0.A05
            X.1jg r0 = X.AnonymousClass3MX.A0k(r0)
            android.content.SharedPreferences r2 = X.C33971jg.A00(r0)
            java.lang.String r1 = "optedInIntegratorNames"
            X.1Om r0 = X.C25511Om.A00
            java.util.Set r0 = r2.getStringSet(r1, r0)
            if (r0 == 0) goto L_0x00b0
            java.util.List r5 = X.C29431cG.A0t(r0)
        L_0x002d:
            int r0 = r5.size()
            r1 = 1
            r4 = 2
            if (r0 <= r4) goto L_0x0094
            r2 = 2131895822(0x7f12260e, float:1.9426488E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C72473Md.A1O(r5, r1)
            int r0 = X.AnonymousClass3MX.A02(r5, r4)
            X.C17880vN.A1T(r1, r0, r4)
        L_0x0045:
            java.lang.String r0 = r7.A1I(r2, r1)
        L_0x0049:
            r6.setSubText((java.lang.CharSequence) r0)
            r0 = 29
            X.C89954dI.A00(r6, r7, r0)
            r0 = 2131435331(0x7f0b1f43, float:1.8492501E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r7.A02 = r0
            X.1tF r0 = r7.A01
            if (r0 == 0) goto L_0x00b4
            boolean r1 = r0.A02()
            com.whatsapp.settings.SettingsRowIconText r0 = r7.A02
            if (r1 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x006d
            r0.setVisibility(r3)
        L_0x006d:
            com.whatsapp.settings.SettingsRowIconText r1 = r7.A02
            if (r1 == 0) goto L_0x0076
            r0 = 30
            X.C89954dI.A00(r1, r7, r0)
        L_0x0076:
            r0 = 2131435330(0x7f0b1f42, float:1.84925E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 31
            X.C89954dI.A00(r1, r7, r0)
            X.1pm r2 = X.AnonymousClass3MZ.A0G(r7)
            r1 = 0
            com.whatsapp.interopui.setting.InteropSettingsConfigFragment$initObservables$1 r0 = new com.whatsapp.interopui.setting.InteropSettingsConfigFragment$initObservables$1
            r0.<init>(r7, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x0090:
            X.C72453Mb.A1B(r0)
            goto L_0x0076
        L_0x0094:
            int r0 = r5.size()
            if (r0 != r4) goto L_0x00a3
            r2 = 2131895821(0x7f12260d, float:1.9426486E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.C72473Md.A1O(r5, r1)
            goto L_0x0045
        L_0x00a3:
            int r0 = r5.size()
            if (r0 != r1) goto L_0x00ae
            java.lang.String r0 = X.C17880vN.A0w(r5, r3)
            goto L_0x0049
        L_0x00ae:
            r0 = 0
            goto L_0x0049
        L_0x00b0:
            X.0wS r5 = X.C18460wS.A00
            goto L_0x002d
        L_0x00b4:
            java.lang.String r0 = "interopRolloutManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.setting.InteropSettingsConfigFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A1s() {
        super.A1s();
        this.A02 = null;
    }
}
