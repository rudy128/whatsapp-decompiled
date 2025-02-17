package X;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: X.01a  reason: invalid class name and case insensitive filesystem */
public abstract class C002201a implements Window.Callback {
    public final Window.Callback A00;

    public abstract void onContentChanged();

    public abstract ActionMode onWindowStartingActionMode(ActionMode.Callback callback);

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A00.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A00.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.A00.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.A00.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.A00.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.A00.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.A00.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.A00.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.A00.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.A00.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.A00.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.A00.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        AnonymousClass0D7.A00(this.A00, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.A00.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        AnonymousClass0D6.A00(menu, this.A00, list, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C03720Kj.A01(searchEvent, this.A00);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A00.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A00.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C03720Kj.A00(callback, this.A00, i);
    }

    public C002201a(Window.Callback callback) {
        if (callback != null) {
            this.A00 = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean onSearchRequested() {
        return this.A00.onSearchRequested();
    }
}
