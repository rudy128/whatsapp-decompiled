package X;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;

/* renamed from: X.2SY  reason: invalid class name */
public abstract class AnonymousClass2SY {
    public static void A00(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
        } else if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }
}
