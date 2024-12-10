package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import java.math.RoundingMode;

public abstract class zzga {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r2 < 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r2 > 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (((r5 & 1) & r3) != 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r5 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r1 > 0) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(int r6, int r7, java.math.RoundingMode r8) {
        /*
            if (r8 == 0) goto L_0x0054
            if (r7 == 0) goto L_0x004c
            int r5 = r6 / r7
            int r0 = r7 * r5
            int r4 = r6 - r0
            if (r4 == 0) goto L_0x004b
            r6 = r6 ^ r7
            int[] r0 = com.google.android.recaptcha.internal.zzfz.zza
            int r1 = X.BE6.A0E(r8, r0)
            int r0 = r6 >> 31
            r3 = 1
            r2 = r0 | 1
            r0 = 0
            switch(r1) {
                case 1: goto L_0x0022;
                case 2: goto L_0x004b;
                case 3: goto L_0x0026;
                case 4: goto L_0x0046;
                case 5: goto L_0x0029;
                case 6: goto L_0x002c;
                case 7: goto L_0x002c;
                case 8: goto L_0x002c;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0022:
            com.google.android.recaptcha.internal.zzgc.zzb(r0)
            return r5
        L_0x0026:
            if (r2 >= 0) goto L_0x004b
            goto L_0x0046
        L_0x0029:
            if (r2 <= 0) goto L_0x004b
            goto L_0x0046
        L_0x002c:
            int r1 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r7)
            int r0 = r0 - r1
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0048
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r8 == r0) goto L_0x0046
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            if (r8 == r0) goto L_0x0041
            r3 = 0
        L_0x0041:
            r0 = r5 & 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x004b
        L_0x0046:
            int r5 = r5 + r2
            return r5
        L_0x0048:
            if (r1 <= 0) goto L_0x004b
            goto L_0x0046
        L_0x004b:
            return r5
        L_0x004c:
            java.lang.String r1 = "/ by zero"
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzga.zza(int, int, java.math.RoundingMode):int");
    }

    public static int zzb(int i, RoundingMode roundingMode) {
        if (i > 0) {
            switch (BE6.A0E(roundingMode, zzfz.zza)) {
                case 1:
                    zzgc.zzb(AnonymousClass000.A1P((i - 1) & i));
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + (((-1257966797 >>> numberOfLeadingZeros) - i) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        throw AnonymousClass000.A0k("x (0) must be > 0");
    }
}
