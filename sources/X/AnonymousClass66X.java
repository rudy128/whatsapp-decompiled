package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66X  reason: invalid class name */
public final class AnonymousClass66X extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        String str;
        C18070vi.A0d(jSONObject, 0);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ar_effect_collection");
            ArrayList A13 = AnonymousClass000.A13();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C18070vi.A0X(jSONObject2);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("ar_effects");
                C18070vi.A0X(jSONObject3);
                JSONArray jSONArray2 = jSONObject3.getJSONArray("nodes");
                ArrayList A132 = AnonymousClass000.A13();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                    C18070vi.A0X(jSONObject4);
                    A132.add(AnonymousClass9PB.A00(jSONObject4));
                }
                JSONObject jSONObject5 = jSONObject3.getJSONObject("page_info");
                C18070vi.A0X(jSONObject5);
                A13.add(new C134256qI(new C134476qe(new C135136ri(C18070vi.A0J("start_cursor", jSONObject5), C18070vi.A0J("end_cursor", jSONObject5), jSONObject5.getBoolean("has_next_page")), A132)));
            }
            this.A00 = new C134266qJ(A13);
        } catch (JSONException e) {
            e = e;
            str = "ArEffectsGetMetadataDataProcessor/processResponse Failed to parse JSON";
            Log.e(str, e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = "ArEffectsGetMetadataDataProcessor/processResponse Failed to parse some enum";
            Log.e(str, e);
        }
    }
}
