package X;

import android.app.Activity;

/* renamed from: X.6Y1  reason: invalid class name */
public abstract class AnonymousClass6Y1 {
    public static final void A00(Activity activity) {
        int i;
        C18070vi.A0d(activity, 0);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int A08 = C72453Mb.A08(activity);
        if (A08 != 1) {
            if (A08 != 2) {
                return;
            }
            if (rotation == 0 || rotation == 1) {
                activity.setRequestedOrientation(0);
                return;
            }
            i = 8;
        } else if (rotation == 0 || rotation == 1) {
            activity.setRequestedOrientation(1);
            return;
        } else {
            i = 9;
        }
        activity.setRequestedOrientation(i);
    }
}
