package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.2nV  reason: invalid class name and case insensitive filesystem */
public abstract class C60172nV {
    public C27731Xi A00;
    public final Context A01;

    public abstract View A00(MenuItem menuItem);

    public void A01() {
        this.A00 = null;
    }

    public abstract void A02(SubMenu subMenu);

    public abstract void A04(AnonymousClass3KZ r1);

    public abstract boolean A05();

    public abstract boolean A06();

    public abstract boolean A07();

    public abstract boolean A08();

    public C60172nV(Context context) {
        this.A01 = context;
    }

    public void A03(C27731Xi r1) {
        this.A00 = r1;
    }
}
