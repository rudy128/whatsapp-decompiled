package X;

import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.1Zr  reason: invalid class name and case insensitive filesystem */
public abstract class C28261Zr {
    public static final void A00(Window window, Toolbar toolbar) {
        Integer num;
        C18070vi.A0d(toolbar, 0);
        C18070vi.A0d(window, 1);
        if ((toolbar instanceof WDSToolbar) && (num = ((WDSToolbar) toolbar).A08.A02) != null) {
            C28271Zs.A00(window, num.intValue(), true);
        }
    }

    public static final void A01(Toolbar toolbar, C27871Xy r2) {
        WDSToolbar wDSToolbar;
        C18070vi.A0d(toolbar, 0);
        C18070vi.A0d(r2, 1);
        if ((toolbar instanceof WDSToolbar) && (wDSToolbar = (WDSToolbar) toolbar) != null) {
            wDSToolbar.setDividerVisibility(r2);
        }
    }
}
