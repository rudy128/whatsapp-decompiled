package X;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* renamed from: X.79x  reason: invalid class name and case insensitive filesystem */
public final class C1425579x implements AnonymousClass1GW {
    public Menu A00;
    public AnonymousClass1FG A01;
    public AnonymousClass1D6 A02;

    public void BqV(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0d(menu, 0);
        this.A00 = menu;
        AnonymousClass1D6 r0 = this.A02;
        if (r0 != null) {
            C133986pp r2 = (C133986pp) r0.first;
            DOZ doz = (DOZ) r0.second;
            C18070vi.A0d(r2, 0);
            Menu menu2 = this.A00;
            if (menu2 == null) {
                this.A02 = AnonymousClass1D6.A01(r2, doz);
            } else {
                C137516va.A01(menu2, doz, r2);
            }
        }
        this.A02 = null;
    }

    public /* synthetic */ void ByC(Menu menu) {
    }

    public boolean ByD(MenuItem menuItem) {
        return false;
    }

    public /* synthetic */ void C1X(Menu menu) {
    }
}
