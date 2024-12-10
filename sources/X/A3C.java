package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.MenuItem;

public abstract class A3C {
    public static ColorStateList A00(MenuItem menuItem) {
        if (menuItem instanceof C27721Xh) {
            return ((C27721Xh) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C20116A7z.A00(menuItem);
        }
        return null;
    }

    public static void A01(ColorStateList colorStateList, MenuItem menuItem) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C20116A7z.A01(colorStateList, menuItem);
        }
    }

    public static void A02(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).CIU(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C20116A7z.A05(menuItem, charSequence);
        }
    }
}
