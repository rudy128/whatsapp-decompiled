package X;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6XR  reason: invalid class name */
public abstract class AnonymousClass6XR {
    public static final String A00(C134936rO r7) {
        JSONObject A0u = C108985cd.A0u(r7);
        C135876su r5 = r7.A00;
        JSONObject A15 = C17880vN.A15();
        A15.put("media_id", r5.A00);
        A15.put("tracking_type", r5.A03);
        A15.put("current_watching_module", r5.A01);
        A15.put("persistent_id", r5.A02);
        A0u.put("required_metadata", A15);
        JSONArray jSONArray = new JSONArray();
        for (C136006t7 r6 : r7.A01) {
            JSONObject A0u2 = C108985cd.A0u(r6);
            A0u2.put("event_name", r6.A04);
            A0u2.put("media_time_ms", r6.A01);
            A0u2.put("client_time_ms", r6.A00);
            Long l = r6.A03;
            if (l != null) {
                A0u2.put("video_client_duration", l.longValue());
            }
            C133406oh r0 = r6.A02;
            if (r0 != null) {
                Map map = r0.A00;
                if (!map.isEmpty()) {
                    A0u2.put("tag_metadata", new JSONObject(map));
                }
            }
            jSONArray.put(A0u2);
        }
        A0u.put("events", jSONArray);
        return C18070vi.A0H(A0u);
    }
}
