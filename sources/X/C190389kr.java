package X;

/* renamed from: X.9kr  reason: invalid class name and case insensitive filesystem */
public class C190389kr {
    public final /* synthetic */ C20123A8i A00;
    public final /* synthetic */ C190899lh A01;
    public final /* synthetic */ C20282AEq A02;

    public C190389kr(C20123A8i a8i, C190899lh r2, C20282AEq aEq) {
        this.A00 = a8i;
        this.A01 = r2;
        this.A02 = aEq;
    }

    /* JADX WARNING: type inference failed for: r11v9, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fb, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fc, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0265, code lost:
        r0 = th;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e7, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e8, code lost:
        r6 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:52:0x012d, B:81:0x0194] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0265 A[ExcHandler: all (th java.lang.Throwable), PHI: r11 
      PHI: (r11v7 java.io.BufferedInputStream) = (r11v10 java.io.BufferedInputStream), (r11v13 java.io.BufferedInputStream) binds: [B:81:0x0194, B:52:0x012d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:52:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ca A[LOOP:2: B:93:0x01c7->B:95:0x01ca, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C20282AEq r23, X.AnonymousClass9LV r24, java.io.File r25) {
        /*
            r22 = this;
            r3 = r25
            r5 = r24
            if (r25 != 0) goto L_0x000f
            if (r24 != 0) goto L_0x000f
            java.lang.String r1 = "DefaultAssetManager"
            java.lang.String r0 = "download result and error should not be null at the same time."
            X.C26294Cx6.A08(r1, r0)
        L_0x000f:
            r20 = r22
            r0 = r20
            X.A8i r4 = r0.A00
            java.lang.Object r7 = r4.A05
            monitor-enter(r7)
            X.9lh r2 = r0.A01     // Catch:{ all -> 0x0273 }
            X.1IX r19 = X.C20123A8i.A01(r4, r2)     // Catch:{ all -> 0x0273 }
            int r0 = r2.A00     // Catch:{ all -> 0x0273 }
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r1 = 0
            r18 = r0 ^ 1
            X.A7A r0 = r4.A01     // Catch:{ all -> 0x0273 }
            java.util.Map r6 = r0.A02     // Catch:{ all -> 0x0273 }
            X.AEq r0 = r2.A03     // Catch:{ all -> 0x0273 }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x0273 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0273 }
            r6.remove(r0)     // Catch:{ all -> 0x0273 }
            monitor-exit(r7)     // Catch:{ all -> 0x0273 }
            r21 = r23
            if (r25 == 0) goto L_0x0093
            if (r24 != 0) goto L_0x0093
            r0 = r21
            long r5 = r0.A00
            X.A6K r0 = r0.A01
            java.lang.String r9 = r0.A0A
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = r0.A02
            java.lang.String r8 = r0.name()
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            long r11 = r3.length()
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            java.lang.String r7 = "DefaultAssetManager"
            java.lang.String r12 = "[%s]-%s asset result size check. Expected - Actual : %d - %d"
            X.EAY r0 = X.C26294Cx6.A01
            r11 = 4
            boolean r0 = r0.BfN(r11)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r12, r9, r8, r10, r13)
            X.C26294Cx6.A06(r7, r0)
        L_0x0069:
            r12 = -1
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00c7
            long r12 = r3.length()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00c7
            X.9zw r8 = X.C199399zw.A00()
            java.lang.String r0 = "size_mismatch"
            r8.A02 = r0
            long r5 = r3.length()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "[%s] downloaded asset size mismatch. %d vs %d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9, r10, r5)
        L_0x008d:
            r8.A01 = r0
            X.9LV r5 = r8.A01()
        L_0x0093:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x00ba
            r0 = r19
            java.lang.Object r0 = r0.get(r1)
            X.9p5 r0 = (X.C192849p5) r0
            X.A4D r0 = r0.A07
            java.util.List r10 = java.util.Collections.singletonList(r0)
            java.lang.Integer r9 = X.AnonymousClass00R.A0j
            boolean r13 = X.AnonymousClass000.A1X(r5)
            if (r25 == 0) goto L_0x00c4
            long r11 = r3.length()
        L_0x00b3:
            r6 = r4
            r7 = r21
            r8 = r5
            X.C20123A8i.A07(r6, r7, r8, r9, r10, r11, r13)
        L_0x00ba:
            if (r5 == 0) goto L_0x0249
            r0 = 0
            X.C20123A8i.A06(r4, r2, r0, r5, r1)
            if (r25 == 0) goto L_0x0245
            goto L_0x0239
        L_0x00c4:
            r11 = 0
            goto L_0x00b3
        L_0x00c7:
            r0 = r21
            java.lang.Integer r0 = r0.A04
            r17 = r0
            if (r0 != 0) goto L_0x0233
            java.lang.String r6 = "null"
        L_0x00d1:
            r0 = r21
            java.lang.String r13 = r0.A05
            java.lang.String r5 = "[%s]-%s asset hash check. HashType : %s. Expected : %s"
            X.EAY r0 = X.C26294Cx6.A01
            boolean r0 = r0.BfN(r11)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r5, r9, r8, r6, r13)
            X.C26294Cx6.A06(r7, r0)
        L_0x00e6:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0230
            if (r17 == 0) goto L_0x0230
            int r0 = r17.intValue()
            r12 = 1
            if (r0 == r12) goto L_0x0189
            if (r0 == r1) goto L_0x0120
            r11 = 0
        L_0x00f8:
            X.9zw r8 = X.C199399zw.A00()
            java.lang.String r0 = "hash_value_mismatch"
            r8.A02 = r0
            r0 = 6
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r1] = r9
            java.lang.String r0 = X.AnonymousClass9OZ.A00(r17)
            r7[r12] = r0
            X.AnonymousClass001.A1R(r13, r11, r7)
            r0 = 4
            r7[r0] = r10
            long r5 = r3.length()
            X.C17890vO.A1Q(r7, r5)
            java.lang.String r0 = "asset hash mismatch. asset id: %s, hash type: %s, server hash value: %s, actual hash value: %s. server file size: %d, actual file size: %d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r7)
            goto L_0x008d
        L_0x0120:
            java.lang.String r14 = "AssetFileUtil"
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r16 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x025f }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r15 = new byte[r0]
            r11 = 0
            boolean r0 = r3 instanceof X.AnonymousClass9HP     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            if (r0 == 0) goto L_0x013e
            r5 = r3
            X.9HP r5 = (X.AnonymousClass9HP) r5     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
        L_0x0134:
            java.io.FileInputStream r0 = X.C108945cZ.A18(r5)     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            goto L_0x0148
        L_0x013e:
            java.lang.String r0 = r3.getPath()     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            X.9HP r5 = new X.9HP     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0175, IOException -> 0x0162, all -> 0x0265 }
            goto L_0x0134
        L_0x0148:
            int r5 = r6.read(r15)     // Catch:{ FileNotFoundException -> 0x0160, IOException -> 0x015e }
            if (r5 <= 0) goto L_0x0154
            r0 = r16
            r0.update(r15, r1, r5)     // Catch:{ FileNotFoundException -> 0x0160, IOException -> 0x015e }
            goto L_0x0148
        L_0x0154:
            X.C197099w9.A00(r6)
            byte[] r11 = r16.digest()
            r0 = 32
            goto L_0x01c4
        L_0x015e:
            r8 = move-exception
            goto L_0x0164
        L_0x0160:
            r8 = move-exception
            goto L_0x0177
        L_0x0162:
            r8 = move-exception
            r6 = r11
        L_0x0164:
            java.lang.String r7 = "Couldn't read the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0267 }
            r5[r1] = r0     // Catch:{ all -> 0x0267 }
            X.C26294Cx6.A0D(r14, r7, r8, r5)     // Catch:{ all -> 0x0267 }
            X.C197099w9.A00(r6)
            goto L_0x00f8
        L_0x0175:
            r8 = move-exception
            r6 = r11
        L_0x0177:
            java.lang.String r7 = "Couldn't find the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0267 }
            r5[r1] = r0     // Catch:{ all -> 0x0267 }
            X.C26294Cx6.A0D(r14, r7, r8, r5)     // Catch:{ all -> 0x0267 }
            X.C197099w9.A00(r6)
            goto L_0x00f8
        L_0x0189:
            java.lang.String r14 = "AssetFileUtil"
            java.security.MessageDigest r16 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x026d }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r15 = new byte[r0]
            r11 = 0
            boolean r0 = r3 instanceof X.AnonymousClass9HP     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            if (r0 == 0) goto L_0x01a5
            r5 = r3
            X.9HP r5 = (X.AnonymousClass9HP) r5     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
        L_0x019b:
            java.io.FileInputStream r0 = X.C108945cZ.A18(r5)     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            goto L_0x01af
        L_0x01a5:
            java.lang.String r0 = r3.getPath()     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            X.9HP r5 = new X.9HP     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01fb, IOException -> 0x01e7, all -> 0x0265 }
            goto L_0x019b
        L_0x01af:
            int r5 = r6.read(r15)     // Catch:{ FileNotFoundException -> 0x01e5, IOException -> 0x01e3 }
            if (r5 <= 0) goto L_0x01bb
            r0 = r16
            r0.update(r15, r1, r5)     // Catch:{ FileNotFoundException -> 0x01e5, IOException -> 0x01e3 }
            goto L_0x01af
        L_0x01bb:
            X.C197099w9.A00(r6)
            byte[] r11 = r16.digest()
            r0 = 64
        L_0x01c4:
            char[] r14 = new char[r0]
            r6 = 0
        L_0x01c7:
            int r0 = r11.length
            if (r6 >= r0) goto L_0x020f
            byte r0 = r11[r6]
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r6 * 2
            char[] r16 = X.C197099w9.A00
            int r0 = r15 >>> 4
            char r0 = r16[r0]
            r14[r5] = r0
            int r5 = r5 + 1
            r0 = r15 & 15
            char r0 = r16[r0]
            r14[r5] = r0
            int r6 = r6 + 1
            goto L_0x01c7
        L_0x01e3:
            r8 = move-exception
            goto L_0x01e9
        L_0x01e5:
            r8 = move-exception
            goto L_0x01fd
        L_0x01e7:
            r8 = move-exception
            r6 = r11
        L_0x01e9:
            java.lang.String r7 = "Couldn't read the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0267 }
            r5[r1] = r0     // Catch:{ all -> 0x0267 }
            X.C26294Cx6.A0D(r14, r7, r8, r5)     // Catch:{ all -> 0x0267 }
            X.C197099w9.A00(r6)
            goto L_0x00f8
        L_0x01fb:
            r8 = move-exception
            r6 = r11
        L_0x01fd:
            java.lang.String r7 = "Couldn't find the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0267 }
            r5[r1] = r0     // Catch:{ all -> 0x0267 }
            X.C26294Cx6.A0D(r14, r7, r8, r5)     // Catch:{ all -> 0x0267 }
            X.C197099w9.A00(r6)
            goto L_0x00f8
        L_0x020f:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r14)
            boolean r0 = android.text.TextUtils.equals(r11, r13)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r10 = X.AnonymousClass9OZ.A00(r17)
            java.lang.String r6 = "[%s]-%s asset hash match. Hash type: %s,"
            X.EAY r5 = X.C26294Cx6.A01
            r0 = 4
            boolean r0 = r5.BfN(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r9, r8, r10)
            X.C26294Cx6.A06(r7, r0)
        L_0x0230:
            r5 = 0
            goto L_0x0093
        L_0x0233:
            java.lang.String r6 = X.AnonymousClass9OZ.A00(r17)
            goto L_0x00d1
        L_0x0239:
            r3.delete()     // Catch:{ SecurityException -> 0x023d }
            goto L_0x0245
        L_0x023d:
            r2 = move-exception
            java.lang.String r1 = "DefaultAssetManager"
            java.lang.String r0 = "failed to delete corrupted downloaded asset."
            X.C26294Cx6.A0C(r1, r0, r2)
        L_0x0245:
            X.C20123A8i.A05(r4)
            return
        L_0x0249:
            if (r18 == 0) goto L_0x025c
            java.util.concurrent.Executor r5 = r4.A07
        L_0x024d:
            r4 = 17
            X.DTg r2 = new X.DTg
            r1 = r20
            r0 = r21
            r2.<init>(r3, r1, r0, r4)
            r5.execute(r2)
            return
        L_0x025c:
            java.util.concurrent.Executor r5 = r4.A06
            goto L_0x024d
        L_0x025f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0265:
            r0 = move-exception
            goto L_0x0269
        L_0x0267:
            r0 = move-exception
            r11 = r6
        L_0x0269:
            X.C197099w9.A00(r11)
            throw r0
        L_0x026d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0273:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0273 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190389kr.A00(X.AEq, X.9LV, java.io.File):void");
    }
}
