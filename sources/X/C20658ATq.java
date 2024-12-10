package X;

import org.json.JSONObject;

/* renamed from: X.ATq  reason: case insensitive filesystem */
public final class C20658ATq implements B86 {
    public /* bridge */ /* synthetic */ Object BFs(JSONObject jSONObject, long j) {
        Object obj;
        String str;
        String str2;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("xwa_product_catalog_get_public_key");
            String optString = jSONObject2.optString("public_key_certificate_pem");
            JSONObject optJSONObject = jSONObject2.optJSONObject("public_key_with_signature");
            if (optJSONObject != null) {
                str = A6n.A03("public_key_pem", optJSONObject, C18070vi.A15(optJSONObject, "public_key_pem"));
                str2 = A6n.A03("public_key_signature", optJSONObject, C18070vi.A15(optJSONObject, "public_key_signature"));
            } else {
                str = null;
                str2 = null;
            }
            C18070vi.A0b(optString);
            obj = new C194229rO(optString, str, str2);
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            return obj;
        }
        return null;
    }
}
