package com.whatsapp.payments.ui;

import X.A19;
import X.AGC;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19K;
import X.AnonymousClass1K1;
import X.AnonymousClass1RK;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C114925sD;
import X.C137116uw;
import X.C63662tU;
import X.C63932tv;

public final class CheckoutLiteWebViewActivity extends MessageWithLinkWebViewActivity {
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
            C114925sD.A03(A002, r2, r1, this);
            this.A01 = AnonymousClass10E.A8r(r2);
            this.A00 = (AnonymousClass1RK) r2.A2R.get();
            this.A06 = AnonymousClass3Ma.A0s(r2);
            this.A05 = (A19) r2.AZd.get();
            this.A03 = AnonymousClass3MZ.A0z(r2);
            this.A07 = r1.AEh();
            this.A02 = AnonymousClass3MY.A0Z(r2);
            this.A08 = (AnonymousClass19K) r2.AC4.get();
        }
    }

    public CheckoutLiteWebViewActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 32);
    }

    public boolean A4m() {
        return false;
    }

    public CheckoutLiteWebViewActivity() {
        this(0);
    }
}
