package X;

import android.view.MenuItem;

/* renamed from: X.79o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1424679o implements C15930rR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C111825kU A01;
    public final /* synthetic */ AnonymousClass77V A02;
    public final /* synthetic */ C1418377d A03;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C111825kU r7 = this.A01;
        AnonymousClass77V r6 = this.A02;
        int i = this.A00;
        C1418377d r4 = this.A03;
        if (menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (Integer.valueOf(itemId) == null) {
            return false;
        }
        if (itemId == 2131431046) {
            r7.A0C.invoke(r6, Integer.valueOf(i), r4);
            return true;
        } else if (itemId == 2131431040) {
            r7.A0B.invoke(r6, r4);
            return true;
        } else if (itemId != 2131431042) {
            return false;
        } else {
            r7.A0A.invoke(r6);
            return true;
        }
    }

    public /* synthetic */ C1424679o(C111825kU r1, AnonymousClass77V r2, C1418377d r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }
}
