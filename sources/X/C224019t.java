package X;

/* renamed from: X.19t  reason: invalid class name and case insensitive filesystem */
public class C224019t implements Runnable {
    public final AnonymousClass11P A00;
    public final AnonymousClass19I A01;
    public final AnonymousClass19M A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass19R A04;
    public final AnonymousClass19T A05;
    public final AnonymousClass10I A06;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ab, code lost:
        if (r1.A03() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ad, code lost:
        r2 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b3, code lost:
        if (r2.Bcc() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b5, code lost:
        r9.A03.CPb(r2.BMt());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c7, code lost:
        if (r4 == null) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r9.A06.CGv(new X.C448925e(r8, 4), 50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r5.length < r10) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r9 = new java.io.File(r12, r15);
        r5 = new java.io.PrintWriter(new java.io.FileWriter(r9, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r11 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r10 = new org.json.JSONObject();
        r10.put("app_version", "2.24.24.78");
        r10.put("app_build_number", 670735092);
        r0 = r10.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r11.A05.BhE(-1, r0.getMessage());
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014c, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r6.A03.BKZ(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        if (r5 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r5.flush();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017f, code lost:
        if (r5 != null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r5.flush();
        r5.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0158 A[SYNTHETIC, Splitter:B:73:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016a A[Catch:{ Exception -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019a A[SYNTHETIC, Splitter:B:97:0x019a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r2 = 0
        L_0x0001:
            r9 = r22
            X.19I r1 = r9.A01
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x01a7
            X.19T r8 = r9.A05
            boolean r0 = r8.Bcc()
            if (r0 == 0) goto L_0x01a7
            int r21 = r2 + 1
            r0 = 20
            if (r2 >= r0) goto L_0x01a7
            java.lang.Integer r10 = r8.CBM()
            if (r10 == 0) goto L_0x0058
            X.19R r0 = r9.A04
            java.util.concurrent.ConcurrentHashMap r3 = r0.A05
            java.lang.Object r0 = r3.get(r10)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x0033
            r1 = 1
        L_0x0033:
            r4 = 50
            if (r1 == 0) goto L_0x0059
            java.lang.Long r0 = r8.CBL()
            if (r0 == 0) goto L_0x0058
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0.longValue()
            long r6 = r6 - r0
            r1 = 200000000(0xbebc200, double:9.8813129E-316)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
        L_0x004d:
            X.10I r2 = r9.A06
            r1 = 4
            X.25e r0 = new X.25e
            r0.<init>(r8, r1)
            r2.CGv(r0, r4)
        L_0x0058:
            return
        L_0x0059:
            r3.remove(r10)
            X.19M r6 = r9.A02
            java.util.concurrent.Semaphore r3 = r6.A04
            boolean r0 = r3.tryAcquire()
            if (r0 == 0) goto L_0x004d
            java.lang.String r8 = r8.CBo()     // Catch:{ all -> 0x01d0 }
            if (r8 != 0) goto L_0x006e
            goto L_0x01bf
        L_0x006e:
            java.lang.String r2 = "2.24.24.78"
            r20 = 0
            r4 = 0
            X.118 r0 = r6.A00     // Catch:{ Exception -> 0x018e }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x018e }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = "qpl"
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x018e }
            r12.<init>(r1, r0)     // Catch:{ Exception -> 0x018e }
            r12.mkdirs()     // Catch:{ Exception -> 0x018e }
            X.19I r0 = r6.A01     // Catch:{ Exception -> 0x018e }
            X.0ve r5 = r0.A00     // Catch:{ Exception -> 0x018e }
            r0 = 213(0xd5, float:2.98E-43)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x018e }
            int r11 = X.C18020vd.A00(r1, r5, r0)     // Catch:{ Exception -> 0x018e }
            r0 = 214(0xd6, float:3.0E-43)
            int r10 = X.C18020vd.A00(r1, r5, r0)     // Catch:{ Exception -> 0x018e }
            java.io.File[] r5 = r12.listFiles()     // Catch:{ Exception -> 0x018e }
            r7 = 1
            if (r5 == 0) goto L_0x00a3
            int r0 = r5.length     // Catch:{ Exception -> 0x018e }
            r19 = 0
            if (r0 >= r10) goto L_0x00a5
        L_0x00a3:
            r19 = 1
        L_0x00a5:
            java.io.File r9 = r6.A06     // Catch:{ Exception -> 0x018e }
            r17 = 1024(0x400, double:5.06E-321)
            if (r9 == 0) goto L_0x00c8
            boolean r0 = r9.exists()     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x00c8
            long r14 = r9.length()     // Catch:{ Exception -> 0x018e }
            long r14 = r14 / r17
            long r0 = (long) r11     // Catch:{ Exception -> 0x018e }
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c8
        L_0x00bc:
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x018e }
            r0.<init>(r9, r7)     // Catch:{ Exception -> 0x018e }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ Exception -> 0x018e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x018e }
            goto L_0x016c
        L_0x00c8:
            r6.A06 = r4     // Catch:{ Exception -> 0x018e }
            r14 = 0
        L_0x00cb:
            if (r14 >= r10) goto L_0x0188
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x018e }
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x018e }
            r1[r20] = r2     // Catch:{ Exception -> 0x018e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x018e }
            r1[r7] = r0     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = "qpl_%s_%d.txt"
            java.lang.String r15 = java.lang.String.format(r9, r0, r1)     // Catch:{ Exception -> 0x018e }
            if (r5 == 0) goto L_0x0106
            int r13 = r5.length     // Catch:{ Exception -> 0x018e }
            r1 = 0
        L_0x00e4:
            if (r1 >= r13) goto L_0x0106
            r9 = r5[r1]     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = r9.getName()     // Catch:{ Exception -> 0x018e }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0100
            long r15 = r9.length()     // Catch:{ Exception -> 0x018e }
            long r15 = r15 / r17
            long r0 = (long) r11     // Catch:{ Exception -> 0x018e }
            int r13 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0103
            r6.A06 = r9     // Catch:{ Exception -> 0x018e }
            goto L_0x00bc
        L_0x0100:
            int r1 = r1 + 1
            goto L_0x00e4
        L_0x0103:
            int r14 = r14 + 1
            goto L_0x00cb
        L_0x0106:
            if (r19 == 0) goto L_0x0109
            goto L_0x0111
        L_0x0109:
            X.19A r0 = r6.A03     // Catch:{ Exception -> 0x018e }
            r0.Bj8()     // Catch:{ Exception -> 0x018e }
            r6.A06 = r4     // Catch:{ Exception -> 0x018e }
            goto L_0x00cb
        L_0x0111:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x014b, all -> 0x017c }
            r9.<init>(r12, r15)     // Catch:{ Exception -> 0x014b, all -> 0x017c }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x014b, all -> 0x017c }
            r0.<init>(r9, r7)     // Catch:{ Exception -> 0x014b, all -> 0x017c }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ Exception -> 0x014b, all -> 0x017c }
            r5.<init>(r0)     // Catch:{ Exception -> 0x014b, all -> 0x017c }
            X.19G r11 = r6.A02     // Catch:{ Exception -> 0x0149 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0139 }
            r10.<init>()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "app_version"
            r10.put(r0, r2)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r2 = "app_build_number"
            r0 = 670735092(0x27fa9af4, double:3.313871664E-315)
            r10.put(r2, r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x0139 }
            goto L_0x0145
        L_0x0139:
            r0 = move-exception
            X.19A r2 = r11.A05     // Catch:{ Exception -> 0x0149 }
            r1 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0149 }
            r2.BhE(r1, r0)     // Catch:{ Exception -> 0x0149 }
            r0 = 0
        L_0x0145:
            r5.println(r0)     // Catch:{ Exception -> 0x0149 }
            goto L_0x0160
        L_0x0149:
            r0 = move-exception
            goto L_0x014d
        L_0x014b:
            r0 = move-exception
            r5 = r4
        L_0x014d:
            X.19A r1 = r6.A03     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x017e }
            r1.BKZ(r0)     // Catch:{ all -> 0x017e }
            if (r5 == 0) goto L_0x015e
            r5.flush()     // Catch:{ Exception -> 0x018e }
            r5.close()     // Catch:{ Exception -> 0x018e }
        L_0x015e:
            r9 = r4
            goto L_0x0166
        L_0x0160:
            r5.flush()     // Catch:{ Exception -> 0x018e }
            r5.close()     // Catch:{ Exception -> 0x018e }
        L_0x0166:
            r6.A06 = r9     // Catch:{ Exception -> 0x018e }
            if (r9 == 0) goto L_0x01a0
            goto L_0x00bc
        L_0x016c:
            r1.println()     // Catch:{ Exception -> 0x0179, all -> 0x01c3 }
            r1.println(r8)     // Catch:{ Exception -> 0x0179, all -> 0x01c3 }
            r1.flush()     // Catch:{ all -> 0x01d0 }
            r1.close()     // Catch:{ all -> 0x01d0 }
            goto L_0x01a0
        L_0x0179:
            r0 = move-exception
            r4 = r1
            goto L_0x018f
        L_0x017c:
            r0 = move-exception
            goto L_0x0187
        L_0x017e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0187
            r5.flush()     // Catch:{ Exception -> 0x018e }
            r5.close()     // Catch:{ Exception -> 0x018e }
        L_0x0187:
            throw r0     // Catch:{ Exception -> 0x018e }
        L_0x0188:
            X.19A r0 = r6.A03     // Catch:{ Exception -> 0x018e }
            r0.Bj8()     // Catch:{ Exception -> 0x018e }
            goto L_0x01a0
        L_0x018e:
            r0 = move-exception
        L_0x018f:
            X.19A r1 = r6.A03     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01c6 }
            r1.BKZ(r0)     // Catch:{ all -> 0x01c6 }
            if (r4 == 0) goto L_0x01a0
            r4.flush()     // Catch:{ all -> 0x01d0 }
            r4.close()     // Catch:{ all -> 0x01d0 }
        L_0x01a0:
            r3.release()
            r2 = r21
            goto L_0x0001
        L_0x01a7:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0058
            X.19T r2 = r9.A05
            boolean r0 = r2.Bcc()
            if (r0 == 0) goto L_0x0058
            X.19A r1 = r9.A03
            java.util.Collection r0 = r2.BMt()
            r1.CPb(r0)
            return
        L_0x01bf:
            r3.release()
            return
        L_0x01c3:
            r0 = move-exception
            r4 = r1
            goto L_0x01c9
        L_0x01c6:
            r0 = move-exception
            if (r4 == 0) goto L_0x01cf
        L_0x01c9:
            r4.flush()     // Catch:{ all -> 0x01d0 }
            r4.close()     // Catch:{ all -> 0x01d0 }
        L_0x01cf:
            throw r0     // Catch:{ all -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            r3.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224019t.run():void");
    }

    public C224019t(AnonymousClass11P r1, AnonymousClass19I r2, AnonymousClass19M r3, AnonymousClass19A r4, AnonymousClass19R r5, AnonymousClass19T r6, AnonymousClass10I r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }
}
