package X;

/* renamed from: X.6vl  reason: invalid class name and case insensitive filesystem */
public abstract class C137626vl {
    public static final byte[] A00 = C108975cc.A1O("MotionPhoto_Data");

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r11 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4 = (r4 + r11) + r3;
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.File r14) {
        /*
            r9 = 0
            X.C18070vi.A0d(r14, r9)
            boolean r0 = r14.exists()
            r8 = -1
            if (r0 == 0) goto L_0x00a5
            long r0 = r14.length()
            double r2 = (double) r0
            r0 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r2 = r2 * r0
            int r7 = (int) r2
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r0]
            java.io.FileInputStream r5 = X.C108945cZ.A18(r14)     // Catch:{ all -> 0x00a5 }
            int r0 = r5.read(r6)     // Catch:{ all -> 0x009a }
            if (r0 == r8) goto L_0x0096
            r4 = 0
        L_0x0026:
            if (r4 > r7) goto L_0x0096
            r12 = 8192(0x2000, float:1.14794E-41)
            r11 = 0
        L_0x002b:
            byte r1 = r6[r11]     // Catch:{ all -> 0x009a }
            byte[] r10 = A00     // Catch:{ all -> 0x009a }
            byte r0 = r10[r9]     // Catch:{ all -> 0x009a }
            if (r1 != r0) goto L_0x004f
            int r3 = r10.length     // Catch:{ all -> 0x009a }
            r13 = 1
            r2 = 1
        L_0x0036:
            if (r2 >= r3) goto L_0x004f
            int r0 = r11 + r2
            if (r0 >= r12) goto L_0x004f
            int r0 = r11 + r2
            byte r1 = r6[r0]     // Catch:{ all -> 0x009a }
            byte r0 = r10[r2]     // Catch:{ all -> 0x009a }
            if (r1 != r0) goto L_0x004f
            int r0 = r3 - r13
            if (r2 != r0) goto L_0x004c
            if (r11 == r8) goto L_0x0054
            int r4 = r4 + r11
            goto L_0x008d
        L_0x004c:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x004f:
            int r11 = r11 + 1
            if (r11 >= r12) goto L_0x0054
            goto L_0x002b
        L_0x0054:
            long r2 = r14.length()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "Item:Semantic=\"MotionPhoto\"\\s+Item:Length=\"(\\d+)\""
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = X.C108955ca.A13(r6)     // Catch:{ all -> 0x009a }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ all -> 0x009a }
            boolean r0 = r1.find()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x007f
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0078
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x009a }
            goto L_0x007a
        L_0x0078:
            r0 = 0
        L_0x007a:
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch:{ all -> 0x009a }
            if (r0 == r8) goto L_0x007f
            goto L_0x0092
        L_0x007f:
            int r4 = r4 + 4096
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.System.arraycopy(r6, r0, r6, r9, r0)     // Catch:{ all -> 0x009a }
            int r0 = r5.read(r6, r0, r0)     // Catch:{ all -> 0x009a }
            if (r0 != r8) goto L_0x0026
            goto L_0x0096
        L_0x008d:
            int r4 = r4 + r3
            r5.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a2
        L_0x0092:
            r5.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a1
        L_0x0096:
            r5.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a5
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a1:
            r4 = r0
        L_0x00a2:
            r0 = 1
            if (r4 > r8) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137626vl.A00(java.io.File):boolean");
    }
}
