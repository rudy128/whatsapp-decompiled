package X;

import android.os.Bundle;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.AuQ  reason: case insensitive filesystem */
public final class C21900AuQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21900AuQ(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Jid jid = (Jid) this.this$0.A0L.getValue();
        Bundle A0J = C72463Mc.A0J(jid);
        A0J.putParcelable("category_biz_id", jid);
        A0J.putInt("business_product_list_entry_point", 3);
        CatalogSearchProductListFragment catalogSearchProductListFragment = new CatalogSearchProductListFragment();
        catalogSearchProductListFragment.A1R(A0J);
        return catalogSearchProductListFragment;
    }
}
