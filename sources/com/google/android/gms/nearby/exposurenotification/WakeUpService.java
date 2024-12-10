package com.google.android.gms.nearby.exposurenotification;

import X.BG2;
import X.C24438C3p;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

public class WakeUpService extends Service {
    public final IBinder onBind(Intent intent) {
        return new Messenger(new BG2((C24438C3p) null)).getBinder();
    }
}
