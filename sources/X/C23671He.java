package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.1He  reason: invalid class name and case insensitive filesystem */
public final class C23671He {
    public static final Context A00(Context context) {
        C18070vi.A0d(context, 0);
        Object systemService = context.getSystemService("display");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display == null) {
            return context;
        }
        Context createDisplayContext = context.createDisplayContext(display);
        C18070vi.A0X(createDisplayContext);
        return createDisplayContext;
    }

    public final boolean A01(Context context) {
        if (A00(context).getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }
}
