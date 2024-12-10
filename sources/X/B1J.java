package X;

import java.util.Map;
import org.json.JSONArray;

public final class B1J extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Map $metadataMap;
    public final /* synthetic */ C170018ny this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1J(C170018ny r2, String str, Map map) {
        super(1);
        this.this$0 = r2;
        this.$flowId = str;
        this.$metadataMap = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        C22258B0m b0m = new C22258B0m(this.$flowId, this.$metadataMap);
        JSONArray jSONArray = new JSONArray();
        b0m.invoke(jSONArray);
        A0a.A01("extensionIdLinks", jSONArray);
        this.this$0.A0H.get();
        A0a.A01("timeStampInMillis", C108955ca.A0m());
        return C27621Wu.A00;
    }
}
