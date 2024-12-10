package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.0RS  reason: invalid class name */
public final class AnonymousClass0RS implements ActionMode.Callback {
    public final AnonymousClass0PX A00;

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.A00.A08(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.A00.A07(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.A00.A01();
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        AnonymousClass0PX r0 = this.A00;
        if (actionMode == null || menu == null) {
            return false;
        }
        r0.A02(menu);
        return true;
    }

    public AnonymousClass0RS(AnonymousClass0PX r1) {
        this.A00 = r1;
    }
}
