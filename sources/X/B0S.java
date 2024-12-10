package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;

public final class B0S extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C187669gB $reportRequest;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0S(CatalogManager catalogManager, C187669gB r3) {
        super(1);
        this.this$0 = catalogManager;
        this.$reportRequest = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        CatalogManager catalogManager = this.this$0;
        C187669gB r1 = this.$reportRequest;
        A0S.A00 = new B0Q(catalogManager, r1);
        A0S.A01 = new B0R(catalogManager, r1);
        return C27621Wu.A00;
    }
}
