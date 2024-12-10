package X;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: X.0Kj  reason: invalid class name and case insensitive filesystem */
public abstract class C03720Kj {
    public static ActionMode A00(ActionMode.Callback callback, Window.Callback callback2, int i) {
        return callback2.onWindowStartingActionMode(callback, i);
    }

    public static boolean A01(SearchEvent searchEvent, Window.Callback callback) {
        return callback.onSearchRequested(searchEvent);
    }
}
