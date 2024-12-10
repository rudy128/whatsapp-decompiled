package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9QZ  reason: invalid class name */
public abstract class AnonymousClass9QZ {
    public static final C195709tm A00(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject;
        JSONObject optJSONObject = jSONObject3.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        String[] strArr = null;
        if (optJSONObject == null || (jSONObject2 = optJSONObject.optJSONObject("metadata")) == null) {
            jSONObject2 = jSONObject3;
        }
        String optString = jSONObject3.optString("flow_id");
        String A03 = A6n.A03("data_api_version", jSONObject2, true);
        String A032 = A6n.A03("data_api_protocol", jSONObject2, true);
        String A033 = A6n.A03("state", jSONObject2, C18070vi.A15(jSONObject2, "state"));
        String A034 = A6n.A03("flow_version_ids", jSONObject2, true);
        String A035 = A6n.A03("psl_cdn_url", jSONObject2, true);
        String A036 = A6n.A03("psl_signature", jSONObject2, true);
        JSONArray optJSONArray = jSONObject2.optJSONArray("categories");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = optJSONArray.get(i);
            }
            strArr = strArr2;
        } else {
            String A037 = A6n.A03("categories", jSONObject2, C18070vi.A15(jSONObject2, "categories"));
            if (A037 != null) {
                strArr = C108955ca.A1b(C108965cb.A0v(A037, "\\s*,\\s*", 0));
            }
        }
        int optInt = jSONObject2.optInt("well_version", 0);
        String A038 = A6n.A03("flow_name", jSONObject2, true);
        C18070vi.A0b(optString);
        return new C195709tm(optString, A03, A033, A034, A035, A036, A038, A032, strArr, optInt);
    }
}
