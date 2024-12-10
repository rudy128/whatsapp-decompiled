package com.whatsapp.accountswitching.routing;

import X.AGB;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass040;
import X.AnonymousClass11O;
import X.AnonymousClass19K;
import X.AnonymousClass1CM;
import X.AnonymousClass1LU;
import X.AnonymousClass8BT;
import X.C006002q;
import X.C006302u;
import X.C17880vN;
import X.C19830z4;
import X.C24051Ir;
import X.C31361fR;

public final class AccountSwitchingRoutingActivity extends AnonymousClass01E implements AnonymousClass009 {
    public C31361fR A00;
    public C19830z4 A01;
    public AnonymousClass11O A02;
    public AnonymousClass1LU A03;
    public AnonymousClass1CM A04;
    public AnonymousClass19K A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public C006302u A09;
    public boolean A0A;
    public final Object A0B;
    public volatile C006002q A0C;

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = 1
            r7 = r17
            r7.requestWindowFeature(r0)
            android.view.Window r0 = r7.getWindow()
            r14 = 0
            X.AnonymousClass3Ma.A1H(r0, r14)
            r0 = r18
            super.onCreate(r0)
            android.app.Application r0 = r7.getApplication()
            boolean r0 = r0 instanceof X.AnonymousClass009
            if (r0 == 0) goto L_0x0028
            X.02q r0 = r7.A2x()
            X.02u r0 = r0.A00()
            r7.A09 = r0
            X.AnonymousClass8BW.A14(r7, r0)
        L_0x0028:
            android.content.Intent r6 = r7.getIntent()
            X.C18070vi.A0X(r6)
            java.lang.String r5 = "inactiveAccountNotificationId"
            r0 = -1
            int r4 = r6.getIntExtra(r5, r0)
            java.lang.String r3 = "inactiveAccountNotificationTag"
            java.lang.String r2 = r6.getStringExtra(r3)
            if (r4 == r0) goto L_0x0067
            if (r2 == 0) goto L_0x0067
            boolean r0 = X.AnonymousClass1YF.A0T(r2)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r7.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.NotificationManager"
            X.C18070vi.A0z(r1, r0)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            r1.cancel(r2, r4)
            r6.removeExtra(r5)
            r6.removeExtra(r3)
            X.19K r0 = r7.A05
            if (r0 == 0) goto L_0x023d
            X.A7W r0 = X.AnonymousClass8BR.A0D(r0)
            r0.A09(r2)
        L_0x0067:
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "switch_to_account_lid"
            java.lang.String r8 = r1.getStringExtra(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "switch_to_account_dir_id"
            java.lang.String r9 = r1.getStringExtra(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "source"
            int r13 = r1.getIntExtra(r0, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRoutingActivity/switch to account lid/lid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ";dirId="
            X.C17900vP.A0f(r0, r9, r1)
            X.00H r0 = r7.A08
            if (r0 == 0) goto L_0x0236
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.739 r2 = (X.AnonymousClass739) r2
            r1 = 0
            r0 = 16
            r2.A04(r1, r13, r0)
            X.1fR r0 = r7.A00
            if (r0 == 0) goto L_0x0230
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "AccountSwitchingRoutingActivity/change number in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Rj r2 = X.AnonymousClass4a6.A00(r7)
            r2.A0T(r14)
            r0 = 2131888037(0x7f1207a5, float:1.9410698E38)
            r2.A0E(r0)
            r0 = 2131888036(0x7f1207a4, float:1.9410696E38)
            r2.A0D(r0)
            r1 = 2131893145(0x7f121b99, float:1.9421058E38)
            r0 = 16
            X.C20151A9n.A00(r2, r7, r0, r1)
            r2.A0C()
            return
        L_0x00d4:
            X.0z4 r0 = r7.A01
            if (r0 == 0) goto L_0x022a
            java.lang.String r0 = r0.A0i()
            if (r0 == 0) goto L_0x0108
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "AccountSwitchingRoutingActivity/login failed dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r3 = r7.A01
            if (r3 == 0) goto L_0x0102
            X.11O r2 = r7.A02
            if (r2 == 0) goto L_0x00fc
            r1 = 24
            X.3Bu r0 = new X.3Bu
            r0.<init>(r7, r1)
            X.A9B.A0K(r7, r3, r2, r0, r8)
            return
        L_0x00fc:
            java.lang.String r0 = "waStartupSharedPreferences"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0102:
            java.lang.String r0 = "waSharedPreferences"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0108:
            X.1CM r0 = r7.A04
            if (r0 == 0) goto L_0x0224
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x016c
            X.1CM r0 = r7.A04
            if (r0 == 0) goto L_0x0166
            int r1 = r0.A00(r14)
            r0 = 2
            if (r1 != r0) goto L_0x014b
            java.lang.String r0 = "AccountSwitchingRoutingActivity/register name/account backup dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r0 = r7.A01
            if (r0 == 0) goto L_0x0144
            int r3 = r0.A0E()
            X.11O r0 = r7.A02
            if (r0 == 0) goto L_0x013d
            java.lang.String r2 = r0.A01()
            r1 = 25
            X.3Bu r0 = new X.3Bu
            r0.<init>(r7, r1)
            X.A9B.A0L(r7, r0, r8, r2, r3)
            return
        L_0x013d:
            java.lang.String r0 = "waStartupSharedPreferences"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0144:
            java.lang.String r0 = "waSharedPreferences"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x014b:
            java.lang.String r0 = "AccountSwitchingRoutingActivity/abandon add new account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r7.A06
            if (r0 == 0) goto L_0x015f
            X.1cN r0 = X.C17880vN.A0I(r0)
            r0.A0B(r7, r8, r14)
            r7.finish()
            return
        L_0x015f:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0166:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r1
        L_0x016c:
            if (r8 == 0) goto L_0x019d
            int r0 = r8.length()
            if (r0 == 0) goto L_0x019d
            X.00H r0 = r7.A06
            if (r0 == 0) goto L_0x01c6
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.2rb r0 = r0.A03()
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = r0.A07
        L_0x0184:
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 == 0) goto L_0x019d
            java.lang.String r0 = "AccountSwitchingRoutingActivity/switch account lid same as current account lid, opening home activity"
        L_0x018c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1LU r0 = r7.A03
            if (r0 == 0) goto L_0x01c2
            android.content.Intent r0 = X.AnonymousClass1LU.A02(r7)
            r7.startActivity(r0)
            return
        L_0x019b:
            r0 = 0
            goto L_0x0184
        L_0x019d:
            X.00H r0 = r7.A07
            if (r0 == 0) goto L_0x021e
            X.2u4 r0 = X.C17880vN.A0J(r0)
            X.10b r0 = r0.A01
            java.lang.String r0 = r0.A00()
            boolean r0 = X.C64012u4.A09(r9, r0)
            if (r0 == 0) goto L_0x01d2
            X.00H r0 = r7.A07
            if (r0 == 0) goto L_0x01cc
            X.2u4 r0 = X.C17880vN.A0J(r0)
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = "AccountSwitchingRoutingActivity/switch account dirId same as active account dirId, opening home activity"
            goto L_0x018c
        L_0x01c2:
            X.AnonymousClass3MW.A1F()
            throw r1
        L_0x01c6:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            throw r1
        L_0x01cc:
            java.lang.String r0 = "accountSwitchingDataRepo"
            X.C18070vi.A11(r0)
            throw r1
        L_0x01d2:
            if (r8 == 0) goto L_0x01da
            int r0 = r8.length()
            if (r0 != 0) goto L_0x01e2
        L_0x01da:
            if (r9 == 0) goto L_0x0217
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0217
        L_0x01e2:
            java.lang.String r0 = "AccountSwitchingRoutingActivity/switch account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r7.A06
            if (r0 == 0) goto L_0x0211
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.1cN r6 = (X.C29491cN) r6
            X.AtM r12 = new X.AtM
            r12.<init>(r7)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "is_missed_call_notification"
            boolean r15 = r1.getBooleanExtra(r0, r14)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "account_switching_sender_jid"
            java.lang.String r10 = r1.getStringExtra(r0)
            r11 = 0
            r16 = r14
            r6.A0I(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0211:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0217:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x021e:
            java.lang.String r0 = "accountSwitchingDataRepo"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0224:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r1
        L_0x022a:
            java.lang.String r0 = "waSharedPreferences"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0230:
            java.lang.String r0 = "changeNumberManager"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0236:
            java.lang.String r0 = "accountSwitchingLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x023d:
            java.lang.String r0 = "workManagerLazy"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity.onCreate(android.os.Bundle):void");
    }

    public final C006002q A2x() {
        if (this.A0C == null) {
            synchronized (this.A0B) {
                if (this.A0C == null) {
                    this.A0C = new C006002q(this);
                }
            }
        }
        return this.A0C;
    }

    public AccountSwitchingRoutingActivity(int i) {
        this.A0B = C17880vN.A0p();
        this.A0A = false;
        AGB.A00(this, 6);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2x().generatedComponent();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A09);
    }

    public AccountSwitchingRoutingActivity() {
        this(0);
    }
}
