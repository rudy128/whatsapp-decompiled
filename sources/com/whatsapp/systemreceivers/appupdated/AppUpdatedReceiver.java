package com.whatsapp.systemreceivers.appupdated;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DB;
import X.C17880vN;
import X.C18070vi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class AppUpdatedReceiver extends BroadcastReceiver {
    public AnonymousClass1DB A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = AnonymousClass10G.ADn(AnonymousClass10E.A10(context));
                    this.A02 = true;
                }
            }
        }
        C18070vi.A0d(context, 0);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(str) && this.A00 == null) {
            C18070vi.A11("appUpdateManager");
            throw null;
        }
    }

    public AppUpdatedReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public AppUpdatedReceiver() {
        this(0);
    }
}
