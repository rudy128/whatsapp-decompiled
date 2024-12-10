package X;

/* renamed from: X.2qV  reason: invalid class name and case insensitive filesystem */
public final class C61922qV {
    public static final byte[] A01 = {-64, -64, -84, 13, -27};
    public static final byte[] A02 = {-93, -81, -63, 35, -110, -88, -95, -40, 126, -124, -80, -80, -126, 122, -47, -94};
    public static final byte[] A03 = {-93, -81, -63, 35, -110, -88, -95, -40, 126, -124, -80, -80};
    public static final byte[] A04 = {-36, -126, -121, -22, -55, 119, -71, -37, 120, 47, -71, 121, -26, -22, 100, -81, 45, 103, -67, 15, -67, -88, -22, 15, 114, -5, 81, -103, 113, -84, 12, -105};
    public static final byte[] A05 = {-7, 71, 124, 78, 52, -54, 47, 3, 87, 98, -48, 115, -53, 25, -3, 62, -105, 76, -20, 126, -91, -4, 49, -11, -64, -104, 62, 25, -14, 43, -99, -124};
    public Boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (java.util.Arrays.equals(A02, r6) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.String r11, byte[] r12) {
        /*
            r10 = this;
            java.lang.Boolean r0 = r10.A00
            r9 = 0
            if (r0 != 0) goto L_0x0096
            if (r12 == 0) goto L_0x009a
            r5 = 1
            if (r11 == 0) goto L_0x0050
            java.nio.charset.Charset r0 = X.C26571Sq.A05
            byte[] r1 = X.C18070vi.A1A(r11, r0)
            int r0 = r1.length
            byte[] r8 = java.util.Arrays.copyOf(r1, r0)
            X.C18070vi.A0X(r8)
            int r7 = r8.length
            byte[] r6 = new byte[r7]
            r4 = 0
            r3 = 0
        L_0x001d:
            if (r4 >= r7) goto L_0x0031
            byte r2 = r8[r4]
            byte[] r0 = A01
            int r1 = r3 + 1
            byte r0 = r0[r3]
            r0 = r0 ^ r2
            byte r0 = (byte) r0
            r6[r4] = r0
            r0 = 5
            int r3 = r1 % r0
            int r4 = r4 + 1
            goto L_0x001d
        L_0x0031:
            byte[] r0 = A03
            boolean r0 = java.util.Arrays.equals(r0, r6)
            if (r0 != 0) goto L_0x0042
            byte[] r0 = A02
            boolean r1 = java.util.Arrays.equals(r0, r6)
            r0 = 1
            if (r1 == 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A00 = r0
            boolean r0 = X.C18070vi.A19(r0, r5)
            if (r0 == 0) goto L_0x0050
            return r5
        L_0x0050:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r1 = r0.digest(r12)
            X.C18070vi.A0X(r1)
            int r0 = r1.length
            byte[] r8 = java.util.Arrays.copyOf(r1, r0)
            X.C18070vi.A0X(r8)
            int r7 = r8.length
            byte[] r6 = new byte[r7]
            r4 = 0
            r3 = 0
        L_0x006a:
            if (r4 >= r7) goto L_0x007e
            byte r2 = r8[r4]
            byte[] r0 = A01
            int r1 = r3 + 1
            byte r0 = r0[r3]
            r0 = r0 ^ r2
            byte r0 = (byte) r0
            r6[r4] = r0
            r0 = 5
            int r3 = r1 % r0
            int r4 = r4 + 1
            goto L_0x006a
        L_0x007e:
            byte[] r0 = A04
            boolean r0 = java.util.Arrays.equals(r0, r6)
            if (r0 != 0) goto L_0x009b
            byte[] r0 = A05
            boolean r0 = java.util.Arrays.equals(r0, r6)
            if (r0 != 0) goto L_0x009b
        L_0x008e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r10.A00 = r0
            if (r0 == 0) goto L_0x009a
        L_0x0096:
            boolean r9 = r0.booleanValue()
        L_0x009a:
            return r9
        L_0x009b:
            r5 = 0
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61922qV.A00(java.lang.String, byte[]):boolean");
    }

    public C61922qV() {
        Boolean bool = C17960vV.A01;
    }
}
