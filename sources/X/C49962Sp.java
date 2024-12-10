package X;

import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowMetrics;

/* renamed from: X.2Sp  reason: invalid class name and case insensitive filesystem */
public abstract class C49962Sp {
    public static final int A00(AnonymousClass1FL r4) {
        int i;
        if (AnonymousClass112.A07()) {
            WindowMetrics currentWindowMetrics = r4.getWindowManager().getCurrentWindowMetrics();
            C18070vi.A0X(currentWindowMetrics);
            int height = currentWindowMetrics.getBounds().height();
            WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
            C18070vi.A0X(windowInsets);
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            C18070vi.A0X(insetsIgnoringVisibility);
            i = height - (insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom);
        } else {
            Point point = new Point();
            C19740yt.A05(r4).getSize(point);
            i = point.y;
        }
        Rect rect = new Rect();
        r4.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return i - rect.top;
    }
}
