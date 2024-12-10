package com.whatsapp.companiondevice;

import X.AnonymousClass1RK;
import X.AnonymousClass2DT;
import X.C17880vN;
import X.C19830z4;
import X.C47992Kt;
import android.content.Context;
import android.content.Intent;

public class CompanionDeviceVerificationReceiver extends AnonymousClass2DT {
    public C47992Kt A00;
    public C19830z4 A01;
    public AnonymousClass1RK A02;
    public final Object A03;
    public volatile boolean A04;

    public CompanionDeviceVerificationReceiver(int i) {
        this.A04 = false;
        this.A03 = C17880vN.A0p();
    }

    public void onReceive(Context context, Intent intent) {
        A00(context);
        super.onReceive(context, intent);
    }

    public CompanionDeviceVerificationReceiver() {
        this(0);
    }
}
