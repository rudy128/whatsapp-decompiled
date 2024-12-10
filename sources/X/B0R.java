package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;

public final class B0R extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C187669gB $reportRequest;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0R(CatalogManager catalogManager, C187669gB r3) {
        super(1);
        this.this$0 = catalogManager;
        this.$reportRequest = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        StringBuilder A19 = AnonymousClass3MZ.A19(a6z, 0);
        A19.append("reportProduct/onError/");
        C17890vO.A19(A19, a6z.A03());
        this.this$0.A0B(this.$reportRequest, false);
        return false;
    }
}
