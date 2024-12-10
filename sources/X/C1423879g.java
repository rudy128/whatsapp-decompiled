package X;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.79g  reason: invalid class name and case insensitive filesystem */
public final class C1423879g implements AnonymousClass02H {
    public MenuItem A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r5) {
        if (AnonymousClass3MY.A01(menuItem, 1) != 2131432625) {
            return false;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0a;
        if (!AnonymousClass000.A1a(list)) {
            return false;
        }
        DocumentPickerActivity.A15(documentPickerActivity, list);
        return false;
    }

    public boolean BqR(Menu menu, AnonymousClass02B r6) {
        C18070vi.A0d(menu, 1);
        MenuItem add = menu.add(0, 2131432625, 0, 2131899381);
        this.A00 = add;
        if (add != null) {
            add.setShowAsAction(2);
        }
        return true;
    }

    public boolean C1U(Menu menu, AnonymousClass02B r9) {
        C18070vi.A0d(r9, 0);
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0a;
        if (list.isEmpty()) {
            r9.A08(2131895609);
        } else {
            Resources resources = documentPickerActivity.getResources();
            int size = list.size();
            Object[] objArr = new Object[1];
            C108985cd.A1S(list, objArr, 0);
            r9.A0B(resources.getQuantityString(2131755264, size, objArr));
        }
        MenuItem menuItem = this.A00;
        if (menuItem != null) {
            menuItem.setVisible(AnonymousClass000.A1a(list));
        }
        return true;
    }

    public C1423879g(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public void BrJ(AnonymousClass02B r4) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0a.clear();
        documentPickerActivity.A04 = null;
        C110275fD r0 = documentPickerActivity.A0G;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        } else {
            r0.notifyDataSetChanged();
        }
    }
}
