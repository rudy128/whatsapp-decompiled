package com.whatsapp.payments.ui;

import X.AnonymousClass3MW;
import X.AnonymousClass91E;
import X.C17880vN;
import X.C21427Aju;
import X.C72463Mc;
import android.os.Bundle;
import android.text.Spannable;

public final class P2mLiteDyiReportActivity extends AnonymousClass91E {
    public Spannable A4b() {
        if (!"personal".equals(this.A0Q)) {
            return super.A4b();
        }
        return this.A0N.A06(this, new C21427Aju(this, 13), C17880vN.A0q(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131893972), "learn-more", C72463Mc.A02(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0V.setVisibility(0);
    }
}
