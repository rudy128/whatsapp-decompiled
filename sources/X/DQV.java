package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class DQV implements E8H {
    public EBR BHm(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        JSONArray jSONArray = jSONObject.getJSONArray("and");
        int length = jSONArray.length();
        EBR[] ebrArr = new EBR[length];
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C18070vi.A0X(jSONObject2);
            ebrArr[i] = CDF.A00(jSONObject2);
        }
        List A0P = C200410p.A0P(ebrArr);
        if (A0P.size() > 1) {
            z = true;
        }
        C17960vV.A0F(z, "expected 2 or more rules in input");
        return new C27015DPl(A0P);
    }

    public String BSk() {
        return "and";
    }
}
