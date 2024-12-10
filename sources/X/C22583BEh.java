package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.BEh  reason: case insensitive filesystem */
public class C22583BEh extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            C26101CsL.A00();
        }
    }
}
