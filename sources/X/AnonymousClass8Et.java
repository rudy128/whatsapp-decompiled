package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8Et  reason: invalid class name */
public final class AnonymousClass8Et extends AnonymousClass292 {
    public List A00;

    public /* bridge */ /* synthetic */ CharSequence A0C(int i) {
        List list = this.A00;
        if (list != null) {
            return ((C194889sS) list.get(i)).A02;
        }
        C18070vi.A11("tabItemsList");
        throw null;
    }

    public int A0E() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        C18070vi.A11("tabItemsList");
        throw null;
    }

    public Fragment A0I(int i) {
        List list = this.A00;
        if (list == null) {
            C18070vi.A11("tabItemsList");
            throw null;
        }
        C194889sS r1 = (C194889sS) list.get(i);
        if (r1.A03) {
            UserJid userJid = r1.A00;
            String str = r1.A01;
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("category_biz_id", userJid);
            A0D.putString("collection-id", str);
            A0D.putString("collection-index", (String) null);
            A0D.putInt("business_product_list_entry_point", 2);
            A0D.putInt("category_browsing_entry_point", 3);
            A0D.putInt("category_level", 1);
            CollectionProductListFragment collectionProductListFragment = new CollectionProductListFragment();
            collectionProductListFragment.A1R(A0D);
            return collectionProductListFragment;
        }
        String str2 = r1.A01;
        UserJid userJid2 = r1.A00;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("parent_category_id", str2);
        A0D2.putParcelable("category_biz_id", userJid2);
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = new CatalogCategoryExpandableGroupsListFragment();
        catalogCategoryExpandableGroupsListFragment.A1R(A0D2);
        return catalogCategoryExpandableGroupsListFragment;
    }
}
