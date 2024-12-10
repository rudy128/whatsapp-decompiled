package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0PR  reason: invalid class name */
public final class AnonymousClass0PR {
    public static final AnonymousClass0PR A00 = new Object();

    public static final C17330uU A01(C16110rj r8, AnonymousClass0NY r9, C17130tn r10, float f, float f2, boolean z, boolean z2) {
        long j;
        C16300s2 A002;
        C16300s2 A01;
        r10.COB(-1633063017);
        C17330uU A003 = C02260Di.A00(r8, r10);
        r10.COB(-1877482635);
        C17330uU A004 = C02260Di.A00(r8, r10);
        if (!z) {
            long j2 = r9.A02;
            r10.COB(715788969);
            A002 = AnonymousClass0Ou.A00(r10, j2);
        } else {
            if (z2) {
                j = r9.A05;
            } else if (AnonymousClass001.A1b(A004)) {
                j = r9.A07;
            } else {
                j = r9.A09;
            }
            r10.COB(715788864);
            A002 = AnonymousClass0LZ.A00(new AnonymousClass0Tx(C02980Gd.A01, 150, 0), r10, j);
        }
        AnonymousClass0VR r6 = (AnonymousClass0VR) r10;
        AnonymousClass0VR.A0R(r6, false);
        AnonymousClass0VR.A0R(r6, false);
        if (!AnonymousClass001.A1b(A003)) {
            f = f2;
        }
        if (z) {
            r10.COB(-1927737384);
            A01 = C04900Pj.A01(new AnonymousClass0Tx(C02980Gd.A01, 150, 0), r10, f);
        } else {
            r10.COB(-1927737286);
            A01 = AnonymousClass0Ou.A01(r10, DSH.A00(f2));
        }
        AnonymousClass0VR.A0R(r6, false);
        C17330uU A012 = AnonymousClass0Ou.A01(r10, new AnonymousClass0JY(new AnonymousClass09Y(AnonymousClass000.A0W(A002)), ((DSH) A01.getValue()).A02()));
        AnonymousClass0VR.A0R(r6, false);
        return A012;
    }

