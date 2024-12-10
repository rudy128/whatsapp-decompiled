package com.whatsapp.messaging;

import X.AnonymousClass009;
import X.C008203r;
import X.C29651cd;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessageService extends C29651cd implements AnonymousClass009 {
    public boolean A00;
    public final Object A01;
    public volatile C008203r A02;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C008203r(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        Log.i("messageservice/onCreate");
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("messageservice/onDestroy");
        super.onDestroy();
    }

    public MessageService(int i) {
        this.A01 = new Object();
        this.A00 = false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public MessageService() {
        this(0);
    }
}
