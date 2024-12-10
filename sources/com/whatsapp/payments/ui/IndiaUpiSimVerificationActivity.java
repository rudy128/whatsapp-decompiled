package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.B93;
import X.C137116uw;
import X.C1764594h;
import X.C19997A2l;
import X.C20112A7u;
import X.C219217x;
import X.C60442o2;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.view.Menu;
import android.view.MenuItem;

public class IndiaUpiSimVerificationActivity extends AnonymousClass91T implements B93 {
    public C219217x A00;
    public C1764594h A01;
    public C19997A2l A02;
    public boolean A03;

    private void A0V(String str) {
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        A032.A07("device_binding_failure_reason", str);
        this.A0S.BiM(A032, (Integer) null, "payments_device_binding_precheck", "verify_number", 0);
    }

    private void A03() {
        this.A01.A00.A08("verifyNumberClicked");
        Intent A07 = AnonymousClass8BR.A07(this, IndiaUpiDeviceBindStepActivity.class);
        A07.putExtras(AnonymousClass3MY.A09(this));
        C60442o2.A00(A07, this.A05, "verifyNumber");
        A4v(A07);
        AnonymousClass8BU.A13(A07, this, "extra_previous_screen", "verify_number");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity r13) {
        /*
            X.17x r1 = r13.A00
            java.lang.String r2 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r2)
            if (r0 != 0) goto L_0x0011
            boolean r0 = r1.A0I()
            r1 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r9 = 0
            r12 = 0
            X.17x r0 = r13.A00
            if (r1 == 0) goto L_0x020c
            java.lang.String r1 = "android.permission.RECEIVE_SMS"
            int r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0031
            X.17x r0 = r13.A00
            int r0 = r0.A02(r2)
            if (r0 != 0) goto L_0x0031
            java.lang.String[] r1 = X.C17880vN.A1a(r1, r12)
            r0 = 100
            X.C110885hR.A0B(r13, r1, r0)
        L_0x0031:
            boolean r0 = X.AnonymousClass11E.A02(r13)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "airplane_mode_on"
            r13.A0V(r0)
            r0 = 2131893857(0x7f121e61, float:1.9422502E38)
        L_0x003f:
            r13.BhQ(r0)
            return
        L_0x0043:
            X.11C r0 = r13.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            if (r0 == 0) goto L_0x006d
            int r1 = r0.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x006d
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r2 < r0) goto L_0x0176
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.C19740yt.A01(r13, r0)
            if (r0 == 0) goto L_0x0076
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "WaPermissionsHelper#hasSendSMSAndTelephonePermissions() is missing android.permission.READ_PHONE_STATE permission"
            r1.A05(r0)
            java.lang.String r0 = "read_phone_permission_issues"
            r13.A0V(r0)
            return
        L_0x006d:
            java.lang.String r0 = "sim_state_issues"
            r13.A0V(r0)
            r0 = 2131893859(0x7f121e63, float:1.9422506E38)
            goto L_0x003f
        L_0x0076:
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r13)
            java.util.List r4 = r0.getActiveSubscriptionInfoList()
            X.A7u[] r0 = new X.C20112A7u[r12]
            X.A7u r8 = X.C20112A7u.A03(r0)
            int r0 = r4.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "number_of_sims"
            r8.A07(r0, r1)
            X.AZ6 r7 = r13.A0S
            java.lang.String r10 = "payments_device_binding_precheck"
            java.lang.String r11 = "verify_number"
            r7.BiM(r8, r9, r10, r11, r12)
            int r1 = r4.size()
            if (r1 == 0) goto L_0x0171
            java.lang.String r6 = "allow_undetermined_number_device_binding"
            r5 = 1
            if (r1 == r5) goto L_0x01bf
            r0 = 2
            if (r1 == r0) goto L_0x00b8
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "Phone has more than 2 sims, which we do not support"
            r1.A05(r0)
            java.lang.String r0 = "more_than_two_sims"
            r13.A0V(r0)
            r13.finish()
            return
        L_0x00b8:
            X.11S r0 = r13.A02
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)
            java.lang.Object r0 = r4.get(r12)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r2 = r0.getNumber()
            java.lang.Object r0 = r4.get(r5)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r1 = r0.getNumber()
            if (r3 == 0) goto L_0x0122
            java.lang.String r0 = r3.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0122
            X.A2l r0 = r13.A02
            java.lang.String r8 = r3.user
            X.A0B r0 = r0.A01
            X.1LA r7 = r0.A00
            X.AZ6 r0 = r0.A04
            boolean r0 = X.A0B.A00(r7, r0, r2, r8)
            if (r0 == 0) goto L_0x0104
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "sim 1 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.AXS r1 = r13.A0N
            java.lang.Object r0 = r4.get(r12)
        L_0x00f9:
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            int r0 = r0.getSubscriptionId()
            r1.A0N(r0)
            goto L_0x01e6
        L_0x0104:
            X.A2l r0 = r13.A02
            java.lang.String r7 = r3.user
            X.A0B r0 = r0.A01
            X.1LA r3 = r0.A00
            X.AZ6 r0 = r0.A04
            boolean r0 = X.A0B.A00(r3, r0, r1, r7)
            if (r0 == 0) goto L_0x0134
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "sim 2 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.AXS r1 = r13.A0N
            java.lang.Object r0 = r4.get(r5)
            goto L_0x00f9
        L_0x0122:
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "Jid Info null, show sim picker"
            goto L_0x0130
        L_0x0127:
            X.AZ6 r0 = r13.A0S
            r0.BiL(r9, r6, r9, r12)
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "Did not find WA number, show sim picker"
        L_0x0130:
            r1.A06(r0)
            goto L_0x0158
        L_0x0134:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0127
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0127
            X.0ve r2 = r13.A0E
            r1 = 1774(0x6ee, float:2.486E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            X.1QE r1 = r13.A0q
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = "Cannot read sim number(s) to compare with WA, show sim picker"
            r1.A06(r0)
            X.AZ6 r0 = r13.A0S
            r0.BiL(r9, r6, r9, r12)
        L_0x0158:
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.util.ArrayList r1 = X.C17880vN.A10(r4)
            java.lang.String r0 = "extra_subscriptions"
            r2.putParcelableArrayList(r0, r1)
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r0 = new com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment
            r0.<init>()
            r0.A1R(r2)
            r13.CMl(r0)
            return
        L_0x0171:
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "found no sim information, proceeding"
            goto L_0x01e3
        L_0x0176:
            X.1QE r3 = r13.A0q
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Trying payments on android sdk level"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", we do not have sim apis"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x019f
        L_0x018b:
            X.A2l r0 = r13.A02
            java.lang.String r2 = r1.user
            X.A0B r0 = r0.A01
            X.1LA r1 = r0.A00
            X.AZ6 r0 = r0.A04
            boolean r0 = X.A0B.A00(r1, r0, r3, r2)
            X.1QE r3 = r13.A0q
            if (r0 == 0) goto L_0x01a3
            java.lang.String r0 = "wa number matches with sim number, proceeding"
        L_0x019f:
            r3.A06(r0)
            goto L_0x01e6
        L_0x01a3:
            java.lang.String r0 = "wa number didn't match with sim number, showing error"
            r3.A05(r0)
            X.0ve r2 = r13.A0E
            r1 = 1774(0x6ee, float:2.486E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01f4
            java.lang.String r0 = "Cannot read sim number, allow device binding"
            r3.A06(r0)
            X.AZ6 r0 = r13.A0S
            r0.BiL(r9, r6, r9, r12)
            goto L_0x01e6
        L_0x01bf:
            java.lang.Object r0 = r4.get(r12)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r3 = r0.getNumber()
            X.11S r0 = r13.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            if (r1 == 0) goto L_0x01ea
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ea
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x018b
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "found one sim, but not able to read phone number, proceeding"
        L_0x01e3:
            r1.A05(r0)
        L_0x01e6:
            r13.A03()
            return
        L_0x01ea:
            X.1QE r1 = r13.A0q
            java.lang.String r0 = "Jid Info null, proceeding"
            goto L_0x01e3
        L_0x01ef:
            java.lang.String r0 = "Found sims numbers and they do not match, show error"
            r1.A06(r0)
        L_0x01f4:
            r3 = 2131894068(0x7f121f34, float:1.942293E38)
            r2 = 2131894067(0x7f121f33, float:1.9422928E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.11S r0 = r13.A02
            X.1E8 r0 = X.AnonymousClass3MZ.A0Q(r0)
            java.lang.String r0 = X.AnonymousClass17K.A02(r0)
            r1[r12] = r0
            r13.BhU(r1, r3, r2)
            return
        L_0x020c:
            X.AnonymousClass74O.A0D(r13, r0)
            X.AZ6 r2 = r13.A0S
            java.lang.String r1 = "allow_sms_dialog"
            java.lang.String r0 = "verify_number"
            r2.BiL(r9, r1, r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.A0Q(com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity):void");
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            this.A00 = AnonymousClass3Ma.A0b(r2);
            this.A02 = r2.AHJ();
            this.A01 = (C1764594h) r1.ACM.get();
        }
    }

    public void C5i(SubscriptionInfo subscriptionInfo) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A0N.A0N(subscriptionInfo.getSubscriptionId());
            A03();
            return;
        }
        this.A0q.A05("Why sim picker is showing for < 22 api level?");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 153) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0S.BiL(66, "allow_sms_dialog", (String) null, 1);
            A0Q(this);
        } else {
            BhQ(2131894071);
            this.A0S.BiL(67, "allow_sms_dialog", (String) null, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r9 = r18
            r0 = r19
            super.onCreate(r0)
            r0 = 2131625693(0x7f0e06dd, float:1.8878601E38)
            r9.setContentView((int) r0)
            r1 = 2131232758(0x7f0807f6, float:1.8081634E38)
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            r9.A4r(r1, r0)
            X.01n r1 = r9.getSupportActionBar()
            r4 = 1
            if (r1 == 0) goto L_0x002a
            r0 = 2131893788(0x7f121e1c, float:1.9422362E38)
            java.lang.String r0 = r9.getString(r0)
            r1.A0S(r0)
            r1.A0W(r4)
        L_0x002a:
            r0 = 2131429918(0x7f0b0a1e, float:1.8481522E38)
            android.widget.TextView r6 = X.AnonymousClass3MX.A0L(r9, r0)
            r5 = 2131894060(0x7f121f2c, float:1.9422914E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.11S r0 = r9.A02
            X.1E8 r0 = X.AnonymousClass3MZ.A0Q(r0)
            java.lang.String r2 = X.AnonymousClass17K.A02(r0)
            r0 = 0
            if (r2 == 0) goto L_0x004b
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r2.replace(r1, r0)
        L_0x004b:
            r2 = 0
            r3[r2] = r0
            X.AnonymousClass3MY.A0y(r9, r6, r3, r5)
            X.11C r0 = r9.A08
            android.telephony.TelephonyManager r3 = r0.A0K()
            X.17x r1 = r9.A00
            java.lang.String r0 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00e8
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x00e8
            boolean r0 = X.AnonymousClass11E.A02(r9)
            if (r0 != 0) goto L_0x00e8
            if (r3 == 0) goto L_0x00e8
            int r1 = r3.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x00e8
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00e8
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.C19740yt.A01(r9, r0)
            if (r0 != 0) goto L_0x00e8
            X.A2l r0 = r9.A02
            java.util.List r3 = r0.A04(r9)
            int r1 = r3.size()
            r0 = 2
            if (r1 != r0) goto L_0x00e8
            r0 = 2131433920(0x7f0b19c0, float:1.848964E38)
            android.widget.TextView r5 = X.AnonymousClass3MX.A0L(r9, r0)
            X.11S r0 = r9.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            java.lang.String r7 = X.C17880vN.A0w(r3, r2)
            java.lang.String r3 = X.C17880vN.A0w(r3, r4)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e2
            java.lang.String r8 = r1.user
            X.A2l r0 = r9.A02
            X.A0B r0 = r0.A01
            X.1LA r1 = r0.A00
            X.AZ6 r0 = r0.A04
            boolean r0 = X.A0B.A00(r1, r0, r7, r8)
            if (r0 != 0) goto L_0x00e2
            X.A2l r0 = r9.A02
            X.A0B r0 = r0.A01
            X.1LA r1 = r0.A00
            X.AZ6 r0 = r0.A04
            boolean r0 = X.A0B.A00(r1, r0, r3, r8)
            if (r0 == 0) goto L_0x012d
            r3 = 2131894061(0x7f121f2d, float:1.9422916E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.11S r0 = r9.A02
            X.1E8 r0 = X.AnonymousClass3MZ.A0Q(r0)
            java.lang.String r0 = X.AnonymousClass17K.A02(r0)
            r1[r2] = r0
            X.AnonymousClass3MY.A0y(r9, r6, r1, r3)
        L_0x00e2:
            r0 = 2131894063(0x7f121f2f, float:1.942292E38)
            r5.setText(r0)
        L_0x00e8:
            r0 = 2131433195(0x7f0b16eb, float:1.8488169E38)
            com.whatsapp.TextEmojiLabel r13 = X.AnonymousClass8BR.A0H(r9, r0)
            X.0ve r15 = r9.A0E
            X.1KB r12 = r9.A05
            X.1L9 r11 = r9.A01
            X.11C r14 = r9.A08
            r3 = 2131893922(0x7f121ea2, float:1.9422634E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "learn-more"
            java.lang.String r16 = X.C17880vN.A0q(r9, r1, r0, r2, r3)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"
            android.net.Uri r10 = android.net.Uri.parse(r0)
            r17 = r1
            X.C26302CxJ.A0K(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r13.setVisibility(r2)
            r0 = 2131436711(0x7f0b24a7, float:1.84953E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 6
            X.AFQ.A00(r1, r9, r0)
            X.AZ6 r0 = r9.A0S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = r9.A0c
            java.lang.String r6 = r9.A0f
            r1 = 0
            java.lang.String r5 = "verify_number"
            r3 = r1
            r0.A0B(r1, r2, r3, r4, r5, r6)
            return
        L_0x012d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00e2
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x00e8
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiSimVerificationActivity(int i) {
        this.A03 = false;
        AGD.A00(this, 31);
    }

    public void A3h(int i) {
        if (!(i == 2131894071 || i == 2131893857 || i == 2131893859 || i == 2131894068 || i == 2131894067)) {
            A4o();
        }
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A0B((C20112A7u) null, 1, 1, this.A0c, "verify_number", this.A0f);
        if (!this.A0N.A0R()) {
            Intent A07 = AnonymousClass1LU.A07(this);
            A4v(A07);
            A3q(A07, true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A4w(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432589) {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A00.A0F(2131625694);
            AnonymousClass91T.A1F(A002, this, "verify_number", "payments:verify-number");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        this.A01.A00.A08("verifyNumberShown");
    }

    public IndiaUpiSimVerificationActivity() {
        this(0);
    }
}
