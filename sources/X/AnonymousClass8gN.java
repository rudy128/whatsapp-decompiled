package X;

import java.io.File;

/* renamed from: X.8gN  reason: invalid class name */
public final class AnonymousClass8gN extends C167478gO {
    public int A00;
    public final /* synthetic */ B73 A01;
    public final /* synthetic */ C36821oW A02;
    public final /* synthetic */ A7X A03;
    public final /* synthetic */ C19990A2d A04;
    public final /* synthetic */ File A05;

    public AnonymousClass8gN(B73 b73, C36821oW r2, A7X a7x, C19990A2d a2d, File file) {
        this.A03 = a7x;
        this.A05 = file;
        this.A04 = a2d;
        this.A01 = b73;
        this.A02 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: X.AQ8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: X.8gq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: X.8gq} */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0387, code lost:
        if (r4 == null) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0486, code lost:
        r35.A00 = r2 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0465 A[Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A01(int r37) {
        /*
            r36 = this;
            r25 = 0
            r12 = 1
            r35 = r36
            r0 = r35
            X.A7X r10 = r0.A03     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.io.File r13 = r0.A05     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.A2d r11 = r0.A04     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.B73 r9 = r0.A01     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.1oW r0 = r0.A02     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r34 = r0
            r8 = 0
            r26 = 2
            boolean r0 = r10.A0B()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "restore>gdrive-api/save-file/api disabled"
        L_0x001e:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0460
        L_0x0023:
            java.lang.String r1 = "restore>gdrive-api/save-file/check "
            java.lang.String r5 = r11.A05     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r13.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            long r2 = r11.A00     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            java.lang.String r0 = "restore>gdrive-api/save-file/check size cannot be negative, exiting."
        L_0x0034:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0460
        L_0x0039:
            boolean r0 = r13.exists()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 == 0) goto L_0x0053
            boolean r0 = r13.isDirectory()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r1.append(r13)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = " exists and is a directory, cannot proceed further."
        L_0x004e:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0034
        L_0x0053:
            java.io.File r4 = r13.getParentFile()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r4 == 0) goto L_0x0082
            boolean r0 = r4.exists()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 != 0) goto L_0x0082
            boolean r0 = r4.mkdirs()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 != 0) goto L_0x0082
            boolean r0 = r4.exists()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 != 0) goto L_0x0082
            X.9uB r2 = r10.A0A     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r1 = "gdrive-api/backup_failed_to_create"
            r0 = r25
            r2.A03(r1, r0, r12)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = "restore>gdrive-api/save-file/check failed to create "
            r1.append(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x004e
        L_0x0082:
            java.io.File r4 = r13.getParentFile()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = r13.getName()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r1.append(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = ".incomplete"
            java.io.File r24 = X.AnonymousClass8BW.A0X(r4, r0, r1)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            boolean r0 = r24.exists()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r7 = 1
            if (r0 != 0) goto L_0x00a2
            r24.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x00d6
        L_0x00a2:
            long r0 = r24.length()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bf
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r4 = "restore>gdrive-api/is-invalid-download-file/true size of a file ("
            r6.append(r4)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r6.append(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = ") is more than size of remote file "
            X.C17900vP.A0Y(r11, r0, r6)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r24.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x00d5
        L_0x00bf:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00d6
            long r0 = r24.length()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r6 = r11.A03     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.C18070vi.A0W(r6)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r4 = r24
            boolean r0 = X.A7X.A02(r10, r4, r6, r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 == 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            r14 = 0
            if (r7 != 0) goto L_0x00f5
            boolean r0 = r24.delete()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r0 != 0) goto L_0x00f9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = "restore>gdrive-api/delete-local-file/failed "
            r1.append(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r0 = r24.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.C17890vO.A19(r1, r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r24.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0460
        L_0x00f5:
            r24.length()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x00fc
        L_0x00f9:
            r24.getAbsolutePath()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x00fc:
            long r0 = r24.length()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x010f
            r2 = r24
            boolean r2 = X.A7X.A01(r10, r2, r13)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r2 == 0) goto L_0x0449
            long r2 = r11.A01     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x011c
        L_0x010f:
            r9.Bqp(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            boolean r4 = r34.A01()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r4 != 0) goto L_0x013c
            java.lang.String r0 = "restore>gdrive-api/save-file/failed-waiting-for-suitable-conditions"
            goto L_0x001e
        L_0x011c:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0121
            goto L_0x012a
        L_0x0121:
            boolean r2 = r13.setLastModified(r2)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            if (r2 != 0) goto L_0x0137
            java.lang.String r2 = "gdrive-api/setLastModifiedTime/failed"
            goto L_0x0134
        L_0x012a:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r4 = "gdrive-api/setLastModifiedTime remote file update time is:"
            java.lang.String r2 = X.C17890vO.A0a(r4, r5, r2)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x0134:
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x0137:
            r9.Bqp(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0462
        L_0x013c:
            r4 = 13
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.1D6[] r7 = new X.AnonymousClass1D6[r12]     // Catch:{ IOException -> 0x045a }
            java.lang.String r6 = "alt"
            java.lang.String r4 = "media"
            X.AnonymousClass1D6.A03(r6, r4, r7, r8)     // Catch:{ IOException -> 0x045a }
            java.util.LinkedHashMap r20 = X.AnonymousClass1D7.A0C(r7)     // Catch:{ IOException -> 0x045a }
            java.lang.String r17 = "GET"
            X.C18070vi.A0W(r5)     // Catch:{ IOException -> 0x045a }
            r4 = 0
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ URISyntaxException -> 0x0453 }
            java.lang.String r6 = "/v1/"
            java.lang.String r5 = X.AnonymousClass001.A1H(r6, r5, r7)     // Catch:{ URISyntaxException -> 0x0453 }
            java.lang.String r18 = X.AnonymousClass9PF.A00(r5)     // Catch:{ URISyntaxException -> 0x0453 }
            r16 = r10
            r19 = r4
            r21 = r8
            javax.net.ssl.HttpsURLConnection r23 = r16.A07(r17, r18, r19, r20, r21)     // Catch:{ URISyntaxException -> 0x0453 }
            X.A6M r6 = X.A6M.A00     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r23.getURL()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r23.getRequestMethod()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0193
            java.util.Locale r14 = java.util.Locale.ENGLISH     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.AnonymousClass3MX.A1S(r5, r8, r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r5, r12)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r5 = "bytes=%d-"
            java.lang.String r14 = X.C108955ca.A12(r14, r5, r7)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            java.lang.String r7 = "Range"
            r5 = r23
            r5.setRequestProperty(r7, r14)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r5.getRequestProperty(r7)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x0193:
            int r5 = r23.getResponseCode()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r7 = 200(0xc8, float:2.8E-43)
            if (r5 == r7) goto L_0x01fc
            r7 = 206(0xce, float:2.89E-43)
            if (r5 == r7) goto L_0x01fc
            r2 = 401(0x191, float:5.62E-43)
            java.lang.String r11 = " statusLine "
            java.lang.String r7 = "restore>gdrive-api/save-file status of the response is "
            if (r5 == r2) goto L_0x01f4
            r2 = 403(0x193, float:5.65E-43)
            if (r5 == r2) goto L_0x01ed
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.AnonymousClass000.A1E(r7, r11, r3, r5)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r2 = r23.getResponseMessage()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.C17890vO.A19(r3, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r7 = X.AnonymousClass8BT.A0w(r23)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r2 = "restore>gdrive-api/save-file "
            X.C17900vP.A0e(r2, r7, r3)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r2 = 404(0x194, float:5.66E-43)
            if (r5 == r2) goto L_0x035b
            r2 = 429(0x1ad, float:6.01E-43)
            if (r5 != r2) goto L_0x01cf
            goto L_0x01db
        L_0x01cf:
            X.9uB r3 = r10.A0A     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r2 = 8
            r3.A00(r2, r5, r7)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.8gq r4 = X.C167718gq.A00(r7)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x01ec
        L_0x01db:
            X.0ve r5 = r10.A09     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r3 = 916(0x394, float:1.284E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            boolean r5 = X.C18020vd.A05(r2, r5, r3)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r3 = "save-file"
            r2 = r23
            r6.A04(r3, r2, r5)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x01ec:
            throw r4     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x01ed:
            X.8ge r3 = new X.8ge     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r3.<init>()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x0360
        L_0x01f4:
            r23.getResponseMessage()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r10.A0A()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x042e
        L_0x01fc:
            r24.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r6 = "Content-Length"
            r5 = r23
            r5.getHeaderField(r6)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.11E r5 = r10.A07     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r33 = r5
            X.10I r6 = r10.A0B     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.00H r5 = X.C20134A8u.A00     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            android.os.Handler r14 = X.C17890vO.A0D()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.util.concurrent.atomic.AtomicBoolean r16 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r5 = r16
            r5.<init>(r12)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.io.InputStream r7 = r23.getInputStream()     // Catch:{ all -> 0x0390 }
            java.io.BufferedInputStream r22 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0390 }
            r5 = r22
            r5.<init>(r7)     // Catch:{ all -> 0x0390 }
            java.io.FileOutputStream r21 = new java.io.FileOutputStream     // Catch:{ all -> 0x037a }
            r7 = r21
            r5 = r24
            r7.<init>(r5, r12)     // Catch:{ all -> 0x037a }
            X.AQ8 r20 = new X.AQ8     // Catch:{ all -> 0x036c }
            r27 = r20
            r28 = r6
            r29 = r22
            r30 = r5
            r31 = r16
            r32 = r23
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x036c }
            r7 = 18
            r6 = r20
            r5 = r33
            X.C21453AkK.A00(r14, r5, r6, r7)     // Catch:{ all -> 0x036c }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0369 }
            r17 = r4
            r6 = 0
        L_0x024f:
            boolean r4 = r34.A01()     // Catch:{ all -> 0x0365 }
            if (r4 != 0) goto L_0x0260
            r4 = r16
            r4.set(r8)     // Catch:{ all -> 0x0365 }
            r23.disconnect()     // Catch:{ all -> 0x0365 }
            X.AnonymousClass1EY.A02(r22)     // Catch:{ all -> 0x0365 }
        L_0x0260:
            boolean r4 = r16.get()     // Catch:{ all -> 0x0365 }
            if (r4 != 0) goto L_0x028d
            java.util.Locale r19 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0365 }
            java.lang.String r18 = "gdrive-util/write-file/disconnected after downloading %d bytes from %s to %s (new size: %d)"
            r4 = 4
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x0365 }
            X.AnonymousClass3MX.A1S(r15, r8, r6)     // Catch:{ all -> 0x0365 }
            java.net.URL r4 = r23.getURL()     // Catch:{ all -> 0x0365 }
            r15[r12] = r4     // Catch:{ all -> 0x0365 }
            java.lang.String r4 = r24.getAbsolutePath()     // Catch:{ all -> 0x0365 }
            r15[r26] = r4     // Catch:{ all -> 0x0365 }
            long r16 = r24.length()     // Catch:{ all -> 0x0365 }
            r4 = r16
            X.C17890vO.A1O(r15, r4)     // Catch:{ all -> 0x0365 }
            r5 = r19
            r4 = r18
            X.C108955ca.A1X(r4, r5, r15)     // Catch:{ all -> 0x0365 }
            goto L_0x02aa
        L_0x028d:
            r15 = 8192(0x2000, float:1.14794E-41)
            r5 = r22
            r4 = r17
            int r15 = r5.read(r4, r8, r15)     // Catch:{ IllegalStateException -> 0x02a4 }
            if (r15 <= 0) goto L_0x02aa
            r5 = r21
            r5.write(r4, r8, r15)     // Catch:{ all -> 0x0365 }
            long r4 = (long) r15     // Catch:{ all -> 0x0365 }
            long r6 = r6 + r4
            r9.Bqp(r4)     // Catch:{ all -> 0x0365 }
            goto L_0x024f
        L_0x02a4:
            r5 = move-exception
            java.lang.String r4 = "gdrive-util/write-file/connection-disconnected-during-read"
            com.whatsapp.util.Log.i(r4, r5)     // Catch:{ all -> 0x0365 }
        L_0x02aa:
            r21.close()     // Catch:{ all -> 0x0361 }
            r22.close()     // Catch:{ all -> 0x038a }
            r15 = 19
            r5 = r20
            r4 = r33
            X.C21453AkK.A00(r14, r4, r5, r15)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            long r4 = -r6
            r9.Bqp(r4)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r24.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r24.length()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            long r5 = r24.length()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x02f5
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r4 = "restore>gdrive-api/"
            r6.append(r4)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r5 = "save-file/incomplete download, expected: %d bytes, received: %d bytes"
            r4 = r26
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.AnonymousClass3MX.A1S(r4, r8, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            long r2 = r24.length()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.AnonymousClass3MX.A1S(r4, r12, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r2 = r26
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r2 = X.C108955ca.A12(r7, r5, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.C17890vO.A1A(r6, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x042e
        L_0x02f5:
            long r2 = r24.length()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r5 = r11.A03     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.C18070vi.A0W(r5)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r4 = r24
            boolean r2 = X.A7X.A02(r10, r4, r5, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            if (r2 != 0) goto L_0x031e
            boolean r2 = r24.delete()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            if (r2 != 0) goto L_0x042e
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r2 = "restore>gdrive-api/delete-local-file/failed "
            r3.append(r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r2 = r24.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.C17890vO.A19(r3, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x042e
        L_0x031e:
            boolean r2 = X.A7X.A01(r10, r4, r13)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            if (r2 == 0) goto L_0x0351
            long r2 = r11.A01     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x033a
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            java.lang.String r4 = "gdrive-api/setLastModifiedTime remote file update time is:"
            java.lang.String r2 = X.C17890vO.A0a(r4, r5, r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x0336:
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x0343
        L_0x033a:
            boolean r2 = r13.setLastModified(r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            if (r2 != 0) goto L_0x0343
            java.lang.String r2 = "gdrive-api/setLastModifiedTime/failed"
            goto L_0x0336
        L_0x0343:
            r2 = -1
            long r2 = r2 * r0
            r9.Bqp(r2)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r23.disconnect()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0462
        L_0x0351:
            java.lang.String r2 = X.AnonymousClass8BS.A0i(r13)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            X.8gk r3 = new X.8gk     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r3.<init>(r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            goto L_0x0360
        L_0x035b:
            X.8gp r3 = new X.8gp     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            r3.<init>()     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x0360:
            throw r3     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x0361:
            r3 = move-exception
            r4 = r20
            goto L_0x037d
        L_0x0365:
            r3 = move-exception
            r4 = r20
            goto L_0x036f
        L_0x0369:
            r3 = move-exception
            r4 = r6
            goto L_0x036d
        L_0x036c:
            r3 = move-exception
        L_0x036d:
            r6 = 0
        L_0x036f:
            r21.close()     // Catch:{ all -> 0x0373 }
            goto L_0x0377
        L_0x0373:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ all -> 0x0378 }
        L_0x0377:
            throw r3     // Catch:{ all -> 0x0378 }
        L_0x0378:
            r3 = move-exception
            goto L_0x037d
        L_0x037a:
            r3 = move-exception
            r6 = 0
        L_0x037d:
            r22.close()     // Catch:{ all -> 0x0381 }
            goto L_0x0385
        L_0x0381:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ all -> 0x0386 }
        L_0x0385:
            throw r3     // Catch:{ all -> 0x0386 }
        L_0x0386:
            r5 = move-exception
            if (r4 == 0) goto L_0x0399
            goto L_0x038d
        L_0x038a:
            r5 = move-exception
            r4 = r20
        L_0x038d:
            r3 = 19
            goto L_0x0394
        L_0x0390:
            r5 = move-exception
            r6 = 0
            goto L_0x0399
        L_0x0394:
            r2 = r33
            X.C21453AkK.A00(r14, r2, r4, r3)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x0399:
            long r2 = -r6
            r9.Bqp(r2)     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
            throw r5     // Catch:{ UnknownHostException -> 0x041a, IOException -> 0x039e }
        L_0x039e:
            r3 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x043b }
            java.lang.String r2 = "restore>gdrive-api/save-file error while downloading file "
            X.C108995ce.A1J(r13, r2, r4, r3)     // Catch:{ all -> 0x043b }
            java.lang.String r4 = r3.getMessage()     // Catch:{ all -> 0x043b }
            if (r4 == 0) goto L_0x03dc
            java.lang.String r2 = "ENOSPC"
            boolean r2 = X.AnonymousClass1YF.A0Y(r4, r2, r8)     // Catch:{ all -> 0x043b }
            if (r2 != 0) goto L_0x03d1
            java.lang.String r2 = "ENAMETOOLONG"
            boolean r2 = X.AnonymousClass1YF.A0Y(r4, r2, r8)     // Catch:{ all -> 0x043b }
            if (r2 != 0) goto L_0x03c6
            java.lang.String r2 = "(File name too long)"
            boolean r2 = X.AnonymousClass1YF.A0Y(r4, r2, r8)     // Catch:{ all -> 0x043b }
            if (r2 == 0) goto L_0x03dc
        L_0x03c6:
            java.lang.String r2 = "restore>gdrive-api/save-file name too long"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x043b }
            X.8gp r2 = new X.8gp     // Catch:{ all -> 0x043b }
            r2.<init>((java.lang.String) r4)     // Catch:{ all -> 0x043b }
        L_0x03d0:
            throw r2     // Catch:{ all -> 0x043b }
        L_0x03d1:
            java.lang.String r2 = "restore>gdrive-api/save-file no space left on the device."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x043b }
            X.8gi r2 = new X.8gi     // Catch:{ all -> 0x043b }
            r2.<init>()     // Catch:{ all -> 0x043b }
            goto L_0x03d0
        L_0x03dc:
            X.1L7 r2 = r10.A08     // Catch:{ all -> 0x043b }
            boolean r2 = r2.A0D(r13)     // Catch:{ all -> 0x043b }
            if (r2 == 0) goto L_0x03f2
            X.1NW r2 = r10.A03     // Catch:{ all -> 0x043b }
            boolean r2 = r2.A03()     // Catch:{ all -> 0x043b }
            if (r2 != 0) goto L_0x03f2
            X.8gm r2 = new X.8gm     // Catch:{ all -> 0x043b }
            r2.<init>(r3)     // Catch:{ all -> 0x043b }
            goto L_0x03d0
        L_0x03f2:
            if (r4 == 0) goto L_0x042e
            java.lang.String r2 = "EACCES"
            boolean r2 = X.AnonymousClass1YF.A0Y(r4, r2, r8)     // Catch:{ all -> 0x043b }
            if (r2 != 0) goto L_0x040f
            java.lang.String r2 = "EPERM"
            boolean r2 = X.AnonymousClass1YF.A0Y(r4, r2, r8)     // Catch:{ all -> 0x043b }
            if (r2 == 0) goto L_0x042e
            java.lang.String r2 = "restore>gdrive-api/save-file EPERM"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x043b }
            X.8gj r2 = new X.8gj     // Catch:{ all -> 0x043b }
            r2.<init>(r3)     // Catch:{ all -> 0x043b }
            goto L_0x03d0
        L_0x040f:
            java.lang.String r2 = "restore>gdrive-api/save-file EACCES"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x043b }
            X.8gm r2 = new X.8gm     // Catch:{ all -> 0x043b }
            r2.<init>(r3)     // Catch:{ all -> 0x043b }
            goto L_0x03d0
        L_0x041a:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x043b }
            java.lang.String r2 = "restore>gdrive-api/save-file unable to access "
            r3.append(r2)     // Catch:{ all -> 0x043b }
            java.net.URL r2 = r23.getURL()     // Catch:{ all -> 0x043b }
            r3.append(r2)     // Catch:{ all -> 0x043b }
            X.C17880vN.A1M(r3, r4)     // Catch:{ all -> 0x043b }
        L_0x042e:
            r2 = -1
            long r2 = r2 * r0
            r9.Bqp(r2)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r23.disconnect()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0460
        L_0x043b:
            r4 = move-exception
            r2 = -1
            long r2 = r2 * r0
            r9.Bqp(r2)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r23.disconnect()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            goto L_0x0452
        L_0x0449:
            java.lang.String r0 = X.AnonymousClass8BS.A0i(r13)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            X.8gk r4 = new X.8gk     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            r4.<init>(r0)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x0452:
            throw r4     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x0453:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x045a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x045a }
            throw r0     // Catch:{ IOException -> 0x045a }
        L_0x045a:
            r1 = move-exception
            java.lang.String r0 = "restore>gdrive-api/save-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
        L_0x0460:
            r0 = 0
            goto L_0x0463
        L_0x0462:
            r0 = 1
        L_0x0463:
            if (r0 == 0) goto L_0x048c
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r12)     // Catch:{ 8gj -> 0x0478, 8gk -> 0x046a }
            return r25
        L_0x046a:
            r1 = move-exception
            r0 = r35
            int r2 = r0.A00
            r0 = 5
            if (r2 <= r0) goto L_0x0486
            X.8gp r0 = new X.8gp
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0478:
            r1 = move-exception
            r0 = r35
            int r2 = r0.A00
            r0 = 5
            if (r2 <= r0) goto L_0x0486
            X.8gp r0 = new X.8gp
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0486:
            int r1 = r2 + 1
            r0 = r35
            r0.A00 = r1
        L_0x048c:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gN.A01(int):java.lang.Object");
    }
}
