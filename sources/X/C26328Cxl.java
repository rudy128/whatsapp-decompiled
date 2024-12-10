package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.Cxl  reason: case insensitive filesystem */
public final class C26328Cxl implements Application.ActivityLifecycleCallbacks {
    public final Activity A00;
    public final C23019BZv A01;

    public /* synthetic */ C26328Cxl(Activity activity, C23019BZv bZv) {
        this.A00 = activity;
        this.A01 = bZv;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.A00) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = activity.getPackageName();
                Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", A1a));
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.A00) {
            try {
                this.A01.A0B(1);
            } catch (RemoteException e) {
                if (Log.isLoggable("NearbyMessagesClient", 2)) {
                    Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e}));
                }
            }
        }
    }
}
