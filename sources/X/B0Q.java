package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.infra.graphql.generated.catalog.WhatsappCatalogReportProductResponseImpl;
import org.json.JSONObject;

public final class B0Q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C187669gB $reportRequest;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0Q(CatalogManager catalogManager, C187669gB r3) {
        super(1);
        this.this$0 = catalogManager;
        this.$reportRequest = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C18070vi.A0d(obj, 0);
        C20125A8k A09 = ((C20125A8k) obj).A09(WhatsappCatalogReportProductResponseImpl.XwaWhatsappCatalogReportProduct.class, "xwa_whatsapp_catalog_report_product");
        if (A09 != null) {
            JSONObject jSONObject = A09.A00;
            C18070vi.A0W(jSONObject);
            z = new C20125A8k(jSONObject).A0G("success");
        } else {
            z = false;
        }
        this.this$0.A0B(this.$reportRequest, z);
        return C27621Wu.A00;
    }
}
