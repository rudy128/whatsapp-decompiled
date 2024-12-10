package X;

/* renamed from: X.9FD  reason: invalid class name */
public class AnonymousClass9FD extends AnonymousClass9CP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9FD(X.C29621ca r29, X.AnonymousClass9F6 r30, int r31) {
        /*
            r28 = this;
            r6 = r28
            r0 = r31
            r6.A00 = r0
            r7 = r29
            r1 = r30
            if (r31 == 0) goto L_0x0121
            r5 = 1
            r2 = 2
            X.C18070vi.A0d(r1, r2)
            r6.<init>()
            X.1ca r1 = X.AnonymousClass9F6.A00(r7, r1)
            X.2rm r4 = X.AnonymousClass8BR.A0s()
            X.A8H r0 = X.A8H.A00
            boolean r3 = X.AnonymousClass8BV.A1T(r0, r1, r5)
            X.9DG r0 = X.A8H.A01(r7, r1, r4)
            if (r0 == 0) goto L_0x011c
            r6.A01 = r0
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "users"
            r1[r3] = r0
            java.lang.String r19 = "user"
            r1[r5] = r19
            r17 = 1
            r9 = 256(0x100, double:1.265E-321)
            X.1ca r0 = X.AnonymousClass8BS.A0Q(r7, r1, r3)
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A12(r7, r5, r1, r3)
        L_0x0045:
            java.lang.String r0 = r5.toString()
            r4.A00 = r0
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0050:
            r2 = r1[r5]
            java.util.List r0 = r0.A0R(r2)
            java.util.ArrayList r1 = X.C108965cb.A0t(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x005e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00eb
            r0 = r16
            X.1ca r15 = X.AnonymousClass8BW.A0R(r0, r5)
            r0 = r19
            boolean r0 = r4.A09(r15, r0)
            r25 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.String[] r8 = new java.lang.String[r5]
            java.lang.String r0 = "external_id"
            r8[r3] = r0
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            java.lang.Long r23 = java.lang.Long.valueOf(r17)
            java.lang.Long r24 = X.AnonymousClass8BV.A0f()
            r26 = r8
            r27 = r3
            r20 = r4
            r21 = r15
            java.lang.Object r0 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x005e
            java.lang.String[] r11 = new java.lang.String[r5]
            java.lang.String r8 = "normalized_external_id"
            r11[r3] = r8
            r26 = r11
            java.lang.Object r8 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x005e
            java.lang.String[] r11 = new java.lang.String[r5]
            java.lang.String r12 = "integrator_id"
            r11[r3] = r12
            java.lang.Class r22 = java.lang.Long.TYPE
            r12 = 999(0x3e7, double:4.936E-321)
            java.lang.Long r24 = java.lang.Long.valueOf(r12)
            r26 = r11
            java.lang.Object r11 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            java.lang.Number r11 = (java.lang.Number) r11
            if (r11 == 0) goto L_0x005e
            long r25 = r11.longValue()
            r11 = 2
            X.B9c[] r12 = new X.C22470B9c[r11]
            X.Afv r11 = X.C21186Afv.A00
            r12[r3] = r11
            X.Afw r11 = X.C21187Afw.A00
            java.util.List r14 = X.C18070vi.A0O(r11, r12, r5)
            java.lang.String[] r13 = new java.lang.String[r3]
            java.lang.String r12 = "UserSuccess|UserError"
            java.lang.Object r12 = r4.A06(r15, r12, r14, r13)
            if (r12 == 0) goto L_0x005e
            X.5YP r12 = (X.AnonymousClass5YP) r12
            X.49y r11 = new X.49y
            r20 = r11
            r22 = r12
            r23 = r0
            r24 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r1.add(r11)
            goto L_0x005e
        L_0x00eb:
            long r11 = X.AnonymousClass8BR.A06(r1)
            r3 = 46
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r2, r5, r1)
            r0 = r17
            r5.append(r0)
        L_0x0101:
            r5.append(r3)
            goto L_0x0045
        L_0x0106:
            long r11 = X.AnonymousClass8BR.A06(r1)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r2, r5, r1)
            r5.append(r9)
            goto L_0x0101
        L_0x0119:
            r6.A02 = r1
            goto L_0x0165
        L_0x011c:
            X.1UI r0 = X.AnonymousClass1O9.A00(r4)
            throw r0
        L_0x0121:
            r9 = 1
            r8 = 2
            X.C18070vi.A0d(r1, r8)
            r6.<init>()
            X.1ca r0 = X.AnonymousClass9F6.A00(r7, r1)
            X.2rm r5 = X.AnonymousClass8BR.A0s()
            X.A8H r4 = X.A8H.A00
            boolean r3 = X.AnonymousClass8BV.A1T(r4, r0, r9)
            X.9DG r0 = X.A8H.A00(r7, r0, r5)
            if (r0 == 0) goto L_0x016d
            r6.A02 = r0
            r0 = 3
            X.B9c[] r2 = new X.C22470B9c[r0]
            r0 = 10
            X.C21283AhU.A00(r2, r0, r3, r4)
            r0 = 11
            X.C21283AhU.A00(r2, r0, r9, r4)
            r1 = 12
            X.AhU r0 = new X.AhU
            r0.<init>(r4, r1)
            java.util.List r2 = X.C18070vi.A0O(r0, r2, r8)
            java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r9, r3)
            java.lang.String r0 = "IQErrorBadRequest|IQErrorForbidden|IQErrorInternalServerError"
            java.lang.Object r0 = r5.A06(r7, r0, r2, r1)
            if (r0 == 0) goto L_0x0168
            r6.A01 = r0
        L_0x0165:
            r6.A00 = r7
            return
        L_0x0168:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        L_0x016d:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FD.<init>(X.1ca, X.9F6, int):void");
    }
}
