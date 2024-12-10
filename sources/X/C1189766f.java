package X;

/* renamed from: X.66f  reason: invalid class name and case insensitive filesystem */
public final class C1189766f extends AnonymousClass161 {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(org.json.JSONObject r22, long r23) {
        /*
            r21 = this;
            java.lang.String r2 = "metadata"
            r4 = r22
            if (r22 == 0) goto L_0x00bd
            java.lang.String r1 = "xwa_ai_stickers"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00bd
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            org.json.JSONObject r1 = r4.getJSONObject(r1)
            java.lang.String r0 = "stickers"
            org.json.JSONArray r4 = r1.getJSONArray(r0)
            r12 = 0
            boolean r0 = r1.has(r2)     // Catch:{ Exception -> 0x0042 }
            if (r0 == 0) goto L_0x0046
            boolean r0 = r1.isNull(r2)     // Catch:{ Exception -> 0x0042 }
            if (r0 != 0) goto L_0x0046
            org.json.JSONObject r5 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r0 = "step1_d"
            long r0 = r5.getLong(r0)     // Catch:{ Exception -> 0x0042 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r0 = "step2_d"
            long r0 = r5.getLong(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0043
        L_0x0042:
            r2 = r12
        L_0x0043:
            r13 = r12
            r12 = r2
            goto L_0x0047
        L_0x0046:
            r13 = r12
        L_0x0047:
            int r2 = r4.length()
            r1 = 0
        L_0x004c:
            if (r1 >= r2) goto L_0x00b9
            org.json.JSONObject r7 = r4.getJSONObject(r1)
            X.C18070vi.A0b(r7)
            r0 = 5
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r11 = "image_uri"
            r0 = 0
            r5[r0] = r11
            java.lang.String r10 = "request_id"
            r0 = 1
            r5[r0] = r10
            r0 = 2
            java.lang.String r9 = "response_id"
            r5[r0] = r9
            r0 = 3
            java.lang.String r8 = "prompt"
            r5[r0] = r8
            r0 = 4
            java.lang.String r6 = "integrity_image_key"
            java.util.List r5 = X.C18070vi.A0O(r6, r5, r0)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00a4
        L_0x007d:
            java.lang.String r16 = r7.getString(r11)
            java.lang.String r19 = r7.getString(r10)
            java.lang.String r20 = r7.getString(r9)
            java.lang.String r15 = r7.getString(r8)
            java.lang.String r0 = "media_type"
            java.lang.String r14 = r7.getString(r0)
            java.lang.String r17 = r7.getString(r6)
            r18 = 0
            X.77V r11 = new X.77V
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.add(r11)
        L_0x00a1:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x00a4:
            java.util.Iterator r5 = r5.iterator()
        L_0x00a8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = X.C17880vN.A0v(r5)
            boolean r0 = r7.has(r0)
            if (r0 != 0) goto L_0x00a8
            goto L_0x00a1
        L_0x00b9:
            r0 = r21
            r0.A00 = r3
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1189766f.A02(org.json.JSONObject, long):void");
    }
}
