package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass707;
import X.C006602x;
import X.C133656pG;
import X.C37011op;
import X.C50182Tl;
import X.C89954dI;
import X.C91014f0;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class SendLogsAsEmailActivity extends AnonymousClass1FY {
    public C133656pG A00;
    public AnonymousClass118 A01;
    public C37011op A02;
    public AnonymousClass707 A03;
    public AnonymousClass10I A04;
    public boolean A05;

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0J = AnonymousClass1FB.A0J((AnonymousClass1K1) ((C006602x) generatedComponent()), this);
            AnonymousClass1FB.A0M(A0J, this);
            AnonymousClass10G r1 = A0J.A00;
            AnonymousClass1FB.A0K(A0J, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0J, r1, this, r1.A5A);
            this.A01 = (AnonymousClass118) A0J.ABY.get();
            this.A04 = AnonymousClass10E.AL1(A0J);
            this.A00 = (C133656pG) r1.A1b.get();
            this.A03 = (AnonymousClass707) A0J.AAc.get();
            this.A02 = (C37011op) A0J.A5N.get();
        }
    }

    public SendLogsAsEmailActivity(int i) {
        this.A05 = false;
        A2L(new C91014f0(this, 27));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            try {
                if (this.A02.A01(callingActivity.getPackageName()).A03) {
                    setContentView(2131625715);
                    C50182Tl.A00((TextView) findViewById(2131431744), this.A0E, AnonymousClass000.A1b(this.A03.A00("https://faq.whatsapp.com/854037192262196").toString(), 1), 2131891411);
                    findViewById(2131431743).setOnClickListener(new C89954dI(this, 19));
                    findViewById(2131431747).setOnClickListener(new C89954dI(this, 20));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        finish();
    }

    public SendLogsAsEmailActivity() {
        this(0);
    }
}
