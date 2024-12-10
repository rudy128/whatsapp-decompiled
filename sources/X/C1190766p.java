package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66p  reason: invalid class name and case insensitive filesystem */
public final class C1190766p extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C18070vi.A0d(jSONObject, 0);
        String string = jSONObject.getJSONObject("xfb_web_auth_linking_access_token_exchange").getString("access_token");
        if (string == null || string.length() == 0) {
            throw new JSONException("WebAuthAccessTokenFetchGraphQLDataProcessor/missing return access token");
        }
        this.A00 = string;
    }
}
