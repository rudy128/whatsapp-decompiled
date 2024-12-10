package X;

/* renamed from: X.9Sm  reason: invalid class name and case insensitive filesystem */
public abstract class C181959Sm {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        r1 = X.AnonymousClass8BR.A0v(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        throw X.AnonymousClass8BR.A0v(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089 A[ExcHandler: 1P8 | 1P9 (r0v0 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21572AmM A00(X.C25631Oy r9, X.C58462kj r10) {
        /*
            X.2bX r2 = r9.A02(r10)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            java.util.LinkedList r0 = r2.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            boolean r0 = r0.isEmpty()     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            if (r0 == 0) goto L_0x0049
            java.lang.String r3 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0025, 1P8 | 1P9 -> 0x0089 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r1.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0025, 1P8 | 1P9 -> 0x0089 }
            r0 = 32
            byte[] r6 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0083, 1P8 | 1P9 -> 0x0089 }
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0083, 1P8 | 1P9 -> 0x0089 }
            r0.nextBytes(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0083, 1P8 | 1P9 -> 0x0089 }
            goto L_0x002b
        L_0x0025:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            goto L_0x0088
        L_0x002b:
            X.9cI r0 = X.C20065A5o.A02()     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            java.util.LinkedList r1 = r2.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r1.clear()     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r8 = 0
            X.AiX r4 = r0.A01     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.9ZN r0 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.3K3 r5 = new X.3K3     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r5.<init>(r0)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.9ns r3 = new X.9ns     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r1.add(r3)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r9.A04(r10, r2)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
        L_0x0049:
            java.util.LinkedList r1 = r2.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            boolean r0 = r1.isEmpty()     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            if (r0 != 0) goto L_0x007b
            java.lang.Object r1 = X.AnonymousClass8BS.A0Y(r1)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.9ns r1 = (X.C192139ns) r1     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.8b3 r0 = r1.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            int r4 = r0.senderKeyId_     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.A0k r0 = r1.A00()     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            int r3 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.A0k r0 = r1.A00()     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            byte[] r2 = r0.A01     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.8b3 r0 = r1.A00     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.8Zo r0 = r0.senderSigningKey_     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            if (r0 != 0) goto L_0x006f
            X.8Zo r0 = X.C164628Zo.DEFAULT_INSTANCE     // Catch:{ 1P8 | 1P9 -> 0x0089 }
        L_0x006f:
            X.DSQ r0 = r0.public_     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.AiX r1 = X.C20065A5o.A00(r0)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            X.AmM r0 = new X.AmM     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            return r0
        L_0x007b:
            java.lang.String r0 = "No key state in record!"
            X.1P9 r1 = new X.1P9     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
            goto L_0x0088
        L_0x0083:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P8 | 1P9 -> 0x0089 }
        L_0x0088:
            throw r1     // Catch:{ 1P8 | 1P9 -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181959Sm.A00(X.1Oy, X.2kj):X.AmM");
    }
}
