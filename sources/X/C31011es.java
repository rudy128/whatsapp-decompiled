package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1es  reason: invalid class name and case insensitive filesystem */
public class C31011es {
    public final AnonymousClass18K A00;
    public final C31001er A01;

    public static JSONObject A00(String str, JSONArray jSONArray) {
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            } else if (!str.equals(((JSONObject) jSONArray.get(i)).optString("business_owner_jid"))) {
                i++;
            } else if (i != -1) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                jSONArray.remove(i);
                return jSONObject;
            }
        }
        return new JSONObject();
    }

    public C31011es(AnonymousClass18K r1, C31001er r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
