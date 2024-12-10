package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.6va  reason: invalid class name and case insensitive filesystem */
public abstract class C137516va {
    public static final Integer A00(AnonymousClass6RV r0) {
        int i;
        switch (r0.ordinal()) {
            case 0:
                i = 2131233182;
                break;
            case 1:
                i = 2131233200;
                break;
            case 2:
                i = 2131232065;
                break;
            case 3:
                i = 2131233369;
                break;
            case 4:
                i = 2131233370;
                break;
            case 5:
                i = 2131233243;
                break;
            case 6:
                i = 2131232294;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    public static final void A01(Menu menu, DOZ doz, C133986pp r9) {
        Integer A00;
        boolean A1J = C108975cc.A1J(menu);
        menu.clear();
        int i = 1;
        for (C133756pR r2 : r9.A03) {
            if (!r2.A03) {
                MenuItem add = menu.add(A1J ? 1 : 0, i, i, r2.A02);
                C18070vi.A0X(add);
                AnonymousClass6RV r0 = r2.A01;
                if (!(r0 == null || (A00 = A00(r0)) == null)) {
                    add.setIcon(A00.intValue());
                }
                add.setShowAsAction(1);
                add.setOnMenuItemClickListener(new C1420077u(doz, r2, 1));
                i++;
            }
        }
    }
}
