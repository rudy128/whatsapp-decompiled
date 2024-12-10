package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.0Qz  reason: invalid class name and case insensitive filesystem */
public final class C05220Qz implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        AnonymousClass0QO.A02(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        AnonymousClass0QO.A03(activity);
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
}
