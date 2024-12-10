package androidx.compose.material3;

import X.AnonymousClass0Tz;

public abstract class AppBarKt {
    public static final float A00 = (16.0f - 4.0f);
    public static final AnonymousClass0Tz A01 = new AnonymousClass0Tz(0.8f, 0.8f, 0.15f);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r4.BEf(r5) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r12 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        if ((r34 & 32) != 0) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C17100tk r26, X.C03580Iv r27, X.C17130tn r28, X.C17090tj r29, X.AnonymousClass1OS r30, X.AnonymousClass1OS r31, X.C36001nB r32, int r33, int r34) {
        /*
            r8 = r27
            r5 = r26
            r7 = r32
            r9 = r31
            r11 = r29
            r1 = 0
            r6 = 0
            r10 = r30
            X.C18070vi.A0d(r10, r6)
            r0 = 1906353009(0x71a0a371, float:1.5908861E30)
            r4 = r28
            r4.COC(r0)
            r23 = r34
            r0 = r34 & 1
            r3 = r33
            if (r0 == 0) goto L_0x0190
            r2 = r33 | 6
        L_0x0023:
            r18 = r34 & 2
            if (r18 == 0) goto L_0x0185
            r2 = r2 | 48
        L_0x0029:
            r17 = r34 & 4
            if (r17 == 0) goto L_0x017a
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r16 = r34 & 8
            if (r16 == 0) goto L_0x016f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r15 = 57344(0xe000, float:8.0356E-41)
            r0 = r33 & r15
            if (r0 != 0) goto L_0x004b
            r0 = r34 & 16
            if (r0 != 0) goto L_0x0048
            boolean r12 = r4.BEf(r5)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r12 != 0) goto L_0x004a
        L_0x0048:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004a:
            r2 = r2 | r0
        L_0x004b:
            r14 = 458752(0x70000, float:6.42848E-40)
            r0 = r33 & r14
            if (r0 != 0) goto L_0x0060
            r0 = r34 & 32
            if (r0 != 0) goto L_0x005d
            boolean r12 = r4.BEf(r8)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r12 != 0) goto L_0x005f
        L_0x005d:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x005f:
            r2 = r2 | r0
        L_0x0060:
            r12 = r34 & 64
            r0 = 3670016(0x380000, float:5.142788E-39)
            if (r12 == 0) goto L_0x0165
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0068:
            r2 = r2 | r0
        L_0x0069:
            r1 = 2995931(0x2db6db, float:4.198194E-39)
            r1 = r1 & r2
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r0) goto L_0x0099
            boolean r0 = r4.BZO()
            if (r0 == 0) goto L_0x0099
            r4.CNR()
        L_0x007b:
            X.0Vf r1 = r4.BKF()
            if (r1 == 0) goto L_0x0098
            X.0nn r0 = new X.0nn
            r15 = r0
            r16 = r5
            r17 = r8
            r18 = r11
            r19 = r10
            r20 = r9
            r21 = r7
            r22 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A03(r0)
        L_0x0098:
            return
        L_0x0099:
            r4.CNl()
            r0 = r33 & 1
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r13 = 6
            if (r0 == 0) goto L_0x0100
            boolean r0 = r4.BQS()
            if (r0 != 0) goto L_0x0100
            r4.CNR()
            r0 = r34 & 16
            if (r0 == 0) goto L_0x00b5
            r2 = r2 & r1
        L_0x00b5:
            r0 = r34 & 32
            if (r0 == 0) goto L_0x00ba
        L_0x00b9:
            r2 = r2 & r12
        L_0x00ba:
            r4.BKA()
            X.07W r0 = X.C04050Lq.A00
            java.lang.Object r1 = r4.BFh(r0)
            X.0Oj r1 = (X.C04690Oj) r1
            java.lang.Integer r0 = X.C03050Gk.A02
            X.Cvq r16 = X.C04050Lq.A00(r1, r0)
            int r0 = r2 >> 3
            r0 = r0 & 14
            r1 = r0 | 3072(0xc00, float:4.305E-42)
            int r0 = r2 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            int r12 = r2 << 6
            r0 = r12 & r15
            r1 = r1 | r0
            r0 = r12 & r14
            r1 = r1 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r12
            r1 = r1 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r0
            r1 = r1 | r12
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r2 << r13
            r2 = r2 & r0
            r1 = r1 | r2
            r22 = r6
            r18 = r9
            r19 = r7
            r20 = r1
            r21 = r6
            r13 = r8
            r14 = r4
            r15 = r11
            r17 = r10
            r12 = r5
            A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x007b
        L_0x0100:
            if (r18 == 0) goto L_0x0104
            X.0WC r11 = X.C17090tj.A00
        L_0x0104:
            if (r17 == 0) goto L_0x010a
            X.1OS r9 = X.AnonymousClass0OC.A00()
        L_0x010a:
            if (r16 == 0) goto L_0x0110
            X.1nB r7 = X.AnonymousClass0OC.A01()
        L_0x0110:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x0129
            r0 = 2143182847(0x7fbe5fff, float:NaN)
            r4.COB(r0)
            X.0Lg r0 = X.C17100tk.A00
            X.0Ux r0 = X.AnonymousClass0EF.A00(r0, r4)
            X.0Uy r5 = new X.0Uy
            r5.<init>(r0)
            X.AnonymousClass0VR.A0U(r4)
            r2 = r2 & r1
        L_0x0129:
            r0 = r34 & 32
            if (r0 == 0) goto L_0x00ba
            r0 = 2142919275(0x7fba5a6b, float:NaN)
            r4.COB(r0)
            java.lang.Integer r0 = X.C03050Gk.A00
            long r0 = X.AnonymousClass0QB.A05(r4, r0)
            X.07W r8 = X.AnonymousClass0QB.A00
            java.lang.Object r8 = r4.BFh(r8)
            X.0OR r8 = (X.AnonymousClass0OR) r8
            long r27 = X.AnonymousClass0QB.A01(r8, r0)
            java.lang.Integer r8 = X.C03050Gk.A03
            long r29 = X.AnonymousClass0QB.A05(r4, r8)
            java.lang.Integer r8 = X.C03050Gk.A01
            long r31 = X.AnonymousClass0QB.A05(r4, r8)
            java.lang.Integer r8 = X.C03050Gk.A04
            long r33 = X.AnonymousClass0QB.A05(r4, r8)
            X.0Iv r8 = new X.0Iv
            r24 = r8
            r25 = r0
            r24.<init>(r25, r27, r29, r31, r33)
            X.AnonymousClass0VR.A0U(r4)
            goto L_0x00b9
        L_0x0165:
            r0 = r33 & r0
            if (r0 != 0) goto L_0x0069
            int r0 = X.AnonymousClass001.A0W(r4, r1)
            goto L_0x0068
        L_0x016f:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0035
            int r0 = X.AnonymousClass001.A0d(r4, r7)
            r2 = r2 | r0
            goto L_0x0035
        L_0x017a:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002f
            int r0 = X.AnonymousClass001.A0c(r4, r9)
            r2 = r2 | r0
            goto L_0x002f
        L_0x0185:
            r0 = r33 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0029
            int r0 = X.AnonymousClass001.A0R(r4, r11)
            r2 = r2 | r0
            goto L_0x0029
        L_0x0190:
            r0 = r33 & 14
            if (r0 != 0) goto L_0x01a0
            boolean r0 = r4.BEh(r10)
            int r2 = X.AnonymousClass000.A09(r0)
            r2 = r2 | r33
            goto L_0x0023
        L_0x01a0:
            r2 = r3
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.A04(X.0tk, X.0Iv, X.0tn, X.0tj, X.1OS, X.1OS, X.1nB, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C16120rk r52, X.C16130rl r53, X.C17130tn r54, X.C17090tj r55, X.C26251Cvq r56, X.AnonymousClass1OS r57, X.AnonymousClass1OS r58, X.AnonymousClass1OS r59, float r60, float r61, int r62, int r63, int r64, long r65, long r67, long r69, boolean r71) {
        /*
            r0 = -6794037(0xffffffffff9854cb, float:NaN)
            r6 = r54
            r6.COC(r0)
            r5 = r63
            r0 = r63 & 14
            r2 = 4
            r50 = r55
            if (r0 != 0) goto L_0x0368
            r0 = r50
            int r0 = X.AnonymousClass001.A0Q(r6, r0)
            r8 = r63 | r0
        L_0x0019:
            r0 = r63 & 112(0x70, float:1.57E-43)
            r45 = r60
            if (r0 != 0) goto L_0x002a
            r0 = r45
            boolean r0 = r6.BEc(r0)
            int r0 = X.AnonymousClass000.A0A(r0)
            r8 = r8 | r0
        L_0x002a:
            r0 = r5 & 896(0x380, float:1.256E-42)
            r42 = r65
            if (r0 != 0) goto L_0x0037
            r0 = r42
            int r0 = X.AnonymousClass001.A0P(r6, r0)
            r8 = r8 | r0
        L_0x0037:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            r40 = r67
            if (r0 != 0) goto L_0x004a
            r0 = r40
            boolean r1 = r6.BEe(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0049:
            r8 = r8 | r0
        L_0x004a:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r63
            r38 = r69
            if (r0 != 0) goto L_0x005e
            r0 = r38
            boolean r0 = r6.BEe(r0)
            int r0 = X.AnonymousClass000.A08(r0)
            r8 = r8 | r0
        L_0x005e:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r63
            r48 = r57
            if (r0 != 0) goto L_0x006d
            r0 = r48
            int r0 = X.AnonymousClass001.A0e(r6, r0)
            r8 = r8 | r0
        L_0x006d:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r63
            r49 = r56
            if (r0 != 0) goto L_0x007c
            r0 = r49
            int r0 = X.AnonymousClass001.A0W(r6, r0)
            r8 = r8 | r0
        L_0x007c:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r63
            r30 = r61
            if (r0 != 0) goto L_0x0091
            r0 = r30
            boolean r1 = r6.BEc(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r1 == 0) goto L_0x0090
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0090:
            r8 = r8 | r0
        L_0x0091:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r63 & r0
            r51 = r53
            if (r0 != 0) goto L_0x00a0
            r0 = r51
            int r0 = X.AnonymousClass001.A0Y(r6, r0)
            r8 = r8 | r0
        L_0x00a0:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r63 & r0
            if (r0 != 0) goto L_0x00b1
            r0 = r52
            boolean r0 = r6.BEf(r0)
            int r0 = X.AnonymousClass000.A06(r0)
            r8 = r8 | r0
        L_0x00b1:
            r27 = r64
            r0 = r64 & 14
            r44 = r62
            if (r0 != 0) goto L_0x0364
            r0 = r44
            boolean r0 = r6.BEd(r0)
            if (r0 != 0) goto L_0x00c2
            r2 = 2
        L_0x00c2:
            r4 = r64 | r2
        L_0x00c4:
            r0 = r64 & 112(0x70, float:1.57E-43)
            r26 = r71
            if (r0 != 0) goto L_0x00d5
            r0 = r26
            boolean r0 = r6.BEg(r0)
            int r0 = X.AnonymousClass000.A0A(r0)
            r4 = r4 | r0
        L_0x00d5:
            r0 = r27
            r0 = r0 & 896(0x380, float:1.256E-42)
            r47 = r58
            if (r0 != 0) goto L_0x00e4
            r0 = r47
            int r0 = X.AnonymousClass001.A0c(r6, r0)
            r4 = r4 | r0
        L_0x00e4:
            r0 = r27
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r46 = r59
            if (r0 != 0) goto L_0x00f3
            r0 = r46
            int r0 = X.AnonymousClass001.A0d(r6, r0)
            r4 = r4 | r0
        L_0x00f3:
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r8
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x013a
            r1 = r4 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x013a
            boolean r0 = r6.BZO()
            if (r0 == 0) goto L_0x013a
            r6.CNR()
        L_0x010b:
            X.0Vf r0 = r6.BKF()
            if (r0 == 0) goto L_0x0139
            X.0o6 r6 = new X.0o6
            r7 = r52
            r8 = r51
            r9 = r50
            r10 = r49
            r11 = r48
            r12 = r47
            r13 = r46
            r14 = r45
            r15 = r30
            r16 = r44
            r17 = r5
            r18 = r27
            r19 = r42
            r21 = r40
            r23 = r38
            r25 = r26
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25)
            r0.A03(r6)
        L_0x0139:
            return
        L_0x013a:
            X.0Wz r7 = new X.0Wz
            r3 = r52
            r2 = r51
            r1 = r45
            r0 = r44
            r7.<init>(r3, r2, r1, r0)
            int r0 = r8 << 3
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r6.COB(r0)
            X.07W r25 = X.AnonymousClass0OD.A01
            r0 = r25
            java.lang.Object r10 = r6.BFh(r0)
            X.07W r13 = X.AnonymousClass0OD.A06
            java.lang.Object r9 = r6.BFh(r13)
            X.07W r12 = X.AnonymousClass0OD.A0B
            java.lang.Object r1 = r6.BFh(r12)
            X.0vk r24 = X.C05030Qc.A00()
            X.04D r2 = X.AnonymousClass0LO.A00(r50)
            int r14 = X.AnonymousClass001.A0O(r6, r3)
            r3 = r6
            X.0VR r3 = (X.AnonymousClass0VR) r3
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x035f
            r0 = r24
            r6.BHe(r0)
        L_0x017d:
            X.1OS r23 = X.C05030Qc.A04()
            r0 = r23
            X.AnonymousClass0EM.A00(r6, r7, r0)
            X.1OS r22 = X.C05030Qc.A02()
            r0 = r22
            X.AnonymousClass0EM.A00(r6, r10, r0)
            X.1OS r11 = X.C05030Qc.A03()
            X.AnonymousClass0EM.A00(r6, r9, r11)
            X.1OS r10 = X.C05030Qc.A07()
            X.AnonymousClass0EM.A00(r6, r1, r10)
            X.0OT r1 = new X.0OT
            r1.<init>(r6)
            java.lang.Integer r0 = X.AnonymousClass000.A0q(r14)
            r2.invoke(r1, r6, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6.COB(r0)
            X.0WC r2 = X.C17090tj.A00
            java.lang.String r0 = "navigationIcon"
            androidx.compose.ui.layout.LayoutIdElement r1 = new androidx.compose.ui.layout.LayoutIdElement
            r1.<init>(r0)
            r7 = 0
            r0 = 1082130432(0x40800000, float:4.0)
            X.0tj r14 = X.AnonymousClass0Q7.A06(r1, r0, r7, r7, r7)
            androidx.compose.ui.Alignment r21 = X.AnonymousClass000.A0c(r6)
            r9 = 0
            r0 = r21
            X.0tM r18 = X.C04870Pg.A00(r6, r0, r9)
            r0 = r25
            java.lang.Object r17 = X.AnonymousClass001.A1D(r6, r0)
            java.lang.Object r16 = r6.BFh(r13)
            java.lang.Object r1 = r6.BFh(r12)
            X.04D r15 = X.AnonymousClass0LO.A00(r14)
            r6.COE()
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x035a
            r0 = r24
            r6.BHe(r0)
        L_0x01e8:
            r3.A0O = r9
            r14 = r23
            r0 = r18
            X.AnonymousClass0EM.A00(r6, r0, r14)
            r14 = r22
            r0 = r17
            X.AnonymousClass0EM.A00(r6, r0, r14)
            r0 = r16
            X.AnonymousClass0EM.A00(r6, r0, r11)
            X.AnonymousClass0EM.A00(r6, r1, r10)
            X.0OT r0 = X.AnonymousClass0OT.A00(r6)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)
            r1 = r20
            r15.invoke(r0, r6, r1)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6.COB(r0)
            r0 = 1
            X.0Hd[] r0 = new X.C03230Hd[r0]
            r15 = r0
            X.07W r19 = X.AnonymousClass0G4.A00
            X.0Qk r14 = new X.0Qk
            r0 = r42
            r14.<init>(r0)
            r1 = r19
            X.AnonymousClass07W.A00(r1, r14, r15, r9)
            int r0 = r4 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r9 = r0 | 8
            r1 = r47
            X.AnonymousClass0PZ.A04(r6, r1, r15, r9)
            boolean r9 = X.AnonymousClass0VR.A0Y(r3)
            java.lang.String r0 = "title"
            androidx.compose.ui.layout.LayoutIdElement r1 = new androidx.compose.ui.layout.LayoutIdElement
            r1.<init>(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            X.0tj r1 = X.AnonymousClass0Q7.A05(r1, r0, r7)
            if (r71 == 0) goto L_0x0249
            X.0l1 r0 = X.AnonymousClass0l1.A00
            X.0tj r2 = X.AnonymousClass0PD.A00(r2, r0)
        L_0x0249:
            X.0tj r1 = r1.CP5(r2)
            r2 = 0
            long r31 = X.AnonymousClass0NB.A01
            X.0s9 r29 = X.AnonymousClass0GC.A00
            long r33 = X.AnonymousClass0GB.A00
            androidx.compose.ui.graphics.GraphicsLayerElement r0 = new androidx.compose.ui.graphics.GraphicsLayerElement
            r35 = r33
            r37 = r2
            r28 = r0
            r28.<init>(r29, r30, r31, r33, r35, r37)
            X.0tj r14 = r1.CP5(r0)
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r6.COB(r0)
            r0 = r21
            X.0tM r18 = X.C04870Pg.A00(r6, r0, r2)
            r0 = r25
            java.lang.Object r17 = X.AnonymousClass001.A1D(r6, r0)
            java.lang.Object r16 = r6.BFh(r13)
            java.lang.Object r1 = r6.BFh(r12)
            X.04D r15 = X.AnonymousClass0LO.A00(r14)
            r6.COE()
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0355
            r0 = r24
            r6.BHe(r0)
        L_0x028d:
            r3.A0O = r2
            r14 = r23
            r0 = r18
            X.AnonymousClass0EM.A00(r6, r0, r14)
            r14 = r22
            r0 = r17
            X.AnonymousClass0EM.A00(r6, r0, r14)
            r0 = r16
            X.AnonymousClass0EM.A00(r6, r0, r11)
            X.AnonymousClass0EM.A00(r6, r1, r10)
            X.0OT r14 = X.AnonymousClass0OT.A00(r6)
            r1 = r20
            r15.invoke(r14, r6, r1)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6.COB(r0)
            X.0n5 r14 = new X.0n5
            r15 = r48
            r0 = r40
            r14.<init>(r15, r8, r0)
            r1 = 824316656(0x312212f0, float:2.3584867E-9)
            X.04D r14 = X.AnonymousClass0LC.A00(r6, r14, r1)
            int r0 = r8 >> 18
            r0 = r0 & 14
            r1 = r0 | 48
            r0 = r49
            X.AnonymousClass0PA.A02(r6, r0, r14, r1)
            X.AnonymousClass0VR.A0Q(r3, r9)
            java.lang.String r0 = "actionIcons"
            androidx.compose.ui.layout.LayoutIdElement r1 = new androidx.compose.ui.layout.LayoutIdElement
            r1.<init>(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            X.0tj r7 = X.AnonymousClass0Q7.A06(r1, r7, r7, r0, r7)
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r6.COB(r0)
            r0 = r21
            X.0tM r8 = X.C04870Pg.A00(r6, r0, r2)
            r0 = r25
            java.lang.Object r1 = X.AnonymousClass001.A1D(r6, r0)
            java.lang.Object r13 = r6.BFh(r13)
            java.lang.Object r12 = r6.BFh(r12)
            X.04D r7 = X.AnonymousClass0LO.A00(r7)
            r6.COE()
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0351
            r0 = r24
            r6.BHe(r0)
        L_0x0309:
            r3.A0O = r2
            r0 = r23
            X.AnonymousClass0EM.A00(r6, r8, r0)
            r0 = r22
            X.AnonymousClass0EM.A00(r6, r1, r0)
            X.AnonymousClass0EM.A00(r6, r13, r11)
            X.AnonymousClass0EM.A00(r6, r12, r10)
            X.0OT r1 = X.AnonymousClass0OT.A00(r6)
            r0 = r20
            r7.invoke(r1, r6, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6.COB(r0)
            X.0Hd[] r8 = new X.C03230Hd[r9]
            X.0Qk r7 = new X.0Qk
            r0 = r38
            r7.<init>(r0)
            r0 = r19
            X.AnonymousClass07W.A00(r0, r7, r8, r2)
            int r0 = r4 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r0 | 8
            r0 = r46
            X.AnonymousClass0PZ.A04(r6, r0, r8, r1)
            X.AnonymousClass0VR.A0Q(r3, r9)
            X.AnonymousClass0VR.A0R(r3, r2)
            X.AnonymousClass0VR.A0R(r3, r9)
            X.AnonymousClass0VR.A0R(r3, r2)
            goto L_0x010b
        L_0x0351:
            r6.CRc()
            goto L_0x0309
        L_0x0355:
            r6.CRc()
            goto L_0x028d
        L_0x035a:
            r6.CRc()
            goto L_0x01e8
        L_0x035f:
            r6.CRc()
            goto L_0x017d
        L_0x0364:
            r4 = r27
            goto L_0x00c4
        L_0x0368:
            r8 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.A00(X.0rk, X.0rl, X.0tn, X.0tj, X.Cvq, X.1OS, X.1OS, X.1OS, float, float, int, int, int, long, long, long, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C17100tk r25, X.C03580Iv r26, X.C17130tn r27, X.C17090tj r28, X.C26251Cvq r29, X.AnonymousClass1OS r30, X.AnonymousClass1OS r31, X.C36001nB r32, int r33, int r34, boolean r35) {
        /*
            r8 = r28
            r7 = 0
            r0 = 1841601619(0x6dc49c53, float:7.606006E27)
            r6 = r27
            r6.COC(r0)
            r4 = r34
            r2 = r34 & 1
            r5 = r33
            if (r2 == 0) goto L_0x0191
            r9 = r33 | 6
        L_0x0015:
            r0 = r34 & 2
            if (r0 == 0) goto L_0x0184
            r9 = r9 | 48
        L_0x001b:
            r0 = r34 & 4
            if (r0 == 0) goto L_0x0177
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0021:
            r0 = r34 & 8
            r14 = r35
            if (r0 == 0) goto L_0x016c
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0029:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x0158
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x002f:
            r1 = r34 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r13 = r32
            if (r1 != 0) goto L_0x0041
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r33
            if (r0 != 0) goto L_0x0042
            int r0 = X.AnonymousClass001.A0e(r6, r13)
        L_0x0041:
            r9 = r9 | r0
        L_0x0042:
            r1 = r34 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r35 = r25
            if (r1 != 0) goto L_0x0056
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r33
            if (r0 != 0) goto L_0x0057
            r0 = r35
            int r0 = X.AnonymousClass001.A0W(r6, r0)
        L_0x0056:
            r9 = r9 | r0
        L_0x0057:
            r1 = r4 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r10 = r26
            if (r1 != 0) goto L_0x0069
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r33
            if (r0 != 0) goto L_0x006a
            int r0 = X.AnonymousClass001.A0X(r6, r10)
        L_0x0069:
            r9 = r9 | r0
        L_0x006a:
            r1 = r4 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 != 0) goto L_0x007a
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r33
            if (r0 != 0) goto L_0x007b
            int r0 = X.AnonymousClass001.A0Y(r6, r7)
        L_0x007a:
            r9 = r9 | r0
        L_0x007b:
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r1 & r9
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00b1
            boolean r0 = r6.BZO()
            if (r0 == 0) goto L_0x00b1
            r6.CNR()
        L_0x008d:
            X.0Vf r1 = r6.BKF()
            if (r1 == 0) goto L_0x00b0
            X.0nw r0 = new X.0nw
            r15 = r0
            r16 = r35
            r17 = r10
            r18 = r8
            r19 = r29
            r20 = r30
            r21 = r31
            r22 = r13
            r23 = r5
            r24 = r4
            r25 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A03(r0)
        L_0x00b0:
            return
        L_0x00b1:
            if (r2 == 0) goto L_0x00b5
            X.0WC r8 = X.C17090tj.A00
        L_0x00b5:
            X.07W r0 = X.AnonymousClass0OD.A01
            java.lang.Object r1 = r6.BFh(r0)
            X.ECa r1 = (X.C28644ECa) r1
            r0 = 1115684864(0x42800000, float:64.0)
            float r0 = r1.CPQ(r0)
            float r2 = -r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            boolean r0 = X.AnonymousClass001.A1Z(r6, r7, r0)
            java.lang.Object r1 = r6.CER()
            if (r0 != 0) goto L_0x00d6
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r1 != r0) goto L_0x00de
        L_0x00d6:
            X.0eu r1 = new X.0eu
            r1.<init>(r2)
            X.AnonymousClass0VR.A0V(r6, r1)
        L_0x00de:
            r12 = r6
            X.0VR r12 = (X.AnonymousClass0VR) r12
            r0 = 0
            X.AnonymousClass0VR.A0R(r12, r0)
            X.0vk r1 = (X.C18090vk) r1
            X.AnonymousClass0QC.A05(r6, r1)
            r11 = 0
            r0 = -1456204135(0xffffffffa9341699, float:-3.998763E-14)
            r6.COB(r0)
            long r2 = r10.A01
            long r0 = r10.A03
            X.0ra r15 = X.C02980Gd.A00
            float r15 = r15.CPf(r11)
            long r0 = X.AnonymousClass0Oy.A01(r15, r2, r0)
            r2 = 0
            X.AnonymousClass0VR.A0R(r12, r2)
            r3 = 1137180672(0x43c80000, float:400.0)
            X.0U0 r2 = new X.0U0
            r2.<init>(r7, r3)
            X.0s2 r2 = X.AnonymousClass0LZ.A00(r2, r6, r0)
            X.0ms r1 = new X.0ms
            r1.<init>(r13, r9)
            r0 = 1520880938(0x5aa6cd2a, float:2.34752132E16)
            X.04D r32 = X.AnonymousClass0LC.A00(r6, r1, r0)
            r0 = -1008376318(0xffffffffc3e56602, float:-458.79694)
            r6.COB(r0)
            X.0WC r1 = X.C17090tj.A00
            r0 = 0
            X.AnonymousClass0VR.A0R(r12, r0)
            X.0tj r17 = r8.CP5(r1)
            long r24 = X.AnonymousClass000.A0W(r2)
            X.0nm r1 = new X.0nm
            r26 = r1
            r27 = r35
            r28 = r10
            r33 = r9
            r34 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = 376925230(0x16776c2e, float:1.9986637E-25)
            X.04D r19 = X.AnonymousClass0LC.A00(r6, r1, r0)
            r23 = 122(0x7a, float:1.71E-43)
            r26 = 0
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = r7
            r20 = r11
            r16 = r6
            r18 = r7
            r21 = r11
            X.AnonymousClass0Pu.A04(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x008d
        L_0x0158:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r33
            if (r0 != 0) goto L_0x002f
            r0 = r31
            boolean r0 = r6.BEh(r0)
            int r0 = X.AnonymousClass000.A08(r0)
            r9 = r9 | r0
            goto L_0x002f
        L_0x016c:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0029
            int r0 = X.AnonymousClass001.A0j(r6, r14)
            r9 = r9 | r0
            goto L_0x0029
        L_0x0177:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0021
            r0 = r29
            int r0 = X.AnonymousClass001.A0S(r6, r0)
            r9 = r9 | r0
            goto L_0x0021
        L_0x0184:
            r0 = r33 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x001b
            r0 = r30
            int r0 = X.AnonymousClass001.A0b(r6, r0)
            r9 = r9 | r0
            goto L_0x001b
        L_0x0191:
            r0 = r33 & 14
            if (r0 != 0) goto L_0x019d
            int r9 = X.AnonymousClass001.A0Z(r6, r8)
            r9 = r9 | r33
            goto L_0x0015
        L_0x019d:
            r9 = r5
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.A02(X.0tk, X.0Iv, X.0tn, X.0tj, X.Cvq, X.1OS, X.1OS, X.1nB, int, int, boolean):void");
    }
}
