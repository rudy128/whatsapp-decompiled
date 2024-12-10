package X;

/* renamed from: X.CvN  reason: case insensitive filesystem */
public abstract class C26231CvN {
    public static int A00(int i) {
        return (i & 14) | (i & 112) | (i & 896) | ((i << 18) & 1879048192);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r9.BEe(r0) == false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r24, X.C17090tj r25, X.C26018CqZ r26, java.lang.String r27, int r28, int r29, int r30, int r31, long r32) {
        /*
            r5 = r29
            r6 = r28
            r8 = r26
            r0 = r32
            r10 = r25
            r2 = 0
            r7 = r27
            X.C18070vi.A0d(r7, r2)
            r3 = 498148565(0x1db124d5, float:4.6889593E-21)
            r9 = r24
            r9.COC(r3)
            r3 = r31
            r11 = r31 & 1
            r4 = r30
            if (r11 == 0) goto L_0x0113
            r12 = r30 | 6
        L_0x0022:
            r17 = r31 & 2
            if (r17 == 0) goto L_0x0108
            r12 = r12 | 48
        L_0x0028:
            r11 = r4 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x003b
            r11 = r31 & 4
            if (r11 != 0) goto L_0x0038
            boolean r13 = r9.BEe(r0)
            r11 = 256(0x100, float:3.59E-43)
            if (r13 != 0) goto L_0x003a
        L_0x0038:
            r11 = 128(0x80, float:1.794E-43)
        L_0x003a:
            r12 = r12 | r11
        L_0x003b:
            r16 = r31 & 8
            if (r16 == 0) goto L_0x00fd
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0041:
            r15 = r31 & 16
            if (r15 == 0) goto L_0x00ee
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0047:
            r14 = r31 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x005b
            r11 = r30 & r13
            if (r11 != 0) goto L_0x005c
            boolean r11 = r9.BEd(r5)
            r13 = 65536(0x10000, float:9.18355E-41)
            if (r11 == 0) goto L_0x005b
            r13 = 131072(0x20000, float:1.83671E-40)
        L_0x005b:
            r12 = r12 | r13
        L_0x005c:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r12
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r11) goto L_0x0089
            boolean r11 = r9.BZO()
            if (r11 == 0) goto L_0x0089
            r9.CNR()
        L_0x006e:
            X.0Vf r9 = r9.BKF()
            if (r9 == 0) goto L_0x0088
            X.DXG r2 = new X.DXG
            r11 = r2
            r12 = r10
            r13 = r8
            r14 = r7
            r15 = r6
            r16 = r5
            r17 = r4
            r18 = r3
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r9.A06 = r2
        L_0x0088:
            return
        L_0x0089:
            r9.CNl()
            r11 = r30 & 1
            if (r11 == 0) goto L_0x00d2
            boolean r11 = r9.BQS()
            if (r11 != 0) goto L_0x00d2
            int r12 = X.BE9.A0A(r9, r3, r12)
        L_0x009a:
            r9.BKA()
            X.Ciy r11 = X.BE7.A0S(r9)
            X.Cvq r11 = r11.A00
            int r22 = A00(r12)
            int r13 = r12 >> 9
            r23 = r13 & 112(0x70, float:1.57E-43)
            int r12 = r12 >> 6
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r23 = r23 | r12
            r24 = 54776(0xd5f8, float:7.6758E-41)
            r27 = 0
            r12 = 0
            r14 = r12
            r16 = r12
            r18 = r12
            r31 = r27
            r33 = r2
            r13 = r12
            r19 = r6
            r20 = r5
            r21 = r2
            r25 = r0
            r29 = r27
            r15 = r8
            r17 = r7
            X.AnonymousClass0PA.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33)
            goto L_0x006e
        L_0x00d2:
            if (r17 == 0) goto L_0x00d6
            X.0WC r10 = X.C17090tj.A00
        L_0x00d6:
            r11 = r31 & 4
            if (r11 == 0) goto L_0x00e2
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A01(r9, r0)
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e2:
            if (r16 == 0) goto L_0x00e5
            r8 = 0
        L_0x00e5:
            if (r15 == 0) goto L_0x00e8
            r6 = 1
        L_0x00e8:
            if (r14 == 0) goto L_0x009a
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x009a
        L_0x00ee:
            r11 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0047
            boolean r11 = r9.BEd(r6)
            int r11 = X.AnonymousClass000.A08(r11)
            r12 = r12 | r11
            goto L_0x0047
        L_0x00fd:
            r11 = r4 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0041
            int r11 = X.AnonymousClass001.A0T(r9, r8)
            r12 = r12 | r11
            goto L_0x0041
        L_0x0108:
            r11 = r30 & 48
            if (r11 != 0) goto L_0x0028
            int r11 = X.AnonymousClass001.A0R(r9, r10)
            r12 = r12 | r11
            goto L_0x0028
        L_0x0113:
            r11 = r30 & 6
            if (r11 != 0) goto L_0x011f
            int r12 = X.AnonymousClass001.A0Z(r9, r7)
            r12 = r12 | r30
            goto L_0x0022
        L_0x011f:
            r12 = r4
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231CvN.A01(X.0tn, X.0tj, X.CqZ, java.lang.String, int, int, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r11.BEe(r0) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C17130tn r28, X.C17090tj r29, X.C26018CqZ r30, java.lang.String r31, int r32, int r33, long r34) {
        /*
            r5 = r30
            r0 = r34
            r12 = r29
            r2 = -733600504(0xffffffffd4462508, float:-3.40409922E12)
            r11 = r28
            r11.COC(r2)
            r2 = r33
            r6 = r33 & 1
            r3 = r32
            r7 = r32 | 6
            r4 = r31
            if (r6 != 0) goto L_0x0024
            r6 = r32 & 6
            if (r6 != 0) goto L_0x00d5
            int r7 = X.AnonymousClass001.A0Q(r11, r4)
            r7 = r7 | r32
        L_0x0024:
            r10 = r33 & 2
            if (r10 == 0) goto L_0x00ca
            r7 = r7 | 48
        L_0x002a:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x003d
            r6 = r33 & 4
            if (r6 != 0) goto L_0x003a
            boolean r8 = r11.BEe(r0)
            r6 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x003c
        L_0x003a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x003c:
            r7 = r7 | r6
        L_0x003d:
            r9 = r33 & 8
            if (r9 == 0) goto L_0x00bf
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r8 = r7 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r8 != r6) goto L_0x0068
            boolean r6 = r11.BZO()
            if (r6 == 0) goto L_0x0068
            r11.CNR()
        L_0x0052:
            X.0Vf r7 = r11.BKF()
            if (r7 == 0) goto L_0x0067
            r14 = 4
            X.DWk r6 = new X.DWk
            r8 = r6
            r9 = r5
            r10 = r12
            r11 = r4
            r12 = r3
            r13 = r2
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.A06 = r6
        L_0x0067:
            return
        L_0x0068:
            r11.CNl()
            r6 = r32 & 1
            if (r6 == 0) goto L_0x00ab
            boolean r6 = r11.BQS()
            if (r6 != 0) goto L_0x00ab
            int r7 = X.BE9.A0A(r11, r2, r7)
        L_0x0079:
            r11.BKA()
            X.Ciy r6 = X.BE7.A0S(r11)
            X.Cvq r13 = r6.A01
            int r24 = A00(r7)
            r26 = 65016(0xfdf8, float:9.1107E-41)
            r29 = 0
            r14 = 0
            r21 = 0
            r16 = r14
            r18 = r14
            r20 = r14
            r23 = r21
            r25 = r21
            r33 = r29
            r35 = r21
            r15 = r14
            r22 = r21
            r27 = r0
            r31 = r29
            r19 = r4
            r17 = r5
            X.AnonymousClass0PA.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35)
            goto L_0x0052
        L_0x00ab:
            if (r10 == 0) goto L_0x00af
            X.0WC r12 = X.C17090tj.A00
        L_0x00af:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x00bb
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A01(r11, r0)
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00bb:
            if (r9 == 0) goto L_0x0079
            r5 = 0
            goto L_0x0079
        L_0x00bf:
            r6 = r3 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0043
            int r6 = X.AnonymousClass001.A0T(r11, r5)
            r7 = r7 | r6
            goto L_0x0043
        L_0x00ca:
            r6 = r32 & 48
            if (r6 != 0) goto L_0x002a
            int r6 = X.AnonymousClass001.A0R(r11, r12)
            r7 = r7 | r6
            goto L_0x002a
        L_0x00d5:
            r7 = r3
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231CvN.A02(X.0tn, X.0tj, X.CqZ, java.lang.String, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r11.BEe(r0) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C17130tn r28, X.C17090tj r29, X.C26018CqZ r30, java.lang.String r31, int r32, int r33, long r34) {
        /*
            r5 = r30
            r0 = r34
            r12 = r29
            r2 = -995535255(0xffffffffc4a95669, float:-1354.7003)
            r11 = r28
            r11.COC(r2)
            r2 = r33
            r6 = r33 & 1
            r3 = r32
            r7 = r32 | 6
            r4 = r31
            if (r6 != 0) goto L_0x0024
            r6 = r32 & 6
            if (r6 != 0) goto L_0x00d3
            int r7 = X.AnonymousClass001.A0Q(r11, r4)
            r7 = r7 | r32
        L_0x0024:
            r10 = r33 & 2
            if (r10 == 0) goto L_0x00c8
            r7 = r7 | 48
        L_0x002a:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x003d
            r6 = r33 & 4
            if (r6 != 0) goto L_0x003a
            boolean r8 = r11.BEe(r0)
            r6 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x003c
        L_0x003a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x003c:
            r7 = r7 | r6
        L_0x003d:
            r9 = r33 & 8
            if (r9 == 0) goto L_0x00bd
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r8 = r7 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r8 != r6) goto L_0x0068
            boolean r6 = r11.BZO()
            if (r6 == 0) goto L_0x0068
            r11.CNR()
        L_0x0052:
            X.0Vf r7 = r11.BKF()
            if (r7 == 0) goto L_0x0067
            r14 = 1
            X.DWk r6 = new X.DWk
            r8 = r6
            r9 = r5
            r10 = r12
            r11 = r4
            r12 = r3
            r13 = r2
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.A06 = r6
        L_0x0067:
            return
        L_0x0068:
            r11.CNl()
            r6 = r32 & 1
            if (r6 == 0) goto L_0x00ab
            boolean r6 = r11.BQS()
            if (r6 != 0) goto L_0x00ab
            int r7 = X.BE9.A0A(r11, r2, r7)
        L_0x0079:
            r11.BKA()
            X.Ciy r6 = X.BE7.A0S(r11)
            X.Cvq r13 = r6.A02
            int r24 = A00(r7)
            r26 = 65016(0xfdf8, float:9.1107E-41)
            r29 = 0
            r14 = 0
            r21 = 0
            r16 = r14
            r18 = r14
            r20 = r14
            r23 = r21
            r25 = r21
            r33 = r29
            r35 = r21
            r15 = r14
            r22 = r21
            r27 = r0
            r31 = r29
            r19 = r4
            r17 = r5
            X.AnonymousClass0PA.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35)
            goto L_0x0052
        L_0x00ab:
            if (r10 == 0) goto L_0x00af
            X.0WC r12 = X.C17090tj.A00
        L_0x00af:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x00b9
            long r0 = X.C26257Cw2.A00(r11)
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00b9:
            if (r9 == 0) goto L_0x0079
            r5 = 0
            goto L_0x0079
        L_0x00bd:
            r6 = r3 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0043
            int r6 = X.AnonymousClass001.A0T(r11, r5)
            r7 = r7 | r6
            goto L_0x0043
        L_0x00c8:
            r6 = r32 & 48
            if (r6 != 0) goto L_0x002a
            int r6 = X.AnonymousClass001.A0R(r11, r12)
            r7 = r7 | r6
            goto L_0x002a
        L_0x00d3:
            r7 = r3
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231CvN.A03(X.0tn, X.0tj, X.CqZ, java.lang.String, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r12.BEe(r0) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C17130tn r29, X.C17090tj r30, X.C26018CqZ r31, java.lang.String r32, int r33, int r34, long r35) {
        /*
            r6 = r31
            r0 = r35
            r13 = r30
            r7 = 0
            r5 = r32
            X.C18070vi.A0d(r5, r7)
            r2 = -38953497(0xfffffffffdad9de7, float:-2.884704E37)
            r12 = r29
            r12.COC(r2)
            r3 = r34
            r2 = r34 & 1
            r4 = r33
            r8 = r33 | 6
            if (r2 != 0) goto L_0x0028
            r2 = r33 & 6
            if (r2 != 0) goto L_0x00d8
            int r8 = X.AnonymousClass001.A0Q(r12, r5)
            r8 = r8 | r33
        L_0x0028:
            r11 = r34 & 2
            if (r11 == 0) goto L_0x00cd
            r8 = r8 | 48
        L_0x002e:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0041
            r2 = r34 & 4
            if (r2 != 0) goto L_0x003e
            boolean r9 = r12.BEe(r0)
            r2 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r8 = r8 | r2
        L_0x0041:
            r10 = r34 & 8
            if (r10 == 0) goto L_0x00c2
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r9 = r8 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r9 != r2) goto L_0x006c
            boolean r2 = r12.BZO()
            if (r2 == 0) goto L_0x006c
            r12.CNR()
        L_0x0056:
            X.0Vf r7 = r12.BKF()
            if (r7 == 0) goto L_0x006b
            r14 = 5
            X.DWk r2 = new X.DWk
            r8 = r2
            r9 = r6
            r10 = r13
            r11 = r5
            r12 = r4
            r13 = r3
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.A06 = r2
        L_0x006b:
            return
        L_0x006c:
            r12.CNl()
            r2 = r33 & 1
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r12.BQS()
            if (r2 != 0) goto L_0x00b0
            int r8 = X.BE9.A0A(r12, r3, r8)
        L_0x007d:
            r12.BKA()
            X.Ciy r2 = X.BE7.A0S(r12)
            X.Cvq r14 = r2.A03
            int r25 = A00(r8)
            r27 = 65016(0xfdf8, float:9.1107E-41)
            r30 = 0
            r15 = 0
            r17 = r15
            r19 = r15
            r21 = r15
            r24 = r7
            r26 = r7
            r34 = r30
            r36 = r7
            r22 = r7
            r16 = r15
            r23 = r7
            r28 = r0
            r32 = r30
            r18 = r6
            r20 = r5
            X.AnonymousClass0PA.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36)
            goto L_0x0056
        L_0x00b0:
            if (r11 == 0) goto L_0x00b4
            X.0WC r13 = X.C17090tj.A00
        L_0x00b4:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x00be
            long r0 = X.C26257Cw2.A00(r12)
            r8 = r8 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00be:
            if (r10 == 0) goto L_0x007d
            r6 = 0
            goto L_0x007d
        L_0x00c2:
            r2 = r4 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0047
            int r2 = X.AnonymousClass001.A0T(r12, r6)
            r8 = r8 | r2
            goto L_0x0047
        L_0x00cd:
            r2 = r33 & 48
            if (r2 != 0) goto L_0x002e
            int r2 = X.AnonymousClass001.A0R(r12, r13)
            r8 = r8 | r2
            goto L_0x002e
        L_0x00d8:
            r8 = r4
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231CvN.A04(X.0tn, X.0tj, X.CqZ, java.lang.String, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r12.BEe(r0) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C17130tn r29, X.C17090tj r30, X.C26018CqZ r31, java.lang.String r32, int r33, int r34, long r35) {
        /*
            r6 = r31
            r0 = r35
            r13 = r30
            r7 = 0
            r5 = r32
            X.C18070vi.A0d(r5, r7)
            r2 = 441084156(0x1a4a68fc, float:4.1857427E-23)
            r12 = r29
            r12.COC(r2)
            r3 = r34
            r2 = r34 & 1
            r4 = r33
            r8 = r33 | 6
            if (r2 != 0) goto L_0x0028
            r2 = r33 & 6
            if (r2 != 0) goto L_0x00da
            int r8 = X.AnonymousClass001.A0Q(r12, r5)
            r8 = r8 | r33
        L_0x0028:
            r11 = r34 & 2
            if (r11 == 0) goto L_0x00cf
            r8 = r8 | 48
        L_0x002e:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0041
            r2 = r34 & 4
            if (r2 != 0) goto L_0x003e
            boolean r9 = r12.BEe(r0)
            r2 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r8 = r8 | r2
        L_0x0041:
            r10 = r34 & 8
            if (r10 == 0) goto L_0x00c4
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r9 = r8 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r9 != r2) goto L_0x006c
            boolean r2 = r12.BZO()
            if (r2 == 0) goto L_0x006c
            r12.CNR()
        L_0x0056:
            X.0Vf r7 = r12.BKF()
            if (r7 == 0) goto L_0x006b
            r14 = 3
            X.DWk r2 = new X.DWk
            r8 = r2
            r9 = r6
            r10 = r13
            r11 = r5
            r12 = r4
            r13 = r3
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.A06 = r2
        L_0x006b:
            return
        L_0x006c:
            r12.CNl()
            r2 = r33 & 1
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r12.BQS()
            if (r2 != 0) goto L_0x00b0
            int r8 = X.BE9.A0A(r12, r3, r8)
        L_0x007d:
            r12.BKA()
            X.Ciy r2 = X.BE7.A0S(r12)
            X.Cvq r14 = r2.A06
            int r25 = A00(r8)
            r27 = 65016(0xfdf8, float:9.1107E-41)
            r30 = 0
            r15 = 0
            r17 = r15
            r19 = r15
            r21 = r15
            r24 = r7
            r26 = r7
            r34 = r30
            r36 = r7
            r22 = r7
            r16 = r15
            r23 = r7
            r28 = r0
            r32 = r30
            r18 = r6
            r20 = r5
            X.AnonymousClass0PA.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36)
            goto L_0x0056
        L_0x00b0:
            if (r11 == 0) goto L_0x00b4
            X.0WC r13 = X.C17090tj.A00
        L_0x00b4:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x00c0
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A01(r12, r0)
            r8 = r8 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c0:
            if (r10 == 0) goto L_0x007d
            r6 = 0
            goto L_0x007d
        L_0x00c4:
            r2 = r4 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0047
            int r2 = X.AnonymousClass001.A0T(r12, r6)
            r8 = r8 | r2
            goto L_0x0047
        L_0x00cf:
            r2 = r33 & 48
            if (r2 != 0) goto L_0x002e
            int r2 = X.AnonymousClass001.A0R(r12, r13)
            r8 = r8 | r2
            goto L_0x002e
        L_0x00da:
            r8 = r4
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231CvN.A05(X.0tn, X.0tj, X.CqZ, java.lang.String, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r12.BEe(r0) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C17130tn r29, X.C17090tj r30, X.C26018CqZ r31, java.lang.String r32, int r33, int r34, long r35) {
        /*
            r6 = r31
            r0 = r35
            r13 = r30
            r7 = 0
            r5 = r32
            X.C18070vi.A0d(r5, r7)
            r2 = -368403301(0xffffffffea0a9c9b, float:-4.189283E25)
            r12 = r29
            r12.COC(r2)
            r3 = r34
            r2 = r34 & 1
            r4 = r33
            r8 = r33 | 6
            if (r2 != 0) goto L_0x0028
            r2 = r33 & 6
            if (r2 != 0) goto L_0x00da
            int r8 = X.AnonymousClass001.A0Q(r12, r5)
            r8 = r8 | r33
        L_0x0028:
            r11 = r34 & 2
            if (r11 == 0) goto L_0x00cf
            r8 = r8 | 48
        L_0x002e:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0041
            r2 = r34 & 4
            if (r2 != 0) goto L_0x003e
            boolean r9 = r12.BEe(r0)
            r2 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r8 = r8 | r2
        L_0x0041:
            r10 = r34 & 8
            if (r10 == 0) goto L_0x00c4
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r9 = r8 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r9 != r2) goto L_0x006c
            boolean r2 = r12.BZO()
            if (r2 == 0) goto L_0x006c
            r12.CNR()
        L_0x0056:
            X.0Vf r7 = r12.BKF()
            if (r7 == 0) goto L_0x006b
            r14 = 2
            X.DWk r2 = new X.DWk
            r8 = r2
            r9 = r6
            r10 = r13
            r11 = r5
            r12 = r4
            r13 = r3
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.A06 = r2
        L_0x006b:
            return
        L_0x006c:
            r12.CNl()
            r2 = r33 & 1
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r12.BQS()
            if (r2 != 0) goto L_0x00b0
            int r8 = X.BE9.A0A(r12, r3, r8)
        L_0x007d:
            r12.BKA()
            X.Ciy r2 = X.BE7.A0S(r12)
            X.Cvq r14 = r2.A07
            int r25 = A00(r8)
            r27 = 65016(0xfdf8, float:9.1107E-41)
            r30 = 0
            r15 = 0
            r17 = r15
            r19 = r15
            r21 = r15
            r24 = r7
            r26 = r7
            r34 = r30
            r36 = r7
            r22 = r7
            r16 = r15
            r23 = r7
            r28 = r0
            r32 = r30
            r18 = r6
            r20 = r5
            X.AnonymousClass0PA.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36)
            goto L_0x0056
        L_0x00b0:
            if (r11 == 0) goto L_0x00b4
            X.0WC r13 = X.C17090tj.A00
        L_0x00b4:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x00c0
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A01(r12, r0)
            r8 = r8 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c0:
            if (r10 == 0) goto L_0x007d
            r6 = 0
            goto L_0x007d
        L_0x00c4:
            r2 = r4 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0047
            int r2 = X.AnonymousClass001.A0T(r12, r6)
            r8 = r8 | r2
            goto L_0x0047
        L_0x00cf:
            r2 = r33 & 48
            if (r2 != 0) goto L_0x002e
            int r2 = X.AnonymousClass001.A0R(r12, r13)
            r8 = r8 | r2
            goto L_0x002e
        L_0x00da:
            r8 = r4
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231CvN.A06(X.0tn, X.0tj, X.CqZ, java.lang.String, int, int, long):void");
    }
}
