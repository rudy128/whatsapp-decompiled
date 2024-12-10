package X;

/* renamed from: X.0Dw  reason: invalid class name and case insensitive filesystem */
public abstract class C02400Dw {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: X.09Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: X.09Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.09Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: X.09Y} */
    /* JADX WARNING: type inference failed for: r33v3 */
    /* JADX WARNING: type inference failed for: r33v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r8.BEd(r28) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17210uI r38, X.AnonymousClass0PT r39, X.C04610Ob r40, X.C17130tn r41, X.C17090tj r42, X.C03380Hv r43, X.C26251Cvq r44, X.C26224CvE r45, X.EBO r46, X.C22821Di r47, X.C22821Di r48, X.C36001nB r49, int r50, int r51, int r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        /*
            r29 = r49
            r34 = r42
            r26 = r55
            r25 = r56
            r33 = r43
            r32 = r44
            r4 = r57
            r35 = r40
            r36 = r39
            r28 = r50
            r27 = r51
            r9 = r38
            r31 = r46
            r30 = r48
            r0 = 1804514146(0x6b8eb362, float:3.4502916E26)
            r8 = r41
            r8.COC(r0)
            r5 = r54
            r0 = r54 & 1
            r44 = r45
            r7 = r52
            if (r0 == 0) goto L_0x02d4
            r3 = r52 | 6
        L_0x0030:
            r0 = r54 & 2
            r57 = r47
            if (r0 == 0) goto L_0x02c7
            r3 = r3 | 48
        L_0x0038:
            r24 = r54 & 4
            if (r24 == 0) goto L_0x02ba
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x003e:
            r23 = r54 & 8
            r16 = 2048(0x800, float:2.87E-42)
            if (r23 == 0) goto L_0x02ad
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r22 = r54 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            r21 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x029c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0051:
            r20 = r54 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r20 != 0) goto L_0x0063
            r0 = r52 & r19
            if (r0 != 0) goto L_0x0064
            r0 = r32
            int r0 = X.AnonymousClass001.A0V(r8, r0)
        L_0x0063:
            r3 = r3 | r0
        L_0x0064:
            r18 = r54 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r18 != 0) goto L_0x0076
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x0077
            r0 = r35
            int r0 = X.AnonymousClass001.A0W(r8, r0)
        L_0x0076:
            r3 = r3 | r0
        L_0x0077:
            r0 = r5 & 128(0x80, float:1.794E-43)
            r17 = r0
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r17 != 0) goto L_0x008b
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r52
            if (r0 != 0) goto L_0x008c
            r0 = r36
            int r0 = X.AnonymousClass001.A0X(r8, r0)
        L_0x008b:
            r3 = r3 | r0
        L_0x008c:
            r11 = r5 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 != 0) goto L_0x00a0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r52
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r8.BEg(r4)
            int r0 = X.AnonymousClass000.A07(r0)
        L_0x00a0:
            r3 = r3 | r0
        L_0x00a1:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x00b8
            r0 = r5 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x00b5
            r0 = r28
            boolean r1 = r8.BEd(r0)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 != 0) goto L_0x00b7
        L_0x00b5:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00b7:
            r3 = r3 | r0
        L_0x00b8:
            r10 = r5 & 1024(0x400, float:1.435E-42)
            r6 = r53
            if (r10 == 0) goto L_0x0287
            r2 = r53 | 6
        L_0x00c0:
            r12 = r5 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x027a
            r2 = r2 | 48
        L_0x00c6:
            r13 = r5 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x026d
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x00cc:
            r14 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x025d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x00d2:
            r1 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x024c
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x00d8:
            r0 = 32768(0x8000, float:4.5918E-41)
            r16 = r54 & r0
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r16 != 0) goto L_0x00eb
            r0 = r53 & r19
            if (r0 != 0) goto L_0x00ec
            r0 = r29
            int r0 = X.AnonymousClass001.A0e(r8, r0)
        L_0x00eb:
            r2 = r2 | r0
        L_0x00ec:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r3
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r15) goto L_0x013c
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r2
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r0) goto L_0x013c
            boolean r0 = r8.BZO()
            if (r0 == 0) goto L_0x013c
            r8.CNR()
        L_0x0107:
            X.0Vf r1 = r8.BKF()
            if (r1 == 0) goto L_0x013b
            X.0o8 r0 = new X.0o8
            r37 = r0
            r38 = r9
            r39 = r36
            r40 = r35
            r41 = r34
            r42 = r33
            r43 = r32
            r45 = r31
            r46 = r57
            r47 = r30
            r48 = r29
            r49 = r28
            r50 = r27
            r51 = r7
            r52 = r6
            r53 = r5
            r54 = r26
            r55 = r25
            r56 = r4
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r1.A03(r0)
        L_0x013b:
            return
        L_0x013c:
            r8.CNl()
            r0 = r52 & 1
            if (r0 == 0) goto L_0x01e6
            boolean r0 = r8.BQS()
            if (r0 != 0) goto L_0x01e6
            r8.CNR()
            r0 = r5 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0154
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r0
        L_0x0154:
            r8.BKA()
            r0 = r35
            X.Cr5 r43 = r0.A00(r4)
            r54 = r4 ^ 1
            r50 = r27
            r49 = r28
            if (r4 == 0) goto L_0x0169
            r50 = 1
            r49 = 1
        L_0x0169:
            r1 = 623737120(0x252d7920, float:1.5046397E-16)
            r0 = r44
            boolean r1 = X.AnonymousClass000.A1V(r8, r0, r1)
            r0 = r57
            boolean r0 = r8.BEh(r0)
            r1 = r1 | r0
            java.lang.Object r10 = r8.CER()
            if (r1 != 0) goto L_0x0183
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r10 != r0) goto L_0x018f
        L_0x0183:
            X.0jC r10 = new X.0jC
            r1 = r44
            r0 = r57
            r10.<init>(r1, r0)
            X.AnonymousClass0VR.A0V(r8, r10)
        L_0x018f:
            X.1Di r10 = (X.C22821Di) r10
            r0 = r8
            X.0VR r0 = (X.AnonymousClass0VR) r0
            r11 = 0
            X.AnonymousClass0VR.A0R(r0, r11)
            r51 = r3 & 14
            r0 = r3 & 896(0x380, float:1.256E-42)
            r51 = r51 | r0
            int r0 = r3 >> 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r51 = r51 | r0
            int r1 = r2 << 9
            r0 = r1 & r21
            r51 = r51 | r0
            r0 = r1 & r19
            r51 = r51 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r1
            r51 = r51 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r1
            r51 = r51 | r0
            int r0 = r3 >> 15
            r1 = r0 & 896(0x380, float:1.256E-42)
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r0
            r3 = r3 & r21
            r3 = r3 | r1
            r2 = r2 & r19
            r3 = r3 | r2
            r37 = r9
            r38 = r36
            r39 = r8
            r40 = r34
            r41 = r33
            r42 = r32
            r45 = r31
            r46 = r10
            r47 = r30
            r48 = r29
            r52 = r3
            r53 = r11
            r55 = r26
            r56 = r25
            X.C05070Qh.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            goto L_0x0107
        L_0x01e6:
            if (r24 == 0) goto L_0x01ea
            X.0WC r34 = X.C17090tj.A00
        L_0x01ea:
            if (r23 == 0) goto L_0x01ee
            r26 = 1
        L_0x01ee:
            if (r22 == 0) goto L_0x01f2
            r25 = 0
        L_0x01f2:
            if (r20 == 0) goto L_0x01fa
            X.Cvq r0 = X.C26251Cvq.A03
            X.Cvq r32 = X.C24499C6t.A00()
        L_0x01fa:
            if (r18 == 0) goto L_0x01fe
            X.0Ob r35 = X.C04610Ob.A02
        L_0x01fe:
            if (r17 == 0) goto L_0x0202
            X.0PT r36 = X.AnonymousClass0PT.A01
        L_0x0202:
            if (r11 == 0) goto L_0x0205
            r4 = 0
        L_0x0205:
            r0 = r5 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0214
            r28 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == 0) goto L_0x0210
            r28 = 1
        L_0x0210:
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r0
        L_0x0214:
            if (r10 == 0) goto L_0x0218
            r27 = 1
        L_0x0218:
            if (r12 == 0) goto L_0x021e
            X.EBO r31 = X.C25919Cod.A00()
        L_0x021e:
            if (r13 == 0) goto L_0x0222
            X.0kp r30 = X.C11880kp.A00
        L_0x0222:
            if (r14 == 0) goto L_0x0239
            java.lang.Object r9 = X.AnonymousClass001.A1A(r8)
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r9 != r0) goto L_0x0234
            X.0Um r9 = new X.0Um
            r9.<init>()
            X.AnonymousClass0VR.A0V(r8, r9)
        L_0x0234:
            X.AnonymousClass0VR.A0T(r8)
            X.0uI r9 = (X.C17210uI) r9
        L_0x0239:
            if (r1 == 0) goto L_0x0244
            long r0 = X.C05100Qk.A01
            X.09Y r33 = new X.09Y
            r10 = r33
            r10.<init>(r0)
        L_0x0244:
            if (r16 == 0) goto L_0x0154
            X.1nB r29 = X.AnonymousClass0MQ.A00()
            goto L_0x0154
        L_0x024c:
            r0 = r53 & r21
            if (r0 != 0) goto L_0x00d8
            r0 = r33
            boolean r0 = r8.BEf(r0)
            if (r0 != 0) goto L_0x025a
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x025a:
            r2 = r2 | r15
            goto L_0x00d8
        L_0x025d:
            r0 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00d2
            boolean r0 = r8.BEf(r9)
            if (r0 != 0) goto L_0x0269
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0269:
            r2 = r2 | r16
            goto L_0x00d2
        L_0x026d:
            r0 = r6 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00cc
            r0 = r30
            int r0 = X.AnonymousClass001.A0c(r8, r0)
            r2 = r2 | r0
            goto L_0x00cc
        L_0x027a:
            r0 = r53 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00c6
            r0 = r31
            int r0 = X.AnonymousClass001.A0R(r8, r0)
            r2 = r2 | r0
            goto L_0x00c6
        L_0x0287:
            r0 = r53 & 14
            if (r0 != 0) goto L_0x0299
            r0 = r27
            boolean r0 = r8.BEd(r0)
            int r0 = X.AnonymousClass000.A09(r0)
            r2 = r53 | r0
            goto L_0x00c0
        L_0x0299:
            r2 = r6
            goto L_0x00c0
        L_0x029c:
            r0 = r52 & r21
            if (r0 != 0) goto L_0x0051
            r0 = r25
            boolean r0 = r8.BEg(r0)
            int r0 = X.AnonymousClass000.A08(r0)
            r3 = r3 | r0
            goto L_0x0051
        L_0x02ad:
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0046
            r0 = r26
            int r0 = X.AnonymousClass001.A0j(r8, r0)
            r3 = r3 | r0
            goto L_0x0046
        L_0x02ba:
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x003e
            r0 = r34
            int r0 = X.AnonymousClass001.A0S(r8, r0)
            r3 = r3 | r0
            goto L_0x003e
        L_0x02c7:
            r0 = r52 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0038
            r0 = r57
            int r0 = X.AnonymousClass001.A0b(r8, r0)
            r3 = r3 | r0
            goto L_0x0038
        L_0x02d4:
            r0 = r52 & 14
            if (r0 != 0) goto L_0x02e2
            r0 = r44
            int r3 = X.AnonymousClass001.A0Z(r8, r0)
            r3 = r3 | r52
            goto L_0x0030
        L_0x02e2:
            r3 = r7
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02400Dw.A00(X.0uI, X.0PT, X.0Ob, X.0tn, X.0tj, X.0Hv, X.Cvq, X.CvE, X.EBO, X.1Di, X.1Di, X.1nB, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
