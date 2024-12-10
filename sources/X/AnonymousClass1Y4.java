package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.1Y4  reason: invalid class name */
public abstract class AnonymousClass1Y4 {
    public static final void A00(ColorStateList colorStateList, Menu menu, C27881Xz r10, int i) {
        AnonymousClass03G r0;
        View actionView;
        AnonymousClass1JQ r7;
        ColorStateList A00;
        C18070vi.A0d(menu, 0);
        C18070vi.A0d(colorStateList, 2);
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menu.getItem(i2);
            Drawable icon = item.getIcon();
            if (icon != null && (!(icon instanceof InsetDrawable) || ((InsetDrawable) icon).getDrawable() != null)) {
                C27831Xu.A09(icon);
            }
            if ((item instanceof AnonymousClass03G) && (r0 = (AnonymousClass03G) item) != null && r0.A0D()) {
                if (((AnonymousClass03G) item).isEnabled() && ((A00 = A3C.A00(item)) == null || A00.getDefaultColor() != colorStateList.getDefaultColor())) {
                    A3C.A01(colorStateList, item);
                }
                View actionView2 = item.getActionView();
                if (actionView2 != null && ((actionView = item.getActionView()) == null || !C18070vi.A18(actionView.getTag(2131435472), true))) {
                    View actionView3 = item.getActionView();
                    if (actionView3 != null) {
                        actionView3.setTag(2131435472, true);
                    }
                    if (actionView2 instanceof ViewGroup) {
                        r7 = new C99434so(actionView2, 2);
                    } else {
                        r7 = C71133Dx.A00;
                    }
                    C99434so r5 = new C99434so(new AnonymousClass1JQ[]{new C99434so(new View[]{actionView2}, 3), r7}, 3);
                    for (View view : AnonymousClass1b2.A06(new C147167Sb(AnonymousClass3J3.A00, AnonymousClass3J2.A00, r5))) {
                        if (view instanceof WDSButton) {
                            if (r10 != null) {
                                ((WDSButton) view).setVariant(r10);
                            }
                        } else if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(colorStateList);
                        } else if (view instanceof TextView) {
                            ((TextView) view).setTextColor(i);
                        }
                    }
                }
            }
        }
    }
}
