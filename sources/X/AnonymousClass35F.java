package X;

import android.app.Activity;
import android.app.Application;

/* renamed from: X.35F  reason: invalid class name */
public class AnonymousClass35F implements C23691Hg {
    public final int A00;
    public final Object A01;

    public AnonymousClass35F(Activity activity, int i) {
        this.A00 = i;
        this.A01 = activity;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
                C18070vi.A0d(activityLifecycleCallbacks, 1);
                activityLifecycleCallbacks.onActivityResumed((Activity) this.A01);
                return;
            case 1:
                AnonymousClass1DU.A02((Activity) this.A01, (Application.ActivityLifecycleCallbacks) obj);
                return;
            case 2:
                AnonymousClass1DU.A07((Activity) this.A01, (Application.ActivityLifecycleCallbacks) obj);
                return;
            case 3:
                AnonymousClass1DU.A08((Activity) this.A01, (Application.ActivityLifecycleCallbacks) obj);
                return;
            case 4:
                AnonymousClass1DU.A03((Activity) this.A01, (Application.ActivityLifecycleCallbacks) obj);
                return;
            default:
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) obj;
                C18070vi.A0d(activityLifecycleCallbacks2, 1);
                activityLifecycleCallbacks2.onActivityStarted((Activity) this.A01);
                return;
        }
    }
}
