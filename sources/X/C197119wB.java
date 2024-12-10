package X;

import android.text.TextUtils;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9wB  reason: invalid class name and case insensitive filesystem */
public abstract class C197119wB {
    public static final C183729Zj A00 = new C183729Zj(Collections.emptyList(), AnonymousClass000.A13());

    public static JSONObject A00(String str, String str2, String str3, String str4) {
        JSONObject A15 = C17880vN.A15();
        try {
            if (!TextUtils.isEmpty(str4)) {
                A15.put("scheme", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                A15.put("authority", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                A15.put("path", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                A15.put("query", str3);
            }
        } catch (JSONException unused) {
        }
        return A15;
    }
}
