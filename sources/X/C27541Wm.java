package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;

/* renamed from: X.1Wm  reason: invalid class name and case insensitive filesystem */
public abstract class C27541Wm {
    public static final void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C27551Wn.A00(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final void A01(Activity activity, C27581Wq r2) {
        if (activity instanceof AnonymousClass1F9) {
            C23381Fv lifecycle = ((AnonymousClass1F9) activity).getLifecycle();
            if (lifecycle instanceof C23391Fw) {
                ((C23391Fw) lifecycle).A07(r2);
            }
        }
    }
}
