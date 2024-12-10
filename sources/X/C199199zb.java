package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9zb  reason: invalid class name and case insensitive filesystem */
public class C199199zb {
    public int A00;
    public final String A01;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.99E, X.9zb] */
    public static AnonymousClass99E A00(C166688dS r3) {
        return new C199199zb(r3.A0A.A0J(), A9B.A0F(r3.A0A, r3.A00));
    }

    public C199199zb(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public JSONObject A01() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("attempts", this.A00);
            String str = this.A01;
            if (str != null) {
                A15.put("app_campaign_download_source", str);
            }
        } catch (JSONException unused) {
        }
        return A15;
    }
}
