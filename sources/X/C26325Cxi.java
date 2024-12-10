package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.Cxi  reason: case insensitive filesystem */
public class C26325Cxi implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ CZ6 A00;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C26325Cxi(CZ6 cz6) {
        this.A00 = cz6;
    }

    public void onActivityDestroyed(Activity activity) {
        CZ6 cz6 = this.A00;
        if (activity == cz6.A01.get()) {
            cz6.A00();
        }
    }

    public void onActivityPaused(Activity activity) {
        this.A00.A00 = null;
    }

    public void onActivityStarted(Activity activity) {
        this.A00.A00 = AnonymousClass3MW.A0z(activity);
    }
}
