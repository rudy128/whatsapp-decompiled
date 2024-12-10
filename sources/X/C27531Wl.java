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

/* renamed from: X.1Wl  reason: invalid class name and case insensitive filesystem */
public final class C27531Wl implements Window.Callback {
    public final Window.Callback A00;
    public final C27521Wk A01;
    public final C27501Wi A02;

    public C27531Wl(Window.Callback callback, C27521Wk r3, C27501Wi r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(callback, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A00.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        C27521Wk r3 = this.A01;
        r3.A05.execute(new AnonymousClass7RC(r3, 17));
        return this.A00.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r3 = r6.A01;
        r3.A05.execute(new X.AnonymousClass7RC(r3, 17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 != 1) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        return r6.A00.dispatchTouchEvent(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r5 != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            int r5 = r7.getAction()
            r4 = 1
            if (r5 == 0) goto L_0x0019
            if (r5 == r4) goto L_0x0019
            r0 = 3
            if (r5 == r0) goto L_0x0019
        L_0x0010:
            if (r5 == r4) goto L_0x002a
        L_0x0012:
            android.view.Window$Callback r0 = r6.A00
            boolean r0 = r0.dispatchTouchEvent(r7)
            return r0
        L_0x0019:
            X.1Wi r3 = r6.A02
            X.10s r2 = r3.A09
            r1 = 44
            X.7RM r0 = new X.7RM
            r0.<init>((java.lang.Object) r3, (int) r5, (int) r1)
            r2.execute(r0)
            if (r5 == 0) goto L_0x002a
            goto L_0x0010
        L_0x002a:
            X.1Wk r3 = r6.A01
            X.10s r2 = r3.A05
            r1 = 17
            X.7RC r0 = new X.7RC
            r0.<init>(r3, r1)
            r2.execute(r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27531Wl.dispatchTouchEvent(android.view.MotionEvent):boolean");
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

    public void onContentChanged() {
        this.A00.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        C18070vi.A0d(menu, 1);
        return this.A00.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.A00.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.A00.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C18070vi.A0d(menuItem, 1);
        return this.A00.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        C18070vi.A0d(menu, 1);
        return this.A00.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        C18070vi.A0d(menu, 1);
        this.A00.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        C18070vi.A0d(menu, 2);
        return this.A00.onPreparePanel(i, view, menu);
    }

    public boolean onSearchRequested() {
        return this.A00.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.A00.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A00.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A00.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.A00.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.A00.onWindowStartingActionMode(callback, i);
    }
}
