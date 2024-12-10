package X;

import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: X.A5n  reason: case insensitive filesystem */
public abstract class C20064A5n {
    public static final String A01(String str, String str2, JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return str2;
    }

    public static final String A02(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            String string = jSONObject.getString(str);
            C18070vi.A0b(string);
            return string;
        }
        throw new JSONException(C108955ca.A12(Locale.ENGLISH, "%s is null", C108945cZ.A1b(str, new Object[1], 0, 1)));
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L_0x002a
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Iterator r2 = X.AnonymousClass8BS.A0s(r4)
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = X.C17880vN.A0v(r2)
            java.lang.Object r0 = r4.get(r1)
            X.C18070vi.A0b(r1)
            X.C18070vi.A0b(r0)
            java.lang.Object r0 = A00(r0)
            r3.put(r1, r0)
            goto L_0x000e
        L_0x002a:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x004d
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r2 = r4.length()
            r1 = 0
        L_0x0039:
            if (r1 >= r2) goto L_0x004c
            java.lang.Object r0 = r4.get(r1)
            X.C18070vi.A0X(r0)
            java.lang.Object r0 = A00(r0)
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x0039
        L_0x004c:
            return r3
        L_0x004d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20064A5n.A00(java.lang.Object):java.lang.Object");
    }

    public static final Map A03(String str) {
        Map map;
        Object nextValue = new JSONTokener(str).nextValue();
        C18070vi.A0b(nextValue);
        Object A00 = A00(nextValue);
        if (!(A00 instanceof Map) || (map = (Map) A00) == null) {
            return AnonymousClass1D7.A0I();
        }
        return map;
    }
}
