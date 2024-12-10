package X;

import android.view.MenuItem;

/* renamed from: X.0S9  reason: invalid class name */
public class AnonymousClass0S9 implements AnonymousClass01U {
    public final /* synthetic */ C03610Iy A00;

    public void ByF(C003301m r1) {
    }

    public AnonymousClass0S9(C03610Iy r1) {
        this.A00 = r1;
    }

    public boolean ByE(MenuItem menuItem, C003301m r3) {
        C15930rR r0 = this.A00.A01;
        if (r0 != null) {
            return r0.onMenuItemClick(menuItem);
        }
        return false;
    }
}
