package X;

public abstract class BPW extends BPS {
    public final C28618EAq A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(24:7|8|9|(5:11|(1:13)|14|(3:16|(1:18)(1:24)|19)|20)|21|(2:23|(2:26|(4:28|(3:32|(1:29)(2:170|40)|30)|172|25)(1:171)))(0)|41|42|(1:44)(1:46)|45|47|(1:49)(1:54)|50|(2:52|(4:55|56|14d|(8:82|83|84|(1:86)|100|(1:102)|178|(2:139|(2:141|142)))))|110|111|112|113|114|115|116|117|(2:119|120)|(2:123|(2:125|(5:127|(1:129)|130|(2:131|(3:133|(2:135|183)(1:182)|180)(1:181))|142)(2:143|144))(1:187))(1:186)) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01da, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01db, code lost:
        if (r11 != false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01dd, code lost:
        r2 = r5.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01df, code lost:
        if (r1 < r2) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e1, code lost:
        X.C21334AiJ.A03(r5[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        X.C26138Ct1.A0K.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0268, code lost:
        if (r1 != null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x026f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0270, code lost:
        if (r1 != null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0275, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0276, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0277, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        X.C26138Ct1.A0A.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cc, code lost:
        if (r11 == false) goto L_0x01eb;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0263 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C26146CtA A09(int r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            X.EAq r7 = r0.A00
            X.BPk r7 = (X.C22797BPk) r7
            r10 = r22
            if (r22 < 0) goto L_0x02ac
            r9 = r23
            if (r23 < 0) goto L_0x02a5
            r8 = r24
            int r0 = r24 + -1
            r3 = 2
            int r3 = r3 << r0
            java.lang.String r2 = " for zoom level "
            if (r10 > r3) goto L_0x0294
            if (r9 > r3) goto L_0x0283
            r6 = r7
            X.BPX r6 = (X.BPX) r6
            java.lang.String r0 = r6.A00     // Catch:{ MalformedURLException -> 0x0278 }
            r18 = r0
            boolean r0 = r18.isEmpty()     // Catch:{ MalformedURLException -> 0x0278 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "&_nc_client_caller="
            java.lang.StringBuilder r3 = X.BE6.A0u(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            X.CTh r2 = r6.A03     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = r2.A03     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r1 = r2.A04     // Catch:{ MalformedURLException -> 0x0278 }
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "&_nc_client_id="
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = android.net.Uri.encode(r1)     // Catch:{ MalformedURLException -> 0x0278 }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
        L_0x0048:
            java.lang.String r0 = r6.A01     // Catch:{ MalformedURLException -> 0x0278 }
            if (r0 != 0) goto L_0x0054
            boolean r0 = r2.A06     // Catch:{ MalformedURLException -> 0x0278 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "dark"
        L_0x0052:
            r6.A01 = r0     // Catch:{ MalformedURLException -> 0x0278 }
        L_0x0054:
            java.lang.String r18 = r3.toString()     // Catch:{ MalformedURLException -> 0x0278 }
            r0 = r18
            r6.A00 = r0     // Catch:{ MalformedURLException -> 0x0278 }
        L_0x005c:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ MalformedURLException -> 0x0278 }
            boolean r0 = X.C26101CsL.A06     // Catch:{ MalformedURLException -> 0x0278 }
            X.C26101CsL.A02(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            X.CTC r17 = X.C26101CsL.A0B     // Catch:{ MalformedURLException -> 0x0278 }
            r0 = r17
            java.lang.String[] r14 = r0.A05     // Catch:{ MalformedURLException -> 0x0278 }
            if (r14 == 0) goto L_0x00b0
            r13 = 1
            int r13 = r13 << r24
            int r0 = r14.length     // Catch:{ MalformedURLException -> 0x0278 }
            r20 = r0
            r4 = 0
            goto L_0x0079
        L_0x0075:
            r0 = 0
            goto L_0x0052
        L_0x0077:
            int r4 = r4 + 1
        L_0x0079:
            r0 = r20
            if (r4 >= r0) goto L_0x00b0
            r0 = r17
            X.9zp[][] r0 = r0.A06     // Catch:{ MalformedURLException -> 0x0278 }
            r16 = r0
            r0 = r0[r4]     // Catch:{ MalformedURLException -> 0x0278 }
            int r0 = r0.length     // Catch:{ MalformedURLException -> 0x0278 }
            r19 = r0
            r12 = 0
            goto L_0x008c
        L_0x008a:
            int r12 = r12 + 1
        L_0x008c:
            r0 = r19
            if (r12 >= r0) goto L_0x0077
            r0 = r16[r4]     // Catch:{ MalformedURLException -> 0x0278 }
            r11 = r0[r12]     // Catch:{ MalformedURLException -> 0x0278 }
            double r0 = r11.A01     // Catch:{ MalformedURLException -> 0x0278 }
            double r2 = (double) r13     // Catch:{ MalformedURLException -> 0x0278 }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x0278 }
            if (r15 > r10) goto L_0x008a
            double r0 = r11.A02     // Catch:{ MalformedURLException -> 0x0278 }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x0278 }
            if (r10 > r15) goto L_0x008a
            double r0 = r11.A03     // Catch:{ MalformedURLException -> 0x0278 }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x0278 }
            if (r15 > r9) goto L_0x008a
            double r0 = r11.A00     // Catch:{ MalformedURLException -> 0x0278 }
            double r0 = r0 * r2
            int r2 = (int) r0     // Catch:{ MalformedURLException -> 0x0278 }
            if (r9 > r2) goto L_0x008a
            r0 = r14[r4]     // Catch:{ MalformedURLException -> 0x0278 }
            goto L_0x00b4
        L_0x00b0:
            r0 = r17
            java.lang.String r0 = r0.A01     // Catch:{ MalformedURLException -> 0x0278 }
        L_0x00b4:
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&x="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            r5.append(r10)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&y="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            r5.append(r9)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&z="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            r5.append(r8)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&size="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            int r0 = r6.A00     // Catch:{ MalformedURLException -> 0x0278 }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&ppi="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            int r0 = r6.A02     // Catch:{ MalformedURLException -> 0x0278 }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&language="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = X.C26101CsL.A04     // Catch:{ MalformedURLException -> 0x0278 }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r2 = r6.A01     // Catch:{ MalformedURLException -> 0x0278 }
            if (r2 == 0) goto L_0x0107
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ MalformedURLException -> 0x0278 }
            java.lang.String r0 = "&theme="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ MalformedURLException -> 0x0278 }
        L_0x00fb:
            r0 = r18
            java.lang.String r0 = X.AnonymousClass001.A1H(r1, r0, r5)     // Catch:{ MalformedURLException -> 0x0278 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0278 }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x0278 }
            goto L_0x010a
        L_0x0107:
            java.lang.String r1 = ""
            goto L_0x00fb
        L_0x010a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r2.append(r10)
            java.lang.String r1 = "_"
            r2.append(r1)
            r2.append(r9)
            r2.append(r1)
            r2.append(r8)
            r2.append(r1)
            java.lang.String r0 = X.C26101CsL.A05
            r2.append(r0)
            r2.append(r1)
            X.CTC r0 = X.C26101CsL.A0B
            java.lang.String r0 = r0.A02
            r2.append(r0)
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = X.C17900vP.A0A(r1, r0)
        L_0x0139:
            java.lang.String r6 = X.AnonymousClass000.A0y(r0, r2)
            X.AiJ r0 = X.C22797BPk.A05
            if (r0 == 0) goto L_0x01eb
            r5 = 0
            X.AiJ r0 = X.C22797BPk.A05
            r3 = 0
            if (r0 == 0) goto L_0x01eb
            goto L_0x014b
        L_0x0148:
            java.lang.String r0 = ""
            goto L_0x0139
        L_0x014b:
            X.AiJ r2 = X.C22797BPk.A05     // Catch:{ IOException -> 0x01c6, all -> 0x01e9 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x01c6, all -> 0x01e9 }
            java.io.Writer r0 = r2.A03     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01bc
            X.C21334AiJ.A06(r6)     // Catch:{ all -> 0x01c3 }
            java.util.LinkedHashMap r0 = r2.A09     // Catch:{ all -> 0x01c3 }
            java.lang.Object r12 = r0.get(r6)     // Catch:{ all -> 0x01c3 }
            X.9of r12 = (X.C192599of) r12     // Catch:{ all -> 0x01c3 }
            r11 = 0
            if (r12 == 0) goto L_0x01af
            boolean r0 = r12.A01     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01af
            int r10 = r2.A05     // Catch:{ all -> 0x01c3 }
            java.io.InputStream[] r9 = new java.io.InputStream[r10]     // Catch:{ all -> 0x01c3 }
            r8 = 0
            r1 = 0
        L_0x016a:
            if (r1 >= r10) goto L_0x0183
            java.io.File r0 = r12.A00()     // Catch:{ FileNotFoundException -> 0x0178 }
            java.io.FileInputStream r0 = X.C108945cZ.A18(r0)     // Catch:{ FileNotFoundException -> 0x0178 }
            r9[r1] = r0     // Catch:{ FileNotFoundException -> 0x0178 }
            r1 = 1
            goto L_0x016a
        L_0x0178:
            if (r8 >= r10) goto L_0x01af
            r0 = r9[r8]     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01af
            X.C21334AiJ.A03(r0)     // Catch:{ all -> 0x01c3 }
            r8 = 1
            goto L_0x0178
        L_0x0183:
            int r0 = r2.A00     // Catch:{ all -> 0x01c3 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x01c3 }
            java.io.Writer r8 = r2.A03     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "READ "
            r1.append(r0)     // Catch:{ all -> 0x01c3 }
            r1.append(r6)     // Catch:{ all -> 0x01c3 }
            r0 = 10
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)     // Catch:{ all -> 0x01c3 }
            r8.append(r0)     // Catch:{ all -> 0x01c3 }
            boolean r0 = X.C21334AiJ.A07(r2)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01ad
            java.util.concurrent.ThreadPoolExecutor r1 = r2.A0B     // Catch:{ all -> 0x01c3 }
            java.util.concurrent.Callable r0 = r2.A0A     // Catch:{ all -> 0x01c3 }
            r1.submit(r0)     // Catch:{ all -> 0x01c3 }
        L_0x01ad:
            r11 = 1
            r5 = r9
        L_0x01af:
            monitor-exit(r2)     // Catch:{ IOException -> 0x01c6, all -> 0x01e9 }
            if (r11 == 0) goto L_0x01eb
            r1 = 0
            r0 = r5[r1]     // Catch:{ IOException -> 0x01c7 }
            if (r0 == 0) goto L_0x01ce
            X.C5Q r3 = X.DAI.A00(r0, r1)     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01ce
        L_0x01bc:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x01c6, all -> 0x01e9 }
            throw r0     // Catch:{ IOException -> 0x01c6, all -> 0x01e9 }
        L_0x01c6:
            r11 = 0
        L_0x01c7:
            X.Ct1 r0 = X.C26138Ct1.A0A     // Catch:{ all -> 0x01da }
            r0.A02()     // Catch:{ all -> 0x01da }
            if (r11 == 0) goto L_0x01eb
        L_0x01ce:
            int r2 = r5.length
            r1 = 0
        L_0x01d0:
            if (r1 >= r2) goto L_0x0248
            r0 = r5[r1]
            X.C21334AiJ.A03(r0)
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x01da:
            r3 = move-exception
            if (r11 == 0) goto L_0x01ea
            int r2 = r5.length
            r1 = 0
        L_0x01df:
            if (r1 >= r2) goto L_0x01ea
            r0 = r5[r1]
            X.C21334AiJ.A03(r0)
            int r1 = r1 + 1
            goto L_0x01df
        L_0x01e9:
            r3 = move-exception
        L_0x01ea:
            throw r3
        L_0x01eb:
            java.util.concurrent.atomic.AtomicLong r0 = r7.A01
            r0.incrementAndGet()
            r1 = 0
            long r2 = java.lang.System.nanoTime()
            java.io.InputStream r1 = r4.openStream()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01fa }
            goto L_0x01fe
        L_0x01fa:
            java.io.InputStream r1 = r4.openStream()     // Catch:{ IOException -> 0x0263, all -> 0x0276 }
        L_0x01fe:
            r0 = 1
            X.C5Q r5 = X.DAI.A00(r1, r0)     // Catch:{ IOException -> 0x0263 }
            if (r1 == 0) goto L_0x0208
            r1.close()     // Catch:{ IOException -> 0x0208 }
        L_0x0208:
            if (r5 == 0) goto L_0x026d
            java.util.concurrent.atomic.AtomicLong r4 = r7.A01
            int r0 = r5.A00
            long r0 = (long) r0
            r4.getAndAdd(r0)
            X.Ct1 r4 = X.C26138Ct1.A0L
            int r0 = r5.A00
            long r0 = (long) r0
            r4.A04(r0)
            X.Ct1 r0 = X.C26138Ct1.A0M
            X.BE8.A0z(r0, r2)
            int r1 = r5.A00
            if (r1 == 0) goto L_0x026d
            byte[] r0 = r5.A02
            X.CtA r2 = X.C26146CtA.A00(r0, r1)
            if (r2 == 0) goto L_0x025f
            X.AiJ r0 = X.C22797BPk.A05
            if (r0 != 0) goto L_0x0232
            X.DAI.A01(r5)
        L_0x0232:
            r5.A01 = r6
        L_0x0234:
            java.util.concurrent.BlockingQueue r1 = X.C22797BPk.A03
            boolean r0 = r1.offer(r5)
            if (r0 != 0) goto L_0x025e
            java.lang.Object r0 = r1.poll()
            X.C5Q r0 = (X.C5Q) r0
            if (r0 == 0) goto L_0x0234
            X.DAI.A01(r0)
            goto L_0x0234
        L_0x0248:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.A00
            if (r1 == 0) goto L_0x01eb
            byte[] r0 = r3.A02
            X.CtA r2 = X.C26146CtA.A00(r0, r1)
            X.DAI.A01(r3)
            if (r2 == 0) goto L_0x01eb
            java.util.concurrent.atomic.AtomicLong r0 = r7.A00
            r0.incrementAndGet()
        L_0x025e:
            return r2
        L_0x025f:
            X.DAI.A01(r5)
            return r2
        L_0x0263:
            X.Ct1 r0 = X.C26138Ct1.A0K     // Catch:{ all -> 0x026f }
            r0.A02()     // Catch:{ all -> 0x026f }
            if (r1 == 0) goto L_0x026d
            r1.close()     // Catch:{ IOException -> 0x026d }
        L_0x026d:
            r2 = 0
            return r2
        L_0x026f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0277
            r1.close()     // Catch:{ IOException -> 0x0277 }
            throw r0
        L_0x0276:
            r0 = move-exception
        L_0x0277:
            throw r0
        L_0x0278:
            r2 = move-exception
            java.lang.String r1 = "MapTileProvider"
            java.lang.String r0 = "Broken URL provided"
            android.util.Log.e(r1, r0, r2)
            X.CtA r2 = X.C28618EAq.A00
            return r2
        L_0x0283:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "y cannot exceed "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r2, r1, r8)
            throw r0
        L_0x0294:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "x cannot exceed "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r2, r1, r8)
            throw r0
        L_0x02a5:
            java.lang.String r0 = "y cannot deceed 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x02ac:
            java.lang.String r0 = "x cannot deceed 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPW.A09(int, int, int):X.CtA");
    }

    public BPW(DAE dae, C26022Cqg cqg, CJB cjb) {
        super(dae, cqg);
        this.A04 = true;
        this.A00 = cjb.A00;
    }
}
