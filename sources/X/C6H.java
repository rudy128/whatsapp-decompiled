package X;

public abstract class C6H {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r10 < 2048) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0156, code lost:
        if (r3 < 2048) goto L_0x0158;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[LOOP:1: B:15:0x003a->B:21:0x004c, LOOP_START, PHI: r1 r6 r13 
      PHI: (r1v20 char) = (r1v19 char), (r1v28 char) binds: [B:12:0x0036, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v3 long) = (r6v2 long), (r6v15 long) binds: [B:12:0x0036, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:12:0x0036, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.CharSequence r20, byte[] r21, int r22, int r23) {
        /*
            r19 = this;
            r10 = r23
            r2 = r22
            r0 = r19
            boolean r0 = r0 instanceof X.C23492Bhw
            r8 = r20
            r9 = r21
            if (r0 == 0) goto L_0x011e
            long r6 = (long) r2
            long r4 = (long) r10
            long r4 = r4 + r6
            int r11 = r8.length()
            java.lang.String r12 = " at index "
            if (r11 > r10) goto L_0x010b
            int r0 = r9.length
            int r0 = r0 - r23
            if (r0 < r2) goto L_0x010b
            r13 = 0
        L_0x001f:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r13 >= r11) goto L_0x0036
            char r0 = r8.charAt(r13)
            if (r0 >= r1) goto L_0x0036
            long r17 = r17 + r6
            byte r0 = (byte) r0
            X.C26277CwW.A08(r9, r6, r0)
            int r13 = r13 + 1
            r6 = r17
            goto L_0x001f
        L_0x0036:
            if (r13 != r11) goto L_0x003a
        L_0x0038:
            int r0 = (int) r6
            return r0
        L_0x003a:
            if (r13 >= r11) goto L_0x0038
            char r10 = r8.charAt(r13)
            if (r10 >= r1) goto L_0x0052
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            long r14 = r6 + r17
            byte r0 = (byte) r10
            X.C26277CwW.A08(r9, r6, r0)
        L_0x004c:
            int r13 = r13 + 1
            r1 = 128(0x80, float:1.794E-43)
            r6 = r14
            goto L_0x003a
        L_0x0052:
            r0 = 2048(0x800, float:2.87E-42)
            if (r10 >= r0) goto L_0x0074
        L_0x0056:
            r14 = 2
            long r1 = r4 - r14
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            long r0 = r6 + r17
            int r2 = r10 >>> 6
            r2 = r2 | 960(0x3c0, float:1.345E-42)
            byte r2 = (byte) r2
            X.C26277CwW.A08(r9, r6, r2)
            long r14 = r0 + r17
            r3 = r10 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0070:
            X.C26277CwW.A08(r9, r0, r2)
            goto L_0x004c
        L_0x0074:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r3) goto L_0x007e
            if (r14 >= r10) goto L_0x00a4
        L_0x007e:
            r15 = 3
            long r1 = r4 - r15
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
            long r2 = r6 + r17
            int r0 = r10 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            X.C26277CwW.A08(r9, r6, r0)
            long r0 = r2 + r17
            int r6 = r10 >>> 6
            r6 = r6 & 63
            r7 = 128(0x80, float:1.794E-43)
        L_0x0098:
            r6 = r6 | r7
            byte r6 = (byte) r6
            X.C26277CwW.A08(r9, r2, r6)
            long r14 = r0 + r17
            r2 = r10 & 63
            r2 = r2 | r7
            byte r2 = (byte) r2
            goto L_0x0070
        L_0x00a4:
            r15 = 4
            long r1 = r4 - r15
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00e7
            int r0 = r13 + 1
            if (r0 == r11) goto L_0x00df
            int r13 = r13 + 1
            char r1 = r8.charAt(r13)
            boolean r0 = java.lang.Character.isSurrogatePair(r10, r1)
            if (r0 == 0) goto L_0x00df
            int r10 = java.lang.Character.toCodePoint(r10, r1)
            long r0 = r6 + r17
            int r2 = r10 >>> 18
            r2 = r2 | 240(0xf0, float:3.36E-43)
            byte r2 = (byte) r2
            X.C26277CwW.A08(r9, r6, r2)
            long r2 = r0 + r17
            int r6 = r10 >>> 12
            r6 = r6 & 63
            r7 = 128(0x80, float:1.794E-43)
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            X.C26277CwW.A08(r9, r0, r6)
            long r0 = r2 + r17
            int r6 = r10 >>> 6
            r6 = r6 & 63
            goto L_0x0098
        L_0x00df:
            int r0 = r13 + -1
            X.C2e r1 = new X.C2e
            r1.<init>(r0, r11)
            throw r1
        L_0x00e7:
            if (r3 > r10) goto L_0x00fb
            if (r10 > r14) goto L_0x00fb
            int r0 = r13 + 1
            if (r0 == r11) goto L_0x00f5
            boolean r0 = X.BE8.A1X(r8, r10, r0)
            if (r0 != 0) goto L_0x00fb
        L_0x00f5:
            X.C2e r1 = new X.C2e
            r1.<init>(r13, r11)
            throw r1
        L_0x00fb:
            r0 = 46
            java.lang.StringBuilder r0 = X.BE9.A0s(r0, r10)
            java.lang.String r0 = X.C17890vO.A0a(r12, r0, r6)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x010b:
            int r0 = r11 + -1
            char r1 = r8.charAt(r0)
            int r2 = r22 + r23
            r0 = 37
            java.lang.StringBuilder r0 = X.BE9.A0s(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r1 = X.BEA.A0Z(r12, r0, r2)
            throw r1
        L_0x011e:
            int r4 = r8.length()
            int r10 = r23 + r22
            r5 = 0
        L_0x0125:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r4) goto L_0x013a
            int r0 = r5 + r22
            if (r0 >= r10) goto L_0x013a
            char r1 = r8.charAt(r5)
            if (r1 >= r6) goto L_0x013a
            int r0 = r22 + r5
            int r5 = X.BE6.A0A(r1, r9, r0, r5)
            goto L_0x0125
        L_0x013a:
            if (r5 != r4) goto L_0x013f
            int r2 = r22 + r4
        L_0x013e:
            return r2
        L_0x013f:
            int r2 = r22 + r5
        L_0x0141:
            if (r5 >= r4) goto L_0x013e
            char r3 = r8.charAt(r5)
            if (r3 >= r6) goto L_0x0154
            if (r2 >= r10) goto L_0x0158
            int r1 = r2 + 1
        L_0x014d:
            byte r0 = (byte) r3
            r21[r2] = r0
            r2 = r1
        L_0x0151:
            int r5 = r5 + 1
            goto L_0x0141
        L_0x0154:
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L_0x016a
        L_0x0158:
            int r0 = r10 + -2
            if (r2 > r0) goto L_0x016a
            int r1 = r2 + 1
            int r0 = r3 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
        L_0x0162:
            int r2 = X.BE6.A0A(r0, r9, r2, r1)
            X.BE7.A1U(r9, r3, r1)
            goto L_0x0151
        L_0x016a:
            r7 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x0174
            if (r7 >= r3) goto L_0x018d
        L_0x0174:
            int r0 = r10 + -3
            if (r2 > r0) goto L_0x018d
            int r1 = r2 + 1
            int r0 = r3 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            int r2 = X.BE6.A0A(r0, r9, r2, r1)
            int r0 = r3 >>> 6
            X.BE7.A1U(r9, r0, r1)
            int r1 = r2 + 1
            r3 = r3 & 63
            r3 = r3 | r6
            goto L_0x014d
        L_0x018d:
            int r0 = r10 + -4
            if (r2 > r0) goto L_0x01c8
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01c0
            int r5 = r5 + 1
            char r1 = r8.charAt(r5)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r0 == 0) goto L_0x01c0
            int r3 = java.lang.Character.toCodePoint(r3, r1)
            int r1 = r2 + 1
            int r0 = r3 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            int r2 = X.BE6.A0A(r0, r9, r2, r1)
            int r0 = r3 >>> 12
            X.BE7.A1U(r9, r0, r1)
            int r1 = r2 + 1
            int r0 = r3 >>> 6
            r0 = r0 & 63
            r0 = r0 | r6
            goto L_0x0162
        L_0x01c0:
            int r0 = r5 + -1
            X.C2e r1 = new X.C2e
            r1.<init>(r0, r4)
            throw r1
        L_0x01c8:
            if (r1 > r3) goto L_0x01e0
            if (r3 > r7) goto L_0x01e0
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01da
            boolean r0 = X.BE8.A1X(r8, r3, r1)
            if (r0 != 0) goto L_0x01e0
        L_0x01da:
            X.C2e r1 = new X.C2e
            r1.<init>(r5, r4)
            throw r1
        L_0x01e0:
            r0 = 37
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r1 = X.BEA.A0Z(r0, r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6H.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014b, code lost:
        r0 = X.C25406Cf8.A00;
        r5 = r14[r7 - 1];
        r4 = r16 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0153, code lost:
        if (r4 == 0) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0156, code lost:
        if (r4 == 1) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0159, code lost:
        if (r4 != 2) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015b, code lost:
        r2 = r14[r7];
        r1 = r14[r7 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0163, code lost:
        if (r5 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0165, code lost:
        if (r2 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0167, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0169, code lost:
        r5 = r5 ^ (r2 << 8);
        r0 = r1 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016f, code lost:
        return r5 ^ r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0170, code lost:
        r1 = r14[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0174, code lost:
        if (r5 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0176, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0178, code lost:
        r0 = r1 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x017d, code lost:
        if (r5 <= -12) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0194, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            r4 = r16
            boolean r0 = r13 instanceof X.C23492Bhw
            if (r0 == 0) goto L_0x00f0
            r1 = r15 | r16
            int r2 = r14.length
            int r0 = r2 - r16
            r1 = r1 | r0
            r5 = 2
            r6 = 3
            r0 = 0
            if (r1 < 0) goto L_0x00de
            long r2 = (long) r15
            long r0 = (long) r4
            long r0 = r0 - r2
            int r4 = (int) r0
            r0 = 16
            r11 = 1
            if (r4 >= r0) goto L_0x00c6
            r9 = 0
        L_0x001c:
            int r4 = r4 - r9
            long r0 = (long) r9
            long r2 = r2 + r0
        L_0x001f:
            r9 = 0
        L_0x0020:
            if (r4 <= 0) goto L_0x002e
            long r0 = r2 + r11
            byte r9 = X.C26277CwW.A00(r14, r2)
            if (r9 < 0) goto L_0x0032
            int r4 = r4 + -1
            r2 = r0
            goto L_0x0020
        L_0x002e:
            if (r4 != 0) goto L_0x0033
            r9 = 0
        L_0x0031:
            return r9
        L_0x0032:
            r2 = r0
        L_0x0033:
            int r1 = r4 + -1
            r10 = -32
            r8 = -65
            if (r9 >= r10) goto L_0x004d
            if (r1 == 0) goto L_0x0031
            int r4 = r1 + -1
            r0 = -62
            if (r9 < r0) goto L_0x006b
        L_0x0043:
            long r9 = r2 + r11
            byte r0 = X.C26277CwW.A00(r14, r2)
            if (r0 > r8) goto L_0x006b
            r2 = r9
            goto L_0x001f
        L_0x004d:
            r0 = -16
            if (r9 >= r0) goto L_0x0074
            if (r1 < r5) goto L_0x008f
            int r4 = r1 + -2
            long r0 = r2 + r11
            byte r7 = X.C26277CwW.A00(r14, r2)
            if (r7 > r8) goto L_0x006b
            r3 = -96
            if (r9 != r10) goto L_0x006d
            if (r7 < r3) goto L_0x006b
        L_0x0063:
            long r2 = r0 + r11
            byte r0 = X.C26277CwW.A00(r14, r0)
            if (r0 <= r8) goto L_0x001f
        L_0x006b:
            r9 = -1
            return r9
        L_0x006d:
            r2 = -19
            if (r9 != r2) goto L_0x0063
            if (r7 >= r3) goto L_0x006b
            goto L_0x0063
        L_0x0074:
            if (r1 < r6) goto L_0x008f
            int r4 = r1 + -3
            long r0 = r2 + r11
            byte r2 = X.C26277CwW.A00(r14, r2)
            if (r2 > r8) goto L_0x006b
            int r2 = X.BE8.A05(r9, r2)
            if (r2 != 0) goto L_0x006b
            long r2 = r0 + r11
            byte r0 = X.C26277CwW.A00(r14, r0)
            if (r0 > r8) goto L_0x006b
            goto L_0x0043
        L_0x008f:
            if (r1 == 0) goto L_0x00bf
            r0 = 1
            if (r1 == r0) goto L_0x00b0
            if (r1 != r5) goto L_0x00d8
            byte r4 = X.C26277CwW.A00(r14, r2)
            long r2 = r2 + r11
            byte r1 = X.C26277CwW.A00(r14, r2)
            X.C6H r0 = X.C25406Cf8.A00
            r0 = -12
            if (r9 > r0) goto L_0x006b
            if (r4 > r8) goto L_0x006b
            if (r1 > r8) goto L_0x006b
            int r0 = r4 << 8
            r9 = r9 ^ r0
            int r0 = r1 << 16
        L_0x00ae:
            r9 = r9 ^ r0
            return r9
        L_0x00b0:
            byte r1 = X.C26277CwW.A00(r14, r2)
            X.C6H r0 = X.C25406Cf8.A00
            r0 = -12
            if (r9 > r0) goto L_0x006b
            if (r1 > r8) goto L_0x006b
            int r0 = r1 << 8
            goto L_0x00ae
        L_0x00bf:
            X.C6H r0 = X.C25406Cf8.A00
            r0 = -12
            if (r9 <= r0) goto L_0x0031
            goto L_0x006b
        L_0x00c6:
            r0 = r2
            r9 = 0
        L_0x00c8:
            long r7 = r0 + r11
            byte r0 = X.C26277CwW.A00(r14, r0)
            if (r0 < 0) goto L_0x001c
            int r9 = r9 + 1
            r0 = r7
            if (r9 < r4) goto L_0x00c8
            r9 = r4
            goto L_0x001c
        L_0x00d8:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00de:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.C17880vN.A1T(r1, r2, r0)
            X.AnonymousClass000.A1M(r1, r15)
            X.C17880vN.A1T(r1, r4, r5)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BE8.A0U(r0, r1)
            throw r0
        L_0x00f0:
            if (r15 >= r4) goto L_0x00f9
            byte r0 = r14[r15]
            if (r0 < 0) goto L_0x00f9
            int r15 = r15 + 1
            goto L_0x00f0
        L_0x00f9:
            r5 = 0
            if (r15 < r4) goto L_0x00fd
        L_0x00fc:
            return r5
        L_0x00fd:
            if (r15 >= r4) goto L_0x00fc
            int r7 = r15 + 1
            byte r8 = r14[r15]
            if (r8 >= 0) goto L_0x018c
            r9 = -32
            r6 = -65
            if (r8 >= r9) goto L_0x010e
            if (r7 < r4) goto L_0x0180
            return r8
        L_0x010e:
            r0 = -16
            if (r8 >= r0) goto L_0x012e
            int r0 = r16 + -1
            if (r7 >= r0) goto L_0x014b
            int r3 = r7 + 1
            byte r2 = r14[r7]
            if (r2 > r6) goto L_0x018a
            r1 = -96
            if (r8 != r9) goto L_0x0127
            if (r2 < r1) goto L_0x018a
        L_0x0122:
            int r15 = r3 + 1
            byte r0 = r14[r3]
            goto L_0x0188
        L_0x0127:
            r0 = -19
            if (r8 != r0) goto L_0x0122
            if (r2 >= r1) goto L_0x018a
            goto L_0x0122
        L_0x012e:
            int r0 = r16 + -2
            if (r7 >= r0) goto L_0x014b
            int r2 = r7 + 1
            byte r0 = r14[r7]
            if (r0 > r6) goto L_0x018a
            int r0 = X.BE8.A05(r8, r0)
            if (r0 != 0) goto L_0x018a
            int r1 = r2 + 1
            byte r0 = r14[r2]
            if (r0 > r6) goto L_0x018a
            int r7 = r1 + 1
            byte r0 = r14[r1]
            if (r0 <= r6) goto L_0x018c
            goto L_0x018a
        L_0x014b:
            X.C6H r0 = X.C25406Cf8.A00
            int r0 = r7 + -1
            byte r5 = r14[r0]
            int r4 = r16 - r7
            if (r4 == 0) goto L_0x017b
            r0 = 1
            if (r4 == r0) goto L_0x0170
            r0 = 2
            if (r4 != r0) goto L_0x018f
            byte r2 = r14[r7]
            int r0 = r7 + 1
            byte r1 = r14[r0]
            r0 = -12
            if (r5 > r0) goto L_0x018a
            if (r2 > r6) goto L_0x018a
            if (r1 > r6) goto L_0x018a
            int r0 = r2 << 8
            r5 = r5 ^ r0
            int r0 = r1 << 16
        L_0x016e:
            r5 = r5 ^ r0
            return r5
        L_0x0170:
            byte r1 = r14[r7]
            r0 = -12
            if (r5 > r0) goto L_0x018a
            if (r1 > r6) goto L_0x018a
            int r0 = r1 << 8
            goto L_0x016e
        L_0x017b:
            r0 = -12
            if (r5 <= r0) goto L_0x00fc
            goto L_0x018a
        L_0x0180:
            r0 = -62
            if (r8 < r0) goto L_0x018a
            int r15 = r7 + 1
            byte r0 = r14[r7]
        L_0x0188:
            if (r0 <= r6) goto L_0x00fd
        L_0x018a:
            r5 = -1
            return r5
        L_0x018c:
            r15 = r7
            goto L_0x00fd
        L_0x018f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6H.A01(byte[], int, int):int");
    }
}
