package X;

import org.json.JSONObject;

public final class B2E extends AnonymousClass11G implements C22821Di {
    public static final B2E A00 = new B2E();

    public B2E() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C18070vi.A0d(jSONObject, 0);
        B2D b2d = B2D.A00;
        JSONObject jSONObject2 = new JSONObject();
        b2d.invoke(jSONObject2);
        jSONObject.put("responseData", jSONObject2);
        return C27621Wu.A00;
    }
}
