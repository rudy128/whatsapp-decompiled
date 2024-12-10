package X;

import org.json.JSONObject;

/* renamed from: X.9v9  reason: invalid class name and case insensitive filesystem */
public abstract class C196489v9 {
    public static final void A01(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (!(!z || str2 == null || str2.length() == 0)) {
            jSONObject2.put("direct_connection_encrypted_info", str2);
        }
        JSONObject A15 = C17880vN.A15();
        AnonymousClass8BT.A1N(A15, "request", C108965cb.A0x(jSONObject2, str, A15), jSONObject);
    }

    public static final void A00(C194359rb r4, JSONObject jSONObject) {
        StringBuilder A10 = AnonymousClass000.A10();
        for (C179499If r1 : r4.A02) {
            if (A10.length() > 0) {
                A10.append(",");
            }
            A10.append(r1.variantInfoTypeString);
        }
        if (A10.length() > 0) {
            AnonymousClass8BS.A1C(A10, "variant_info_fields", jSONObject);
            jSONObject.put("variant_thumbnail_width", String.valueOf(r4.A01));
            jSONObject.put("variant_thumbnail_height", String.valueOf(r4.A00));
        }
    }
}
