package X;

/* renamed from: X.A6x  reason: case insensitive filesystem */
public abstract class C20094A6x {
    public static final int[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0208, code lost:
        if (r9.charAt(r3) != 13) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020a, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020c, code lost:
        if (r0 >= r8) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0212, code lost:
        if (r9.charAt(r0) != 10) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        r3 = r3 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021c, code lost:
        if (r9.charAt(r3) == 10) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021e, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Expected a new line at index ");
        r1.append(r3);
        r1.append(", but was ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023c, code lost:
        throw new java.lang.NumberFormatException(X.C17890vO.A0c(r1, r9.charAt(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x023d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0243, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0244, code lost:
        if (r12 != 0) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0248, code lost:
        if (r1 >= r12) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x024e, code lost:
        if (A02("  ", r9, r1, r3, r13) != false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0250, code lost:
        A01(r9, "  ", "group separator", r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0257, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025a, code lost:
        r3 = r3 + r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A03(java.lang.String r21, X.C199329zo r22) {
        /*
            r1 = 1
            r0 = r22
            X.C18070vi.A0d(r0, r1)
            r9 = r21
            int r8 = r9.length()
            r10 = 0
            X.C29761cp.A01(r8, r8)
            if (r10 != r8) goto L_0x0015
            byte[] r2 = new byte[r10]
        L_0x0014:
            return r2
        L_0x0015:
            X.A0j r12 = r0.A00
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x007f
            java.lang.String r7 = ""
            int r6 = r7.length()
            r11 = 1
            if (r6 > r1) goto L_0x027e
            r5 = 2
            r3 = 0
            if (r6 != 0) goto L_0x003d
            r0 = r8 & 1
            if (r0 != 0) goto L_0x0107
            int r8 = r8 >> r1
            byte[] r2 = new byte[r8]
            r1 = 0
        L_0x0030:
            if (r3 >= r8) goto L_0x0014
            byte r0 = A00(r9, r1)
            r2[r3] = r0
            int r1 = r1 + 2
            int r3 = r3 + 1
            goto L_0x0030
        L_0x003d:
            int r0 = r8 % 3
            if (r0 != r5) goto L_0x0107
            int r0 = r8 / 3
            int r4 = r0 + 1
            byte[] r2 = new byte[r4]
            char r3 = r7.charAt(r10)
            byte r0 = A00(r9, r10)
            r2[r10] = r0
        L_0x0051:
            if (r11 >= r4) goto L_0x0014
            char r0 = r9.charAt(r5)
            if (r0 == r3) goto L_0x0072
            boolean r13 = r12.A00
            if (r10 >= r6) goto L_0x0072
            char r1 = r7.charAt(r10)
            char r0 = r9.charAt(r5)
            boolean r0 = X.AnonymousClass3JC.A01(r1, r0, r13)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "byte separator"
            A01(r9, r7, r0, r5, r8)
            r0 = 0
            throw r0
        L_0x0072:
            int r0 = r5 + 1
            byte r0 = A00(r9, r0)
            r2[r11] = r0
            int r5 = r5 + 3
            int r11 = r11 + 1
            goto L_0x0051
        L_0x007f:
            r13 = 0
            java.lang.String r7 = ""
            int r6 = r7.length()
            long r2 = (long) r6
            r0 = 2
            long r14 = r2 + r0
            long r14 = r14 + r2
            long r14 = r14 + r2
            long r4 = (long) r8
            long r0 = r2 + r4
            long r0 = r0 / r14
            int r11 = (int) r0
            long r0 = (long) r11
            long r0 = r0 * r14
            long r0 = r0 - r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0107
            boolean r5 = r12.A00
            byte[] r2 = new byte[r11]
            r4 = 0
            if (r6 == 0) goto L_0x00bc
            r3 = 0
        L_0x00a1:
            if (r3 >= r6) goto L_0x00bb
            char r1 = r7.charAt(r3)
            char r0 = r9.charAt(r3)
            boolean r0 = X.AnonymousClass3JC.A01(r1, r0, r5)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "byte prefix"
            A01(r9, r7, r0, r10, r8)
        L_0x00b6:
            r0 = 0
            throw r0
        L_0x00b8:
            int r3 = r3 + 1
            goto L_0x00a1
        L_0x00bb:
            r13 = r6
        L_0x00bc:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r7)
            r0.append(r7)
            java.lang.String r12 = X.AnonymousClass000.A0y(r7, r0)
            int r11 = r11 + -1
        L_0x00c9:
            byte r0 = A00(r9, r13)
            if (r10 >= r11) goto L_0x00ef
            r2[r10] = r0
            int r13 = r13 + 2
            int r3 = r12.length()
            if (r3 == 0) goto L_0x00ec
            r1 = 0
        L_0x00da:
            if (r1 >= r3) goto L_0x00eb
            boolean r0 = A02(r12, r9, r1, r13, r5)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "byte suffix + byte separator + byte prefix"
            A01(r9, r12, r0, r13, r8)
            goto L_0x00b6
        L_0x00e8:
            int r1 = r1 + 1
            goto L_0x00da
        L_0x00eb:
            int r13 = r13 + r3
        L_0x00ec:
            int r10 = r10 + 1
            goto L_0x00c9
        L_0x00ef:
            r2[r11] = r0
            int r1 = r13 + 2
            if (r6 != 0) goto L_0x00f6
            return r2
        L_0x00f6:
            if (r4 >= r6) goto L_0x0014
            boolean r0 = A02(r7, r9, r4, r1, r5)
            if (r0 != 0) goto L_0x0104
            java.lang.String r0 = "byte suffix"
            A01(r9, r7, r0, r1, r8)
            goto L_0x00b6
        L_0x0104:
            int r4 = r4 + 1
            goto L_0x00f6
        L_0x0107:
            java.lang.String r14 = "  "
            boolean r13 = r12.A00
            int r12 = r14.length()
            if (r8 <= 0) goto L_0x0285
            long r4 = (long) r6
            r0 = 2
            long r21 = r4 + r0
            long r21 = r21 + r4
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r19 = r21 * r0
            r2 = 2147483646(0x7ffffffe, double:1.0609978945E-314)
            long r0 = r4 * r2
            long r19 = r19 + r0
            long r2 = (long) r8
            r0 = 0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0136
            int r10 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0136
            r15 = 1
            long r0 = r2 + r15
            long r10 = r19 + r15
            long r0 = r0 / r10
        L_0x0136:
            r15 = 1
            long r10 = r19 + r15
            long r10 = r10 * r0
            long r2 = r2 - r10
            r17 = 0
            int r10 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r10 <= 0) goto L_0x014d
            int r10 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r10 <= 0) goto L_0x014d
            long r10 = (long) r12
            long r17 = r2 + r10
            long r15 = r19 + r10
            long r17 = r17 / r15
        L_0x014d:
            long r10 = (long) r12
            long r19 = r19 + r10
            long r19 = r19 * r17
            long r2 = r2 - r19
            r15 = 0
            int r10 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0163
            int r10 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0163
            long r15 = r2 + r4
            long r10 = r21 + r4
            long r15 = r15 / r10
        L_0x0163:
            long r21 = r21 + r4
            long r21 = r21 * r15
            long r2 = r2 - r21
            r10 = 0
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r4)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 * r2
            long r17 = r17 * r2
            long r0 = r0 + r17
            long r0 = r0 + r15
            long r2 = (long) r4
            long r0 = r0 + r2
            int r4 = (int) r0
            byte[] r2 = new byte[r4]
            r3 = 0
            r15 = 0
        L_0x0181:
            r5 = 0
        L_0x0182:
            r10 = 0
        L_0x0183:
            int r5 = r5 + 1
            int r10 = r10 + 1
            if (r6 == 0) goto L_0x019d
            r1 = 0
        L_0x018a:
            if (r1 >= r6) goto L_0x019c
            boolean r0 = A02(r7, r9, r1, r3, r13)
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = "byte prefix"
        L_0x0194:
            A01(r9, r7, r0, r3, r8)
        L_0x0197:
            r0 = 0
            throw r0
        L_0x0199:
            int r1 = r1 + 1
            goto L_0x018a
        L_0x019c:
            int r3 = r3 + r6
        L_0x019d:
            int r0 = r8 + -2
            if (r0 >= r3) goto L_0x01dc
            r5 = 2
            java.lang.String r4 = "exactly"
            java.lang.String r2 = r9.substring(r3, r8)
            java.lang.StringBuilder r1 = X.C108955ca.A15(r2)
            java.lang.String r0 = "Expected "
            r1.append(r0)
            r1.append(r4)
            r0 = 32
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " hexadecimal digits at index "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", but was "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " of length "
            r1.append(r0)
            int r8 = r8 - r3
            java.lang.String r1 = X.C17880vN.A0t(r1, r8)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x01dc:
            int r11 = r15 + 1
            byte r0 = A00(r9, r3)
            r2[r15] = r0
            int r3 = r3 + 2
            if (r6 == 0) goto L_0x01f8
            r1 = 0
        L_0x01e9:
            if (r1 >= r6) goto L_0x01f7
            boolean r0 = A02(r7, r9, r1, r3, r13)
            if (r0 != 0) goto L_0x01f4
            java.lang.String r0 = "byte suffix"
            goto L_0x0194
        L_0x01f4:
            int r1 = r1 + 1
            goto L_0x01e9
        L_0x01f7:
            int r3 = r3 + r6
        L_0x01f8:
            r15 = r11
            if (r3 >= r8) goto L_0x0274
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r0) goto L_0x0241
            char r5 = r9.charAt(r3)
            r0 = 13
            r1 = 10
            if (r5 != r0) goto L_0x0218
            int r0 = r3 + 1
            if (r0 >= r8) goto L_0x023d
            char r0 = r9.charAt(r0)
            if (r0 != r1) goto L_0x023d
            int r3 = r3 + 2
            goto L_0x0181
        L_0x0218:
            char r0 = r9.charAt(r3)
            if (r0 == r1) goto L_0x023d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected a new line at index "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", but was "
            r1.append(r0)
            char r0 = r9.charAt(r3)
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x023d:
            int r3 = r3 + 1
            goto L_0x0181
        L_0x0241:
            if (r10 != r0) goto L_0x025d
            r1 = 0
            if (r12 != 0) goto L_0x0248
            goto L_0x0182
        L_0x0248:
            if (r1 >= r12) goto L_0x025a
            boolean r0 = A02(r14, r9, r1, r3, r13)
            if (r0 != 0) goto L_0x0257
            java.lang.String r0 = "group separator"
            A01(r9, r14, r0, r3, r8)
            goto L_0x0197
        L_0x0257:
            int r1 = r1 + 1
            goto L_0x0248
        L_0x025a:
            int r3 = r3 + r12
            goto L_0x0182
        L_0x025d:
            if (r10 == 0) goto L_0x0183
            if (r6 == 0) goto L_0x0183
            r1 = 0
        L_0x0262:
            if (r1 >= r6) goto L_0x0271
            boolean r0 = A02(r7, r9, r1, r3, r13)
            if (r0 != 0) goto L_0x026e
            java.lang.String r0 = "byte separator"
            goto L_0x0194
        L_0x026e:
            int r1 = r1 + 1
            goto L_0x0262
        L_0x0271:
            int r3 = r3 + r6
            goto L_0x0183
        L_0x0274:
            if (r11 == r4) goto L_0x0014
            byte[] r2 = java.util.Arrays.copyOf(r2, r11)
            X.C18070vi.A0X(r2)
            return r2
        L_0x027e:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0285:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20094A6x.A03(java.lang.String, X.9zo):byte[]");
    }

    static {
        int length;
        int length2;
        for (int i = 0; i < 256; i++) {
            "0123456789abcdef".charAt(i >> 4);
            "0123456789abcdef".charAt(i & 15);
        }
        for (int i2 = 0; i2 < 256; i2++) {
            "0123456789ABCDEF".charAt(i2 >> 4);
            "0123456789ABCDEF".charAt(i2 & 15);
        }
        int[] iArr = new int[256];
        int i3 = 0;
        do {
            iArr[i3] = -1;
            i3++;
        } while (i3 < 256);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = "0123456789abcdef".length();
            if (i4 >= length) {
                break;
            }
            iArr["0123456789abcdef".charAt(i4)] = i5;
            i4++;
            i5++;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length2 = "0123456789ABCDEF".length();
            if (i6 >= length2) {
                break;
            }
            iArr["0123456789ABCDEF".charAt(i6)] = i7;
            i6++;
            i7++;
        }
        A00 = iArr;
        int i8 = 0;
        do {
            i8++;
        } while (i8 < 256);
        for (int i9 = 0; i9 < length; i9++) {
            "0123456789abcdef".charAt(i9);
        }
        for (int i10 = 0; i10 < length2; i10++) {
            "0123456789ABCDEF".charAt(i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte A00(java.lang.String r4, int r5) {
        /*
            char r1 = r4.charAt(r5)
            int r0 = r1 >>> 8
            if (r0 != 0) goto L_0x0021
            int[] r3 = A00
            r2 = r3[r1]
            if (r2 < 0) goto L_0x0021
            int r5 = r5 + 1
            char r1 = r4.charAt(r5)
            int r0 = r1 >>> 8
            if (r0 != 0) goto L_0x0021
            r1 = r3[r1]
            if (r1 < 0) goto L_0x0021
            int r0 = r2 << 4
            r0 = r0 | r1
            byte r0 = (byte) r0
            return r0
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected a hexadecimal digit at index "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", but was "
            r1.append(r0)
            char r0 = r4.charAt(r5)
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20094A6x.A00(java.lang.String, int):byte");
    }

    public static final void A01(String str, String str2, String str3, int i, int i2) {
        int length = str2.length() + i;
        if (length > i2) {
            length = i2;
        }
        String substring = str.substring(i, length);
        StringBuilder A15 = C108955ca.A15(substring);
        A15.append("Expected ");
        A15.append(str3);
        A15.append(" \"");
        A15.append(str2);
        A15.append("\" at index ");
        A15.append(i);
        throw new NumberFormatException(AnonymousClass001.A1H(", but was ", substring, A15));
    }

    public static boolean A02(String str, String str2, int i, int i2, boolean z) {
        return AnonymousClass3JC.A01(str.charAt(i), str2.charAt(i2 + i), z);
    }
}
