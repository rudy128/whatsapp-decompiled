package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.19H  reason: invalid class name */
public class AnonymousClass19H {
    public final AnonymousClass19G A00;
    public final AnonymousClass19A A01;

    public static JSONArray A00(Class cls, Object obj) {
        JSONArray jSONArray = new JSONArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 == null || !(cls == double[].class || cls == Double.class)) {
                jSONArray.put(obj2);
            } else {
                jSONArray.put(new BigDecimal(((Number) obj2).doubleValue(), MathContext.DECIMAL32).doubleValue());
            }
        }
        return jSONArray;
    }

    public static void A01(Class cls, Object obj, String str, JSONObject jSONObject) {
        if (obj == null || !(cls == double[].class || cls == Double.class)) {
            jSONObject.put(str, obj);
        } else {
            jSONObject.put(str, new BigDecimal(((Number) obj).doubleValue(), MathContext.DECIMAL32).doubleValue());
        }
    }

    public AnonymousClass19H(AnonymousClass19G r1, AnonymousClass19A r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
