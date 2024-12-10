package androidx.work.impl.background.systemalarm;

import X.A5Z;
import X.A7W;
import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.AnonymousClass8BX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = A5Z.A01("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        A5Z A002 = A5Z.A00();
        String str = A00;
        AnonymousClass8BX.A12(A002, intent, "Received intent ", str, AnonymousClass000.A10());
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                A7W A003 = A7W.A00(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (A7W.A0C) {
                    BroadcastReceiver.PendingResult pendingResult = A003.A00;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    A003.A00 = goAsync;
                    if (A003.A08) {
                        goAsync.finish();
                        A003.A00 = null;
                    }
                }
            } catch (IllegalStateException e) {
                A5Z.A00().A08(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
            A07.setAction("ACTION_RESCHEDULE");
            context.startService(A07);
        }
    }
}
