package com.whatsapp.payments.ui;

import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C17880vN;
import X.C63662tU;
import X.C63932tv;
import android.view.MenuItem;

public class IndiaUpiAccountRecoveryFinishActivity extends AnonymousClass91T {
    public boolean A00;

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

    public void onBackPressed() {
        this.A0S.BiL(C17880vN.A0j(), "notify_verification_complete", this.A0f, 1);
        super.onBackPressed();
    }

    public IndiaUpiAccountRecoveryFinishActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 39);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        if (r2 == 12) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r0 = 2131625604(0x7f0e0684, float:1.887842E38)
            r5.setContentView((int) r0)
            r0 = 2131427435(0x7f0b006b, float:1.8476486E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r5, r0)
            r0 = 2131233666(0x7f080b82, float:1.8083476E38)
            r1.setImageResource(r0)
            r0 = 2131427437(0x7f0b006d, float:1.847649E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r5, r0)
            r0 = 2131897393(0x7f122c31, float:1.9429674E38)
            r1.setText(r0)
            r0 = 2131427436(0x7f0b006c, float:1.8476488E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r5, r0)
            r0 = 2131897392(0x7f122c30, float:1.9429672E38)
            r1.setText(r0)
            X.01n r1 = X.AnonymousClass91U.A1J(r5)
            if (r1 == 0) goto L_0x0040
            r0 = 2131893788(0x7f121e1c, float:1.9422362E38)
            java.lang.String r0 = r5.getString(r0)
            X.AnonymousClass8BV.A17(r1, r0)
        L_0x0040:
            r0 = 2131427434(0x7f0b006a, float:1.8476484E38)
            android.widget.TextView r3 = X.AnonymousClass3MX.A0L(r5, r0)
            int r2 = r5.A02
            r0 = 5
            if (r2 == r0) goto L_0x0053
            r1 = 12
            r0 = 2131898925(0x7f12322d, float:1.9432781E38)
            if (r2 != r1) goto L_0x0056
        L_0x0053:
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
        L_0x0056:
            r3.setText(r0)
            r0 = 24
            X.AFO.A00(r3, r5, r0)
            X.AZ6 r4 = r5.A0S
            java.lang.String r3 = "notify_verification_complete"
            java.lang.String r2 = r5.A0f
            r1 = 0
            r0 = 0
            r4.BiL(r0, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiAccountRecoveryFinishActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0S.BiL(C17880vN.A0j(), "notify_verification_complete", this.A0f, 1);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiAccountRecoveryFinishActivity() {
        this(0);
    }
}
