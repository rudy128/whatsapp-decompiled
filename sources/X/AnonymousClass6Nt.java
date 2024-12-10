package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.6Nt  reason: invalid class name */
public final class AnonymousClass6Nt extends C115085tN {
    public MenuItem A00;
    public List A01;
    public final AnonymousClass89U A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Nt(C18000vb r2, AnonymousClass89U r3) {
        super(r2);
        C18070vi.A0d(r2, 2);
        this.A02 = r3;
    }

    public void BqX(Menu menu) {
        Drawable drawable;
        MenuItem menuItem;
        C18070vi.A0d(menu, 0);
        MenuItem add = menu.add(0, 56, 0, "");
        C18070vi.A0X(add);
        add.setShowAsAction(0);
        add.setTitle(2131896111);
        AnonymousClass89U r1 = this.A02;
        Context A0F = C108945cZ.A0F(r1.Bbg().A04);
        if (A0F != null) {
            drawable = AnonymousClass4aX.A04(C108945cZ.A0F(r1.Bbg().A04), A0F.getApplicationContext(), 2130970605, 2131101967, 2131233368);
        } else {
            drawable = null;
        }
        add.setIcon(drawable);
        add.setVisible(false);
        this.A00 = add;
        List list = this.A01;
        if (list != null && !list.isEmpty() && (menuItem = this.A00) != null) {
            menuItem.setVisible(true);
        }
    }

    public boolean Bze(MenuItem menuItem) {
        List list;
        AnonymousClass86W r0;
        DFL BM2;
        E8A A0A;
        C18070vi.A0d(menuItem, 0);
        List list2 = this.A01;
        if (!(list2 == null || list2.isEmpty() || menuItem.getItemId() != 56 || (list = this.A01) == null || (r0 = (AnonymousClass86W) list.get(0)) == null || (BM2 = r0.BM2()) == null || (A0A = BM2.A0A(35)) == null)) {
            C26209Cul.A05(C199029zJ.A01, A0A, this.A02.Bbg());
        }
        return false;
    }
}
