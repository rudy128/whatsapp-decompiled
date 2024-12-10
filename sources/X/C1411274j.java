package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: X.74j  reason: invalid class name and case insensitive filesystem */
public class C1411274j implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C23861BrI A00;

    public void onActivityDestroyed(Activity activity) {
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

    public C1411274j(C23861BrI brI) {
        this.A00 = brI;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C23861BrI brI = this.A00;
        AnonymousClass00H r0 = C23861BrI.A06;
        Handler handler = brI.A02;
        if (handler != null) {
            handler.post(new C146797Qq(this, activity, 7));
        }
    }
}
