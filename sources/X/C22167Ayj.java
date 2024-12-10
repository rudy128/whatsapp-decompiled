package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ayj  reason: case insensitive filesystem */
public final class C22167Ayj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22167Ayj(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(1);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass8DF r3;
        List list;
        Map map;
        AnonymousClass9XC r6 = (AnonymousClass9XC) obj;
        String str = "expandableListAdapter";
        if (r6 instanceof C169508ln) {
            r3 = this.this$0.A04;
            if (r3 != null) {
                list = r6.A00;
                map = AnonymousClass1D7.A0I();
            }
            C18070vi.A11(str);
            throw null;
        } else if (r6 instanceof AnonymousClass8lp) {
            AnonymousClass8DF r32 = this.this$0.A04;
            if (r32 != null) {
                AnonymousClass8lp r62 = (AnonymousClass8lp) r6;
                List list2 = r62.A00;
                Map map2 = r62.A01;
                C18070vi.A0d(list2, 0);
                r32.A00 = list2;
                r32.A01 = map2;
                r32.notifyDataSetChanged();
                if (this.this$0.A0L.A02.A00(C23401Fx.RESUMED)) {
                    CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.this$0.A08.getValue();
                    UserJid userJid = this.this$0.A05;
                    if (userJid == null) {
                        str = "bizJid";
                    } else {
                        catalogCategoryGroupsViewModel.A0T(userJid, list2);
                    }
                }
                return C27621Wu.A00;
            }
            C18070vi.A11(str);
            throw null;
        } else {
            if (r6 instanceof C169518lo) {
                r3 = this.this$0.A04;
                if (r3 != null) {
                    C169518lo r63 = (C169518lo) r6;
                    list = r63.A00;
                    map = r63.A01;
                }
                C18070vi.A11(str);
                throw null;
            }
            return C27621Wu.A00;
        }
        C18070vi.A0d(list, 0);
        r3.A00 = list;
        r3.A01 = map;
        r3.notifyDataSetChanged();
        return C27621Wu.A00;
    }
}
