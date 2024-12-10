package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66Y  reason: invalid class name */
public final class AnonymousClass66Y extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        String str;
        C18070vi.A0d(jSONObject, 0);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("single_mask_effect");
            C18070vi.A0X(jSONObject2);
            this.A00 = new C134276qK(AnonymousClass9PB.A00(jSONObject2));
        } catch (JSONException e) {
            e = e;
            str = "ArEffectsGetSingleEffectDataProcessor/processResponse Failed to parse JSON";
            Log.e(str, e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = "ArEffectsGetSingleEffectDataProcessor/processResponse Failed to parse some enum";
            Log.e(str, e);
        }
    }
}
