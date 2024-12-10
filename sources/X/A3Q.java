package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public abstract /* synthetic */ class A3Q {
    public static boolean A01(Object obj, JSONObject jSONObject, Object[] objArr, int i) {
        objArr[i] = obj;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, objArr);
        return A02(hashSet, jSONObject);
    }

    public static String A00(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
            return null;
        }
        return optString;
    }

    public static boolean A02(Set set, JSONObject jSONObject) {
        HashSet A12 = C17880vN.A12();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (!jSONObject.has(A0v)) {
                A12.add(A0v);
            }
        }
        return A12.isEmpty();
    }
}
