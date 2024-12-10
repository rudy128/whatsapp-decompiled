package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tD  reason: invalid class name and case insensitive filesystem */
public final class C172308tD extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C19979A1p a1p;
        C18070vi.A0d(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("xwa_extensions_get_flow_data");
        C18070vi.A0b(jSONObject2);
        C18070vi.A0d(jSONObject2, 0);
        JSONArray optJSONArray = jSONObject2.optJSONArray("extensions_flow_data");
        ArrayList A13 = AnonymousClass000.A13();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    A13.add(AnonymousClass9QZ.A00(optJSONObject));
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("compatibility");
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("endpoint_public_key");
        List A0t = C29431cG.A0t(A13);
        C193799qg r1 = null;
        if (optJSONObject2 != null) {
            a1p = C19979A1p.A03.A02(optJSONObject2);
        } else {
            a1p = null;
        }
        if (optJSONObject3 != null) {
            r1 = new C193799qg(A6n.A03("key", optJSONObject3, C18070vi.A15(optJSONObject3, "key")), A6n.A03(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, optJSONObject3, C18070vi.A15(optJSONObject3, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE)));
        }
        this.A00 = new C194429ri(a1p, r1, A0t);
    }
}
