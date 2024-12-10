package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66d  reason: invalid class name and case insensitive filesystem */
public final class C1189566d extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        boolean z;
        if (jSONObject != null) {
            try {
                z = jSONObject.getJSONObject("xwa_genai_imagine_feedback_for_intents_wa").getBoolean("submitted");
            } catch (JSONException e) {
                C17900vP.A0X(e, "ImagineReport JsonParsingException on RootResponse/", AnonymousClass000.A10());
                z = false;
            }
            this.A00 = new C125826bk(z);
        }
    }
}
