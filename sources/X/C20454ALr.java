package X;

import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.ALr  reason: case insensitive filesystem */
public class C20454ALr implements E6R {
    public final int A00;
    public final Object A01;

    public C20454ALr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean C6x() {
        if (this.A00 != 0) {
            C111295jU r1 = ((SearchFragment) this.A01).A0b;
            if (r1.A02 == null || r1.A0Z() == null) {
                return true;
            }
            C20135A8w a8w = r1.A02;
            APP app = AnonymousClass8BT.A0F(a8w).A04;
            C196069uP r0 = app.A02;
            C20079A6f a6f = r0.A00;
            if (r0.A03() && a6f != null && !a6f.A05() && !app.A00) {
                return true;
            }
            C20135A8w.A03(a8w);
            AnonymousClass8BT.A0G(a8w).A05(a8w.A0A());
            return true;
        }
        CatalogListActivity.A0d((CatalogListActivity) this.A01, true);
        return true;
    }
}
