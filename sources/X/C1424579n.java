package X;

import android.view.MenuItem;

/* renamed from: X.79n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1424579n implements C15930rR {
    public final /* synthetic */ C38471rL A00;
    public final /* synthetic */ C38471rL A01;
    public final /* synthetic */ C38471rL A02;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C38471rL r5 = this.A00;
        C38471rL r4 = this.A01;
        C38471rL r3 = this.A02;
        boolean A16 = C18070vi.A16(r5, r4);
        C18070vi.A0k(r3, menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 2131432582) {
            r5.onClick(menuItem.getActionView());
        } else if (itemId == 2131432588) {
            r4.onClick(menuItem.getActionView());
            return A16;
        } else if (itemId == 2131432627) {
            r3.onClick(menuItem.getActionView());
            return A16;
        }
        return A16;
    }

    public /* synthetic */ C1424579n(C38471rL r1, C38471rL r2, C38471rL r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
