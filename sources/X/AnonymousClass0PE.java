package X;

import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;

/* renamed from: X.0PE  reason: invalid class name */
public abstract class AnonymousClass0PE {
    public static final long A00 = C26229CvL.A03(0, 0, 0, 0);
    public static final C17090tj A01 = new UnspecifiedConstraintsElement(48.0f, 48.0f);

    public static final Object A00(C16860tL r2) {
        C15820rG r22;
        C18070vi.A0d(r2, 0);
        Object BWC = r2.BWC();
        if (!(BWC instanceof C15820rG) || (r22 = (C15820rG) BWC) == null) {
            return null;
        }
        return ((AnonymousClass09N) r22).A00;
    }

    public static final void A02(C17130tn r10, C26251Cvq cvq, AnonymousClass1OS r12, int i, int i2, long j) {
        C26251Cvq cvq2 = cvq;
        AnonymousClass1OS r5 = r12;
        C18070vi.A0d(r12, 2);
        r10.COC(-1520066345);
        int i3 = i2;
        int i4 = i;
        int i5 = i | 6;
        long j2 = j;
        if ((i2 & 1) == 0) {
            if ((i & 14) == 0) {
                i5 = AnonymousClass000.A09(r10.BEe(j2) ? 1 : 0) | i;
            } else {
                i5 = i;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 112) == 0) {
            i5 |= AnonymousClass001.A0R(r10, cvq);
        }
        if ((i2 & 4) != 0) {
            i5 |= 384;
        } else if ((i & 896) == 0) {
            i5 |= AnonymousClass001.A0c(r10, r12);
        }
        if ((i5 & 731) != 146 || !r10.BZO()) {
            if (i6 != 0) {
                cvq2 = null;
            }
            AnonymousClass04D A002 = AnonymousClass0LC.A00(r10, new C13290nA(r12, i5, j2), 1449369305);
            if (cvq2 != null) {
                r10.COB(1830468032);
                AnonymousClass0PA.A02(r10, cvq2, A002, ((i5 >> 3) & 14) | 48);
            } else {
                r10.COB(1830468084);
                A002.invoke(r10, 6);
            }
            AnonymousClass0VR.A0T(r10);
        } else {
            r10.CNR();
        }
        C05660Vf BKF = r10.BKF();
        if (BKF != null) {
            BKF.A03(new C13510nW(cvq2, r5, i4, i3, j2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C16110rj r48, X.AnonymousClass0tB r49, X.AnonymousClass0NY r50, X.AnonymousClass0CJ r51, X.C17130tn r52, X.EBO r53, java.lang.String r54, X.AnonymousClass1OS r55, X.AnonymousClass1OS r56, X.AnonymousClass1OS r57, X.AnonymousClass1OS r58, X.AnonymousClass1OS r59, X.AnonymousClass1OS r60, X.AnonymousClass1OS r61, X.AnonymousClass1OS r62, X.AnonymousClass1OS r63, int r64, int r65, int r66, boolean r67, boolean r68, boolean r69) {
        /*
            r33 = r57
            r36 = r58
            r37 = r59
            r59 = r60
            r58 = r61
            r23 = r67
            r22 = r68
            r21 = r69
            r9 = 0
            r28 = r51
            r0 = r28
            X.C18070vi.A0d(r0, r9)
            r1 = 1
            r60 = r54
            r0 = r60
            X.C18070vi.A0d(r0, r1)
            r1 = 2
            r39 = r55
            r0 = r39
            X.C18070vi.A0d(r0, r1)
            r1 = 3
            r61 = r53
            r0 = r61
            X.C18070vi.A0d(r0, r1)
            r1 = 14
            r25 = r48
            r0 = r25
            X.C18070vi.A0d(r0, r1)
            r1 = 15
            r26 = r49
            r0 = r26
            X.C18070vi.A0d(r0, r1)
            r1 = 16
            r27 = r50
            r0 = r27
            X.C18070vi.A0d(r0, r1)
            r1 = 17
            r40 = r63
            r0 = r40
            X.C18070vi.A0d(r0, r1)
            r0 = -947035500(0xffffffffc78d6294, float:-72389.16)
            r6 = r52
            r6.COC(r0)
            r3 = r66
            r0 = r66 & 1
            r7 = 2
            r5 = r64
            r8 = r64 | 6
            if (r0 != 0) goto L_0x0074
            r0 = r64 & 14
            r8 = r5
            if (r0 != 0) goto L_0x0074
            r0 = r28
            int r8 = X.AnonymousClass001.A0Q(r6, r0)
            r8 = r8 | r64
        L_0x0074:
            r0 = r66 & 2
            r13 = 16
            if (r0 == 0) goto L_0x0375
            r8 = r8 | 48
        L_0x007c:
            r0 = r66 & 4
            r14 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0368
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0084:
            r0 = r66 & 8
            r20 = 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x035b
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x008c:
            r0 = r66 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            r32 = r56
            if (r0 == 0) goto L_0x0347
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0096:
            r19 = r66 & 32
            r18 = 131072(0x20000, float:1.83671E-40)
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r19 != 0) goto L_0x00ac
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r64
            if (r0 != 0) goto L_0x00ad
            r0 = r33
            int r0 = X.AnonymousClass001.A0e(r6, r0)
        L_0x00ac:
            r8 = r8 | r0
        L_0x00ad:
            r16 = r66 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x00bf
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r64 & r0
            if (r0 != 0) goto L_0x00c0
            r0 = r36
            int r0 = X.AnonymousClass001.A0f(r6, r0)
        L_0x00bf:
            r8 = r8 | r0
        L_0x00c0:
            r10 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x00d2
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r64
            if (r0 != 0) goto L_0x00d3
            r0 = r37
            int r0 = X.AnonymousClass001.A0g(r6, r0)
        L_0x00d2:
            r8 = r8 | r0
        L_0x00d3:
            r2 = r3 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 != 0) goto L_0x00e9
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r64
            if (r0 != 0) goto L_0x00ea
            r0 = r59
            boolean r0 = r6.BEh(r0)
            int r0 = X.AnonymousClass000.A07(r0)
        L_0x00e9:
            r8 = r8 | r0
        L_0x00ea:
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0338
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r8
            r8 = r0
        L_0x00f2:
            r11 = r3 & 1024(0x400, float:1.435E-42)
            r4 = r65
            r24 = r62
            if (r11 == 0) goto L_0x0324
            r7 = r65 | 6
        L_0x00fc:
            r12 = r3 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0313
            r7 = r7 | 48
        L_0x0102:
            r13 = r3 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0302
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0108:
            r14 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x02f0
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x010e:
            r0 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02dc
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0114:
            r15 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 & r66
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r15 != 0) goto L_0x0129
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r65
            if (r0 != 0) goto L_0x012a
            r0 = r26
            int r0 = X.AnonymousClass001.A0V(r6, r0)
        L_0x0129:
            r7 = r7 | r0
        L_0x012a:
            r15 = r66 & r17
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r15 != 0) goto L_0x013c
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r65
            if (r0 != 0) goto L_0x013d
            r0 = r27
            int r0 = X.AnonymousClass001.A0W(r6, r0)
        L_0x013c:
            r7 = r7 | r0
        L_0x013d:
            r15 = r66 & r18
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 != 0) goto L_0x014f
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r65
            if (r0 != 0) goto L_0x0150
            r0 = r40
            int r0 = X.AnonymousClass001.A0g(r6, r0)
        L_0x014f:
            r7 = r7 | r0
        L_0x0150:
            r15 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r15 = r15 & r8
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r0) goto L_0x019a
            r15 = 23967451(0x16db6db, float:4.3661218E-38)
            r15 = r15 & r7
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r15 != r0) goto L_0x019a
            boolean r0 = r6.BZO()
            if (r0 == 0) goto L_0x019a
            r6.CNR()
            r38 = r24
        L_0x016d:
            X.0Vf r1 = r6.BKF()
            if (r1 == 0) goto L_0x0199
            X.0oD r0 = new X.0oD
            r24 = r0
            r29 = r61
            r30 = r60
            r31 = r39
            r34 = r36
            r35 = r37
            r36 = r59
            r37 = r58
            r39 = r40
            r40 = r5
            r41 = r4
            r42 = r3
            r43 = r23
            r44 = r22
            r45 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r1.A03(r0)
        L_0x0199:
            return
        L_0x019a:
            r38 = 0
            if (r19 == 0) goto L_0x01a0
            r33 = r38
        L_0x01a0:
            if (r16 == 0) goto L_0x01a4
            r36 = r38
        L_0x01a4:
            if (r10 == 0) goto L_0x01a8
            r37 = r38
        L_0x01a8:
            if (r2 == 0) goto L_0x01ac
            r59 = r38
        L_0x01ac:
            if (r1 == 0) goto L_0x01b0
            r58 = r38
        L_0x01b0:
            if (r11 != 0) goto L_0x01b4
            r38 = r24
        L_0x01b4:
            if (r12 == 0) goto L_0x01b8
            r23 = 0
        L_0x01b8:
            if (r13 == 0) goto L_0x01bc
            r22 = 1
        L_0x01bc:
            if (r14 == 0) goto L_0x01c0
            r21 = 0
        L_0x01c0:
            r1 = r60
            r0 = r61
            boolean r0 = X.AnonymousClass001.A1Y(r6, r1, r0)
            java.lang.Object r1 = r6.CER()
            if (r0 != 0) goto L_0x01d2
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r1 != r0) goto L_0x01e4
        L_0x01d2:
            r10 = 0
            r2 = 6
            X.DRu r1 = new X.DRu
            r0 = r60
            r1.<init>(r10, r2, r0)
            r0 = r61
            X.Cc3 r1 = r0.BLB(r1)
            r6.CRH(r1)
        L_0x01e4:
            r10 = r6
            X.0VR r10 = (X.AnonymousClass0VR) r10
            X.AnonymousClass0VR.A0R(r10, r9)
            X.Cc3 r1 = (X.C25262Cc3) r1
            X.DRu r0 = r1.A00()
            java.lang.String r31 = r0.A02()
            r0 = r25
            X.0uU r0 = X.C02260Di.A00(r0, r6)
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x02ce
            X.0CP r2 = X.AnonymousClass0CP.Focused
        L_0x0202:
            X.0pW r13 = new X.0pW
            r14 = r25
            r15 = r27
            r16 = r7
            r17 = r22
            r18 = r21
            r13.<init>(r14, r15, r16, r17, r18)
            X.07W r1 = X.C04050Lq.A00
            java.lang.Object r0 = r6.BFh(r1)
            X.0Oj r0 = (X.C04690Oj) r0
            X.Cvq r29 = r0.A00()
            X.Cvq r30 = r0.A01()
            long r11 = r29.A04()
            long r15 = X.C05100Qk.A05
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0233
            long r11 = r30.A04()
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0243
        L_0x0233:
            long r11 = r29.A04()
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02ca
            long r11 = r30.A04()
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x02ca
        L_0x0243:
            r46 = 1
        L_0x0245:
            X.0PN r47 = X.AnonymousClass0PN.A00
            r0 = -646388253(0xffffffffd978e5e3, float:-4.37865983E15)
            r6.COB(r0)
            java.lang.Object r0 = r6.BFh(r1)
            X.0Oj r0 = (X.C04690Oj) r0
            X.Cvq r0 = r0.A01()
            long r11 = r0.A04()
            if (r46 == 0) goto L_0x026d
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x026d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r13.invoke(r2, r6, r0)
            X.0Qk r0 = (X.C05100Qk) r0
            long r11 = r0.A00
        L_0x026d:
            X.AnonymousClass0VR.A0R(r10, r9)
            r0 = -646388060(0xffffffffd978e6a4, float:-4.37871164E15)
            r6.COB(r0)
            java.lang.Object r0 = r6.BFh(r1)
            X.0Oj r0 = (X.C04690Oj) r0
            X.Cvq r0 = r0.A00()
            long r0 = r0.A04()
            if (r46 == 0) goto L_0x0296
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x0296
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r13.invoke(r2, r6, r0)
            X.0Qk r0 = (X.C05100Qk) r0
            long r0 = r0.A00
        L_0x0296:
            X.AnonymousClass0VR.A0R(r10, r9)
            boolean r57 = X.AnonymousClass000.A1W(r32)
            X.0qL r9 = new X.0qL
            r34 = r59
            r35 = r58
            r41 = r7
            r42 = r8
            r43 = r22
            r44 = r21
            r45 = r23
            r24 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r7 = 1290853831(0x4cf0ddc7, float:1.2628332E8)
            X.04D r51 = X.AnonymousClass0LC.A00(r6, r9, r7)
            r52 = 1769472(0x1b0000, float:2.479558E-39)
            r48 = r2
            r49 = r6
            r50 = r13
            r53 = r11
            r55 = r0
            r47.A02(r48, r49, r50, r51, r52, r53, r55, r57)
            goto L_0x016d
        L_0x02ca:
            r46 = 0
            goto L_0x0245
        L_0x02ce:
            int r0 = r31.length()
            if (r0 != 0) goto L_0x02d8
            X.0CP r2 = X.AnonymousClass0CP.UnfocusedEmpty
            goto L_0x0202
        L_0x02d8:
            X.0CP r2 = X.AnonymousClass0CP.UnfocusedNotEmpty
            goto L_0x0202
        L_0x02dc:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r65
            if (r0 != 0) goto L_0x0114
            r0 = r25
            boolean r0 = r6.BEf(r0)
            if (r0 != 0) goto L_0x02ed
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x02ed:
            r7 = r7 | r15
            goto L_0x0114
        L_0x02f0:
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x010e
            r0 = r21
            boolean r0 = r6.BEg(r0)
            if (r0 != 0) goto L_0x02fe
            r20 = 1024(0x400, float:1.435E-42)
        L_0x02fe:
            r7 = r7 | r20
            goto L_0x010e
        L_0x0302:
            r0 = r4 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0108
            r0 = r22
            boolean r0 = r6.BEg(r0)
            if (r0 != 0) goto L_0x0310
            r14 = 128(0x80, float:1.794E-43)
        L_0x0310:
            r7 = r7 | r14
            goto L_0x0108
        L_0x0313:
            r0 = r65 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0102
            r0 = r23
            boolean r0 = r6.BEg(r0)
            if (r0 == 0) goto L_0x0321
            r13 = 32
        L_0x0321:
            r7 = r7 | r13
            goto L_0x0102
        L_0x0324:
            r0 = r65 & 14
            if (r0 != 0) goto L_0x0335
            r0 = r24
            boolean r0 = r6.BEh(r0)
            if (r0 == 0) goto L_0x0331
            r7 = 4
        L_0x0331:
            r7 = r65 | r7
            goto L_0x00fc
        L_0x0335:
            r7 = r4
            goto L_0x00fc
        L_0x0338:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r64
            if (r0 != 0) goto L_0x00f2
            r0 = r58
            int r0 = X.AnonymousClass001.A0h(r6, r0)
            r8 = r8 | r0
            goto L_0x00f2
        L_0x0347:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r64
            if (r0 != 0) goto L_0x0096
            r0 = r32
            boolean r0 = r6.BEh(r0)
            int r0 = X.AnonymousClass000.A08(r0)
            r8 = r8 | r0
            goto L_0x0096
        L_0x035b:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x008c
            r0 = r61
            int r0 = X.AnonymousClass001.A0T(r6, r0)
            r8 = r8 | r0
            goto L_0x008c
        L_0x0368:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0084
            r0 = r39
            int r0 = X.AnonymousClass001.A0c(r6, r0)
            r8 = r8 | r0
            goto L_0x0084
        L_0x0375:
            r0 = r64 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x007c
            r0 = r60
            int r0 = X.AnonymousClass001.A0R(r6, r0)
            r8 = r8 | r0
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PE.A01(X.0rj, X.0tB, X.0NY, X.0CJ, X.0tn, X.EBO, java.lang.String, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, int, int, int, boolean, boolean, boolean):void");
    }
}
