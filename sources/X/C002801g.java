package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.01g  reason: invalid class name and case insensitive filesystem */
public abstract class C002801g {
    public static Method A00;
    public static final boolean A01;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        }
        A01 = z;
        try {
            Class<Rect> cls = Rect.class;
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            A00 = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                A00.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
}
