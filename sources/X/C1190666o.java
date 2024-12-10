package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66o  reason: invalid class name and case insensitive filesystem */
public class C1190666o extends AnonymousClass161 {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.87L] */
    public void A02(JSONObject jSONObject, long j) {
        C18070vi.A0d(jSONObject, 0);
        String string = jSONObject.getJSONObject("xfb_whatsapp_xfamily_access_token_exchange").getString("access_token");
        if (string == null || string.length() == 0) {
            throw new JSONException("NativeAuthTokenExchangeDataProcessor/missing return access token");
        }
        this.A00 = new C134456qc(new AnonymousClass77S(new C1418477e(new Object(), String.class, string, "XFamilyFbAccessTokenForCrossposting"), 2));
    }
}