    public static final AnonymousClass0NY A00(C17130tn r74, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43 = j30;
        long j44 = j29;
        long j45 = j13;
        long j46 = j12;
        long j47 = j11;
        long j48 = j10;
        long j49 = j9;
        long j50 = j8;
        long j51 = j7;
        long j52 = j6;
        long j53 = j5;
        long j54 = j4;
        long j55 = j3;
        long j56 = j2;
        long j57 = j;
        long j58 = j14;
        long j59 = j15;
        long j60 = j16;
        long j61 = j17;
        long j62 = j18;
        long j63 = j19;
        long j64 = j20;
        long j65 = j21;
        long j66 = j22;
        long j67 = j23;
        long j68 = j24;
        long j69 = j25;
        long j70 = j26;
        int i3 = i;
        long j71 = j27;
        long j72 = j28;
        C03630Jc r5 = null;
        C17130tn r1 = r74;
        r1.COB(1767617725);
        if ((i & 1) != 0) {
            j57 = AnonymousClass0QB.A05(r1, C03140Gt.A0F);
        }
        if ((i & 2) != 0) {
            j56 = AnonymousClass0QB.A05(r1, C03140Gt.A0L);
        }
        if ((i & 4) != 0) {
            j55 = AnonymousClass001.A0w(r1, C03140Gt.A02);
        }
        if ((i & 8) != 0) {
            j54 = AnonymousClass0QB.A05(r1, C03140Gt.A09);
        }
        if ((i & 16) != 0) {
            j53 = C05100Qk.A04;
        }
        if ((i & 32) != 0) {
            j52 = C05100Qk.A04;
        }
        if ((i & 64) != 0) {
            j51 = C05100Qk.A04;
        }
        if ((i3 & 128) != 0) {
            j50 = C05100Qk.A04;
        }
        if ((i3 & 256) != 0) {
            j49 = AnonymousClass0QB.A05(r1, C03140Gt.A00);
        }
        if ((i3 & 512) != 0) {
            j48 = AnonymousClass0QB.A05(r1, C03140Gt.A08);
        }
        if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            r5 = (C03630Jc) r1.BFh(AnonymousClass0GS.A01);
        }
        if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j47 = AnonymousClass0QB.A05(r1, C03140Gt.A0I);
        }
        if ((i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            j46 = AnonymousClass0QB.A05(r1, C03140Gt.A0R);
        }
        if ((i3 & DefaultCrypto.BUFFER_SIZE) != 0) {
            j45 = AnonymousClass0Oy.A03(AnonymousClass001.A11(AnonymousClass0QB.A05(r1, C03140Gt.A05)), C05100Qk.A04(AnonymousClass0QB.A05(r1, C03140Gt.A05)), C05100Qk.A03(AnonymousClass0QB.A05(r1, C03140Gt.A05)), C05100Qk.A02(AnonymousClass0QB.A05(r1, C03140Gt.A05)), 0.12f);
        }
        if ((i3 & 16384) != 0) {
            j58 = AnonymousClass0QB.A05(r1, C03140Gt.A0C);
        }
        if ((32768 & i) != 0) {
            j59 = AnonymousClass0QB.A05(r1, C03140Gt.A0H);
        }
        if ((65536 & i) != 0) {
            j60 = AnonymousClass0QB.A05(r1, C03140Gt.A0Q);
        }
        if ((131072 & i) != 0) {
            j61 = AnonymousClass001.A0w(r1, C03140Gt.A04);
        }
        if ((262144 & i) != 0) {
            j62 = AnonymousClass0QB.A05(r1, C03140Gt.A0B);
        }
        if ((524288 & i) != 0) {
            j63 = AnonymousClass0QB.A05(r1, C03140Gt.A0K);
        }
        if ((1048576 & i) != 0) {
            j64 = AnonymousClass0QB.A05(r1, C03140Gt.A0T);
        }
        if ((2097152 & i) != 0) {
            j65 = AnonymousClass001.A0w(r1, C03140Gt.A07);
        }
        if ((4194304 & i) != 0) {
            j66 = AnonymousClass0QB.A05(r1, C03140Gt.A0E);
        }
        if ((8388608 & i) != 0) {
            j67 = AnonymousClass0QB.A05(r1, C03140Gt.A0G);
        }
        if ((16777216 & i) != 0) {
            j68 = AnonymousClass0QB.A05(r1, C03140Gt.A0P);
        }
        if ((33554432 & i) != 0) {
            j69 = AnonymousClass001.A0w(r1, C03140Gt.A03);
        }
        if ((67108864 & i) != 0) {
            j70 = AnonymousClass0QB.A05(r1, C03140Gt.A0A);
        }
        if ((134217728 & i) != 0) {
            j31 = AnonymousClass0QB.A05(r1, C03140Gt.A0M);
        } else {
            j31 = 0;
        }
        if ((268435456 & i) != 0) {
            j32 = AnonymousClass0QB.A05(r1, C03140Gt.A0M);
        } else {
            j32 = 0;
        }
        if ((536870912 & i) != 0) {
            j33 = AnonymousClass001.A0w(r1, C03140Gt.A02);
        } else {
            j33 = 0;
        }
        if ((i & 1073741824) != 0) {
            j34 = AnonymousClass0QB.A05(r1, C03140Gt.A0M);
        } else {
            j34 = 0;
        }
        int i4 = i2;
        if ((i2 & 1) != 0) {
            j71 = AnonymousClass0QB.A05(r1, C03140Gt.A0J);
        }
        if ((i2 & 2) != 0) {
            j72 = AnonymousClass0QB.A05(r1, C03140Gt.A0S);
        }
        if ((i2 & 4) != 0) {
            j44 = AnonymousClass001.A0w(r1, C03140Gt.A06);
        }
        if ((i2 & 8) != 0) {
            j43 = AnonymousClass0QB.A05(r1, C03140Gt.A0D);
        }
        if ((i2 & 16) != 0) {
            j35 = AnonymousClass0QB.A05(r1, C03140Gt.A0N);
        } else {
            j35 = 0;
        }
        if ((i2 & 32) != 0) {
            j36 = AnonymousClass0QB.A05(r1, C03140Gt.A0N);
        } else {
            j36 = 0;
        }
        if ((i4 & 64) != 0) {
            j37 = AnonymousClass001.A0w(r1, C03140Gt.A0N);
        } else {
            j37 = 0;
        }
        if ((i4 & 128) != 0) {
            j38 = AnonymousClass0QB.A05(r1, C03140Gt.A0N);
        } else {
            j38 = 0;
        }
        if ((i4 & 256) != 0) {
            j39 = AnonymousClass0QB.A05(r1, C03140Gt.A0O);
        } else {
            j39 = 0;
        }
        if ((i4 & 512) != 0) {
            j40 = AnonymousClass0QB.A05(r1, C03140Gt.A0O);
        } else {
            j40 = 0;
        }
        if ((i4 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            j41 = AnonymousClass001.A0w(r1, C03140Gt.A0O);
        } else {
            j41 = 0;
        }
        if ((i4 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j42 = AnonymousClass0QB.A05(r1, C03140Gt.A0O);
        } else {
            j42 = 0;
        }
        AnonymousClass0NY r4 = new AnonymousClass0NY(r5, j57, j56, j55, j54, j53, j52, j51, j50, j49, j48, j47, j46, j45, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j31, j32, j33, j34, j71, j72, j44, j43, j35, j36, j37, j38, j39, j40, j41, j42);
        AnonymousClass0VR.A0T(r1);
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0114, code lost:
        if (r15 == false) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C16110rj r102, X.AnonymousClass0tB r103, X.AnonymousClass0NY r104, X.C17130tn r105, X.EBO r106, java.lang.String r107, X.AnonymousClass1OS r108, X.AnonymousClass1OS r109, X.AnonymousClass1OS r110, X.AnonymousClass1OS r111, X.AnonymousClass1OS r112, X.AnonymousClass1OS r113, X.AnonymousClass1OS r114, X.AnonymousClass1OS r115, X.AnonymousClass1OS r116, int r117, int r118, int r119, boolean r120, boolean r121, boolean r122) {
        /*
            r101 = this;
            r23 = r122
            r96 = r109
            r95 = r110
            r94 = r111
            r93 = r112
            r92 = r113
            r91 = r114
            r90 = r115
            r25 = r104
            r4 = r103
            r24 = r116
            r1 = 0
            r98 = r107
            r0 = r98
            X.C18070vi.A0d(r0, r1)
            r1 = 1
            r97 = r108
            r0 = r97
            X.C18070vi.A0d(r0, r1)
            r1 = 4
            r99 = r106
            r0 = r99
            X.C18070vi.A0d(r0, r1)
            r1 = 5
            r100 = r102
            r0 = r100
            X.C18070vi.A0d(r0, r1)
            r0 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            r3 = r105
            r3.COC(r0)
            r1 = r119
            r0 = r119 & 1
            r2 = r117
            if (r0 == 0) goto L_0x034a
            r5 = r117 | 6
        L_0x0048:
            r0 = r119 & 2
            if (r0 == 0) goto L_0x033d
            r5 = r5 | 48
        L_0x004e:
            r0 = r119 & 4
            r89 = r120
            if (r0 == 0) goto L_0x0330
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0056:
            r0 = r119 & 8
            r22 = 1024(0x400, float:1.435E-42)
            r88 = r121
            if (r0 == 0) goto L_0x0323
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r0 = r119 & 16
            r15 = 8192(0x2000, float:1.14794E-41)
            r21 = 57344(0xe000, float:8.0356E-41)
            if (r0 == 0) goto L_0x0316
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x006b:
            r6 = r119 & 32
            r16 = 65536(0x10000, float:9.18355E-41)
            r20 = 458752(0x70000, float:6.42848E-40)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r6 != 0) goto L_0x007f
            r0 = r117 & r20
            if (r0 != 0) goto L_0x0080
            r0 = r100
            int r0 = X.AnonymousClass001.A0V(r3, r0)
        L_0x007f:
            r5 = r5 | r0
        L_0x0080:
            r19 = r119 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r19 != 0) goto L_0x0098
            r0 = r117 & r18
            if (r0 != 0) goto L_0x0099
            r0 = r23
            boolean r0 = r3.BEg(r0)
            r6 = 524288(0x80000, float:7.34684E-40)
            if (r0 == 0) goto L_0x0098
            r6 = 1048576(0x100000, float:1.469368E-39)
        L_0x0098:
            r5 = r5 | r6
        L_0x0099:
            r11 = r1 & 128(0x80, float:1.794E-43)
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 != 0) goto L_0x00ab
            r0 = r117 & r17
            if (r0 != 0) goto L_0x00ac
            r0 = r96
            int r0 = X.AnonymousClass001.A0g(r3, r0)
        L_0x00ab:
            r5 = r5 | r0
        L_0x00ac:
            r10 = r1 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r10 != 0) goto L_0x00c2
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r117
            if (r0 != 0) goto L_0x00c3
            r0 = r95
            boolean r0 = r3.BEh(r0)
            int r0 = X.AnonymousClass000.A07(r0)
        L_0x00c2:
            r5 = r5 | r0
        L_0x00c3:
            r9 = r1 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r9 != 0) goto L_0x00d5
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r117
            if (r0 != 0) goto L_0x00d6
            r0 = r94
            int r0 = X.AnonymousClass001.A0h(r3, r0)
        L_0x00d5:
            r5 = r5 | r0
        L_0x00d6:
            r8 = r1 & 1024(0x400, float:1.435E-42)
            r6 = r118
            if (r8 == 0) goto L_0x0305
            r7 = r118 | 6
        L_0x00de:
            r12 = r1 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x02f8
            r7 = r7 | 48
        L_0x00e4:
            r13 = r1 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x02eb
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x00ea:
            r14 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x02d9
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x00f0:
            r0 = r118 & r21
            if (r0 != 0) goto L_0x0103
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x0102
            r0 = r25
            boolean r0 = r3.BEf(r0)
            if (r0 == 0) goto L_0x0102
            r15 = 16384(0x4000, float:2.2959E-41)
        L_0x0102:
            r7 = r7 | r15
        L_0x0103:
            r0 = r118 & r20
            if (r0 != 0) goto L_0x0119
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r119 & r0
            if (r0 != 0) goto L_0x0116
            boolean r15 = r3.BEf(r4)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r15 != 0) goto L_0x0118
        L_0x0116:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0118:
            r7 = r7 | r0
        L_0x0119:
            r16 = r119 & r16
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x0129
            r0 = r118 & r18
            if (r0 != 0) goto L_0x012a
            r0 = r24
            int r0 = X.AnonymousClass001.A0f(r3, r0)
        L_0x0129:
            r7 = r7 | r0
        L_0x012a:
            r0 = 131072(0x20000, float:1.83671E-40)
            r15 = r119 & r0
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = r101
            if (r15 != 0) goto L_0x013e
            r0 = r118 & r17
            if (r0 != 0) goto L_0x013f
            r0 = r22
            int r0 = X.AnonymousClass001.A0X(r3, r0)
        L_0x013e:
            r7 = r7 | r0
        L_0x013f:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r15 = r5 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r0) goto L_0x0196
            r15 = 23967451(0x16db6db, float:4.3661218E-38)
            r15 = r15 & r7
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r15 != r0) goto L_0x0196
            boolean r0 = r3.BZO()
            if (r0 == 0) goto L_0x0196
            r3.CNR()
        L_0x015b:
            X.0Vf r3 = r3.BKF()
            if (r3 == 0) goto L_0x0195
            X.0oC r0 = new X.0oC
            r26 = r0
            r27 = r100
            r28 = r4
            r29 = r22
            r30 = r25
            r31 = r99
            r32 = r98
            r33 = r97
            r34 = r96
            r35 = r95
            r36 = r94
            r37 = r93
            r38 = r92
            r39 = r91
            r40 = r90
            r41 = r24
            r42 = r2
            r43 = r6
            r44 = r1
            r45 = r89
            r46 = r88
            r47 = r23
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r3.A03(r0)
        L_0x0195:
            return
        L_0x0196:
            r3.CNl()
            r0 = r117 & 1
            if (r0 == 0) goto L_0x023d
            boolean r0 = r3.BQS()
            if (r0 != 0) goto L_0x023d
            r3.CNR()
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01ae
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r0
        L_0x01ae:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r119
            if (r0 == 0) goto L_0x01b9
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r0
        L_0x01b9:
            r3.BKA()
            X.0CJ r29 = X.AnonymousClass0CJ.Outlined
            int r8 = r5 << 3
            r0 = r8 & 112(0x70, float:1.57E-43)
            r42 = r0 | 6
            r0 = r8 & 896(0x380, float:1.256E-42)
            r42 = r42 | r0
            int r8 = r5 >> 3
            r0 = r8 & 7168(0x1c00, float:1.0045E-41)
            r42 = r42 | r0
            int r9 = r5 >> 9
            r0 = r9 & r21
            r42 = r42 | r0
            r0 = r9 & r20
            r42 = r42 | r0
            r0 = r9 & r18
            r42 = r42 | r0
            int r10 = r7 << 21
            r0 = r10 & r17
            r42 = r42 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r10
            r42 = r42 | r0
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r10 = r10 & r0
            r42 = r42 | r10
            int r0 = r7 >> 9
            r43 = r0 & 14
            int r0 = r5 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r43 = r43 | r0
            r0 = r5 & 896(0x380, float:1.256E-42)
            r43 = r43 | r0
            r0 = r9 & 7168(0x1c00, float:1.0045E-41)
            r43 = r43 | r0
            r8 = r8 & r21
            r43 = r43 | r8
            r0 = r7 & r20
            r43 = r43 | r0
            int r0 = r7 << 6
            r0 = r0 & r18
            r43 = r43 | r0
            int r0 = r7 << 3
            r0 = r0 & r17
            r43 = r43 | r0
            r44 = 0
            r26 = r100
            r27 = r4
            r28 = r25
            r30 = r3
            r31 = r99
            r32 = r98
            r33 = r97
            r34 = r96
            r35 = r95
            r36 = r94
            r37 = r93
            r38 = r92
            r39 = r91
            r40 = r90
            r41 = r24
            r45 = r88
            r46 = r89
            r47 = r23
            X.AnonymousClass0PE.A01(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x015b
        L_0x023d:
            if (r19 == 0) goto L_0x0241
            r23 = 0
        L_0x0241:
            r0 = 0
            if (r11 == 0) goto L_0x0246
            r96 = r0
        L_0x0246:
            if (r10 == 0) goto L_0x024a
            r95 = r0
        L_0x024a:
            if (r9 == 0) goto L_0x024e
            r94 = r0
        L_0x024e:
            if (r8 == 0) goto L_0x0252
            r93 = r0
        L_0x0252:
            if (r12 == 0) goto L_0x0256
            r92 = r0
        L_0x0256:
            if (r13 == 0) goto L_0x025a
            r91 = r0
        L_0x025a:
            if (r14 == 0) goto L_0x025e
            r90 = r0
        L_0x025e:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02ad
            r26 = 2147483647(0x7fffffff, float:NaN)
            r27 = 4095(0xfff, float:5.738E-42)
            r28 = 0
            r32 = r28
            r34 = r28
            r36 = r28
            r38 = r28
            r40 = r28
            r42 = r28
            r44 = r28
            r46 = r28
            r48 = r28
            r50 = r28
            r52 = r28
            r54 = r28
            r56 = r28
            r58 = r28
            r60 = r28
            r62 = r28
            r64 = r28
            r66 = r28
            r68 = r28
            r70 = r28
            r72 = r28
            r74 = r28
            r76 = r28
            r78 = r28
            r80 = r28
            r82 = r28
            r84 = r28
            r86 = r28
            r25 = r3
            r30 = r28
            X.0NY r25 = A00(r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86)
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r0
        L_0x02ad:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r119 & r0
            if (r0 == 0) goto L_0x02bf
            r0 = 1098907648(0x41800000, float:16.0)
            X.0Us r4 = new X.0Us
            r4.<init>(r0, r0, r0, r0)
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r0
        L_0x02bf:
            if (r16 == 0) goto L_0x01b9
            X.0mW r8 = new X.0mW
            r9 = r100
            r10 = r25
            r11 = r5
            r12 = r7
            r13 = r89
            r14 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = -1448570018(0xffffffffa9a8935e, float:-7.486263E-14)
            X.04D r24 = X.AnonymousClass0LC.A00(r3, r8, r0)
            goto L_0x01b9
        L_0x02d9:
            r0 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00f0
            r0 = r90
            boolean r0 = r3.BEh(r0)
            if (r0 == 0) goto L_0x02e7
            r22 = 2048(0x800, float:2.87E-42)
        L_0x02e7:
            r7 = r7 | r22
            goto L_0x00f0
        L_0x02eb:
            r0 = r6 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00ea
            r0 = r91
            int r0 = X.AnonymousClass001.A0c(r3, r0)
            r7 = r7 | r0
            goto L_0x00ea
        L_0x02f8:
            r0 = r118 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00e4
            r0 = r92
            int r0 = X.AnonymousClass001.A0b(r3, r0)
            r7 = r7 | r0
            goto L_0x00e4
        L_0x0305:
            r0 = r118 & 14
            if (r0 != 0) goto L_0x0313
            r0 = r93
            int r0 = X.AnonymousClass001.A0a(r3, r0)
            r7 = r118 | r0
            goto L_0x00de
        L_0x0313:
            r7 = r6
            goto L_0x00de
        L_0x0316:
            r0 = r117 & r21
            if (r0 != 0) goto L_0x006b
            r0 = r99
            int r0 = X.AnonymousClass001.A0U(r3, r0)
            r5 = r5 | r0
            goto L_0x006b
        L_0x0323:
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0060
            r0 = r88
            int r0 = X.AnonymousClass001.A0j(r3, r0)
            r5 = r5 | r0
            goto L_0x0060
        L_0x0330:
            r0 = r2 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0056
            r0 = r89
            int r0 = X.AnonymousClass001.A0i(r3, r0)
            r5 = r5 | r0
            goto L_0x0056
        L_0x033d:
            r0 = r117 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x004e
            r0 = r97
            int r0 = X.AnonymousClass001.A0b(r3, r0)
            r5 = r5 | r0
            goto L_0x004e
        L_0x034a:
            r0 = r117 & 14
            if (r0 != 0) goto L_0x0358
            r0 = r98
            int r5 = X.AnonymousClass001.A0Z(r3, r0)
            r5 = r5 | r117
            goto L_0x0048
        L_0x0358:
            r5 = r2
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PR.A02(X.0rj, X.0tB, X.0NY, X.0tn, X.EBO, java.lang.String, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, X.1OS, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r10.BEf(r7) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r11 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r10.BEc(r6) == false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C16110rj r23, X.AnonymousClass0NY r24, X.C17130tn r25, X.C16370s9 r26, float r27, float r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            r22 = this;
            r6 = r28
            r16 = r27
            r7 = r26
            r0 = 2
            r9 = r23
            X.C18070vi.A0d(r9, r0)
            r0 = 3
            r8 = r24
            X.C18070vi.A0d(r8, r0)
            r0 = 1461761386(0x5720b56a, float:1.76701028E14)
            r10 = r25
            r10.COC(r0)
            r4 = r30
            r0 = r30 & 1
            r5 = r29
            r3 = r31
            if (r0 == 0) goto L_0x016a
            r1 = r29 | 6
        L_0x0026:
            r0 = r30 & 2
            r2 = r32
            if (r0 == 0) goto L_0x015b
            r1 = r1 | 48
        L_0x002e:
            r0 = r30 & 4
            if (r0 == 0) goto L_0x0150
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r0 = r30 & 8
            if (r0 == 0) goto L_0x0145
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r29 & r0
            if (r0 != 0) goto L_0x0050
            r0 = r30 & 16
            if (r0 != 0) goto L_0x004d
            boolean r11 = r10.BEf(r7)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r11 != 0) goto L_0x004f
        L_0x004d:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004f:
            r1 = r1 | r0
        L_0x0050:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r29 & r0
            if (r0 != 0) goto L_0x0067
            r0 = r30 & 32
            if (r0 != 0) goto L_0x0064
            r0 = r16
            boolean r11 = r10.BEc(r0)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r11 != 0) goto L_0x0066
        L_0x0064:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0066:
            r1 = r1 | r0
        L_0x0067:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r29
            if (r0 != 0) goto L_0x007c
            r0 = r30 & 64
            if (r0 != 0) goto L_0x0079
            boolean r11 = r10.BEc(r6)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r11 != 0) goto L_0x007b
        L_0x0079:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x007b:
            r1 = r1 | r0
        L_0x007c:
            r11 = r4 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r21 = r22
            if (r11 != 0) goto L_0x0090
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r29
            if (r0 != 0) goto L_0x0091
            r0 = r21
            int r0 = X.AnonymousClass001.A0X(r10, r0)
        L_0x0090:
            r1 = r1 | r0
        L_0x0091:
            r11 = 23967451(0x16db6db, float:4.3661218E-38)
            r11 = r11 & r1
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r11 != r0) goto L_0x00c3
            boolean r0 = r10.BZO()
            if (r0 == 0) goto L_0x00c3
            r10.CNR()
        L_0x00a3:
            X.0Vf r0 = r10.BKF()
            if (r0 == 0) goto L_0x00c2
            X.0mc r10 = new X.0mc
            r20 = r2
            r17 = r5
            r18 = r4
            r19 = r3
            r14 = r7
            r15 = r16
            r16 = r6
            r11 = r9
            r12 = r21
            r13 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A03(r10)
        L_0x00c2:
            return
        L_0x00c3:
            r10.CNl()
            r0 = r29 & 1
            if (r0 == 0) goto L_0x012e
            boolean r0 = r10.BQS()
            if (r0 != 0) goto L_0x012e
            r10.CNR()
        L_0x00d3:
            r10.BKA()
            r13 = r9
            r14 = r8
            r15 = r10
            r17 = r6
            r18 = r3
            r19 = r2
            X.0uU r0 = A01(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = r0.getValue()
            X.0JY r0 = (X.AnonymousClass0JY) r0
            float r1 = r0.A00
            X.0Hv r0 = r0.A01
            androidx.compose.foundation.BorderModifierNodeElement r12 = new androidx.compose.foundation.BorderModifierNodeElement
            r12.<init>(r0, r7, r1)
            r0 = -1921164569(0xffffffff8d7d5ae7, float:-7.8071064E-31)
            r10.COB(r0)
            X.0uU r0 = X.C02260Di.A00(r9, r10)
            if (r31 != 0) goto L_0x011d
            long r0 = r8.A01
        L_0x0100:
            r15 = 150(0x96, float:2.1E-43)
            r11 = 0
            X.0ra r14 = X.C02980Gd.A01
            X.0Tx r13 = new X.0Tx
            r13.<init>(r14, r15, r11)
            X.0s2 r0 = X.AnonymousClass0LZ.A00(r13, r10, r0)
            X.AnonymousClass0VR.A0U(r10)
            long r0 = X.AnonymousClass000.A0W(r0)
            X.0tj r0 = X.C02190Db.A00(r12, r7, r0)
            X.C04870Pg.A01(r10, r0, r11)
            goto L_0x00a3
        L_0x011d:
            if (r32 == 0) goto L_0x0122
            long r0 = r8.A03
            goto L_0x0100
        L_0x0122:
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x012b
            long r0 = r8.A06
            goto L_0x0100
        L_0x012b:
            long r0 = r8.A08
            goto L_0x0100
        L_0x012e:
            r0 = r30 & 16
            if (r0 == 0) goto L_0x0138
            java.lang.Integer r0 = X.C03140Gt.A01
            X.0WV r7 = X.C04570Nx.A01(r10, r0)
        L_0x0138:
            r0 = r30 & 32
            if (r0 == 0) goto L_0x013e
            r16 = 1073741824(0x40000000, float:2.0)
        L_0x013e:
            r0 = r30 & 64
            if (r0 == 0) goto L_0x00d3
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d3
        L_0x0145:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x003a
            int r0 = X.AnonymousClass001.A0T(r10, r8)
            r1 = r1 | r0
            goto L_0x003a
        L_0x0150:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0034
            int r0 = X.AnonymousClass001.A0S(r10, r9)
            r1 = r1 | r0
            goto L_0x0034
        L_0x015b:
            r0 = r29 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002e
            boolean r0 = r10.BEg(r2)
            int r0 = X.AnonymousClass000.A0A(r0)
            r1 = r1 | r0
            goto L_0x002e
        L_0x016a:
            r0 = r29 & 14
            if (r0 != 0) goto L_0x017a
            boolean r0 = r10.BEg(r3)
            int r1 = X.AnonymousClass000.A09(r0)
            r1 = r1 | r29
            goto L_0x0026
        L_0x017a:
            r1 = r5
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PR.A03(X.0rj, X.0NY, X.0tn, X.0s9, float, float, int, int, boolean, boolean):void");
    }
}
