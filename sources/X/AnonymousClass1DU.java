package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.1DU  reason: invalid class name */
public final class AnonymousClass1DU extends AnonymousClass11D implements Application.ActivityLifecycleCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1DU(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r2, r3, false);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
    }

    public static final void A00(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPostDestroyed(activity);
    }

    public static final void A01(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPostPaused(activity);
    }

    public static final void A02(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPostResumed(activity);
    }

    public static final void A03(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPostStarted(activity);
    }

    public static final void A04(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPostStopped(activity);
    }

    public static final void A05(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPreDestroyed(activity);
    }

    public static final void A06(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPrePaused(activity);
    }

    public static final void A07(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPreResumed(activity);
    }

    public static final void A08(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPreStarted(activity);
    }

    public static final void A09(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C18070vi.A0d(activityLifecycleCallbacks, 1);
        activityLifecycleCallbacks.onActivityPreStopped(activity);
    }

    public static final void A0A(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Bundle bundle) {
        C18070vi.A0d(activityLifecycleCallbacks, 2);
        activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
    }

    public static final void A0B(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Bundle bundle) {
        C18070vi.A0d(activityLifecycleCallbacks, 2);
        activityLifecycleCallbacks.onActivityPostSaveInstanceState(activity, bundle);
    }

    public static final void A0C(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Bundle bundle) {
        C18070vi.A0d(activityLifecycleCallbacks, 2);
        activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
    }

    public static final void A0D(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Bundle bundle) {
        C18070vi.A0d(activityLifecycleCallbacks, 2);
        activityLifecycleCallbacks.onActivityPreSaveInstanceState(activity, bundle);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35M(activity, bundle, 0));
    }

    public void onActivityDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new C97014om(activity, 29));
    }

    public void onActivityPaused(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new C97014om(activity, 28));
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35M(activity, bundle, 1));
    }

    public void onActivityPostDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35G(activity, 0));
    }

    public void onActivityPostPaused(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35G(activity, 1));
    }

    public void onActivityPostResumed(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35F(activity, 1));
    }

    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(bundle, 1);
        notifyAllObservers(new AnonymousClass35O(activity, bundle, 0));
    }

    public void onActivityPostStarted(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35F(activity, 4));
    }

    public void onActivityPostStopped(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35G(activity, 2));
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35M(activity, bundle, 2));
    }

    public void onActivityPreDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35G(activity, 5));
    }

    public void onActivityPrePaused(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35G(activity, 4));
    }

    public void onActivityPreResumed(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35F(activity, 2));
    }

    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(bundle, 1);
        notifyAllObservers(new AnonymousClass35O(activity, bundle, 1));
    }

    public void onActivityPreStarted(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35F(activity, 3));
    }

    public void onActivityPreStopped(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35G(activity, 3));
    }

    public void onActivityResumed(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35F(activity, 0));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(bundle, 1);
        notifyAllObservers(new AnonymousClass35N(activity, bundle, 15));
    }

    public void onActivityStarted(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new AnonymousClass35F(activity, 5));
    }

    public void onActivityStopped(Activity activity) {
        C18070vi.A0d(activity, 0);
        notifyAllObservers(new C97014om(activity, 27));
    }
}
