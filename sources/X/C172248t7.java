package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8t7  reason: invalid class name and case insensitive filesystem */
public final class C172248t7 extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        C18070vi.A0d(jSONObject, 0);
        try {
            JSONObject A0w = AnonymousClass8BS.A0w("ar_scripting_modules_package_download", jSONObject);
            this.A00 = new C192969pK(new C193359px(A0w.getInt("revision"), C18070vi.A0J("cdn_uri", A0w)));
        } catch (JSONException e) {
            Log.e("ArdGetScriptingMetadataDataProcessor/processResponse Failed to parse data", e);
        }
    }
}
