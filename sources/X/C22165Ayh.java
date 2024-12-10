package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import java.util.List;

/* renamed from: X.Ayh  reason: case insensitive filesystem */
public final class C22165Ayh extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22165Ayh(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(1);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        C18070vi.A0b(list);
        AnonymousClass8HR r0 = catalogAllCategoryFragment.A03;
        if (r0 == null) {
            C18070vi.A11("categoryListAdapter");
            throw null;
        }
        r0.A0W(list);
        return C27621Wu.A00;
    }
}
