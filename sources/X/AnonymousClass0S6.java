package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.0S6  reason: invalid class name */
public class AnonymousClass0S6 implements AnonymousClass02H {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final AnonymousClass00O A02 = new AnonymousClass00O(0);
    public final ArrayList A03 = AnonymousClass000.A13();

    private Menu A00(Menu menu) {
        AnonymousClass00O r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        AnonymousClass066 r2 = new AnonymousClass066(this.A00, (AnonymousClass1HG) menu);
        r3.put(menu, r2);
        return r2;
    }

    public AnonymousClass055 A01(AnonymousClass02B r6) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass055 r1 = (AnonymousClass055) arrayList.get(i);
            if (r1 != null && r1.A01 == r6) {
                return r1;
            }
        }
        AnonymousClass055 r0 = new AnonymousClass055(this.A00, r6);
        arrayList.add(r0);
        return r0;
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r6) {
        return this.A01.onActionItemClicked(A01(r6), new AnonymousClass067(this.A00, (C27721Xh) menuItem));
    }

    public boolean BqR(Menu menu, AnonymousClass02B r5) {
        return this.A01.onCreateActionMode(A01(r5), A00(menu));
    }

    public void BrJ(AnonymousClass02B r3) {
        this.A01.onDestroyActionMode(A01(r3));
    }

    public boolean C1U(Menu menu, AnonymousClass02B r5) {
        return this.A01.onPrepareActionMode(A01(r5), A00(menu));
    }

    public AnonymousClass0S6(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }
}
