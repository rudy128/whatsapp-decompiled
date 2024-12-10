package X;

/* renamed from: X.66Z  reason: invalid class name */
public final class AnonymousClass66Z extends AnonymousClass161 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(org.json.JSONObject r16, long r17) {
        /*
            r15 = this;
            java.lang.String r8 = "message"
            java.lang.String r7 = "imagine_result_success"
            r1 = r16
            if (r16 == 0) goto L_0x00ac
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r5 = 0
            java.lang.String r0 = "xwa_genai_imagine_animate_for_intents_wa"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0097 }
            X.C18070vi.A0b(r1)     // Catch:{ JSONException -> 0x0097 }
            java.lang.String r0 = "success"
            java.lang.Boolean r0 = X.A6n.A00(r0, r1)     // Catch:{ JSONException -> 0x0097 }
            boolean r6 = X.C72463Mc.A1Y(r0)     // Catch:{ JSONException -> 0x0097 }
            java.lang.String r0 = "response"
            org.json.JSONArray r3 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0099 }
            int r2 = r3.length()     // Catch:{ JSONException -> 0x0099 }
        L_0x002a:
            if (r5 >= r2) goto L_0x00a5
            org.json.JSONObject r1 = r3.getJSONObject(r5)     // Catch:{ JSONException -> 0x0099 }
            boolean r0 = r1.has(r7)     // Catch:{ JSONException -> 0x0099 }
            if (r0 == 0) goto L_0x007a
            org.json.JSONObject r9 = r1.getJSONObject(r7)     // Catch:{ JSONException -> 0x0099 }
            X.C18070vi.A0b(r9)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "uri"
            java.lang.String r10 = X.A6n.A02(r0, r9)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "response_id"
            java.lang.String r11 = X.A6n.A02(r0, r9)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "image_id"
            java.lang.String r12 = X.A6n.A02(r0, r9)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "request_id"
            java.lang.String r1 = X.A6n.A02(r0, r9)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "media_type"
            java.lang.String r13 = X.A6n.A02(r0, r9)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "is_unwatermarked"
            java.lang.Boolean r0 = X.A6n.A00(r0, r9)     // Catch:{ JSONException -> 0x0099 }
            if (r10 == 0) goto L_0x008f
            if (r11 == 0) goto L_0x008f
            if (r12 == 0) goto L_0x008f
            if (r1 == 0) goto L_0x008f
            if (r13 == 0) goto L_0x008f
            if (r0 == 0) goto L_0x008f
            boolean r14 = r0.booleanValue()     // Catch:{ JSONException -> 0x0099 }
            X.5yj r9 = new X.5yj     // Catch:{ JSONException -> 0x0099 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0099 }
            r4.add(r9)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x0094
        L_0x007a:
            boolean r0 = r1.has(r8)     // Catch:{ JSONException -> 0x0099 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r9 = r1.getString(r8)     // Catch:{ JSONException -> 0x0099 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r0 = "ImagineAnimateDataProcessor received error on RootResponse/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r9, r1)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x0091
        L_0x008f:
            java.lang.String r0 = "ImagineAnimateDataProcessor null response when parsing data key data"
        L_0x0091:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0099 }
        L_0x0094:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x0097:
            r2 = move-exception
            goto L_0x009b
        L_0x0099:
            r2 = move-exception
            r5 = r6
        L_0x009b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineAnimateDataProcessor JsonParsingException on RootResponse/"
            X.C17900vP.A0X(r2, r0, r1)
            r6 = r5
        L_0x00a5:
            X.5yn r0 = new X.5yn
            r0.<init>(r4, r6)
            r15.A00 = r0
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass66Z.A02(org.json.JSONObject, long):void");
    }
}
