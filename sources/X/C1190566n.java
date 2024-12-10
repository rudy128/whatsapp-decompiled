package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.66n  reason: invalid class name and case insensitive filesystem */
public final class C1190566n extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("xfb_prod_wds_adoption_viewer_query");
            int length = jSONArray.length();
            ArrayList A13 = AnonymousClass000.A13();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C18070vi.A0X(jSONObject2);
                A13.add(new C136096tG(jSONObject2.getString("fds_metadata_owning_component"), jSONObject2.getString("leaf"), jSONObject2.getString("leaf_view_bounds_on_screen"), jSONObject2.getString("root_view_bounds_on_screen"), jSONObject2.getString("design_system")));
            }
            this.A00 = new C134446qb(A13);
        }
    }
}
