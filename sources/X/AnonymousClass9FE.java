package X;

/* renamed from: X.9FE  reason: invalid class name */
public class AnonymousClass9FE extends AnonymousClass9CP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9FE(X.C29621ca r29, X.AnonymousClass9F6 r30, int r31) {
        /*
            r28 = this;
            r9 = r28
            r0 = r31
            r9.A00 = r0
            r10 = r29
            r1 = r30
            if (r31 == 0) goto L_0x00f6
            r8 = 1
            r2 = 2
            X.C18070vi.A0d(r1, r2)
            r9.<init>()
            X.1ca r1 = X.AnonymousClass9F6.A00(r10, r1)
            X.2rm r7 = X.AnonymousClass8BR.A0s()
            X.A8H r0 = X.A8H.A00
            boolean r6 = X.AnonymousClass8BV.A1T(r0, r1, r8)
            X.9DG r0 = X.A8H.A01(r10, r1, r7)
            if (r0 == 0) goto L_0x00f1
            r9.A02 = r0
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "integrator_list"
            r1[r6] = r0
            java.lang.String r5 = "integrator"
            r1[r8] = r5
            r18 = 0
            r11 = 999(0x3e7, double:4.936E-321)
            X.1ca r0 = X.AnonymousClass8BS.A0Q(r10, r1, r6)
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A12(r10, r2, r1, r6)
        L_0x0045:
            java.lang.String r0 = r2.toString()
            r7.A00 = r0
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0050:
            r4 = r1[r8]
            java.util.List r0 = r0.A0R(r4)
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)
            java.util.Iterator r17 = r0.iterator()
        L_0x005e:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00c3
            r0 = r17
            X.1ca r2 = X.AnonymousClass8BW.A0R(r0, r8)
            boolean r0 = r7.A09(r2, r5)
            r25 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.String[] r26 = X.AnonymousClass8BS.A1W(r8, r6)
            java.lang.Class r22 = java.lang.Long.TYPE
            java.lang.Long r23 = X.C108975cc.A0X()
            java.lang.Long r24 = java.lang.Long.valueOf(r11)
            r20 = r7
            r21 = r2
            r27 = r6
            java.lang.Object r0 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x005e
            long r15 = r0.longValue()
            boolean r0 = r7.A09(r2, r5)
            r13 = 0
            if (r0 == 0) goto L_0x00b9
            r0 = 2
            X.B9c[] r1 = new X.C22470B9c[r0]
            X.Ag0 r0 = X.C21191Ag0.A00
            r1[r6] = r0
            X.Ag1 r0 = X.C21192Ag1.A00
            java.util.List r0 = X.C18070vi.A0O(r0, r1, r8)
            java.lang.String[] r14 = X.AnonymousClass8BS.A1b(r8, r6)
            java.lang.String r1 = "IQErrorItemNotFound|IQErrorBadRequest"
            java.lang.Object r0 = r7.A06(r2, r1, r0, r14)
            if (r0 == 0) goto L_0x00b9
            X.5aZ r0 = (X.C107775aZ) r0
            X.9DO r13 = new X.9DO
            r13.<init>((X.C29621ca) r2, (X.C107775aZ) r0)
        L_0x00b9:
            X.9DK r14 = new X.9DK
            r0 = r15
            r14.<init>((X.C29621ca) r2, (X.AnonymousClass9DO) r13, (long) r0)
            r3.add(r14)
            goto L_0x005e
        L_0x00c3:
            long r1 = X.AnonymousClass8BR.A06(r3)
            r5 = 46
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x00de
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r4, r2, r3)
            r0 = r18
            r2.append(r0)
        L_0x00d9:
            r2.append(r5)
            goto L_0x0045
        L_0x00de:
            long r1 = X.AnonymousClass8BR.A06(r3)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x013d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r4, r2, r3)
            r2.append(r11)
            goto L_0x00d9
        L_0x00f1:
            X.1UI r0 = X.AnonymousClass1O9.A00(r7)
            throw r0
        L_0x00f6:
            r7 = 1
            r6 = 2
            X.C18070vi.A0d(r1, r6)
            r9.<init>()
            X.1ca r0 = X.AnonymousClass9F6.A00(r10, r1)
            X.2rm r5 = X.AnonymousClass8BR.A0s()
            X.A8H r4 = X.A8H.A00
            boolean r3 = X.AnonymousClass8BV.A1T(r4, r0, r7)
            X.9DG r0 = X.A8H.A00(r10, r0, r5)
            if (r0 == 0) goto L_0x0142
            r9.A02 = r0
            r0 = 3
            X.B9c[] r2 = new X.C22470B9c[r0]
            r0 = 15
            X.C21283AhU.A00(r2, r0, r3, r4)
            r0 = 16
            X.C21283AhU.A00(r2, r0, r7, r4)
            r1 = 17
            X.AhU r0 = new X.AhU
            r0.<init>(r4, r1)
            java.util.List r2 = X.C18070vi.A0O(r0, r2, r6)
            java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r7, r3)
            java.lang.String r0 = "IQErrorBadRequest|IQErrorForbidden|IQErrorInternalServerError"
            java.lang.Object r3 = r5.A06(r10, r0, r2, r1)
            if (r3 != 0) goto L_0x013d
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        L_0x013d:
            r9.A01 = r3
            r9.A00 = r10
            return
        L_0x0142:
            X.1UI r0 = X.AnonymousClass1O9.A00(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FE.<init>(X.1ca, X.9F6, int):void");
    }
}
