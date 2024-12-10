package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: X.260  reason: invalid class name */
public class AnonymousClass260 extends BroadcastReceiver {
    public C19850z7 A00;

    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        C19850z7 r0 = this.A00;
        if (r0 != null && (connectivityManager = (ConnectivityManager) r0.A01.A02.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (C19850z7.A00()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            FirebaseMessaging.A02(this.A00, 0);
            this.A00.A01.A02.unregisterReceiver(this);
            this.A00 = null;
        }
    }
}
