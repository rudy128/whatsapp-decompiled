package X;

import org.json.JSONObject;

/* renamed from: X.66g  reason: invalid class name and case insensitive filesystem */
public final class C1189866g extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("xfb_whatsapp_smb_order_education_video")) == null) {
            str = null;
        } else {
            str = jSONObject2.optString("video_uri");
        }
        this.A00 = str;
    }
}
