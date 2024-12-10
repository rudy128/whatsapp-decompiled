package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Qh  reason: invalid class name and case insensitive filesystem */
public abstract class C181389Qh {
    public static final C180759Nu A00(Object obj) {
        C180759Nu r0;
        C18070vi.A0d(obj, 0);
        if (obj instanceof Boolean) {
            r0 = new C172988uL(AnonymousClass000.A1Y(obj));
        } else if (obj instanceof Number) {
            r0 = new C172998uM((Number) obj);
        } else if (obj instanceof String) {
            r0 = new C173008uN((String) obj);
        } else if (obj instanceof JSONArray) {
            r0 = new C173038uQ((JSONArray) obj);
        } else if (obj instanceof JSONObject) {
            r0 = new C173028uP((JSONObject) obj);
        } else {
            throw new C173058uS(obj);
        }
        return r0;
    }
}
