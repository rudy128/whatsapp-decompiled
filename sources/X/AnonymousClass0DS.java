package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.0DS  reason: invalid class name */
public abstract class AnonymousClass0DS {
    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 2);
    }
}
