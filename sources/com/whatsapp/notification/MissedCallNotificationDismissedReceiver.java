package com.whatsapp.notification;

import X.AnonymousClass10E;
import X.AnonymousClass1Cd;
import X.C17880vN;
import X.C70313Ao;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    public AnonymousClass1Cd A00;
    public C70313Ao A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (AnonymousClass1Cd) r1.A6i.get();
                    this.A01 = (C70313Ao) r1.A6t.get();
                    this.A03 = true;
                }
            }
        }
        Log.i("missedcallnotification/dismiss");
        AnonymousClass1Cd r0 = this.A00;
        r0.A06();
        if (r0.A08) {
            this.A01.A04();
        }
    }

    public MissedCallNotificationDismissedReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public MissedCallNotificationDismissedReceiver() {
        this(0);
    }
}
