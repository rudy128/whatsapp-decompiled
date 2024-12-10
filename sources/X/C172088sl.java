package X;

/* renamed from: X.8sl  reason: invalid class name and case insensitive filesystem */
public final class C172088sl extends C136716uH {
    public final C18030ve A00;

    public C172088sl(C18030ve r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        X.C18070vi.A0X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d1, code lost:
        r9 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r12) {
        /*
            r11 = this;
            org.json.JSONObject r5 = X.C17880vN.A15()
            org.json.JSONObject r1 = r11.A00
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            if (r0 == 0) goto L_0x00ea
            java.util.HashMap r1 = X.A3M.A02(r0)
            int r0 = r1.size()
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r10 = X.C17890vO.A0i(r1)
        L_0x0023:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r10)
            java.lang.Object r7 = r0.getKey()
            java.lang.String r8 = X.C17880vN.A0x(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x00df
            java.util.Map r2 = (java.util.Map) r2
            java.util.LinkedHashMap r4 = X.AnonymousClass1D7.A08(r2)
            java.lang.String r0 = "type"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "defaultValue"
            java.lang.Object r9 = r2.get(r3)
            if (r9 != 0) goto L_0x0057
            java.lang.String r9 = ""
        L_0x0057:
            X.C18070vi.A0b(r8)
            int r8 = java.lang.Integer.parseInt(r8)
            int r0 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x00be }
            switch(r0) {
                case -891985903: goto L_0x0066;
                case 104431: goto L_0x0075;
                case 3029738: goto L_0x008a;
                case 3271912: goto L_0x0099;
                case 97526364: goto L_0x00ab;
                default: goto L_0x0065;
            }     // Catch:{ IllegalArgumentException -> 0x00be }
        L_0x0065:
            goto L_0x00d2
        L_0x0066:
            java.lang.String r0 = "string"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            if (r0 == 0) goto L_0x00d2
            X.0ve r0 = r11.A00     // Catch:{ IllegalArgumentException -> 0x00be }
            java.lang.String r0 = r0.A0I(r8)     // Catch:{ IllegalArgumentException -> 0x00be }
            goto L_0x00a7
        L_0x0075:
            java.lang.String r0 = "int"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            if (r0 == 0) goto L_0x00d2
            X.0ve r1 = r11.A00     // Catch:{ IllegalArgumentException -> 0x00be }
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IllegalArgumentException -> 0x00be }
            int r0 = X.C18020vd.A00(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x00be }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            goto L_0x00d1
        L_0x008a:
            java.lang.String r0 = "bool"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            if (r0 == 0) goto L_0x00d2
            X.0ve r0 = r11.A00     // Catch:{ IllegalArgumentException -> 0x00be }
            java.lang.Boolean r0 = X.AnonymousClass3MZ.A15(r0, r8)     // Catch:{ IllegalArgumentException -> 0x00be }
            goto L_0x00d1
        L_0x0099:
            java.lang.String r0 = "json"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            if (r0 == 0) goto L_0x00d2
            X.0ve r0 = r11.A00     // Catch:{ IllegalArgumentException -> 0x00be }
            org.json.JSONObject r0 = r0.A0J(r8)     // Catch:{ IllegalArgumentException -> 0x00be }
        L_0x00a7:
            X.C18070vi.A0X(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            goto L_0x00d1
        L_0x00ab:
            java.lang.String r0 = "float"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            if (r0 == 0) goto L_0x00d2
            X.0ve r0 = r11.A00     // Catch:{ IllegalArgumentException -> 0x00be }
            float r0 = r0.A0E(r8)     // Catch:{ IllegalArgumentException -> 0x00be }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00be }
            goto L_0x00d1
        L_0x00be:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsGetClientAbProps/getABPropVal - ABProp field doesn't exists with code = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " - "
            X.C108995ce.A1M(r0, r1, r2)
            goto L_0x00d2
        L_0x00d1:
            r9 = r0
        L_0x00d2:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "value"
            r4.put(r0, r1)
            r4.remove(r3)
            r2 = r4
        L_0x00df:
            r6.put(r7, r2)
            goto L_0x0023
        L_0x00e4:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r6)
            goto L_0x00ee
        L_0x00ea:
            org.json.JSONObject r1 = X.C17880vN.A15()
        L_0x00ee:
            java.lang.String r0 = "responseData"
            org.json.JSONObject r0 = r5.put(r0, r1)
            X.C18070vi.A0b(r0)
            r11.A03(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172088sl.A04(X.1dr):java.lang.Object");
    }
}
