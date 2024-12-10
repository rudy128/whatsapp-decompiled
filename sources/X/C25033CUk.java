package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.CUk  reason: case insensitive filesystem */
public final class C25033CUk {
    public final C25791Cm3 A00(Context context, WindowManager windowManager) {
        int i;
        int i2;
        C18070vi.A0h(context, windowManager);
        if (AnonymousClass112.A07()) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            C18070vi.A0X(bounds);
            i = bounds.width();
            if (i % 2 != 0) {
                i--;
            }
            i2 = bounds.height();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i3 = point.x;
            if (i3 % 2 != 0) {
                i3--;
            }
            i2 = point.y;
        }
        if (i2 % 2 != 0) {
            i2--;
        }
        return new C25791Cm3(i, i2, C108965cb.A08(context).densityDpi);
    }
}
