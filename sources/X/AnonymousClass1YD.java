package X;

/* renamed from: X.1YD  reason: invalid class name */
public abstract class AnonymousClass1YD extends AnonymousClass1YC {
    public static final Integer A03(String str) {
        boolean z;
        int i;
        int i2;
        C18070vi.A0d(str, 0);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int i4 = -2147483647;
            if (C18070vi.A00(charAt, 48) < 0) {
                i = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0 && ((i3 >= i5 || (i5 == -59652323 && i3 >= (i5 = i4 / 10))) && (i2 = i3 * 10) >= i4 + digit)) {
                    i3 = i2 - digit;
                    i++;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long A04(java.lang.String r15) {
        /*
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            int r9 = r15.length()
            r14 = 0
            if (r9 == 0) goto L_0x0051
            r8 = 0
            char r1 = r15.charAt(r0)
            r0 = 48
            int r0 = X.C18070vi.A00(r1, r0)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= 0) goto L_0x006a
            r7 = 1
            if (r9 == r7) goto L_0x0051
            r0 = 45
            if (r1 != r0) goto L_0x0065
            r12 = -9223372036854775808
            r8 = 1
        L_0x0027:
            r3 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r5 = 0
            r10 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L_0x0033:
            if (r8 >= r9) goto L_0x006c
            char r1 = r15.charAt(r8)
            r0 = 10
            int r2 = java.lang.Character.digit(r1, r0)
            if (r2 < 0) goto L_0x0051
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
            r0 = 10
            long r10 = r12 / r0
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
        L_0x0051:
            return r14
        L_0x0052:
            r0 = 10
            long r5 = r5 * r0
            long r3 = (long) r2
            long r1 = r3 + r12
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            long r5 = r5 - r3
            int r8 = r8 + 1
            r3 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x0033
        L_0x0065:
            r0 = 43
            if (r1 != r0) goto L_0x0051
            r8 = 1
        L_0x006a:
            r7 = 0
            goto L_0x0027
        L_0x006c:
            if (r7 == 0) goto L_0x0073
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            return r14
        L_0x0073:
            long r0 = -r5
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YD.A04(java.lang.String):java.lang.Long");
    }
}
