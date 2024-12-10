package X;

/* renamed from: X.9jt  reason: invalid class name and case insensitive filesystem */
public class C189809jt {
    public final AnonymousClass1P2 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = X.AnonymousClass8BR.A0v(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        throw X.AnonymousClass8BR.A0v(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e A[ExcHandler: 1P8 | 1P9 (r0v1 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21571AmL A00(X.C58462kj r15) {
        /*
            r14 = this;
            java.lang.Object r7 = X.C182219Tn.A00
            monitor-enter(r7)
            r1 = 3
            X.1P2 r5 = r14.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.2qU r4 = r5.A01(r15)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            java.util.LinkedList r3 = r4.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            boolean r0 = r3.isEmpty()     // Catch:{ 1P8 | 1P9 -> 0x009e }
            if (r0 != 0) goto L_0x0026
            X.9zI r0 = r4.A00()     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r2 = 1
            int r2 = r2 << r1
            X.8ac r0 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.EE9 r1 = r0.senderChainKeys_     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.A7F r0 = new X.A7F     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r0.<init>((java.util.List) r1)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            byte[][] r0 = r0.A01     // Catch:{ 1P8 | 1P9 -> 0x009e }
            int r0 = r0.length     // Catch:{ 1P8 | 1P9 -> 0x009e }
            if (r2 == r0) goto L_0x0061
        L_0x0026:
            r0 = 32
            byte[] r6 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0092, 1P8 | 1P9 -> 0x009e }
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0092, 1P8 | 1P9 -> 0x009e }
            r0.nextBytes(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0092, 1P8 | 1P9 -> 0x009e }
            X.A7F r2 = new X.A7F     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r2.<init>((byte[]) r6)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0098, 1P8 | 1P9 -> 0x009e }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r1.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0098, 1P8 | 1P9 -> 0x009e }
            byte[][] r11 = r2.A01     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.9cI r0 = X.C20065A5o.A02()     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r3.clear()     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r13 = 0
            X.AiX r9 = r0.A01     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.9ZN r0 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.3K3 r10 = new X.3K3     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r10.<init>(r0)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.9zI r8 = new X.9zI     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r3.add(r8)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r5.A03(r15, r4)     // Catch:{ 1P8 | 1P9 -> 0x009e }
        L_0x0061:
            X.9zI r5 = r4.A00()     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.8ac r0 = r5.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            int r4 = r0.senderKeyId_     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.EE9 r1 = r0.senderChainKeys_     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.A7F r0 = new X.A7F     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r0.<init>((java.util.List) r1)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            int r3 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.8ac r0 = r5.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.EE9 r1 = r0.senderChainKeys_     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.A7F r0 = new X.A7F     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r0.<init>((java.util.List) r1)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            byte[][] r2 = r0.A01     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.8ac r0 = r5.A00     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.8Zo r0 = r0.senderSigningKey_     // Catch:{ 1P8 | 1P9 -> 0x009e }
            if (r0 != 0) goto L_0x0085
            X.8Zo r0 = X.C164628Zo.DEFAULT_INSTANCE     // Catch:{ 1P8 | 1P9 -> 0x009e }
        L_0x0085:
            X.DSQ r0 = r0.public_     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.AiX r1 = X.C20065A5o.A00(r0)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            X.AmL r0 = new X.AmL     // Catch:{ 1P8 | 1P9 -> 0x009e }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            return r0
        L_0x0092:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P8 | 1P9 -> 0x009e }
            goto L_0x009d
        L_0x0098:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P8 | 1P9 -> 0x009e }
        L_0x009d:
            throw r0     // Catch:{ 1P8 | 1P9 -> 0x009e }
        L_0x009e:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189809jt.A00(X.2kj):X.AmL");
    }

    public C189809jt(AnonymousClass1P2 r1) {
        this.A00 = r1;
    }
}
