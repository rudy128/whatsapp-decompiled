package X;

/* renamed from: X.83H  reason: invalid class name */
public final class AnonymousClass83H extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $name;
    public final /* synthetic */ C22821Di $onError;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ int $version;
    public final /* synthetic */ C136196tQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83H(C136196tQ r2, String str, String str2, C22821Di r5, C22821Di r6, int i) {
        super(1);
        this.$name = str;
        this.$version = i;
        this.this$0 = r2;
        this.$onSuccess = r5;
        this.$key = str2;
        this.$onError = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x029d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        X.CDX.A00(r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x036d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x036e, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0371, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0144, code lost:
        r15.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0156, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r15, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015a, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0161, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0221, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.CDX.A00(r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0225, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r29
            X.1eK r0 = (X.C30671eK) r0
            java.lang.Object r0 = r0.value
            r22 = r0
            r4 = r28
            java.lang.String r5 = r4.$name
            int r3 = r4.$version
            X.6tQ r2 = r4.this$0
            X.1Di r0 = r4.$onSuccess
            r21 = r0
            java.lang.String r0 = r4.$key
            r27 = r0
            X.1Di r0 = r4.$onError
            r20 = r0
            r0 = r22
            boolean r0 = r0 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            java.lang.String r1 = " #"
            if (r0 == 0) goto L_0x03a3
            r9 = r22
            X.6u0 r9 = (X.C136556u0) r9
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MLModelManager/fetchModel/found ml model metadata for "
            r6.append(r0)
            X.C108995ce.A1L(r5, r6, r3)
            X.6gJ r10 = r2.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r9.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "MLModelDownloaderImpl/downloadModel/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0051 }
            X.1D9 r6 = r10.A01     // Catch:{ all -> 0x0051 }
            X.18j r0 = r10.A02     // Catch:{ all -> 0x0051 }
            r8 = 0
            X.AUZ r7 = r6.A05(r8, r0, r7, r8)     // Catch:{ all -> 0x0051 }
            X.181 r6 = r10.A00     // Catch:{ all -> 0x0051 }
            r0 = 36
            X.9Hb r19 = X.C108955ca.A0N(r6, r7, r8, r0)     // Catch:{ all -> 0x0051 }
            goto L_0x0056
        L_0x0051:
            r0 = move-exception
            X.1IU r19 = X.C108945cZ.A1J(r0)
        L_0x0056:
            r0 = r19
            boolean r0 = r0 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0377
            r6 = r19
            java.io.InputStream r6 = (java.io.InputStream) r6
            X.6y8 r8 = r2.A01     // Catch:{ all -> 0x030c }
            r0 = 0
            X.AnonymousClass3Ma.A1O(r5, r0, r9)     // Catch:{ all -> 0x030c }
            java.util.Map r0 = r8.A03     // Catch:{ all -> 0x030c }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x030c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x030c }
            r12 = 0
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r10 = X.AnonymousClass000.A0w(r0, r3)     // Catch:{ all -> 0x030c }
            X.6zd r10 = (X.C139906zd) r10     // Catch:{ all -> 0x030c }
        L_0x0079:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/deleting model file for "
            r7.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r7, r3)     // Catch:{ all -> 0x030c }
            java.io.File r11 = r8.A01(r5, r3)     // Catch:{ all -> 0x030c }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x00b7
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModel/deleting model file for "
            r7.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r7, r3)     // Catch:{ all -> 0x030c }
            r11.delete()     // Catch:{ all -> 0x030c }
        L_0x009e:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/Old model removed for "
            r7.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r7, r3)     // Catch:{ all -> 0x030c }
            X.0ve r0 = r8.A02     // Catch:{ all -> 0x030c }
            r26 = r0
            r11 = 12439(0x3097, float:1.7431E-41)
            X.0vf r7 = X.C18040vf.A02     // Catch:{ all -> 0x030c }
            boolean r0 = X.C18020vd.A05(r7, r0, r11)     // Catch:{ all -> 0x030c }
            goto L_0x00c6
        L_0x00b7:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModel/model file not found for "
            r7.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r7, r3)     // Catch:{ all -> 0x030c }
            goto L_0x009e
        L_0x00c4:
            r10 = r12
            goto L_0x0079
        L_0x00c6:
            if (r0 == 0) goto L_0x00f5
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/Enabled ML Model download to temp file for "
            r11.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r11, r3)     // Catch:{ all -> 0x030c }
            java.lang.String r12 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x02f9 }
            X.118 r0 = r8.A01     // Catch:{ IOException -> 0x02f9 }
            java.io.File r11 = X.C108945cZ.A16(r0)     // Catch:{ IOException -> 0x02f9 }
            java.lang.String r0 = "ML_MODEL"
            java.io.File r11 = X.C17880vN.A0e(r11, r0)     // Catch:{ IOException -> 0x02f9 }
            boolean r0 = r11.exists()     // Catch:{ IOException -> 0x02f9 }
            if (r0 != 0) goto L_0x00ed
            r11.mkdir()     // Catch:{ IOException -> 0x02f9 }
        L_0x00ed:
            java.io.File r18 = java.io.File.createTempFile(r5, r12, r11)     // Catch:{ IOException -> 0x02f9 }
            X.C18070vi.A0X(r18)     // Catch:{ IOException -> 0x02f9 }
            goto L_0x0127
        L_0x00f5:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/Get model file "
            r11.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r11, r3)     // Catch:{ all -> 0x030c }
            java.io.File r18 = r8.A01(r5, r3)     // Catch:{ all -> 0x030c }
            java.io.File r0 = r18.getParentFile()     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x0113
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x030c }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x030c }
        L_0x0113:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/Created file path "
            X.C108985cd.A1K(r0, r5, r11, r3)     // Catch:{ all -> 0x030c }
            java.lang.String r0 = " result = "
            r11.append(r0)     // Catch:{ all -> 0x030c }
            r11.append(r12)     // Catch:{ all -> 0x030c }
            X.C17890vO.A1A(r11, r1)     // Catch:{ all -> 0x030c }
        L_0x0127:
            boolean r0 = r6 instanceof java.io.BufferedInputStream     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x012f
            r12 = r6
            java.io.BufferedInputStream r12 = (java.io.BufferedInputStream) r12     // Catch:{ all -> 0x0162 }
            goto L_0x0136
        L_0x012f:
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0162 }
            r12.<init>(r6, r0)     // Catch:{ all -> 0x0162 }
        L_0x0136:
            java.io.FileOutputStream r15 = X.C108945cZ.A19(r18)     // Catch:{ all -> 0x015b }
        L_0x013a:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r0]     // Catch:{ all -> 0x0154 }
            int r13 = r12.read(r14)     // Catch:{ all -> 0x0154 }
            if (r13 >= 0) goto L_0x0148
            r15.flush()     // Catch:{ all -> 0x0154 }
            goto L_0x014d
        L_0x0148:
            r0 = 0
            r15.write(r14, r0, r13)     // Catch:{ all -> 0x0154 }
            goto L_0x013a
        L_0x014d:
            r15.close()     // Catch:{ all -> 0x015b }
            r12.close()     // Catch:{ all -> 0x0162 }
            goto L_0x0184
        L_0x0154:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r11 = move-exception
            X.CDX.A00(r15, r13)     // Catch:{ all -> 0x015b }
            throw r11     // Catch:{ all -> 0x015b }
        L_0x015b:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x015d }
        L_0x015d:
            r0 = move-exception
            X.CDX.A00(r12, r11)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r12 = move-exception
            X.190 r0 = r8.A00     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r14 = r0
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = r12.getMessage()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r11.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r0 = 10
            r11.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = X.C25359CeJ.A00(r12)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r13 = X.AnonymousClass000.A0y(r0, r11)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r12 = 1
            java.lang.String r11 = "MLModelCacheManagerImpl/writeFile"
            r14.A0G(r11, r13, r12)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
        L_0x0184:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/write model file done for "
            r11.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C108995ce.A1L(r5, r11, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r11 = 11454(0x2cbe, float:1.605E-41)
            r0 = r26
            boolean r0 = X.C18020vd.A05(r7, r0, r11)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            if (r0 == 0) goto L_0x0226
            java.lang.String r11 = r9.A00     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "EXECUTORCH"
            boolean r0 = X.C18070vi.A18(r11, r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            if (r0 == 0) goto L_0x0226
            if (r10 != 0) goto L_0x0226
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/verifying model file MD5 hash for "
            r10.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C108995ce.A1L(r5, r10, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.io.FileInputStream r12 = X.C108945cZ.A18(r18)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x029b }
            r25 = r0
            boolean r0 = r12 instanceof java.io.BufferedInputStream     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x01c2
            r13 = r12
            java.io.BufferedInputStream r13 = (java.io.BufferedInputStream) r13     // Catch:{ all -> 0x029b }
            goto L_0x01c9
        L_0x01c2:
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ all -> 0x029b }
            r13.<init>(r12, r0)     // Catch:{ all -> 0x029b }
        L_0x01c9:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x021f }
        L_0x01cf:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x021f }
            int r10 = r13.read(r11)     // Catch:{ all -> 0x021f }
            if (r10 < 0) goto L_0x01de
            r9 = 0
            r14.update(r11, r9, r10)     // Catch:{ all -> 0x021f }
            goto L_0x01cf
        L_0x01de:
            byte[] r17 = r14.digest()     // Catch:{ all -> 0x021f }
            X.C18070vi.A0X(r17)     // Catch:{ all -> 0x021f }
            java.lang.String r9 = ""
            r0 = r17
            int r0 = r0.length     // Catch:{ all -> 0x021f }
            r24 = r0
            r14 = 0
        L_0x01ed:
            r0 = r24
            if (r14 >= r0) goto L_0x0214
            byte r10 = r17[r14]     // Catch:{ all -> 0x021f }
            java.lang.StringBuilder r16 = X.AnonymousClass000.A11(r9)     // Catch:{ all -> 0x021f }
            java.lang.String r11 = "%02x"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x021f }
            r23 = r0
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)     // Catch:{ all -> 0x021f }
            r9 = 0
            r0 = 1
            r15 = r10
            r10 = r23
            java.lang.String r9 = X.C108995ce.A0Y(r15, r11, r10, r9, r0)     // Catch:{ all -> 0x021f }
            r0 = r16
            java.lang.String r9 = X.AnonymousClass000.A0y(r9, r0)     // Catch:{ all -> 0x021f }
            int r14 = r14 + 1
            goto L_0x01ed
        L_0x0214:
            r13.close()     // Catch:{ all -> 0x029b }
            r10 = 1
            r0 = r25
            boolean r0 = X.AnonymousClass1YE.A09(r0, r9, r10)     // Catch:{ all -> 0x029b }
            goto L_0x023e
        L_0x021f:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0221 }
        L_0x0221:
            r0 = move-exception
            X.CDX.A00(r13, r8)     // Catch:{ all -> 0x029b }
            throw r0     // Catch:{ all -> 0x029b }
        L_0x0226:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/verifying model file SHA256 hash for "
            r9.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C108995ce.A1L(r5, r9, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            if (r10 == 0) goto L_0x02a2
            java.io.FileInputStream r12 = X.C108945cZ.A18(r18)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x029b }
            boolean r0 = X.C139056y8.A00(r12, r0)     // Catch:{ all -> 0x029b }
        L_0x023e:
            r12.close()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            if (r0 == 0) goto L_0x0289
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/model file updated for "
            r9.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C108995ce.A1L(r5, r9, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r9 = 12439(0x3097, float:1.7431E-41)
            r0 = r26
            boolean r0 = X.C18020vd.A05(r7, r0, r9)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            if (r0 == 0) goto L_0x0280
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/Enabled ml model download to temp file for "
            r9.append(r0)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C108995ce.A1L(r5, r9, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.io.File r8 = r8.A01(r5, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.io.File r0 = r8.getParentFile()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            if (r0 == 0) goto L_0x0272
            r0.mkdirs()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
        L_0x0272:
            r0 = r18
            r0.renameTo(r8)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r9 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C18070vi.A0X(r9)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            goto L_0x0311
        L_0x0280:
            java.lang.String r9 = r18.getCanonicalPath()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C18070vi.A0X(r9)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            goto L_0x0311
        L_0x0289:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/hash verification failed for "
            X.C108985cd.A1K(r0, r5, r8, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C17890vO.A19(r8, r1)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r18.delete()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.6AZ r0 = X.AnonymousClass6AZ.A00     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            throw r0     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
        L_0x029b:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x029d }
        L_0x029d:
            r0 = move-exception
            X.CDX.A00(r12, r8)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            throw r0     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
        L_0x02a2:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/model hash not found for "
            X.C108985cd.A1K(r0, r5, r8, r3)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.C17890vO.A19(r8, r1)     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            r18.delete()     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            X.6AY r0 = X.AnonymousClass6AY.A00     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
            throw r0     // Catch:{ IOException -> 0x02c7, NoSuchAlgorithmException -> 0x02b4 }
        L_0x02b4:
            r8 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/NoSuchAlgorithmException for "
            X.C108985cd.A1K(r0, r5, r7, r3)     // Catch:{ all -> 0x030c }
            X.C108985cd.A1M(r1, r7, r8)     // Catch:{ all -> 0x030c }
            X.6AW r0 = new X.6AW     // Catch:{ all -> 0x030c }
            r0.<init>(r8)     // Catch:{ all -> 0x030c }
            goto L_0x030b
        L_0x02c7:
            r9 = move-exception
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/IOException for "
            X.C108985cd.A1K(r0, r5, r8, r3)     // Catch:{ all -> 0x030c }
            X.C108985cd.A1M(r1, r8, r9)     // Catch:{ all -> 0x030c }
            r8 = 12439(0x3097, float:1.7431E-41)
            r0 = r26
            boolean r0 = X.C18020vd.A05(r7, r0, r8)     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x02f3
            boolean r0 = r18.exists()     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x02f3
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/remove temp file for "
            r7.append(r0)     // Catch:{ all -> 0x030c }
            X.C108995ce.A1L(r5, r7, r3)     // Catch:{ all -> 0x030c }
            r18.delete()     // Catch:{ all -> 0x030c }
        L_0x02f3:
            X.6AX r0 = new X.6AX     // Catch:{ all -> 0x030c }
            r0.<init>(r9)     // Catch:{ all -> 0x030c }
            goto L_0x030b
        L_0x02f9:
            r8 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/Error on Enabled ML model download to temp file "
            X.C108985cd.A1K(r0, r5, r7, r3)     // Catch:{ all -> 0x030c }
            X.C108985cd.A1M(r1, r7, r8)     // Catch:{ all -> 0x030c }
            X.6AX r0 = new X.6AX     // Catch:{ all -> 0x030c }
            r0.<init>(r8)     // Catch:{ all -> 0x030c }
        L_0x030b:
            throw r0     // Catch:{ all -> 0x030c }
        L_0x030c:
            r0 = move-exception
            X.1IU r9 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x036b }
        L_0x0311:
            boolean r0 = r9 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x036b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x033e
            r8 = r9
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x036b }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x036b }
            java.lang.String r0 = "MLModelManager/fetchModel/updated ml model file into cache for "
            r7.append(r0)     // Catch:{ all -> 0x036b }
            X.C108995ce.A1L(r5, r7, r3)     // Catch:{ all -> 0x036b }
            if (r21 == 0) goto L_0x032d
            r0 = r21
            r0.invoke(r8)     // Catch:{ all -> 0x036b }
        L_0x032d:
            X.1DT r7 = r2.A00     // Catch:{ all -> 0x036b }
            X.7Jt r0 = new X.7Jt     // Catch:{ all -> 0x036b }
            r0.<init>(r5, r3, r8)     // Catch:{ all -> 0x036b }
            r7.A0E(r0)     // Catch:{ all -> 0x036b }
            java.util.Set r7 = r2.A04     // Catch:{ all -> 0x036b }
            r0 = r27
            r7.remove(r0)     // Catch:{ all -> 0x036b }
        L_0x033e:
            java.lang.Throwable r0 = X.C30671eK.A00(r9)     // Catch:{ all -> 0x036b }
            if (r0 == 0) goto L_0x0372
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x036b }
            java.lang.String r0 = "MLModelManager/fetchModel/updated ml model file into cache failed for "
            X.C108985cd.A1K(r0, r5, r7, r3)     // Catch:{ all -> 0x036b }
            X.C17890vO.A19(r7, r1)     // Catch:{ all -> 0x036b }
            X.6Aa r8 = X.C119816Aa.A00     // Catch:{ all -> 0x036b }
            if (r20 == 0) goto L_0x0359
            r0 = r20
            r0.invoke(r8)     // Catch:{ all -> 0x036b }
        L_0x0359:
            X.1DT r7 = r2.A00     // Catch:{ all -> 0x036b }
            X.7Js r0 = new X.7Js     // Catch:{ all -> 0x036b }
            r0.<init>(r8, r5, r3)     // Catch:{ all -> 0x036b }
            r7.A0E(r0)     // Catch:{ all -> 0x036b }
            java.util.Set r7 = r2.A04     // Catch:{ all -> 0x036b }
            r0 = r27
            r7.remove(r0)     // Catch:{ all -> 0x036b }
            goto L_0x0372
        L_0x036b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x036d }
        L_0x036d:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x0372:
            if (r6 == 0) goto L_0x0377
            r6.close()
        L_0x0377:
            java.lang.Throwable r7 = X.C30671eK.A00(r19)
            if (r7 == 0) goto L_0x03a3
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MLModelManager/fetchModel/downloading ml model file failed for "
            X.C108985cd.A1K(r0, r5, r6, r3)
            X.C108985cd.A1M(r1, r6, r7)
            X.6Ab r7 = X.C119826Ab.A00
            if (r20 == 0) goto L_0x0392
            r0 = r20
            r0.invoke(r7)
        L_0x0392:
            X.1DT r6 = r2.A00
            X.7Js r0 = new X.7Js
            r0.<init>(r7, r5, r3)
            r6.A0E(r0)
            java.util.Set r2 = r2.A04
            r0 = r27
            r2.remove(r0)
        L_0x03a3:
            java.lang.String r8 = r4.$name
            int r7 = r4.$version
            X.1Di r6 = r4.$onError
            X.6tQ r5 = r4.this$0
            java.lang.String r4 = r4.$key
            java.lang.Throwable r3 = X.C30671eK.A00(r22)
            if (r3 == 0) goto L_0x03d5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MLModelManager/fetchModel/ml model url not found for "
            X.C108985cd.A1K(r0, r8, r2, r7)
            X.C108985cd.A1M(r1, r2, r3)
            X.6Ac r2 = X.C119836Ac.A00
            if (r6 == 0) goto L_0x03c6
            r6.invoke(r2)
        L_0x03c6:
            X.1DT r1 = r5.A00
            X.7Js r0 = new X.7Js
            r0.<init>(r2, r8, r7)
            r1.A0E(r0)
            java.util.Set r0 = r5.A04
            r0.remove(r4)
        L_0x03d5:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83H.invoke(java.lang.Object):java.lang.Object");
    }
}
