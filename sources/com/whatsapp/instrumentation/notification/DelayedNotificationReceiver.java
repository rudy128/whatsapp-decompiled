package com.whatsapp.instrumentation.notification;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1HY;
import X.C1408573i;
import X.C17880vN;
import X.C18000vb;
import X.C221618v;
import X.C27301Vn;
import X.C37271pF;
import X.C685933y;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DelayedNotificationReceiver extends BroadcastReceiver {
    public C27301Vn A00;
    public C18000vb A01;
    public AnonymousClass1HY A02;
    public AnonymousClass00H A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (C27301Vn) r1.A9A.get();
                    this.A02 = (AnonymousClass1HY) r1.A5M.get();
                    this.A01 = (C18000vb) r1.ABz.get();
                    this.A05 = true;
                }
            }
        }
        this.A02.A04(new C685933y(context, this, 1));
        PendingIntent A012 = C1408573i.A01(context, 0, intent, 536870912);
        if (A012 != null) {
            A012.cancel();
        }
    }

    public DelayedNotificationReceiver(int i) {
        this.A05 = false;
        this.A04 = C17880vN.A0p();
    }

    public DelayedNotificationReceiver() {
        this(0);
        this.A03 = C221618v.A00(C37271pF.class);
    }
}
