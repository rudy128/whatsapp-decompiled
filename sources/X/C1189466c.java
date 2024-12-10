package X;

/* renamed from: X.66c  reason: invalid class name and case insensitive filesystem */
public final class C1189466c extends AnonymousClass161 {
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(org.json.JSONObject r18, long r19) {
        /*
            r17 = this;
            java.lang.String r6 = "message"
            java.lang.String r5 = "imagine_result_success"
            r1 = r18
            if (r18 == 0) goto L_0x013f
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            X.0wS r7 = X.C18460wS.A00
            r3 = 0
            java.lang.String r0 = "xwa_genai_imagine_for_intents_wa"
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x012a }
            X.C18070vi.A0b(r2)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r0 = "success"
            java.lang.Boolean r1 = X.A6n.A00(r0, r2)     // Catch:{ JSONException -> 0x012a }
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ JSONException -> 0x012a }
            boolean r3 = X.C18070vi.A18(r1, r0)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r0 = "response"
            org.json.JSONArray r2 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x012a }
            int r1 = r2.length()     // Catch:{ JSONException -> 0x012a }
            r0 = 0
        L_0x0031:
            if (r0 >= r1) goto L_0x0109
            org.json.JSONObject r9 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x012a }
            boolean r8 = r9.has(r5)     // Catch:{ JSONException -> 0x012a }
            if (r8 == 0) goto L_0x00cc
            org.json.JSONObject r10 = r9.getJSONObject(r5)     // Catch:{ JSONException -> 0x012a }
            X.C18070vi.A0b(r10)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r8 = "uri"
            java.lang.String r12 = X.A6n.A02(r8, r10)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r8 = "response_id"
            java.lang.String r13 = X.A6n.A02(r8, r10)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r8 = "image_id"
            java.lang.String r14 = X.A6n.A02(r8, r10)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r8 = "request_id"
            java.lang.String r8 = X.A6n.A02(r8, r10)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r9 = "media_type"
            java.lang.String r15 = X.A6n.A02(r9, r10)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r9 = "is_unwatermarked"
            java.lang.Boolean r11 = X.A6n.A00(r9, r10)     // Catch:{ JSONException -> 0x012a }
            if (r12 == 0) goto L_0x0097
            if (r13 == 0) goto L_0x0097
            if (r14 == 0) goto L_0x0097
            if (r8 == 0) goto L_0x0097
            if (r15 == 0) goto L_0x0097
            if (r11 == 0) goto L_0x0097
            boolean r16 = r11.booleanValue()     // Catch:{ JSONException -> 0x012a }
            java.lang.Object r9 = r4.get(r8)     // Catch:{ JSONException -> 0x012a }
            java.util.List r9 = (java.util.List) r9     // Catch:{ JSONException -> 0x012a }
            X.5ym r11 = new X.5ym     // Catch:{ JSONException -> 0x012a }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x012a }
            if (r9 == 0) goto L_0x0089
            r9.add(r11)     // Catch:{ JSONException -> 0x012a }
            goto L_0x0105
        L_0x0089:
            r9 = 1
            X.5ym[] r10 = new X.C116885ym[r9]     // Catch:{ JSONException -> 0x012a }
            r9 = 0
            r10[r9] = r11     // Catch:{ JSONException -> 0x012a }
            java.util.ArrayList r9 = X.AnonymousClass1ZU.A06(r10)     // Catch:{ JSONException -> 0x012a }
            r4.put(r8, r9)     // Catch:{ JSONException -> 0x012a }
            goto L_0x0105
        L_0x0097:
            java.lang.String r10 = "ImagineIntentsDataProcessor items that are null: "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x012a }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x012a }
            if (r12 != 0) goto L_0x00a5
            java.lang.String r10 = "uri "
            r9.append(r10)     // Catch:{ JSONException -> 0x012a }
        L_0x00a5:
            if (r13 != 0) goto L_0x00ac
            java.lang.String r10 = "responseId "
            r9.append(r10)     // Catch:{ JSONException -> 0x012a }
        L_0x00ac:
            if (r14 != 0) goto L_0x00b3
            java.lang.String r10 = "imageId "
            r9.append(r10)     // Catch:{ JSONException -> 0x012a }
        L_0x00b3:
            if (r8 != 0) goto L_0x00ba
            java.lang.String r8 = "requestId "
            r9.append(r8)     // Catch:{ JSONException -> 0x012a }
        L_0x00ba:
            if (r15 != 0) goto L_0x00c1
            java.lang.String r8 = "mediaType "
            r9.append(r8)     // Catch:{ JSONException -> 0x012a }
        L_0x00c1:
            if (r11 != 0) goto L_0x00c8
            java.lang.String r8 = "isUnwatermarked "
            r9.append(r8)     // Catch:{ JSONException -> 0x012a }
        L_0x00c8:
            X.C17890vO.A0w(r9)     // Catch:{ JSONException -> 0x012a }
            goto L_0x0105
        L_0x00cc:
            boolean r8 = r9.has(r6)     // Catch:{ JSONException -> 0x012a }
            if (r8 == 0) goto L_0x0105
            java.lang.String r10 = X.A6n.A02(r6, r9)     // Catch:{ JSONException -> 0x012a }
            java.lang.String r9 = "error_message_key"
            java.lang.Object r8 = r4.get(r9)     // Catch:{ JSONException -> 0x012a }
            java.util.List r8 = (java.util.List) r8     // Catch:{ JSONException -> 0x012a }
            java.lang.String r12 = ""
            r16 = 0
            X.5ym r11 = new X.5ym     // Catch:{ JSONException -> 0x012a }
            r14 = r12
            r15 = r12
            r13 = r12
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x012a }
            if (r8 == 0) goto L_0x00f0
            r8.add(r11)     // Catch:{ JSONException -> 0x012a }
            goto L_0x00fc
        L_0x00f0:
            r8 = 1
            X.5ym[] r8 = new X.C116885ym[r8]     // Catch:{ JSONException -> 0x012a }
            r8[r16] = r11     // Catch:{ JSONException -> 0x012a }
            java.util.ArrayList r8 = X.AnonymousClass1ZU.A06(r8)     // Catch:{ JSONException -> 0x012a }
            r4.put(r9, r8)     // Catch:{ JSONException -> 0x012a }
        L_0x00fc:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x012a }
            java.lang.String r8 = "ImagineIntentsDataProcessor received error on RootResponse/"
            X.C17900vP.A0e(r8, r10, r9)     // Catch:{ JSONException -> 0x012a }
        L_0x0105:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x0109:
            java.util.ArrayList r5 = X.C72453Mb.A11(r4)     // Catch:{ JSONException -> 0x012a }
            java.util.Iterator r2 = X.AnonymousClass000.A15(r4)     // Catch:{ JSONException -> 0x012a }
        L_0x0111:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x012a }
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = X.C17890vO.A0P(r2)     // Catch:{ JSONException -> 0x012a }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ JSONException -> 0x012a }
            java.util.List r1 = X.C29431cG.A0t(r0)     // Catch:{ JSONException -> 0x012a }
            X.5yq r0 = new X.5yq     // Catch:{ JSONException -> 0x012a }
            r0.<init>(r1, r3)     // Catch:{ JSONException -> 0x012a }
            r5.add(r0)     // Catch:{ JSONException -> 0x012a }
            goto L_0x0111
        L_0x012a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineIntentsDataProcessor JsonParsingException on RootResponse/"
            X.C17900vP.A0X(r2, r0, r1)
            goto L_0x0136
        L_0x0135:
            r7 = r5
        L_0x0136:
            X.6dv r1 = new X.6dv
            r1.<init>(r7, r3)
            r0 = r17
            r0.A00 = r1
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1189466c.A02(org.json.JSONObject, long):void");
    }
}
