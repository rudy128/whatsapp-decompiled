package X;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.036  reason: invalid class name */
public class AnonymousClass036 implements AnonymousClass035 {
    public final /* synthetic */ Toolbar A00;

    public AnonymousClass036(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar toolbar = this.A00;
        if (toolbar.A0d.A07(menuItem)) {
            return true;
        }
        AnonymousClass03O r0 = toolbar.A0C;
        if (r0 != null) {
            return r0.onMenuItemClick(menuItem);
        }
        return false;
    }
}
