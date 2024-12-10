package X;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.054  reason: invalid class name */
public final class AnonymousClass054 extends ActionMode.Callback2 {
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

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        AnonymousClass0NU r4 = this.A00.A00;
        if (rect != null) {
            rect.set((int) r4.A01, (int) r4.A03, (int) r4.A02, (int) r4.A00);
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        AnonymousClass0PX r0 = this.A00;
        if (actionMode == null || menu == null) {
            return false;
        }
        r0.A02(menu);
        return true;
    }

    public AnonymousClass054(AnonymousClass0PX r1) {
        this.A00 = r1;
    }
}
