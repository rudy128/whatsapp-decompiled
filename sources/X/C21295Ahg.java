package X;

/* renamed from: X.Ahg  reason: case insensitive filesystem */
public final class C21295Ahg implements BCJ {
    public final /* synthetic */ AnonymousClass97V A00;
    public final /* synthetic */ C56072gr A01;

    public C21295Ahg(AnonymousClass97V r1, C56072gr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bc5(AnonymousClass9FP r4) {
        this.A00.A00(r4.A03(), C60482o6.A00(r4.A03()));
    }

    public void Bc7(AnonymousClass9FG r4) {
        this.A00.A00(r4.A03(), C60482o6.A00(r4.A03()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0157, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0158, code lost:
        r8.A01.A00.A0E("StatusGraphql", "exception in handle iq response", r1);
        r8.A00.A01(r18, 200, 417, (java.lang.String) null, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:25:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0157 A[ExcHandler: NullPointerException | JSONException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bc8(X.AnonymousClass9FA r26) {
        /*
            r25 = this;
            java.lang.String r14 = "exception in handle iq response"
            java.lang.String r10 = "StatusGraphql"
            r0 = r26
            X.1ca r18 = r0.A03()
            r16 = 417(0x1a1, float:5.84E-43)
            r9 = 200(0xc8, float:2.8E-43)
            r8 = r25
            java.lang.String r0 = r0.A00     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            org.json.JSONObject r4 = X.C17880vN.A16(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r0 = "errors"
            org.json.JSONArray r1 = r4.optJSONArray(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r3 = "data"
            org.json.JSONObject r0 = r4.optJSONObject(r3)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r1 != 0) goto L_0x0025
            goto L_0x0045
        L_0x0025:
            int r0 = r1.length()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r0 <= 0) goto L_0x004c
            r0 = 0
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "extensions"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "error_code"
            int r11 = r1.optInt(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r11 <= 0) goto L_0x004c
            if (r11 == r9) goto L_0x0049
            goto L_0x0058
        L_0x0045:
            if (r0 == 0) goto L_0x004c
            r11 = 200(0xc8, float:2.8E-43)
        L_0x0049:
            r24 = 0
            goto L_0x005a
        L_0x004c:
            X.2gr r0 = r8.A01     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            X.190 r2 = r0.A00     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r1 = "response object is null"
            r0 = 1
            r2.A0G(r10, r1, r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r11 = 417(0x1a1, float:5.84E-43)
        L_0x0058:
            r24 = 1
        L_0x005a:
            r0 = 0
            if (r24 != 0) goto L_0x00a0
            r13 = 0
            org.json.JSONObject r3 = X.AnonymousClass8BS.A0w(r3, r4)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r2 = "xwa2_users_updates_since"
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince> r4 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.class
            org.json.JSONArray r12 = r3.optJSONArray(r2)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r7 = 0
            if (r12 == 0) goto L_0x0114
            r6 = 1
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r3[r13] = r2     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            java.lang.reflect.Constructor r5 = r4.getConstructor(r3)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            X.2AI r4 = new X.2AI     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            r4.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            r3 = 0
        L_0x007f:
            int r2 = r12.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            if (r3 >= r2) goto L_0x0099
            org.json.JSONObject r15 = r12.optJSONObject(r3)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            if (r15 == 0) goto L_0x0096
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0096, IllegalAccessException | NoSuchMethodException -> 0x0114 }
            r2[r13] = r15     // Catch:{ InstantiationException | InvocationTargetException -> 0x0096, IllegalAccessException | NoSuchMethodException -> 0x0114 }
            java.lang.Object r2 = r5.newInstance(r2)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0096, IllegalAccessException | NoSuchMethodException -> 0x0114 }
            r4.add((java.lang.Object) r2)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0096, IllegalAccessException | NoSuchMethodException -> 0x0114 }
        L_0x0096:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x0099:
            X.1IX r7 = r4.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0114, NullPointerException | JSONException -> 0x0157 }
            if (r7 == 0) goto L_0x0114
            goto L_0x00a3
        L_0x00a0:
            r21 = 0
            goto L_0x0102
        L_0x00a3:
            int r2 = r7.size()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r2 <= r13) goto L_0x0114
            java.lang.Object r4 = r7.get(r13)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince r4 = (com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince) r4     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r3 = "updates"
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates> r2 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.Updates.class
            X.1IX r3 = X.C108955ca.A0J(r4, r2, r3)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            X.C18070vi.A0X(r3)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            int r2 = r3.size()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r2 <= r13) goto L_0x00a0
            java.lang.Object r2 = r3.get(r13)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates r2 = (com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.Updates) r2     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r2 == 0) goto L_0x0114
            org.json.JSONObject r5 = r2.A00     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            int r3 = X.AnonymousClass8BT.A03(r5)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r2 = 1315213878(0x4e649236, float:9.5869683E8)
            if (r3 != r2) goto L_0x00a0
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate r4 = new com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r4.<init>(r5)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r2 = "dhash"
            java.lang.String r2 = r4.A0F(r2)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            long r0 = X.C20099A7c.A04(r2, r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.String r2 = "text"
            java.lang.String r21 = r4.A0F(r2)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r21 == 0) goto L_0x00f3
            int r2 = r21.length()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r2 != 0) goto L_0x0102
        L_0x00f3:
            X.2gr r2 = r8.A01     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            X.118 r2 = r2.A02     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            android.content.res.Resources r3 = X.AnonymousClass3MW.A05(r2)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r2 = 2131889231(0x7f120c4f, float:1.941312E38)
            java.lang.String r21 = r3.getString(r2)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
        L_0x0102:
            X.97V r2 = r8.A00     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r22 = r0
            r17 = r2
            r17.A01(r18, r19, r20, r21, r22, r24)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            return
        L_0x0114:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r0 = "Unable to find status update at ("
            r2.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r2.append(r13)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r0 = 44
            r2.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r2.append(r13)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r0 = ") in response data. "
            r2.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r7 == 0) goto L_0x0130
            goto L_0x0133
        L_0x0130:
            java.lang.String r0 = "updateSince object is null."
            goto L_0x013b
        L_0x0133:
            int r0 = r7.size()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            if (r0 <= r13) goto L_0x0145
            java.lang.String r0 = ""
        L_0x013b:
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            r0.<init>(r1)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            throw r0     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
        L_0x0145:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            java.lang.String r0 = "updateSince list size <= "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r13)     // Catch:{ NullPointerException | JSONException -> 0x0157, all -> 0x0150 }
            goto L_0x013b
        L_0x0150:
            r1 = move-exception
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0157:
            r1 = move-exception
            X.2gr r0 = r8.A01
            X.190 r0 = r0.A00
            r0.A0E(r10, r14, r1)
            X.97V r0 = r8.A00
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r16)
            r21 = 0
            r22 = 0
            r24 = 1
            r17 = r0
            r17.A01(r18, r19, r20, r21, r22, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21295Ahg.Bc8(X.9FA):void");
    }
}
