package X;

import org.json.JSONObject;

/* renamed from: X.8t9  reason: invalid class name and case insensitive filesystem */
public final class C172268t9 extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C184159aV r4;
        String optString;
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        JSONObject optJSONObject = jSONObject2.optJSONObject("fx_foa_to_waffle_data");
        String str = "";
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("password_certificate");
            if (optJSONObject2 == null) {
                r4 = new C184159aV(0, str);
            } else {
                int optInt = optJSONObject2.optInt("key_id");
                String A11 = C108955ca.A11("public_key_pem", optJSONObject2);
                optJSONObject2.optInt("ttl");
                r4 = new C184159aV(optInt, A11);
            }
            String A112 = C108955ca.A11("account_id", optJSONObject);
            String A113 = C108955ca.A11("auth_blob", optJSONObject);
            String A114 = C108955ca.A11("phone_number", optJSONObject);
            if ("null".equals(optJSONObject.optString("profile_pic_url"))) {
                optString = str;
            } else {
                optString = optJSONObject.optString("profile_pic_url");
            }
            C18070vi.A0b(optString);
            if (!"null".equals(optJSONObject.optString("foa_profile_name"))) {
                str = optJSONObject.optString("foa_profile_name");
            }
            C18070vi.A0b(str);
            this.A00 = new C187899gY(r4, A112, A113, A114, optString, str, C108955ca.A11("encryption_certificate", optJSONObject));
            return;
        }
        this.A00 = new C187899gY(new C184159aV(0, str), str, str, str, str, str, str);
    }
}
