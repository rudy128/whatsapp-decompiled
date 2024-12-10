package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AMg  reason: case insensitive filesystem */
public class C20469AMg implements BAE {
    public final int A00;
    public final Object A01;

    public C20469AMg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Brc(AEW aew) {
        C34001jj A0H;
        int i;
        int i2;
        CatalogSearchFragment catalogSearchFragment;
        String str;
        switch (this.A00) {
            case 0:
                C185589cp r1 = (C185589cp) this.A01;
                if (((C19973A1i) r1.A00.A02.get()).A02(aew)) {
                    C22363B4r b4r = r1.A01;
                    UserJid userJid = r1.A02;
                    C20504ANp aNp = (C20504ANp) b4r;
                    int i3 = aNp.A00;
                    Object obj = aNp.A01;
                    switch (i3) {
                        case 0:
                            CatalogCategoryTabsActivity catalogCategoryTabsActivity = (CatalogCategoryTabsActivity) obj;
                            A0H = AnonymousClass3Ma.A0H(catalogCategoryTabsActivity);
                            i = 2131428916;
                            catalogCategoryTabsActivity.A03.get();
                            Bundle A0D = C17880vN.A0D();
                            A0D.putParcelable("category_biz_id", userJid);
                            A0D.putInt("search_entry_point", 1);
                            A0D.putParcelable("business_profile", aew);
                            catalogSearchFragment = new CatalogSearchFragment();
                            catalogSearchFragment.A1R(A0D);
                            str = "CategoryTabsSearchFragmentTag";
                            break;
                        case 1:
                            CatalogListActivity catalogListActivity = (CatalogListActivity) obj;
                            A0H = AnonymousClass3Ma.A0H(catalogListActivity);
                            i = 2131428916;
                            catalogListActivity.A0L.get();
                            i2 = 0;
                            break;
                        default:
                            CollectionProductListActivity collectionProductListActivity = (CollectionProductListActivity) obj;
                            A0H = AnonymousClass3Ma.A0H(collectionProductListActivity);
                            i = 2131428916;
                            collectionProductListActivity.A04.get();
                            i2 = 2;
                            break;
                    }
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putParcelable("category_biz_id", userJid);
                    A0D2.putInt("search_entry_point", i2);
                    A0D2.putParcelable("business_profile", aew);
                    catalogSearchFragment = new CatalogSearchFragment();
                    catalogSearchFragment.A1R(A0D2);
                    str = "CatalogSearchFragmentTag";
                    A0H.A0D(catalogSearchFragment, str, i);
                    A0H.A00(false);
                    return;
                }
                return;
            case 1:
                C53742d1 r2 = (C53742d1) this.A01;
                r2.A00.A01 = "direct_connection";
                r2.A01.countDown();
                return;
            case 2:
                ((B78) this.A01).C3p(true);
                return;
            default:
                ((B9F) this.A01).Bx7(C17880vN.A0i());
                return;
        }
    }

    public void BzH(AEW aew) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C53742d1 r2 = (C53742d1) this.A01;
                r2.A00.A01 = "non_direct_connection";
                r2.A01.countDown();
                return;
            case 2:
                ((B78) this.A01).C3p(false);
                return;
            default:
                B9F b9f = (B9F) this.A01;
                Integer num = null;
                if (aew != null) {
                    num = C17880vN.A0j();
                }
                b9f.Bx7(num);
                return;
        }
    }
}
