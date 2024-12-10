package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1f2  reason: invalid class name and case insensitive filesystem */
public final class C31111f2 extends BroadcastReceiver implements AnonymousClass191 {
    public boolean A00;
    public final Set A01;
    public final Context A02;
    public final C29831cw A03;

    public C31111f2(Context context, C29831cw r3) {
        C18070vi.A0d(r3, 2);
        this.A02 = context;
        this.A03 = r3;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C18070vi.A0X(newSetFromMap);
        this.A01 = newSetFromMap;
    }

    public /* synthetic */ void Blg() {
    }

    public void onReceive(Context context, Intent intent) {
        C18070vi.A0d(intent, 1);
        boolean z = false;
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra >= 1) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            for (C31121f3 Bva : this.A01) {
                Bva.Bva(z);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HeadsetPluggedStateMonitor/headset ");
        sb.append(intExtra);
        Log.i(sb.toString());
    }

    public void Blf() {
        this.A03.A01(this.A02, this, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
    }

    public void Ba9() {
    }
}
