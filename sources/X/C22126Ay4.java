package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Ay4  reason: case insensitive filesystem */
public final class C22126Ay4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ProductListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22126Ay4(ProductListActivity productListActivity) {
        super(1);
        this.this$0 = productListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        ProductListActivity productListActivity = this.this$0;
        AnonymousClass8F7 r1 = productListActivity.A0A;
        String str = "cartMenuViewModel";
        if (r1 != null) {
            productListActivity.A0N = r1.A0T(productListActivity.A00, list);
            AnonymousClass8F7 r12 = productListActivity.A0A;
            if (r12 != null) {
                AnonymousClass8I0 r0 = productListActivity.A0E;
                str = "productSectionsListAdapter";
                if (r0 != null) {
                    HashSet A0U = r12.A0U(r0.A04, list);
                    AnonymousClass8I0 r02 = productListActivity.A0E;
                    if (r02 != null) {
                        List list2 = r02.A04;
                        list2.clear();
                        list2.addAll(list);
                        AnonymousClass8I0 r5 = productListActivity.A0E;
                        if (r5 != null) {
                            C18070vi.A0b(A0U);
                            List list3 = r5.A05;
                            int size = list3.size();
                            for (int i = 0; i < size; i++) {
                                B7D b7d = (B7D) list3.get(i);
                                if ((b7d instanceof ANM) && A0U.contains(((ANM) b7d).A00.A0H)) {
                                    r5.A0G(i);
                                }
                            }
                            productListActivity.invalidateOptionsMenu();
                            productListActivity.A0O = AnonymousClass000.A1P(list.size());
                            ProductListActivity.A0Q(productListActivity);
                            ProductListActivity.A03(productListActivity);
                            return C27621Wu.A00;
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
