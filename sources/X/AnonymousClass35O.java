package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.35O  reason: invalid class name */
public class AnonymousClass35O implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass35O(Activity activity, Bundle bundle, int i) {
        this.A00 = i;
        this.A01 = activity;
        this.A02 = bundle;
    }

    public final void CGE(Object obj) {
        int i = this.A00;
        Activity activity = (Activity) this.A01;
        Bundle bundle = (Bundle) this.A02;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
        if (i != 0) {
            AnonymousClass1DU.A0D(activity, activityLifecycleCallbacks, bundle);
        } else {
            AnonymousClass1DU.A0B(activity, activityLifecycleCallbacks, bundle);
        }
    }
}
