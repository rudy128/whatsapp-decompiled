package X;

/* renamed from: X.0BU  reason: invalid class name */
public final class AnonymousClass0BU extends C06140Xc {
    public static AnonymousClass0BU A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (A02().charAt(r6 - 1) == 10) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r6 >= r3) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r6 < r3) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] BLU(int r6) {
        /*
            r5 = this;
            int r3 = X.C06140Xc.A01(r5)
            r4 = 0
            if (r3 <= 0) goto L_0x0033
            if (r6 >= r3) goto L_0x0033
            if (r6 >= 0) goto L_0x0036
            r6 = 0
        L_0x000c:
            java.lang.String r0 = r5.A02()
            char r0 = r0.charAt(r6)
            r2 = 10
            if (r0 != r2) goto L_0x0031
            java.lang.String r0 = r5.A02()
            char r0 = r0.charAt(r6)
            if (r0 == r2) goto L_0x0034
            r0 = 1
            if (r6 == 0) goto L_0x0039
            java.lang.String r1 = r5.A02()
            int r0 = r6 - r0
            char r0 = r1.charAt(r0)
            if (r0 != r2) goto L_0x0034
        L_0x0031:
            if (r6 < r3) goto L_0x0039
        L_0x0033:
            return r4
        L_0x0034:
            int r6 = r6 + 1
        L_0x0036:
            if (r6 >= r3) goto L_0x0031
            goto L_0x000c
        L_0x0039:
            int r2 = r6 + 1
        L_0x003b:
            if (r2 >= r3) goto L_0x005d
            if (r2 <= 0) goto L_0x0062
            java.lang.String r1 = r5.A02()
            int r0 = r2 + -1
            char r0 = r1.charAt(r0)
            r1 = 10
            if (r0 == r1) goto L_0x0062
            int r0 = X.C06140Xc.A01(r5)
            if (r2 == r0) goto L_0x005d
            java.lang.String r0 = r5.A02()
            char r0 = r0.charAt(r2)
            if (r0 != r1) goto L_0x0062
        L_0x005d:
            int[] r0 = r5.A04(r6, r2)
            return r0
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BU.BLU(int):int[]");
    }

    public int[] CCD(int i) {
        int i2;
        int A01 = C06140Xc.A01(this);
        if (A01 <= 0 || i <= 0) {
            return null;
        }
        if (i > A01) {
            i = A01;
        }
        do {
            i2 = i - 1;
            if (A02().charAt(i2) != 10 || (i > 0 && A02().charAt(i2) != 10 && (i == C06140Xc.A01(this) || A02().charAt(i) == 10))) {
                while (i2 > 0 && (A02().charAt(i2) == 10 || A02().charAt(i2 - 1) != 10)) {
                    i2--;
                }
                return A04(i2, i);
            }
            i = i2;
        } while (i2 > 0);
        return null;
    }
}
