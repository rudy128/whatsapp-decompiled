package X;

import com.whatsapp.extensions.JsonExtKt$iterator$1;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class A6n {
    public static final Boolean A00(String str, JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Boolean.valueOf(jSONObject.optBoolean(str));
    }

    public static final String A03(String str, JSONObject jSONObject, boolean z) {
        String str2;
        C18070vi.A0d(jSONObject, 0);
        Object opt = jSONObject.opt(str);
        if (opt == null || opt.equals(JSONObject.NULL)) {
            str2 = null;
        } else {
            str2 = opt.toString();
        }
        if (!z || (str2 != null && str2.length() != 0)) {
            return str2;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1dr, X.Akx, java.lang.Object] */
    public static final C21488Akx A04(JSONArray jSONArray) {
        JsonExtKt$iterator$1 jsonExtKt$iterator$1 = new JsonExtKt$iterator$1((C30391dr) null, jSONArray);
        ? obj = new Object();
        obj.A01 = C30581eB.A01(obj, obj, jsonExtKt$iterator$1);
        return obj;
    }

    public static final Long A01(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.optLong(str));
    }

    public static final String A02(String str, JSONObject jSONObject) {
        return A03(str, jSONObject, C18070vi.A15(jSONObject, str));
    }
}
