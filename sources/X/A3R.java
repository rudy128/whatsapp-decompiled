package X;

import org.json.JSONObject;

public abstract class A3R {
    public static JSONObject A04() {
        return A05((Object) null);
    }

    public static JSONObject A05(Object obj) {
        JSONObject A15 = C17880vN.A15();
        A15.put("success", true);
        A15.putOpt("result", obj);
        return A15;
    }

    public static JSONObject A06(String str, int i) {
        JSONObject A15 = C17880vN.A15();
        A15.put("success", false);
        A15.put("error_code", i);
        A15.put("error_message", str);
        return A15;
    }
}
