package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99F  reason: invalid class name */
public final class AnonymousClass99F extends C199199zb {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;

    public JSONObject A01() {
        JSONObject A012 = super.A01();
        try {
            Integer num = this.A03;
            if (num != null) {
                A012.put("is_sim_number", num.intValue());
            }
            Boolean bool = this.A01;
            if (bool != null) {
                A012.put("is_sim_absent", bool.booleanValue());
            }
            Boolean bool2 = this.A00;
            if (bool2 != null) {
                A012.put("is_permission_granted", bool2.booleanValue());
            }
            Boolean bool3 = this.A02;
            if (bool3 != null) {
                A012.put("isUserChoosingToMigrateFromConsumerAppDirectly", bool3.booleanValue());
            }
        } catch (JSONException unused) {
        }
        return A012;
    }
}
