package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class ANC implements BAJ {
    public final /* synthetic */ CatalogManager A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public void BuN(AN5 an5, C188519hY r11) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogManager requestCatalogProducts-> onFetchPageCatalogSuccess #products:");
        A10.append(AnonymousClass8BT.A0l(an5.A03));
        A10.append(" #pageInfo:");
        C17900vP.A0b(Boolean.valueOf(an5.A02.A01), A10);
        CatalogManager catalogManager = this.A00;
        catalogManager.A02 = false;
        boolean z = this.A03;
        if (z) {
            AnonymousClass3MY.A1M(catalogManager.A05, false);
        }
        String str = r11.A09;
        if (str == null || str.equals(this.A02)) {
            boolean z2 = true;
            boolean A1W = AnonymousClass000.A1W(str);
            C20114A7x A002 = CatalogManager.A00(catalogManager);
            UserJid userJid = this.A01;
            A002.A0F(an5, userJid, A1W);
            Log.i("CatalogManager requestCatalogProducts-> onFetchPageCatalogSuccess saved products into cache");
            String str2 = this.A02;
            boolean A1X = AnonymousClass000.A1X(str2);
            C18070vi.A0d(userJid, 0);
            ((AnonymousClass10T) catalogManager.A0H.getValue()).notifyAllObservers(new C20729AWk(userJid, 0, false, A1X));
            if (z) {
                AnonymousClass1DT r2 = catalogManager.A03;
                if (str2 != null) {
                    z2 = false;
                }
                r2.A0E(new C168608jI(userJid, "catalog_products_all_items_collection_id", false, z2));
            }
        }
    }

    public ANC(CatalogManager catalogManager, UserJid userJid, String str, boolean z) {
        this.A00 = catalogManager;
        this.A03 = z;
        this.A02 = str;
        this.A01 = userJid;
    }

    public void BuM(int i) {
        C17900vP.A0i("CatalogManager requestCatalogProducts-> onFetchPageCatalogFail error =", AnonymousClass000.A10(), i);
        CatalogManager catalogManager = this.A00;
        catalogManager.A02 = false;
        boolean z = this.A03;
        if (z) {
            AnonymousClass3MY.A1M(catalogManager.A05, false);
        }
        if (i == 404 || i == 406 || i == 443) {
            Log.e("CatalogManager requestCatalogProducts-> onFetchPageCatalogFail remove catalog cache");
            CatalogManager.A00(catalogManager).A0J(this.A01);
        }
        UserJid userJid = this.A01;
        C18070vi.A0d(userJid, 0);
        C20739AWu.A00((AnonymousClass10T) catalogManager.A0H.getValue(), userJid, i, 4);
        if (z) {
            catalogManager.A03.A0E(new C168598jH(userJid, i, "catalog_products_all_items_collection_id"));
        }
    }
}
