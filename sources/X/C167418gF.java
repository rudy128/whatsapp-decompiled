package X;

import java.util.List;

/* renamed from: X.8gF  reason: invalid class name and case insensitive filesystem */
public final class C167418gF extends C167428gG {
    public final /* synthetic */ C20007A2x A00;
    public final /* synthetic */ A7X A01;
    public final /* synthetic */ List A02;

    public C167418gF(C20007A2x a2x, A7X a7x, List list) {
        this.A01 = a7x;
        this.A00 = a2x;
        this.A02 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0136, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A01(int r12) {
        /*
            r11 = this;
            X.A7X r6 = r11.A01
            X.A2x r9 = r11.A00
            java.util.List r2 = r11.A02
            java.lang.String r8 = "status"
            r4 = 1
            X.C18070vi.A0d(r2, r4)
            java.lang.String r7 = "gdrive-api/delete-files "
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x018a
            int r1 = r2.size()
            r0 = 2500(0x9c4, float:3.503E-42)
            if (r1 > r0) goto L_0x0174
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r10 = 0
            java.lang.String r3 = "POST"
            java.lang.StringBuilder r1 = X.C189009iM.A00(r9)     // Catch:{ IOException -> 0x0162, all -> 0x0160 }
            java.lang.String r0 = ":batchDeleteFiles"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0162, all -> 0x0160 }
            java.lang.String r0 = "application/json; charset=UTF-8"
            javax.net.ssl.HttpsURLConnection r4 = r6.A08(r3, r1, r0, r4)     // Catch:{ IOException -> 0x0162, all -> 0x0160 }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x015e }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ all -> 0x0134 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0134 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0134 }
            android.util.JsonWriter r5 = new android.util.JsonWriter     // Catch:{ all -> 0x0134 }
            r5.<init>(r0)     // Catch:{ all -> 0x0134 }
            android.util.JsonWriter r1 = r5.beginObject()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r9.A03()     // Catch:{ all -> 0x012d }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "fileIds"
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ all -> 0x012d }
            r0.beginArray()     // Catch:{ all -> 0x012d }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x012d }
        L_0x0063:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0073
            X.A2d r0 = X.AnonymousClass8BR.A0I(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x012d }
            r5.value(r0)     // Catch:{ all -> 0x012d }
            goto L_0x0063
        L_0x0073:
            android.util.JsonWriter r0 = r5.endArray()     // Catch:{ all -> 0x012d }
            android.util.JsonWriter r0 = r0.endObject()     // Catch:{ all -> 0x012d }
            r0.flush()     // Catch:{ all -> 0x012d }
            r5.close()     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x0086
            r3.close()     // Catch:{ IOException -> 0x015e }
        L_0x0086:
            int r5 = r4.getResponseCode()     // Catch:{ IOException -> 0x015e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x00c0
            r0 = 401(0x191, float:5.62E-43)
            if (r5 == r0) goto L_0x00bb
            r0 = 403(0x193, float:5.65E-43)
            if (r5 == r0) goto L_0x00b4
            r1 = 429(0x1ad, float:6.01E-43)
            r3 = 9
            java.lang.String r2 = " statusLine "
            java.lang.String r0 = "gdrive-api/delete-files status of the response is "
            if (r5 == r1) goto L_0x00a2
            goto L_0x013b
        L_0x00a2:
            X.A6M r3 = X.A6M.A00     // Catch:{ IOException -> 0x015e }
            X.0ve r2 = r6.A09     // Catch:{ IOException -> 0x015e }
            r1 = 916(0x394, float:1.284E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x015e }
            boolean r1 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ IOException -> 0x015e }
            java.lang.String r0 = "delete-files"
            r3.A04(r0, r4, r1)     // Catch:{ IOException -> 0x015e }
            throw r10     // Catch:{ IOException -> 0x015e }
        L_0x00b4:
            X.8ge r1 = new X.8ge     // Catch:{ IOException -> 0x015e }
            r1.<init>()     // Catch:{ IOException -> 0x015e }
            goto L_0x015d
        L_0x00bb:
            r6.A0A()     // Catch:{ IOException -> 0x015e }
            goto L_0x018c
        L_0x00c0:
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ IOException -> 0x0127 }
            java.lang.String r3 = X.AnonymousClass1EY.A00(r0)     // Catch:{ IOException -> 0x0127 }
            if (r3 == 0) goto L_0x0127
            int r0 = r3.length()     // Catch:{ IOException -> 0x015e }
            if (r0 == 0) goto L_0x0127
            org.json.JSONObject r1 = X.C17880vN.A16(r3)     // Catch:{ JSONException -> 0x011c }
            boolean r0 = r1.has(r8)     // Catch:{ JSONException -> 0x011c }
            if (r0 == 0) goto L_0x018c
            org.json.JSONObject r5 = r1.getJSONObject(r8)     // Catch:{ JSONException -> 0x011c }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ JSONException -> 0x011c }
        L_0x00e2:
            boolean r0 = r6.hasNext()     // Catch:{ JSONException -> 0x011c }
            if (r0 == 0) goto L_0x0184
            X.A2d r0 = X.AnonymousClass8BR.A0I(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r2 = r0.A06     // Catch:{ JSONException -> 0x011c }
            boolean r0 = r5.has(r2)     // Catch:{ JSONException -> 0x011c }
            if (r0 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x011c }
            java.lang.String r0 = "gdrive-api/delete-files no status for "
            X.C17900vP.A0g(r0, r2, r1)     // Catch:{ JSONException -> 0x011c }
            goto L_0x00e2
        L_0x00fe:
            java.lang.String r1 = r5.getString(r2)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r0 = "OK"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x011c }
            if (r0 != 0) goto L_0x00e2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x011c }
            java.lang.String r0 = "gdrive-api/delete-files failed to delete "
            r1.append(r0)     // Catch:{ JSONException -> 0x011c }
            r1.append(r2)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r0 = " status "
            X.C17900vP.A0Z(r5, r0, r1)     // Catch:{ JSONException -> 0x011c }
            goto L_0x00e2
        L_0x011c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015e }
            java.lang.String r0 = "gdrive-api/delete-files malformed response"
            X.C17900vP.A0h(r0, r3, r1, r2)     // Catch:{ IOException -> 0x015e }
            goto L_0x018c
        L_0x0127:
            java.lang.String r0 = "gdrive-api/delete-files empty response"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x015e }
            goto L_0x018c
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r1 = move-exception
            X.CDX.A00(r3, r0)     // Catch:{ IOException -> 0x015e }
            goto L_0x015d
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015e }
            X.AnonymousClass000.A1E(r0, r2, r1, r5)     // Catch:{ IOException -> 0x015e }
            java.lang.String r0 = r4.getResponseMessage()     // Catch:{ IOException -> 0x015e }
            X.C17890vO.A19(r1, r0)     // Catch:{ IOException -> 0x015e }
            java.lang.String r1 = X.AnonymousClass8BT.A0w(r4)     // Catch:{ IOException -> 0x015e }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015e }
            X.C17900vP.A0f(r7, r1, r0)     // Catch:{ IOException -> 0x015e }
            X.9uB r0 = r6.A0A     // Catch:{ IOException -> 0x015e }
            r0.A00(r3, r5, r1)     // Catch:{ IOException -> 0x015e }
            X.8gq r1 = X.C167718gq.A00(r1)     // Catch:{ IOException -> 0x015e }
        L_0x015d:
            throw r1     // Catch:{ IOException -> 0x015e }
        L_0x015e:
            r1 = move-exception
            goto L_0x0164
        L_0x0160:
            r0 = move-exception
            goto L_0x0170
        L_0x0162:
            r1 = move-exception
            r4 = r10
        L_0x0164:
            X.8gq r0 = new X.8gq     // Catch:{ all -> 0x016a }
            r0.<init>(r1)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0170
            r4.disconnect()
        L_0x0170:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Batch too big "
            X.C17890vO.A15(r0, r1, r2)
            java.lang.String r0 = " max allowed 2500"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x0184:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x018a:
            r1 = 1
            goto L_0x0193
        L_0x018c:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r1 = 0
        L_0x0193:
            r0 = 0
            if (r1 == 0) goto L_0x019a
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
        L_0x019a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167418gF.A01(int):java.lang.Object");
    }
}
