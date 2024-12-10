package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0Fj  reason: invalid class name and case insensitive filesystem */
public abstract class C02790Fj {
    public static final ArrayList A00(JSONObject jSONObject) {
        ArrayList A13 = AnonymousClass000.A13();
        JSONArray jSONArray = jSONObject.getJSONArray("businesses");
        C18070vi.A0X(jSONArray);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            A13.add(AF0.A01(jSONArray.getJSONObject(i)));
        }
        return A13;
    }
}
