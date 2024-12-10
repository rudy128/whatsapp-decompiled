package X;

import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* renamed from: X.2v8  reason: invalid class name and case insensitive filesystem */
public class C64662v8 implements MenuItem.OnMenuItemClickListener {
    public WeakReference A00;

    public boolean onMenuItemClick(MenuItem menuItem) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() == null || menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        AnonymousClass4aY r0 = ((C78843tk) weakReference.get()).A04;
        if (itemId == 7) {
            r0.A3J();
            return true;
        }
        for (C108185bH Bze : r0.A7q) {
            if (Bze.Bze(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
