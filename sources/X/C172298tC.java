package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8tC  reason: invalid class name and case insensitive filesystem */
public final class C172298tC extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C19978A1o A00;
        C18070vi.A0d(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("whatsapp_extensions_assets_getpubkeys");
        if (optJSONObject == null || (A00 = C19978A1o.A03.A00(optJSONObject.toString())) == null) {
            throw new JSONException("Asset verification response is not in expected format.");
        }
        this.A00 = A00;
    }
}
