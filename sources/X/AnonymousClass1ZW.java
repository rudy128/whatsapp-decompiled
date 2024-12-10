package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;

/* renamed from: X.1ZW  reason: invalid class name */
public abstract class AnonymousClass1ZW {
    public static final Rect A00(Context context) {
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        C18070vi.A0X(bounds);
        return bounds;
    }

    public static final AnonymousClass1HO A01(Context context) {
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        C18070vi.A0X(windowInsets);
        return new AnonymousClass1HO(windowInsets);
    }

    public static final C28211Zi A02(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        WindowInsets windowInsets = windowManager.getCurrentWindowMetrics().getWindowInsets();
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(windowInsets);
        AnonymousClass1HO r2 = new AnonymousClass1HO(windowInsets);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        C18070vi.A0X(bounds);
        return new C28211Zi(r2, new AnonymousClass1Zh(bounds));
    }
}
