package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9QO  reason: invalid class name */
public abstract class AnonymousClass9QO {
    public static final AES A00(JSONObject jSONObject) {
        ArrayList arrayList;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("addresses");
        String optString = jSONObject.optString("country");
        int optInt = jSONObject.optInt("selected_id", -1);
        AEV A00 = AnonymousClass9QN.A00(jSONObject.optJSONObject("selected_address"));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass000.A13();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = optJSONArray.get(i);
                C18070vi.A0z(obj, "null cannot be cast to non-null type org.json.JSONObject");
                AEV A002 = AnonymousClass9QN.A00((JSONObject) obj);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
        }
        C18070vi.A0b(optString);
        return new AES(A00, optString, arrayList, optInt, false);
    }
}
