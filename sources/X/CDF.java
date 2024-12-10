package X;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class CDF {
    public static final EBR A00(JSONObject jSONObject) {
        for (E8H e8h : CGL.A00) {
            if (jSONObject.has(e8h.BSk())) {
                try {
                    return e8h.BHm(jSONObject);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
