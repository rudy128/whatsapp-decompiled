package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.6Y7  reason: invalid class name */
public abstract class AnonymousClass6Y7 {
    public static final void A00(DOZ doz, C1425579x r5, C133986pp r6, WDSToolbar wDSToolbar) {
        C27871Xy r0;
        Menu menu;
        Integer A00;
        wDSToolbar.setTitle((CharSequence) r6.A02);
        wDSToolbar.setVisibility(C72453Mb.A01(r6.A05 ? 1 : 0));
        if (r6.A04) {
            r0 = C27871Xy.GONE;
        } else {
            r0 = C27871Xy.VISIBLE;
        }
        wDSToolbar.setDividerVisibility(r0);
        wDSToolbar.setSubtitle((CharSequence) r6.A01);
        if (r5 != null) {
            menu = r5.A00;
            if (menu == null) {
                r5.A02 = AnonymousClass1D6.A01(r6, doz);
            }
            C137516va.A01(menu, doz, r6);
        } else {
            menu = wDSToolbar.getMenu();
            C137516va.A01(menu, doz, r6);
        }
        C133756pR r3 = r6.A00;
        if (r3 == null) {
            return;
        }
        if (r3.A03) {
            wDSToolbar.setNavigationIcon((Drawable) null);
            return;
        }
        AnonymousClass6RV r02 = r3.A01;
        Context A04 = AnonymousClass3MY.A04(wDSToolbar);
        Drawable drawable = null;
        if (!(r02 == null || (A00 = C137516va.A00(r02)) == null)) {
            drawable = C24261Jm.A00(A04, A00.intValue());
        }
        wDSToolbar.setNavigationIcon(drawable);
        wDSToolbar.setNavigationOnClickListener(new AnonymousClass78M(r3, doz, 30));
    }
}
