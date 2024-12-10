package androidx.car.app.notification;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C07170aU;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IStartCarApp;

public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent((ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY"));
        Bundle extras = intent.getExtras();
        if (extras != null) {
            IBinder binder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            if (binder != null) {
                IStartCarApp asInterface = IStartCarApp.Stub.asInterface(binder);
                asInterface.getClass();
                try {
                    if (Log.isLoggable("CarApp", 3)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Dispatching call ");
                        A10.append("startCarApp from notification");
                        Log.d("CarApp", AnonymousClass000.A0y(" to host", A10));
                    }
                    asInterface.startCarApp(intent);
                    return;
                } catch (SecurityException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Remote ");
                    A102.append("startCarApp from notification");
                    throw new C07170aU(AnonymousClass000.A0y(" call failed", A102), e2);
                } catch (RemoteException e3) {
                    Log.e("CarApp.Dispatch", AnonymousClass001.A1H("Host unresponsive when dispatching call ", "startCarApp from notification", AnonymousClass000.A10()), e3);
                    return;
                }
            }
        }
        Log.e("CarApp.NBR", AnonymousClass001.A1E(intent, "Notification intent missing expected extra: ", AnonymousClass000.A10()));
    }
}
