package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9PB  reason: invalid class name */
public abstract class AnonymousClass9PB {
    public static final C194769sG A00(JSONObject jSONObject) {
        C192979pL r4;
        JSONObject jSONObject2 = jSONObject;
        String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2);
        String A0J2 = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject2);
        JSONObject A0w = AnonymousClass8BS.A0w("best_instance", jSONObject2);
        JSONArray jSONArray = A0w.getJSONArray("capabilities_min_version_models");
        ArrayList A13 = AnonymousClass000.A13();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            C18070vi.A0X(jSONObject3);
            A13.add(new AnonymousClass9q0(C18070vi.A0J("capability_name", jSONObject3), jSONObject3.getInt("min_version")));
        }
        JSONArray A0t = AnonymousClass8BX.A0t("effect_instructions", A0w);
        ArrayList A132 = AnonymousClass000.A13();
        int length2 = A0t.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject4 = A0t.getJSONObject(i2);
            C18070vi.A0X(jSONObject4);
            String A0J3 = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject4);
            String A0J4 = C18070vi.A0J("token", jSONObject4);
            String A0J5 = C18070vi.A0J("text", jSONObject4);
            JSONObject optJSONObject = jSONObject4.optJSONObject("image");
            if (optJSONObject != null) {
                r4 = new C192979pL(C18070vi.A0J("uri", optJSONObject));
            } else {
                r4 = null;
            }
            A132.add(new C194759sF(r4, A0J3, A0J4, A0J5));
        }
        String A0J6 = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0w);
        String A0J7 = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0w);
        String A0J8 = C18070vi.A0J("required_sdk_version", A0w);
        JSONObject A0w2 = AnonymousClass8BS.A0w("packaged_file", A0w);
        ArrayList arrayList = A13;
        ArrayList arrayList2 = A132;
        return new C194769sG(new C192979pL(C18070vi.A0J("uri", AnonymousClass8BS.A0w("thumbnail", jSONObject2))), new C195599tb(new C195519tT(C122476Qn.valueOf(C18070vi.A0J("compression_type", A0w2)), C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0w2), C18070vi.A0J("filename", A0w2), C18070vi.A0J("uri", A0w2), C18070vi.A0J("md5_hash", A0w2), C18070vi.A0J("cache_key", A0w2), A0w2.getInt("filesize_bytes"), A0w2.getInt("uncompressed_filesize_bytes")), A0J6, A0J7, A0J8, C18070vi.A0J("manifest_json", A0w), arrayList, arrayList2, A0w.optBoolean("face_tracker_enabled", false), A0w.optBoolean("uses_flm_capability", false)), A0J, A0J2);
    }
}
