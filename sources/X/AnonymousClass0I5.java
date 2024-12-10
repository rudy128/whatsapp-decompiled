package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.0I5  reason: invalid class name */
public abstract class AnonymousClass0I5 {
    public AnonymousClass00O A00;
    public final Context A01;

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof C27721Xh)) {
            return menuItem;
        }
        C27721Xh r3 = (C27721Xh) menuItem;
        AnonymousClass00O r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass00O(0);
            this.A00 = r1;
        }
        MenuItem menuItem2 = (MenuItem) r1.get(r3);
        if (menuItem2 != null) {
            return menuItem2;
        }
        AnonymousClass067 r12 = new AnonymousClass067(this.A01, r3);
        this.A00.put(r3, r12);
        return r12;
    }

    public AnonymousClass0I5(Context context) {
        this.A01 = context;
    }
}
