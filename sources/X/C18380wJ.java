package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0wJ  reason: invalid class name and case insensitive filesystem */
public abstract class C18380wJ {
    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C18390wK.A00(context);
        }
        return true;
    }
}
