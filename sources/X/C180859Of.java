package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.9Of  reason: invalid class name and case insensitive filesystem */
public abstract class C180859Of {
    public static boolean A01(Context context) {
        if (context instanceof Activity) {
            return true;
        }
        if (context instanceof ContextWrapper) {
            return A01(((ContextWrapper) context).getBaseContext());
        }
        return false;
    }
}
