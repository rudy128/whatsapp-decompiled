package X;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6Uu  reason: invalid class name and case insensitive filesystem */
public abstract class C123526Uu {
    public static boolean A00(Activity activity, String str) {
        try {
            PackageManager packageManager = activity.getApplication().getPackageManager();
            return AnonymousClass000.A1Y(PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str}));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
