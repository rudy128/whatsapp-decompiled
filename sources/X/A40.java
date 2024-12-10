package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class A40 {
    public static final List A01;
    public final Map A00;

    static {
        String[] strArr = new String[4];
        strArr[0] = "scheme";
        strArr[1] = "authority";
        strArr[2] = "path";
        A01 = Collections.unmodifiableList(AnonymousClass8BR.A15("query", strArr, 3));
    }

    public static A40 A00(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                HashMap A11 = C17880vN.A11();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    if (jSONObject.has(A0v)) {
                        A11.put(A0v, A44.A00(jSONObject.get(A0v)));
                    }
                }
                if (!A11.isEmpty()) {
                    return new A40(A11);
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public A40(Map map) {
        this.A00 = map;
    }
}
