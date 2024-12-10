package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.Cxj  reason: case insensitive filesystem */
public final class C26326Cxj implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ CTN A00;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C26326Cxj(CTN ctn) {
        this.A00 = ctn;
    }

    public void onActivityPaused(Activity activity) {
        C18090vk r0 = this.A00.A00;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void onActivityResumed(Activity activity) {
        C18090vk r0 = this.A00.A01;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
