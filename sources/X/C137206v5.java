package X;

import org.json.JSONObject;

/* renamed from: X.6v5  reason: invalid class name and case insensitive filesystem */
public class C137206v5 {
    public static AnonymousClass732 A00(C35021lW r11, String str, JSONObject jSONObject) {
        Long l;
        JSONObject A0v = C108985cd.A0v(jSONObject);
        long j = A0v.getLong("fbid");
        String string = A0v.getString("access_token");
        long j2 = A0v.getLong("timestamp");
        String str2 = null;
        if (A0v.has("ttl")) {
            l = Long.valueOf(A0v.optLong("ttl"));
        } else {
            l = null;
        }
        if (A0v.has("analytics_claim")) {
            str2 = A0v.optString("analytics_claim");
        }
        return new AnonymousClass732(r11, l, str, string, str2, j, j2);
    }
}
