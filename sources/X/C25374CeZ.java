package X;

/* renamed from: X.CeZ  reason: case insensitive filesystem */
public abstract class C25374CeZ {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        r17 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C26036Cqw r20, boolean r21) {
        /*
            r15 = 0
            r12 = r20
            long r7 = r12.A04
            r1 = 4096(0x1000, double:2.0237E-320)
            r19 = -1
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            r1 = r7
        L_0x0012:
            int r11 = (int) r1
            r0 = 64
            X.Cui r10 = new X.Cui
            r10.<init>(r0)
            r18 = 0
            r9 = 0
            r17 = 0
        L_0x001f:
            if (r9 >= r11) goto L_0x00e4
            r1 = 8
            r10.A0G(r1)
            byte[] r3 = r10.A02
            r0 = 1
            boolean r0 = r12.A04(r1, r0)
            if (r0 == 0) goto L_0x00e4
            byte[] r2 = r12.A03
            int r0 = r12.A01
            int r0 = r0 - r1
            java.lang.System.arraycopy(r2, r0, r3, r15, r1)
            long r2 = r10.A09()
            int r6 = r10.A03()
            r4 = 1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            byte[] r0 = r10.A02
            r12.A03(r0, r1, r1)
            r0 = 16
            r10.A0H(r0)
            long r2 = r10.A08()
            r1 = 16
        L_0x0055:
            long r4 = (long) r1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00ed
            int r9 = r9 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r6 != r0) goto L_0x006d
            int r0 = (int) r2
            int r11 = r11 + r0
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            long r0 = (long) r11
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x001f
            int r11 = (int) r7
            goto L_0x001f
        L_0x006d:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 == r0) goto L_0x00e2
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r6 == r0) goto L_0x00e2
            long r0 = (long) r9
            long r0 = r0 + r2
            long r0 = r0 - r4
            long r13 = (long) r11
            int r16 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x00e4
            long r2 = r2 - r4
            int r1 = (int) r2
            int r9 = r9 + r1
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r6 != r0) goto L_0x00c2
            r0 = 8
            if (r1 < r0) goto L_0x00ed
            r10.A0G(r1)
            byte[] r0 = r10.A02
            r12.A03(r0, r15, r1)
            int r6 = r1 / 4
            r5 = 0
        L_0x0096:
            if (r5 >= r6) goto L_0x00bf
            r0 = 1
            if (r5 != r0) goto L_0x00a2
            r0 = 4
            r10.A0J(r0)
        L_0x009f:
            int r5 = r5 + 1
            goto L_0x0096
        L_0x00a2:
            int r4 = r10.A03()
            int r1 = r4 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r1 == r0) goto L_0x00bb
            int[] r3 = A00
            r2 = 29
            r1 = 0
        L_0x00b2:
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00bb
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x009f
            goto L_0x00b2
        L_0x00bb:
            r17 = 1
            goto L_0x001f
        L_0x00bf:
            if (r17 != 0) goto L_0x001f
            return r18
        L_0x00c2:
            if (r1 == 0) goto L_0x001f
            r12.A04(r1, r15)
            goto L_0x001f
        L_0x00c9:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00de
            long r0 = r12.A02
            int r2 = r12.A01
            long r2 = (long) r2
            long r0 = r0 + r2
            long r4 = r7 - r0
            r2 = 8
            long r2 = r2 + r4
        L_0x00de:
            r1 = 8
            goto L_0x0055
        L_0x00e2:
            r0 = 1
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            if (r17 == 0) goto L_0x00ed
            r1 = r21
            if (r1 != r0) goto L_0x00ed
            r18 = 1
        L_0x00ed:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25374CeZ.A00(X.Cqw, boolean):boolean");
    }
}
