package com.whatsapp.payments.ui;

import X.AFP;
import X.AGD;
import X.AnonymousClass03S;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BU;
import X.AnonymousClass91K;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C18020vd;
import X.C18040vf;
import X.C39151sZ;
import X.C63662tU;
import X.C63932tv;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class IndiaUpiPaymentsValuePropsActivity extends AnonymousClass91K {
    public TextSwitcher A00;
    public boolean A01;

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
            AnonymousClass91U.A1Z(r1, this);
        }
    }

    public IndiaUpiPaymentsValuePropsActivity(int i) {
        this.A01 = false;
        AGD.A00(this, 19);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C39151sZ r2 = (C39151sZ) this.A00.getLayoutParams();
        r2.A0Y = AnonymousClass3MW.A01(getResources(), 2131168245);
        this.A00.setLayoutParams(r2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625670);
        A4s(2131893788, 2131433707);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131433706);
        AnonymousClass3MX.A0I(this, 2131433705).setImageDrawable(AnonymousClass03S.A01(this, 2131233629));
        int i = 2131894236;
        if (C18020vd.A05(C18040vf.A02, this.A0E, 1568)) {
            i = 2131894237;
        }
        A0L.setText(i);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(2131433704);
        this.A00 = textSwitcher;
        A53(textSwitcher);
        AFP.A00(findViewById(2131433703), this, 30);
        this.A0Q.A09();
    }

    public IndiaUpiPaymentsValuePropsActivity() {
        this(0);
    }
}
