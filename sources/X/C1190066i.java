package X;

import org.json.JSONObject;

/* renamed from: X.66i  reason: invalid class name and case insensitive filesystem */
public final class C1190066i extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        boolean z;
        if (jSONObject == null || !jSONObject.has("xfb_user_has_avatar_config")) {
            z = false;
        } else {
            z = jSONObject.getBoolean("xfb_user_has_avatar_config");
        }
        this.A00 = new C1417776x(z);
    }
}
