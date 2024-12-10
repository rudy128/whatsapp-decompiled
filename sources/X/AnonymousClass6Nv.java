package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.6Nv  reason: invalid class name */
public class AnonymousClass6Nv extends C115085tN {
    public C126766dG A00;
    public MenuItem A01;
    public MenuItem A02;
    public final AnonymousClass89U A03;

    public static void A00(AnonymousClass6Nv r4) {
        MenuItem menuItem;
        MenuItem menuItem2;
        C126766dG r0 = r4.A00;
        if (r0 != null) {
            if (r0.A00.A0I(41, false) && (menuItem2 = r4.A01) != null) {
                menuItem2.setVisible(true);
            }
            if (r4.A00.A00.A0I(44, false) && (menuItem = r4.A02) != null) {
                menuItem.setVisible(true);
            }
        }
    }

    public void BqX(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem add = menu.add(0, 55, 0, "cart");
        C18070vi.A0X(add);
        this.A01 = add;
        add.setShowAsAction(1);
        this.A01.setIcon(2131231647);
        this.A01.setVisible(false);
        MenuItem add2 = menu.add(0, 56, 0, "more");
        C18070vi.A0X(add2);
        this.A02 = add2;
        add2.setShowAsAction(1);
        MenuItem menuItem = this.A02;
        AnonymousClass89U r1 = this.A03;
        menuItem.setIcon(AnonymousClass4aX.A04(C108945cZ.A0F(r1.Bbg().A04), C108945cZ.A0F(r1.Bbg().A04).getApplicationContext(), 2130970605, 2131101967, 2131233368));
        this.A02.setVisible(false);
        A00(this);
    }

    public AnonymousClass6Nv(C18000vb r1, AnonymousClass89U r2) {
        super(r1);
        this.A03 = r2;
    }

    public boolean Bze(MenuItem menuItem) {
        if (menuItem.getItemId() != 56) {
            return false;
        }
        C143147Ce r1 = new C143147Ce(this, 1);
        CXY Bbg = this.A03.Bbg();
        C26209Cul.A05(C199029zJ.A01, r1.BM2().A0A(35), Bbg);
        return false;
    }
}
