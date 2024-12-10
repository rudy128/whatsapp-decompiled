package X;

/* renamed from: X.CoM  reason: case insensitive filesystem */
public abstract class C25908CoM {
    public static final C6G A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.C6G] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            boolean r0 = X.C26267CwC.A06
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.C26267CwC.A07
            if (r0 == 0) goto L_0x0010
            X.Bf8 r0 = new X.Bf8
            r0.<init>()
        L_0x000d:
            A00 = r0
            return
        L_0x0010:
            X.Bf7 r0 = new X.Bf7
            r0.<init>()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25908CoM.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r14 < 2048) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[LOOP:1: B:19:0x0071->B:25:0x0084, LOOP_START, PHI: r0 r3 r4 
      PHI: (r0v32 long) = (r0v31 long), (r0v45 long) binds: [B:17:0x006b, B:25:0x0084] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v10 char) = (r3v9 char), (r3v13 char) binds: [B:17:0x006b, B:25:0x0084] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v18 int) = (r4v17 int), (r4v24 int) binds: [B:17:0x006b, B:25:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.CharSequence r20, java.nio.ByteBuffer r21) {
        /*
            X.C6G r4 = A00
            r9 = r21
            boolean r0 = r9.hasArray()
            r10 = r20
            if (r0 == 0) goto L_0x0026
            int r3 = r9.arrayOffset()
            byte[] r2 = r9.array()
            int r1 = r9.position()
            int r1 = r1 + r3
            int r0 = r9.remaining()
            int r2 = r4.A00(r10, r2, r1, r0)
            int r2 = r2 - r3
        L_0x0022:
            r9.position(r2)
            return
        L_0x0026:
            boolean r0 = r9.isDirect()
            if (r0 == 0) goto L_0x0160
            boolean r0 = r4 instanceof X.C23320Bf8
            if (r0 == 0) goto L_0x0160
            X.CnI r8 = X.C26267CwC.A02
            long r0 = X.C26267CwC.A01
            long r20 = r8.A05(r9, r0)
            int r0 = r9.position()
            long r0 = (long) r0
            long r0 = r0 + r20
            int r2 = r9.limit()
            long r5 = (long) r2
            long r5 = r5 + r20
            int r7 = r10.length()
            long r2 = (long) r7
            long r11 = r5 - r0
            java.lang.String r13 = " at index "
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x014b
            r4 = 0
        L_0x0054:
            r3 = 128(0x80, float:1.794E-43)
            r18 = 1
            if (r4 >= r7) goto L_0x006b
            char r2 = r10.charAt(r4)
            if (r2 >= r3) goto L_0x006b
            long r18 = r18 + r0
            byte r2 = (byte) r2
            r8.A07(r0, r2)
            int r4 = r4 + 1
            r0 = r18
            goto L_0x0054
        L_0x006b:
            if (r4 != r7) goto L_0x0071
        L_0x006d:
            long r0 = r0 - r20
            int r2 = (int) r0
            goto L_0x0022
        L_0x0071:
            if (r4 >= r7) goto L_0x006d
            char r14 = r10.charAt(r4)
            if (r14 >= r3) goto L_0x0089
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x008d
            long r11 = r0 + r18
            byte r2 = (byte) r14
            r8.A07(r0, r2)
            r0 = r11
        L_0x0084:
            int r4 = r4 + 1
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0071
        L_0x0089:
            r2 = 2048(0x800, float:2.87E-42)
            if (r14 >= r2) goto L_0x00ab
        L_0x008d:
            r2 = 2
            long r11 = r5 - r2
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00ab
            long r2 = r0 + r18
            int r11 = r14 >>> 6
            r11 = r11 | 960(0x3c0, float:1.345E-42)
            byte r11 = (byte) r11
            r8.A07(r0, r11)
            long r0 = r2 + r18
            r12 = r14 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r12 | r11
            byte r11 = (byte) r12
        L_0x00a7:
            r8.A07(r2, r11)
            goto L_0x0084
        L_0x00ab:
            r15 = 57343(0xdfff, float:8.0355E-41)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r3) goto L_0x00b5
            if (r15 >= r14) goto L_0x00db
        L_0x00b5:
            r16 = 3
            long r11 = r5 - r16
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00db
            long r11 = r0 + r18
            int r2 = r14 >>> 12
            r2 = r2 | 480(0x1e0, float:6.73E-43)
            byte r2 = (byte) r2
            r8.A07(r0, r2)
            long r2 = r11 + r18
            int r0 = r14 >>> 6
            r0 = r0 & 63
            r15 = 128(0x80, float:1.794E-43)
            r0 = r0 | r15
            byte r0 = (byte) r0
            r8.A07(r11, r0)
            long r0 = r2 + r18
            r11 = r14 & 63
            r11 = r11 | r15
        L_0x00d9:
            byte r11 = (byte) r11
            goto L_0x00a7
        L_0x00db:
            r16 = 4
            long r11 = r5 - r16
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0127
            int r2 = r4 + 1
            if (r2 == r7) goto L_0x011f
            int r4 = r4 + 1
            char r3 = r10.charAt(r4)
            boolean r2 = java.lang.Character.isSurrogatePair(r14, r3)
            if (r2 == 0) goto L_0x011f
            int r14 = java.lang.Character.toCodePoint(r14, r3)
            long r2 = r0 + r18
            int r11 = r14 >>> 18
            r11 = r11 | 240(0xf0, float:3.36E-43)
            byte r11 = (byte) r11
            r8.A07(r0, r11)
            long r0 = r2 + r18
            int r11 = r14 >>> 12
            r11 = r11 & 63
            r12 = 128(0x80, float:1.794E-43)
            r11 = r11 | r12
            byte r11 = (byte) r11
            r8.A07(r2, r11)
            long r2 = r0 + r18
            int r11 = r14 >>> 6
            r11 = r11 & 63
            r11 = r11 | r12
            byte r11 = (byte) r11
            r8.A07(r0, r11)
            long r0 = r2 + r18
            r11 = r14 & 63
            r11 = r11 | r12
            goto L_0x00d9
        L_0x011f:
            int r0 = r4 + -1
            X.C2d r1 = new X.C2d
            r1.<init>(r0, r7)
            throw r1
        L_0x0127:
            if (r3 > r14) goto L_0x013b
            if (r14 > r15) goto L_0x013b
            int r2 = r4 + 1
            if (r2 == r7) goto L_0x0135
            boolean r2 = X.BE8.A1X(r10, r14, r2)
            if (r2 != 0) goto L_0x013b
        L_0x0135:
            X.C2d r1 = new X.C2d
            r1.<init>(r4, r7)
            throw r1
        L_0x013b:
            r2 = 46
            java.lang.StringBuilder r2 = X.BE9.A0s(r2, r14)
            java.lang.String r0 = X.C17890vO.A0a(r13, r2, r0)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x014b:
            int r0 = r7 + -1
            char r2 = r10.charAt(r0)
            int r1 = r9.limit()
            r0 = 37
            java.lang.StringBuilder r0 = X.BE9.A0s(r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = X.BEA.A0Z(r13, r0, r1)
            throw r1
        L_0x0160:
            int r5 = r10.length()
            int r4 = r9.position()
            r2 = 0
        L_0x0169:
            r6 = 128(0x80, float:1.794E-43)
            if (r2 >= r5) goto L_0x017c
            char r0 = r10.charAt(r2)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            if (r0 >= r6) goto L_0x017c
            int r1 = r4 + r2
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            r9.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            int r2 = r2 + 1
            goto L_0x0169
        L_0x017c:
            if (r2 != r5) goto L_0x0184
            int r0 = r4 + r2
            r9.position(r0)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            return
        L_0x0184:
            int r4 = r4 + r2
        L_0x0185:
            if (r2 >= r5) goto L_0x0208
            char r0 = r10.charAt(r2)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            if (r0 < r6) goto L_0x01f7
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x0199
            int r3 = r4 + 1
            int r1 = r0 >>> 6
            r1 = r1 | 192(0xc0, float:2.69E-43)
        L_0x0197:
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            goto L_0x01d4
        L_0x0199:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r1) goto L_0x01df
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r1 < r0) goto L_0x01df
            int r1 = r2 + 1
            if (r1 == r5) goto L_0x0202
            int r2 = r2 + 1
            char r3 = r10.charAt(r2)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            boolean r1 = java.lang.Character.isSurrogatePair(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            if (r1 == 0) goto L_0x0202
            int r0 = java.lang.Character.toCodePoint(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            int r3 = r4 + 1
            int r1 = r0 >>> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            r9.put(r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            int r4 = r3 + 1
            int r1 = r0 >>> 12
            r1 = r1 & 63
            r1 = r1 | r6
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            r9.put(r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            int r3 = r4 + 1
            int r1 = r0 >>> 6
            r1 = r1 & 63
            r1 = r1 | r6
            goto L_0x0197
        L_0x01d4:
            r9.put(r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            r0 = r0 & 63
            r0 = r0 | r6
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            r9.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            goto L_0x01fc
        L_0x01df:
            int r3 = r4 + 1
            int r1 = r0 >>> 12
            r1 = r1 | 224(0xe0, float:3.14E-43)
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            r9.put(r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            int r4 = r3 + 1
            int r1 = r0 >>> 6
            r1 = r1 & 63
            r1 = r1 | r6
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x020c }
            r9.put(r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            r0 = r0 & 63
            r0 = r0 | r6
        L_0x01f7:
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            r9.put(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            goto L_0x01fd
        L_0x01fc:
            r4 = r3
        L_0x01fd:
            int r2 = r2 + 1
            int r4 = r4 + 1
            goto L_0x0185
        L_0x0202:
            X.C2d r0 = new X.C2d     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            r0.<init>(r2, r5)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x020d }
        L_0x0208:
            r9.position(r4)     // Catch:{ IndexOutOfBoundsException -> 0x020d }
            return
        L_0x020c:
            r4 = r3
        L_0x020d:
            int r3 = r9.position()
            int r0 = r9.position()
            int r4 = r4 - r0
            int r0 = r4 + 1
            int r0 = java.lang.Math.max(r2, r0)
            int r3 = r3 + r0
            char r2 = r10.charAt(r2)
            r0 = 37
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25908CoM.A01(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C24406C2d(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass000.A0k(C17890vO.A0a("UTF-8 length does not fit in int: ", BE6.A0t(54), ((long) i3) + 4294967296L));
    }
}
