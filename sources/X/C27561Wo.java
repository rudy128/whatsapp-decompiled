package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.1Wo  reason: invalid class name and case insensitive filesystem */
public final class C27561Wo implements Application.ActivityLifecycleCallbacks {
    public static final C27551Wn Companion = new Object();

    public static final void registerIn(Activity activity) {
        C27551Wn.A00(activity);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        C27541Wm.A01(activity, C27581Wq.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        C18070vi.A0d(activity, 0);
        C27541Wm.A01(activity, C27581Wq.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        C18070vi.A0d(activity, 0);
        C27541Wm.A01(activity, C27581Wq.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        C27541Wm.A01(activity, C27581Wq.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        C18070vi.A0d(activity, 0);
        C27541Wm.A01(activity, C27581Wq.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        C18070vi.A0d(activity, 0);
        C27541Wm.A01(activity, C27581Wq.ON_STOP);
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
