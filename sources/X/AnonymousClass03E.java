package X;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.03E  reason: invalid class name */
public class AnonymousClass03E implements AnonymousClass01U {
    public final /* synthetic */ Toolbar A00;

    public AnonymousClass03E(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public boolean ByE(MenuItem menuItem, C003301m r4) {
        AnonymousClass01U r0 = this.A00.A09;
        if (r0 == null || !r0.ByE(menuItem, r4)) {
            return false;
        }
        return true;
    }

    public void ByF(C003301m r3) {
        Toolbar toolbar = this.A00;
        if (!toolbar.A0A.A0J()) {
            toolbar.A0d.A01(r3);
        }
        AnonymousClass01U r0 = toolbar.A09;
        if (r0 != null) {
            r0.ByF(r3);
        }
    }
}
