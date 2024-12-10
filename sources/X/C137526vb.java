package X;

import android.view.Menu;

/* renamed from: X.6vb  reason: invalid class name and case insensitive filesystem */
public abstract class C137526vb {
    public static final void A00(Menu menu) {
        C18070vi.A0d(menu, 0);
        if ((menu instanceof C003301m) && C22891Dp.A05) {
            ((C003301m) menu).A06 = true;
        }
    }

    public static final void A01(Menu menu, boolean z) {
        if (menu instanceof C003301m) {
            ((C003301m) menu).A06 = z;
        }
    }
}
