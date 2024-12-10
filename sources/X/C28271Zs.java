package X;

import android.graphics.Color;
import android.view.Window;

/* renamed from: X.1Zs  reason: invalid class name and case insensitive filesystem */
public abstract class C28271Zs {
    public static final void A00(Window window, int i, boolean z) {
        C18070vi.A0d(window, 0);
        if (AnonymousClass112.A01() || Color.alpha(i) != 255 || !AnonymousClass1YL.A02(i)) {
            window.setStatusBarColor(i);
            if (z && Color.alpha(i) == 255) {
                C28281Zt.A0A(window, AnonymousClass1YL.A02(i));
                return;
            }
            return;
        }
        window.setStatusBarColor(-16777216);
    }
}
