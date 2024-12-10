package X;

import android.view.MenuItem;

/* renamed from: X.0RV  reason: invalid class name */
public class AnonymousClass0RV implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ AnonymousClass067 A01;

    public AnonymousClass0RV(MenuItem.OnActionExpandListener onActionExpandListener, AnonymousClass067 r2) {
        this.A01 = r2;
        this.A00 = onActionExpandListener;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
