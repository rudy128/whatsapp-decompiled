package X;

import org.json.JSONObject;

public final class B0G extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ JSONObject $paramsJson;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0G(JSONObject jSONObject) {
        super(1);
        this.$paramsJson = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C108955ca.A0a(obj).A01("wa_flow_response_params", this.$paramsJson.getJSONObject("wa_flow_response_params"));
        return C27621Wu.A00;
    }
}
