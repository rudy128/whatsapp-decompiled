package X;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.4Hp  reason: invalid class name and case insensitive filesystem */
public abstract class C84034Hp {
    public static final Long A00(WindowManager windowManager, C18030ve r3) {
        C18070vi.A0h(r3, windowManager);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        long max = (long) (((float) (Math.max(C18020vd.A00(C18040vf.A02, r3, 4538), 921600) * 4)) * displayMetrics.density);
        C17900vP.A0m("MediaBitmapUtils/maxPixelsAllowed = ", AnonymousClass000.A10(), max);
        return Long.valueOf(max);
    }
}
