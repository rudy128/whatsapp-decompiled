package X;

import android.app.Activity;

/* renamed from: X.4Yv  reason: invalid class name */
public abstract class AnonymousClass4Yv {
    public static void A00(Activity activity, int i) {
        if (!A02(activity)) {
            activity.removeDialog(i);
        }
    }

    public static void A01(Activity activity, int i) {
        if (!A02(activity)) {
            activity.showDialog(i);
        }
    }

    public static boolean A02(Activity activity) {
        if (activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
