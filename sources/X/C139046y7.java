package X;

/* renamed from: X.6y7  reason: invalid class name and case insensitive filesystem */
public final class C139046y7 {
    public final AnonymousClass11E A00;
    public final AnonymousClass1D9 A01;
    public final AnonymousClass181 A02;
    public final C52192aW A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C129716iF A00(X.C139046y7 r7, X.AnonymousClass8BJ r8, java.lang.Exception r9) {
        /*
            r0 = 34
            X.181 r2 = r7.A02     // Catch:{ Exception -> 0x0042 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0042 }
            r0 = 0
            X.9Hb r2 = r8.BMO(r2, r0, r1)     // Catch:{ Exception -> 0x0042 }
            org.json.JSONObject r1 = X.AnonymousClass1EY.A01(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = "error"
            org.json.JSONObject r5 = r1.getJSONObject(r0)     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x002f
            java.lang.String r0 = "code"
            int r7 = r5.optInt(r0)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "error_subcode"
            int r8 = r5.optInt(r0)     // Catch:{ all -> 0x003b }
        L_0x0027:
            r6 = 2
            X.6iF r3 = new X.6iF     // Catch:{ all -> 0x003b }
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003b }
            goto L_0x0032
        L_0x002f:
            r7 = 0
            r8 = 0
            goto L_0x0027
        L_0x0032:
            r2.close()     // Catch:{ Exception -> 0x0042 }
            return r3
        L_0x0036:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0042 }
            throw r0     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to parse the error response: "
            X.C17900vP.A0X(r2, r0, r1)
            r5 = 0
            r3 = 0
            r4 = 1
            X.6iF r1 = new X.6iF
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139046y7.A00(X.6y7, X.8BJ, java.lang.Exception):X.6iF");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C129716iF A01(java.lang.String r25, java.util.List r26) {
        /*
            r24 = this;
            java.lang.String r1 = "me"
            r4 = 34
            r14 = 0
            r3 = r25
            X.C18070vi.A0d(r3, r14)
            r21 = 1
            r2 = r24
            X.11E r0 = r2.A00
            boolean r0 = r0.A09()
            r9 = 0
            if (r0 != 0) goto L_0x0021
            r13 = -1
            X.6iF r10 = new X.6iF
            r12 = r9
            r15 = r14
            r11 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0021:
            java.lang.StringBuilder r3 = X.C109005cf.A0F(r1, r3)
            java.lang.String r1 = ","
            X.83d r0 = X.C1590783d.A00
            r5 = r26
            java.lang.String r1 = X.C29431cG.A0h(r1, r5, r0)
            java.lang.String r0 = "&fields="
            r3.append(r0)
            r3.append(r1)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            r0 = 24
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.1D9 r6 = r2.A01     // Catch:{ IOException -> 0x00b6 }
            java.lang.String r8 = r3.toString()     // Catch:{ IOException -> 0x00b6 }
            java.util.Map r12 = X.C19620yd.A0D     // Catch:{ IOException -> 0x00b6 }
            java.lang.String r10 = "WhatsApp"
            java.lang.Integer r7 = X.C17880vN.A0l()     // Catch:{ IOException -> 0x00b6 }
            r18 = 0
            r13 = r9
            r16 = r14
            r11 = r9
            r15 = r14
            X.AUZ r3 = X.AnonymousClass1D9.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00b6 }
            X.181 r1 = r2.A02     // Catch:{ IOException -> 0x00a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x00a6 }
            X.9Hb r4 = r3.BMP(r1, r9, r0)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ all -> 0x009f }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x009f }
            r6.<init>(r4, r0)     // Catch:{ all -> 0x009f }
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r0]     // Catch:{ all -> 0x009f }
        L_0x006e:
            int r0 = r6.read(r1)     // Catch:{ all -> 0x009f }
            if (r0 < 0) goto L_0x0078
            r5.append(r1, r14, r0)     // Catch:{ all -> 0x009f }
            goto L_0x006e
        L_0x0078:
            java.net.HttpURLConnection r0 = r3.A01     // Catch:{ all -> 0x009f }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x009f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0084
            r18 = 1
        L_0x0084:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x009f }
            org.json.JSONObject r17 = X.C17880vN.A16(r0)     // Catch:{ all -> 0x009f }
            X.6iF r10 = new X.6iF     // Catch:{ all -> 0x009f }
            r20 = r14
            r15 = r10
            r16 = r9
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x009f }
            r4.close()     // Catch:{ IOException -> 0x00a6 }
            r3.close()     // Catch:{ IOException -> 0x00b6 }
            return r10
        L_0x009f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x00a6 }
            throw r0     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            X.6iF r10 = A00(r2, r3, r0)     // Catch:{ all -> 0x00af }
            r3.close()     // Catch:{ IOException -> 0x00b6 }
            return r10
        L_0x00af:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x00b6 }
            throw r0     // Catch:{ IOException -> 0x00b6 }
        L_0x00b6:
            r19 = move-exception
            X.6iF r18 = new X.6iF
            r23 = r14
            r20 = r9
            r22 = r14
            r18.<init>(r19, r20, r21, r22, r23)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139046y7.A01(java.lang.String, java.util.List):X.6iF");
    }

    public C139046y7(AnonymousClass181 r1, AnonymousClass11E r2, C52192aW r3, AnonymousClass1D9 r4) {
        C18070vi.A0s(r4, r1, r2, r3);
        this.A01 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = r3;
    }
}
