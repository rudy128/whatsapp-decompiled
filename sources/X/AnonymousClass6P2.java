package X;

/* renamed from: X.6P2  reason: invalid class name */
public final class AnonymousClass6P2 extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C130646jm A00;

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r13v3, types: [X.6O5] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C29621ca r21, X.C130646jm r22, X.AnonymousClass9F4 r23) {
        /*
            r3 = 0
            r1 = 1
            r4 = r23
            X.C18070vi.A0d(r4, r1)
            r20 = 2
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            r2 = r21
            r0 = r22
            X.C108945cZ.A1N(r2)     // Catch:{ 1UI -> 0x0113 }
            java.lang.Object r11 = r4.A00     // Catch:{ 1UI -> 0x0113 }
            X.2rm r9 = new X.2rm     // Catch:{ 1UI -> 0x0113 }
            r9.<init>()     // Catch:{ 1UI -> 0x0113 }
            X.6vt r10 = X.C137706vt.A00     // Catch:{ 1UI -> 0x0113 }
            r6 = 38
            X.AfU r8 = X.C108945cZ.A0W(r10, r6)     // Catch:{ 1UI -> 0x0113 }
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x0113 }
            java.lang.String r6 = "encryption_metadata"
            r7[r3] = r6     // Catch:{ 1UI -> 0x0113 }
            java.lang.Object r7 = r9.A03(r2, r8, r7)     // Catch:{ 1UI -> 0x0113 }
            X.6Ou r7 = (X.C122316Ou) r7     // Catch:{ 1UI -> 0x0113 }
            if (r7 == 0) goto L_0x0109
            r6 = 14
            X.AfV r8 = new X.AfV     // Catch:{ 1UI -> 0x0113 }
            r8.<init>(r11, r10, r6)     // Catch:{ 1UI -> 0x0113 }
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ 1UI -> 0x0113 }
            java.lang.Object r6 = r9.A03(r2, r8, r6)     // Catch:{ 1UI -> 0x0113 }
            if (r6 == 0) goto L_0x010e
            java.lang.String r6 = "AccountLinkingFbUserEntityOperationHelper/performReactivateUser:success"
            X.C18070vi.A0d(r6, r3)     // Catch:{ 1UI -> 0x0113 }
            X.1lc r9 = r0.A04     // Catch:{ 1UI -> 0x0113 }
            X.00H r6 = r9.A04     // Catch:{ 1UI -> 0x0113 }
            java.lang.Object r13 = r6.get()     // Catch:{ 1UI -> 0x0113 }
            X.A0V r13 = (X.A0V) r13     // Catch:{ 1UI -> 0x0113 }
            java.security.KeyPair r6 = r0.A05     // Catch:{ 1UI -> 0x0113 }
            java.security.PrivateKey r12 = r6.getPrivate()     // Catch:{ 1UI -> 0x0113 }
            byte[] r11 = r7.A02     // Catch:{ 1UI -> 0x0113 }
            byte[] r10 = r7.A01     // Catch:{ 1UI -> 0x0113 }
            byte[] r8 = r7.A00     // Catch:{ 1UI -> 0x0113 }
            byte[] r7 = r7.A03     // Catch:{ 1UI -> 0x0113 }
            X.6h6 r6 = new X.6h6     // Catch:{ 1UI -> 0x0113 }
            r6.<init>(r11, r10, r8, r7)     // Catch:{ 1UI -> 0x0113 }
            org.json.JSONObject r16 = X.C108975cc.A0l(r6, r13, r12)     // Catch:{ 1UI -> 0x0113 }
            X.00H r11 = r9.A05     // Catch:{ JSONException -> 0x00f3 }
            r11.get()     // Catch:{ JSONException -> 0x00f3 }
            org.json.JSONObject r7 = X.C108985cd.A0v(r16)     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r6 = "fbid"
            long r14 = r7.getLong(r6)     // Catch:{ JSONException -> 0x00f3 }
            X.732 r7 = r0.A01     // Catch:{ JSONException -> 0x00f3 }
            X.77e r6 = r7.A04     // Catch:{ JSONException -> 0x00f3 }
            java.lang.Object r10 = r6.A00     // Catch:{ JSONException -> 0x00f3 }
            X.C17960vV.A07(r10)     // Catch:{ JSONException -> 0x00f3 }
            r6 = r10
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ JSONException -> 0x00f3 }
            if (r6 == 0) goto L_0x00e6
            long r12 = r6.longValue()     // Catch:{ JSONException -> 0x00f3 }
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x00e6
            r11.get()     // Catch:{ JSONException -> 0x00f3 }
            org.json.JSONObject r8 = X.C108985cd.A0v(r16)     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r6 = "access_token"
            java.lang.String r12 = r8.getString(r6)     // Catch:{ JSONException -> 0x00f3 }
            X.C18070vi.A0X(r12)     // Catch:{ JSONException -> 0x00f3 }
            r11.get()     // Catch:{ JSONException -> 0x00f3 }
            org.json.JSONObject r8 = X.C108985cd.A0v(r16)     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r6 = "timestamp"
            long r16 = r8.getLong(r6)     // Catch:{ JSONException -> 0x00f3 }
            X.00H r6 = r9.A09     // Catch:{ JSONException -> 0x00f3 }
            java.lang.Object r8 = r6.get()     // Catch:{ JSONException -> 0x00f3 }
            X.1lN r8 = (X.C34951lN) r8     // Catch:{ JSONException -> 0x00f3 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x00f3 }
            r8.A06(r6)     // Catch:{ JSONException -> 0x00f3 }
            X.1lZ r6 = r9.A03     // Catch:{ JSONException -> 0x00f3 }
            r6.A01()     // Catch:{ JSONException -> 0x00f3 }
            X.1la r9 = r9.A02     // Catch:{ JSONException -> 0x00f3 }
            r8 = 26
            X.7KY r6 = new X.7KY     // Catch:{ JSONException -> 0x00f3 }
            r6.<init>(r9, r8)     // Catch:{ JSONException -> 0x00f3 }
            r9.notifyAllObservers(r6)     // Catch:{ JSONException -> 0x00f3 }
            X.89m r6 = r0.A02     // Catch:{ JSONException -> 0x00f3 }
            X.C17960vV.A07(r10)     // Catch:{ JSONException -> 0x00f3 }
            X.C18070vi.A0X(r10)     // Catch:{ JSONException -> 0x00f3 }
            long r14 = X.C17880vN.A05(r10)     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r11 = X.AnonymousClass732.A01(r7)     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r13 = r7.A08     // Catch:{ JSONException -> 0x00f3 }
            X.1lW r9 = r7.A01     // Catch:{ JSONException -> 0x00f3 }
            r10 = 0
            X.732 r8 = new X.732     // Catch:{ JSONException -> 0x00f3 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)     // Catch:{ JSONException -> 0x00f3 }
            r6.C7I(r8)     // Catch:{ JSONException -> 0x00f3 }
            return
        L_0x00e6:
            java.lang.String r6 = "AccountLinkingFbUserEntityOperationHelper/performReactivateUser/fbid null"
            X.C18070vi.A0d(r6, r3)     // Catch:{ JSONException -> 0x00f3 }
            X.89m r7 = r0.A02     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r6 = "ids do not match"
            X.C108965cb.A1C(r7, r6)     // Catch:{ JSONException -> 0x00f3 }
            return
        L_0x00f3:
            r8 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x0113 }
            java.lang.String r6 = "AccountLinkingFbUserEntityOperationHelper/performReactivateUser/error "
            java.lang.String r6 = X.C17900vP.A0C(r6, r7, r8)     // Catch:{ 1UI -> 0x0113 }
            X.C18070vi.A0d(r6, r3)     // Catch:{ 1UI -> 0x0113 }
            X.89m r7 = r0.A02     // Catch:{ 1UI -> 0x0113 }
            java.lang.String r6 = "Error parsing response"
            X.C108965cb.A1C(r7, r6)     // Catch:{ 1UI -> 0x0113 }
            return
        L_0x0109:
            X.1UI r6 = X.AnonymousClass1O9.A00(r9)     // Catch:{ 1UI -> 0x0113 }
            goto L_0x0112
        L_0x010e:
            X.1UI r6 = X.AnonymousClass1O9.A00(r9)     // Catch:{ 1UI -> 0x0113 }
        L_0x0112:
            throw r6     // Catch:{ 1UI -> 0x0113 }
        L_0x0113:
            r8 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r6 = "ReactivateStateResponseSuccess: "
            java.lang.String r6 = X.C17900vP.A0C(r6, r7, r8)
            r5.add(r6)
            X.C108945cZ.A1N(r2)     // Catch:{ 1UI -> 0x028f }
            java.lang.Object r4 = r4.A00     // Catch:{ 1UI -> 0x028f }
            X.2rm r7 = new X.2rm     // Catch:{ 1UI -> 0x028f }
            r7.<init>()     // Catch:{ 1UI -> 0x028f }
            X.6vt r10 = X.C137706vt.A00     // Catch:{ 1UI -> 0x028f }
            r9 = 13
            X.AfV r6 = new X.AfV     // Catch:{ 1UI -> 0x028f }
            r6.<init>(r4, r10, r9)     // Catch:{ 1UI -> 0x028f }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ 1UI -> 0x028f }
            java.lang.Object r4 = r7.A03(r2, r6, r4)     // Catch:{ 1UI -> 0x028f }
            if (r4 == 0) goto L_0x0285
            r4 = 14
            X.B9c[] r8 = new X.C22470B9c[r4]     // Catch:{ 1UI -> 0x028f }
            r4 = 34
            X.AfU r4 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r8[r3] = r4     // Catch:{ 1UI -> 0x028f }
            r4 = 35
            X.AfU r4 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r8[r1] = r4     // Catch:{ 1UI -> 0x028f }
            r4 = 36
            X.AfU r4 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r8[r20] = r4     // Catch:{ 1UI -> 0x028f }
            r4 = 37
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 3
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 24
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 4
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 25
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 5
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 26
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 6
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 27
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 7
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 28
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 8
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 29
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 9
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 30
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 10
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 31
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 11
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 32
            X.AfU r6 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            r4 = 12
            r8[r4] = r6     // Catch:{ 1UI -> 0x028f }
            r4 = 33
            X.AfU r4 = X.C108945cZ.A0W(r10, r4)     // Catch:{ 1UI -> 0x028f }
            java.util.List r6 = X.C18070vi.A0O(r4, r8, r9)     // Catch:{ 1UI -> 0x028f }
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x028f }
            java.lang.String r1 = "error"
            r4[r3] = r1     // Catch:{ 1UI -> 0x028f }
            java.lang.String r1 = "IQErrorBadRequest|IQErrorRequestTimeout|IQErrorPayloadEncDec|IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorNotAuthorized|IQErrorRateOverlimit|IQErrorNotAllowed|IQErrorConflict|IQErrorWFNotFound|IQErrorWFStateMismatch|IQErrorWFSuspended|IQErrorWFNotAuthorizedInvalidNonce|IQErrorWFNotAuthorizedInvalidPassword"
            java.lang.Object r1 = r7.A06(r2, r1, r6, r4)     // Catch:{ 1UI -> 0x028f }
            if (r1 == 0) goto L_0x028a
            X.88i r1 = (X.C1604088i) r1     // Catch:{ 1UI -> 0x028f }
            X.1lc r11 = r0.A04     // Catch:{ 1UI -> 0x028f }
            X.732 r12 = r0.A01     // Catch:{ 1UI -> 0x028f }
            long r3 = r1.BOr()     // Catch:{ 1UI -> 0x028f }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ 1UI -> 0x028f }
            X.6Sm r1 = new X.6Sm     // Catch:{ 1UI -> 0x028f }
            r1.<init>(r2, r3)     // Catch:{ 1UI -> 0x028f }
            X.89m r7 = r0.A02     // Catch:{ 1UI -> 0x028f }
            java.security.cert.X509Certificate r8 = r0.A07     // Catch:{ 1UI -> 0x028f }
            java.security.PublicKey r10 = r0.A06     // Catch:{ 1UI -> 0x028f }
            int r13 = r0.A00     // Catch:{ 1UI -> 0x028f }
            X.705 r9 = r0.A03     // Catch:{ 1UI -> 0x028f }
            int r3 = X.C122936Sm.A00(r1)     // Catch:{ 1UI -> 0x028f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x028f }
            java.lang.String r0 = "AccountLinkingFbUserEntityOperationHelper/handleReactivateUserError/error with code "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r3)     // Catch:{ 1UI -> 0x028f }
            X.C31081ez.A02(r0)     // Catch:{ 1UI -> 0x028f }
            r14 = 4
            X.7R5 r6 = new X.7R5     // Catch:{ 1UI -> 0x028f }
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (int) r13, (int) r14)     // Catch:{ 1UI -> 0x028f }
            r14 = r7
            r15 = r9
            r17 = r11
            r18 = r6
            r19 = r3
            r16 = r1
            boolean r0 = X.C35081lc.A07(r14, r15, r16, r17, r18, r19)     // Catch:{ 1UI -> 0x028f }
            if (r0 != 0) goto L_0x0284
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x0257
            r0 = 417(0x1a1, float:5.84E-43)
            if (r3 == r0) goto L_0x0278
            r0 = 480(0x1e0, float:6.73E-43)
            if (r3 == r0) goto L_0x0247
            r0 = 484(0x1e4, float:6.78E-43)
            if (r3 == r0) goto L_0x0235
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x028f }
            java.lang.String r0 = "unexpected error code: "
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r2, r3)     // Catch:{ 1UI -> 0x028f }
            r0 = 0
            X.C17960vV.A0F(r0, r2)     // Catch:{ 1UI -> 0x028f }
            r7.Bsw(r1)     // Catch:{ 1UI -> 0x028f }
            return
        L_0x0235:
            r14 = r12
            r15 = r7
            r16 = r9
            r18 = r11
            r19 = r10
            r20 = r8
            r21 = r13
            r17 = r1
            X.C35081lc.A02(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1UI -> 0x028f }
            return
        L_0x0247:
            X.6zm r0 = X.C108965cb.A0g(r11)     // Catch:{ 1UI -> 0x028f }
            r18 = 3
            X.6O6 r13 = new X.6O6     // Catch:{ 1UI -> 0x028f }
            r14 = r12
            r15 = r7
            r16 = r9
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ 1UI -> 0x028f }
            goto L_0x0281
        L_0x0257:
            X.6O6 r13 = new X.6O6     // Catch:{ 1UI -> 0x028f }
            r16 = r12
            r17 = r7
            r18 = r9
            r19 = r11
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x028f }
            boolean r0 = r9.A03()     // Catch:{ 1UI -> 0x028f }
            if (r0 == 0) goto L_0x0273
            X.6zm r0 = X.C108965cb.A0g(r11)     // Catch:{ 1UI -> 0x028f }
            r0.A01(r7, r1)     // Catch:{ 1UI -> 0x028f }
            return
        L_0x0273:
            X.6zm r0 = X.C108965cb.A0g(r11)     // Catch:{ 1UI -> 0x028f }
            goto L_0x0281
        L_0x0278:
            X.6zm r0 = X.C108965cb.A0g(r11)     // Catch:{ 1UI -> 0x028f }
            X.6O5 r13 = new X.6O5     // Catch:{ 1UI -> 0x028f }
            r13.<init>(r12, r7, r11)     // Catch:{ 1UI -> 0x028f }
        L_0x0281:
            r0.A02(r9, r13, r1)     // Catch:{ 1UI -> 0x028f }
        L_0x0284:
            return
        L_0x0285:
            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ 1UI -> 0x028f }
            goto L_0x028e
        L_0x028a:
            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ 1UI -> 0x028f }
        L_0x028e:
            throw r0     // Catch:{ 1UI -> 0x028f }
        L_0x028f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ReactivateStateResponseError: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            java.lang.StringBuilder r1 = X.C108995ce.A0a(r0, r5)
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.C108995ce.A0X(r0, r5)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6P2.A00(X.1ca, X.6jm, X.9F4):void");
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
    }

    public AnonymousClass6P2(C130646jm r1, AnonymousClass9F4 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(r3, this.A00, (AnonymousClass9F4) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(r3, this.A00, (AnonymousClass9F4) C108955ca.A0c(this, r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
