package com.whatsapp.service;

import X.AnonymousClass009;
import X.C008203r;
import X.C008503u;
import X.C145777Mo;
import X.C17880vN;
import X.C29651cd;
import X.C31131f4;
import X.C31221fD;
import android.content.Intent;
import android.os.IBinder;

public class BackgroundMediaControlService extends C29651cd implements AnonymousClass009 {
    public C31131f4 A00;
    public boolean A01;
    public final Object A02;
    public volatile C008203r A03;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C008203r(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C31131f4) ((C31221fD) ((C008503u) generatedComponent())).A07.A6M.get();
        }
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        C145777Mo A002 = this.A00.A00();
        if (str != null) {
            if (str.equals("com.whatsapp.service.BackgroundMediaControlService.STOP")) {
                this.A00.A04();
            } else if (str.equals("com.whatsapp.service.BackgroundMediaControlService.START") && A002 != null) {
                A002.A0C(C145777Mo.A15, true, false);
            }
        }
        stopSelf();
        return 2;
    }

    public BackgroundMediaControlService(int i) {
        this.A02 = C17880vN.A0p();
        this.A01 = false;
    }

    public BackgroundMediaControlService() {
        this(0);
    }
}
