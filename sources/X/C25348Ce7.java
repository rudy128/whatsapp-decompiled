package X;

/* renamed from: X.Ce7  reason: case insensitive filesystem */
public abstract class C25348Ce7 {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r14 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r12.BEf(r10) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r14 == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r12.BEe(r0) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e9, code lost:
        if ((r25 & 64) != 0) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r18, X.C17090tj r19, X.C26251Cvq r20, X.C26251Cvq r21, java.lang.String r22, X.C18090vk r23, int r24, int r25, long r26, long r28) {
        /*
            r0 = r28
            r2 = r26
            r10 = r21
            r11 = r20
            r13 = r19
            r6 = 0
            r9 = r22
            X.C18070vi.A0d(r9, r6)
            r4 = 1
            r8 = r23
            X.C18070vi.A0d(r8, r4)
            r4 = 1271116381(0x4bc3b25d, float:2.5650362E7)
            r12 = r18
            r12.COC(r4)
            r5 = r25 & 1
            r7 = r24
            r4 = r24 | 6
            if (r5 != 0) goto L_0x0030
            r4 = r24 & 6
            if (r4 != 0) goto L_0x017b
            int r4 = X.AnonymousClass001.A0Q(r12, r9)
            r4 = r4 | r24
        L_0x0030:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x0170
            r4 = r4 | 48
        L_0x0036:
            r17 = r25 & 4
            if (r17 == 0) goto L_0x0165
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x003c:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x004f
            r5 = r25 & 8
            if (r5 != 0) goto L_0x004c
            boolean r14 = r12.BEf(r11)
            r5 = 2048(0x800, float:2.87E-42)
            if (r14 != 0) goto L_0x004e
        L_0x004c:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x004e:
            r4 = r4 | r5
        L_0x004f:
            r5 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0062
            r5 = r25 & 16
            if (r5 != 0) goto L_0x005f
            boolean r14 = r12.BEf(r10)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r14 != 0) goto L_0x0061
        L_0x005f:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0061:
            r4 = r4 | r5
        L_0x0062:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r24
            if (r5 != 0) goto L_0x0077
            r5 = r25 & 32
            if (r5 != 0) goto L_0x0074
            boolean r14 = r12.BEe(r2)
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r14 != 0) goto L_0x0076
        L_0x0074:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x0076:
            r4 = r4 | r5
        L_0x0077:
            r5 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 & r24
            if (r5 != 0) goto L_0x008c
            r5 = r25 & 64
            if (r5 != 0) goto L_0x0089
            boolean r14 = r12.BEe(r0)
            r5 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != 0) goto L_0x008b
        L_0x0089:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x008b:
            r4 = r4 | r5
        L_0x008c:
            r14 = 599187(0x92493, float:8.3964E-40)
            r14 = r14 & r4
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r5) goto L_0x00be
            boolean r5 = r12.BZO()
            if (r5 == 0) goto L_0x00be
            r12.CNR()
        L_0x009e:
            X.0Vf r5 = r12.BKF()
            if (r5 == 0) goto L_0x00bd
            X.DXL r4 = new X.DXL
            r19 = r13
            r20 = r11
            r21 = r10
            r22 = r9
            r23 = r8
            r24 = r7
            r26 = r2
            r28 = r0
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r5.A06 = r4
        L_0x00bd:
            return
        L_0x00be:
            r12.CNl()
            r5 = r24 & 1
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r15 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x0129
            boolean r5 = r12.BQS()
            if (r5 != 0) goto L_0x0129
            r12.CNR()
            r5 = r25 & 8
            if (r5 == 0) goto L_0x00dd
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00dd:
            r5 = r25 & 16
            if (r5 == 0) goto L_0x00e2
            r4 = r4 & r14
        L_0x00e2:
            r5 = r25 & 32
            if (r5 == 0) goto L_0x00e7
            r4 = r4 & r15
        L_0x00e7:
            r5 = r25 & 64
            if (r5 == 0) goto L_0x00ed
        L_0x00eb:
            r4 = r4 & r16
        L_0x00ed:
            r12.BKA()
            r5 = 2131899101(0x7f1232dd, float:1.9433138E38)
            java.lang.String r17 = X.AnonymousClass0LT.A00(r12, r5)
            r19 = r4 & 14
            int r5 = r4 << 3
            r4 = r5 & 896(0x380, float:1.256E-42)
            r19 = r19 | r4
            r4 = r5 & 7168(0x1c00, float:1.0045E-41)
            r19 = r19 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r5
            r19 = r19 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r5
            r19 = r19 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r19 = r19 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r4
            r19 = r19 | r5
            r21 = r2
            r23 = r0
            r18 = r8
            r20 = r6
            r15 = r10
            r16 = r9
            r14 = r11
            A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23)
            goto L_0x009e
        L_0x0129:
            if (r17 == 0) goto L_0x012d
            X.0WC r13 = X.C17090tj.A00
        L_0x012d:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x0139
            X.Ciy r5 = X.BE7.A0S(r12)
            X.Cvq r11 = r5.A02
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0139:
            r5 = r25 & 16
            if (r5 == 0) goto L_0x0144
            X.Ciy r5 = X.BE7.A0S(r12)
            X.Cvq r10 = r5.A03
            r4 = r4 & r14
        L_0x0144:
            r5 = r25 & 32
            if (r5 == 0) goto L_0x014d
            long r2 = X.C26257Cw2.A00(r12)
            r4 = r4 & r15
        L_0x014d:
            r5 = r25 & 64
            if (r5 == 0) goto L_0x00ed
            X.07W r0 = X.CG7.A00
            X.Cw2 r1 = X.BE6.A0g(r12, r0)
            boolean r0 = r1 instanceof X.BqD
            if (r0 == 0) goto L_0x0160
            X.BqD r1 = (X.BqD) r1
            long r0 = r1.A02
            goto L_0x00eb
        L_0x0160:
            X.BqC r1 = (X.BqC) r1
            long r0 = r1.A02
            goto L_0x00eb
        L_0x0165:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x003c
            int r5 = X.AnonymousClass001.A0S(r12, r13)
            r4 = r4 | r5
            goto L_0x003c
        L_0x0170:
            r5 = r24 & 48
            if (r5 != 0) goto L_0x0036
            int r5 = X.AnonymousClass001.A0b(r12, r8)
            r4 = r4 | r5
            goto L_0x0036
        L_0x017b:
            r4 = r7
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25348Ce7.A01(X.0tn, X.0tj, X.Cvq, X.Cvq, java.lang.String, X.0vk, int, int, long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r6.BEf(r46) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r1 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r6.BEe(r17) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        if (r6.BEe(r40) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f5, code lost:
        if ((r4 & 128) != 0) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r47, X.C17090tj r48, X.C26251Cvq r49, X.C26251Cvq r50, java.lang.String r51, java.lang.String r52, X.C18090vk r53, int r54, int r55, long r56, long r58) {
        /*
            r40 = r58
            r17 = r56
            r45 = r50
            r46 = r49
            r19 = r48
            r1 = 1
            r43 = r52
            r0 = r43
            X.C18070vi.A0d(r0, r1)
            r0 = 788945621(0x2f065ad5, float:1.2219499E-10)
            r6 = r47
            r6.COC(r0)
            r4 = r55
            r0 = r55 & 1
            r44 = r51
            r5 = r54
            if (r0 == 0) goto L_0x0274
            r2 = r54 | 6
        L_0x0026:
            r0 = r55 & 2
            if (r0 == 0) goto L_0x0267
            r2 = r2 | 48
        L_0x002c:
            r0 = r55 & 4
            r42 = r53
            if (r0 == 0) goto L_0x025a
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r9 = r55 & 8
            if (r9 == 0) goto L_0x024d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004f
            r0 = r55 & 16
            if (r0 != 0) goto L_0x004c
            r0 = r46
            boolean r1 = r6.BEf(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x004e
        L_0x004c:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004e:
            r2 = r2 | r0
        L_0x004f:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r54
            if (r0 != 0) goto L_0x0066
            r0 = r55 & 32
            if (r0 != 0) goto L_0x0063
            r0 = r45
            boolean r1 = r6.BEf(r0)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != 0) goto L_0x0065
        L_0x0063:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0065:
            r2 = r2 | r0
        L_0x0066:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r54
            if (r0 != 0) goto L_0x007d
            r0 = r55 & 64
            if (r0 != 0) goto L_0x007a
            r0 = r17
            boolean r1 = r6.BEe(r0)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x007c
        L_0x007a:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x007c:
            r2 = r2 | r0
        L_0x007d:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r54
            if (r0 != 0) goto L_0x0094
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0091
            r0 = r40
            boolean r1 = r6.BEe(r0)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 != 0) goto L_0x0093
        L_0x0091:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0093:
            r2 = r2 | r0
        L_0x0094:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r1 = r2 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00c8
            boolean r0 = r6.BZO()
            if (r0 == 0) goto L_0x00c8
            r6.CNR()
        L_0x00a7:
            X.0Vf r1 = r6.BKF()
            if (r1 == 0) goto L_0x00c7
            X.DXO r0 = new X.DXO
            r6 = r0
            r7 = r19
            r8 = r46
            r9 = r45
            r10 = r44
            r11 = r43
            r12 = r42
            r13 = r5
            r14 = r4
            r15 = r17
            r17 = r40
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            r1.A06 = r0
        L_0x00c7:
            return
        L_0x00c8:
            r6.CNl()
            r0 = r54 & 1
            r8 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r6.BQS()
            if (r0 != 0) goto L_0x0158
            r6.CNR()
            r0 = r55 & 16
            if (r0 == 0) goto L_0x00e9
            r2 = r2 & r1
        L_0x00e9:
            r0 = r55 & 32
            if (r0 == 0) goto L_0x00ee
            r2 = r2 & r3
        L_0x00ee:
            r0 = r55 & 64
            if (r0 == 0) goto L_0x00f3
            r2 = r2 & r7
        L_0x00f3:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f8
        L_0x00f7:
            r2 = r2 & r8
        L_0x00f8:
            r6.BKA()
            r21 = 0
            r3 = 32
            r1 = 160(0xa0, float:2.24E-43)
            r0 = r43
            java.lang.String r8 = r0.replace(r3, r1)
            X.C18070vi.A0X(r8)
            r16 = 0
            r0 = 16
            X.DRt r7 = new X.DRt
            r7.<init>((int) r0)
            long r34 = X.C26130Cst.A01
            long r38 = X.C05100Qk.A05
            X.EBX r31 = X.C25969Cpb.A00(r17)
            X.CrN r1 = new X.CrN
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r21
            r27 = r21
            r28 = r21
            r29 = r21
            r30 = r21
            r32 = r21
            r33 = r21
            r22 = r21
            r36 = r34
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38)
            java.lang.StringBuilder r13 = r7.A00
            int r9 = r13.length()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r11 = ""
            X.Cbp r0 = new X.Cbp
            r0.<init>(r1, r11, r9, r3)
            java.util.List r10 = r7.A04
            r10.add(r0)
            java.util.List r9 = r7.A03
            r9.add(r0)
            int r3 = X.AnonymousClass3MX.A01(r10)
            goto L_0x019a
        L_0x0158:
            if (r9 == 0) goto L_0x015c
            X.0WC r19 = X.C17090tj.A00
        L_0x015c:
            r0 = r55 & 16
            if (r0 == 0) goto L_0x0169
            X.Ciy r0 = X.BE7.A0S(r6)
            X.Cvq r0 = r0.A02
            r46 = r0
            r2 = r2 & r1
        L_0x0169:
            r0 = r55 & 32
            if (r0 == 0) goto L_0x0176
            X.Ciy r0 = X.BE7.A0S(r6)
            X.Cvq r0 = r0.A03
            r45 = r0
            r2 = r2 & r3
        L_0x0176:
            r0 = r55 & 64
            if (r0 == 0) goto L_0x017f
            long r17 = X.C26257Cw2.A00(r6)
            r2 = r2 & r7
        L_0x017f:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f8
            X.07W r0 = X.CG7.A00
            X.Cw2 r1 = X.BE6.A0g(r6, r0)
            boolean r0 = r1 instanceof X.BqD
            if (r0 == 0) goto L_0x0195
            X.BqD r1 = (X.BqD) r1
            long r0 = r1.A02
        L_0x0191:
            r40 = r0
            goto L_0x00f7
        L_0x0195:
            X.BqC r1 = (X.BqC) r1
            long r0 = r1.A02
            goto L_0x0191
        L_0x019a:
            r0 = r44
            r13.append(r0)     // Catch:{ all -> 0x028a }
            r0 = r45
            X.CrN r12 = r0.A02     // Catch:{ all -> 0x028a }
            X.DSF r0 = r12.A09     // Catch:{ all -> 0x028a }
            r27 = r0
            X.CGf r0 = r12.A06     // Catch:{ all -> 0x028a }
            r24 = r0
            X.Cma r0 = r12.A07     // Catch:{ all -> 0x028a }
            r20 = r0
            long r0 = r12.A01     // Catch:{ all -> 0x028a }
            r36 = r0
            long r14 = r12.A02     // Catch:{ all -> 0x028a }
            X.EBX r31 = X.C25969Cpb.A00(r40)     // Catch:{ all -> 0x028a }
            X.CrN r0 = new X.CrN     // Catch:{ all -> 0x028a }
            r25 = r20
            r34 = r36
            r36 = r14
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38)     // Catch:{ all -> 0x028a }
            int r14 = r13.length()     // Catch:{ all -> 0x028a }
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            X.Cbp r1 = new X.Cbp     // Catch:{ all -> 0x028a }
            r1.<init>(r0, r11, r14, r12)     // Catch:{ all -> 0x028a }
            r10.add(r1)     // Catch:{ all -> 0x028a }
            r9.add(r1)     // Catch:{ all -> 0x028a }
            int r9 = X.AnonymousClass3MX.A01(r10)     // Catch:{ all -> 0x028a }
            int r0 = r13.length()     // Catch:{ all -> 0x0285 }
            X.Cbp r1 = new X.Cbp     // Catch:{ all -> 0x0285 }
            r1.<init>(r8, r8, r0, r12)     // Catch:{ all -> 0x0285 }
            r10.add(r1)     // Catch:{ all -> 0x0285 }
            java.util.List r0 = r7.A01     // Catch:{ all -> 0x0285 }
            r0.add(r1)     // Catch:{ all -> 0x0285 }
            r10.size()     // Catch:{ all -> 0x0285 }
            r13.append(r8)     // Catch:{ all -> 0x0285 }
            r7.A01(r9)     // Catch:{ all -> 0x028a }
            r7.A01(r3)
            X.DRu r7 = r7.A00()
            r0 = 725801564(0x2b42da5c, float:6.922568E-13)
            r6.COB(r0)
            boolean r8 = r6.BEf(r7)
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != r0) goto L_0x020e
            r16 = 1
        L_0x020e:
            r8 = r8 | r16
            java.lang.Object r3 = r6.CER()
            if (r8 != 0) goto L_0x021a
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r3 != r0) goto L_0x0225
        L_0x021a:
            r1 = 1
            X.DWc r3 = new X.DWc
            r0 = r42
            r3.<init>(r7, r0, r1)
            r6.CRH(r3)
        L_0x0225:
            X.1Di r3 = (X.C22821Di) r3
            r0 = r6
            X.0VR r0 = (X.AnonymousClass0VR) r0
            r1 = 0
            X.AnonymousClass0VR.A0R(r0, r1)
            int r0 = r2 >> 6
            r30 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r30 = r30 | r0
            r31 = 120(0x78, float:1.68E-43)
            r29 = r1
            r32 = r1
            r22 = r6
            r23 = r19
            r24 = r7
            r25 = r46
            r27 = r3
            r28 = r1
            X.C02410Dx.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00a7
        L_0x024d:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003a
            r0 = r19
            int r0 = X.AnonymousClass001.A0T(r6, r0)
            r2 = r2 | r0
            goto L_0x003a
        L_0x025a:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0034
            r0 = r42
            int r0 = X.AnonymousClass001.A0c(r6, r0)
            r2 = r2 | r0
            goto L_0x0034
        L_0x0267:
            r0 = r54 & 48
            if (r0 != 0) goto L_0x002c
            r0 = r43
            int r0 = X.AnonymousClass001.A0R(r6, r0)
            r2 = r2 | r0
            goto L_0x002c
        L_0x0274:
            r0 = r54 & 6
            if (r0 != 0) goto L_0x0282
            r0 = r44
            int r2 = X.AnonymousClass001.A0Z(r6, r0)
            r2 = r2 | r54
            goto L_0x0026
        L_0x0282:
            r2 = r5
            goto L_0x0026
        L_0x0285:
            r0 = move-exception
            r7.A01(r9)     // Catch:{ all -> 0x028a }
            throw r0     // Catch:{ all -> 0x028a }
        L_0x028a:
            r0 = move-exception
            r7.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25348Ce7.A00(X.0tn, X.0tj, X.Cvq, X.Cvq, java.lang.String, java.lang.String, X.0vk, int, int, long, long):void");
    }
}
