package X;

import android.content.DialogInterface;

public class A9T implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public A9T(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d1, code lost:
        r2.A02((X.C1406772n) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        X.AnonymousClass4aU.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r12, int r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x00b5;
                case 2: goto L_0x0075;
                case 3: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r11.A01
            com.whatsapp.settings.SettingsCompanionLogoutDialog r3 = (com.whatsapp.settings.SettingsCompanionLogoutDialog) r3
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "SettingsCompanionLogoutDialog/onCreateDialog/remove account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1L9 r2 = r3.A00
            android.content.Context r1 = r3.A14()
            android.content.Context r4 = r3.A14()
            X.0z4 r0 = r3.A04
            int r7 = r0.A0E()
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.11O r0 = r3.A05
            java.lang.String r6 = r0.A01()
            r5 = 0
            r8 = 18
            android.content.Intent r0 = X.AnonymousClass1LU.A1X(r4, r5, r6, r7, r8, r9)
            r2.A08(r1, r0)
        L_0x0036:
            return
        L_0x0037:
            java.lang.Object r4 = r11.A01
            com.whatsapp.settings.SettingsChatHistoryFragment r4 = (com.whatsapp.settings.SettingsChatHistoryFragment) r4
            boolean r3 = r11.A02
            X.8dO r1 = r4.A00
            if (r1 == 0) goto L_0x0036
            r0 = 5
            X.AnonymousClass4Yv.A00(r1, r0)
            r2 = 2131894782(0x7f1221fe, float:1.9424378E38)
            r1 = 2131895077(0x7f122325, float:1.9424977E38)
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x0052
            r0.CNB(r2, r1)
        L_0x0052:
            X.10I r2 = r4.A0C
            r1 = 33
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.CGF(r0)
            return
        L_0x005f:
            X.10I r2 = r3.A07
            r1 = 45
            X.7Qo r0 = new X.7Qo
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGN(r0)
            X.1KB r2 = r3.A01
            r1 = 0
            r0 = 2131891827(0x7f121673, float:1.9418385E38)
            r2.A07(r1, r0)
            return
        L_0x0075:
            java.lang.Object r5 = r11.A01
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r5 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r5
            boolean r4 = r11.A02
            X.1FL r3 = r5.A1B()
            if (r3 == 0) goto L_0x009a
            X.0ve r2 = r5.A02
            r1 = 8926(0x22de, float:1.2508E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x009a
            X.1o3 r1 = r5.A04
            if (r4 == 0) goto L_0x0097
            java.lang.String r0 = "security-code-not-verified"
        L_0x0093:
            r1.A01(r3, r0)
            return
        L_0x0097:
            java.lang.String r0 = "about-e2e-encryption"
            goto L_0x0093
        L_0x009a:
            X.129 r1 = r5.A06
            if (r4 == 0) goto L_0x00b2
            java.lang.String r0 = "seeing-your-security-code-could-not-be-verified"
        L_0x00a0:
            android.net.Uri r0 = r1.A04(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r1 = r5.A00
            android.content.Context r0 = r5.A1n()
            r1.A08(r0, r2)
            return
        L_0x00b2:
            java.lang.String r0 = "26000361"
            goto L_0x00a0
        L_0x00b5:
            java.lang.Object r1 = r11.A01
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r1 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r1
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x00d6
            X.02n r2 = r1.A09
            java.lang.String[] r1 = X.C27091Ur.A09
            goto L_0x00d1
        L_0x00c2:
            boolean r1 = r11.A02
            java.lang.Object r0 = r11.A01
            X.8kf r0 = (X.C169258kf) r0
            if (r1 == 0) goto L_0x00da
            X.02n r2 = r0.A0D
            java.lang.String[] r1 = X.C27091Ur.A09
            X.C18070vi.A0Z(r1)
        L_0x00d1:
            r0 = 0
            r2.A02(r0, r1)
            return
        L_0x00d6:
            X.1FL r0 = r1.A1D()
        L_0x00da:
            X.AnonymousClass4aU.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9T.onClick(android.content.DialogInterface, int):void");
    }
}
