package com.whatsapp.service;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1LU;
import X.AnonymousClass6Fx;
import X.C108945cZ;
import X.C1408573i;
import X.C1409673t;
import X.C17880vN;
import X.C17900vP;
import X.C17990va;
import X.C217217d;
import X.C22681Cu;
import android.app.Notification;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public final class GcmFGService extends AnonymousClass6Fx {
    public AnonymousClass11P A00;
    public AnonymousClass18K A01;
    public AnonymousClass1LU A02;
    public boolean A03 = false;
    public volatile long A04;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public GcmFGService() {
        super("GcmFGService", false);
    }

    public void onCreate() {
        Log.i("GcmFGService/onCreate");
        A04();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("GcmFGService/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public boolean A05() {
        boolean A05 = super.A05();
        if (A05) {
            C22681Cu r4 = new C22681Cu();
            r4.A02 = "GcmFGService";
            r4.A00 = C108945cZ.A1B(SystemClock.uptimeMillis(), this.A04);
            this.A01.CC7(r4);
            this.A04 = 0;
        }
        return A05;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GcmFGService/onStartCommand:");
        A10.append(intent);
        C17900vP.A0j(" startId:", A10, i2);
        Resources resources = getResources();
        if (resources instanceof C17990va) {
            resources = ((C17990va) resources).A00;
        }
        C1409673t A032 = C217217d.A03(this);
        A032.A0M = "other_notifications@1";
        A032.A0F(resources.getString(2131899103));
        A032.A0E(resources.getString(2131899103));
        A032.A0D(resources.getString(2131899274));
        Intent A022 = AnonymousClass1LU.A02(this);
        A022.putExtra("fromNotification", true);
        A032.A0A = C1408573i.A00(this, 1, A022, 0);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = -2;
        if (i3 >= 26) {
            i4 = -1;
        }
        A032.A03 = i4;
        if (i3 != 24) {
            C17880vN.A1G(A032);
        }
        Notification A05 = A032.A05();
        int i5 = 11;
        if (i3 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A05);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), 2131231578)));
            A05 = recoverBuilder.build();
            i5 = 242478032;
        }
        A06(A05, (Integer) null, i2, i5);
        if (this.A04 == 0) {
            this.A04 = SystemClock.uptimeMillis();
        }
        return 1;
    }
}
