package com.whatsapp.push;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass8Bo;
import X.C000200d;
import X.C17880vN;
import X.C35371m8;
import android.content.Context;
import android.content.Intent;

public class WAFbnsPreloadReceiver extends AnonymousClass8Bo {
    public C35371m8 A00;
    public AnonymousClass00H A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10G A10 = AnonymousClass10E.A10(context);
                    this.A01 = C000200d.A00(A10.A2j);
                    this.A00 = (C35371m8) A10.AJU.A4M.get();
                    this.A03 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public WAFbnsPreloadReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public WAFbnsPreloadReceiver() {
        this(0);
    }
}
