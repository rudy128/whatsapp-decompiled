package X;

import org.json.JSONObject;

/* renamed from: X.66m  reason: invalid class name and case insensitive filesystem */
public final class C1190466m extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        String string;
        C18070vi.A0d(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("whatsapp_support_ban_appeal_status");
        if (optJSONObject == null || (string = optJSONObject.getString("status")) == null) {
            C31081ez.A01("BanStatusResponseDataProcessor/processResponse unexpected graphql response");
        } else {
            this.A00 = new C134436qa(C1402970t.A00(string));
        }
    }
}
