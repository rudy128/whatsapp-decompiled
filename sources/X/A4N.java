package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A4N {
    public final C19979A1p A02(JSONObject jSONObject) {
        return new C19979A1p(A00(jSONObject.optJSONArray("welj")), A00(jSONObject.optJSONArray("data_channel")), A00(jSONObject.optJSONArray("flow_message")));
    }

    private final LinkedHashMap A00(JSONArray jSONArray) {
        String A01;
        LinkedHashMap A13 = C17880vN.A13();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String A012 = C20064A5n.A01("version", (String) null, optJSONObject);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("android");
                    if (!(A012 == null || optJSONArray == null)) {
                        LinkedHashMap A132 = C17880vN.A13();
                        int length2 = optJSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                            if (!(optJSONObject2 == null || (A01 = C20064A5n.A01("env", (String) null, optJSONObject2)) == null)) {
                                A132.put(A01, new C193809qh(C20064A5n.A01("min_version", (String) null, optJSONObject2), C20064A5n.A01("max_version", (String) null, optJSONObject2)));
                            }
                        }
                        A13.put(A012, A132);
                    }
                }
            }
        }
        return A13;
    }

    public static final JSONArray A01(Map map) {
        JSONArray A1A = AnonymousClass8BR.A1A();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            JSONObject A152 = C17880vN.A15();
            JSONArray A1A2 = AnonymousClass8BR.A1A();
            Iterator A153 = AnonymousClass000.A15((Map) A16.getValue());
            while (A153.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A153);
                C193809qh r3 = (C193809qh) A162.getValue();
                JSONObject A0u = C108985cd.A0u(r3);
                A0u.put("min_version", r3.A01);
                A0u.put("max_version", r3.A00);
                A0u.put("env", A162.getKey());
                A1A2.put(A0u);
            }
            A152.put("version", A16.getKey());
            A152.put("android", A1A2);
            A1A.put(A152);
        }
        return A1A;
    }
}
