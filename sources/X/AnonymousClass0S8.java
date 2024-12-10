package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: X.0S8  reason: invalid class name */
public class AnonymousClass0S8 implements AnonymousClass01U {
    public final /* synthetic */ ActionMenuView A00;

    public AnonymousClass0S8(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    public boolean ByE(MenuItem menuItem, C003301m r4) {
        AnonymousClass035 r0 = this.A00.A03;
        if (r0 == null || !r0.onMenuItemClick(menuItem)) {
            return false;
        }
        return true;
    }

    public void ByF(C003301m r2) {
        AnonymousClass01U r0 = this.A00.A02;
        if (r0 != null) {
            r0.ByF(r2);
        }
    }
}
