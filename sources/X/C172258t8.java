package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8t8  reason: invalid class name and case insensitive filesystem */
public final class C172258t8 extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        ArrayList A13;
        String A03;
        C18070vi.A0d(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("xwa_custom_url_get");
        if (optJSONObject != null) {
            if (!optJSONObject.optBoolean("success")) {
                A13 = null;
            } else {
                A13 = AnonymousClass000.A13();
                JSONArray optJSONArray = optJSONObject.optJSONArray("custom_urls");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        if (!(optJSONObject2 == null || (A03 = A6n.A03("path", optJSONObject2, C18070vi.A15(optJSONObject2, "path"))) == null)) {
                            A13.add(A03);
                        }
                    }
                }
            }
            this.A00 = new C182969Wk(A13);
        }
    }
}
