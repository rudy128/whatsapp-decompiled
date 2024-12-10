package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: X.8KM  reason: invalid class name */
public final class AnonymousClass8KM extends AnonymousClass8KO {
    public /* bridge */ /* synthetic */ Object A04() {
        boolean z;
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            A5Z.A00().A04(C182019St.A00, "getInitialState - null intent received");
        } else {
            z = true;
            if (Build.VERSION.SDK_INT >= 23) {
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public IntentFilter A07() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }
}
