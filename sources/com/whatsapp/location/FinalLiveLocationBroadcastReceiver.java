package com.whatsapp.location;

import X.AnonymousClass10E;
import X.C17880vN;
import X.C18070vi;
import X.C27131Uv;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class FinalLiveLocationBroadcastReceiver extends BroadcastReceiver {
    public C27131Uv A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (C27131Uv) AnonymousClass10E.A10(context).AJU.A5p.get();
                    this.A02 = true;
                }
            }
        }
        Log.i("FinalLiveLocationBroadcastReceiver/onReceive");
        C27131Uv r0 = this.A00;
        if (r0 != null) {
            r0.A0P();
        } else {
            C18070vi.A11("locationSharingManager");
            throw null;
        }
    }

    public FinalLiveLocationBroadcastReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public FinalLiveLocationBroadcastReceiver() {
        this(0);
    }
}
