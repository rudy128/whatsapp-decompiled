package X;

/* renamed from: X.0Nk  reason: invalid class name and case insensitive filesystem */
public abstract class C04440Nk {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.0NL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.0NL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.0NL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.0NL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.0NL} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r4 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r1.BEf(r6) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r4 == false) goto L_0x0087;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0JY r44, X.C17210uI r45, X.AnonymousClass0tB r46, X.AnonymousClass0Ip r47, X.AnonymousClass0NL r48, X.C17130tn r49, X.C17090tj r50, X.C16370s9 r51, X.C18090vk r52, X.C36001nB r53, int r54, int r55, boolean r56) {
        /*
            r11 = r45
            r23 = r46
            r46 = r44
            r9 = r48
            r6 = r47
            r22 = r51
            r8 = r56
            r14 = r50
            r7 = 0
            r45 = r52
            r0 = r45
            X.C18070vi.A0d(r0, r7)
            r0 = 9
            r15 = r53
            X.C18070vi.A0d(r15, r0)
            r0 = 650121315(0x26c01063, float:1.3327118E-15)
            r1 = r49
            r1.COC(r0)
            r2 = r55
            r3 = r55 & 1
            r5 = r54
            r0 = r54 | 6
            if (r3 != 0) goto L_0x003e
            r3 = r54 & 14
            r0 = r5
            if (r3 != 0) goto L_0x003e
            r0 = r45
            int r0 = X.AnonymousClass001.A0a(r1, r0)
            r0 = r0 | r54
        L_0x003e:
            r21 = r55 & 2
            if (r21 == 0) goto L_0x027b
            r0 = r0 | 48
        L_0x0044:
            r20 = r55 & 4
            if (r20 == 0) goto L_0x0270
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r3 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x005f
            r3 = r55 & 8
            if (r3 != 0) goto L_0x005c
            r3 = r22
            boolean r4 = r1.BEf(r3)
            r3 = 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x005e
        L_0x005c:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x005e:
            r0 = r0 | r3
        L_0x005f:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r54
            if (r3 != 0) goto L_0x0075
            r3 = r55 & 16
            if (r3 != 0) goto L_0x0072
            boolean r4 = r1.BEf(r6)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x0074
        L_0x0072:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0074:
            r0 = r0 | r3
        L_0x0075:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r54
            if (r3 != 0) goto L_0x008a
            r3 = r55 & 32
            if (r3 != 0) goto L_0x0087
            boolean r4 = r1.BEf(r9)
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r4 != 0) goto L_0x0089
        L_0x0087:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x0089:
            r0 = r0 | r3
        L_0x008a:
            r19 = r55 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r19 != 0) goto L_0x009c
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r54
            if (r3 != 0) goto L_0x009d
            r3 = r46
            int r3 = X.AnonymousClass001.A0W(r1, r3)
        L_0x009c:
            r0 = r0 | r3
        L_0x009d:
            r12 = r2 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 != 0) goto L_0x00af
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r54
            if (r3 != 0) goto L_0x00b0
            r3 = r23
            int r3 = X.AnonymousClass001.A0X(r1, r3)
        L_0x00af:
            r0 = r0 | r3
        L_0x00b0:
            r10 = r2 & 256(0x100, float:3.59E-43)
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r10 != 0) goto L_0x00c0
            r3 = r54 & r18
            if (r3 != 0) goto L_0x00c1
            int r3 = X.AnonymousClass001.A0Y(r1, r11)
        L_0x00c0:
            r0 = r0 | r3
        L_0x00c1:
            r4 = r2 & 512(0x200, float:7.175E-43)
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 != 0) goto L_0x00d1
            r3 = r54 & r17
            if (r3 != 0) goto L_0x00d2
            int r3 = X.AnonymousClass001.A0h(r1, r15)
        L_0x00d1:
            r0 = r0 | r3
        L_0x00d2:
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r0
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r3) goto L_0x010d
            boolean r3 = r1.BZO()
            if (r3 == 0) goto L_0x010d
            r1.CNR()
        L_0x00e4:
            X.0Vf r1 = r1.BKF()
            if (r1 == 0) goto L_0x010c
            X.0ny r0 = new X.0ny
            r24 = r0
            r25 = r46
            r26 = r11
            r27 = r23
            r28 = r6
            r29 = r9
            r30 = r14
            r31 = r22
            r32 = r45
            r33 = r15
            r34 = r5
            r35 = r2
            r36 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1.A03(r0)
        L_0x010c:
            return
        L_0x010d:
            r1.CNl()
            r3 = r54 & 1
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r13 = 0
            if (r3 == 0) goto L_0x01f4
            boolean r3 = r1.BQS()
            if (r3 != 0) goto L_0x01f4
            r1.CNR()
            r3 = r55 & 8
            if (r3 == 0) goto L_0x0127
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0127:
            r3 = r55 & 16
            if (r3 == 0) goto L_0x012d
            r0 = r0 & r16
        L_0x012d:
            r3 = r55 & 32
            if (r3 == 0) goto L_0x0135
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r3
        L_0x0135:
            r1.BKA()
            r3 = -754887434(0xffffffffd30154f6, float:-5.5547619E11)
            r1.COB(r3)
            if (r8 == 0) goto L_0x01f0
            long r3 = r6.A00
        L_0x0142:
            X.0uU r3 = X.AnonymousClass0Ou.A00(r1, r3)
            r10 = r1
            X.0VR r10 = (X.AnonymousClass0VR) r10
            X.AnonymousClass0VR.A0R(r10, r7)
            long r35 = X.AnonymousClass000.A0V(r3)
            r3 = -360303250(0xffffffffea86356e, float:-8.112419E25)
            r1.COB(r3)
            if (r8 == 0) goto L_0x01ec
            long r3 = r6.A01
        L_0x015a:
            X.0uU r3 = X.AnonymousClass0Ou.A00(r1, r3)
            X.AnonymousClass0VR.A0R(r10, r7)
            long r37 = X.AnonymousClass000.A0V(r3)
            r3 = 823569249(0x3116ab61, float:2.192529E-9)
            r1.COB(r3)
            if (r9 != 0) goto L_0x01e7
            r3 = r13
        L_0x016e:
            X.AnonymousClass0VR.A0R(r10, r7)
            if (r3 == 0) goto L_0x01e4
            X.0uU r3 = r3.A05
            java.lang.Object r3 = r3.getValue()
            X.DSH r3 = (X.DSH) r3
            float r32 = r3.A02()
        L_0x017f:
            r3 = 823569344(0x3116abc0, float:2.1925501E-9)
            r1.COB(r3)
            if (r9 == 0) goto L_0x018b
            X.0Vr r13 = r9.A02(r11, r1, r8)
        L_0x018b:
            X.AnonymousClass0VR.A0R(r10, r7)
            if (r13 == 0) goto L_0x01e1
            X.0uU r3 = r13.A05
            java.lang.Object r3 = r3.getValue()
            X.DSH r3 = (X.DSH) r3
            float r31 = r3.A02()
        L_0x019c:
            X.0lx r3 = X.C12560lx.A00
            X.0tj r27 = X.AnonymousClass0PD.A02(r14, r3, false)
            X.0nO r4 = new X.0nO
            r39 = r4
            r40 = r23
            r41 = r15
            r42 = r0
            r43 = r37
            r39.<init>(r40, r41, r42, r43)
            r3 = 956488494(0x3902db2e, float:1.2479417E-4)
            X.04D r30 = X.AnonymousClass0LC.A00(r1, r4, r3)
            r33 = r0 & 14
            r3 = r0 & 896(0x380, float:1.256E-42)
            r33 = r33 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r33 = r33 | r3
            int r3 = r0 << 6
            r3 = r3 & r18
            r33 = r33 | r3
            int r0 = r0 << 3
            r0 = r0 & r17
            r33 = r33 | r0
            r29 = r45
            r34 = r7
            r39 = r8
            r24 = r46
            r25 = r11
            r26 = r1
            r28 = r22
            X.AnonymousClass0Pu.A03(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            goto L_0x00e4
        L_0x01e1:
            r31 = 0
            goto L_0x019c
        L_0x01e4:
            r32 = 0
            goto L_0x017f
        L_0x01e7:
            X.0Vr r3 = r9.A01(r11, r1, r8)
            goto L_0x016e
        L_0x01ec:
            long r3 = r6.A03
            goto L_0x015a
        L_0x01f0:
            long r3 = r6.A02
            goto L_0x0142
        L_0x01f4:
            if (r21 == 0) goto L_0x01f8
            X.0WC r14 = X.C17090tj.A00
        L_0x01f8:
            if (r20 == 0) goto L_0x01fb
            r8 = 1
        L_0x01fb:
            r3 = r55 & 8
            if (r3 == 0) goto L_0x0210
            r3 = -1234923021(0xffffffffb66491f3, float:-3.4059601E-6)
            r1.COB(r3)
            java.lang.Integer r3 = X.C03040Gj.A01
            X.0WV r22 = X.C04570Nx.A01(r1, r3)
            X.AnonymousClass0VR.A0U(r1)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0210:
            r3 = r55 & 16
            if (r3 == 0) goto L_0x0245
            r3 = -339300779(0xffffffffebc6ae55, float:-4.8038114E26)
            r1.COB(r3)
            java.lang.Integer r3 = X.C03040Gj.A00
            long r25 = X.AnonymousClass0QB.A05(r1, r3)
            java.lang.Integer r3 = X.C03040Gj.A04
            long r27 = X.AnonymousClass0QB.A05(r1, r3)
            java.lang.Integer r3 = X.C03040Gj.A02
            long r3 = X.AnonymousClass0QB.A05(r1, r3)
            r6 = 1039516303(0x3df5c28f, float:0.12)
            long r29 = X.AnonymousClass0Oy.A03(X.AnonymousClass001.A11(r3), X.C05100Qk.A04(r3), X.C05100Qk.A03(r3), X.C05100Qk.A02(r3), r6)
            java.lang.Integer r3 = X.C03040Gj.A03
            long r31 = X.AnonymousClass001.A0w(r1, r3)
            X.0Ip r6 = new X.0Ip
            r24 = r6
            r24.<init>(r25, r27, r29, r31)
            X.AnonymousClass0VR.A0U(r1)
            r0 = r0 & r16
        L_0x0245:
            r3 = r55 & 32
            if (r3 == 0) goto L_0x025b
            r3 = 1827791191(0x6cf1e157, float:2.3393221E27)
            r1.COB(r3)
            X.0NL r9 = new X.0NL
            r9.<init>()
            X.AnonymousClass0VR.A0U(r1)
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r3
        L_0x025b:
            if (r19 == 0) goto L_0x025f
            r46 = r13
        L_0x025f:
            if (r12 == 0) goto L_0x0263
            X.0tB r23 = X.AnonymousClass0GT.A00
        L_0x0263:
            if (r10 == 0) goto L_0x0135
            java.lang.Object r11 = X.AnonymousClass002.A03(r1)
            X.AnonymousClass0VR.A0U(r1)
            X.0uI r11 = (X.C17210uI) r11
            goto L_0x0135
        L_0x0270:
            r3 = r5 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x004a
            int r3 = X.AnonymousClass001.A0i(r1, r8)
            r0 = r0 | r3
            goto L_0x004a
        L_0x027b:
            r3 = r54 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0044
            int r3 = X.AnonymousClass001.A0R(r1, r14)
            r0 = r0 | r3
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04440Nk.A00(X.0JY, X.0uI, X.0tB, X.0Ip, X.0NL, X.0tn, X.0tj, X.0s9, X.0vk, X.1nB, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r2 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r7.BEf(r12) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r7.BEf(r0) == false) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass0JY r24, X.C17210uI r25, X.AnonymousClass0tB r26, X.AnonymousClass0Ip r27, X.AnonymousClass0NL r28, X.C17130tn r29, X.C17090tj r30, X.C16370s9 r31, X.C18090vk r32, X.C36001nB r33, int r34, int r35, boolean r36) {
        /*
            r8 = r25
            r23 = r26
            r0 = r24
            r22 = r28
            r12 = r27
            r15 = r31
            r10 = r36
            r21 = r30
            r4 = 0
            r13 = r32
            X.C18070vi.A0d(r13, r4)
            r1 = 9
            r11 = r33
            X.C18070vi.A0d(r11, r1)
            r1 = -1694808287(0xffffffff9afb4721, float:-1.0392608E-22)
            r7 = r29
            r7.COC(r1)
            r5 = r35
            r1 = r35 & 1
            r6 = r34
            if (r1 == 0) goto L_0x01dd
            r3 = r34 | 6
        L_0x002f:
            r20 = r35 & 2
            if (r20 == 0) goto L_0x01d0
            r3 = r3 | 48
        L_0x0035:
            r19 = r35 & 4
            if (r19 == 0) goto L_0x01c5
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x003b:
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x004e
            r1 = r35 & 8
            if (r1 != 0) goto L_0x004b
            boolean r2 = r7.BEf(r15)
            r1 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x004d
        L_0x004b:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x004d:
            r3 = r3 | r1
        L_0x004e:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r34 & r1
            if (r1 != 0) goto L_0x0064
            r1 = r35 & 16
            if (r1 != 0) goto L_0x0061
            boolean r2 = r7.BEf(r12)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x0063
        L_0x0061:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0063:
            r3 = r3 | r1
        L_0x0064:
            r18 = r35 & 32
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x01b9
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x006c:
            r3 = r3 | r1
        L_0x006d:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r34 & r1
            if (r1 != 0) goto L_0x0082
            r1 = r35 & 64
            if (r1 != 0) goto L_0x007f
            boolean r2 = r7.BEf(r0)
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != 0) goto L_0x0081
        L_0x007f:
            r1 = 524288(0x80000, float:7.34684E-40)
        L_0x0081:
            r3 = r3 | r1
        L_0x0082:
            r9 = r5 & 128(0x80, float:1.794E-43)
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 != 0) goto L_0x0094
            r1 = r34 & r2
            if (r1 != 0) goto L_0x0095
            r1 = r23
            int r1 = X.AnonymousClass001.A0X(r7, r1)
        L_0x0094:
            r3 = r3 | r1
        L_0x0095:
            r2 = r5 & 256(0x100, float:3.59E-43)
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 != 0) goto L_0x00a5
            r1 = r34 & r17
            if (r1 != 0) goto L_0x00a6
            int r1 = X.AnonymousClass001.A0Y(r7, r8)
        L_0x00a5:
            r3 = r3 | r1
        L_0x00a6:
            r14 = r5 & 512(0x200, float:7.175E-43)
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            if (r14 != 0) goto L_0x00b6
            r1 = r34 & r16
            if (r1 != 0) goto L_0x00b7
            int r1 = X.AnonymousClass001.A0h(r7, r11)
        L_0x00b6:
            r3 = r3 | r1
        L_0x00b7:
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r3
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r1) goto L_0x00e8
            boolean r1 = r7.BZO()
            if (r1 == 0) goto L_0x00e8
            r7.CNR()
        L_0x00c9:
            X.0Vf r2 = r7.BKF()
            if (r2 == 0) goto L_0x00e7
            X.0nz r1 = new X.0nz
            r24 = r1
            r25 = r0
            r26 = r8
            r27 = r23
            r28 = r12
            r29 = r22
            r34 = r6
            r35 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r2.A03(r1)
        L_0x00e7:
            return
        L_0x00e8:
            r7.CNl()
            r1 = r34 & 1
            if (r1 == 0) goto L_0x013d
            boolean r1 = r7.BQS()
            if (r1 != 0) goto L_0x013d
            r7.CNR()
            r1 = r35 & 8
            if (r1 == 0) goto L_0x00fe
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00fe:
            r1 = r35 & 16
            if (r1 == 0) goto L_0x0106
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r1
        L_0x0106:
            r1 = r35 & 64
            if (r1 == 0) goto L_0x010e
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r1
        L_0x010e:
            r7.BKA()
            r1 = r3 & 14
            int r1 = X.AnonymousClass001.A0F(r3, r1)
            int r34 = X.AnonymousClass001.A0G(r3, r1)
            r1 = r3 & r17
            r34 = r34 | r1
            r3 = r3 & r16
            r34 = r34 | r3
            r30 = r21
            r31 = r15
            r32 = r13
            r35 = r4
            r36 = r10
            r24 = r0
            r25 = r8
            r26 = r23
            r27 = r12
            r28 = r22
            r29 = r7
            A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x00c9
        L_0x013d:
            if (r20 == 0) goto L_0x0141
            X.0WC r21 = X.C17090tj.A00
        L_0x0141:
            if (r19 == 0) goto L_0x0144
            r10 = 1
        L_0x0144:
            r1 = r35 & 8
            if (r1 == 0) goto L_0x0159
            r1 = -2045213065(0xffffffff86188677, float:-2.8686812E-35)
            r7.COB(r1)
            java.lang.Integer r1 = X.C02990Ge.A00
            X.0WV r15 = X.C04570Nx.A01(r7, r1)
            X.AnonymousClass0VR.A0U(r7)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0159:
            r1 = r35 & 16
            if (r1 == 0) goto L_0x0181
            r1 = -1778526249(0xffffffff95fdd7d7, float:-1.0252642E-25)
            r7.COB(r1)
            long r25 = X.C05100Qk.A04
            java.lang.Integer r1 = X.C02990Ge.A02
            long r27 = X.AnonymousClass0QB.A05(r7, r1)
            java.lang.Integer r1 = X.C02990Ge.A01
            long r31 = X.AnonymousClass001.A0w(r7, r1)
            X.0Ip r12 = new X.0Ip
            r24 = r12
            r29 = r25
            r24.<init>(r25, r27, r29, r31)
            X.AnonymousClass0VR.A0U(r7)
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r1
        L_0x0181:
            if (r18 == 0) goto L_0x0185
            r22 = 0
        L_0x0185:
            r1 = r35 & 64
            if (r1 == 0) goto L_0x01a8
            r0 = -563957672(0xffffffffde62b058, float:-4.08366315E18)
            r7.COB(r0)
            java.lang.Integer r0 = X.C02990Ge.A03
            long r0 = X.AnonymousClass0QB.A05(r7, r0)
            X.09Y r14 = new X.09Y
            r14.<init>(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.0JY r0 = new X.0JY
            r0.<init>(r14, r1)
            X.AnonymousClass0VR.A0U(r7)
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r1
        L_0x01a8:
            if (r9 == 0) goto L_0x01ac
            X.0tB r23 = X.AnonymousClass0GT.A00
        L_0x01ac:
            if (r2 == 0) goto L_0x010e
            java.lang.Object r8 = X.AnonymousClass002.A03(r7)
            X.AnonymousClass0VR.A0U(r7)
            X.0uI r8 = (X.C17210uI) r8
            goto L_0x010e
        L_0x01b9:
            r1 = r34 & r1
            if (r1 != 0) goto L_0x006d
            r1 = r22
            int r1 = X.AnonymousClass001.A0V(r7, r1)
            goto L_0x006c
        L_0x01c5:
            r1 = r6 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x003b
            int r1 = X.AnonymousClass001.A0i(r7, r10)
            r3 = r3 | r1
            goto L_0x003b
        L_0x01d0:
            r1 = r34 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0035
            r1 = r21
            int r1 = X.AnonymousClass001.A0R(r7, r1)
            r3 = r3 | r1
            goto L_0x0035
        L_0x01dd:
            r1 = r34 & 14
            if (r1 != 0) goto L_0x01ed
            boolean r1 = r7.BEh(r13)
            int r3 = X.AnonymousClass000.A09(r1)
            r3 = r3 | r34
            goto L_0x002f
        L_0x01ed:
            r3 = r6
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04440Nk.A01(X.0JY, X.0uI, X.0tB, X.0Ip, X.0NL, X.0tn, X.0tj, X.0s9, X.0vk, X.1nB, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r9 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r7.BEf(r11) == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass0JY r24, X.C17210uI r25, X.AnonymousClass0tB r26, X.AnonymousClass0Ip r27, X.AnonymousClass0NL r28, X.C17130tn r29, X.C17090tj r30, X.C16370s9 r31, X.C18090vk r32, X.C36001nB r33, int r34, int r35, boolean r36) {
        /*
            r8 = r25
            r23 = r26
            r22 = r28
            r11 = r27
            r12 = r31
            r3 = r36
            r13 = r30
            r2 = 0
            r10 = r32
            X.C18070vi.A0d(r10, r2)
            r0 = 9
            r6 = r33
            X.C18070vi.A0d(r6, r0)
            r0 = -2106428362(0xffffffff82727436, float:-1.7812703E-37)
            r7 = r29
            r7.COC(r0)
            r4 = r35
            r0 = r35 & 1
            r5 = r34
            if (r0 == 0) goto L_0x01bb
            r1 = r34 | 6
        L_0x002d:
            r21 = r35 & 2
            if (r21 == 0) goto L_0x01b0
            r1 = r1 | 48
        L_0x0033:
            r20 = r35 & 4
            if (r20 == 0) goto L_0x01a5
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0039:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004c
            r0 = r35 & 8
            if (r0 != 0) goto L_0x0049
            boolean r9 = r7.BEf(r12)
            r0 = 2048(0x800, float:2.87E-42)
            if (r9 != 0) goto L_0x004b
        L_0x0049:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x004b:
            r1 = r1 | r0
        L_0x004c:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r34 & r0
            if (r0 != 0) goto L_0x0062
            r0 = r35 & 16
            if (r0 != 0) goto L_0x005f
            boolean r9 = r7.BEf(r11)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x0061
        L_0x005f:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0061:
            r1 = r1 | r0
        L_0x0062:
            r19 = r35 & 32
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r19 == 0) goto L_0x0199
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x006a:
            r1 = r1 | r0
        L_0x006b:
            r18 = r35 & 64
            r0 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x018d
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0073:
            r1 = r1 | r0
        L_0x0074:
            r9 = r4 & 128(0x80, float:1.794E-43)
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 != 0) goto L_0x0086
            r0 = r34 & r14
            if (r0 != 0) goto L_0x0087
            r0 = r23
            int r0 = X.AnonymousClass001.A0X(r7, r0)
        L_0x0086:
            r1 = r1 | r0
        L_0x0087:
            r0 = r4 & 256(0x100, float:3.59E-43)
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 != 0) goto L_0x0097
            r14 = r34 & r17
            if (r14 != 0) goto L_0x0098
            int r14 = X.AnonymousClass001.A0Y(r7, r8)
        L_0x0097:
            r1 = r1 | r14
        L_0x0098:
            r15 = r4 & 512(0x200, float:7.175E-43)
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = 805306368(0x30000000, float:4.656613E-10)
            if (r15 != 0) goto L_0x00a8
            r14 = r34 & r16
            if (r14 != 0) goto L_0x00a9
            int r14 = X.AnonymousClass001.A0h(r7, r6)
        L_0x00a8:
            r1 = r1 | r14
        L_0x00a9:
            r15 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r15 = r15 & r1
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r14) goto L_0x00e3
            boolean r14 = r7.BZO()
            if (r14 == 0) goto L_0x00e3
            r7.CNR()
        L_0x00bb:
            X.0Vf r1 = r7.BKF()
            if (r1 == 0) goto L_0x00e2
            X.0o0 r0 = new X.0o0
            r14 = r0
            r15 = r24
            r16 = r8
            r17 = r23
            r18 = r11
            r19 = r22
            r20 = r13
            r21 = r12
            r22 = r10
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A03(r0)
        L_0x00e2:
            return
        L_0x00e3:
            r7.CNl()
            r14 = r34 & 1
            if (r14 == 0) goto L_0x0130
            boolean r14 = r7.BQS()
            if (r14 != 0) goto L_0x0130
            r7.CNR()
            r0 = r35 & 8
            if (r0 == 0) goto L_0x00f9
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f9:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x0101
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r0
        L_0x0101:
            r7.BKA()
            r0 = r1 & 14
            int r0 = X.AnonymousClass001.A0F(r1, r0)
            int r34 = X.AnonymousClass001.A0G(r1, r0)
            r0 = r1 & r17
            r34 = r34 | r0
            r1 = r1 & r16
            r34 = r34 | r1
            r29 = r7
            r30 = r13
            r31 = r12
            r32 = r10
            r33 = r6
            r35 = r2
            r36 = r3
            r25 = r8
            r26 = r23
            r27 = r11
            r28 = r22
            A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x00bb
        L_0x0130:
            if (r21 == 0) goto L_0x0134
            X.0WC r13 = X.C17090tj.A00
        L_0x0134:
            if (r20 == 0) goto L_0x0137
            r3 = 1
        L_0x0137:
            r14 = r35 & 8
            if (r14 == 0) goto L_0x014c
            r12 = -349121587(0xffffffffeb30d3cd, float:-2.1377115E26)
            r7.COB(r12)
            java.lang.Integer r12 = X.C02960Gb.A00
            X.0WV r12 = X.C04570Nx.A01(r7, r12)
            X.AnonymousClass0VR.A0U(r7)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x014c:
            r14 = r35 & 16
            if (r14 == 0) goto L_0x0174
            r11 = -1402274782(0xffffffffac6afc22, float:-3.3393362E-12)
            r7.COB(r11)
            long r26 = X.C05100Qk.A04
            java.lang.Integer r11 = X.C02960Gb.A02
            long r28 = X.AnonymousClass0QB.A05(r7, r11)
            java.lang.Integer r11 = X.C02960Gb.A01
            long r32 = X.AnonymousClass001.A0w(r7, r11)
            X.0Ip r11 = new X.0Ip
            r25 = r11
            r30 = r26
            r25.<init>(r26, r28, r30, r32)
            X.AnonymousClass0VR.A0U(r7)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r14
        L_0x0174:
            if (r19 == 0) goto L_0x0178
            r22 = 0
        L_0x0178:
            if (r18 == 0) goto L_0x017c
            r24 = 0
        L_0x017c:
            if (r9 == 0) goto L_0x0180
            X.0tB r23 = X.AnonymousClass0GT.A01
        L_0x0180:
            if (r0 == 0) goto L_0x0101
            java.lang.Object r8 = X.AnonymousClass002.A03(r7)
            X.AnonymousClass0VR.A0U(r7)
            X.0uI r8 = (X.C17210uI) r8
            goto L_0x0101
        L_0x018d:
            r0 = r34 & r0
            if (r0 != 0) goto L_0x0074
            r0 = r24
            int r0 = X.AnonymousClass001.A0W(r7, r0)
            goto L_0x0073
        L_0x0199:
            r0 = r34 & r0
            if (r0 != 0) goto L_0x006b
            r0 = r22
            int r0 = X.AnonymousClass001.A0V(r7, r0)
            goto L_0x006a
        L_0x01a5:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0039
            int r0 = X.AnonymousClass001.A0i(r7, r3)
            r1 = r1 | r0
            goto L_0x0039
        L_0x01b0:
            r0 = r34 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0033
            int r0 = X.AnonymousClass001.A0R(r7, r13)
            r1 = r1 | r0
            goto L_0x0033
        L_0x01bb:
            r0 = r34 & 14
            if (r0 != 0) goto L_0x01cb
            boolean r0 = r7.BEh(r10)
            int r1 = X.AnonymousClass000.A09(r0)
            r1 = r1 | r34
            goto L_0x002d
        L_0x01cb:
            r1 = r5
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04440Nk.A02(X.0JY, X.0uI, X.0tB, X.0Ip, X.0NL, X.0tn, X.0tj, X.0s9, X.0vk, X.1nB, int, int, boolean):void");
    }
}
