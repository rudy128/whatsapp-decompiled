package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.6VM  reason: invalid class name */
public abstract class AnonymousClass6VM {
    public static void A00(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass6VL.A00(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & -1793;
        } else {
            i = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i);
    }
}
