package com.whatsapp.instrumentation.service;

import X.AnonymousClass000;
import X.AnonymousClass112;
import X.AnonymousClass1LU;
import X.AnonymousClass6Fx;
import X.C1408573i;
import X.C1409673t;
import X.C146447Pd;
import X.C17880vN;
import X.C17900vP;
import X.C217217d;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;

public class InstrumentationFGService extends AnonymousClass6Fx {
    public AnonymousClass1LU A00;
    public boolean A01 = false;
    public Handler A02 = new Handler();
    public Runnable A03 = new C146447Pd(this, 21);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    public InstrumentationFGService() {
        super("instrumentationfgservice", true);
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("instrumentationfgservice/onStartCommand:");
        A10.append(intent);
        C17900vP.A0j(" startId:", A10, i2);
        C1409673t A032 = C217217d.A03(this);
        A032.A0M = "other_notifications@1";
        A032.A0F(getString(2131899103));
        A032.A0E(getString(2131899103));
        A032.A0D(getString(2131893068));
        A032.A0A = C1408573i.A00(this, 1, AnonymousClass1LU.A02(this), 0);
        int i4 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = -1;
        }
        A032.A03 = i4;
        C17880vN.A1G(A032);
        Notification A05 = A032.A05();
        if (AnonymousClass112.A0A()) {
            i3 = 1;
        } else {
            i3 = null;
        }
        A06(A05, i3, i2, 25);
        Handler handler = this.A02;
        Runnable runnable = this.A03;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000);
        return 2;
    }
}
