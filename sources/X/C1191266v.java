package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.66v  reason: invalid class name and case insensitive filesystem */
public final class C1191266v extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C62432rO r1;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        C18070vi.A0d(jSONObject, 0);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("waffle_fx_service_data");
        String str = null;
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("services")) == null || (optJSONArray = optJSONObject.optJSONArray("waffle_sxs")) == null) {
            r1 = new C62432rO(new C139786zR(false, false), (String) null, (String) null);
        } else {
            int length = optJSONArray.length();
            String str2 = null;
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < length; i++) {
                if (C18070vi.A18(optJSONArray.getJSONObject(i).getString("waffle_da"), "I")) {
                    AnonymousClass1D6 A00 = A00(optJSONArray, i);
                    z2 = AnonymousClass000.A1Y(A00.first);
                    str2 = (String) A00.second;
                } else if (C18070vi.A18(optJSONArray.getJSONObject(i).getString("waffle_da"), "F")) {
                    AnonymousClass1D6 A002 = A00(optJSONArray, i);
                    z = AnonymousClass000.A1Y(A002.first);
                    str = (String) A002.second;
                }
            }
            r1 = new C62432rO(new C139786zR(z, z2), str, str2);
        }
        this.A00 = r1;
    }

    public static AnonymousClass1D6 A00(JSONArray jSONArray, int i) {
        JSONObject jSONObject = jSONArray.getJSONObject(i);
        C18070vi.A0X(jSONObject);
        return new AnonymousClass1D6(Boolean.valueOf(jSONObject.getJSONArray("waffle_xss").getJSONObject(0).getBoolean("waffle_iaxe")), jSONObject.getString("waffle_di"));
    }
}
