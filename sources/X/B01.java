package X;

import org.json.JSONObject;

public final class B01 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ JSONObject $jsonObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B01(JSONObject jSONObject) {
        super(1);
        this.$jsonObject = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("payment_status", this.$jsonObject.optString("status"));
        A0a.A01("payment_timestamp", Long.valueOf(this.$jsonObject.optLong("timestamp", 0)));
        return C27621Wu.A00;
    }
}
