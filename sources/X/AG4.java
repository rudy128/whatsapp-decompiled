package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;

public final /* synthetic */ class AG4 implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        AnonymousClass8la r1;
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.A00;
        AnonymousClass8DF r0 = catalogCategoryExpandableGroupsListFragment.A04;
        if (r0 == null) {
            C18070vi.A11("expandableListAdapter");
        } else if (r0.getGroupType(i) == 3) {
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) catalogCategoryExpandableGroupsListFragment.A08.getValue();
            AnonymousClass9XC r02 = (AnonymousClass9XC) catalogCategoryGroupsViewModel.A00.A06();
            if (r02 != null) {
                Object obj = r02.A00.get(i);
                if ((obj instanceof AnonymousClass8la) && (r1 = (AnonymousClass8la) obj) != null) {
                    C195139sr r2 = r1.A00;
                    UserJid userJid = r1.A01;
                    CatalogCategoryGroupsViewModel.A03(r2, catalogCategoryGroupsViewModel, userJid, 2, i);
                    CatalogCategoryGroupsViewModel.A00(r2, catalogCategoryGroupsViewModel, userJid, 2);
                }
            }
            return true;
        } else {
            int i2 = catalogCategoryExpandableGroupsListFragment.A00;
            if (i2 != i) {
                if (i2 != -1) {
                    ExpandableListView expandableListView2 = catalogCategoryExpandableGroupsListFragment.A01;
                    if (expandableListView2 != null) {
                        expandableListView2.collapseGroup(i2);
                    }
                }
                C18100vl r12 = catalogCategoryExpandableGroupsListFragment.A08;
                if (C18070vi.A19(((CatalogCategoryGroupsViewModel) r12.getValue()).A02.A06(), true)) {
                    C73203Rj A03 = AnonymousClass4a6.A03(catalogCategoryExpandableGroupsListFragment);
                    A03.A0D(2131887972);
                    A03.A0g(catalogCategoryExpandableGroupsListFragment.A1G(), new C20335AGr(catalogCategoryExpandableGroupsListFragment, 37), 2131887971);
                    A03.A0C();
                    return true;
                }
                CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel2 = (CatalogCategoryGroupsViewModel) r12.getValue();
                AnonymousClass1DS r13 = catalogCategoryGroupsViewModel2.A00;
                if (r13.A06() instanceof C169518lo) {
                    Object A06 = r13.A06();
                    C18070vi.A0z(A06, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupListState.CategoryGroupsWithChildItems");
                    Object obj2 = ((C169518lo) A06).A00.get(i);
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.CatalogCategoryListItem.ExpandableCategoryParentItem");
                    AnonymousClass8lb r14 = (AnonymousClass8lb) obj2;
                    CatalogCategoryGroupsViewModel.A03(r14.A00, catalogCategoryGroupsViewModel2, r14.A01, 2, i);
                }
                ExpandableListView expandableListView3 = catalogCategoryExpandableGroupsListFragment.A01;
                if (expandableListView3 != null) {
                    expandableListView3.smoothScrollToPosition(i);
                    ExpandableListView expandableListView4 = catalogCategoryExpandableGroupsListFragment.A01;
                    if (expandableListView4 != null) {
                        expandableListView4.expandGroup(i);
                        return true;
                    }
                }
            } else {
                ExpandableListView expandableListView5 = catalogCategoryExpandableGroupsListFragment.A01;
                if (expandableListView5 != null) {
                    expandableListView5.collapseGroup(i);
                    return true;
                }
            }
            C18070vi.A11("expandableListView");
        }
        throw null;
    }

    public /* synthetic */ AG4(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }
}
