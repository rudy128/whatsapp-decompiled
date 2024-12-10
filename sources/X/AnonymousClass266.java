package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.266  reason: invalid class name */
public class AnonymousClass266 extends BroadcastReceiver {
    public C70853Ct A00;
    public final /* synthetic */ C70853Ct A01;

    public synchronized void onReceive(Context context, Intent intent) {
        C70853Ct r0 = this.A00;
        if (r0 != null && C70853Ct.A03(r0)) {
            if (C70853Ct.A00()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            C70853Ct r4 = this.A00;
            r4.A01.A05.schedule(r4, 0, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.A00 = null;
        }
    }

    public AnonymousClass266(C70853Ct r1, C70853Ct r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
