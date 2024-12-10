package X;

import android.app.Activity;
import android.app.Application;

/* renamed from: X.35G  reason: invalid class name */
public class AnonymousClass35G implements C23691Hg {
    public final int A00;
    public final Object A01;

    public AnonymousClass35G(Activity activity, int i) {
        this.A00 = i;
        this.A01 = activity;
    }

    public final void CGE(Object obj) {
        int i = this.A00;
        Activity activity = (Activity) this.A01;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
        switch (i) {
            case 0:
                AnonymousClass1DU.A00(activity, activityLifecycleCallbacks);
                return;
            case 1:
                AnonymousClass1DU.A01(activity, activityLifecycleCallbacks);
                return;
            case 2:
                AnonymousClass1DU.A04(activity, activityLifecycleCallbacks);
                return;
            case 3:
                AnonymousClass1DU.A09(activity, activityLifecycleCallbacks);
                return;
            case 4:
                AnonymousClass1DU.A06(activity, activityLifecycleCallbacks);
                return;
            default:
                AnonymousClass1DU.A05(activity, activityLifecycleCallbacks);
                return;
        }
    }
}
