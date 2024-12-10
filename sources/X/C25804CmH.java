package X;

import java.util.Arrays;

/* renamed from: X.CmH  reason: case insensitive filesystem */
public final class C25804CmH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    public final String toString() {
        return this.A04;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25804CmH(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r8 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r8]
            r6 = -1
            java.util.Arrays.fill(r7, r6)
            r4 = 0
            r5 = 0
        L_0x000a:
            int r0 = r11.length
            if (r5 >= r0) goto L_0x004b
            char r3 = r11[r5]
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1U(r3, r8)
            java.lang.String r2 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x003a
            byte r0 = r7[r3]
            if (r0 == r6) goto L_0x001d
            r1 = 0
        L_0x001d:
            java.lang.String r2 = "Duplicate character: %s"
            if (r1 == 0) goto L_0x0027
            byte r0 = (byte) r5
            r7[r3] = r0
            int r5 = r5 + 1
            goto L_0x000a
        L_0x0027:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            r1[r4] = r0
            java.lang.String r0 = X.CBB.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x003a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            r1[r4] = r0
            java.lang.String r0 = X.CBB.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x004b:
            r9.<init>(r10, r11, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25804CmH.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25804CmH) {
            C25804CmH cmH = (C25804CmH) obj;
            if (this.A05 != cmH.A05 || !Arrays.equals(this.A07, cmH.A07)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.A05;
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1231;
        if (true != z) {
            i = 1237;
        }
        return hashCode + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r3 = 31 - java.lang.Integer.numberOfLeadingZeros(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r5.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r2 = java.lang.Integer.numberOfTrailingZeros(r3);
        r5.A02 = 1 << (3 - r2);
        r5.A03 = r3 >> r2;
        r5.A00 = r4 - 1;
        r5.A06 = r8;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r3 >= r5.A03) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        X.CBC.A00(r3 * 8, r5.A01, java.math.RoundingMode.CEILING);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r5.A05 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25804CmH(java.lang.String r6, char[] r7, byte[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A04 = r6
            if (r7 == 0) goto L_0x008a
            r5.A07 = r7
            int r4 = r7.length     // Catch:{ ArithmeticException -> 0x0078 }
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x0078 }
            if (r4 <= 0) goto L_0x002a
            int[] r0 = X.CFB.A00     // Catch:{ ArithmeticException -> 0x0078 }
            int r0 = X.BE6.A0E(r1, r0)     // Catch:{ ArithmeticException -> 0x0078 }
            switch(r0) {
                case 1: goto L_0x001d;
                case 2: goto L_0x0040;
                case 3: goto L_0x0040;
                case 4: goto L_0x0047;
                case 5: goto L_0x0047;
                case 6: goto L_0x0031;
                case 7: goto L_0x0031;
                case 8: goto L_0x0031;
                default: goto L_0x0017;
            }     // Catch:{ ArithmeticException -> 0x0078 }
        L_0x0017:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ ArithmeticException -> 0x0078 }
            r1.<init>()     // Catch:{ ArithmeticException -> 0x0078 }
        L_0x001c:
            throw r1     // Catch:{ ArithmeticException -> 0x0078 }
        L_0x001d:
            int r0 = r4 + -1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x0078 }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x0078 }
            goto L_0x001c
        L_0x002a:
            java.lang.String r0 = "x (0) must be > 0"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)     // Catch:{ ArithmeticException -> 0x0078 }
            goto L_0x001c
        L_0x0031:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x0078 }
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r3 = 31 - r1
            int r0 = r0 - r4
            int r0 = r0 >>> 31
            int r3 = r3 + r0
            goto L_0x004f
        L_0x0040:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x0078 }
            int r3 = 31 - r0
            goto L_0x004f
        L_0x0047:
            int r0 = r4 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x0078 }
            int r3 = 32 - r0
        L_0x004f:
            r5.A01 = r3     // Catch:{ ArithmeticException -> 0x0078 }
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r1 = 3 - r2
            r0 = 1
            int r0 = r0 << r1
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A03 = r3
            int r0 = r4 + -1
            r5.A00 = r0
            r5.A06 = r8
            r3 = 0
        L_0x0065:
            int r0 = r5.A03
            if (r3 >= r0) goto L_0x0075
            int r2 = r3 * 8
            int r1 = r5.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.CBC.A00(r2, r1, r0)
            int r3 = r3 + 1
            goto L_0x0065
        L_0x0075:
            r5.A05 = r9
            return
        L_0x0078:
            r3 = move-exception
            int r2 = r7.length
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r3)
            throw r0
        L_0x008a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25804CmH.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
