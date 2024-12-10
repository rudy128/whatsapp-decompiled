package X;

import android.view.WindowManager;

/* renamed from: X.2oF  reason: invalid class name and case insensitive filesystem */
public abstract class C60572oF {
    public static final int A00(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds().height();
    }

    public static final int A01(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds().width();
    }
}
