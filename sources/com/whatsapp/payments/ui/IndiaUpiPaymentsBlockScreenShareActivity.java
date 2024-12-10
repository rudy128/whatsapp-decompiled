package com.whatsapp.payments.ui;

import X.AFP;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass1FP;
import X.AnonymousClass1Z2;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.C19740yt;
import X.C72473Md;
import X.C91024f1;
import android.os.Bundle;

public class IndiaUpiPaymentsBlockScreenShareActivity extends AnonymousClass1FP {
    public AZ6 A00;
    public boolean A01;

    public IndiaUpiPaymentsBlockScreenShareActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            this.A05 = AnonymousClass10E.AL1(A0L);
            this.A00 = (AZ6) A0L.A5D.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2);
        AnonymousClass3Ma.A1H(getWindow(), 0);
        getWindow().setDimAmount(0.8f);
        int A002 = AnonymousClass3Ma.A00(this, 2130970006, 2131101095);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(AnonymousClass1Z2.A03(0.3f, A002, C19740yt.A00(this, AnonymousClass4Z9.A00(this, 2130970286))));
        setContentView(2131625655);
        findViewById(2131429132).setOnClickListener(new AFP(this, 28));
        this.A00.BiL((Integer) null, "block_screen_share", (String) null, 0);
    }

    public IndiaUpiPaymentsBlockScreenShareActivity(int i) {
        this.A01 = false;
        C91024f1.A00(this, 13);
    }
}
