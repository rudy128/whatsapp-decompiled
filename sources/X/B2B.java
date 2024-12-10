package X;

import org.json.JSONObject;

public final class B2B extends AnonymousClass11G implements C22821Di {
    public static final B2B A00 = new B2B();

    public B2B() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C18070vi.A0d(jSONObject, 0);
        return new C193769qd(C179339Ho.valueOf(C18070vi.A0J("action_type", jSONObject)), jSONObject.getLong("action_ts"));
    }
}
