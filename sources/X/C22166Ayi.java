package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Ayi  reason: case insensitive filesystem */
public final class C22166Ayi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22166Ayi(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(1);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9M8 r10 = (AnonymousClass9M8) obj;
        if (r10 instanceof C169528lq) {
            CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
            C18070vi.A0b(r10);
            C169528lq r102 = (C169528lq) r10;
            Context A14 = catalogAllCategoryFragment.A14();
            String str = r102.A02;
            UserJid userJid = r102.A01;
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(A14.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity");
            A0A.putExtra("selected_category_parent_id", str);
            A0A.putExtra("business_owner_jid", userJid);
            catalogAllCategoryFragment.A1k(A0A);
            CatalogAllCategoryFragment catalogAllCategoryFragment2 = this.this$0;
            C179299Hk r1 = r102.A00;
            catalogAllCategoryFragment2.A05.getValue();
            if (r1 == C179299Hk.CATALOG_SEARCH_FLOW) {
                AnonymousClass1GP A1F = catalogAllCategoryFragment2.A1F();
                AnonymousClass1D6[] r2 = new AnonymousClass1D6[1];
                C72463Mc.A1H("all_category_has_navigated_to_category_tabs", true, r2);
                A1F.A0w("all_category_result_callback_key", AnonymousClass9O6.A00(r2));
            }
        } else if (r10 instanceof C169538lr) {
            CatalogAllCategoryFragment catalogAllCategoryFragment3 = this.this$0;
            C169538lr r103 = (C169538lr) r10;
            String str2 = r103.A02;
            String str3 = r103.A03;
            UserJid userJid2 = r103.A01;
            int i = r103.A00;
            Context A1n = catalogAllCategoryFragment3.A1n();
            if (A1n != null) {
                Intent A1C = AnonymousClass1LU.A1C(A1n, userJid2, C17880vN.A0j(), Integer.valueOf(i), str2, str3, (String) null);
                AnonymousClass1L9 r22 = catalogAllCategoryFragment3.A01;
                if (r22 != null) {
                    r22.A0D(catalogAllCategoryFragment3.A1D(), A1C, 3000);
                } else {
                    C18070vi.A11("activityUtils");
                    throw null;
                }
            }
        }
        return C27621Wu.A00;
    }
}
