package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: X.01b  reason: invalid class name and case insensitive filesystem */
public class C002301b extends C002201a {
    public AnonymousClass02G A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ AnonymousClass01V A04;

    /* JADX INFO: finally extract failed */
    public void A00(Window.Callback callback) {
        try {
            this.A03 = true;
            callback.onContentChanged();
            this.A03 = false;
        } catch (Throwable th) {
            this.A03 = false;
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C002301b(Window.Callback callback, AnonymousClass01V r2) {
        super(callback);
        this.A04 = r2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A01) {
            return this.A00.dispatchKeyEvent(keyEvent);
        }
        if (this.A04.A10(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void onContentChanged() {
        if (this.A03) {
            this.A00.onContentChanged();
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C003301m)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public View onCreatePanelView(int i) {
        AnonymousClass02G r0 = this.A00;
        if (r0 != null) {
            AnonymousClass03m r02 = (AnonymousClass03m) r0;
            if (i == 0) {
                return new View(r02.A00.A06.getContext());
            }
        }
        return super.onCreatePanelView(i);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (this.A02) {
            this.A00.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        AnonymousClass01V r3 = this.A04;
        if (i == 108) {
            AnonymousClass01V.A0P(r3);
            C003401n r0 = r3.A09;
            if (r0 != null) {
                r0.A0U(false);
            }
        } else if (i == 0) {
            C003201l A0m = r3.A0m(i);
            if (A0m.A0C) {
                r3.A0w(A0m, false);
            }
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        C003301m r4;
        if (menu instanceof C003301m) {
            r4 = (C003301m) menu;
        } else {
            r4 = null;
        }
        if (i == 0 && r4 == null) {
            return false;
        }
        if (r4 != null) {
            r4.A0Z(true);
        }
        AnonymousClass02G r0 = this.A00;
        if (r0 != null) {
            AnonymousClass03m r02 = (AnonymousClass03m) r0;
            if (i == 0) {
                AnonymousClass022 r2 = r02.A00;
                if (!r2.A01) {
                    ((AnonymousClass03K) r2.A06).A0C = true;
                    r2.A01 = true;
                }
            }
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (r4 != null) {
            r4.A0Z(false);
        }
        return onPreparePanel;
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C003301m r0 = this.A04.A0m(0).A0A;
        if (r0 != null) {
            super.onProvideKeyboardShortcuts(list, r0, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        AnonymousClass01V r2 = this.A04;
        AnonymousClass0S6 r1 = new AnonymousClass0S6(r2.A0k, callback);
        AnonymousClass02B A0X = r2.A0X(r1);
        if (A0X != null) {
            return r1.A01(A0X);
        }
        return null;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyShortcutEvent(keyEvent) || this.A04.A0z(keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        AnonymousClass01V r1 = this.A04;
        if (i != 108) {
            return true;
        }
        AnonymousClass01V.A0P(r1);
        C003401n r12 = r1.A09;
        if (r12 == null) {
            return true;
        }
        r12.A0U(true);
        return true;
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        AnonymousClass01V r2 = this.A04;
        AnonymousClass0S6 r1 = new AnonymousClass0S6(r2.A0k, callback);
        AnonymousClass02B A0X = r2.A0X(r1);
        if (A0X != null) {
            return r1.A01(A0X);
        }
        return null;
    }
}
