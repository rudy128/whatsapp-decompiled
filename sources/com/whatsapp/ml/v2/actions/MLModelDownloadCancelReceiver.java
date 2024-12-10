package com.whatsapp.ml.v2.actions;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1OB;
import X.AnonymousClass1OD;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass1OY;
import X.AnonymousClass3MW;
import X.C17880vN;
import X.C23761Hn;
import X.C23771Ho;
import X.C30391dr;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class MLModelDownloadCancelReceiver extends BroadcastReceiver {
    public AnonymousClass00H A00;
    public AnonymousClass1OX A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10G.AVd(AnonymousClass10E.A10(context), this);
                    this.A03 = true;
                }
            }
        }
        if (intent != null) {
            AnonymousClass1OD r0 = new AnonymousClass1OD((AnonymousClass1OB) null);
            C23771Ho r2 = C23761Hn.A01;
            AnonymousClass1OY A022 = AnonymousClass1OW.A02(r0.plus(r2));
            this.A01 = A022;
            AnonymousClass3MW.A1X(r2, new MLModelDownloadCancelReceiver$onReceive$1(intent, this, (C30391dr) null), A022);
        }
    }

    public MLModelDownloadCancelReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public MLModelDownloadCancelReceiver() {
        this(0);
    }
}
