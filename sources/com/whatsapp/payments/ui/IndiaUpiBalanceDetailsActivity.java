package com.whatsapp.payments.ui;

import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C63662tU;
import X.C63932tv;

public class IndiaUpiBalanceDetailsActivity extends AnonymousClass91T {
    public boolean A00;
    public final AnonymousClass1QE A01;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
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
        }
    }

    public IndiaUpiBalanceDetailsActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 40);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0097, code lost:
        if ("OD_SECURED".equals(r1) == false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.AnonymousClass8BX.A0u(r7)
            r0 = 2131625601(0x7f0e0681, float:1.8878415E38)
            android.content.Intent r0 = X.AnonymousClass8BS.A05(r7, r0)
            if (r0 == 0) goto L_0x00d9
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r7)
            if (r0 == 0) goto L_0x00d9
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r7)
            java.lang.String r2 = "payment_bank_account"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x00d9
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r7)
            java.lang.String r6 = "balance"
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x00d9
            X.01n r1 = r7.getSupportActionBar()
            if (r1 == 0) goto L_0x0039
            r0 = 2131886306(0x7f1200e2, float:1.9407187E38)
            X.AnonymousClass8BU.A17(r1, r0)
        L_0x0039:
            X.1QE r1 = r7.A01
            java.lang.String r0 = "onCreate"
            r1.A06(r0)
            android.view.View r1 = r7.A00
            r0 = 2131428042(0x7f0b02ca, float:1.8477717E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r1, r0)
            android.view.View r1 = r7.A00
            r0 = 2131427430(0x7f0b0066, float:1.8476476E38)
            android.widget.TextView r4 = X.AnonymousClass3MW.A0J(r1, r0)
            android.view.View r1 = r7.A00
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.widget.TextView r3 = X.AnonymousClass3MW.A0J(r1, r0)
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r7)
            java.lang.Object r2 = r0.get(r2)
            X.AEs r2 = (X.C20284AEs) r2
            X.A6g r0 = r7.A0O
            java.lang.String r0 = r0.A05(r2)
            r4.setText(r0)
            X.8pb r1 = r2.A08
            X.8pS r1 = (X.AnonymousClass8pS) r1
            if (r1 != 0) goto L_0x00d4
            r0 = 2131888265(0x7f120889, float:1.941116E38)
        L_0x0077:
            r3.setText(r0)
            java.lang.String r0 = X.C108955ca.A0r(r7, r6)
            r5.setText(r0)
            boolean r2 = X.C20063A5m.A01(r2)
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "OD_UNSECURED"
            java.lang.String r1 = r1.A0A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "OD_SECURED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d1
        L_0x0099:
            r0 = 2131428041(0x7f0b02c9, float:1.8477715E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r7, r0)
            r0 = 2131886307(0x7f1200e3, float:1.940719E38)
            if (r2 == 0) goto L_0x00a8
            r0 = 2131886344(0x7f120108, float:1.9407264E38)
        L_0x00a8:
            r1.setText(r0)
            r0 = 2131427944(0x7f0b0268, float:1.8477519E38)
            android.view.View r0 = r7.findViewById(r0)
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2131430078(0x7f0b0abe, float:1.8481847E38)
            X.AnonymousClass3MX.A1H(r7, r0, r1)
            r0 = 2131427945(0x7f0b0269, float:1.847752E38)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r7, r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "usable_balance"
            java.lang.String r0 = r1.getStringExtra(r0)
            r2.setText(r0)
        L_0x00d0:
            return
        L_0x00d1:
            if (r2 == 0) goto L_0x00d0
            goto L_0x0099
        L_0x00d4:
            int r0 = r1.A0C()
            goto L_0x0077
        L_0x00d9:
            X.1QE r1 = r7.A01
            java.lang.String r0 = "got null bank account or balance; finishing"
            r1.A04(r0)
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBalanceDetailsActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiBalanceDetailsActivity() {
        this(0);
        this.A01 = AnonymousClass1QE.A00("IndiaUpiBalanceDetailsActivity", "payment-settings", "IN");
    }
}
