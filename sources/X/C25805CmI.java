package X;

import java.util.Arrays;

/* renamed from: X.CmI  reason: case insensitive filesystem */
public final class C25805CmI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25805CmI(java.lang.String r8, char[] r9) {
        /*
            r7 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r0]
            r5 = -1
            java.util.Arrays.fill(r6, r5)
            r2 = 0
        L_0x0009:
            int r0 = r9.length
            if (r2 >= r0) goto L_0x004e
            char r4 = r9[r2]
            r1 = 1
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1U(r4, r0)
            java.lang.String r3 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x003c
            byte r0 = r6[r4]
            if (r0 == r5) goto L_0x001e
            r1 = 0
        L_0x001e:
            java.lang.String r3 = "Duplicate character: %s"
            if (r1 == 0) goto L_0x0028
            byte r0 = (byte) r2
            r6[r4] = r0
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0028:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = com.google.common.base.Strings.A00(r3, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x003c:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = com.google.common.base.Strings.A00(r3, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x004e:
            r0 = 0
            r7.<init>(r8, r9, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25805CmI.<init>(java.lang.String, char[]):void");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25805CmI)) {
            return false;
        }
        C25805CmI cmI = (C25805CmI) obj;
        if (this.A05 != cmI.A05 || !Arrays.equals(this.A07, cmI.A07)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        return hashCode + i;
    }

    public String toString() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r3 = 31 - java.lang.Integer.numberOfLeadingZeros(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        r5.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r2 = java.lang.Integer.numberOfTrailingZeros(r3);
        r5.A02 = 1 << (3 - r2);
        r5.A01 = r3 >> r2;
        r5.A03 = r4 - 1;
        r5.A06 = r8;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r3 >= r5.A01) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        X.C24608CBm.A00(r3 * 8, r5.A00, java.math.RoundingMode.CEILING);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        r5.A05 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25805CmI(java.lang.String r6, char[] r7, byte[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            X.C199610h.A04(r6)
            r5.A04 = r6
            X.C199610h.A04(r7)
            r5.A07 = r7
            int r4 = r7.length     // Catch:{ ArithmeticException -> 0x008e }
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x008e }
            java.lang.String r0 = "x"
            if (r4 <= 0) goto L_0x0030
            int[] r0 = X.CFj.A00     // Catch:{ ArithmeticException -> 0x008e }
            int r0 = X.BE6.A0E(r1, r0)     // Catch:{ ArithmeticException -> 0x008e }
            switch(r0) {
                case 1: goto L_0x0023;
                case 2: goto L_0x0056;
                case 3: goto L_0x0056;
                case 4: goto L_0x005d;
                case 5: goto L_0x005d;
                case 6: goto L_0x0043;
                case 7: goto L_0x0043;
                case 8: goto L_0x0043;
                default: goto L_0x001d;
            }     // Catch:{ ArithmeticException -> 0x008e }
        L_0x001d:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ ArithmeticException -> 0x008e }
            r1.<init>()     // Catch:{ ArithmeticException -> 0x008e }
        L_0x0022:
            throw r1     // Catch:{ ArithmeticException -> 0x008e }
        L_0x0023:
            int r0 = r4 + -1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x008e }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x008e }
            goto L_0x0022
        L_0x0030:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ ArithmeticException -> 0x008e }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ ArithmeticException -> 0x008e }
            r1.append(r4)     // Catch:{ ArithmeticException -> 0x008e }
            java.lang.String r0 = ") must be > 0"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ ArithmeticException -> 0x008e }
            goto L_0x0022
        L_0x0043:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x008e }
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r3 = 31 - r1
            int r0 = r0 - r4
            r0 = r0 ^ -1
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r3 = r3 + r0
            goto L_0x0065
        L_0x0056:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x008e }
            int r3 = 31 - r0
            goto L_0x0065
        L_0x005d:
            int r0 = r4 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x008e }
            int r3 = 32 - r0
        L_0x0065:
            r5.A00 = r3     // Catch:{ ArithmeticException -> 0x008e }
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r0 = 3 - r2
            r1 = 1
            int r0 = r1 << r0
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A01 = r3
            int r4 = r4 - r1
            r5.A03 = r4
            r5.A06 = r8
            r3 = 0
        L_0x007b:
            int r0 = r5.A01
            if (r3 >= r0) goto L_0x008b
            int r2 = r3 * 8
            int r1 = r5.A00
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.C24608CBm.A00(r2, r1, r0)
            int r3 = r3 + 1
            goto L_0x007b
        L_0x008b:
            r5.A05 = r9
            return
        L_0x008e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Illegal alphabet length "
            r1.append(r0)
            int r0 = r7.length
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25805CmI.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
