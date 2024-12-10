package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66q  reason: invalid class name and case insensitive filesystem */
public final class C1190866q extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C18070vi.A0d(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("xfb_web_auth_linking_token_generation");
        String string = jSONObject2.getString("t1");
        String string2 = jSONObject2.getString("t2");
        if (C108955ca.A05(string) == 0 || C108955ca.A05(string2) == 0) {
            throw new JSONException("WebAuthT1T2TokenFetchGraphQLDataProcessor/missing return t1/t2");
        }
        this.A00 = AnonymousClass1D6.A01(string, string2);
    }
}
