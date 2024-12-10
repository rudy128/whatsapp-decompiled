package X;

import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

public final /* synthetic */ class AG5 implements ExpandableListView.OnGroupCollapseListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public final void onGroupCollapse(int i) {
        this.A00.A00 = -1;
    }

    public /* synthetic */ AG5(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }
}
