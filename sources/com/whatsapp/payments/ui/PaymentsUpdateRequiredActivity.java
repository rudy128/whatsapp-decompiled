package com.whatsapp.payments.ui;

import X.AFQ;
import X.AGE;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass3MX;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.C003401n;
import X.C137116uw;
import X.C40751vD;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.WaImageView;

public class PaymentsUpdateRequiredActivity extends AnonymousClass1FY {
    public C40751vD A00;
    public AnonymousClass00H A01;
    public WaImageView A02;
    public boolean A03;

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = C72453Mb.A0d(r2);
            this.A01 = AnonymousClass8BT.A0f(r2);
        }
    }

    public PaymentsUpdateRequiredActivity(int i) {
        this.A03 = false;
        AGE.A00(this, 2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WaImageView waImageView = this.A02;
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AnonymousClass8BU.A17(supportActionBar, 2131896249);
        }
        setContentView(2131626432);
        findViewById(2131436546);
        findViewById(2131436533);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131436562);
        A0L.setText(2131887592);
        AFQ.A00(A0L, this, 28);
        this.A02 = (WaImageView) findViewById(2131436540);
    }

    public PaymentsUpdateRequiredActivity() {
        this(0);
    }
}
