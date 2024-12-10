package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.35M  reason: invalid class name */
public class AnonymousClass35M implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass35M(Activity activity, Bundle bundle, int i) {
        this.A00 = i;
        this.A01 = activity;
        this.A02 = bundle;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
                C18070vi.A0d(activityLifecycleCallbacks, 2);
                activityLifecycleCallbacks.onActivityCreated((Activity) this.A01, (Bundle) this.A02);
                return;
            case 1:
                AnonymousClass1DU.A0A((Activity) this.A01, (Application.ActivityLifecycleCallbacks) obj, (Bundle) this.A02);
                return;
            default:
                AnonymousClass1DU.A0C((Activity) this.A01, (Application.ActivityLifecycleCallbacks) obj, (Bundle) this.A02);
                return;
        }
    }
}
