package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class A3T {
    public static final AEZ A00(Context context, List list) {
        BDZ bdz;
        if (list != null && !list.isEmpty()) {
            C20251ADj aDj = (C20251ADj) list.get(0);
            if (C18070vi.A18(aDj.A01, "payment_link") && (bdz = aDj.A00) != null) {
                String A10 = AnonymousClass3Ma.A10(context, Uri.parse(((C20932Abm) bdz).A02).getHost(), AnonymousClass3MW.A1a(), 0, 2131893219);
                String A0F = C18070vi.A0F(context, 2131887451);
                return new AEZ(new C194019r2((SpannableString) null, false), new C194029r3((SpannableString) null, false), new C194039r4((SpannableString) null, false), "checkout_lite", "", A10, "", "", "", A0F, (List) null, 0, false);
            }
        }
        return null;
    }

    public static LinkedHashMap A01(Context context, String str, List list) {
        LinkedHashMap A02 = A02(str);
        AEZ A00 = A00(context, list);
        if (A00 != null) {
            A02.put("checkout_lite", A00);
        }
        return A02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: org.json.JSONObject[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.84U} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A02(java.lang.String r20) {
        /*
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            if (r20 == 0) goto L_0x00c6
            org.json.JSONObject r1 = X.C17880vN.A16(r20)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r0 = "payment_options"
            org.json.JSONArray r6 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x00bc }
            X.C18070vi.A0b(r6)     // Catch:{ JSONException -> 0x00bc }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x00bc }
            org.json.JSONObject[] r2 = new org.json.JSONObject[r3]     // Catch:{ JSONException -> 0x00bc }
            r1 = 0
            r5 = 0
        L_0x001b:
            if (r5 >= r3) goto L_0x0026
            java.lang.Object r0 = r6.get(r5)     // Catch:{ JSONException -> 0x00bc }
            r2[r5] = r0     // Catch:{ JSONException -> 0x00bc }
            int r5 = r5 + 1
            goto L_0x001b
        L_0x0026:
            if (r1 >= r3) goto L_0x00c6
            r9 = r2[r1]     // Catch:{ JSONException -> 0x00bc }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r5 = "type"
            java.lang.String r11 = r9.getString(r5)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r5 = "url_regex_list"
            org.json.JSONArray r7 = r9.getJSONArray(r5)     // Catch:{ JSONException -> 0x00bc }
            X.C18070vi.A0b(r7)     // Catch:{ JSONException -> 0x00bc }
            int r10 = r7.length()     // Catch:{ JSONException -> 0x00bc }
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ JSONException -> 0x00bc }
            r6 = 0
        L_0x0044:
            if (r6 >= r10) goto L_0x004f
            java.lang.Object r5 = r7.get(r6)     // Catch:{ JSONException -> 0x00bc }
            r8[r6] = r5     // Catch:{ JSONException -> 0x00bc }
            int r6 = r6 + 1
            goto L_0x0044
        L_0x004f:
            java.util.ArrayList r6 = X.C17880vN.A0z(r10)     // Catch:{ JSONException -> 0x00bc }
            r7 = 0
        L_0x0054:
            if (r7 >= r10) goto L_0x005e
            r5 = r8[r7]     // Catch:{ JSONException -> 0x00bc }
            r6.add(r5)     // Catch:{ JSONException -> 0x00bc }
            int r7 = r7 + 1
            goto L_0x0054
        L_0x005e:
            java.lang.String r5 = "title"
            org.json.JSONObject r5 = r9.getJSONObject(r5)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r8 = "name"
            java.lang.String r12 = r5.getString(r8)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r7 = "default_text"
            java.lang.String r13 = r5.getString(r7)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r5 = "subtitle"
            org.json.JSONObject r5 = r9.getJSONObject(r5)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r14 = r5.getString(r8)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r15 = r5.getString(r7)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r5 = "button"
            org.json.JSONObject r5 = r9.getJSONObject(r5)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r16 = r5.getString(r8)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r17 = r5.getString(r7)     // Catch:{ JSONException -> 0x00bc }
            r5 = 0
            X.9r4 r10 = new X.9r4     // Catch:{ JSONException -> 0x00bc }
            r10.<init>(r5, r0)     // Catch:{ JSONException -> 0x00bc }
            X.9r2 r8 = new X.9r2     // Catch:{ JSONException -> 0x00bc }
            r8.<init>(r5, r0)     // Catch:{ JSONException -> 0x00bc }
            X.9r3 r9 = new X.9r3     // Catch:{ JSONException -> 0x00bc }
            r9.<init>(r5, r0)     // Catch:{ JSONException -> 0x00bc }
            X.C108995ce.A1H(r11, r12, r13, r14)     // Catch:{ JSONException -> 0x00bc }
            X.C18070vi.A0b(r15)     // Catch:{ JSONException -> 0x00bc }
            X.C18070vi.A0b(r16)     // Catch:{ JSONException -> 0x00bc }
            X.C18070vi.A0b(r17)     // Catch:{ JSONException -> 0x00bc }
            r20 = 1
            X.AEZ r7 = new X.AEZ     // Catch:{ JSONException -> 0x00bc }
            r18 = r6
            r19 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r0 = r7.A0A     // Catch:{ JSONException -> 0x00bc }
            r4.put(r0, r7)     // Catch:{ JSONException -> 0x00bc }
            int r1 = r1 + 1
            goto L_0x0026
        L_0x00bc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OrderDetailsPaymentOptions/parseOptions failed to parse payment options json: "
            X.C108995ce.A1M(r0, r1, r2)
        L_0x00c6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A3T.A02(java.lang.String):java.util.LinkedHashMap");
    }
}
