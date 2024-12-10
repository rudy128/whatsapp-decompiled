package X;

import android.content.res.ColorStateList;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.2vO  reason: invalid class name and case insensitive filesystem */
public final class C64822vO implements AnonymousClass02H {
    public final int A00;
    public final ColorStateList A01;
    public final AnonymousClass02H A02;

    public C64822vO(AnonymousClass02H r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
        this.A00 = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C18070vi.A0X(valueOf);
        this.A01 = valueOf;
    }

    public void BrJ(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        this.A02.BrJ(r2);
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r3) {
        C18070vi.A0h(r3, menuItem);
        return this.A02.Bks(menuItem, r3);
    }

    public boolean BqR(Menu menu, AnonymousClass02B r6) {
        C18070vi.A0h(r6, menu);
        boolean BqR = this.A02.BqR(menu, r6);
        AnonymousClass1Y4.A00(this.A01, menu, (C27881Xz) null, this.A00);
        return BqR;
    }

    public boolean C1U(Menu menu, AnonymousClass02B r6) {
        C18070vi.A0h(r6, menu);
        boolean C1U = this.A02.C1U(menu, r6);
        AnonymousClass1Y4.A00(this.A01, menu, (C27881Xz) null, this.A00);
        return C1U;
    }
}
