package X;

public abstract class C6G {
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
            boolean r0 = r0 instanceof X.C23320Bf8
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
            X.C26267CwC.A06(r9, r6, r0)
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
            X.C26267CwC.A06(r9, r6, r0)
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
            X.C26267CwC.A06(r9, r6, r2)
            long r14 = r0 + r17
            r3 = r10 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0070:
            X.C26267CwC.A06(r9, r0, r2)
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
            X.C26267CwC.A06(r9, r6, r0)
            long r0 = r2 + r17
            int r6 = r10 >>> 6
            r6 = r6 & 63
            r7 = 128(0x80, float:1.794E-43)
        L_0x0098:
            r6 = r6 | r7
            byte r6 = (byte) r6
            X.C26267CwC.A06(r9, r2, r6)
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
            X.C26267CwC.A06(r9, r6, r2)
            long r2 = r0 + r17
            int r6 = r10 >>> 12
            r6 = r6 & 63
            r7 = 128(0x80, float:1.794E-43)
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            X.C26267CwC.A06(r9, r0, r6)
            long r0 = r2 + r17
            int r6 = r10 >>> 6
            r6 = r6 & 63
            goto L_0x0098
        L_0x00df:
            int r0 = r13 + -1
            X.C2d r1 = new X.C2d
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
            X.C2d r1 = new X.C2d
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
            X.C2d r1 = new X.C2d
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
            X.C2d r1 = new X.C2d
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
        throw new UnsupportedOperationException("Method not decompiled: X.C6G.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x017b, code lost:
        r0 = X.C25908CoM.A00;
        r4 = r19[r7 - 1];
        r6 = r21 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0183, code lost:
        if (r6 == 0) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0186, code lost:
        if (r6 == 1) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0189, code lost:
        if (r6 != 2) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x018b, code lost:
        r2 = r19[r7];
        r1 = r19[r7 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0193, code lost:
        if (r4 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0195, code lost:
        if (r2 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0197, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0199, code lost:
        r4 = r4 ^ (r2 << 8);
        r0 = r1 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x019f, code lost:
        return r4 ^ r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a0, code lost:
        r1 = r19[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01a4, code lost:
        if (r4 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a6, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a8, code lost:
        r0 = r1 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ad, code lost:
        if (r4 <= -12) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c4, code lost:
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
    public int A01(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r6 = r21
            r9 = r20
            r0 = r18
            boolean r0 = r0 instanceof X.C23320Bf8
            r8 = r19
            if (r0 == 0) goto L_0x0120
            r1 = r20 | r21
            int r2 = r8.length
            int r0 = r2 - r21
            r1 = r1 | r0
            r10 = 2
            r11 = 3
            r0 = 0
            if (r1 < 0) goto L_0x010e
            long r4 = (long) r9
            long r0 = (long) r6
            long r0 = r0 - r4
            int r9 = (int) r0
            r0 = 16
            r16 = 1
            if (r9 >= r0) goto L_0x00f1
            r3 = 0
        L_0x0022:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x0025:
            r7 = 0
        L_0x0026:
            if (r9 <= 0) goto L_0x0039
            long r12 = r4 + r16
            X.CnI r2 = X.C26267CwC.A02
            long r0 = X.C26267CwC.A00
            long r0 = r0 + r4
            byte r7 = r2.A01(r8, r0)
            if (r7 < 0) goto L_0x003d
            int r9 = r9 + -1
            r4 = r12
            goto L_0x0026
        L_0x0039:
            if (r9 != 0) goto L_0x003e
            r7 = 0
        L_0x003c:
            return r7
        L_0x003d:
            r4 = r12
        L_0x003e:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            if (r7 >= r13) goto L_0x005d
            if (r1 == 0) goto L_0x003c
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x0082
        L_0x004e:
            long r12 = r4 + r16
            X.CnI r2 = X.C26267CwC.A02
            long r0 = X.C26267CwC.A00
            long r0 = r0 + r4
            byte r0 = r2.A01(r8, r0)
            if (r0 > r6) goto L_0x0082
            r4 = r12
            goto L_0x0025
        L_0x005d:
            r0 = -16
            if (r7 >= r0) goto L_0x008b
            if (r1 < r10) goto L_0x00ad
            int r9 = r1 + -2
            long r14 = r4 + r16
            X.CnI r12 = X.C26267CwC.A02
            long r2 = X.C26267CwC.A00
            long r0 = r2 + r4
            byte r4 = r12.A01(r8, r0)
            if (r4 > r6) goto L_0x0082
            r1 = -96
            if (r7 != r13) goto L_0x0084
            if (r4 < r1) goto L_0x0082
        L_0x0079:
            long r4 = r14 + r16
            long r2 = r2 + r14
            byte r0 = r12.A01(r8, r2)
            if (r0 <= r6) goto L_0x0025
        L_0x0082:
            r7 = -1
            return r7
        L_0x0084:
            r0 = -19
            if (r7 != r0) goto L_0x0079
            if (r4 >= r1) goto L_0x0082
            goto L_0x0079
        L_0x008b:
            if (r1 < r11) goto L_0x00ad
            int r9 = r1 + -3
            long r13 = r4 + r16
            X.CnI r12 = X.C26267CwC.A02
            long r2 = X.C26267CwC.A00
            long r0 = r2 + r4
            byte r0 = r12.A01(r8, r0)
            if (r0 > r6) goto L_0x0082
            int r0 = X.BE8.A05(r7, r0)
            if (r0 != 0) goto L_0x0082
            long r4 = r13 + r16
            long r2 = r2 + r13
            byte r0 = r12.A01(r8, r2)
            if (r0 > r6) goto L_0x0082
            goto L_0x004e
        L_0x00ad:
            if (r1 == 0) goto L_0x00ea
            r0 = 1
            if (r1 == r0) goto L_0x00d6
            if (r1 != r10) goto L_0x0108
            X.CnI r9 = X.C26267CwC.A02
            long r0 = X.C26267CwC.A00
            long r2 = r0 + r4
            byte r2 = r9.A01(r8, r2)
            long r4 = r4 + r16
            long r0 = r0 + r4
            byte r1 = r9.A01(r8, r0)
            X.C6G r0 = X.C25908CoM.A00
            r0 = -12
            if (r7 > r0) goto L_0x0082
            if (r2 > r6) goto L_0x0082
            if (r1 > r6) goto L_0x0082
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x00d4:
            r7 = r7 ^ r0
            return r7
        L_0x00d6:
            X.CnI r2 = X.C26267CwC.A02
            long r0 = X.C26267CwC.A00
            long r0 = r0 + r4
            byte r1 = r2.A01(r8, r0)
            X.C6G r0 = X.C25908CoM.A00
            r0 = -12
            if (r7 > r0) goto L_0x0082
            if (r1 > r6) goto L_0x0082
            int r0 = r1 << 8
            goto L_0x00d4
        L_0x00ea:
            X.C6G r0 = X.C25908CoM.A00
            r0 = -12
            if (r7 <= r0) goto L_0x003c
            goto L_0x0082
        L_0x00f1:
            r12 = r4
            r3 = 0
        L_0x00f3:
            long r6 = r12 + r16
            X.CnI r2 = X.C26267CwC.A02
            long r0 = X.C26267CwC.A00
            long r0 = r0 + r12
            byte r0 = r2.A01(r8, r0)
            if (r0 < 0) goto L_0x0022
            int r3 = r3 + 1
            r12 = r6
            if (r3 < r9) goto L_0x00f3
            r3 = r9
            goto L_0x0022
        L_0x0108:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x010e:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.C17880vN.A1T(r1, r2, r0)
            X.AnonymousClass000.A1M(r1, r9)
            X.C17880vN.A1T(r1, r6, r10)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BE8.A0U(r0, r1)
            throw r0
        L_0x0120:
            if (r9 >= r6) goto L_0x0129
            byte r0 = r19[r9]
            if (r0 < 0) goto L_0x0129
            int r9 = r9 + 1
            goto L_0x0120
        L_0x0129:
            r4 = 0
            if (r9 < r6) goto L_0x012d
        L_0x012c:
            return r4
        L_0x012d:
            if (r9 >= r6) goto L_0x012c
            int r7 = r9 + 1
            byte r9 = r19[r9]
            if (r9 >= 0) goto L_0x01bc
            r10 = -32
            r5 = -65
            if (r9 >= r10) goto L_0x013e
            if (r7 < r6) goto L_0x01b0
            return r9
        L_0x013e:
            r0 = -16
            if (r9 >= r0) goto L_0x015e
            int r0 = r21 + -1
            if (r7 >= r0) goto L_0x017b
            int r3 = r7 + 1
            byte r2 = r19[r7]
            if (r2 > r5) goto L_0x01ba
            r1 = -96
            if (r9 != r10) goto L_0x0157
            if (r2 < r1) goto L_0x01ba
        L_0x0152:
            int r9 = r3 + 1
            byte r0 = r19[r3]
            goto L_0x01b8
        L_0x0157:
            r0 = -19
            if (r9 != r0) goto L_0x0152
            if (r2 >= r1) goto L_0x01ba
            goto L_0x0152
        L_0x015e:
            int r0 = r21 + -2
            if (r7 >= r0) goto L_0x017b
            int r2 = r7 + 1
            byte r0 = r19[r7]
            if (r0 > r5) goto L_0x01ba
            int r0 = X.BE8.A05(r9, r0)
            if (r0 != 0) goto L_0x01ba
            int r1 = r2 + 1
            byte r0 = r19[r2]
            if (r0 > r5) goto L_0x01ba
            int r7 = r1 + 1
            byte r0 = r19[r1]
            if (r0 <= r5) goto L_0x01bc
            goto L_0x01ba
        L_0x017b:
            X.C6G r0 = X.C25908CoM.A00
            int r0 = r7 + -1
            byte r4 = r19[r0]
            int r6 = r21 - r7
            if (r6 == 0) goto L_0x01ab
            r0 = 1
            if (r6 == r0) goto L_0x01a0
            r0 = 2
            if (r6 != r0) goto L_0x01bf
            byte r2 = r19[r7]
            int r0 = r7 + 1
            byte r1 = r19[r0]
            r0 = -12
            if (r4 > r0) goto L_0x01ba
            if (r2 > r5) goto L_0x01ba
            if (r1 > r5) goto L_0x01ba
            int r0 = r2 << 8
            r4 = r4 ^ r0
            int r0 = r1 << 16
        L_0x019e:
            r4 = r4 ^ r0
            return r4
        L_0x01a0:
            byte r1 = r19[r7]
            r0 = -12
            if (r4 > r0) goto L_0x01ba
            if (r1 > r5) goto L_0x01ba
            int r0 = r1 << 8
            goto L_0x019e
        L_0x01ab:
            r0 = -12
            if (r4 <= r0) goto L_0x012c
            goto L_0x01ba
        L_0x01b0:
            r0 = -62
            if (r9 < r0) goto L_0x01ba
            int r9 = r7 + 1
            byte r0 = r19[r7]
        L_0x01b8:
            if (r0 <= r5) goto L_0x012d
        L_0x01ba:
            r4 = -1
            return r4
        L_0x01bc:
            r9 = r7
            goto L_0x012d
        L_0x01bf:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6G.A01(byte[], int, int):int");
    }
}
