package X;

import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class A4Z {
    public static final A4Z[] A04 = new A4Z[0];
    public final C199229ze A00;
    public final C199229ze A01;
    public final A40 A02;
    public final Pattern A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r1 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r2 = (X.A44) r2.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        if ((X.AnonymousClass8BU.A1V(r1, r2.A00) ^ r2.A01) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.content.Intent r10) {
        /*
            r9 = this;
            r8 = 0
            X.9NB r5 = X.C180909Ok.A00(r10)     // Catch:{ JSONException -> 0x009b }
            java.util.List r1 = r5.A00     // Catch:{ JSONException -> 0x009b }
            X.A40 r4 = r9.A02     // Catch:{ JSONException -> 0x009b }
            if (r4 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.isEmpty()     // Catch:{ JSONException -> 0x009b }
            if (r0 != 0) goto L_0x0098
            java.util.Iterator r7 = r1.iterator()     // Catch:{ JSONException -> 0x009b }
        L_0x0017:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0098
            java.lang.Object r3 = r7.next()     // Catch:{ JSONException -> 0x009b }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ JSONException -> 0x009b }
            java.util.Map r0 = r4.A00     // Catch:{ JSONException -> 0x009b }
            java.util.Iterator r6 = X.AnonymousClass000.A15(r0)     // Catch:{ JSONException -> 0x009b }
        L_0x0029:
            boolean r0 = r6.hasNext()     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0086
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r6)     // Catch:{ JSONException -> 0x009b }
            java.lang.String r1 = X.C17880vN.A0x(r2)     // Catch:{ JSONException -> 0x009b }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x009b }
            switch(r0) {
                case -907987547: goto L_0x0066;
                case 3433509: goto L_0x0059;
                case 107944136: goto L_0x004c;
                case 1475610435: goto L_0x003f;
                default: goto L_0x003e;
            }     // Catch:{ JSONException -> 0x009b }
        L_0x003e:
            goto L_0x0017
        L_0x003f:
            java.lang.String r0 = "authority"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r3.getAuthority()     // Catch:{ JSONException -> 0x009b }
            goto L_0x0072
        L_0x004c:
            java.lang.String r0 = "query"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r3.getQuery()     // Catch:{ JSONException -> 0x009b }
            goto L_0x0072
        L_0x0059:
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r3.getPath()     // Catch:{ JSONException -> 0x009b }
            goto L_0x0072
        L_0x0066:
            java.lang.String r0 = "scheme"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r3.getScheme()     // Catch:{ JSONException -> 0x009b }
        L_0x0072:
            if (r1 == 0) goto L_0x0017
            java.lang.Object r2 = r2.getValue()     // Catch:{ JSONException -> 0x009b }
            X.A44 r2 = (X.A44) r2     // Catch:{ JSONException -> 0x009b }
            java.util.regex.Pattern r0 = r2.A00     // Catch:{ JSONException -> 0x009b }
            boolean r1 = X.AnonymousClass8BU.A1V(r1, r0)     // Catch:{ JSONException -> 0x009b }
            boolean r0 = r2.A01     // Catch:{ JSONException -> 0x009b }
            r1 = r1 ^ r0
            if (r1 != 0) goto L_0x0029
            goto L_0x0017
        L_0x0086:
            org.json.JSONObject r2 = r5.A01     // Catch:{ JSONException -> 0x009b }
            android.content.Intent r1 = r10.getSelector()     // Catch:{ JSONException -> 0x009b }
            X.9ze r0 = r9.A01     // Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0098
            boolean r0 = r0.A01(r1, r2)     // Catch:{ JSONException -> 0x009b }
            if (r0 != 0) goto L_0x0099
        L_0x0098:
            return r8
        L_0x0099:
            r0 = 1
            return r0
        L_0x009b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4Z.A01(android.content.Intent):boolean");
    }

    public static A4Z[] A00(String str) {
        String str2;
        C199229ze r2;
        A40 a40;
        if (str == null) {
            return A04;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                A4Z[] a4zArr = new A4Z[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C199229ze r11 = null;
                    if (jSONObject.has("endpoint_name")) {
                        str2 = jSONObject.getString("endpoint_name");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("caller_info")) {
                        r2 = C199229ze.A00(jSONObject.getJSONObject("caller_info"));
                    } else {
                        r2 = null;
                    }
                    if (jSONObject.has("uri_component")) {
                        a40 = A40.A00(jSONObject.getJSONObject("uri_component"));
                    } else {
                        a40 = null;
                    }
                    if (jSONObject.has("intent_field")) {
                        r11 = C199229ze.A00(jSONObject.getJSONObject("intent_field"));
                    }
                    a4zArr[i] = new A4Z(r2, r11, a40, str2);
                }
                return a4zArr;
            }
        } catch (JSONException unused) {
        }
        return A04;
    }

    public A4Z(C199229ze r2, C199229ze r3, A40 a40, String str) {
        Pattern compile;
        if (str == null) {
            compile = null;
        } else {
            compile = Pattern.compile(str, 32);
        }
        this.A03 = compile;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = a40;
    }
}
