package X;

/* renamed from: X.CCt  reason: case insensitive filesystem */
public abstract class C24633CCt {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r15 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r10.BEe(r0) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        if (r10.BEe(r2) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        if ((r4 & 128) != 0) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r17, X.C17090tj r18, X.AnonymousClass1OS r19, X.AnonymousClass1OS r20, X.AnonymousClass1OS r21, X.AnonymousClass1OS r22, X.C36001nB r23, int r24, int r25, int r26, long r27, long r29) {
        /*
            r2 = r29
            r0 = r27
            r6 = r24
            r7 = r22
            r8 = r21
            r9 = r20
            r11 = r19
            r14 = r18
            r4 = -664519408(0xffffffffd8643d10, float:-1.00380365E15)
            r10 = r17
            r10.COC(r4)
            r4 = r26
            r22 = r26 & 1
            r5 = r25
            r12 = r25 | 6
            if (r22 != 0) goto L_0x002c
            r12 = r25 & 6
            if (r12 != 0) goto L_0x0195
            int r12 = X.AnonymousClass001.A0Q(r10, r14)
            r12 = r12 | r25
        L_0x002c:
            r21 = r26 & 2
            if (r21 == 0) goto L_0x018a
            r12 = r12 | 48
        L_0x0032:
            r20 = r26 & 4
            if (r20 == 0) goto L_0x017f
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0038:
            r19 = r26 & 8
            if (r19 == 0) goto L_0x0174
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x003e:
            r18 = r26 & 16
            if (r18 == 0) goto L_0x0165
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0044:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r25
            if (r13 != 0) goto L_0x0059
            r13 = r26 & 32
            if (r13 != 0) goto L_0x0056
            boolean r15 = r10.BEd(r6)
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r15 != 0) goto L_0x0058
        L_0x0056:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0058:
            r12 = r12 | r13
        L_0x0059:
            r13 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 & r25
            if (r13 != 0) goto L_0x006e
            r13 = r26 & 64
            if (r13 != 0) goto L_0x006b
            boolean r15 = r10.BEe(r0)
            r13 = 1048576(0x100000, float:1.469368E-39)
            if (r15 != 0) goto L_0x006d
        L_0x006b:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x006d:
            r12 = r12 | r13
        L_0x006e:
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r13 = r13 & r25
            if (r13 != 0) goto L_0x0083
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x0080
            boolean r15 = r10.BEe(r2)
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r15 != 0) goto L_0x0082
        L_0x0080:
            r13 = 4194304(0x400000, float:5.877472E-39)
        L_0x0082:
            r12 = r12 | r13
        L_0x0083:
            r13 = r4 & 256(0x100, float:3.59E-43)
            r15 = 100663296(0x6000000, float:2.4074124E-35)
            r27 = r23
            if (r13 != 0) goto L_0x009b
            r13 = r25 & r15
            if (r13 != 0) goto L_0x009c
            r13 = r27
            boolean r13 = r10.BEh(r13)
            r15 = 33554432(0x2000000, float:9.403955E-38)
            if (r13 == 0) goto L_0x009b
            r15 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x009b:
            r12 = r12 | r15
        L_0x009c:
            r15 = 38347923(0x2492493, float:1.4777644E-37)
            r15 = r15 & r12
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r15 != r13) goto L_0x00d0
            boolean r13 = r10.BZO()
            if (r13 == 0) goto L_0x00d0
            r10.CNR()
        L_0x00ae:
            X.0Vf r12 = r10.BKF()
            if (r12 == 0) goto L_0x00cf
            X.DXP r10 = new X.DXP
            r13 = r10
            r15 = r11
            r16 = r9
            r17 = r8
            r18 = r7
            r19 = r27
            r20 = r6
            r21 = r5
            r22 = r4
            r23 = r0
            r25 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)
            r12.A06 = r10
        L_0x00cf:
            return
        L_0x00d0:
            r10.CNl()
            r13 = r25 & 1
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r15 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r13 == 0) goto L_0x0136
            boolean r13 = r10.BQS()
            if (r13 != 0) goto L_0x0136
            r10.CNR()
            r13 = r26 & 32
            if (r13 == 0) goto L_0x00ee
            r12 = r12 & r15
        L_0x00ee:
            r13 = r26 & 64
            if (r13 == 0) goto L_0x00f4
            r12 = r12 & r16
        L_0x00f4:
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x00fa
        L_0x00f8:
            r12 = r12 & r17
        L_0x00fa:
            r10.BKA()
            X.07W r13 = X.CG7.A00
            long r23 = X.C26257Cw2.A02(r10, r13)
            r13 = r12 & 14
            int r21 = X.AnonymousClass001.A0F(r12, r13)
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r12
            r21 = r21 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r12
            r21 = r21 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r12
            r21 = r21 | r13
            int r13 = r12 << 3
            r12 = 1879048192(0x70000000, float:1.58456325E29)
            r13 = r13 & r12
            r21 = r21 | r13
            r12 = 0
            r22 = 256(0x100, float:3.59E-43)
            r19 = r27
            r20 = r6
            r25 = r2
            r13 = r10
            r15 = r11
            r16 = r9
            r17 = r8
            r18 = r7
            X.AnonymousClass0P9.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)
            goto L_0x00ae
        L_0x0136:
            if (r22 == 0) goto L_0x013a
            X.0WC r14 = X.C17090tj.A00
        L_0x013a:
            if (r21 == 0) goto L_0x013e
            X.1OS r11 = X.C24734CHw.A00
        L_0x013e:
            if (r20 == 0) goto L_0x0142
            X.1OS r9 = X.C24734CHw.A01
        L_0x0142:
            if (r19 == 0) goto L_0x0146
            X.1OS r8 = X.C24734CHw.A02
        L_0x0146:
            if (r18 == 0) goto L_0x014a
            X.1OS r7 = X.C24734CHw.A03
        L_0x014a:
            r13 = r26 & 32
            if (r13 == 0) goto L_0x0150
            r6 = 1
            r12 = r12 & r15
        L_0x0150:
            r13 = r26 & 64
            if (r13 == 0) goto L_0x015c
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A02(r10, r0)
            r12 = r12 & r16
        L_0x015c:
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x00fa
            long r2 = X.AnonymousClass0QB.A04(r10, r0)
            goto L_0x00f8
        L_0x0165:
            r13 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0044
            boolean r13 = r10.BEh(r7)
            int r13 = X.AnonymousClass000.A08(r13)
            r12 = r12 | r13
            goto L_0x0044
        L_0x0174:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x003e
            int r13 = X.AnonymousClass001.A0d(r10, r8)
            r12 = r12 | r13
            goto L_0x003e
        L_0x017f:
            r13 = r5 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0038
            int r13 = X.AnonymousClass001.A0c(r10, r9)
            r12 = r12 | r13
            goto L_0x0038
        L_0x018a:
            r13 = r25 & 48
            if (r13 != 0) goto L_0x0032
            int r13 = X.AnonymousClass001.A0b(r10, r11)
            r12 = r12 | r13
            goto L_0x0032
        L_0x0195:
            r12 = r5
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24633CCt.A00(X.0tn, X.0tj, X.1OS, X.1OS, X.1OS, X.1OS, X.1nB, int, int, int, long, long):void");
    }
}
