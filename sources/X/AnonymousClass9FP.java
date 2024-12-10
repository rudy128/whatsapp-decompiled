package X;

/* renamed from: X.9FP  reason: invalid class name */
public class AnonymousClass9FP extends AnonymousClass9CP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r24v0, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024c, code lost:
        r9.A01 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0291, code lost:
        r9.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0293, code lost:
        r9.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0295, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9FP(X.C29621ca r34, X.AnonymousClass9F5 r35, int r36) {
        /*
            r33 = this;
            r9 = r33
            r0 = r36
            r9.A00 = r0
            r2 = r34
            r6 = r35
            switch(r36) {
                case 0: goto L_0x0254;
                case 6: goto L_0x0079;
                case 7: goto L_0x0167;
                default: goto L_0x000d;
            }
        L_0x000d:
            r8 = 1
            X.C18070vi.A0e(r2, r8, r6)
            r9.<init>()
            X.1ca r7 = X.C20121A8g.A03(r2, r6)
            X.2rm r10 = X.AnonymousClass8BR.A0s()
            X.A5y r6 = X.C20072A5y.A00
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.String r0 = "aadhaar"
            r5 = 0
            X.1ca r11 = X.AnonymousClass8BT.A0Z(r2, r0, r1)
            if (r11 != 0) goto L_0x0040
            X.AnonymousClass8BY.A11(r2, r10, r1, r5)
            r4 = 0
        L_0x002d:
            r9.A01 = r4
            X.C18070vi.A0d(r6, r5)
            X.C18070vi.A0d(r7, r8)
            X.9DB r0 = X.C20072A5y.A01(r2, r7, r10)
            if (r0 != 0) goto L_0x0291
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)
            throw r0
        L_0x0040:
            X.C18070vi.A0d(r6, r5)
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.String r0 = "aadhaar-otp-txn-id"
            r1[r5] = r0
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.C108975cc.A0X()
            java.lang.Long r14 = X.AnonymousClass8BV.A0f()
            r4 = 0
            r15 = r4
            r16 = r1
            r17 = r5
            java.lang.Object r3 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x002d
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.String r0 = "aadhaar-otp-txn-ts"
            r1[r5] = r0
            r16 = r1
            java.lang.Object r1 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x002d
            r0 = 10
            X.9Ci r4 = new X.9Ci
            r4.<init>(r11, r3, r1, r0)
            goto L_0x002d
        L_0x0079:
            r1 = 1
            r5 = 2
            X.C18070vi.A0d(r6, r5)
            r9.<init>()
            java.lang.String r4 = "iq"
            X.C29621ca.A04(r2, r4)
            X.1ca r11 = r6.BVP()
            X.2rm r10 = X.AnonymousClass8BR.A0s()
            X.A3o r3 = X.C20022A3o.A00
            boolean r0 = X.AnonymousClass8BV.A1T(r3, r11, r1)
            boolean r4 = r10.A09(r2, r4)
            r15 = 0
            if (r4 == 0) goto L_0x0162
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r6 = "id"
            r7[r0] = r6
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Long r13 = X.AnonymousClass8BW.A0Z(r6, r4, r0)
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            r16 = r4
            r17 = r0
            java.lang.Object r21 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r21 == 0) goto L_0x0162
            r16 = r10
            r17 = r2
            r18 = r12
            r19 = r13
            r20 = r14
            r22 = r7
            r23 = r1
            java.lang.Object r4 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0162
            java.lang.String[] r25 = X.AnonymousClass8BS.A1Z(r1, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r18 = com.whatsapp.jid.Jid.class
            java.lang.String[] r22 = X.AnonymousClass8BS.A1X(r1, r0)
            r17 = r11
            r21 = r15
            r23 = r0
            java.lang.Object r24 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r24 == 0) goto L_0x0162
            r19 = r10
            r20 = r2
            r21 = r18
            r22 = r13
            r23 = r14
            r26 = r1
            java.lang.Object r7 = r19.A05(r20, r21, r22, r23, r24, r25, r26)
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7
            if (r7 == 0) goto L_0x0162
            java.lang.String[] r16 = X.AnonymousClass8BS.A1a(r1, r0)
            java.lang.String r15 = "error"
            r11 = r2
            r17 = r0
            java.lang.Object r8 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0162
            r21 = 5
            X.9DB r6 = new X.9DB
            r16 = r6
            r17 = r7
            r18 = r2
            r19 = r4
            r20 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r9.A02 = r6
            r4 = 7
            X.B9c[] r6 = new X.C22470B9c[r4]
            r4 = 46
            X.C21284AhV.A00(r6, r4, r0, r3)
            r4 = 47
            X.C21284AhV.A00(r6, r4, r1, r3)
            r4 = 48
            X.C21284AhV.A00(r6, r4, r5, r3)
            r4 = 49
            X.AhV r5 = new X.AhV
            r5.<init>(r3, r4)
            r4 = 3
            r6[r4] = r5
            X.AhW r5 = new X.AhW
            r5.<init>(r3, r0)
            r4 = 4
            r6[r4] = r5
            X.AhW r4 = new X.AhW
            r4.<init>(r3, r1)
            r6[r21] = r4
            r5 = 2
            X.AhW r4 = new X.AhW
            r4.<init>(r3, r5)
            r3 = 6
            java.util.List r3 = X.C18070vi.A0O(r4, r6, r3)
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r0] = r15
            java.lang.String r0 = "IQErrorBadRequest|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorRateOverlimit|IQErrorInternalServerError|IQErrorFeatureNotImplemented|IQErrorServiceUnavailable"
            java.lang.Object r6 = r10.A06(r2, r0, r3, r1)
            if (r6 != 0) goto L_0x024c
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)
            throw r0
        L_0x0162:
            X.1UI r0 = X.AnonymousClass1O9.A00(r10)
            throw r0
        L_0x0167:
            boolean r3 = X.AnonymousClass8BU.A1X(r6)
            r9.<init>()
            X.1ca r1 = X.C20121A8g.A03(r2, r6)
            X.2rm r13 = X.AnonymousClass8BR.A0s()
            X.A3o r0 = X.C20022A3o.A00
            boolean r24 = X.AnonymousClass8BV.A1T(r0, r1, r3)
            X.9DB r0 = X.C20022A3o.A00(r2, r1, r13)
            if (r0 == 0) goto L_0x024f
            r9.A02 = r0
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r12 = "avatar"
            r5[r24] = r12
            r3 = 1
            r0 = 4
            r7 = r5[r24]
            java.util.List r5 = r2.A0R(r7)
            java.util.ArrayList r6 = X.C108965cb.A0t(r5)
            java.util.Iterator r16 = r5.iterator()
        L_0x019c:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x021c
            X.1ca r11 = X.C17880vN.A0a(r16)
            X.C18070vi.A0b(r11)
            r8 = 1
            X.C18070vi.A0d(r11, r8)
            boolean r5 = r13.A09(r11, r12)
            r22 = 0
            if (r5 == 0) goto L_0x019c
            java.lang.String[] r5 = new java.lang.String[r8]
            java.lang.String r10 = "url"
            r5[r24] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            java.lang.Long r20 = X.C17890vO.A0L()
            r14 = 4096(0x1000, double:2.0237E-320)
            java.lang.Long r21 = java.lang.Long.valueOf(r14)
            r23 = r5
            r18 = r11
            r17 = r13
            java.lang.Object r5 = r17.A05(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x019c
            java.lang.String[] r10 = new java.lang.String[r8]
            java.lang.String r14 = "pose_id"
            r10[r24] = r14
            java.lang.Long r28 = java.lang.Long.valueOf(r3)
            java.lang.Long r29 = X.AnonymousClass8BV.A0e()
            r25 = r13
            r26 = r11
            r27 = r19
            r30 = r22
            r31 = r10
            r32 = r24
            java.lang.Object r10 = r25.A05(r26, r27, r28, r29, r30, r31, r32)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x019c
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.String r14 = "hash"
            r8[r24] = r14
            java.lang.Long r21 = X.AnonymousClass8BV.A0f()
            r23 = r8
            java.lang.Object r14 = r17.A05(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r14 = (java.lang.String) r14
            X.9Ct r8 = new X.9Ct
            r17 = r8
            r19 = r5
            r20 = r10
            r21 = r14
            r22 = r24
            r17.<init>(r18, r19, r20, r21, r22)
            r6.add(r8)
            goto L_0x019c
        L_0x021c:
            long r10 = X.AnonymousClass8BR.A06(r6)
            r8 = 46
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0239
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r7, r2, r6)
            r2.append(r3)
        L_0x0230:
            java.lang.String r0 = X.C17890vO.A0c(r2, r8)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0239:
            long r4 = X.AnonymousClass8BR.A06(r6)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x024c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r7, r2, r6)
            r2.append(r0)
            goto L_0x0230
        L_0x024c:
            r9.A01 = r6
            goto L_0x0293
        L_0x024f:
            X.1UI r0 = X.AnonymousClass1O9.A00(r13)
            throw r0
        L_0x0254:
            boolean r7 = X.AnonymousClass8BU.A1X(r6)
            r9.<init>()
            X.1ca r6 = X.C20121A8g.A03(r2, r6)
            X.2rm r5 = X.AnonymousClass8BR.A0s()
            X.A8H r4 = X.A8H.A00
            java.lang.String[] r3 = new java.lang.String[r7]
            java.lang.String r0 = "error"
            r1 = 0
            X.1ca r0 = X.AnonymousClass8BT.A0Z(r2, r0, r3)
            if (r0 != 0) goto L_0x0278
            X.AnonymousClass8BY.A11(r2, r5, r3, r1)
        L_0x0273:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        L_0x0278:
            X.C18070vi.A0d(r4, r1)
            X.4A1 r0 = X.A8H.A04(r0, r5)
            if (r0 == 0) goto L_0x0273
            r9.A01 = r0
            X.C18070vi.A0d(r6, r7)
            X.9DG r0 = X.A8H.A00(r2, r6, r5)
            if (r0 != 0) goto L_0x0291
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        L_0x0291:
            r9.A02 = r0
        L_0x0293:
            r9.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FP.<init>(X.1ca, X.9F5, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9FP(X.C29621ca r27, X.AnonymousClass9F6 r28, int r29) {
        /*
            r26 = this;
            r8 = r26
            r0 = r29
            r8.A00 = r0
            r9 = r27
            r1 = r28
            int r29 = 1 - r29
            if (r29 == 0) goto L_0x0073
            r5 = 1
            r7 = 2
            r8.<init>()
            X.1ca r0 = X.AnonymousClass9F6.A00(r9, r1)
            X.2rm r3 = X.AnonymousClass8BR.A0s()
            X.A97 r6 = X.A97.A00
            boolean r4 = X.AnonymousClass8BV.A1T(r6, r0, r5)
            X.9DG r0 = X.A97.A04(r9, r0, r3)
            if (r0 == 0) goto L_0x0167
            r8.A02 = r0
            r0 = 8
            X.B9c[] r2 = new X.C22470B9c[r0]
            r0 = 49
            X.C21283AhU.A00(r2, r0, r4, r6)
            X.C21284AhV.A00(r2, r4, r5, r6)
            X.C21284AhV.A00(r2, r5, r7, r6)
            X.AhV r1 = new X.AhV
            r1.<init>(r6, r7)
            r0 = 3
            r2[r0] = r1
            X.AhV r1 = new X.AhV
            r1.<init>(r6, r0)
            r0 = 4
            r2[r0] = r1
            X.AhV r1 = new X.AhV
            r1.<init>(r6, r0)
            r0 = 5
            r2[r0] = r1
            X.AhV r1 = new X.AhV
            r1.<init>(r6, r0)
            r0 = 6
            r2[r0] = r1
            X.AhV r1 = new X.AhV
            r1.<init>(r6, r0)
            r0 = 7
            java.util.List r2 = X.C18070vi.A0O(r1, r2, r0)
            java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r5, r4)
            java.lang.String r0 = "IQErrorRateOverlimit|IQErrorPayloadTooLarge|IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorForbidden|IQErrorLocked|IQErrorFallbackClient"
            java.lang.Object r0 = r3.A06(r9, r0, r2, r1)
            if (r0 == 0) goto L_0x0162
            r8.A01 = r0
        L_0x0070:
            r8.A00 = r9
            return
        L_0x0073:
            r7 = 1
            r2 = 2
            X.C18070vi.A0d(r1, r2)
            r8.<init>()
            X.1ca r1 = X.AnonymousClass9F6.A00(r9, r1)
            X.2rm r6 = X.AnonymousClass8BR.A0s()
            X.A97 r0 = X.A97.A00
            boolean r5 = X.AnonymousClass8BV.A1T(r0, r1, r7)
            X.9DG r0 = X.A97.A05(r9, r1, r6)
            if (r0 == 0) goto L_0x016c
            r8.A01 = r0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r0 = "sub_group_suggestion"
            r3[r5] = r0
            java.lang.String r17 = "group"
            r3[r7] = r17
            r10 = 1
            r0 = 1000(0x3e8, double:4.94E-321)
            X.1ca r2 = X.AnonymousClass8BS.A0Q(r9, r3, r5)
            if (r2 != 0) goto L_0x00b7
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A12(r9, r0, r3, r5)
        L_0x00ac:
            java.lang.String r0 = r0.toString()
        L_0x00b0:
            r6.A00 = r0
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x00b7:
            r4 = r3[r7]
            java.util.List r2 = r2.A0R(r4)
            java.util.ArrayList r3 = X.C108965cb.A0t(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x00c5:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0130
            r2 = r16
            X.1ca r2 = X.AnonymousClass8BW.A0R(r2, r7)
            r12 = r17
            boolean r12 = r6.A09(r2, r12)
            r23 = 0
            if (r12 == 0) goto L_0x00c5
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Y(r7, r5)
            java.lang.Class<X.1EC> r20 = X.AnonymousClass1EC.class
            java.lang.Long r21 = X.AnonymousClass8BU.A0i()
            java.lang.Long r22 = X.AnonymousClass8BU.A0j()
            r25 = r5
            r18 = r6
            r19 = r2
            java.lang.Object r14 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            X.1EC r14 = (X.AnonymousClass1EC) r14
            if (r14 == 0) goto L_0x00c5
            r12 = 7
            X.B9c[] r15 = new X.C22470B9c[r12]
            X.Ag9 r12 = X.C21200Ag9.A00
            r15[r5] = r12
            X.AgA r12 = X.C21201AgA.A00
            r15[r7] = r12
            r13 = 2
            X.AgB r12 = X.C21202AgB.A00
            r15[r13] = r12
            r13 = 3
            X.AgC r12 = X.C21203AgC.A00
            r15[r13] = r12
            r13 = 4
            X.AgD r12 = X.C21204AgD.A00
            r15[r13] = r12
            r13 = 5
            X.AgE r12 = X.C21205AgE.A00
            r15[r13] = r12
            r13 = 6
            X.AgF r12 = X.C21206AgF.A00
            java.util.List r15 = X.C18070vi.A0O(r12, r15, r13)
            java.lang.String[] r13 = new java.lang.String[r5]
            java.lang.String r12 = "SubGroupNotAuthorized|SubGroupNotExist|SubGroupConflict|SubGroupSuggestionNotAllowed|SubGroupResourceLimit|SubGroupBadRequest|SubGroupServerError"
            java.lang.Object r13 = r6.A06(r2, r12, r15, r13)
            X.9Cl r13 = (X.C178269Cl) r13
            X.9DP r12 = new X.9DP
            r12.<init>((X.AnonymousClass1EC) r14, (X.C29621ca) r2, (X.C178269Cl) r13)
            r3.add(r12)
            goto L_0x00c5
        L_0x0130:
            long r12 = X.AnonymousClass8BR.A06(r3)
            r5 = 46
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0149
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r4, r0, r3)
            r0.append(r10)
            r0.append(r5)
            goto L_0x00ac
        L_0x0149:
            long r10 = X.AnonymousClass8BR.A06(r3)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x015e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r4, r2, r3)
            java.lang.String r0 = X.AnonymousClass8BV.A0u(r2, r5, r0)
            goto L_0x00b0
        L_0x015e:
            r8.A02 = r3
            goto L_0x0070
        L_0x0162:
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x0167:
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x016c:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FP.<init>(X.1ca, X.9F6, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9FP(X.C29621ca r27, X.AnonymousClass9F7 r28, int r29) {
        /*
            r26 = this;
            r9 = r26
            r0 = r29
            r9.A00 = r0
            r10 = r27
            r3 = r28
            switch(r29) {
                case 3: goto L_0x0138;
                case 4: goto L_0x00ec;
                default: goto L_0x000d;
            }
        L_0x000d:
            r8 = 1
            r2 = 2
            r9.<init>()
            X.C108945cZ.A1N(r10)
            java.lang.Object r1 = r3.A00
            X.1ca r1 = (X.C29621ca) r1
            X.2rm r7 = X.AnonymousClass8BR.A0s()
            X.A96 r0 = X.A96.A00
            boolean r6 = X.AnonymousClass8BV.A1T(r0, r1, r8)
            X.9DB r0 = X.A96.A08(r10, r1, r7)
            if (r0 == 0) goto L_0x00e7
            r9.A01 = r0
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r0 = "my_addons"
            r5[r6] = r0
            java.lang.String r12 = "messages"
            r5[r8] = r12
            r2 = 0
            r0 = 5000(0x1388, double:2.4703E-320)
            X.1ca r4 = X.AnonymousClass8BS.A0Q(r10, r5, r6)
            if (r4 != 0) goto L_0x0051
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A12(r10, r0, r5, r6)
        L_0x0046:
            java.lang.String r0 = r0.toString()
        L_0x004a:
            r7.A00 = r0
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0051:
            r5 = r5[r8]
            java.util.List r11 = r4.A0R(r5)
            java.util.ArrayList r4 = X.C108965cb.A0t(r11)
            java.util.Iterator r17 = r11.iterator()
        L_0x005f:
            boolean r11 = r17.hasNext()
            if (r11 == 0) goto L_0x00b5
            r11 = r17
            X.1ca r11 = X.AnonymousClass8BW.A0R(r11, r8)
            boolean r13 = r7.A09(r11, r12)
            r23 = 0
            if (r13 == 0) goto L_0x005f
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Y(r8, r6)
            java.lang.Class<X.1ch> r20 = X.C29681ch.class
            java.lang.Long r21 = X.AnonymousClass8BU.A0i()
            java.lang.Long r22 = X.AnonymousClass8BU.A0j()
            r25 = r6
            r18 = r7
            r19 = r11
            java.lang.Object r14 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            X.1ch r14 = (X.C29681ch) r14
            if (r14 == 0) goto L_0x005f
            java.lang.String[] r13 = new java.lang.String[r8]
            r16 = r13
            java.lang.String r13 = "message"
            r16[r6] = r13
            r15 = 35
            X.AhY r13 = new X.AhY
            r13.<init>(r15)
            r20 = r13
            r21 = r16
            r22 = r2
            r24 = r0
            java.util.ArrayList r15 = r18.A08(r19, r20, r21, r22, r24)
            if (r15 == 0) goto L_0x005f
            X.9DP r13 = new X.9DP
            r13.<init>((X.C29681ch) r14, (X.C29621ca) r11, (java.util.List) r15)
            r4.add(r13)
            goto L_0x005f
        L_0x00b5:
            long r11 = X.AnonymousClass8BR.A06(r4)
            r8 = 46
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ce
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r5, r0, r4)
            r0.append(r2)
            r0.append(r8)
            goto L_0x0046
        L_0x00ce:
            long r11 = X.AnonymousClass8BR.A06(r4)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r5, r2, r4)
            java.lang.String r0 = X.AnonymousClass8BV.A0u(r2, r8, r0)
            goto L_0x004a
        L_0x00e3:
            r9.A02 = r4
            goto L_0x017b
        L_0x00e7:
            X.1UI r0 = X.AnonymousClass1O9.A00(r7)
            throw r0
        L_0x00ec:
            r1 = 1
            r8 = 2
            r9.<init>()
            X.C108945cZ.A1N(r10)
            java.lang.Object r7 = r3.A00
            X.1ca r7 = (X.C29621ca) r7
            X.2rm r6 = X.AnonymousClass8BR.A0s()
            X.A96 r5 = X.A96.A00
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.String r0 = "message_updates"
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "messages"
            r4[r1] = r0
            r2 = r10
            r1 = 0
        L_0x010b:
            X.1ca r0 = X.AnonymousClass8BS.A0Q(r2, r4, r1)
            if (r0 != 0) goto L_0x0119
            X.AnonymousClass8BY.A11(r2, r6, r4, r1)
        L_0x0114:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x0119:
            int r1 = r1 + 1
            r2 = r0
            if (r1 < r8) goto L_0x010b
            X.C18070vi.A0d(r5, r3)
            X.9DL r0 = X.A96.A00(r0, r6)
            if (r0 == 0) goto L_0x0114
            r9.A02 = r0
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            X.9DB r0 = X.A96.A08(r10, r7, r6)
            if (r0 != 0) goto L_0x0179
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x0138:
            r6 = 1
            r1 = 2
            r9.<init>()
            X.C108945cZ.A1N(r10)
            java.lang.Object r0 = r3.A00
            X.1ca r0 = (X.C29621ca) r0
            X.2rm r5 = X.AnonymousClass8BR.A0s()
            X.A3n r4 = X.C20021A3n.A00
            boolean r3 = X.AnonymousClass8BV.A1T(r4, r0, r6)
            X.9DG r0 = X.C20021A3n.A00(r10, r0, r5)
            if (r0 == 0) goto L_0x017e
            r9.A02 = r0
            X.B9c[] r2 = new X.C22470B9c[r1]
            r0 = 19
            X.C21284AhV.A00(r2, r0, r3, r4)
            r1 = 20
            X.AhV r0 = new X.AhV
            r0.<init>(r4, r1)
            java.util.List r2 = X.C18070vi.A0O(r0, r2, r6)
            java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r6, r3)
            java.lang.String r0 = "IQErrorBadRequest|IQErrorFeatureNotImplemented"
            java.lang.Object r0 = r5.A06(r10, r0, r2, r1)
            if (r0 != 0) goto L_0x0179
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        L_0x0179:
            r9.A01 = r0
        L_0x017b:
            r9.A00 = r10
            return
        L_0x017e:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FP.<init>(X.1ca, X.9F7, int):void");
    }
}
