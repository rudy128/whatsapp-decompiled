package X;

public abstract class CCX {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        r11.setSpan(r10, r6, r6 + r13, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass03P r19, X.DOZ r20, X.DFL r21, X.C26025Cqj r22) {
        /*
            java.lang.String r2 = "WaTextWithEntitiesComponentBinder"
            r0 = 43
            r4 = r19
            r3 = r20
            r5 = r21
            java.lang.String r6 = r5.A0D(r0)     // Catch:{ JSONException -> 0x0167 }
            r0 = 42
            java.util.List r1 = r5.A0G(r0)     // Catch:{ JSONException -> 0x0167 }
            r0 = 35
            java.util.List r17 = r5.A0G(r0)     // Catch:{ JSONException -> 0x0167 }
            r0 = 38
            java.util.List r16 = r5.A0G(r0)     // Catch:{ JSONException -> 0x0167 }
            r0 = 41
            java.util.List r15 = r5.A0G(r0)     // Catch:{ JSONException -> 0x0167 }
            r7 = 1
            X.D6J r9 = new X.D6J     // Catch:{ JSONException -> 0x0167 }
            r9.<init>(r3, r5, r7)     // Catch:{ JSONException -> 0x0167 }
            r4.getContext()     // Catch:{ JSONException -> 0x0167 }
            android.content.Context r8 = r3.A00     // Catch:{ JSONException -> 0x0167 }
            if (r6 == 0) goto L_0x0179
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder     // Catch:{ JSONException -> 0x0167 }
            r11.<init>(r6)     // Catch:{ JSONException -> 0x0167 }
            if (r1 == 0) goto L_0x00ad
            java.util.Iterator r14 = r1.iterator()     // Catch:{ JSONException -> 0x0167 }
        L_0x003e:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = X.C17880vN.A0v(r14)     // Catch:{ JSONException -> 0x0167 }
            org.json.JSONObject r10 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "offset"
            int r6 = r10.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "length"
            int r13 = r10.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r1 = "inline_style"
            boolean r0 = r10.has(r1)     // Catch:{ JSONException -> 0x0167 }
            if (r0 != 0) goto L_0x0062
            java.lang.String r1 = "style"
        L_0x0062:
            java.lang.String r10 = r10.getString(r1)     // Catch:{ JSONException -> 0x0167 }
            int r0 = r10.hashCode()     // Catch:{ JSONException -> 0x0167 }
            r12 = 2
            r1 = 0
            switch(r0) {
                case -2125451728: goto L_0x008c;
                case 2044549: goto L_0x007e;
                case 1759631020: goto L_0x0070;
                case 2143721139: goto L_0x009a;
                default: goto L_0x006f;
            }     // Catch:{ JSONException -> 0x0167 }
        L_0x006f:
            goto L_0x003e
        L_0x0070:
            java.lang.String r0 = "UNDERLINE"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan     // Catch:{ JSONException -> 0x0167 }
            r10.<init>()     // Catch:{ JSONException -> 0x0167 }
            goto L_0x00a7
        L_0x007e:
            java.lang.String r0 = "BOLD"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x003e
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan     // Catch:{ JSONException -> 0x0167 }
            r10.<init>(r7)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x00a7
        L_0x008c:
            java.lang.String r0 = "ITALIC"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x003e
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan     // Catch:{ JSONException -> 0x0167 }
            r10.<init>(r12)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x00a7
        L_0x009a:
            java.lang.String r0 = "STRIKETHROUGH"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x003e
            android.text.style.StrikethroughSpan r10 = new android.text.style.StrikethroughSpan     // Catch:{ JSONException -> 0x0167 }
            r10.<init>()     // Catch:{ JSONException -> 0x0167 }
        L_0x00a7:
            int r0 = r6 + r13
            r11.setSpan(r10, r6, r0, r1)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x003e
        L_0x00ad:
            r10 = 0
            if (r17 == 0) goto L_0x00f0
            java.util.Iterator r13 = r17.iterator()     // Catch:{ JSONException -> 0x0167 }
        L_0x00b4:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = X.C17880vN.A0v(r13)     // Catch:{ JSONException -> 0x0167 }
            org.json.JSONObject r12 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "offset"
            int r6 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "length"
            int r7 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r1 = "hex_rgb_color_with_pound_key"
            boolean r0 = r12.has(r1)     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r12.getString(r1)     // Catch:{ JSONException -> 0x0167 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ JSONException -> 0x0167 }
        L_0x00de:
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch:{ JSONException -> 0x0167 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0167 }
            int r0 = r6 + r7
            r11.setSpan(r1, r6, r0, r10)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x00b4
        L_0x00e9:
            java.lang.String r0 = "color"
            int r0 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x00de
        L_0x00f0:
            if (r16 == 0) goto L_0x0135
            java.util.Iterator r14 = r16.iterator()     // Catch:{ JSONException -> 0x0167 }
        L_0x00f6:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = X.C17880vN.A0v(r14)     // Catch:{ JSONException -> 0x0167 }
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0167 }
            X.CQT r13 = new X.CQT     // Catch:{ JSONException -> 0x0167 }
            r13.<init>(r0)     // Catch:{ JSONException -> 0x0167 }
            r0 = r22
            X.1KB r12 = r0.A01     // Catch:{ JSONException -> 0x0167 }
            X.11C r7 = r0.A03     // Catch:{ JSONException -> 0x0167 }
            X.1L8 r1 = r0.A00     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = r13.A02     // Catch:{ JSONException -> 0x0167 }
            X.3cE r6 = new X.3cE     // Catch:{ JSONException -> 0x0167 }
            r19 = r12
            r20 = r7
            r21 = r0
            r16 = r6
            r17 = r8
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0167 }
            X.4gn r0 = new X.4gn     // Catch:{ JSONException -> 0x0167 }
            r0.<init>(r9, r13, r10)     // Catch:{ JSONException -> 0x0167 }
            r6.A04(r0)     // Catch:{ JSONException -> 0x0167 }
            int r1 = r13.A01     // Catch:{ JSONException -> 0x0167 }
            int r0 = r13.A00     // Catch:{ JSONException -> 0x0167 }
            int r0 = r0 + r1
            r11.setSpan(r6, r1, r0, r10)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x00f6
        L_0x0135:
            if (r15 == 0) goto L_0x0176
            java.util.Iterator r12 = r15.iterator()     // Catch:{ JSONException -> 0x0167 }
        L_0x013b:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = X.C17880vN.A0v(r12)     // Catch:{ JSONException -> 0x0167 }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "offset"
            int r9 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "length"
            int r8 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "scale"
            double r6 = r1.getDouble(r0)     // Catch:{ JSONException -> 0x0167 }
            float r0 = (float) r6     // Catch:{ JSONException -> 0x0167 }
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan     // Catch:{ JSONException -> 0x0167 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0167 }
            int r0 = r9 + r8
            r11.setSpan(r1, r9, r0, r10)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x013b
        L_0x0167:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "bind/exception parsing formatted string: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)
            X.C25913CoX.A01(r2, r0)
            goto L_0x0179
        L_0x0176:
            r4.setText(r11)
        L_0x0179:
            r0 = 44
            java.lang.String r0 = r5.A0D(r0)
            if (r0 == 0) goto L_0x018f
            int r0 = X.A90.A06(r0)     // Catch:{ 9HX -> 0x0189 }
            r4.setGravity(r0)     // Catch:{ 9HX -> 0x0189 }
            goto L_0x018f
        L_0x0189:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse textAlign"
            X.C25913CoX.A00(r3, r2, r0, r1)
        L_0x018f:
            r0 = 45
            java.lang.String r0 = r5.A0D(r0)
            if (r0 == 0) goto L_0x01a5
            float r0 = X.A90.A02(r0)     // Catch:{ 9HX -> 0x019f }
            r4.setTextSize(r0)     // Catch:{ 9HX -> 0x019f }
            goto L_0x01a5
        L_0x019f:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse text size"
            X.C25913CoX.A00(r3, r2, r0, r1)
        L_0x01a5:
            java.lang.String r0 = X.BE7.A0e(r5)
            if (r0 == 0) goto L_0x01ba
            float r0 = X.A90.A01(r0)     // Catch:{ 9HX -> 0x01b4 }
            int r0 = (int) r0     // Catch:{ 9HX -> 0x01b4 }
            r4.setLineHeight(r0)     // Catch:{ 9HX -> 0x01b4 }
            return
        L_0x01b4:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse line height pixel value"
            X.C25913CoX.A00(r3, r2, r0, r1)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CCX.A00(X.03P, X.DOZ, X.DFL, X.Cqj):void");
    }
}
