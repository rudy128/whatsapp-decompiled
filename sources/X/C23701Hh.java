package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1Hh  reason: invalid class name and case insensitive filesystem */
public abstract class C23701Hh implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        Object obj;
        if (this instanceof C23741Hl) {
            C23741Hl r3 = (C23741Hl) this;
            C23751Hm r2 = r3.A00;
            if (r2.hasMessages(0)) {
                r2.removeMessages(0);
            }
            ((C62332rE) r3.A01.get()).A02();
        } else if (this instanceof AnonymousClass1IW) {
            AnonymousClass1IW r22 = (AnonymousClass1IW) this;
            C18070vi.A0d(activity, 0);
            WeakReference weakReference = r22.A03;
            if (weakReference != null) {
                obj = weakReference.get();
            } else {
                obj = null;
            }
            if (C18070vi.A18(obj, activity)) {
                WeakReference weakReference2 = r22.A03;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                r22.A03 = null;
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this instanceof C23711Hi) {
            C23711Hi r2 = (C23711Hi) this;
            if ((activity instanceof AnonymousClass1FY) && Boolean.TRUE.equals(((C27431Wb) r2.A00.get()).A03.A06())) {
                Log.i("LockedForBackupLifecycleObserver/onActivityStarted redirect to BlockingUserInteractionActivity");
                r2.A01.get();
                activity.startActivity(AnonymousClass1LU.A0B(activity, 0));
                activity.finish();
            }
        }
    }
}
