package X;

import org.json.JSONObject;

/* renamed from: X.9vt  reason: invalid class name and case insensitive filesystem */
public abstract class C196939vt {
    public static final C187549fz A00(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject.has("title")) {
            str = C20064A5n.A02("title", jSONObject);
        } else {
            str = null;
        }
        if (jSONObject.has("url")) {
            str2 = C20064A5n.A02("url", jSONObject);
        } else {
            str2 = null;
        }
        if (jSONObject.has("fallBackUrl")) {
            str3 = C20064A5n.A02("fallBackUrl", jSONObject);
        }
        return new C187549fz(str, str2, str3, jSONObject.getInt("limit"), jSONObject.getBoolean("dismissPromotion"));
    }

    public static final JSONObject A01(C187549fz r3) {
        JSONObject A15 = C17880vN.A15();
        A15.putOpt("title", r3.A02);
        A15.putOpt("url", r3.A03);
        A15.putOpt("fallBackUrl", r3.A01);
        A15.put("limit", r3.A00);
        A15.put("dismissPromotion", r3.A04);
        return A15;
    }
}
