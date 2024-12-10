package X;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;

/* renamed from: X.0S7  reason: invalid class name */
public final class AnonymousClass0S7 implements AnonymousClass01U {
    public final /* synthetic */ AnonymousClass022 A00;

    public boolean ByE(MenuItem menuItem, C003301m r3) {
        return false;
    }

    public AnonymousClass0S7(AnonymousClass022 r1) {
        this.A00 = r1;
    }

    public void ByF(C003301m r5) {
        AnonymousClass022 r1 = this.A00;
        boolean Bfj = r1.A06.Bfj();
        Window.Callback callback = r1.A04;
        if (Bfj) {
            callback.onPanelClosed(AnonymousClass74N.A03, r5);
        } else if (callback.onPreparePanel(0, (View) null, r5)) {
            callback.onMenuOpened(AnonymousClass74N.A03, r5);
        }
    }
}
