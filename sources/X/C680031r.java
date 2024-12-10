package X;

/* renamed from: X.31r  reason: invalid class name and case insensitive filesystem */
public class C680031r implements C1605688z {
    public final AnonymousClass181 A00;
    public final C18030ve A01;
    public final C63832tl A02;
    public final C220418j A03;
    public final AnonymousClass11W A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11E A07;
    public final AnonymousClass11P A08;
    public final C27511Wj A09;

    public void CHI(C25847Cn3 cn3, boolean z) {
        CHK(cn3, 0, z, false);
    }

    public void CHK(C25847Cn3 cn3, int i, boolean z, boolean z2) {
        A00(cn3, i, z, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if ((r3 - r2.A05.A05[r2.A02].A04) > 600) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        if (r29.size() <= 0) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0226, code lost:
        r40.A04(r29);
        r41.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0230, code lost:
        if (r47 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0232, code lost:
        if (r4 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0234, code lost:
        A00(r41, r35, r38, r39, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0241, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04f0 A[LOOP:0: B:27:0x0084->B:209:0x04f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x021c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C25847Cn3 r43, int r44, boolean r45, boolean r46, boolean r47) {
        /*
            r42 = this;
            r5 = r42
            X.11E r0 = r5.A07
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0069
            X.2tl r6 = r5.A02
            int r1 = r6.A05()
            r0 = 2
            r41 = r43
            r38 = r45
            if (r1 == r0) goto L_0x005a
            r0 = 13
            if (r1 == r0) goto L_0x005a
            r0 = 15
            if (r1 == r0) goto L_0x005a
            if (r47 != 0) goto L_0x005a
            r0 = r41
            X.CcQ r7 = r0.A04
            boolean r0 = r7.A06()
            if (r0 != 0) goto L_0x005a
            boolean r0 = r41.A07()
            if (r0 != 0) goto L_0x005a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r2.toSeconds(r0)
            if (r45 != 0) goto L_0x0057
            r0 = r41
            int r1 = r0.A03
            r0 = 3
            if (r1 == r0) goto L_0x0057
            X.CcL r2 = r7.A00
            X.CT0 r0 = r2.A05
            X.CSz[] r1 = r0.A05
            int r0 = r2.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r3 = r3 - r0
            r1 = 600(0x258, double:2.964E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
        L_0x0057:
            r41.A04()
        L_0x005a:
            r0 = r41
            X.CcQ r0 = r0.A04
            r40 = r0
            boolean r0 = r40.A06()
            if (r0 != 0) goto L_0x006a
            r6.A06()
        L_0x0069:
            return
        L_0x006a:
            r0 = r41
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0073
            r41.A03()
        L_0x0073:
            android.util.SparseArray r30 = r40.A00()
            int r0 = r30.size()
            java.util.ArrayList r29 = X.C17880vN.A0z(r0)
            r30.size()
            r4 = 0
            r15 = 0
        L_0x0084:
            int r0 = r30.size()
            r35 = r44
            r39 = r46
            if (r15 >= r0) goto L_0x0220
            r0 = r30
            int r28 = r0.keyAt(r15)
            r1 = r0
            r0 = r28
            java.lang.Object r9 = r1.get(r0)
            byte[] r9 = (byte[]) r9
            r0 = r41
            int r1 = r0.A03
            r0 = 3
            r7 = 1
            boolean r27 = X.AnonymousClass000.A1T(r1, r0)
            long r16 = android.os.SystemClock.elapsedRealtime()
            java.lang.Integer r26 = X.C17880vN.A0l()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            r1 = r26
            r0 = r25
            android.util.Pair r2 = android.util.Pair.create(r1, r0)
            monitor-enter(r6)
            boolean r0 = X.C63832tl.A04(r6)     // Catch:{ all -> 0x04f4 }
            r10 = 0
            if (r0 != 0) goto L_0x0121
            X.2tM r11 = r6.A05     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences r1 = X.C63582tM.A00(r11)     // Catch:{ all -> 0x04f4 }
            java.lang.String r0 = "original_token"
            java.lang.String r24 = r1.getString(r0, r10)     // Catch:{ all -> 0x04f4 }
            if (r24 == 0) goto L_0x0106
            android.content.SharedPreferences r3 = X.C63582tM.A00(r11)     // Catch:{ all -> 0x04f4 }
            java.lang.String r1 = "redeem_count"
            r0 = -1
            int r8 = r3.getInt(r1, r0)     // Catch:{ all -> 0x04f4 }
            X.11P r0 = r6.A03     // Catch:{ all -> 0x04f4 }
            long r18 = X.AnonymousClass11P.A00(r0)     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences r12 = X.C63582tM.A00(r11)     // Catch:{ all -> 0x04f4 }
            java.lang.String r3 = "base_timestamp"
            r0 = 0
            long r12 = r12.getLong(r3, r0)     // Catch:{ all -> 0x04f4 }
            long r18 = r18 - r12
            if (r8 < 0) goto L_0x0106
            r3 = 512(0x200, float:7.175E-43)
            if (r8 >= r3) goto L_0x0106
            android.content.SharedPreferences r8 = X.C63582tM.A00(r11)     // Catch:{ all -> 0x04f4 }
            java.lang.String r3 = "time_to_live"
            long r12 = r8.getLong(r3, r0)     // Catch:{ all -> 0x04f4 }
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            goto L_0x0125
        L_0x0106:
            boolean r0 = r6.A0E     // Catch:{ all -> 0x04f4 }
            if (r0 != 0) goto L_0x010f
            r6.A0E = r7     // Catch:{ all -> 0x04f4 }
            r6.A07(r4)     // Catch:{ all -> 0x04f4 }
        L_0x010f:
            android.content.SharedPreferences r1 = X.C63582tM.A00(r11)     // Catch:{ all -> 0x04f4 }
            java.lang.String r0 = "token_not_ready_reason"
            int r0 = r1.getInt(r0, r4)     // Catch:{ all -> 0x04f4 }
            if (r0 != 0) goto L_0x0121
            r0 = 13
            r11.A05(r0)     // Catch:{ all -> 0x04f4 }
        L_0x0121:
            monitor-exit(r6)
            r24 = r10
            goto L_0x0126
        L_0x0125:
            monitor-exit(r6)
        L_0x0126:
            r23 = 0
            if (r24 == 0) goto L_0x01d2
            monitor-enter(r6)
            X.2tM r13 = r6.A05     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences r1 = X.C63582tM.A00(r13)     // Catch:{ all -> 0x04f4 }
            java.lang.String r0 = "shared_secret"
            java.lang.String r1 = r1.getString(r0, r10)     // Catch:{ all -> 0x04f4 }
            if (r1 == 0) goto L_0x01bc
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x04f4 }
            if (r0 == 0) goto L_0x01bc
            byte[] r12 = X.AnonymousClass9QC.A00(r9, r0)     // Catch:{ Exception -> 0x01b1 }
            if (r12 == 0) goto L_0x01c5
            android.content.SharedPreferences r1 = X.C63582tM.A00(r13)     // Catch:{ all -> 0x04f4 }
            java.lang.String r3 = "redeem_count"
            r0 = -1
            int r0 = r1.getInt(r3, r0)     // Catch:{ all -> 0x04f4 }
            int r0 = r0 + 1
            r13.A04(r0)     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences r1 = X.C63582tM.A00(r13)     // Catch:{ all -> 0x04f4 }
            r0 = -1
            int r22 = r1.getInt(r3, r0)     // Catch:{ all -> 0x04f4 }
            X.18O r1 = r6.A01     // Catch:{ all -> 0x04f4 }
            X.18Q r0 = X.AnonymousClass18O.A08     // Catch:{ all -> 0x04f4 }
            int r14 = r1.A04(r0)     // Catch:{ all -> 0x04f4 }
            X.18Q r0 = X.AnonymousClass18O.A07     // Catch:{ all -> 0x04f4 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x04f4 }
            long r10 = (long) r0     // Catch:{ all -> 0x04f4 }
            X.11P r0 = r6.A03     // Catch:{ all -> 0x04f4 }
            long r20 = X.AnonymousClass11P.A00(r0)     // Catch:{ all -> 0x04f4 }
            android.content.SharedPreferences r8 = X.C63582tM.A00(r13)     // Catch:{ all -> 0x04f4 }
            java.lang.String r3 = "base_timestamp"
            r0 = 0
            long r18 = r8.getLong(r3, r0)     // Catch:{ all -> 0x04f4 }
            long r20 = r20 - r18
            boolean r3 = r6.A0E     // Catch:{ all -> 0x04f4 }
            if (r3 != 0) goto L_0x01aa
            r3 = r22
            if (r3 >= r14) goto L_0x019c
            android.content.SharedPreferences r8 = X.C63582tM.A00(r13)     // Catch:{ all -> 0x04f4 }
            java.lang.String r3 = "time_to_live"
            long r13 = r8.getLong(r3, r0)     // Catch:{ all -> 0x04f4 }
            long r13 = r13 - r10
            int r0 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01aa
        L_0x019c:
            r6.A0E = r7     // Catch:{ all -> 0x04f4 }
            X.10I r3 = r6.A07     // Catch:{ all -> 0x04f4 }
            r1 = 25
            X.7Ql r0 = new X.7Ql     // Catch:{ all -> 0x04f4 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x04f4 }
            r3.CGF(r0)     // Catch:{ all -> 0x04f4 }
        L_0x01aa:
            r0 = 10
            java.lang.String r10 = android.util.Base64.encodeToString(r12, r0)     // Catch:{ all -> 0x04f4 }
            goto L_0x01c5
        L_0x01b1:
            r1 = move-exception
            r0 = 6
            r13.A05(r0)     // Catch:{ all -> 0x04f4 }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC failed to compute hmac"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04f4 }
            goto L_0x01c5
        L_0x01bc:
            r0 = 3
            r13.A05(r0)     // Catch:{ all -> 0x04f4 }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC sharedSecret is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f4 }
        L_0x01c5:
            monitor-exit(r6)
            if (r10 == 0) goto L_0x01d2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)
            java.lang.String r0 = "+"
            java.lang.String r23 = X.AnonymousClass001.A1H(r0, r10, r1)
        L_0x01d2:
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            if (r0 == 0) goto L_0x0256
            java.lang.String r0 = "PrivateStatsUploader/doUpload no valid auth token, abort uploading"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A05()
            android.util.Pair r2 = X.C17890vO.A0F(r1, r0)
        L_0x01ea:
            long r36 = android.os.SystemClock.elapsedRealtime()
            long r36 = r36 - r16
            java.lang.Object r0 = r2.first
            int r3 = X.AnonymousClass000.A0M(r0)
            if (r3 != r7) goto L_0x01ff
            r1 = r29
            r0 = r28
            X.C17890vO.A1D(r1, r0)
        L_0x01ff:
            r7 = 7
            X.1Wj r1 = r5.A09
            java.lang.Object r0 = r2.second
            int r33 = X.AnonymousClass000.A0M(r0)
            if (r3 != r7) goto L_0x0242
            r31 = r1
            r32 = r7
            r34 = r4
            X.C27511Wj.A00(r31, r32, r33, r34, r35, r36, r38, r39)
        L_0x0213:
            java.lang.Object r0 = r2.first
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 4
            if (r1 != r0) goto L_0x04f0
            r6.A06()
            r4 = 1
        L_0x0220:
            int r0 = r29.size()
            if (r0 <= 0) goto L_0x0230
            r1 = r40
            r0 = r29
            r1.A04(r0)
            r41.A03()
        L_0x0230:
            if (r47 != 0) goto L_0x0069
            if (r4 != 0) goto L_0x0069
            r6 = 1
            r1 = r5
            r2 = r41
            r3 = r35
            r4 = r38
            r5 = r39
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0242:
            r20 = r35
            r24 = r39
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r33
            r21 = r36
            r23 = r38
            X.C27511Wj.A00(r16, r17, r18, r19, r20, r21, r23, r24)
            goto L_0x0213
        L_0x0256:
            if (r9 != 0) goto L_0x025e
            java.lang.String r0 = "PrivateStatsUploader/doUpload--->dataToSend is null, why?!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01ea
        L_0x025e:
            X.3BF r8 = new X.3BF
            r8.<init>(r5)
            X.00H r0 = r5.A05
            java.lang.Object r3 = r0.get()
            X.1Kg r3 = (X.C24421Kg) r3
            X.0ve r1 = r5.A01
            X.2jh r19 = new X.2jh
            r0 = r19
            r0.<init>(r1, r3, r8)
            r0 = 23
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r1 = r19.A00()
        L_0x027d:
            if (r1 == 0) goto L_0x01ea
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x04cb }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04cb }
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ Exception -> 0x04cb }
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch:{ Exception -> 0x04cb }
            X.18j r0 = r5.A03     // Catch:{ Exception -> 0x04cb }
            X.9AA r0 = r0.A00()     // Catch:{ Exception -> 0x04cb }
            r12.setSSLSocketFactory(r0)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r2 = X.C197569wu.A0W     // Catch:{ Exception -> 0x04cb }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ Exception -> 0x04cb }
            X.AlR r0 = new X.AlR     // Catch:{ Exception -> 0x04cb }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x04cb }
            r12.setHostnameVerifier(r0)     // Catch:{ Exception -> 0x04cb }
            r0 = 15000(0x3a98, float:2.102E-41)
            r12.setConnectTimeout(r0)     // Catch:{ Exception -> 0x04cb }
            r0 = 60000(0xea60, float:8.4078E-41)
            r12.setReadTimeout(r0)     // Catch:{ Exception -> 0x04cb }
            r12.setDoInput(r7)     // Catch:{ Exception -> 0x04cb }
            r12.setDoOutput(r7)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r0 = "POST"
            r12.setRequestMethod(r0)     // Catch:{ Exception -> 0x04cb }
            r12.setChunkedStreamingMode(r4)     // Catch:{ Exception -> 0x04cb }
            r12.setUseCaches(r4)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r1 = "User-Agent"
            X.11W r0 = r5.A04     // Catch:{ Exception -> 0x04cb }
            java.lang.String r0 = r0.A02()     // Catch:{ Exception -> 0x04cb }
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r1 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "multipart/form-data; boundary=boundaryWAMpsAAL123xyz"
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "text/plain"
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r1 = "Accept-Charset"
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ Exception -> 0x04cb }
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04cb }
            java.lang.String r0 = "Host"
            r12.setRequestProperty(r0, r2)     // Catch:{ Exception -> 0x04cb }
            r12.connect()     // Catch:{ Exception -> 0x04cb }
            java.lang.String r13 = "\r\n"
            X.181 r0 = r5.A00     // Catch:{ Exception -> 0x04d2 }
            r20 = r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04d2 }
            r0 = 9
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04d2 }
            java.io.OutputStream r3 = r12.getOutputStream()     // Catch:{ Exception -> 0x04d2 }
            X.9He r2 = new X.9He     // Catch:{ Exception -> 0x04d2 }
            r1 = r20
            r0 = r18
            r2.<init>(r1, r3, r14, r0)     // Catch:{ Exception -> 0x04d2 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x04d2 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x04d2 }
            java.io.DataOutputStream r11 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x04d2 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x04d2 }
            java.lang.String r10 = "--boundaryWAMpsAAL123xyz\r\n"
            r11.writeBytes(r10)     // Catch:{ all -> 0x04c1 }
            java.lang.String r1 = "Content-Type: text/plain\r\n"
            r11.writeBytes(r1)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"access_token\"\r\n"
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = X.C197569wu.A0Y     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r10)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r1)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"credential\"\r\n"
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r0 = r23
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r11.size()     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r10)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"message\"; filename=\"WAMEventBuffer.dat\"\r\n"
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            int r8 = r9.length     // Catch:{ all -> 0x04c1 }
            r3 = 2048(0x800, float:2.87E-42)
            int r0 = r8 / r3
            int r8 = r8 % r3
            r2 = 0
            r1 = 0
        L_0x0364:
            if (r2 >= r0) goto L_0x036e
            r11.write(r9, r1, r3)     // Catch:{ all -> 0x04c1 }
            int r1 = r1 + 2048
            int r2 = r2 + 1
            goto L_0x0364
        L_0x036e:
            if (r8 <= 0) goto L_0x0373
            r11.write(r9, r1, r8)     // Catch:{ all -> 0x04c1 }
        L_0x0373:
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r11.size()     // Catch:{ all -> 0x04c1 }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x039d }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x039d }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ JSONException -> 0x039d }
            java.lang.String r2 = "t"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x039d }
            java.lang.String r1 = "rt"
            if (r27 == 0) goto L_0x039a
            java.lang.String r0 = "true"
        L_0x0392:
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x039d }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x039d }
            goto L_0x03a4
        L_0x039a:
            java.lang.String r0 = "false"
            goto L_0x0392
        L_0x039d:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/writeMetadataPart"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04c1 }
            r0 = 0
        L_0x03a4:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x04c1 }
            if (r1 != 0) goto L_0x03c3
            r11.writeBytes(r10)     // Catch:{ all -> 0x04c1 }
            java.lang.String r1 = "Content-Type: application/json\r\n"
            r11.writeBytes(r1)     // Catch:{ all -> 0x04c1 }
            java.lang.String r1 = "Content-Disposition: form-data; name=\"meta_data\"\r\n"
            r11.writeBytes(r1)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r11.size()     // Catch:{ all -> 0x04c1 }
        L_0x03c3:
            java.lang.String r0 = "--boundaryWAMpsAAL123xyz--\r\n"
            r11.writeBytes(r0)     // Catch:{ all -> 0x04c1 }
            r11.writeBytes(r13)     // Catch:{ all -> 0x04c1 }
            r11.flush()     // Catch:{ all -> 0x04c1 }
            int r10 = r12.getResponseCode()     // Catch:{ IOException -> 0x04a7 }
            r12.getResponseMessage()     // Catch:{ IOException -> 0x04a5 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 != r0) goto L_0x03df
            android.util.Pair r2 = X.C17890vO.A0F(r14, r0)     // Catch:{ IOException -> 0x04a5 }
            goto L_0x04ba
        L_0x03df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x04a5 }
            java.lang.String r0 = "PrivateStatsUploader/handleResponse --- upload failed --- code = "
            X.C17900vP.A0i(r0, r1, r10)     // Catch:{ IOException -> 0x04a5 }
            r8 = 400(0x190, float:5.6E-43)
            if (r10 != r8) goto L_0x048b
            java.io.InputStream r3 = r12.getErrorStream()     // Catch:{ Exception -> 0x047a }
            X.9Hb r2 = new X.9Hb     // Catch:{ Exception -> 0x047a }
            r1 = r20
            r0 = r18
            r2.<init>(r1, r3, r14, r0)     // Catch:{ Exception -> 0x047a }
            r13 = 0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0424 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0424 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0424 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0424 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x041a }
        L_0x0408:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0412
            r1.append(r0)     // Catch:{ all -> 0x041a }
            goto L_0x0408
        L_0x0412:
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x041a }
            r2.close()     // Catch:{ Exception -> 0x0424 }
            goto L_0x042e
        L_0x041a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x041f }
            goto L_0x0423
        L_0x041f:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ Exception -> 0x0424 }
        L_0x0423:
            throw r0     // Catch:{ Exception -> 0x0424 }
        L_0x0424:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x047a }
            java.lang.String r0 = "PrivateStatsUploader/readresponsemsg "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ Exception -> 0x047a }
        L_0x042e:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x047a }
            r3 = 5
            if (r0 != 0) goto L_0x0471
            org.json.JSONObject r1 = X.C17880vN.A16(r13)     // Catch:{ JSONException -> 0x0467 }
            java.lang.String r0 = "error"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0467 }
            java.lang.String r0 = "error_subcode"
            int r2 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0467 }
            java.lang.String r0 = "code"
            int r1 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0467 }
            r0 = 9
            if (r1 != r0) goto L_0x0452
            r3 = 8
            goto L_0x0471
        L_0x0452:
            r0 = 3067002(0x2ecc7a, float:4.297785E-39)
            if (r2 != r0) goto L_0x0459
            r3 = 2
            goto L_0x0471
        L_0x0459:
            r0 = 3067003(0x2ecc7b, float:4.297787E-39)
            if (r2 != r0) goto L_0x0460
            r3 = 3
            goto L_0x0471
        L_0x0460:
            r0 = 3067004(0x2ecc7c, float:4.297788E-39)
            if (r2 != r0) goto L_0x0471
            r3 = 4
            goto L_0x0471
        L_0x0467:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x047a }
            java.lang.String r0 = "PrivateStatsUploader/parseErrorResponse "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ Exception -> 0x047a }
        L_0x0471:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x047a }
            android.util.Pair r2 = X.C17890vO.A0F(r0, r8)     // Catch:{ Exception -> 0x047a }
            goto L_0x04ba
        L_0x047a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x04a5 }
            java.lang.String r0 = "PrivateStatsUploader processing response err "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ IOException -> 0x04a5 }
            r0 = r26
            android.util.Pair r2 = X.C17890vO.A0F(r0, r8)     // Catch:{ IOException -> 0x04a5 }
            goto L_0x04ba
        L_0x048b:
            r1 = 401(0x191, float:5.62E-43)
            if (r10 != r1) goto L_0x049a
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x04a5 }
            android.util.Pair r2 = X.C17890vO.A0F(r0, r1)     // Catch:{ IOException -> 0x04a5 }
            goto L_0x04ba
        L_0x049a:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x04a5 }
            android.util.Pair r2 = X.C17890vO.A0F(r0, r10)     // Catch:{ IOException -> 0x04a5 }
            goto L_0x04ba
        L_0x04a5:
            r2 = move-exception
            goto L_0x04a9
        L_0x04a7:
            r2 = move-exception
            r10 = 0
        L_0x04a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "PrivateStatsUploader response error "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x04c1 }
            java.lang.Integer r0 = X.C17880vN.A0m()     // Catch:{ all -> 0x04c1 }
            android.util.Pair r2 = X.C17890vO.A0F(r0, r10)     // Catch:{ all -> 0x04c1 }
        L_0x04ba:
            r11.close()     // Catch:{ Exception -> 0x04d2 }
            r12.disconnect()     // Catch:{ Exception -> 0x04d2 }
            goto L_0x04eb
        L_0x04c1:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x04c6 }
            goto L_0x04d1
        L_0x04c6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x04d2 }
            goto L_0x04d1
        L_0x04cb:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/makeConnection error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x04d2 }
        L_0x04d1:
            throw r1     // Catch:{ Exception -> 0x04d2 }
        L_0x04d2:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/doUpload error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04f7 }
            java.lang.Integer r1 = X.C17880vN.A0m()     // Catch:{ all -> 0x04f7 }
            r0 = r25
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x04f7 }
            java.lang.String r1 = r19.A00()     // Catch:{ all -> 0x04f7 }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x027d
        L_0x04eb:
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x01ea
        L_0x04f0:
            int r15 = r15 + 1
            goto L_0x0084
        L_0x04f4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x04f7:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C680031r.A00(X.Cn3, int, boolean, boolean, boolean):void");
    }

    public C680031r(AnonymousClass181 r1, AnonymousClass11E r2, AnonymousClass11P r3, C18030ve r4, C27511Wj r5, C63832tl r6, C220418j r7, AnonymousClass11W r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A08 = r3;
        this.A04 = r8;
        this.A00 = r1;
        this.A06 = r9;
        this.A02 = r6;
        this.A03 = r7;
        this.A09 = r5;
        this.A07 = r2;
        this.A01 = r4;
        this.A05 = r10;
    }
}
