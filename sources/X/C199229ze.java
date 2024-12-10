package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ze  reason: invalid class name and case insensitive filesystem */
public class C199229ze {
    public final Map A00;
    public final A40 A01;
    public final A4Z[] A02;

    public static C199229ze A00(JSONObject jSONObject) {
        C199229ze r0;
        String string;
        if (jSONObject == null) {
            return null;
        }
        HashMap A11 = C17880vN.A11();
        A4Z[] a4zArr = new A4Z[0];
        try {
            Iterator<String> keys = jSONObject.keys();
            A40 a40 = null;
            while (keys.hasNext()) {
                String A0v = C17880vN.A0v(keys);
                if (!A0v.equals("selector_config")) {
                    if (A0v.equals("clip_data")) {
                        a40 = A40.A00(jSONObject.getJSONObject("clip_data"));
                    } else if (jSONObject.has(A0v)) {
                        A11.put(A0v, A44.A00(jSONObject.get(A0v)));
                    }
                }
            }
            if (jSONObject.has("selector_config") && (string = jSONObject.getString("selector_config")) != null) {
                a4zArr = A4Z.A00(string);
            }
            if (A11.isEmpty()) {
                return null;
            }
            if (a4zArr.length > 0) {
                return r0;
            }
            r0 = new C199229ze(a40, A11, (A4Z[]) null);
            return r0;
        } catch (IllegalArgumentException | JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.content.Intent r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            java.lang.String r3 = "clip_data"
            r12 = 0
            java.util.Map r4 = r13.A00     // Catch:{  }
            java.util.Iterator r11 = X.AnonymousClass000.A15(r4)     // Catch:{  }
        L_0x0009:
            boolean r0 = r11.hasNext()     // Catch:{  }
            if (r0 == 0) goto L_0x0112
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r11)     // Catch:{  }
            java.lang.String r1 = X.C17880vN.A0x(r2)     // Catch:{  }
            java.lang.String r0 = "categories"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x004a
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0178
            org.json.JSONArray r6 = r15.getJSONArray(r1)     // Catch:{  }
            if (r6 == 0) goto L_0x0178
            java.lang.Object r5 = r2.getValue()     // Catch:{  }
            X.A44 r5 = (X.A44) r5     // Catch:{  }
            r2 = 0
        L_0x0032:
            int r0 = r6.length()     // Catch:{  }
            if (r2 >= r0) goto L_0x0178
            java.lang.String r1 = r6.getString(r2)     // Catch:{  }
            java.util.regex.Pattern r0 = r5.A00     // Catch:{  }
            boolean r1 = X.AnonymousClass8BU.A1V(r1, r0)     // Catch:{  }
            boolean r0 = r5.A01     // Catch:{  }
            r1 = r1 ^ r0
            if (r1 != 0) goto L_0x0009
            int r2 = r2 + 1
            goto L_0x0032
        L_0x004a:
            java.lang.String r0 = "extra_names"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0178
            org.json.JSONArray r8 = r15.getJSONArray(r1)     // Catch:{  }
            if (r8 == 0) goto L_0x0178
            java.lang.Object r7 = r2.getValue()     // Catch:{  }
            X.A44 r7 = (X.A44) r7     // Catch:{  }
            java.lang.String r1 = "extra_value_types"
            boolean r0 = r4.containsKey(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r6 = r4.get(r1)     // Catch:{  }
            X.A44 r6 = (X.A44) r6     // Catch:{  }
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            r5 = 0
        L_0x0075:
            int r0 = r8.length()     // Catch:{  }
            if (r5 >= r0) goto L_0x0178
            org.json.JSONObject r10 = r8.getJSONObject(r5)     // Catch:{  }
            java.lang.String r1 = "name"
            boolean r0 = r10.has(r1)     // Catch:{  }
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x00bd
            java.lang.String r2 = r10.getString(r1)     // Catch:{  }
        L_0x008d:
            java.lang.String r1 = "value_type"
            boolean r0 = r10.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r10.getString(r1)     // Catch:{  }
        L_0x0099:
            java.util.regex.Pattern r0 = r7.A00     // Catch:{  }
            boolean r2 = X.AnonymousClass8BU.A1V(r2, r0)     // Catch:{  }
            boolean r0 = r7.A01     // Catch:{  }
            r2 = r2 ^ r0
            if (r6 != 0) goto L_0x00a9
            boolean r1 = r1.equals(r9)     // Catch:{  }
            goto L_0x00b2
        L_0x00a9:
            java.util.regex.Pattern r0 = r6.A00     // Catch:{  }
            boolean r1 = X.AnonymousClass8BU.A1V(r1, r0)     // Catch:{  }
            boolean r0 = r6.A01     // Catch:{  }
            r1 = r1 ^ r0
        L_0x00b2:
            if (r2 == 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00b8
            goto L_0x0009
        L_0x00b8:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x00bb:
            r1 = r9
            goto L_0x0099
        L_0x00bd:
            r2 = r9
            goto L_0x008d
        L_0x00bf:
            java.lang.String r0 = "extra_value_types"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "flags"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00e2
            int r1 = r15.getInt(r1)     // Catch:{  }
        L_0x00d9:
            java.lang.Object r0 = r2.getValue()     // Catch:{  }
            X.A44 r0 = (X.A44) r0     // Catch:{  }
            java.util.regex.Pattern r0 = r0.A00     // Catch:{  }
            goto L_0x00e4
        L_0x00e2:
            r1 = 0
            goto L_0x00d9
        L_0x00e4:
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0178 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ JSONException -> 0x0178 }
            if (r1 == r0) goto L_0x0009
            r1 = r1 & r0
            if (r1 <= 0) goto L_0x0178
            goto L_0x0009
        L_0x00f3:
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x010f
            java.lang.String r1 = r15.getString(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x0178
        L_0x00ff:
            java.lang.Object r2 = r2.getValue()     // Catch:{  }
            X.A44 r2 = (X.A44) r2     // Catch:{  }
            java.util.regex.Pattern r0 = r2.A00     // Catch:{  }
            boolean r1 = X.AnonymousClass8BU.A1V(r1, r0)     // Catch:{  }
            boolean r0 = r2.A01     // Catch:{  }
            r1 = r1 ^ r0
            goto L_0x0176
        L_0x010f:
            java.lang.String r1 = ""
            goto L_0x00ff
        L_0x0112:
            X.A40 r6 = r13.A01     // Catch:{  }
            if (r6 == 0) goto L_0x015f
            boolean r0 = r15.has(r3)     // Catch:{  }
            if (r0 == 0) goto L_0x0178
            org.json.JSONArray r7 = r15.getJSONArray(r3)     // Catch:{  }
            if (r7 == 0) goto L_0x0178
            r5 = 0
        L_0x0123:
            int r0 = r7.length()     // Catch:{  }
            if (r5 >= r0) goto L_0x0178
            org.json.JSONObject r4 = r7.getJSONObject(r5)     // Catch:{  }
            java.util.Map r0 = r6.A00     // Catch:{ JSONException -> 0x015c }
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)     // Catch:{ JSONException -> 0x015c }
        L_0x0133:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x015c }
            if (r0 == 0) goto L_0x015f
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)     // Catch:{ JSONException -> 0x015c }
            java.lang.String r1 = X.C17880vN.A0x(r0)     // Catch:{ JSONException -> 0x015c }
            java.lang.Object r2 = r0.getValue()     // Catch:{ JSONException -> 0x015c }
            X.A44 r2 = (X.A44) r2     // Catch:{ JSONException -> 0x015c }
            boolean r0 = r4.has(r1)     // Catch:{ JSONException -> 0x015c }
            if (r0 == 0) goto L_0x015c
            java.lang.String r1 = r4.getString(r1)     // Catch:{ JSONException -> 0x015c }
            java.util.regex.Pattern r0 = r2.A00     // Catch:{ JSONException -> 0x015c }
            boolean r1 = X.AnonymousClass8BU.A1V(r1, r0)     // Catch:{ JSONException -> 0x015c }
            boolean r0 = r2.A01     // Catch:{ JSONException -> 0x015c }
            r1 = r1 ^ r0
            if (r1 != 0) goto L_0x0133
        L_0x015c:
            int r5 = r5 + 1
            goto L_0x0123
        L_0x015f:
            X.A4Z[] r3 = r13.A02
            if (r3 == 0) goto L_0x0179
            int r2 = r3.length
            if (r2 <= 0) goto L_0x0179
            if (r14 == 0) goto L_0x0178
            r1 = 0
        L_0x0169:
            r0 = r3[r1]
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0178
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0179
            goto L_0x0169
        L_0x0176:
            if (r1 != 0) goto L_0x0009
        L_0x0178:
            return r12
        L_0x0179:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199229ze.A01(android.content.Intent, org.json.JSONObject):boolean");
    }

    public C199229ze(A40 a40, Map map, A4Z[] a4zArr) {
        this.A00 = map;
        this.A02 = a4zArr;
        this.A01 = a40;
    }
}
