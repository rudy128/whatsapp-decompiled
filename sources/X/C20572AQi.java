package X;

/* renamed from: X.AQi  reason: case insensitive filesystem */
public final class C20572AQi implements C72113Kr {
    public final C18030ve A00;
    public final AXS A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d4, code lost:
        if (r7 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r10 = this;
            X.0ve r2 = r10.A00
            r1 = 7727(0x1e2f, float:1.0828E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00f0
            X.00H r0 = r10.A02
            java.lang.Object r5 = r0.get()
            X.9bX r5 = (X.C184799bX) r5
            X.AXS r0 = r10.A01
            java.lang.String r6 = r0.A0G()
            java.lang.String r4 = "payments/india-upi-bank-list-fetch-failed"
            r0 = 25
            r3 = 0
            r7 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.lang.String r2 = "https://static.whatsapp.net/wa/static/payments/upi/bank_list?provider=%s"
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            if (r6 != 0) goto L_0x0031
            java.lang.String r0 = "ICICI"
            java.lang.String r6 = X.C108975cc.A0d(r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
        L_0x0031:
            r1[r3] = r6     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            r0 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.net.URL r1 = new java.net.URL     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C18070vi.A0z(r6, r0)     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            r6.connect()     // Catch:{ JSONException -> 0x00b1, IOException -> 0x00ae, all -> 0x00ac }
            java.io.InputStream r2 = r1.openStream()     // Catch:{ JSONException -> 0x00a6, IOException -> 0x00a0, all -> 0x009d }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ JSONException -> 0x00a9, IOException -> 0x00a3, all -> 0x00d7 }
            r7.<init>(r2)     // Catch:{ JSONException -> 0x00a9, IOException -> 0x00a3, all -> 0x00d7 }
            java.io.BufferedReader r8 = X.AnonymousClass8BW.A0W(r7)     // Catch:{ all -> 0x0096 }
            java.lang.String r9 = X.C181849Sb.A00(r8)     // Catch:{ all -> 0x008f }
            r8.close()     // Catch:{ all -> 0x0096 }
            int r0 = r9.length()     // Catch:{ all -> 0x0096 }
            if (r0 <= 0) goto L_0x008b
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x0096 }
            r0.<init>(r9)     // Catch:{ all -> 0x0096 }
            X.118 r0 = r5.A01     // Catch:{ all -> 0x0096 }
            android.content.Context r8 = r0.A00     // Catch:{ all -> 0x0096 }
            java.io.File r0 = r8.getFilesDir()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "upi_bank_list.json"
            java.io.File r0 = X.C17880vN.A0e(r0, r1)     // Catch:{ all -> 0x0096 }
            X.C108985cd.A1C(r0)     // Catch:{ all -> 0x0096 }
            java.io.File r1 = X.AnonymousClass8BU.A0f(r8, r1)     // Catch:{ all -> 0x0096 }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ all -> 0x0096 }
            X.AnonymousClass3Gr.A01(r1, r9, r0)     // Catch:{ all -> 0x0096 }
        L_0x008b:
            r7.close()     // Catch:{ JSONException -> 0x00a9, IOException -> 0x00a3, all -> 0x00d7 }
            goto L_0x00e5
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ JSONException -> 0x00a9, IOException -> 0x00a3, all -> 0x00d7 }
            throw r0     // Catch:{ JSONException -> 0x00a9, IOException -> 0x00a3, all -> 0x00d7 }
        L_0x009d:
            r0 = move-exception
            r2 = r7
            goto L_0x00d8
        L_0x00a0:
            r1 = move-exception
            r2 = r7
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            r7 = r6
            goto L_0x00b9
        L_0x00a6:
            r1 = move-exception
            r2 = r7
            goto L_0x00aa
        L_0x00a9:
            r1 = move-exception
        L_0x00aa:
            r7 = r6
            goto L_0x00b3
        L_0x00ac:
            r0 = move-exception
            goto L_0x00e1
        L_0x00ae:
            r1 = move-exception
            r2 = r7
            goto L_0x00b9
        L_0x00b1:
            r1 = move-exception
            r2 = r7
        L_0x00b3:
            X.190 r0 = r5.A00     // Catch:{ all -> 0x00d3 }
            X.AnonymousClass8BS.A17(r0, r4, r1, r3)     // Catch:{ all -> 0x00d3 }
            goto L_0x00be
        L_0x00b9:
            X.190 r0 = r5.A00     // Catch:{ all -> 0x00d3 }
            X.AnonymousClass8BS.A17(r0, r4, r1, r3)     // Catch:{ all -> 0x00d3 }
        L_0x00be:
            X.118 r0 = r5.A01     // Catch:{ all -> 0x00d3 }
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "upi_bank_list.json"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)     // Catch:{ all -> 0x00d3 }
            X.C108985cd.A1C(r0)     // Catch:{ all -> 0x00d3 }
            if (r7 == 0) goto L_0x00e8
            r7.disconnect()
            goto L_0x00e8
        L_0x00d3:
            r0 = move-exception
            if (r7 == 0) goto L_0x00dc
            goto L_0x00d9
        L_0x00d7:
            r0 = move-exception
        L_0x00d8:
            r7 = r6
        L_0x00d9:
            r7.disconnect()
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()
        L_0x00e1:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00e5:
            r6.disconnect()
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r2.close()
        L_0x00ed:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20572AQi.Bqf():void");
    }

    public C20572AQi(C18030ve r1, AXS axs, AnonymousClass00H r3) {
        C18070vi.A0o(r1, axs, r3);
        this.A00 = r1;
        this.A01 = axs;
        this.A02 = r3;
    }
}
