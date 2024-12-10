package X;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.0yQ  reason: invalid class name and case insensitive filesystem */
public class C19570yQ implements Application.ActivityLifecycleCallbacks {
    public final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public static void A00(Intent intent) {
        Bundle bundle;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && (bundle = extras.getBundle("gcm.n.analytics_data")) != null && "1".equals(bundle.getString("google.c.a.e"))) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    C18220vy A002 = C18220vy.A00();
                    C18220vy.A02(A002);
                    A002.A02.BMD(B4j.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
                C196439v4.A00("_no", bundle);
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.A00.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new C70713Cf(this, intent, 15));
            } else {
                A00(intent);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.A00.remove(activity.getIntent());
        }
    }
}
