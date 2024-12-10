package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99E  reason: invalid class name */
public final class AnonymousClass99E extends C199199zb {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;

    public JSONObject A01() {
        JSONObject A012 = super.A01();
        try {
            Boolean bool = this.A00;
            if (bool != null) {
                A012.put("flash_call_end_success", bool.booleanValue());
            }
            Boolean bool2 = this.A02;
            if (bool2 != null) {
                A012.put("no_flash_call_id_received", bool2.booleanValue());
            }
            Boolean bool3 = this.A01;
            if (bool3 != null) {
                A012.put("invalid_flash_call_received", bool3.booleanValue());
            }
        } catch (JSONException unused) {
        }
        return A012;
    }
}
