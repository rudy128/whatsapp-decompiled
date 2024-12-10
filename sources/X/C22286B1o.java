package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.B1o  reason: case insensitive filesystem */
public final class C22286B1o extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ String $endCursor;
    public final /* synthetic */ boolean $isCategory;
    public final /* synthetic */ int $requestPageSize;
    public final /* synthetic */ int $thumbnailSize;
    public final /* synthetic */ UserJid $userJid;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22286B1o(CatalogManager catalogManager, UserJid userJid, String str, String str2, int i, int i2, boolean z) {
        super(1);
        this.this$0 = catalogManager;
        this.$collectionId = str;
        this.$userJid = userJid;
        this.$requestPageSize = i;
        this.$thumbnailSize = i2;
        this.$endCursor = str2;
        this.$isCategory = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Log.i("CatalogManager requestCollectionProductList, requestCollectionProductListPage with variant info");
        CatalogManager catalogManager = this.this$0;
        String str2 = this.$collectionId;
        UserJid userJid = this.$userJid;
        int i = this.$requestPageSize;
        int i2 = this.$thumbnailSize;
        C195689tk r6 = new C195689tk((C194359rb) obj, userJid, str2, ((A8Q) catalogManager.A0G.getValue()).A03, this.$endCursor, i, i2, i2, this.$isCategory, false);
        AO4 ao4 = new AO4(new C186479eG(this.this$0, this.$userJid, this.$endCursor, this.$collectionId));
        C18100vl r4 = catalogManager.A0P;
        UserJid userJid2 = r6.A04;
        if (!((A5Q) r4.getValue()).A00.A0O(userJid2)) {
            if (C18020vd.A05(C18040vf.A02, (C18020vd) catalogManager.A0B.getValue(), 1327)) {
                str = "CatalogManager requestCollectionProductListPage via GraphQL, not my business";
                Log.i(str);
                ((A5Q) r4.getValue()).A06(r6, ao4);
                return C27621Wu.A00;
            }
        }
        if (A5Q.A01(userJid2, r4)) {
            if (C18020vd.A05(C18040vf.A02, (C18020vd) catalogManager.A0B.getValue(), 7332)) {
                str = "CatalogManager requestCollectionProductListPage via GraphQL, my business";
                Log.i(str);
                ((A5Q) r4.getValue()).A06(r6, ao4);
                return C27621Wu.A00;
            }
        }
        Log.i("CatalogManager requestCollectionProductListPage via IQ");
        C20004A2u a2u = (C20004A2u) catalogManager.A0D.getValue();
        C18070vi.A0X(a2u);
        AnonymousClass1OZ r11 = (AnonymousClass1OZ) catalogManager.A0R.getValue();
        C18070vi.A0X(r11);
        AnonymousClass11E r9 = (AnonymousClass11E) catalogManager.A0L.getValue();
        C18070vi.A0X(r9);
        C20027A3w a3w = (C20027A3w) catalogManager.A0K.getValue();
        C18070vi.A0X(a3w);
        C26911Ty r5 = (C26911Ty) catalogManager.A0E.getValue();
        C18070vi.A0X(r5);
        C19949A0g a0g = (C19949A0g) catalogManager.A0M.getValue();
        C18070vi.A0X(a0g);
        C195049si r13 = (C195049si) catalogManager.A0S.getValue();
        C18070vi.A0X(r13);
        new C167818hp(r5, r6, a3w, ao4, r9, a0g, r11, a2u, r13).A03();
        return C27621Wu.A00;
    }
}
