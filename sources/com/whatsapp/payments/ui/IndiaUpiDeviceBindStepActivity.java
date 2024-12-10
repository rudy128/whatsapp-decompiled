package com.whatsapp.payments.ui;

import X.A0B;
import X.A0S;
import X.A27;
import X.A7B;
import X.A7U;
import X.AGD;
import X.AX8;
import X.AXS;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass1GP;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass1QL;
import X.AnonymousClass1QM;
import X.AnonymousClass1QS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.AnonymousClass8C2;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.AnonymousClass9RP;
import X.BBB;
import X.BCB;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108965cb;
import X.C108975cc;
import X.C110885hR;
import X.C137116uw;
import X.C171858sO;
import X.C175758zE;
import X.C175778zG;
import X.C1764494g;
import X.C1764594h;
import X.C177689Ae;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C189689je;
import X.C190239kb;
import X.C196259ui;
import X.C19740yt;
import X.C19967A1c;
import X.C19997A2l;
import X.C20098A7b;
import X.C20112A7u;
import X.C20752AXh;
import X.C20840AaI;
import X.C21447AkE;
import X.C219217x;
import X.C221618v;
import X.C22454B8m;
import X.C29831cw;
import X.C30931ek;
import X.C31061ex;
import X.C33711jG;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.WaImageView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class IndiaUpiDeviceBindStepActivity extends AnonymousClass91T implements BBB, C22454B8m {
    public static final BCB A0j = new AX8();
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public WaImageView A05;
    public C219217x A06;
    public AnonymousClass1KI A07;
    public C20752AXh A08;
    public AnonymousClass8pS A09;
    public AnonymousClass8pS A0A;
    public C196259ui A0B;
    public A0S A0C;
    public A27 A0D;
    public A0B A0E;
    public C1764494g A0F;
    public C1764594h A0G;
    public C189689je A0H;
    public C19997A2l A0I;
    public C30931ek A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public Runnable A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public int A0X;
    public PendingIntent A0Y;
    public A7B A0Z;
    public C175778zG A0a;
    public C177689Ae A0b;
    public AnonymousClass8C2 A0c;
    public Runnable A0d;
    public ArrayList A0e;
    public boolean A0f;
    public boolean A0g;
    public final AnonymousClass1QE A0h;
    public final C171858sO A0i;

    private void A13(String str) {
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        A032.A07("device_binding_failure_reason", str);
        this.A0S.BiM(A032, (Integer) null, "device_binding", "payments_device_binding_precheck", 0);
    }

    private void A03() {
        this.A0h.A06("PAY: continueOnFinishDeviceBind called");
        AnonymousClass1QM A042 = this.A0K.A04("add_bank");
        AnonymousClass1QM A043 = this.A0K.A04("2fa");
        this.A0K.A0A(A042);
        this.A0K.A0A(A043);
        Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiAccountRecoveryFinishActivity.class);
        A4v(A072);
        AnonymousClass8BU.A13(A072, this, "extra_previous_screen", "device_binding");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003d, code lost:
        if (r0.getSimState() != 5) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q() {
        /*
            r5 = this;
            X.94g r0 = r5.A0F
            java.lang.String r1 = "smsSend"
            X.19a r0 = r0.A00
            r0.A07(r1)
            java.lang.String r0 = "1"
            r5.A0Q = r0
            android.view.View r0 = r5.A04
            A0q(r0, r5)
            android.view.View r0 = r5.A02
            A0c(r0, r5)
            android.view.View r0 = r5.A03
            A0c(r0, r5)
            com.whatsapp.WaImageView r1 = r5.A05
            r0 = 2131233643(0x7f080b6b, float:1.808343E38)
            X.AnonymousClass3MX.A1B(r5, r1, r0)
            X.94h r0 = r5.A0G
            java.lang.String r1 = "deviceBindingStarted"
            X.19a r0 = r0.A00
            r0.A08(r1)
            r4 = 0
            X.11C r0 = r5.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            r3 = 1
            if (r0 == 0) goto L_0x003f
            int r2 = r0.getSimState()
            r0 = 5
            r1 = 1
            if (r2 == r0) goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            boolean r0 = X.AnonymousClass11E.A02(r5)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "airplane_mode_on"
            r5.A13(r0)
            r1 = 2131893857(0x7f121e61, float:1.9422502E38)
        L_0x004e:
            X.A1c r0 = new X.A1c
            r0.<init>(r1)
            A0z(r5, r0, r3)
            return
        L_0x0057:
            if (r1 != 0) goto L_0x0062
            java.lang.String r0 = "sim_state_issues"
            r5.A13(r0)
            r1 = 2131893859(0x7f121e63, float:1.9422506E38)
            goto L_0x004e
        L_0x0062:
            X.9Ae r1 = new X.9Ae
            r1.<init>(r5)
            r5.A0b = r1
            X.10I r0 = r5.A05
            X.AnonymousClass3MW.A1T(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0Q():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        A0d(r2.A04, r2);
        A0d(r2.A02, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        A0c(r2.A03, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        A0c(r2.A02, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0V() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0Q
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x000a;
                case 50: goto L_0x0018;
                case 51: goto L_0x002b;
                case 52: goto L_0x002e;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A04
            A0c(r0, r2)
            goto L_0x0025
        L_0x0018:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A04
            A0d(r0, r2)
        L_0x0025:
            android.view.View r0 = r2.A02
            A0c(r0, r2)
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "3"
            goto L_0x0030
        L_0x002e:
            java.lang.String r0 = "4"
        L_0x0030:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A04
            A0d(r0, r2)
            android.view.View r0 = r2.A02
            A0d(r0, r2)
        L_0x0040:
            android.view.View r0 = r2.A03
            A0c(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0V():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0122, code lost:
        if (r2 == 2131892931) goto L_0x0124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0t(X.A7B r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.A0R
            X.AZ6 r1 = r8.A0S
            r1.A0D(r0)
            r0 = 20
            X.8sO r3 = r1.A05(r9, r0)
            X.8pS r0 = r8.A0A
            java.lang.String r0 = r0.A0B
            r3.A0O = r0
            X.94h r0 = r8.A0G
            if (r9 == 0) goto L_0x0139
            X.AnonymousClass91U.A1c(r8, r0)
        L_0x001a:
            int r0 = r8.A00
            java.lang.Long r2 = X.C17880vN.A0n(r0)
            r3.A0K = r2
            r0 = 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0L = r0
            r3.A0M = r2
            java.lang.String r0 = r8.A0S
            r3.A0N = r0
            java.lang.String r0 = "device_binding"
            r3.A0b = r0
            java.lang.String r0 = r8.A0c
            r3.A0Y = r0
            X.A7u r2 = X.C20112A7u.A02()
            java.lang.String r1 = "is_multiple_sms_flow"
            r0 = 1
            r2.A08(r1, r0)
            X.AnonymousClass8BR.A1H(r3, r2)
            X.1QE r4 = r8.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentUserActionEvent devicebind event:"
            X.AnonymousClass8BX.A1D(r4, r3, r0, r1)
            X.AZ6.A02(r3, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "IndiaUpiDeviceBindActivity: onDeviceBinding: "
            r1.append(r0)
            r7 = 1
            r6 = 0
            boolean r0 = X.AnonymousClass000.A1X(r9)
            X.AnonymousClass8BW.A1D(r4, r1, r0)
            X.A7U r1 = r8.A0M
            X.8pS r0 = r8.A0A
            java.util.ArrayList r1 = r1.A08(r0)
            if (r9 == 0) goto L_0x0169
            int r3 = r9.A00
            r0 = 11453(0x2cbd, float:1.6049E-41)
            if (r3 == r0) goto L_0x0169
            r2 = 2
            if (r1 == 0) goto L_0x0091
            int r1 = r1.size()
            int r0 = r8.A00
            if (r1 <= r0) goto L_0x0091
            if (r0 >= r2) goto L_0x0091
            r8.A0V = r7
            X.9Ae r1 = new X.9Ae
            r1.<init>(r8)
            r8.A0b = r1
            X.10I r0 = r8.A05
            X.AnonymousClass3MW.A1T(r1, r0, r6)
        L_0x0090:
            return
        L_0x0091:
            java.lang.String r5 = "upi-bind-device"
            boolean r0 = X.C20752AXh.A01(r8, r5, r3, r7)
            if (r0 != 0) goto L_0x0090
            r8.A0V = r6
            X.A7U r1 = r8.A0M
            java.util.ArrayList r0 = r1.A05
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.size()
            if (r0 <= r7) goto L_0x00ad
            int r0 = r1.A01
            int r0 = r0 + 2
            r1.A01 = r0
        L_0x00ad:
            r1.A02 = r6
            int r3 = r9.A00
            r0 = 446(0x1be, float:6.25E-43)
            if (r3 == r0) goto L_0x015c
            r0 = 476(0x1dc, float:6.67E-43)
            if (r3 == r0) goto L_0x014b
            r0 = 11452(0x2cbc, float:1.6048E-41)
            if (r3 == r0) goto L_0x0129
            r0 = 11477(0x2cd5, float:1.6083E-41)
            if (r3 == r0) goto L_0x0130
            r0 = 11498(0x2cea, float:1.6112E-41)
            if (r3 == r0) goto L_0x015c
            r0 = 11544(0x2d18, float:1.6177E-41)
            if (r3 == r0) goto L_0x0130
            r0 = 4059001(0x3def79, float:5.687872E-39)
            if (r3 == r0) goto L_0x015c
            r0 = 11469(0x2ccd, float:1.6071E-41)
            if (r3 == r0) goto L_0x0129
            r0 = 11470(0x2cce, float:1.6073E-41)
            if (r3 == r0) goto L_0x0130
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish at error: "
            r1.append(r0)
            X.9ui r0 = r8.A0B
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C108945cZ.A1D(r5, r0)
            int r0 = X.C72463Mc.A0B(r0)
            X.AnonymousClass8BV.A1F(r4, r1, r0)
            r8.A01 = r2
        L_0x00f0:
            int r2 = r9.A00
            X.AXh r1 = r8.A08
            X.9ui r0 = r8.A0B
            X.A1c r3 = r1.A02(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish: "
            r1.append(r0)
            X.9ui r0 = r8.A0B
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C108945cZ.A1D(r5, r0)
            int r0 = X.C72463Mc.A0B(r0)
            X.AnonymousClass8BV.A1F(r4, r1, r0)
            int r2 = r3.A00
            r0 = 2131893805(0x7f121e2d, float:1.9422397E38)
            if (r2 == r0) goto L_0x0124
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            if (r2 == r0) goto L_0x0124
            r1 = 2131892931(0x7f121ac3, float:1.9420624E38)
            r0 = 1
            if (r2 != r1) goto L_0x0125
        L_0x0124:
            r0 = 0
        L_0x0125:
            A0z(r8, r3, r0)
            return
        L_0x0129:
            X.AXS r0 = r8.A0N
            X.AXS.A05(r1, r0, r8)
            r0 = 4
            goto L_0x0136
        L_0x0130:
            X.AXS r0 = r8.A0N
            X.AXS.A05(r1, r0, r8)
            r0 = 3
        L_0x0136:
            r8.A01 = r0
            goto L_0x00f0
        L_0x0139:
            java.lang.String r1 = "deviceBindingEnded"
            X.19a r0 = r0.A00
            r0.A08(r1)
            X.94g r0 = r8.A0F
            java.lang.String r1 = "deviceBind"
            X.19a r0 = r0.A00
            r0.A06(r1)
            goto L_0x001a
        L_0x014b:
            X.AXS r0 = r8.A0N
            X.AXS.A05(r1, r0, r8)
            r1 = 2131897647(0x7f122d2f, float:1.943019E38)
            X.A1c r0 = new X.A1c
            r0.<init>(r1)
            A0z(r8, r0, r6)
            return
        L_0x015c:
            X.AXS r0 = r8.A0N
            X.AXS.A05(r1, r0, r8)
            int r1 = r9.A00
            X.8pS r0 = r8.A0A
            r8.A0s(r0, r1)
            return
        L_0x0169:
            r8.A0V = r6
            X.94g r0 = r8.A0F
            java.lang.String r1 = "getAccounts"
            X.19a r0 = r0.A00
            r0.A07(r1)
            java.lang.String r2 = X.AXS.A02(r8)
            X.10I r1 = r8.A05
            X.9At r0 = new X.9At
            r0.<init>(r8, r2)
            X.AnonymousClass3MW.A1T(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0t(X.A7B):void");
    }

    private void A0u(A7B a7b, ArrayList arrayList) {
        String A052;
        long j;
        short s;
        C19967A1c A022;
        int i;
        AnonymousClass1QE r2 = this.A0h;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onBankAccountsList: ");
        A10.append(arrayList);
        AnonymousClass8BX.A1D(r2, a7b, " error: ", A10);
        if (!TextUtils.isEmpty(AXS.A02(this))) {
            A052 = AXS.A02(this);
        } else {
            A052 = this.A0M.A05(this.A0A);
        }
        AZ6 az6 = this.A0S;
        az6.A0D(A052);
        C171858sO A053 = az6.A05(a7b, 18);
        A053.A0b = "device_binding";
        A053.A0Y = this.A0c;
        A053.A0O = this.A0A.A0B;
        boolean z = false;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                z = true;
            }
            A053.A01 = Boolean.valueOf(z);
            j = AnonymousClass8BR.A06(arrayList);
        } else {
            A053.A01 = false;
            j = 0;
        }
        A053.A0H = Long.valueOf(j);
        AZ6.A02(A053, this);
        r2.A04(AnonymousClass001.A1E(A053, "logGetAccounts: ", AnonymousClass000.A10()));
        C1764494g r0 = this.A0F;
        if (a7b != null) {
            s = 3;
        } else {
            r0.A00.A06("getAccounts");
            r0 = this.A0F;
            s = 2;
        }
        r0.A00.A0C(s);
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                A0V();
                this.A01 = 1;
                if (!A4z(this.A0A, new A7B(11473), getString(2131890762))) {
                    A022 = new C19967A1c(2131890762);
                } else {
                    return;
                }
            } else if (a7b != null && !C20752AXh.A01(this, "upi-get-accounts", a7b.A00, true)) {
                String A012 = this.A0D.A01(a7b.A00);
                int i2 = a7b.A00;
                if (i2 == 11467 || i2 == 11543) {
                    A0V();
                    AXS.A05(this.A0M, this.A0N, this);
                    this.A01 = 3;
                    A0z(this, new C19967A1c(2131893805), true);
                    this.A0M.A09();
                    return;
                } else if (A012 != null) {
                    A0V();
                    if (!A4z(this.A0A, a7b, A012)) {
                        A0z(this, new C19967A1c(a7b.A00, A012), true);
                        return;
                    }
                    return;
                } else {
                    if (i2 == 11473) {
                        A0V();
                        i = 2131893803;
                    } else if (i2 == 11485) {
                        A0V();
                        this.A01 = 5;
                        i = 2131893785;
                    } else if (i2 == 11487) {
                        A0V();
                        this.A01 = 6;
                        i = 2131893784;
                    } else {
                        A022 = this.A08.A02(this.A0B, i2);
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("onBankAccountsList failure. showErrorAndFinish: ");
                        AnonymousClass8BV.A1F(r2, A102, C72463Mc.A0B(C108945cZ.A1D("upi-get-accounts", this.A0B.A06)));
                        int i3 = A022.A00;
                        if (i3 == 2131893805 || i3 == 2131893867 || i3 == 2131892931) {
                            A0z(this, A022, false);
                            return;
                        }
                        this.A01 = 1;
                    }
                    A022 = new C19967A1c(i);
                }
            } else {
                return;
            }
            A0z(this, A022, true);
        } else if (arrayList.size() != 1 || ((AnonymousClass8pS) arrayList.get(0)).A0I) {
            A14(arrayList);
        } else if (!this.A0U) {
            this.A0U = true;
            this.A09 = (AnonymousClass8pS) arrayList.get(0);
            A0w(this);
        }
    }

    public static void A0v(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        String str = indiaUpiDeviceBindStepActivity.A0Q;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    indiaUpiDeviceBindStepActivity.A0Q = "2";
                    A0d(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
                    A0q(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
                    A0c(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
                    AnonymousClass3MX.A1B(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, 2131233641);
                    return;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    indiaUpiDeviceBindStepActivity.A0t(indiaUpiDeviceBindStepActivity.A0Z);
                    return;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    indiaUpiDeviceBindStepActivity.A0u(indiaUpiDeviceBindStepActivity.A0Z, indiaUpiDeviceBindStepActivity.A0e);
                    return;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    indiaUpiDeviceBindStepActivity.A03();
                    return;
                }
                break;
        }
        indiaUpiDeviceBindStepActivity.A0Q = "1";
        A0q(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
        A0c(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
        A0c(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
        AnonymousClass3MX.A1B(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, 2131233643);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0w(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r7) {
        /*
            X.A6g r1 = r7.A0O
            java.util.List r0 = r7.A0j
            boolean r3 = r1.A0B(r0)
            X.A6g r0 = r7.A0O
            java.lang.String r2 = r7.A0b
            boolean r1 = X.AnonymousClass8BR.A1P(r7)
            if (r2 == 0) goto L_0x001a
            java.util.Set r0 = r0.A04
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x003e
        L_0x001a:
            if (r1 == 0) goto L_0x001e
            if (r3 != 0) goto L_0x003e
        L_0x001e:
            r4 = 1
        L_0x001f:
            java.lang.String r0 = r7.A0b
            boolean r1 = X.AnonymousClass8BR.A1P(r7)
            boolean r0 = X.C20063A5m.A03(r0)
            if (r0 == 0) goto L_0x002e
            r6 = 1
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            X.8zG r1 = r7.A0a
            X.8pS r2 = r7.A09
            r0 = 2
            X.AZb r3 = new X.AZb
            r3.<init>(r7, r0)
            r5 = r4
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x003e:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0w(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity):void");
    }

    public static void A0x(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        if (indiaUpiDeviceBindStepActivity.A06.A02("android.permission.RECEIVE_SMS") != 0 && indiaUpiDeviceBindStepActivity.A06.A02("android.permission.SEND_SMS") == 0) {
            C110885hR.A0B(indiaUpiDeviceBindStepActivity, C108975cc.A1b("android.permission.RECEIVE_SMS"), 100);
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ca A[Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }, LOOP:1: B:61:0x01c4->B:63:0x01ca, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0y(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r18) {
        /*
            java.lang.String r7 = "device-binding-sms"
            X.C17960vV.A00()
            r4 = r18
            int r0 = r4.A00
            r3 = 1
            int r0 = r0 + 1
            r4.A00 = r0
            X.A7U r1 = r4.A0M
            X.8pS r6 = r4.A0A
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.AXS r2 = r1.A08
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x008a
            java.lang.String r1 = r2.A0G()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x002f
            r2.CRC(r6)
            if (r6 == 0) goto L_0x0085
            java.lang.String r1 = r6.A09
        L_0x002f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0038
            r5.add(r1)
        L_0x0038:
            int r1 = r5.size()
            int r0 = r4.A00
            r6 = 0
            if (r1 < r0) goto L_0x004a
            int r0 = r0 - r3
            java.lang.String r0 = X.C108945cZ.A1H(r5, r0)
            r4.A0R = r0
        L_0x0048:
            r5 = -1
            goto L_0x00c5
        L_0x004a:
            X.1QE r2 = r4.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "IndiaUpiDeviceBindActivity : not enough psp available, pspSize: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", multipleSmsNumber : "
            r1.append(r0)
            int r0 = r4.A00
            X.AnonymousClass8BV.A1F(r2, r1, r0)
            X.190 r8 = r4.A03
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            int r0 = r4.A00
            X.C17880vN.A1T(r1, r0, r6)
            int r0 = r5.size()
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r0 = "currentSmsCount = %d, psp size = %d"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.String r0 = "india-upi-payment-setup-sms-gateways-out-of-bound"
            r8.A0G(r0, r1, r6)
            r4.finish()
            goto L_0x0048
        L_0x0085:
            java.lang.String r1 = r2.A0G()
            goto L_0x002f
        L_0x008a:
            java.util.ArrayList r2 = r1.A08(r6)
            if (r2 == 0) goto L_0x00bb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00bb
            int r1 = r1.A01
            int r0 = r2.size()
            int r0 = r1 % r0
            java.lang.Object r0 = r2.get(r0)
            r5.add(r0)
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x00be
            int r1 = r1 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            java.lang.Object r0 = r2.get(r1)
            r5.add(r0)
            goto L_0x0038
        L_0x00bb:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup psps list is null or empty"
            goto L_0x00c0
        L_0x00be:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup psps list has only one psp"
        L_0x00c0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0038
        L_0x00c5:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r0 = 22
            r15 = 0
            if (r1 < r0) goto L_0x011e
            int r2 = r4.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r2 < 0) goto L_0x011e
            X.1QE r9 = r4.A0h     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = "sending sms from sim subscription id: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r9.A06(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.A2l r1 = r4.A0I     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            int r0 = r4.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            android.telephony.SmsManager r0 = r1.A02(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r8.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
        L_0x00ee:
            X.8C2 r0 = r4.A0c     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 != 0) goto L_0x0131
            java.lang.String r10 = "SMS_SENT"
            android.content.Intent r1 = X.C108945cZ.A0G(r10)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = "com.whatsapp"
            android.content.Intent r0 = r1.setPackage(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            android.app.PendingIntent r0 = X.C1408573i.A01(r4, r6, r0, r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r4.A0Y = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.8C2 r0 = new X.8C2     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r0.<init>(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r4.A0c = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.00H r0 = r4.A0O     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.Object r2 = r0.get()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.1cw r2 = (X.C29831cw) r2     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.8C2 r1 = r4.A0c     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r0.<init>(r10)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r2.A01(r4, r1, r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            goto L_0x0131
        L_0x011e:
            X.1QE r9 = r4.A0h     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = "sending sms from default sim"
            r9.A06(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            android.telephony.SmsManager r0 = android.telephony.SmsManager.getDefault()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r8.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            goto L_0x00ee
        L_0x0131:
            r2 = 0
        L_0x0132:
            int r0 = r8.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r2 >= r0) goto L_0x0245
            java.lang.String r13 = ""
            java.lang.String r10 = r4.A4m(r13)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.A7U r12 = r4.A0M     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r14 = r4.A0R     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.8pH r0 = X.A7U.A02(r12, r14)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 == 0) goto L_0x0220
            android.os.Bundle r1 = r0.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r1 == 0) goto L_0x0220
            java.lang.String r0 = "smsGateways"
            java.util.ArrayList r11 = r1.getStringArrayList(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r11 == 0) goto L_0x0220
            int r0 = r11.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 <= 0) goto L_0x0220
            boolean r0 = r11.isEmpty()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 != 0) goto L_0x0220
            X.C17960vV.A0A(r13, r11)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            int r1 = r11.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r12.A00 = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            int r0 = r12.A02     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            int r0 = r0 % r1
            r12.A02 = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = X.C108945cZ.A1H(r11, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
        L_0x0172:
            r4.A0S = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.A7U r1 = r4.A0M     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = r4.A0R     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = r1.A06(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = r4.A4n(r0, r10)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r4.A0T = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.A7U r1 = r4.A0M     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = r4.A0R     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.8pH r10 = X.A7U.A02(r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r10 == 0) goto L_0x021d
            android.os.Bundle r1 = r10.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r1 == 0) goto L_0x021a
            java.lang.String r0 = "smsPrefix"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
        L_0x0196:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 != 0) goto L_0x021d
            android.os.Bundle r1 = r10.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r1 == 0) goto L_0x0218
            java.lang.String r0 = "smsPrefix"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
        L_0x01a6:
            java.lang.Object r13 = r8.get(r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            android.telephony.SmsManager r13 = (android.telephony.SmsManager) r13     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = r4.A0T     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.util.ArrayList r16 = r13.divideMessage(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r10 = 0
        L_0x01c4:
            int r0 = r16.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r10 >= r0) goto L_0x01d2
            android.app.PendingIntent r0 = r4.A0Y     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r1.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            int r10 = r10 + 1
            goto L_0x01c4
        L_0x01d2:
            X.AZ6 r12 = r4.A0S     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            java.lang.String r10 = "db_sms_sent"
            java.lang.String r0 = "device_binding"
            X.8sO r10 = r12.A07(r11, r15, r10, r0)     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            java.lang.String r0 = r4.A0S     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            r10.A0N = r0     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            int r0 = r4.A00     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            r10.A0M = r0     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            X.AZ6.A02(r10, r4)     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            java.lang.String r14 = r4.A0S     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            r17 = r1
            r18 = r15
            r13.sendMultipartTextMessage(r14, r15, r16, r17, r18)     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            r4.A0V = r3     // Catch:{ NullPointerException -> 0x0201, UnsupportedOperationException -> 0x01ff, SecurityException -> 0x01fd, IllegalArgumentException -> 0x01fb }
            goto L_0x0214
        L_0x01fb:
            r1 = move-exception
            goto L_0x0202
        L_0x01fd:
            r1 = move-exception
            goto L_0x0202
        L_0x01ff:
            r1 = move-exception
            goto L_0x0202
        L_0x0201:
            r1 = move-exception
        L_0x0202:
            java.lang.String r0 = "IndiaUpiPaymentSetup sendDeviceBindingSms failed. Manual SMS no longer available. More details: "
            r9.A0A(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = "sms_not_supported"
            A12(r4, r0, r5, r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.94h r0 = r4.A0G     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.AnonymousClass91U.A1c(r4, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r4.finish()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
        L_0x0214:
            int r2 = r2 + 1
            goto L_0x0132
        L_0x0218:
            r0 = 0
            goto L_0x01a6
        L_0x021a:
            r0 = 0
            goto L_0x0196
        L_0x021d:
            java.lang.String r0 = "TRL WHA"
            goto L_0x01a6
        L_0x0220:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup smsGateways list is null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            X.190 r11 = r12.A07     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r14 != 0) goto L_0x022e
            r14 = r13
        L_0x022e:
            r1[r6] = r14     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.util.ArrayList r0 = r12.A05     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 == 0) goto L_0x0235
            r13 = r0
        L_0x0235:
            r1[r3] = r13     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = "psp name: %s psp-config: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            java.lang.String r0 = "india-upi-payment-setup-sms-gateways-list-empty"
            r11.A0G(r0, r1, r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            r0 = 0
            goto L_0x0172
        L_0x0245:
            X.9ui r0 = r4.A0B     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            if (r0 == 0) goto L_0x026c
            r0.A02(r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x024d }
            return
        L_0x024d:
            r2 = move-exception
            X.1QE r1 = r4.A0h
            java.lang.String r0 = "IndiaUpiDeviceBindActivity showSmsErrorAndFinish after sendDeviceBindingSms threw: "
            r1.A0A(r0, r2)
            X.9ui r0 = r4.A0B
            if (r0 == 0) goto L_0x025c
            r0.A04(r7, r5)
        L_0x025c:
            java.lang.String r0 = "illegal_state_exception"
            A12(r4, r0, r5, r6)
            r1 = 2131893856(0x7f121e60, float:1.94225E38)
            X.A1c r0 = new X.A1c
            r0.<init>(r1)
            A0z(r4, r0, r3)
        L_0x026c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0y(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity):void");
    }

    @Deprecated
    public static void A0z(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, C19967A1c a1c, boolean z) {
        int i = a1c.A00;
        AnonymousClass1QE r3 = indiaUpiDeviceBindStepActivity.A0h;
        r3.A06(AnonymousClass001.A1I("IndiaUpiDeviceBindActivity showErrorAndFinish: ", AnonymousClass000.A10(), i));
        indiaUpiDeviceBindStepActivity.A0V();
        if (i == 0) {
            i = 2131894057;
            String str = indiaUpiDeviceBindStepActivity.A0B.A04;
            if ("upi-bind-device".equalsIgnoreCase(str)) {
                i = 2131889382;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                indiaUpiDeviceBindStepActivity.A01 = 1;
                i = 2131890762;
            }
        }
        if (z) {
            C196259ui r0 = indiaUpiDeviceBindStepActivity.A0B;
            if (r0 != null) {
                r0.A07.add("done");
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("clearStates: ");
                AnonymousClass8BV.A1D(r3, indiaUpiDeviceBindStepActivity.A0B, A10);
            }
            indiaUpiDeviceBindStepActivity.A0M.A04 = new C196259ui();
            Intent A1H = AnonymousClass91U.A1H(indiaUpiDeviceBindStepActivity, a1c);
            A1H.putExtra("error", i);
            A1H.putExtra("error_type", indiaUpiDeviceBindStepActivity.A01);
            int i2 = indiaUpiDeviceBindStepActivity.A01;
            if (i2 >= 1 && i2 <= 6) {
                A1H.putExtra("extra_bank_account", indiaUpiDeviceBindStepActivity.A0A);
            }
            if (!indiaUpiDeviceBindStepActivity.A0l) {
                A1H.putExtra("try_again", 1);
            }
            A1H.addFlags(335544320);
            indiaUpiDeviceBindStepActivity.A4v(A1H);
            A1H.putExtra("extra_previous_screen", "device_binding");
            indiaUpiDeviceBindStepActivity.A3q(A1H, true);
        } else {
            AnonymousClass1GP supportFragmentManager = indiaUpiDeviceBindStepActivity.getSupportFragmentManager();
            String A002 = a1c.A00(indiaUpiDeviceBindStepActivity);
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment.A1R(AnonymousClass8BX.A0E(A002));
            C20098A7b.A01(legacyMessageDialogFragment, supportFragmentManager);
        }
        AnonymousClass91U.A1c(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A0G);
    }

    public static void A10(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, Integer num, Integer num2) {
        C171858sO r1 = indiaUpiDeviceBindStepActivity.A0i;
        r1.A07 = num2;
        r1.A08 = num;
        r1.A0b = "device_binding";
        r1.A0Y = indiaUpiDeviceBindStepActivity.A0c;
        r1.A0a = indiaUpiDeviceBindStepActivity.A0f;
        AZ6.A02(r1, indiaUpiDeviceBindStepActivity);
    }

    public static void A11(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str) {
        if (indiaUpiDeviceBindStepActivity.A0g) {
            indiaUpiDeviceBindStepActivity.A0h.A06("PAY: getAccountsOrFinishAfterDeviceBinding called");
            indiaUpiDeviceBindStepActivity.A0Q = "4";
            A0d(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
            A0d(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
            A0q(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
            AnonymousClass3MX.A1B(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, 2131233650);
            indiaUpiDeviceBindStepActivity.A03();
            return;
        }
        indiaUpiDeviceBindStepActivity.A0Q = "3";
        A0d(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
        A0d(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
        A0q(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
        AnonymousClass3MX.A1B(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, 2131233650);
        AnonymousClass1QE r2 = indiaUpiDeviceBindStepActivity.A0h;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getAccountsAfterDeviceBinding: bank picked and calling sendGetBankAccounts for: ");
        A10.append(indiaUpiDeviceBindStepActivity.A0A.A01);
        A10.append(" accountProvider:");
        A10.append(indiaUpiDeviceBindStepActivity.A0A.A09);
        A10.append(" psp: ");
        AnonymousClass8BV.A1E(r2, str, A10);
        indiaUpiDeviceBindStepActivity.A0C.A00(indiaUpiDeviceBindStepActivity.A0A, indiaUpiDeviceBindStepActivity.A0E.A01(), indiaUpiDeviceBindStepActivity.A0O.A07(indiaUpiDeviceBindStepActivity.A0b));
        indiaUpiDeviceBindStepActivity.A0S.COK();
    }

    private void A14(ArrayList arrayList) {
        this.A0h.A06("IndiaUpiDeviceBindActivity showBankAccounts called");
        Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiBankAccountPickerActivity.class);
        A072.putParcelableArrayListExtra("extra_accounts_list", arrayList);
        A072.putExtra("extra_selected_account_bank_logo", this.A0A.A03);
        A4v(A072);
        AnonymousClass8BU.A13(A072, this, "extra_previous_screen", "device_binding");
    }

    public void A2y() {
        if (!this.A0f) {
            this.A0f = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            AnonymousClass91U.A1V(r3, r2, this);
            AnonymousClass91U.A1Q(A002, r3, r2, this, r3.A7z);
            AnonymousClass91U.A1P(A002, r3, r2, AnonymousClass8BU.A0E(r3), this);
            AnonymousClass91U.A1Y(r3, this);
            AnonymousClass91U.A1W(r3, r2, this);
            this.A0J = AnonymousClass8BT.A0V(r3);
            this.A0E = r3.AGY();
            this.A08 = AnonymousClass8BU.A0M(r2);
            this.A06 = AnonymousClass3Ma.A0b(r3);
            this.A0O = C000200d.A00(r3.A9c);
            this.A0K = C000200d.A00(r2.A7t);
            this.A07 = AnonymousClass8BT.A0I(r3);
            this.A0D = AnonymousClass8BU.A0S(r3);
            this.A0N = C000200d.A00(r3.Acr);
            this.A0I = r3.AHJ();
            this.A0G = (C1764594h) r2.ACM.get();
            this.A0F = (C1764494g) r2.ACJ.get();
            this.A0M = C000200d.A00(A002.A5G);
        }
    }

    public void BmP(A7B a7b, ArrayList arrayList) {
        this.A0e = arrayList;
        this.A0Z = a7b;
        if (!this.A0n) {
            A0u(a7b, arrayList);
        }
    }

    public void BrM(A7B a7b) {
        if (this.A0n) {
            this.A0Z = a7b;
        } else {
            A0t(a7b);
        }
    }

    public void C2m(AnonymousClass8pN r4, A7B a7b) {
        if (r4 != null) {
            this.A0A = r4;
            A4x("device_binding");
            this.A0G.A00.A0C(2);
            return;
        }
        if (a7b != null) {
            int i = a7b.A00;
            if (i == 10756) {
                Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiDobPickerActivity.class);
                A072.putExtra("bank_account", this.A09.A02);
                CNh(A072, 1023);
                return;
            } else if (i == 1383026) {
                A0s(this.A0A, i);
                return;
            }
        }
        A14(this.A0e);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 154) {
            if (i != 1023) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                ((C190239kb) this.A0M.get()).A00(intent, this, new C20840AaI(this, 1));
            } else {
                finish();
            }
        } else if (i2 == -1) {
            A0x(this);
            A0Q();
        } else {
            BhQ(2131894071);
        }
    }

    public void onBackPressed() {
        AnonymousClass8BV.A1E(this.A0h, " onBackPressed", C17890vO.A0f(this));
        Integer A0h2 = C17880vN.A0h();
        A10(this, A0h2, A0h2);
        A4q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0g = this.A0N.A0R();
        this.A0F.A00(getIntent());
        this.A0F.A00.A07("onCreate");
        setContentView(2131625618);
        C003401n A1J = AnonymousClass91U.A1J(this);
        if (A1J != null) {
            AnonymousClass8BV.A17(A1J, getString(2131893844));
        }
        this.A04 = findViewById(2131428113);
        this.A02 = findViewById(2131428114);
        this.A03 = findViewById(2131428115);
        A0r(this.A04, getString(2131893848), getString(2131893847));
        A0r(this.A02, getString(2131893849), getString(2131893852));
        int i = 2131893846;
        if (this.A0g) {
            i = 2131893845;
        }
        A0r(this.A03, getString(2131893850), getString(i));
        this.A05 = (WaImageView) findViewById(2131431483);
        this.A0B = this.A0M.A04;
        this.A0A = (AnonymousClass8pS) getIntent().getParcelableExtra("extra_selected_bank");
        this.A0H = new C189689je(this.A0K);
        AnonymousClass1KB r31 = this.A05;
        AnonymousClass118 r15 = this.A05;
        AnonymousClass10I r14 = this.A05;
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(this);
        C30931ek r13 = this.A0J;
        AnonymousClass1QS r12 = this.A0Q;
        A0B a0b = this.A0E;
        A7U a7u = this.A0M;
        AnonymousClass1KI r9 = this.A07;
        C33711jG A0S2 = AnonymousClass8BT.A0S(this);
        AXS axs = this.A0N;
        C19997A2l a2l = this.A0I;
        AnonymousClass8pS r6 = this.A0A;
        AZ6 az6 = this.A0S;
        A7U a7u2 = a7u;
        AXS axs2 = axs;
        AnonymousClass1QS r22 = r12;
        AnonymousClass8pS r18 = r6;
        AnonymousClass118 r142 = r15;
        AnonymousClass1KI r152 = r9;
        AnonymousClass1KB r132 = r31;
        this.A0C = new A0S(r132, r142, r152, this.A0E, A0M2, r18, a7u2, axs2, A0S2, r22, this, az6, a0b, this.A0V, a2l, r13, r14, this.A0L);
        C18030ve r11 = this.A0E;
        AnonymousClass1KB r143 = this.A05;
        AnonymousClass1OZ A0M3 = AnonymousClass8BT.A0M(this);
        C30931ek r10 = this.A0J;
        AnonymousClass1QS r92 = this.A0Q;
        AnonymousClass1QL r8 = this.A0K;
        AnonymousClass1KI r7 = this.A07;
        A7U a7u3 = this.A0M;
        C31061ex r2 = this.A0N;
        C33711jG A0S3 = AnonymousClass8BT.A0S(this);
        AXS axs3 = this.A0N;
        this.A0a = new C175778zG(this, r143, r7, r11, A0M3, a7u3, axs3, r8, A0S3, r2, r92, this, this.A0S, this.A0V, r10);
        AnonymousClass1QE r23 = this.A0h;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiDeviceBindActivity onCreate: device binding status: ");
        AnonymousClass8BV.A1E(r23, axs3.toString(), A10);
        String A022 = AXS.A02(this);
        if (this.A0N.A0T(this.A0A, this.A0S, A022)) {
            try {
                JSONObject A15 = C17880vN.A15();
                A15.put("step", "DeviceBindingStep");
                AnonymousClass8BS.A1C(this.A0K.A05(), "completedSteps", A15);
                A15.put("isCompleteWith2FA", this.A0K.A0E());
                A15.put("isCompleteWithout2FA", this.A0K.A0F());
                A15.put("pspForDeviceBinding", A022);
                A15.put("isDeviceBindingDone", this.A0N.A0T(this.A0A, this.A0S, A022));
                C175758zE r93 = new C175758zE(this.A05, this.A0E, AnonymousClass8BT.A0M(this), this.A0M, this.A0N);
                r93.A00 = A15;
                r93.A00("SKIPPED_DEVICE_BINDING", (List) null);
            } catch (Exception unused) {
            }
            A11(this, A022);
        } else {
            A10(this, AnonymousClass3MY.A0f(), (Integer) null);
            this.A0B.A00("upi-educate-sms");
            this.A0X = this.A0N.A0B();
            A0Q();
        }
        onConfigurationChanged(C108965cb.A03(this));
        this.A0F.A00.A06("onCreate");
    }

    public IndiaUpiDeviceBindStepActivity(int i) {
        this.A0f = false;
        AGD.A00(this, 2);
    }

    public static void A0c(View view, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        View findViewById = view.findViewById(2131428118);
        if (findViewById != null) {
            Drawable drawable = indiaUpiDeviceBindStepActivity.getResources().getDrawable(2131233038);
            drawable.setColorFilter(C19740yt.A00(indiaUpiDeviceBindStepActivity, 2131102615), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(2131428119);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        TextView A0E2 = C17880vN.A0E(view, 2131428117);
        if (A0E2 != null) {
            AnonymousClass3MX.A1C(indiaUpiDeviceBindStepActivity, A0E2, 2131102618);
        }
    }

    public static void A0d(View view, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        View findViewById = view.findViewById(2131428118);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        C72463Mc.A16(view, 2131428119, 4);
        View findViewById2 = view.findViewById(2131428116);
        if (findViewById2 != null) {
            Drawable drawable = indiaUpiDeviceBindStepActivity.getResources().getDrawable(2131233038);
            drawable.setColorFilter(C19740yt.A00(indiaUpiDeviceBindStepActivity, 2131102613), PorterDuff.Mode.SRC_OVER);
            findViewById2.setBackground(drawable);
            findViewById2.setVisibility(0);
        }
        TextView A0E2 = C17880vN.A0E(view, 2131428117);
        if (A0E2 != null) {
            AnonymousClass3MX.A1C(indiaUpiDeviceBindStepActivity, A0E2, 2131102618);
        }
    }

    public static void A0q(View view, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        View findViewById = view.findViewById(2131428118);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            Drawable drawable = indiaUpiDeviceBindStepActivity.getResources().getDrawable(2131233038);
            drawable.setColorFilter(C19740yt.A00(indiaUpiDeviceBindStepActivity, 2131102617), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        C72463Mc.A16(view, 2131428119, 0);
        View findViewById2 = view.findViewById(2131428116);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        TextView A0E2 = C17880vN.A0E(view, 2131428117);
        if (A0E2 != null) {
            C72463Mc.A0y(indiaUpiDeviceBindStepActivity, A0E2, 2130970831, 2131102246);
        }
    }

    private void A0r(View view, String str, String str2) {
        TextView A0E2 = C17880vN.A0E(view, 2131428118);
        if (A0E2 != null) {
            A0E2.setText(str);
        }
        TextView A0E3 = C17880vN.A0E(view, 2131428117);
        if (A0E3 != null) {
            A0E3.setText(str2);
        }
        A0c(view, this);
    }

    private void A0s(AnonymousClass8pS r4, int i) {
        A0V();
        Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiOnboardingErrorEducationActivity.class);
        A4v(A072);
        A072.putExtra("error_code", i);
        A072.putExtra("extra_selected_bank", r4);
        A072.putExtra("extra_previous_screen", "device_binding");
        A072.addFlags(335544320);
        A3q(A072, true);
        AnonymousClass91U.A1c(this, this.A0G);
    }

    public static void A12(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str, int i, boolean z) {
        String A052;
        if (!TextUtils.isEmpty(AXS.A02(indiaUpiDeviceBindStepActivity))) {
            A052 = AXS.A02(indiaUpiDeviceBindStepActivity);
        } else {
            A052 = indiaUpiDeviceBindStepActivity.A0M.A05(indiaUpiDeviceBindStepActivity.A0A);
        }
        AZ6 az6 = indiaUpiDeviceBindStepActivity.A0S;
        az6.A0D(A052);
        C171858sO BHN = az6.BHN();
        BHN.A0O = indiaUpiDeviceBindStepActivity.A0A.A0B;
        BHN.A0b = "db_sms_sent";
        BHN.A0Y = indiaUpiDeviceBindStepActivity.A0c;
        int i2 = 28;
        if (z) {
            i2 = 27;
        }
        BHN.A07 = Integer.valueOf(i2);
        if (!z) {
            C20112A7u A012 = C20112A7u.A01();
            Object[] A1b = AnonymousClass3MX.A1b(str, 0);
            C17880vN.A1T(A1b, i, 1);
            A012.A07("device_binding_failure_reason", String.format("%s:%s", A1b));
            AnonymousClass8BR.A1H(BHN, A012);
        }
        AnonymousClass8BX.A1D(indiaUpiDeviceBindStepActivity.A0h, BHN, "PaymentUserActionEvent smsSent event: ", AnonymousClass000.A10());
        AZ6.A02(BHN, indiaUpiDeviceBindStepActivity);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0a.A01 = null;
        A0S a0s = this.A0C;
        a0s.A01 = null;
        a0s.A02.removeCallbacksAndMessages((Object) null);
        a0s.A00.quit();
        if (this.A0c != null) {
            ((C29831cw) this.A0O.get()).A02(this.A0c, this);
            this.A0c = null;
        }
        PendingIntent pendingIntent = this.A0Y;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.A0Y = null;
        }
        C177689Ae r1 = this.A0b;
        if (r1 != null) {
            r1.A0B(false);
        }
        Runnable runnable = this.A0d;
        if (runnable != null) {
            this.A05.CEz(runnable);
        }
        Runnable runnable2 = this.A0P;
        if (runnable2 != null) {
            this.A05.CEz(runnable2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass8BV.A1E(this.A0h, " action bar home", C17890vO.A0f(this));
        A10(this, 1, 1);
        A4q();
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.A0W) {
            A0z(this, new C19967A1c(2131893858), true);
        } else {
            Runnable runnable = this.A0d;
            if (runnable != null) {
                this.A05.CEz(runnable);
                this.A0d = null;
                A0v(this);
            }
        }
        Runnable runnable2 = this.A0P;
        if (runnable2 != null) {
            this.A05.CEz(runnable2);
            this.A0P = null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0V && this.A0d == null) {
            this.A0d = this.A05.CGv(C21447AkE.A00(this, 27), C17890vO.A03(C18020vd.A00(C18040vf.A02, this.A0E, 924)));
        }
    }

    public IndiaUpiDeviceBindStepActivity() {
        this(0);
        this.A0X = -1;
        this.A00 = 0;
        this.A0i = new C171858sO();
        this.A0U = false;
        this.A0L = C221618v.A00(AnonymousClass9RP.class);
        this.A0h = AnonymousClass1QE.A00("IndiaUpiDeviceBindActivity", "onboarding", "IN");
    }
}
