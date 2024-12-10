package X;

import org.json.JSONObject;

public final class DQW implements E8H {
    public EBR BHm(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("not");
        C18070vi.A0X(jSONObject2);
        EBR A00 = CDF.A00(jSONObject2);
        if (A00 != null) {
            return new C27016DPm(A00);
        }
        throw BE6.A0j();
    }

    public String BSk() {
        return "not";
    }
}
