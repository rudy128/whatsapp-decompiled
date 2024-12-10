package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class A3M {
    public static ArrayList A00(JSONArray jSONArray) {
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            A13.add(obj);
        }
        return A13;
    }

    public static HashMap A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return C17880vN.A11();
        }
        try {
            return A02(C17880vN.A16(str));
        } catch (JSONException unused) {
            return C17880vN.A11();
        }
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A11 = C17880vN.A11();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0v = C17880vN.A0v(keys);
            Object obj = jSONObject.get(A0v);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            A11.put(A0v, obj);
        }
        return A11;
    }
}
