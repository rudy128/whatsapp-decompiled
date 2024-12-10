package com.whatsapp.systemreceivers.boot;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass3LN;
import X.C000200d;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C53882dF;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class BootReceiver extends BroadcastReceiver {
    public AnonymousClass00H A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = C000200d.A00(AnonymousClass10E.A10(context).A0R);
                    this.A02 = true;
                }
            }
        }
        C18070vi.A0d(context, 0);
        if (intent != null && C17890vO.A1S(intent, "android.intent.action.BOOT_COMPLETED")) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                C53882dF r1 = (C53882dF) r0.get();
                if (C17890vO.A1S(intent, "android.intent.action.BOOT_COMPLETED")) {
                    Log.i("BootManager; boot completed.");
                    if (r1.A00.A04()) {
                        for (AnonymousClass3LN Bmm : r1.A01) {
                            Bmm.Bmm();
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C18070vi.A11("bootManager");
            throw null;
        }
    }

    public BootReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public BootReceiver() {
        this(0);
    }
}
