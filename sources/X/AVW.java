package X;

import android.os.SystemClock;

public final /* synthetic */ class AVW implements B8D {
    public final /* synthetic */ C185849dF A00;
    public final /* synthetic */ C72133Kt A01;
    public final /* synthetic */ C190089kM A02;
    public final /* synthetic */ C167228ff A03;
    public final /* synthetic */ C188689hp A04;
    public final /* synthetic */ AnonymousClass99o A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.9HQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.9HQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: X.8oL} */
    /* JADX WARNING: type inference failed for: r7v13, types: [X.8oM] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (r5.A0l != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c5, code lost:
        if (r10 >= 500) goto L_0x01c7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02cd A[Catch:{ all -> 0x0344 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02fa A[Catch:{ all -> 0x0344 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.A88 CGA(X.C191779nA r37) {
        /*
            r36 = this;
            r0 = r36
            X.8ff r5 = r0.A03
            X.3Kt r3 = r0.A01
            X.99o r13 = r0.A05
            X.9dF r14 = r0.A00
            X.9hp r4 = r0.A04
            X.9kM r15 = r0.A02
            X.9i7 r6 = r5.A0a
            X.1Kb r1 = r5.A0P
            r0 = 1
            r12 = r37
            int r1 = r1.A01(r12, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.A08 = r1
            boolean r1 = r5.A0I()
            if (r1 == 0) goto L_0x003b
            java.lang.String r2 = "fallback"
            java.lang.String r1 = r12.A05
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003b
            r1 = 27
        L_0x0031:
            X.9gi r0 = new X.9gi
            r0.<init>(r12, r1)
            X.A88 r2 = X.A88.A01(r0)
            return r2
        L_0x003b:
            X.1SR r1 = r5.A0c     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            X.2rU r9 = r5.A0W     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            X.2h8 r8 = r9.A02     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            java.io.File r7 = r8.A07     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            X.C17960vV.A07(r7)     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            X.AiG r19 = r1.A03(r3, r9, r7)     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            java.lang.String r2 = r13.BLw(r12)     // Catch:{ all -> 0x0344 }
            r6.A0R = r2     // Catch:{ all -> 0x0344 }
            long r10 = r5.A00     // Catch:{ all -> 0x0344 }
            boolean r28 = X.C167228ff.A04(r5)     // Catch:{ all -> 0x0344 }
            boolean r1 = r5.A0J()     // Catch:{ all -> 0x0344 }
            if (r1 == 0) goto L_0x0062
            boolean r1 = r5.A0l     // Catch:{ all -> 0x0344 }
            r29 = 1
            if (r1 == 0) goto L_0x0064
        L_0x0062:
            r29 = 0
        L_0x0064:
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x0344 }
            boolean r30 = r9.A01()     // Catch:{ all -> 0x0344 }
            X.1So r1 = r8.A06     // Catch:{ all -> 0x0344 }
            r35 = r1
            java.lang.String r8 = r8.A08     // Catch:{ all -> 0x0344 }
            boolean r1 = r5.A0J()     // Catch:{ all -> 0x0344 }
            r31 = r1 ^ 1
            X.2k8 r1 = X.C167228ff.A01(r5)     // Catch:{ all -> 0x0344 }
            java.lang.String r25 = r1.A00()     // Catch:{ all -> 0x0344 }
            boolean r1 = r5.A0J()     // Catch:{ all -> 0x0344 }
            if (r1 == 0) goto L_0x00b2
            boolean r1 = r5.A0l     // Catch:{ all -> 0x0344 }
            if (r1 == 0) goto L_0x00b2
            X.9bD r1 = new X.9bD     // Catch:{ all -> 0x0344 }
            r1.<init>(r3, r5)     // Catch:{ all -> 0x0344 }
        L_0x008e:
            X.9he r3 = new X.9he     // Catch:{ all -> 0x0344 }
            r20 = r35
            r21 = r12
            r22 = r7
            r23 = r2
            r24 = r8
            r26 = r10
            r16 = r3
            r17 = r14
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)     // Catch:{ all -> 0x0344 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0344 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0344 }
            X.AiG r10 = r3.A04     // Catch:{ all -> 0x0344 }
            r30 = 0
            if (r10 != 0) goto L_0x00b7
            goto L_0x00b4
        L_0x00b2:
            r1 = 0
            goto L_0x008e
        L_0x00b4:
            r2 = 3
            goto L_0x02b1
        L_0x00b7:
            boolean r1 = r3.A0B     // Catch:{ all -> 0x0344 }
            r4.A01 = r1     // Catch:{ all -> 0x0344 }
            X.AUa r1 = new X.AUa     // Catch:{ all -> 0x0344 }
            r1.<init>(r3, r4, r0)     // Catch:{ all -> 0x0344 }
            boolean r2 = r3.A09     // Catch:{ all -> 0x0344 }
            if (r2 == 0) goto L_0x00f1
            int[] r8 = r4.A0A     // Catch:{ all -> 0x0344 }
            if (r8 == 0) goto L_0x00e5
            int r2 = r8.length     // Catch:{ all -> 0x0344 }
            if (r2 <= 0) goto L_0x00e5
            X.9HQ r9 = r10.A00     // Catch:{ all -> 0x0344 }
            X.9dF r2 = r3.A02     // Catch:{ all -> 0x0344 }
            X.8oM r7 = new X.8oM     // Catch:{ all -> 0x0344 }
            r7.<init>(r2, r9, r8)     // Catch:{ all -> 0x0344 }
        L_0x00d4:
            X.9j6 r14 = r7.A04     // Catch:{ all -> 0x0344 }
        L_0x00d6:
            X.1SV r2 = r4.A04     // Catch:{ all -> 0x0344 }
            r17 = r2
            java.lang.String r2 = r3.A07     // Catch:{ all -> 0x0344 }
            r23 = r2
            X.9nA r8 = r3.A05     // Catch:{ all -> 0x0344 }
            int r2 = r8.A00     // Catch:{ all -> 0x0344 }
            r18 = r2
            goto L_0x00f7
        L_0x00e5:
            X.9HQ r9 = r10.A00     // Catch:{ all -> 0x0344 }
            X.9dF r8 = r3.A02     // Catch:{ all -> 0x0344 }
            r2 = 65536(0x10000, float:9.18355E-41)
            X.8oL r7 = new X.8oL     // Catch:{ all -> 0x0344 }
            r7.<init>(r8, r9, r2)     // Catch:{ all -> 0x0344 }
            goto L_0x00d4
        L_0x00f1:
            X.9HQ r7 = r10.A00     // Catch:{ all -> 0x0344 }
            r9 = r7
            r14 = r30
            goto L_0x00d6
        L_0x00f7:
            boolean r27 = X.AnonymousClass000.A1P(r18)
            java.lang.String r2 = r3.A08     // Catch:{ all -> 0x0344 }
            r16 = r2
            java.lang.String r11 = r3.A06     // Catch:{ all -> 0x0344 }
            X.9bD r2 = r3.A03     // Catch:{ all -> 0x0344 }
            r26 = 0
            r20 = r17
            r21 = r1
            r22 = r2
            r24 = r16
            r25 = r11
            X.A7N r11 = r20.A00(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0344 }
            long r1 = r3.A00     // Catch:{ all -> 0x0344 }
            r16 = r1
            long r1 = r3.A01     // Catch:{ all -> 0x0344 }
            java.lang.String r29 = "file"
            r27 = r11
            r28 = r7
            r31 = r16
            r33 = r1
            r27.A05(r28, r29, r30, r31, r33)     // Catch:{ all -> 0x0344 }
            r9.getClass()     // Catch:{ all -> 0x0344 }
            r1 = 12
            X.Akz r2 = new X.Akz     // Catch:{ all -> 0x0344 }
            r2.<init>(r9, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r7 = "hash"
            java.util.List r1 = r11.A0F     // Catch:{ all -> 0x0344 }
            android.util.Pair r2 = android.util.Pair.create(r7, r2)     // Catch:{ all -> 0x0344 }
            r1.add(r2)     // Catch:{ all -> 0x0344 }
            X.9dT r9 = new X.9dT     // Catch:{ all -> 0x0344 }
            r9.<init>(r14, r11, r10)     // Catch:{ all -> 0x0344 }
            java.util.concurrent.atomic.AtomicReference r1 = r4.A09     // Catch:{ all -> 0x0344 }
            X.A7N r7 = r9.A01     // Catch:{ all -> 0x0344 }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x0344 }
            r1.set(r7)     // Catch:{ all -> 0x0344 }
            java.lang.String r11 = r4.A08     // Catch:{ IOException -> 0x0277 }
            X.9i7 r2 = r4.A07     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            r2.A07 = r1     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            java.lang.String r1 = r8.A04     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            r2.A0M = r1     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            java.lang.Long r1 = X.AnonymousClass8BT.A0m()     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            r2.A0G = r1     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            int r10 = r7.A04(r8)     // Catch:{ 9HW -> 0x0233, 9HV -> 0x0224, IOException -> 0x021c }
            A00(r7, r2)     // Catch:{ IOException -> 0x0277 }
            java.lang.Long r1 = X.C17880vN.A0n(r10)     // Catch:{ IOException -> 0x0277 }
            r2.A0B = r1     // Catch:{ IOException -> 0x0277 }
            java.lang.String r1 = r7.A03     // Catch:{ IOException -> 0x0277 }
            r2.A0O = r1     // Catch:{ IOException -> 0x0277 }
            X.1Kq r1 = X.C24521Kq.$redex_init_class     // Catch:{ IOException -> 0x0277 }
            r1 = 400(0x190, float:5.6E-43)
            if (r10 != r1) goto L_0x0196
            X.8ff r2 = r4.A06     // Catch:{ IOException -> 0x0277 }
            java.util.concurrent.FutureTask r2 = r2.A02     // Catch:{ IOException -> 0x0277 }
            boolean r2 = r2.isCancelled()     // Catch:{ IOException -> 0x0277 }
            if (r2 == 0) goto L_0x0196
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0277 }
            java.lang.String r1 = "mediaupload/upload-error/cancelled/400 "
        L_0x0185:
            X.C17900vP.A0e(r1, r11, r2)     // Catch:{ IOException -> 0x0277 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0277 }
        L_0x018c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)     // Catch:{ IOException -> 0x0277 }
        L_0x0190:
            android.util.Pair r2 = android.util.Pair.create(r2, r1)     // Catch:{ IOException -> 0x0277 }
            goto L_0x0246
        L_0x0196:
            java.lang.String r7 = " "
            java.lang.String r2 = "mediaupload/upload-error/response-code="
            if (r10 < r1) goto L_0x01cd
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0n(r10, r2)     // Catch:{ IOException -> 0x0277 }
            X.C17900vP.A0e(r7, r11, r1)     // Catch:{ IOException -> 0x0277 }
            r1 = 507(0x1fb, float:7.1E-43)
            if (r10 == r1) goto L_0x01ca
            r1 = 429(0x1ad, float:6.01E-43)
            if (r10 == r1) goto L_0x01ca
            r1 = 401(0x191, float:5.62E-43)
            r2 = 13
            if (r10 == r1) goto L_0x0212
            r1 = 415(0x19f, float:5.82E-43)
            r2 = 36
            if (r10 == r1) goto L_0x0212
            r1 = 413(0x19d, float:5.79E-43)
            r2 = 24
            if (r10 == r1) goto L_0x0212
            r1 = 408(0x198, float:5.72E-43)
            if (r10 == r1) goto L_0x01c7
            r1 = 500(0x1f4, float:7.0E-43)
            r2 = 9
            if (r10 < r1) goto L_0x0212
        L_0x01c7:
            r2 = 8
            goto L_0x0212
        L_0x01ca:
            r2 = 15
            goto L_0x0212
        L_0x01cd:
            if (r10 >= 0) goto L_0x01ee
            X.8ff r1 = r4.A06     // Catch:{ IOException -> 0x0277 }
            java.util.concurrent.FutureTask r1 = r1.A02     // Catch:{ IOException -> 0x0277 }
            boolean r1 = r1.isCancelled()     // Catch:{ IOException -> 0x0277 }
            if (r1 == 0) goto L_0x01e0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0277 }
            java.lang.String r1 = "mediaupload/upload-error/cancelled "
            goto L_0x0185
        L_0x01e0:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0n(r10, r2)     // Catch:{ IOException -> 0x0277 }
            X.C17900vP.A0e(r7, r11, r1)     // Catch:{ IOException -> 0x0277 }
            r1 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0277 }
            goto L_0x018c
        L_0x01ee:
            boolean r1 = r4.A01     // Catch:{ IOException -> 0x0277 }
            if (r1 == 0) goto L_0x020d
            X.9hT r1 = r4.A00     // Catch:{ IOException -> 0x0277 }
            if (r1 == 0) goto L_0x01fe
            java.lang.String r1 = r1.A00     // Catch:{ IOException -> 0x0277 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0277 }
            if (r1 == 0) goto L_0x020d
        L_0x01fe:
            X.0ve r7 = r4.A03     // Catch:{ IOException -> 0x0277 }
            r2 = 3300(0xce4, float:4.624E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ IOException -> 0x0277 }
            boolean r1 = X.C18020vd.A05(r1, r7, r2)     // Catch:{ IOException -> 0x0277 }
            if (r1 == 0) goto L_0x020d
            r2 = 29
            goto L_0x0212
        L_0x020d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)     // Catch:{ IOException -> 0x0277 }
            goto L_0x0216
        L_0x0212:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0277 }
        L_0x0216:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0277 }
            goto L_0x0190
        L_0x021c:
            r8 = move-exception
            X.9i7 r2 = r4.A07     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r7.A04     // Catch:{ all -> 0x0270 }
            r2.A0P = r1     // Catch:{ all -> 0x0270 }
            throw r8     // Catch:{ all -> 0x0270 }
        L_0x0224:
            r1 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0270 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x0270 }
            android.util.Pair r2 = android.util.Pair.create(r2, r1)     // Catch:{ all -> 0x0270 }
            goto L_0x0241
        L_0x0233:
            r1 = 38
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0270 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x0270 }
            android.util.Pair r2 = android.util.Pair.create(r2, r1)     // Catch:{ all -> 0x0270 }
        L_0x0241:
            X.9i7 r1 = r4.A07     // Catch:{ IOException -> 0x0277 }
            A00(r7, r1)     // Catch:{ IOException -> 0x0277 }
        L_0x0246:
            java.lang.Object r1 = r2.first     // Catch:{ IOException -> 0x0277 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0277 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0277 }
            X.9gi r7 = new X.9gi     // Catch:{ IOException -> 0x0277 }
            r7.<init>(r8, r1)     // Catch:{ IOException -> 0x0277 }
            java.lang.Object r1 = r2.second     // Catch:{ IOException -> 0x0277 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0277 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0277 }
            r7.A00 = r1     // Catch:{ IOException -> 0x0277 }
            r7.A01 = r9     // Catch:{ IOException -> 0x0277 }
            X.AiG r1 = r9.A02     // Catch:{ IOException -> 0x0277 }
            X.9en r1 = r1.A00()     // Catch:{ IOException -> 0x0277 }
            r7.A02 = r1     // Catch:{ IOException -> 0x0277 }
            X.9hT r1 = r4.A00     // Catch:{ IOException -> 0x0277 }
            r7.A03 = r1     // Catch:{ IOException -> 0x0277 }
            boolean r1 = r4.A02     // Catch:{ IOException -> 0x0277 }
            r7.A04 = r1     // Catch:{ IOException -> 0x0277 }
            goto L_0x02b8
        L_0x0270:
            r2 = move-exception
            X.9i7 r1 = r4.A07     // Catch:{ IOException -> 0x0277 }
            A00(r7, r1)     // Catch:{ IOException -> 0x0277 }
            throw r2     // Catch:{ IOException -> 0x0277 }
        L_0x0277:
            r7 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = "MediaUploadTransfer/io-error "
            r2.append(r1)     // Catch:{ all -> 0x0344 }
            android.net.Uri r1 = android.net.Uri.parse(r23)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r1.getHost()     // Catch:{ all -> 0x0344 }
            r2.append(r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r4.A08     // Catch:{ all -> 0x0344 }
            X.C108985cd.A1M(r1, r2, r7)     // Catch:{ all -> 0x0344 }
            X.9i7 r2 = r4.A07     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = X.C108955ca.A0x(r7)     // Catch:{ all -> 0x0344 }
            r2.A0N = r1     // Catch:{ all -> 0x0344 }
            boolean r1 = r7 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x0344 }
            if (r1 == 0) goto L_0x02a5
            r2 = 22
            goto L_0x02b1
        L_0x02a5:
            X.1KX r1 = r4.A05     // Catch:{ all -> 0x0344 }
            boolean r1 = r1.A03(r7)     // Catch:{ all -> 0x0344 }
            r2 = 17
            if (r1 == 0) goto L_0x02b1
            r2 = 18
        L_0x02b1:
            X.9nA r1 = r3.A05     // Catch:{ all -> 0x0344 }
            X.9gi r7 = new X.9gi     // Catch:{ all -> 0x0344 }
            r7.<init>(r1, r2)     // Catch:{ all -> 0x0344 }
        L_0x02b8:
            long r1 = r5.A0m     // Catch:{ all -> 0x0344 }
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x02c7
            long r1 = r5.A00     // Catch:{ all -> 0x0344 }
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x02c7
            r0 = 0
        L_0x02c7:
            int r3 = r7.A05     // Catch:{ all -> 0x0344 }
            r1 = 26
            if (r3 != r1) goto L_0x02fa
            java.lang.String r1 = r5.A04     // Catch:{ all -> 0x0344 }
            X.9gh r2 = X.C167228ff.A00(r15, r5, r13, r1)     // Catch:{ all -> 0x0344 }
            int r1 = r2.A01     // Catch:{ all -> 0x0344 }
            if (r1 != 0) goto L_0x02dc
            int r1 = r2.A00     // Catch:{ all -> 0x0344 }
            long r1 = (long) r1     // Catch:{ all -> 0x0344 }
            r5.A00 = r1     // Catch:{ all -> 0x0344 }
        L_0x02dc:
            X.1Kg r3 = r5.A0h     // Catch:{ all -> 0x0344 }
            r1 = r35
            java.lang.String r2 = r1.A02     // Catch:{ all -> 0x0344 }
            java.util.concurrent.atomic.AtomicInteger r1 = r15.A01     // Catch:{ all -> 0x0344 }
            int r33 = r1.get()     // Catch:{ all -> 0x0344 }
            r32 = 0
            r28 = r3
            r29 = r2
            r31 = r30
            X.37z r1 = r28.A0C(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0344 }
            X.A88 r2 = new X.A88     // Catch:{ all -> 0x0344 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0344 }
            goto L_0x0340
        L_0x02fa:
            if (r3 == 0) goto L_0x033c
            java.util.concurrent.FutureTask r1 = r5.A02     // Catch:{ all -> 0x0344 }
            boolean r1 = r1.isCancelled()     // Catch:{ all -> 0x0344 }
            if (r1 != 0) goto L_0x033c
            long r1 = r5.A0m     // Catch:{ all -> 0x0344 }
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0319
            java.lang.String r1 = r5.A04     // Catch:{ all -> 0x0344 }
            X.9gh r2 = X.C167228ff.A00(r15, r5, r13, r1)     // Catch:{ all -> 0x0344 }
            int r1 = r2.A01     // Catch:{ all -> 0x0344 }
            if (r1 != 0) goto L_0x0319
            int r1 = r2.A00     // Catch:{ all -> 0x0344 }
            long r1 = (long) r1     // Catch:{ all -> 0x0344 }
            r5.A00 = r1     // Catch:{ all -> 0x0344 }
        L_0x0319:
            r1 = 29
            if (r3 != r1) goto L_0x032c
            r15 = -1
            r18 = 1
            r16 = 0
            X.A88 r2 = new X.A88     // Catch:{ all -> 0x0344 }
            r13 = r2
            r14 = r7
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0344 }
            goto L_0x0340
        L_0x032c:
            r1 = 38
            if (r3 != r1) goto L_0x0335
            X.A88 r2 = X.A88.A01(r7)     // Catch:{ all -> 0x0344 }
            goto L_0x0340
        L_0x0335:
            int r1 = r7.A00     // Catch:{ all -> 0x0344 }
            X.A88 r2 = X.A88.A04(r7, r1, r0)     // Catch:{ all -> 0x0344 }
            goto L_0x0340
        L_0x033c:
            X.A88 r2 = X.A88.A02(r7)     // Catch:{ all -> 0x0344 }
        L_0x0340:
            r19.close()     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
            goto L_0x0359
        L_0x0344:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0349 }
            goto L_0x034d
        L_0x0349:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
        L_0x034d:
            throw r1     // Catch:{ NoSuchAlgorithmException -> 0x034e, IOException -> 0x035a }
        L_0x034e:
            r0 = move-exception
            java.lang.String r0 = X.C108955ca.A0x(r0)
            r6.A0N = r0
            r1 = 16
            goto L_0x0031
        L_0x0359:
            return r2
        L_0x035a:
            r0 = move-exception
            java.lang.String r0 = X.C108955ca.A0x(r0)
            r6.A0N = r0
            r1 = 3
            X.9gi r0 = new X.9gi
            r0.<init>(r12, r1)
            X.A88 r2 = X.A88.A01(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVW.CGA(X.9nA):X.A88");
    }

    public /* synthetic */ AVW(C185849dF r1, C72133Kt r2, C190089kM r3, C167228ff r4, C188689hp r5, AnonymousClass99o r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public static void A00(A7N a7n, C188859i7 r3) {
        r3.A0F = Long.valueOf(SystemClock.uptimeMillis());
        r3.A0A = Long.valueOf(a7n.A00);
        r3.A02 = a7n.A02;
    }
}
