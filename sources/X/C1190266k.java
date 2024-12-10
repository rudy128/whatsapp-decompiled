package X;

import org.json.JSONObject;

/* renamed from: X.66k  reason: invalid class name and case insensitive filesystem */
public final class C1190266k extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C127706en r4;
        C18070vi.A0d(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("whatsapp_biz_integrity_p2b_report");
        String optString = jSONObject2.optString("status");
        if (C108955ca.A05(optString) != 0 && !"INVALID".equals(optString) && !"NOT_FOUND".equals(optString)) {
            if ("PENDING".equals(optString)) {
                r4 = new C127706en((C130406jN) null, "PENDING");
            } else {
                JSONObject optJSONObject = jSONObject2.optJSONObject("detail");
                if (optJSONObject != null) {
                    String optString2 = optJSONObject.optString("report_url");
                    String optString3 = optJSONObject.optString("file_name");
                    String optString4 = optJSONObject.optString("media_key");
                    String optString5 = optJSONObject.optString("file_sha256");
                    String optString6 = optJSONObject.optString("encrypted_file_sha256");
                    String optString7 = optJSONObject.optString("direct_path");
                    int optInt = optJSONObject.optInt("file_size_bytes");
                    if (!(C108955ca.A05(optString2) == 0 || C108955ca.A05(optString3) == 0 || C108955ca.A05(optString4) == 0 || C108955ca.A05(optString5) == 0 || C108955ca.A05(optString6) == 0 || C108955ca.A05(optString7) == 0)) {
                        r4 = new C127706en(new C130406jN(optString2, optString3, optString4, optInt, optString5, optString6, optString7), "AVAILABLE");
                    }
                }
            }
            this.A00 = r4;
        }
        r4 = new C127706en((C130406jN) null, "INVALID");
        this.A00 = r4;
    }
}
