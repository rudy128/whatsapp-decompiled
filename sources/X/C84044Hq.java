package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* renamed from: X.4Hq  reason: invalid class name and case insensitive filesystem */
public abstract class C84044Hq {
    public static final void A00(Context context, Menu menu) {
        C137526vb.A01(menu, true);
        Iterator A00 = C99434so.A00(menu, 0);
        while (A00.hasNext()) {
            MenuItem menuItem = (MenuItem) A00.next();
            Drawable icon = menuItem.getIcon();
            if (icon != null) {
                menuItem.setIcon(AnonymousClass4aX.A06(context, AnonymousClass4aX.A05(context, icon, 2131100148), false));
            }
        }
    }
}
