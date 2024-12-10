package com.whatsapp.media.transcode;

import X.AnonymousClass112;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1TJ;
import X.AnonymousClass6Fx;
import X.AnonymousClass7FI;
import X.AnonymousClass7PS;
import X.C137276vC;
import X.C1409673t;
import X.C17880vN;
import X.C17890vO;
import X.C217217d;
import X.C24681Lg;
import X.C24921Me;
import X.C32861hs;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;

public class MediaTranscodeService extends AnonymousClass6Fx {
    public static final AnonymousClass1TJ A0A = new AnonymousClass1TJ();
    public static final HashMap A0B = C17880vN.A11();
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C24681Lg A02;
    public AnonymousClass1LU A03;
    public C32861hs A04;
    public boolean A05 = false;
    public int A06 = -1;
    public AnonymousClass7FI A07;
    public String A08;
    public boolean A09 = false;

    public static void A00(MediaTranscodeService mediaTranscodeService, int i) {
        Integer num;
        MediaTranscodeService mediaTranscodeService2 = mediaTranscodeService;
        boolean z = mediaTranscodeService.A09;
        mediaTranscodeService2.A09 = true;
        HashMap hashMap = A0B;
        synchronized (hashMap) {
            Collection values = hashMap.values();
            AnonymousClass1M9 r7 = mediaTranscodeService2.A00;
            C24921Me r8 = mediaTranscodeService2.A01;
            C32861hs r11 = mediaTranscodeService2.A04;
            AnonymousClass7PS A002 = C137276vC.A00(mediaTranscodeService2, r7, r8, mediaTranscodeService2.A01, mediaTranscodeService2.A03, r11, values, z);
            Notification notification = (Notification) A002.first;
            String str = (String) A002.second;
            int intValue = ((Integer) A002.third).intValue();
            int i2 = mediaTranscodeService2.A06;
            String str2 = mediaTranscodeService2.A08;
            if (!z || i2 != intValue || !TextUtils.equals(str, str2)) {
                if (AnonymousClass112.A06()) {
                    num = C17880vN.A0h();
                } else {
                    num = null;
                }
                mediaTranscodeService2.A06(notification, num, i, 3);
            }
            mediaTranscodeService2.A06 = intValue;
            mediaTranscodeService2.A08 = str;
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public MediaTranscodeService() {
        super("media-transcode-service", false);
    }

    public void onCreate() {
        Log.i("MediaTranscodeService/onCreate");
        A04();
        super.onCreate();
        AnonymousClass7FI r1 = new AnonymousClass7FI(this);
        this.A07 = r1;
        this.A02.registerObserver(r1);
    }

    public void onDestroy() {
        A0B.size();
        this.A09 = false;
        stopForeground(true);
        this.A02.unregisterObserver(this.A07);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Integer num;
        this.A07.A00 = i2;
        if (intent == null || !C17890vO.A1S(intent, "com.whatsapp.media.transcode.MediaTranscodeService.STOP")) {
            A00(this, i2);
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            C1409673t A032 = C217217d.A03(this);
            A032.A0M = "sending_media@1";
            A032.A0E(getString(2131898700));
            A032.A0D(getString(2131895752));
            A032.A03 = -1;
            A032.A08.icon = 17301640;
            Notification A052 = A032.A05();
            if (AnonymousClass112.A06()) {
                num = C17880vN.A0h();
            } else {
                num = null;
            }
            A06(A052, num, i2, 3);
        }
        this.A09 = false;
        A05();
        return 2;
    }
}
