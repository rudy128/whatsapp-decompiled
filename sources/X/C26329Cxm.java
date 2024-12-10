package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.Cxm  reason: case insensitive filesystem */
public final class C26329Cxm implements Application.ActivityLifecycleCallbacks {
    public boolean A00;
    public final Activity A01;
    public final C22821Di A02;

    public void onActivityDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        if (C18070vi.A18(this.A01, activity)) {
            this.A02.invoke(C24269ByS.EXIT_BACKWARD);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A02.invoke(C24269ByS.EXIT_FORWARD);
    }

    public C26329Cxm(Activity activity, C22821Di r2) {
        this.A01 = activity;
        this.A02 = r2;
    }
}
