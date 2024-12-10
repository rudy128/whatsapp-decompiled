package X;

/* renamed from: X.0PA  reason: invalid class name */
public abstract class AnonymousClass0PA {
    public static final AnonymousClass07W A00 = AnonymousClass0PZ.A00(AnonymousClass0Q9.A06(), C09400ge.A00);

    public static final void A02(C17130tn r6, C26251Cvq cvq, AnonymousClass1OS r8, int i) {
        int i2;
        C18070vi.A0d(cvq, 0);
        C18070vi.A0d(r8, 1);
        r6.COC(-460300127);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r6, cvq) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0b(r6, r8);
        }
        if ((i2 & 91) != 18 || !r6.BZO()) {
            AnonymousClass07W r2 = A00;
            C03230Hd[] r1 = new C03230Hd[1];
            AnonymousClass07W.A00(r2, ((C26251Cvq) r6.BFh(r2)).A09(cvq), r1, 0);
            AnonymousClass0PZ.A04(r6, r8, r1, (i2 & 112) | 8);
        } else {
            r6.CNR();
        }
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A03(new C13300nB(cvq, r8, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010e, code lost:
        if (r4.BEf(r6) == false) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r54, X.C17090tj r55, X.C27069DRu r56, X.C26251Cvq r57, X.C24693CGf r58, X.C25823Cma r59, X.DSF r60, X.C26018CqZ r61, X.C25827Cme r62, java.util.Map r63, X.C22821Di r64, int r65, int r66, int r67, int r68, int r69, int r70, long r71, long r73, long r75, long r77, boolean r79) {
        /*
            r6 = r57
            r41 = r64
            r52 = r63
            r42 = r55
            r22 = r71
            r47 = r58
            r20 = r73
            r72 = r59
            r18 = r75
            r16 = r77
            r40 = r65
            r38 = r79
            r39 = r66
            r1 = 0
            r45 = r56
            r0 = r45
            X.C18070vi.A0d(r0, r1)
            r0 = 2027001676(0x78d1974c, float:3.4008085E34)
            r4 = r54
            r4.COC(r0)
            r3 = r70
            r0 = r70 & 1
            r5 = r68
            if (r0 == 0) goto L_0x02e6
            r2 = r68 | 6
        L_0x0034:
            r37 = r70 & 2
            if (r37 == 0) goto L_0x02d9
            r2 = r2 | 48
        L_0x003a:
            r36 = r70 & 4
            if (r36 == 0) goto L_0x02cc
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0040:
            r35 = r70 & 8
            r9 = 2048(0x800, float:2.87E-42)
            if (r35 == 0) goto L_0x02b9
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0048:
            r34 = r70 & 16
            r33 = 57344(0xe000, float:8.0356E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r34 == 0) goto L_0x02ac
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0053:
            r32 = r70 & 32
            r31 = 131072(0x20000, float:1.83671E-40)
            r24 = 65536(0x10000, float:9.18355E-41)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r32 != 0) goto L_0x0069
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r68 & r0
            if (r0 != 0) goto L_0x006a
            r0 = r60
            int r0 = X.AnonymousClass001.A0V(r4, r0)
        L_0x0069:
            r2 = r2 | r0
        L_0x006a:
            r30 = r70 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r30 != 0) goto L_0x007c
            r0 = r68 & r29
            if (r0 != 0) goto L_0x007d
            r0 = r47
            int r0 = X.AnonymousClass001.A0W(r4, r0)
        L_0x007c:
            r2 = r2 | r0
        L_0x007d:
            r0 = r3 & 128(0x80, float:1.794E-43)
            r28 = r0
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 != 0) goto L_0x0097
            r0 = r68 & r27
            if (r0 != 0) goto L_0x0098
            r0 = r18
            boolean r0 = r4.BEe(r0)
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x0097
            r1 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0097:
            r2 = r2 | r1
        L_0x0098:
            r15 = r3 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 != 0) goto L_0x00aa
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r68
            if (r0 != 0) goto L_0x00ab
            r0 = r62
            int r0 = X.AnonymousClass001.A0Y(r4, r0)
        L_0x00aa:
            r2 = r2 | r0
        L_0x00ab:
            r11 = r3 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 != 0) goto L_0x00c1
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r68
            if (r0 != 0) goto L_0x00c2
            r0 = r61
            boolean r0 = r4.BEf(r0)
            int r0 = X.AnonymousClass000.A06(r0)
        L_0x00c1:
            r2 = r2 | r0
        L_0x00c2:
            r10 = r3 & 1024(0x400, float:1.435E-42)
            r7 = r69
            if (r10 == 0) goto L_0x0297
            r1 = r69 | 6
        L_0x00ca:
            r13 = r3 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0286
            r1 = r1 | 48
        L_0x00d0:
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            r26 = r0
            if (r0 == 0) goto L_0x0279
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00d8:
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x0268
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00de:
            r9 = r3 & 16384(0x4000, float:2.2959E-41)
            r43 = r67
            if (r9 == 0) goto L_0x0257
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00e6:
            r14 = 32768(0x8000, float:4.5918E-41)
            r8 = r70 & r14
            if (r8 == 0) goto L_0x00ef
            r1 = r1 | r24
        L_0x00ef:
            r25 = r70 & r24
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r25 != 0) goto L_0x00ff
            r0 = r69 & r29
            if (r0 != 0) goto L_0x0100
            r0 = r41
            int r0 = X.AnonymousClass001.A0f(r4, r0)
        L_0x00ff:
            r1 = r1 | r0
        L_0x0100:
            r0 = r69 & r27
            if (r0 != 0) goto L_0x0113
            r0 = r70 & r31
            if (r0 != 0) goto L_0x0110
            boolean r24 = r4.BEf(r6)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r24 != 0) goto L_0x0112
        L_0x0110:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0112:
            r1 = r1 | r0
        L_0x0113:
            if (r8 != r14) goto L_0x0165
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r2
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r0) goto L_0x0165
            r14 = 23967451(0x16db6db, float:4.3661218E-38)
            r14 = r14 & r1
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r14 != r0) goto L_0x0165
            boolean r0 = r4.BZO()
            if (r0 == 0) goto L_0x0165
            r4.CNR()
            r56 = r43
        L_0x0132:
            X.0Vf r1 = r4.BKF()
            if (r1 == 0) goto L_0x0164
            X.0oE r0 = new X.0oE
            r43 = r0
            r44 = r42
            r46 = r6
            r48 = r72
            r49 = r60
            r50 = r61
            r51 = r62
            r53 = r41
            r54 = r40
            r55 = r39
            r57 = r5
            r58 = r7
            r59 = r3
            r60 = r22
            r62 = r20
            r64 = r18
            r66 = r16
            r68 = r38
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r64, r66, r68)
            r1.A03(r0)
        L_0x0164:
            return
        L_0x0165:
            r4.CNl()
            r0 = r68 & 1
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r4.BQS()
            if (r0 != 0) goto L_0x01f3
            r4.CNR()
            r0 = r70 & r31
            if (r0 == 0) goto L_0x017d
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x017d:
            r56 = r43
        L_0x017f:
            r4.BKA()
            r0 = 79588971(0x4be6e6b, float:4.477019E-36)
            r4.COB(r0)
            long r8 = X.C05100Qk.A05
            int r0 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01e6
            r64 = r22
        L_0x0190:
            r0 = r4
            X.0VR r0 = (X.AnonymousClass0VR) r0
            r8 = 0
            X.AnonymousClass0VR.A0R(r0, r8)
            r63 = 4108112(0x3eaf50, float:5.756691E-39)
            X.Cvq r0 = new X.Cvq
            r57 = r0
            r58 = r47
            r59 = r72
            r66 = r20
            r68 = r18
            r70 = r16
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r66, r68, r70)
            X.Cvq r51 = r6.A09(r0)
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r2 & 14
            r0 = r0 | r9
            r57 = r2 & 112(0x70, float:1.57E-43)
            r57 = r57 | r0
            int r0 = r1 >> 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r57 = r57 | r0
            int r1 = r1 << 9
            r0 = r1 & r33
            r57 = r57 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r1
            r57 = r57 | r0
            r0 = r1 & r29
            r57 = r57 | r0
            r1 = r1 & r27
            r57 = r57 | r1
            r48 = r4
            r49 = r42
            r50 = r45
            r53 = r41
            r54 = r40
            r55 = r39
            r58 = r8
            r59 = r38
            X.AnonymousClass0PY.A02(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            goto L_0x0132
        L_0x01e6:
            long r64 = r6.A04()
            int r0 = (r64 > r8 ? 1 : (r64 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0190
            long r64 = X.AnonymousClass001.A0v(r4)
            goto L_0x0190
        L_0x01f3:
            if (r37 == 0) goto L_0x01f7
            X.0WC r42 = X.C17090tj.A00
        L_0x01f7:
            if (r36 == 0) goto L_0x01fb
            long r22 = X.C05100Qk.A05
        L_0x01fb:
            if (r35 == 0) goto L_0x0203
            X.ClU[] r0 = X.C26130Cst.A02
            long r20 = X.C7B.A00()
        L_0x0203:
            r14 = 0
            if (r34 == 0) goto L_0x0208
            r72 = r14
        L_0x0208:
            if (r32 == 0) goto L_0x020c
            r60 = r14
        L_0x020c:
            if (r30 == 0) goto L_0x0210
            r47 = r14
        L_0x0210:
            if (r28 == 0) goto L_0x0218
            X.ClU[] r0 = X.C26130Cst.A02
            long r18 = X.C7B.A00()
        L_0x0218:
            if (r15 == 0) goto L_0x021c
            r62 = r14
        L_0x021c:
            if (r11 == 0) goto L_0x0220
            r61 = r14
        L_0x0220:
            if (r10 == 0) goto L_0x0228
            X.ClU[] r0 = X.C26130Cst.A02
            long r16 = X.C7B.A00()
        L_0x0228:
            if (r13 == 0) goto L_0x022c
            r40 = 1
        L_0x022c:
            r56 = 1
            if (r26 == 0) goto L_0x0232
            r38 = 1
        L_0x0232:
            if (r12 == 0) goto L_0x0237
            r39 = 2147483647(0x7fffffff, float:NaN)
        L_0x0237:
            if (r9 != 0) goto L_0x023b
            r56 = r43
        L_0x023b:
            if (r8 == 0) goto L_0x0241
            X.1CQ r52 = X.AnonymousClass1D7.A0I()
        L_0x0241:
            if (r25 == 0) goto L_0x0245
            X.0l4 r41 = X.C12010l4.A00
        L_0x0245:
            r0 = r70 & r31
            if (r0 == 0) goto L_0x017f
            X.07W r0 = A00
            java.lang.Object r6 = r4.BFh(r0)
            X.Cvq r6 = (X.C26251Cvq) r6
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
            goto L_0x017f
        L_0x0257:
            r0 = r69 & r33
            if (r0 != 0) goto L_0x00e6
            r0 = r43
            boolean r0 = r4.BEd(r0)
            if (r0 != 0) goto L_0x0265
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0265:
            r1 = r1 | r8
            goto L_0x00e6
        L_0x0268:
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00de
            r0 = r39
            boolean r0 = r4.BEd(r0)
            if (r0 != 0) goto L_0x0276
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0276:
            r1 = r1 | r9
            goto L_0x00de
        L_0x0279:
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00d8
            r0 = r38
            int r0 = X.AnonymousClass001.A0i(r4, r0)
            r1 = r1 | r0
            goto L_0x00d8
        L_0x0286:
            r0 = r69 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00d0
            r0 = r40
            boolean r0 = r4.BEd(r0)
            int r0 = X.AnonymousClass000.A0A(r0)
            r1 = r1 | r0
            goto L_0x00d0
        L_0x0297:
            r0 = r69 & 14
            if (r0 != 0) goto L_0x02a9
            r0 = r16
            boolean r0 = r4.BEe(r0)
            int r0 = X.AnonymousClass000.A09(r0)
            r1 = r69 | r0
            goto L_0x00ca
        L_0x02a9:
            r1 = r7
            goto L_0x00ca
        L_0x02ac:
            r0 = r68 & r33
            if (r0 != 0) goto L_0x0053
            r0 = r72
            int r0 = X.AnonymousClass001.A0U(r4, r0)
            r2 = r2 | r0
            goto L_0x0053
        L_0x02b9:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0048
            r0 = r20
            boolean r1 = r4.BEe(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x02c9
            r0 = 2048(0x800, float:2.87E-42)
        L_0x02c9:
            r2 = r2 | r0
            goto L_0x0048
        L_0x02cc:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0040
            r0 = r22
            int r0 = X.AnonymousClass001.A0P(r4, r0)
            r2 = r2 | r0
            goto L_0x0040
        L_0x02d9:
            r0 = r68 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x003a
            r0 = r42
            int r0 = X.AnonymousClass001.A0R(r4, r0)
            r2 = r2 | r0
            goto L_0x003a
        L_0x02e6:
            r0 = r68 & 14
            if (r0 != 0) goto L_0x02f4
            r0 = r45
            int r2 = X.AnonymousClass001.A0Z(r4, r0)
            r2 = r2 | r68
            goto L_0x0034
        L_0x02f4:
            r2 = r5
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PA.A00(X.0tn, X.0tj, X.DRu, X.Cvq, X.CGf, X.Cma, X.DSF, X.CqZ, X.Cme, java.util.Map, X.1Di, int, int, int, int, int, int, long, long, long, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0108, code lost:
        if (r4.BEf(r6) == false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r47, X.C17090tj r48, X.C26251Cvq r49, X.C24693CGf r50, X.C25823Cma r51, X.DSF r52, X.C26018CqZ r53, X.C25827Cme r54, java.lang.String r55, X.C22821Di r56, int r57, int r58, int r59, int r60, int r61, int r62, long r63, long r65, long r67, long r69, boolean r71) {
        /*
            r6 = r49
            r40 = r48
            r22 = r63
            r44 = r50
            r20 = r65
            r46 = r52
            r45 = r51
            r18 = r67
            r48 = r54
            r16 = r69
            r39 = r56
            r38 = r57
            r36 = r71
            r37 = r58
            r1 = 0
            r49 = r55
            r0 = r49
            X.C18070vi.A0d(r0, r1)
            r0 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            r4 = r47
            r4.COC(r0)
            r2 = r62
            r0 = r62 & 1
            r3 = r60
            if (r0 == 0) goto L_0x02da
            r5 = r60 | 6
        L_0x0036:
            r35 = r62 & 2
            if (r35 == 0) goto L_0x02cd
            r5 = r5 | 48
        L_0x003c:
            r34 = r62 & 4
            if (r34 == 0) goto L_0x02c0
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r33 = r62 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r33 == 0) goto L_0x02ad
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x004a:
            r32 = r62 & 16
            r31 = 57344(0xe000, float:8.0356E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r32 == 0) goto L_0x02a0
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0055:
            r30 = r62 & 32
            r29 = 458752(0x70000, float:6.42848E-40)
            r28 = 65536(0x10000, float:9.18355E-41)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r30 != 0) goto L_0x0069
            r0 = r60 & r29
            if (r0 != 0) goto L_0x006a
            r0 = r46
            int r0 = X.AnonymousClass001.A0V(r4, r0)
        L_0x0069:
            r5 = r5 | r0
        L_0x006a:
            r27 = r62 & 64
            r26 = 3670016(0x380000, float:5.142788E-39)
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r27 != 0) goto L_0x007c
            r0 = r60 & r26
            if (r0 != 0) goto L_0x007d
            r0 = r44
            int r0 = X.AnonymousClass001.A0W(r4, r0)
        L_0x007c:
            r5 = r5 | r0
        L_0x007d:
            r0 = r2 & 128(0x80, float:1.794E-43)
            r25 = r0
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 != 0) goto L_0x0097
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r60
            if (r0 != 0) goto L_0x0098
            r0 = r18
            boolean r0 = r4.BEe(r0)
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x0097
            r1 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0097:
            r5 = r5 | r1
        L_0x0098:
            r10 = r2 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r10 != 0) goto L_0x00aa
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r60
            if (r0 != 0) goto L_0x00ab
            r0 = r48
            int r0 = X.AnonymousClass001.A0Y(r4, r0)
        L_0x00aa:
            r5 = r5 | r0
        L_0x00ab:
            r9 = r2 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r42 = r53
            if (r9 != 0) goto L_0x00c3
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r60
            if (r0 != 0) goto L_0x00c4
            r0 = r42
            boolean r0 = r4.BEf(r0)
            int r0 = X.AnonymousClass000.A06(r0)
        L_0x00c3:
            r5 = r5 | r0
        L_0x00c4:
            r8 = r2 & 1024(0x400, float:1.435E-42)
            r7 = r61
            if (r8 == 0) goto L_0x028b
            r1 = r61 | 6
        L_0x00cc:
            r12 = r2 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x027a
            r1 = r1 | 48
        L_0x00d2:
            r11 = r2 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x026d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00d8:
            r13 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x025c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00de:
            r0 = r2 & 16384(0x4000, float:2.2959E-41)
            r41 = r59
            if (r0 == 0) goto L_0x024b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00e6:
            r14 = 32768(0x8000, float:4.5918E-41)
            r24 = r62 & r14
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r24 != 0) goto L_0x00f9
            r14 = r61 & r29
            if (r14 != 0) goto L_0x00fa
            r14 = r39
            int r14 = X.AnonymousClass001.A0e(r4, r14)
        L_0x00f9:
            r1 = r1 | r14
        L_0x00fa:
            r14 = r61 & r26
            if (r14 != 0) goto L_0x010d
            r14 = r62 & r28
            if (r14 != 0) goto L_0x010a
            boolean r15 = r4.BEf(r6)
            r14 = 1048576(0x100000, float:1.469368E-39)
            if (r15 != 0) goto L_0x010c
        L_0x010a:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x010c:
            r1 = r1 | r14
        L_0x010d:
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r5
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r15) goto L_0x0157
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r1
            r14 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r14) goto L_0x0157
            boolean r14 = r4.BZO()
            if (r14 == 0) goto L_0x0157
            r4.CNR()
            r47 = r42
            r53 = r41
        L_0x012c:
            X.0Vf r1 = r4.BKF()
            if (r1 == 0) goto L_0x0156
            X.0oB r0 = new X.0oB
            r41 = r0
            r42 = r40
            r43 = r6
            r50 = r39
            r51 = r38
            r52 = r37
            r54 = r3
            r55 = r7
            r56 = r2
            r57 = r22
            r59 = r20
            r61 = r18
            r63 = r16
            r65 = r36
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r63, r65)
            r1.A03(r0)
        L_0x0156:
            return
        L_0x0157:
            r4.CNl()
            r14 = r60 & 1
            if (r14 == 0) goto L_0x01ec
            boolean r14 = r4.BQS()
            if (r14 != 0) goto L_0x01ec
            r4.CNR()
            r0 = r62 & r28
            if (r0 == 0) goto L_0x016f
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x016f:
            r47 = r42
            r53 = r41
        L_0x0173:
            r4.BKA()
            r0 = 79582822(0x4be5666, float:4.474813E-36)
            r4.COB(r0)
            long r8 = X.C05100Qk.A05
            int r0 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01df
            r61 = r22
        L_0x0184:
            r0 = r4
            X.0VR r0 = (X.AnonymousClass0VR) r0
            r8 = 0
            X.AnonymousClass0VR.A0R(r0, r8)
            r60 = 4108112(0x3eaf50, float:5.756691E-39)
            X.Cvq r0 = new X.Cvq
            r54 = r0
            r55 = r44
            r56 = r45
            r57 = r46
            r58 = r47
            r59 = r48
            r63 = r20
            r65 = r18
            r67 = r16
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r63, r65, r67)
            X.Cvq r27 = r6.A09(r0)
            r0 = r5 & 14
            r33 = r5 & 112(0x70, float:1.57E-43)
            r33 = r33 | r0
            int r0 = r1 >> 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r33 = r33 | r0
            int r1 = r1 << 9
            r0 = r1 & r31
            r33 = r33 | r0
            r0 = r1 & r29
            r33 = r33 | r0
            r0 = r1 & r26
            r33 = r33 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r0
            r33 = r33 | r1
            r25 = r4
            r26 = r40
            r28 = r49
            r29 = r39
            r30 = r38
            r31 = r37
            r32 = r53
            r34 = r8
            r35 = r36
            X.AnonymousClass0PY.A04(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x012c
        L_0x01df:
            long r61 = r6.A04()
            int r0 = (r61 > r8 ? 1 : (r61 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0184
            long r61 = X.AnonymousClass001.A0v(r4)
            goto L_0x0184
        L_0x01ec:
            if (r35 == 0) goto L_0x01f0
            X.0WC r40 = X.C17090tj.A00
        L_0x01f0:
            if (r34 == 0) goto L_0x01f4
            long r22 = X.C05100Qk.A05
        L_0x01f4:
            if (r33 == 0) goto L_0x01fc
            X.ClU[] r14 = X.C26130Cst.A02
            long r20 = X.C7B.A00()
        L_0x01fc:
            r47 = 0
            if (r32 == 0) goto L_0x0202
            r45 = r47
        L_0x0202:
            if (r30 == 0) goto L_0x0206
            r46 = r47
        L_0x0206:
            if (r27 == 0) goto L_0x020a
            r44 = r47
        L_0x020a:
            if (r25 == 0) goto L_0x0212
            X.ClU[] r14 = X.C26130Cst.A02
            long r18 = X.C7B.A00()
        L_0x0212:
            if (r10 == 0) goto L_0x0216
            r48 = r47
        L_0x0216:
            if (r9 != 0) goto L_0x021a
            r47 = r42
        L_0x021a:
            if (r8 == 0) goto L_0x0222
            X.ClU[] r8 = X.C26130Cst.A02
            long r16 = X.C7B.A00()
        L_0x0222:
            if (r12 == 0) goto L_0x0226
            r38 = 1
        L_0x0226:
            r53 = 1
            if (r11 == 0) goto L_0x022c
            r36 = 1
        L_0x022c:
            if (r13 == 0) goto L_0x0231
            r37 = 2147483647(0x7fffffff, float:NaN)
        L_0x0231:
            if (r0 != 0) goto L_0x0235
            r53 = r41
        L_0x0235:
            if (r24 == 0) goto L_0x0239
            X.0l3 r39 = X.C12000l3.A00
        L_0x0239:
            r0 = r62 & r28
            if (r0 == 0) goto L_0x0173
            X.07W r0 = A00
            java.lang.Object r6 = r4.BFh(r0)
            X.Cvq r6 = (X.C26251Cvq) r6
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
            goto L_0x0173
        L_0x024b:
            r14 = r61 & r31
            if (r14 != 0) goto L_0x00e6
            r14 = r41
            boolean r14 = r4.BEd(r14)
            if (r14 != 0) goto L_0x0259
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0259:
            r1 = r1 | r15
            goto L_0x00e6
        L_0x025c:
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00de
            r0 = r37
            boolean r0 = r4.BEd(r0)
            if (r0 != 0) goto L_0x026a
            r14 = 1024(0x400, float:1.435E-42)
        L_0x026a:
            r1 = r1 | r14
            goto L_0x00de
        L_0x026d:
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00d8
            r0 = r36
            int r0 = X.AnonymousClass001.A0i(r4, r0)
            r1 = r1 | r0
            goto L_0x00d8
        L_0x027a:
            r0 = r61 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00d2
            r0 = r38
            boolean r0 = r4.BEd(r0)
            int r0 = X.AnonymousClass000.A0A(r0)
            r1 = r1 | r0
            goto L_0x00d2
        L_0x028b:
            r0 = r61 & 14
            if (r0 != 0) goto L_0x029d
            r0 = r16
            boolean r0 = r4.BEe(r0)
            int r0 = X.AnonymousClass000.A09(r0)
            r1 = r61 | r0
            goto L_0x00cc
        L_0x029d:
            r1 = r7
            goto L_0x00cc
        L_0x02a0:
            r0 = r60 & r31
            if (r0 != 0) goto L_0x0055
            r0 = r45
            int r0 = X.AnonymousClass001.A0U(r4, r0)
            r5 = r5 | r0
            goto L_0x0055
        L_0x02ad:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004a
            r0 = r20
            boolean r1 = r4.BEe(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x02bd
            r0 = 2048(0x800, float:2.87E-42)
        L_0x02bd:
            r5 = r5 | r0
            goto L_0x004a
        L_0x02c0:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0042
            r0 = r22
            int r0 = X.AnonymousClass001.A0P(r4, r0)
            r5 = r5 | r0
            goto L_0x0042
        L_0x02cd:
            r0 = r60 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x003c
            r0 = r40
            int r0 = X.AnonymousClass001.A0R(r4, r0)
            r5 = r5 | r0
            goto L_0x003c
        L_0x02da:
            r0 = r60 & 14
            if (r0 != 0) goto L_0x02e8
            r0 = r49
            int r5 = X.AnonymousClass001.A0Z(r4, r0)
            r5 = r5 | r60
            goto L_0x0036
        L_0x02e8:
            r5 = r3
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PA.A01(X.0tn, X.0tj, X.Cvq, X.CGf, X.Cma, X.DSF, X.CqZ, X.Cme, java.lang.String, X.1Di, int, int, int, int, int, int, long, long, long, long, boolean):void");
    }
}
