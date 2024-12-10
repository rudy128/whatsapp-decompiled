package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Ayk  reason: case insensitive filesystem */
public final class C22168Ayk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22168Ayk(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(1);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9M8 r10 = (AnonymousClass9M8) obj;
        if (r10 instanceof C169538lr) {
            CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.this$0;
            C169538lr r102 = (C169538lr) r10;
            String str = r102.A02;
            String str2 = r102.A03;
            UserJid userJid = r102.A01;
            int i = r102.A00;
            Context A1n = catalogCategoryExpandableGroupsListFragment.A1n();
            if (A1n != null) {
                Intent A1C = AnonymousClass1LU.A1C(A1n, userJid, C17880vN.A0j(), Integer.valueOf(i), str, str2, (String) null);
                AnonymousClass1L9 r2 = catalogCategoryExpandableGroupsListFragment.A02;
                if (r2 != null) {
                    r2.A0D(catalogCategoryExpandableGroupsListFragment.A1D(), A1C, 3000);
                } else {
                    C18070vi.A11("activityUtils");
                    throw null;
                }
            }
        }
        return C27621Wu.A00;
    }
}
