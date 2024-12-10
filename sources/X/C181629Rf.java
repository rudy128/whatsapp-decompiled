package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Rf  reason: invalid class name and case insensitive filesystem */
public abstract class C181629Rf {
    public static final ArrayList A00(JSONArray jSONArray) {
        ArrayList A13 = AnonymousClass000.A13();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                C18070vi.A0z(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                String str = "pix_static_code";
                if (C18070vi.A18(optString, str) || C18070vi.A18(optString, "pix_dynamic_code")) {
                    if (C18070vi.A18(optString, "pix_dynamic_code")) {
                        str = "pix_dynamic_code";
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(str);
                    if (optJSONObject != null) {
                        String optString2 = optJSONObject.optString("key");
                        String optString3 = optJSONObject.optString("key_type");
                        String optString4 = optJSONObject.optString("merchant_name");
                        String optString5 = optJSONObject.optString("code");
                        C108995ce.A1H(optString, optString2, optString3, optString4);
                        A13.add(new C20251ADj(new C20934Abo(optString2, optString3, optString4, optString5), optString));
                    }
                }
            }
        }
        return A13;
    }
}
