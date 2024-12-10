package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0w2  reason: invalid class name and case insensitive filesystem */
public final class C18260w2 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final C18260w2 A04 = new C18260w2();
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public static void A00(Application application) {
        C18260w2 r1 = A04;
        synchronized (r1) {
            if (!r1.A00) {
                application.registerActivityLifecycleCallbacks(r1);
                application.registerComponentCallbacks(r1);
                r1.A00 = true;
            }
        }
    }

    private final void A01(boolean z) {
        synchronized (A04) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C18240w0) it.next()).BmA(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.A03;
        boolean compareAndSet = this.A02.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            A01(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.A03;
        boolean compareAndSet = this.A02.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            A01(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.A02.compareAndSet(false, true)) {
            this.A03.set(true);
            A01(true);
        }
    }
}
