package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.8KO  reason: invalid class name */
public abstract class AnonymousClass8KO extends C196019uK {
    public final BroadcastReceiver A00 = new C161128Bv(this, 0);

    public IntentFilter A07() {
        IntentFilter intentFilter;
        String str;
        if (this instanceof AnonymousClass8KL) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
            str = "android.intent.action.DEVICE_STORAGE_LOW";
        } else if (this instanceof AnonymousClass8KN) {
            return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        } else {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            str = "android.intent.action.BATTERY_LOW";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public AnonymousClass8KO(Context context, C71973Kb r4) {
        super(context, r4);
    }
}
