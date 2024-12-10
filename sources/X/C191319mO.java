package X;

/* renamed from: X.9mO  reason: invalid class name and case insensitive filesystem */
public final class C191319mO {
    public final AnonymousClass190 A00;
    public final AnonymousClass181 A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;
    public final C18150vq A04 = C18150vq.A01(new C21516AlP(this, 3));

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String A00(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 1
            X.C18070vi.A0d(r10, r0)     // Catch:{ all -> 0x00fd }
            r0 = 6060(0x17ac, float:8.492E-42)
            X.0ve r5 = r8.A03     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r5.A0I(r0)     // Catch:{ all -> 0x00fd }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "/json/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)     // Catch:{ all -> 0x00fd }
            r6 = 0
            java.net.URLConnection r7 = X.AnonymousClass8BV.A0v(r0)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.C18070vi.A0z(r7, r0)     // Catch:{ Exception -> 0x0057 }
            javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) r7     // Catch:{ Exception -> 0x0057 }
            java.lang.String r0 = "GET"
            r7.setRequestMethod(r0)     // Catch:{ Exception -> 0x0057 }
            int r1 = r7.getResponseCode()     // Catch:{ all -> 0x0052 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x004e
            X.181 r3 = r8.A01     // Catch:{ all -> 0x0052 }
            java.lang.Integer r2 = X.C17880vN.A0l()     // Catch:{ all -> 0x0052 }
            java.io.InputStream r1 = r7.getInputStream()     // Catch:{ all -> 0x0052 }
            X.9Hb r0 = new X.9Hb     // Catch:{ all -> 0x0052 }
            r0.<init>(r3, r1, r6, r2)     // Catch:{ all -> 0x0052 }
            java.io.BufferedReader r0 = X.AnonymousClass8BW.A0W(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = X.C181849Sb.A00(r0)     // Catch:{ all -> 0x0052 }
            r7.disconnect()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0079
        L_0x004e:
            r7.disconnect()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0078
        L_0x0052:
            r0 = move-exception
            r7.disconnect()     // Catch:{ Exception -> 0x0057 }
            throw r0     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "FlowsLogger/makeFlowJsonRequest throws exception"
            X.C108995ce.A1M(r0, r1, r2)     // Catch:{ all -> 0x00fd }
            X.190 r3 = r8.A00     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00fd }
            r1 = 3178(0xc6a, float:4.453E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00fd }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x0072
            r2 = 0
        L_0x0072:
            r1 = 0
            java.lang.String r0 = "FlowsLogger/makeFlowJsonRequest"
            r3.A0G(r0, r2, r1)     // Catch:{ all -> 0x00fd }
        L_0x0078:
            r4 = r6
        L_0x0079:
            if (r4 == 0) goto L_0x00fb
            X.0vq r0 = r8.A04     // Catch:{ all -> 0x00fd }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00fd }
            X.AiK r2 = (X.AiK) r2     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ all -> 0x00fd }
            r0 = 95
            java.lang.String r0 = X.C17890vO.A0Z(r10, r1, r0)     // Catch:{ all -> 0x00fd }
            X.9oK r1 = X.AiK.A00(r2, r0)     // Catch:{ all -> 0x00fd }
            if (r1 == 0) goto L_0x00fb
            java.io.ByteArrayOutputStream r3 = X.C108945cZ.A15()     // Catch:{ Exception -> 0x00da }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x00d3 }
            r2.<init>(r3)     // Catch:{ all -> 0x00d3 }
            r2.writeObject(r4)     // Catch:{ all -> 0x00cc }
            r2.close()     // Catch:{ all -> 0x00d3 }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x00d3 }
            r3.close()     // Catch:{ Exception -> 0x00da }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x00da }
            X.9HU r2 = r1.A00()     // Catch:{ IOException -> 0x00c1 }
            r2.write(r0)     // Catch:{ all -> 0x00ba }
            r1.A01()     // Catch:{ all -> 0x00ba }
            r2.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00fb
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x00c1 }
            throw r0     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = "FlowsLogger/FlowJSONPrefetchDiskLruCache/writeToDisk: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ Exception -> 0x00da }
            goto L_0x00fb
        L_0x00cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ Exception -> 0x00da }
            throw r0     // Catch:{ Exception -> 0x00da }
        L_0x00da:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "FlowsLogger/saveInCache throws exception"
            X.C108995ce.A1M(r0, r1, r2)     // Catch:{ all -> 0x00fd }
            X.190 r3 = r8.A00     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00fd }
            r1 = 3178(0xc6a, float:4.453E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00fd }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00f5
            r2 = 0
        L_0x00f5:
            r1 = 0
            java.lang.String r0 = "FlowsLogger/saveInCache"
            r3.A0G(r0, r2, r1)     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            monitor-exit(r8)
            return r4
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191319mO.A00(java.lang.String, java.lang.String):java.lang.String");
    }

    public C191319mO(AnonymousClass190 r3, AnonymousClass181 r4, AnonymousClass118 r5, C18030ve r6) {
        C18070vi.A0s(r3, r5, r6, r4);
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
    }
}
