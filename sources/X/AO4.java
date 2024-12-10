package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class AO4 implements BAP {
    public final /* synthetic */ C186479eG A00;

    public AO4(C186479eG r1) {
        this.A00 = r1;
    }

    public void Btx(int i) {
        C186479eG r4 = this.A00;
        C17900vP.A0i("onFetchCollectionProductListFailure errorCode =", AnonymousClass000.A10(), i);
        CatalogManager catalogManager = r4.A00;
        AnonymousClass3MY.A1M(catalogManager.A05, false);
        if (i == 404) {
            Log.i(" CatalogManager remove collection cache and reset page info");
            CatalogManager.A00(catalogManager).A0L(r4.A01, true);
        }
        catalogManager.A03.A0E(new C168598jH(r4.A01, i, r4.A02));
    }

    public void C7a(AN4 an4, C195689tk r11) {
        C186479eG r6 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogManager requestCollectionProductList, onFetchCollectionProductListSuccess #products:");
        C195129sq r7 = an4.A02;
        A10.append(AnonymousClass8BT.A0l(r7.A04));
        A10.append(", pageinfo:");
        C17900vP.A0b(an4.A01, A10);
        CatalogManager catalogManager = r6.A00;
        AnonymousClass3MY.A1M(catalogManager.A05, false);
        String str = r11.A05;
        if (str == null || str.equals(r6.A03)) {
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(str);
            C17900vP.A0n("CatalogManager requestCollectionProductList, onFetchCollectionProductListSuccess, saving collection to cache. isAppend:", AnonymousClass000.A10(), A1W);
            C20114A7x A002 = CatalogManager.A00(catalogManager);
            UserJid userJid = r6.A01;
            A002.A0G(an4, userJid, A1W);
            AnonymousClass1DT r2 = catalogManager.A03;
            String str2 = r7.A03;
            if (r6.A03 != null) {
                z = false;
            }
            r2.A0E(new C168608jI(userJid, str2, false, z));
            return;
        }
        Log.i("CatalogManager requestCollectionProductList, onFetchCollectionProductListSuccess, returning after cursor mismatch");
    }
}
