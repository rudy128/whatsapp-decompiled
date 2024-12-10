package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.B1i  reason: case insensitive filesystem */
public final class C22280B1i extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $isAllItemsCollectionRequest;
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ int $requestPageSize;
    public final /* synthetic */ int $thumbSize;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22280B1i(CatalogManager catalogManager, UserJid userJid, int i, int i2, boolean z) {
        super(1);
        this.this$0 = catalogManager;
        this.$jid = userJid;
        this.$isAllItemsCollectionRequest = z;
        this.$requestPageSize = i;
        this.$thumbSize = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C194359rb r2 = (C194359rb) obj;
        Log.i("CatalogManager requestCatalogProducts-> variants request data available");
        C193429q5 A06 = CatalogManager.A00(this.this$0).A06(this.$jid);
        if (A06 != null) {
            str = A06.A00;
        } else {
            str = null;
        }
        CatalogManager catalogManager = this.this$0;
        UserJid userJid = this.$jid;
        C18070vi.A0d(userJid, 0);
        C193429q5 A062 = CatalogManager.A00(catalogManager).A06(userJid);
        if ((A062 == null || A062.A01) && !catalogManager.A02) {
            CatalogManager catalogManager2 = this.this$0;
            catalogManager2.A02 = true;
            if (this.$isAllItemsCollectionRequest) {
                AnonymousClass3MY.A1L(catalogManager2.A05, true);
            }
            UserJid userJid2 = this.$jid;
            int i = this.$requestPageSize;
            int i2 = this.$thumbSize;
            C188519hY r4 = new C188519hY((AnonymousClass9NJ) null, (C194359rb) null, userJid2, (Boolean) null, str, ((A8Q) this.this$0.A0G.getValue()).A03, i, i2, i2, false);
            r4.A01 = r2;
            Log.i("CatalogManager requestCatalogProducts->requestBusinessProductCatalogPage");
            CatalogManager catalogManager3 = this.this$0;
            catalogManager3.A09(new ANC(catalogManager3, this.$jid, str, this.$isAllItemsCollectionRequest), r4);
        }
        return C27621Wu.A00;
    }
}
