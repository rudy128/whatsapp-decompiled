package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final /* synthetic */ class AG3 implements ExpandableListView.OnChildClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        C169518lo r2;
        AnonymousClass8lb r1;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A00.A08.getValue();
        Object A06 = catalogCategoryGroupsViewModel.A00.A06();
        if (!(A06 instanceof C169518lo) || (r2 = (C169518lo) A06) == null) {
            return true;
        }
        Object obj = r2.A00.get(i);
        if (!(obj instanceof AnonymousClass8lb) || (r1 = (AnonymousClass8lb) obj) == null) {
            return true;
        }
        Object A0m = AnonymousClass8BV.A0m(r1.A00.A01, r2.A01);
        C18070vi.A0z(A0m, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.catalogcategory.view.adapter.CatalogCategoryListItem.ExpandableCategoryChildItem>");
        AnonymousClass8la r0 = (AnonymousClass8la) ((List) A0m).get(i2);
        C195139sr r22 = r0.A00;
        UserJid userJid = r0.A01;
        CatalogCategoryGroupsViewModel.A03(r22, catalogCategoryGroupsViewModel, userJid, 3, i2);
        CatalogCategoryGroupsViewModel.A00(r22, catalogCategoryGroupsViewModel, userJid, 3);
        return true;
    }

    public /* synthetic */ AG3(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }
}
