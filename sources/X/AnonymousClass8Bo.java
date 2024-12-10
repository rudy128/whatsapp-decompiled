package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.8Bo  reason: invalid class name */
public abstract class AnonymousClass8Bo extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C185289cL r5 = C185289cL.A02;
            if (r5 == null) {
                r5 = new C185289cL(context);
                C185289cL.A02 = r5;
            }
            C27081DTg dTg = new C27081DTg(intent, this, context, 18);
            PowerManager.WakeLock wakeLock = r5.A00;
            wakeLock.acquire(60000);
            try {
                r5.A01.execute(new C27076DTa(r5, dTg, 5));
            } catch (RejectedExecutionException e) {
                Log.e("FBNSPreloadWakefulExecutor/Notification skipped", e);
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
            }
        }
    }
}
