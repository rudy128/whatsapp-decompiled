package com.whatsapp.payments.ui;

import X.A8C;
import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C22372B5b;
import X.C63662tU;
import X.C63932tv;

public class IndiaUpiPaymentLauncherActivity extends AnonymousClass91T implements C22372B5b {
    public A8C A00;
    public boolean A01;
    public final AnonymousClass1QE A02;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (A8C) r1.A2k.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (X.AnonymousClass3MY.A09(r6).getBoolean("intent_source") == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            super.onCreate(r0)
            X.1QO r1 = r6.A0P
            r0 = 0
            boolean r0 = r1.A04(r0)
            r7 = 0
            if (r0 != 0) goto L_0x001c
            X.1QE r1 = r6.A02
            java.lang.String r0 = "payment feature is not enabled."
            r1.A0A(r0, r7)
        L_0x0018:
            r6.finish()
            return
        L_0x001c:
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x0018
            android.net.Uri r0 = X.AnonymousClass8BT.A06(r6)
            if (r0 == 0) goto L_0x0018
            android.net.Uri r3 = X.AnonymousClass8BT.A06(r6)
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r6)
            if (r0 == 0) goto L_0x003f
            android.os.Bundle r1 = X.AnonymousClass3MY.A09(r6)
            java.lang.String r0 = "intent_source"
            boolean r0 = r1.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            X.1QE r4 = r6.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "received payment intent: isFromQrCode "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r2)
            r4.A06(r0)
            if (r2 == 0) goto L_0x0099
            java.lang.String r10 = "SCANNED_QR_CODE"
            java.lang.String r11 = "payments_camera"
        L_0x0055:
            X.AXS r15 = r6.A0N
            X.18O r13 = r6.A06
            X.AZ6 r1 = r6.A0S
            X.0ve r14 = r6.A0E
            X.A8C r0 = r6.A00
            X.AXl r5 = new X.AXl
            r12 = r5
            r17 = r0
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            X.A8b r4 = X.C20118A8b.A00(r3, r10)
            if (r4 == 0) goto L_0x009e
            java.lang.String r1 = r3.toString()
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "upi://mandate"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x009e
            X.0ve r1 = r6.A0E
            java.lang.String r0 = X.AXS.A02(r6)
            boolean r0 = X.A8C.A03(r1, r4, r0)
            if (r0 == 0) goto L_0x009e
            X.A8C r5 = r6.A00
            r1 = 1
            X.Aam r0 = new X.Aam
            r0.<init>(r6, r1)
            r7 = r4
            r8 = r0
            r9 = r11
            r10 = r2
            r5.A0A(r6, r7, r8, r9, r10)
            return
        L_0x0099:
            java.lang.String r10 = "DEEP_LINK"
            java.lang.String r11 = "deeplink"
            goto L_0x0055
        L_0x009e:
            if (r2 == 0) goto L_0x00ba
            X.0ve r2 = r6.A0E
            r1 = 1354(0x54a, float:1.897E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r9 = r3.toString()
            r0 = 0
            X.AX7 r8 = new X.AX7
            r8.<init>(r6, r0)
            r5.A01(r6, r7, r8, r9, r10, r11)
            return
        L_0x00ba:
            java.lang.String r0 = r3.toString()
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment.A00(r7, r0, r10, r11)
            r6.CMk(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiPaymentLauncherActivity(int i) {
        this.A01 = false;
        AGD.A00(this, 13);
    }

    public IndiaUpiPaymentLauncherActivity() {
        this(0);
        this.A02 = AnonymousClass1QE.A00("IndiaUpiPaymentLauncherActivity", "payment-settings", "IN");
    }
}
