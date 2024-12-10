package X;

import android.view.MenuItem;

/* renamed from: X.0RW  reason: invalid class name */
public class AnonymousClass0RW implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ AnonymousClass067 A01;

    public AnonymousClass0RW(MenuItem.OnMenuItemClickListener onMenuItemClickListener, AnonymousClass067 r2) {
        this.A01 = r2;
        this.A00 = onMenuItemClickListener;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
