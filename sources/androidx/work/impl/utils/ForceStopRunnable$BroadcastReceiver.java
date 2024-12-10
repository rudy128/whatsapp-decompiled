package androidx.work.impl.utils;

import X.A5Z;
import X.C21460AkR;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = A5Z.A01("ForceStopRunnable$Rcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            A5Z.A00().A02(A00);
            C21460AkR.A01(context);
        }
    }
}
