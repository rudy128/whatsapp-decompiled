package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Cg  reason: invalid class name and case insensitive filesystem */
public final class C143167Cg implements AnonymousClass86Y {
    public final Map A00;

    public C143167Cg(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public void CBw(C133786pU r11, String str, String str2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = str;
        C18070vi.A0d(str, 0);
        C133786pU r5 = r11;
        String str4 = str2;
        if (str2 != null) {
            try {
                JSONObject A16 = C17880vN.A16(str2);
                jSONObject2 = A16.optJSONObject("server_params");
                jSONObject = A16.optJSONObject("client_input_params");
            } catch (JSONException e) {
                r11.A01(e);
                return;
            }
        } else {
            jSONObject2 = null;
            jSONObject = null;
        }
        Object obj = this.A00.get("DI_KEY_AGE_VERIFICATION_BLOKS_FETCHER");
        if (obj != null) {
            C128956gx r3 = (C128956gx) obj;
            r3.A02.CGF(new C21453AkK(r3, new C135926sz(r5, str3, str4, jSONObject2, jSONObject), 2));
            return;
        }
        throw C17880vN.A0g();
    }
}
