package X;

import org.json.JSONObject;

/* renamed from: X.66r  reason: invalid class name and case insensitive filesystem */
public final class C1190966r extends AnonymousClass161 {
    public final AnonymousClass00H A00;

    public C1190966r(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A02(JSONObject jSONObject, long j) {
        String str;
        if (jSONObject != null) {
            if (!jSONObject.has("fetch__WAAvatar")) {
                str = "missing envelope (fetch__WAAvatar)";
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("fetch__WAAvatar");
                if (!jSONObject2.has("wa_full_preview")) {
                    str = "missing key (wa_full_preview)";
                } else {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("wa_full_preview");
                    if (!jSONObject3.has("url")) {
                        str = "missing url";
                    } else {
                        this.A00 = new C1416976p(jSONObject3.getString("url"));
                        return;
                    }
                }
            }
            C108945cZ.A0p(this.A00).A02(5, "malformed_preview_json_response", str);
        }
    }
}
