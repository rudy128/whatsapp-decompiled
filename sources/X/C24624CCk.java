package X;

/* renamed from: X.CCk  reason: case insensitive filesystem */
public abstract class C24624CCk {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r0.BEf(r9) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        if (r5 == false) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0PT r86, X.C04610Ob r87, X.AnonymousClass0NY r88, X.C17130tn r89, X.C17090tj r90, X.C26224CvE r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, X.C22821Di r95, X.C22821Di r96, X.AnonymousClass1OS r97, X.AnonymousClass1OS r98, int r99, int r100, int r101, int r102, int r103, boolean r104, boolean r105, boolean r106, boolean r107) {
        /*
            r44 = r86
            r43 = r87
            r36 = r98
            r37 = r97
            r34 = r100
            r42 = r90
            r41 = r91
            r33 = r104
            r40 = r92
            r32 = r105
            r39 = r93
            r31 = r106
            r9 = r88
            r14 = r95
            r11 = r96
            r38 = r94
            r30 = r107
            r35 = r99
            r1 = 1069501795(0x3fbf4d63, float:1.4945492)
            r0 = r89
            r0.COC(r1)
            r4 = r103
            r29 = r103 & 1
            r7 = r101
            r1 = r101 | 6
            if (r29 != 0) goto L_0x0043
            r2 = r101 & 6
            r1 = r7
            if (r2 != 0) goto L_0x0043
            r1 = r42
            int r1 = X.AnonymousClass001.A0Q(r0, r1)
            r1 = r1 | r101
        L_0x0043:
            r28 = r103 & 2
            if (r28 == 0) goto L_0x040c
            r1 = r1 | 48
        L_0x0049:
            r27 = r103 & 4
            if (r27 == 0) goto L_0x03ff
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r26 = r103 & 8
            if (r26 == 0) goto L_0x03f2
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0055:
            r25 = r103 & 16
            r17 = 16384(0x4000, float:2.2959E-41)
            if (r25 == 0) goto L_0x03e1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x005d:
            r24 = r103 & 32
            r16 = 131072(0x20000, float:1.83671E-40)
            r15 = 65536(0x10000, float:9.18355E-41)
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x03ce
            r1 = r1 | r6
        L_0x0068:
            r23 = r103 & 64
            r22 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x03bb
            r1 = r1 | r22
        L_0x0070:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r101 & r2
            if (r2 != 0) goto L_0x0085
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x0082
            boolean r3 = r0.BEf(r9)
            r2 = 8388608(0x800000, float:1.17549435E-38)
            if (r3 != 0) goto L_0x0084
        L_0x0082:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x0084:
            r1 = r1 | r2
        L_0x0085:
            r2 = r4 & 256(0x100, float:3.59E-43)
            r21 = r2
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 != 0) goto L_0x009b
            r3 = r3 & r101
            if (r3 != 0) goto L_0x009c
            boolean r2 = r0.BEh(r14)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x009b
            r3 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x009b:
            r1 = r1 | r3
        L_0x009c:
            r2 = r4 & 512(0x200, float:7.175E-43)
            r20 = r2
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 != 0) goto L_0x00b2
            r3 = r3 & r101
            if (r3 != 0) goto L_0x00b3
            boolean r2 = r0.BEh(r11)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x00b2
            r3 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00b2:
            r1 = r1 | r3
        L_0x00b3:
            r2 = r4 & 1024(0x400, float:1.435E-42)
            r19 = r2
            r8 = r102
            r2 = r102 | 6
            if (r19 != 0) goto L_0x00c9
            r2 = r102 & 6
            if (r2 != 0) goto L_0x03b8
            r2 = r38
            int r2 = X.AnonymousClass001.A0Q(r0, r2)
            r2 = r102 | r2
        L_0x00c9:
            r13 = r4 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x03a7
            r2 = r2 | 48
        L_0x00cf:
            r12 = r4 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0394
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x00d5:
            r3 = r8 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x00ea
            r3 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r3 != 0) goto L_0x00e7
            r3 = r34
            boolean r5 = r0.BEd(r3)
            r3 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x00e9
        L_0x00e7:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x00e9:
            r2 = r2 | r3
        L_0x00ea:
            r10 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0382
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x00f0:
            r3 = 32768(0x8000, float:4.5918E-41)
            r18 = r103 & r3
            if (r18 == 0) goto L_0x0375
            r2 = r2 | r6
        L_0x00f8:
            r17 = r103 & r15
            if (r17 == 0) goto L_0x0368
            r2 = r2 | r22
        L_0x00fe:
            r16 = r103 & r16
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r16 != 0) goto L_0x0114
            r3 = r102 & r5
            if (r3 != 0) goto L_0x0115
            r3 = r44
            boolean r3 = r0.BEf(r3)
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0114
            r5 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0114:
            r2 = r2 | r5
        L_0x0115:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r1 & r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r3) goto L_0x016b
            r5 = 4793491(0x492493, float:6.717112E-39)
            r5 = r5 & r2
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r3) goto L_0x016b
            boolean r3 = r0.BZO()
            if (r3 == 0) goto L_0x016b
            r0.CNR()
        L_0x0131:
            X.0Vf r1 = r0.BKF()
            if (r1 == 0) goto L_0x016a
            X.DXR r0 = new X.DXR
            r45 = r0
            r46 = r44
            r47 = r43
            r48 = r9
            r49 = r42
            r50 = r41
            r51 = r40
            r52 = r39
            r53 = r38
            r54 = r14
            r55 = r11
            r56 = r37
            r57 = r36
            r58 = r35
            r59 = r34
            r60 = r7
            r61 = r8
            r62 = r4
            r63 = r33
            r64 = r32
            r65 = r31
            r66 = r30
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r1.A06 = r0
        L_0x016a:
            return
        L_0x016b:
            r0.CNl()
            r3 = r101 & 1
            if (r3 == 0) goto L_0x027a
            boolean r3 = r0.BQS()
            if (r3 != 0) goto L_0x027a
            r0.CNR()
            r3 = r4 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0183
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r3
        L_0x0183:
            r3 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0189
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0189:
            r0.BKA()
            X.Ciy r3 = X.BE7.A0S(r0)
            X.Cvq r12 = r3.A00
            long r5 = X.CIM.A00
            r3 = 1090519040(0x41000000, float:8.0)
            X.07O r51 = X.C04540Nu.A00(r3)
            r45 = 0
            r10 = 1
            androidx.compose.foundation.layout.FillElement r5 = X.C05130Qo.A01
            r3 = r42
            X.0tj r50 = r3.CP5(r5)
            if (r38 == 0) goto L_0x0276
            r6 = 0
            X.DWf r5 = new X.DWf
            r3 = r38
            r5.<init>(r3, r6)
            r3 = -801014600(0xffffffffd0417cb8, float:-1.2984705E10)
            X.04D r57 = X.AnonymousClass0LC.A00(r0, r5, r3)
        L_0x01b6:
            r3 = 728144679(0x2b669b27, float:8.192773E-13)
            r0.COB(r3)
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r1
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r5 == r3) goto L_0x01c4
            r10 = 0
        L_0x01c4:
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r1
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r3 = X.AnonymousClass000.A1T(r5, r3)
            r3 = r3 | r10
            java.lang.Object r5 = r0.CER()
            if (r3 != 0) goto L_0x01d8
            java.lang.Object r3 = X.AnonymousClass0MH.A00
            if (r5 != r3) goto L_0x01e1
        L_0x01d8:
            r3 = 0
            X.DWc r5 = new X.DWc
            r5.<init>(r14, r11, r3)
            r0.CRH(r5)
        L_0x01e1:
            X.1Di r5 = (X.C22821Di) r5
            X.AnonymousClass0VR.A0T(r0)
            r10 = 1
            X.DWf r6 = new X.DWf
            r3 = r40
            r6.<init>(r3, r10)
            r3 = 1853341437(0x6e77befd, float:1.9168422E28)
            X.04D r56 = X.AnonymousClass0LC.A00(r0, r6, r3)
            r10 = 2
            X.DWf r6 = new X.DWf
            r3 = r39
            r6.<init>(r3, r10)
            r3 = -891941174(0xffffffffcad60eca, float:-7014245.0)
            X.04D r62 = X.AnonymousClass0LC.A00(r0, r6, r3)
            int r6 = r1 >> 3
            r65 = r6 & 14
            r65 = r65 | r22
            r3 = r6 & 7168(0x1c00, float:1.0045E-41)
            r65 = r65 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r65 = r65 | r6
            int r6 = r2 << 12
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r3
            r65 = r65 | r6
            int r3 = r2 >> 12
            r3 = r3 & 14
            r3 = r3 | 384(0x180, float:5.38E-43)
            int r6 = r1 >> 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r6
            int r10 = r2 >> 3
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r10
            r3 = r3 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r10
            r3 = r3 | r6
            int r10 = r2 << 18
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r6
            r3 = r3 | r10
            int r10 = r2 << 15
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r6
            r3 = r3 | r10
            int r6 = r2 << 21
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r2
            r3 = r3 | r6
            int r1 = r1 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r68 = 1067264(0x104900, float:1.495555E-39)
            r58 = r45
            r61 = r45
            r46 = r44
            r47 = r43
            r48 = r9
            r49 = r0
            r52 = r12
            r53 = r41
            r54 = r45
            r55 = r5
            r59 = r36
            r60 = r37
            r63 = r34
            r64 = r35
            r66 = r3
            r67 = r1
            r69 = r33
            r70 = r32
            r71 = r31
            r72 = r30
            X.AnonymousClass0L7.A00(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            goto L_0x0131
        L_0x0276:
            r57 = 0
            goto L_0x01b6
        L_0x027a:
            if (r29 == 0) goto L_0x027e
            X.0WC r42 = X.C17090tj.A00
        L_0x027e:
            if (r28 == 0) goto L_0x028b
            java.lang.String r15 = ""
            long r5 = X.C26260Cw5.A01
            X.CvE r41 = new X.CvE
            r3 = r41
            r3.<init>((java.lang.String) r15, (long) r5)
        L_0x028b:
            if (r27 == 0) goto L_0x028f
            java.lang.String r40 = ""
        L_0x028f:
            if (r26 == 0) goto L_0x0293
            java.lang.String r39 = ""
        L_0x0293:
            if (r25 == 0) goto L_0x0297
            r33 = 1
        L_0x0297:
            if (r24 == 0) goto L_0x029b
            r32 = 0
        L_0x029b:
            if (r23 == 0) goto L_0x029f
            r31 = 0
        L_0x029f:
            r3 = r4 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x032d
            r3 = -94218894(0xfffffffffa625572, float:-2.9379803E35)
            r0.COB(r3)
            long r56 = X.C05100Qk.A04
            X.07W r3 = X.CG7.A00
            long r48 = X.C26257Cw2.A01(r0, r3)
            long r50 = X.C26257Cw2.A01(r0, r3)
            long r54 = X.C26257Cw2.A01(r0, r3)
            long r52 = X.C26257Cw2.A04(r0, r3)
            long r76 = X.C26257Cw2.A05(r0, r3)
            long r78 = X.C26257Cw2.A05(r0, r3)
            long r82 = X.C26257Cw2.A05(r0, r3)
            long r80 = X.C26257Cw2.A04(r0, r3)
            long r68 = X.C26257Cw2.A06(r0, r3)
            long r70 = X.C26257Cw2.A06(r0, r3)
            long r74 = X.C26257Cw2.A07(r0, r3)
            long r72 = X.C26257Cw2.A04(r0, r3)
            long r92 = X.C26257Cw2.A01(r0, r3)
            long r94 = X.C26257Cw2.A01(r0, r3)
            long r98 = X.C26257Cw2.A07(r0, r3)
            long r96 = X.C26257Cw2.A04(r0, r3)
            long r100 = X.C26257Cw2.A05(r0, r3)
            long r102 = X.C26257Cw2.A05(r0, r3)
            long r106 = X.C26257Cw2.A07(r0, r3)
            long r104 = X.C26257Cw2.A04(r0, r3)
            long r84 = X.C26257Cw2.A06(r0, r3)
            long r86 = X.C26257Cw2.A06(r0, r3)
            long r90 = X.C26257Cw2.A07(r0, r3)
            long r88 = X.C26257Cw2.A04(r0, r3)
            long r64 = X.C26257Cw2.A06(r0, r3)
            long r66 = X.C26257Cw2.A07(r0, r3)
            r46 = 2013266944(0x78000400, float:1.0385861E34)
            r47 = 4080(0xff0, float:5.717E-42)
            r60 = r56
            r62 = r56
            r45 = r0
            r58 = r56
            X.0NY r9 = X.AnonymousClass0PR.A00(r45, r46, r47, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r104, r106)
            X.AnonymousClass0VR.A0U(r0)
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r3
        L_0x032d:
            if (r21 == 0) goto L_0x0335
            r3 = 0
            X.DWa r14 = new X.DWa
            r14.<init>(r3)
        L_0x0335:
            if (r20 == 0) goto L_0x033d
            r3 = 1
            X.DWa r11 = new X.DWa
            r11.<init>(r3)
        L_0x033d:
            if (r19 == 0) goto L_0x0341
            r38 = 0
        L_0x0341:
            if (r13 == 0) goto L_0x0345
            r30 = 1
        L_0x0345:
            if (r12 == 0) goto L_0x0349
            r35 = 1
        L_0x0349:
            r3 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0356
            r34 = 2147483647(0x7fffffff, float:NaN)
            if (r30 == 0) goto L_0x0354
            r34 = 1
        L_0x0354:
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0356:
            if (r10 == 0) goto L_0x035a
            X.1OS r37 = X.CHV.A00
        L_0x035a:
            if (r18 == 0) goto L_0x035e
            X.1OS r36 = X.CHV.A01
        L_0x035e:
            if (r17 == 0) goto L_0x0362
            X.0Ob r43 = X.C04610Ob.A02
        L_0x0362:
            if (r16 == 0) goto L_0x0189
            X.0PT r44 = X.AnonymousClass0PT.A01
            goto L_0x0189
        L_0x0368:
            r3 = r102 & r22
            if (r3 != 0) goto L_0x00fe
            r3 = r43
            int r3 = X.AnonymousClass001.A0W(r0, r3)
            r2 = r2 | r3
            goto L_0x00fe
        L_0x0375:
            r3 = r102 & r6
            if (r3 != 0) goto L_0x00f8
            r3 = r36
            int r3 = X.AnonymousClass001.A0e(r0, r3)
            r2 = r2 | r3
            goto L_0x00f8
        L_0x0382:
            r3 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00f0
            r3 = r37
            boolean r3 = r0.BEh(r3)
            if (r3 != 0) goto L_0x0390
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0390:
            r2 = r2 | r17
            goto L_0x00f0
        L_0x0394:
            r3 = r8 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x00d5
            r3 = r35
            boolean r5 = r0.BEd(r3)
            r3 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x03a4
            r3 = 256(0x100, float:3.59E-43)
        L_0x03a4:
            r2 = r2 | r3
            goto L_0x00d5
        L_0x03a7:
            r3 = r102 & 48
            if (r3 != 0) goto L_0x00cf
            r3 = r30
            boolean r3 = r0.BEg(r3)
            int r3 = X.AnonymousClass000.A0A(r3)
            r2 = r2 | r3
            goto L_0x00cf
        L_0x03b8:
            r2 = r8
            goto L_0x00c9
        L_0x03bb:
            r2 = r101 & r22
            if (r2 != 0) goto L_0x0070
            r2 = r31
            boolean r3 = r0.BEg(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x03cb
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x03cb:
            r1 = r1 | r2
            goto L_0x0070
        L_0x03ce:
            r2 = r101 & r6
            if (r2 != 0) goto L_0x0068
            r2 = r32
            boolean r3 = r0.BEg(r2)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x03de
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x03de:
            r1 = r1 | r2
            goto L_0x0068
        L_0x03e1:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x005d
            r2 = r33
            boolean r2 = r0.BEg(r2)
            int r2 = X.AnonymousClass000.A08(r2)
            r1 = r1 | r2
            goto L_0x005d
        L_0x03f2:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0055
            r2 = r39
            int r2 = X.AnonymousClass001.A0T(r0, r2)
            r1 = r1 | r2
            goto L_0x0055
        L_0x03ff:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004f
            r2 = r40
            int r2 = X.AnonymousClass001.A0S(r0, r2)
            r1 = r1 | r2
            goto L_0x004f
        L_0x040c:
            r2 = r101 & 48
            if (r2 != 0) goto L_0x0049
            r2 = r41
            int r2 = X.AnonymousClass001.A0R(r0, r2)
            r1 = r1 | r2
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24624CCk.A00(X.0PT, X.0Ob, X.0NY, X.0tn, X.0tj, X.CvE, java.lang.String, java.lang.String, java.lang.String, X.1Di, X.1Di, X.1OS, X.1OS, int, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
