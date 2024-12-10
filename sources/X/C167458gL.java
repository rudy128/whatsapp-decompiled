package X;

import java.util.Map;

/* renamed from: X.8gL  reason: invalid class name and case insensitive filesystem */
public final class C167458gL extends C167468gM {
    public final /* synthetic */ C20007A2x A00;
    public final /* synthetic */ C21551Aly A01;
    public final /* synthetic */ Map A02;

    public C167458gL(C20007A2x a2x, C21551Aly aly, Map map) {
        this.A00 = a2x;
        this.A02 = map;
        this.A01 = aly;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        if (r5 >= 70) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        if (r5 >= 90) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015b, code lost:
        if (r3 < 100) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0181, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0185, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0188, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A01(int r13) {
        /*
            r12 = this;
            X.A2x r1 = r12.A00
            java.util.Map r10 = r12.A02
            X.Aly r8 = r12.A01
            java.lang.String r11 = "metadata"
            X.A7X r7 = r1.A06
            boolean r0 = r7.A0B()
            if (r0 != 0) goto L_0x01c3
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x01b6
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r5 = 0
            java.lang.String r3 = "POST"
            java.lang.StringBuilder r2 = X.C189009iM.A00(r1)     // Catch:{ IOException -> 0x01a1, all -> 0x019f }
            java.lang.String r0 = ":commit"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ IOException -> 0x01a1, all -> 0x019f }
            java.lang.String r0 = "application/json; charset=UTF-8"
            r6 = 1
            javax.net.ssl.HttpsURLConnection r4 = r7.A08(r3, r2, r0, r6)     // Catch:{ IOException -> 0x01a1, all -> 0x019f }
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch:{ IOException -> 0x019d }
            java.lang.String r3 = X.C19620yd.A0A     // Catch:{ all -> 0x0186 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0186 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0186 }
            android.util.JsonWriter r9 = new android.util.JsonWriter     // Catch:{ all -> 0x0186 }
            r9.<init>(r0)     // Catch:{ all -> 0x0186 }
            android.util.JsonWriter r3 = r9.beginObject()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r3 = r3.name(r0)     // Catch:{ all -> 0x017f }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x017f }
            r3.value(r0)     // Catch:{ all -> 0x017f }
            if (r10 == 0) goto L_0x0076
            java.lang.String r0 = "updateMask"
            android.util.JsonWriter r0 = r9.name(r0)     // Catch:{ all -> 0x017f }
            android.util.JsonWriter r3 = r0.value(r11)     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "backup"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x017f }
            android.util.JsonWriter r0 = r0.beginObject()     // Catch:{ all -> 0x017f }
            android.util.JsonWriter r3 = r0.name(r11)     // Catch:{ all -> 0x017f }
            X.AQX r0 = new X.AQX     // Catch:{ all -> 0x017f }
            r0.<init>(r10)     // Catch:{ all -> 0x017f }
            java.lang.String r0 = X.AnonymousClass9Q9.A00(r0)     // Catch:{ all -> 0x017f }
            android.util.JsonWriter r0 = r3.value(r0)     // Catch:{ all -> 0x017f }
            r0.endObject()     // Catch:{ all -> 0x017f }
        L_0x0076:
            android.util.JsonWriter r0 = r9.endObject()     // Catch:{ all -> 0x017f }
            r0.flush()     // Catch:{ all -> 0x017f }
            r9.close()     // Catch:{ all -> 0x0186 }
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ IOException -> 0x019d }
        L_0x0085:
            int r3 = r4.getResponseCode()     // Catch:{ IOException -> 0x019d }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x00dd
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x00d6
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r2 = "gdrive-api-v2/backups-commit/failed "
            if (r3 == r0) goto L_0x00bf
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x018d
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x00ba
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ IOException -> 0x019d }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x019d }
            r1.append(r0)     // Catch:{ IOException -> 0x019d }
            X.C17890vO.A0w(r1)     // Catch:{ IOException -> 0x019d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ IOException -> 0x019d }
            java.lang.String r0 = X.AnonymousClass8BT.A0w(r4)     // Catch:{ IOException -> 0x019d }
            X.C17890vO.A19(r1, r0)     // Catch:{ IOException -> 0x019d }
            goto L_0x01bd
        L_0x00ba:
            r7.A0A()     // Catch:{ IOException -> 0x019d }
            goto L_0x01bd
        L_0x00bf:
            X.A6M r3 = X.A6M.A00     // Catch:{ IOException -> 0x019d }
            X.0ve r2 = r1.A07     // Catch:{ IOException -> 0x019d }
            r1 = 916(0x394, float:1.284E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x019d }
            boolean r2 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ IOException -> 0x019d }
            java.lang.String r1 = "backups-commit"
            X.8tt r0 = new X.8tt     // Catch:{ IOException -> 0x019d }
            r0.<init>(r5, r5, r4)     // Catch:{ IOException -> 0x019d }
            r3.A02(r0, r1, r2)     // Catch:{ IOException -> 0x019d }
            throw r5     // Catch:{ IOException -> 0x019d }
        L_0x00d6:
            X.8ge r1 = new X.8ge     // Catch:{ IOException -> 0x019d }
            r1.<init>()     // Catch:{ IOException -> 0x019d }
            goto L_0x019c
        L_0x00dd:
            r1.A00 = r5     // Catch:{ IOException -> 0x019d }
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ IOException -> 0x019d }
            java.lang.String r1 = X.AnonymousClass1EY.A00(r0)     // Catch:{ IOException -> 0x019d }
            if (r8 == 0) goto L_0x01c5
            X.9oH r7 = r8.A00     // Catch:{ IOException -> 0x019d }
            if (r1 == 0) goto L_0x01c5
            int r0 = r1.length()     // Catch:{ IOException -> 0x019d }
            if (r0 == 0) goto L_0x01c5
            org.json.JSONObject r2 = X.C17880vN.A16(r1)     // Catch:{ IOException -> 0x019d }
            java.lang.String r1 = "accountStoragePercentage"
            boolean r0 = r2.has(r1)     // Catch:{ IOException -> 0x019d }
            if (r0 == 0) goto L_0x01c5
            int r5 = r2.getInt(r1)     // Catch:{ IOException -> 0x019d }
            X.00H r0 = r7.A02     // Catch:{ IOException -> 0x019d }
            X.1NP r9 = X.AnonymousClass8BS.A0A(r0)     // Catch:{ IOException -> 0x019d }
            X.0z4 r6 = r7.A00     // Catch:{ IOException -> 0x019d }
            java.lang.String r8 = r6.A0f()     // Catch:{ IOException -> 0x019d }
            r3 = 0
            if (r8 == 0) goto L_0x012a
            int r0 = r8.length()     // Catch:{ IOException -> 0x019d }
            if (r0 == 0) goto L_0x012a
            android.content.SharedPreferences r2 = r9.A07()     // Catch:{ IOException -> 0x019d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x019d }
            java.lang.String r0 = "backup_account_storage_percent:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ IOException -> 0x019d }
            int r3 = r2.getInt(r0, r3)     // Catch:{ IOException -> 0x019d }
        L_0x012a:
            r2 = 60
            r0 = 50
            if (r3 >= r0) goto L_0x0136
            if (r5 < r0) goto L_0x015d
            if (r5 >= r2) goto L_0x0136
            r2 = 7
            goto L_0x015e
        L_0x0136:
            r1 = 70
            if (r3 >= r2) goto L_0x013f
            if (r5 < r2) goto L_0x015d
            r2 = 6
            if (r5 < r1) goto L_0x015e
        L_0x013f:
            r0 = 80
            if (r3 >= r1) goto L_0x0149
            if (r5 < r1) goto L_0x015d
            if (r5 >= r0) goto L_0x0149
            r2 = 5
            goto L_0x015e
        L_0x0149:
            r1 = 90
            if (r3 >= r0) goto L_0x0152
            if (r5 < r0) goto L_0x015d
            r2 = 3
            if (r5 < r1) goto L_0x015e
        L_0x0152:
            r0 = 100
            if (r1 > r5) goto L_0x015a
            if (r5 >= r0) goto L_0x015a
            r2 = 2
            goto L_0x015e
        L_0x015a:
            r2 = 1
            if (r3 >= r0) goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            r7.A01(r2)     // Catch:{ IOException -> 0x019d }
            java.lang.String r3 = r6.A0f()     // Catch:{ IOException -> 0x019d }
            if (r3 == 0) goto L_0x01c5
            int r0 = r3.length()     // Catch:{ IOException -> 0x019d }
            if (r0 == 0) goto L_0x01c5
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BT.A04(r9)     // Catch:{ IOException -> 0x019d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x019d }
            java.lang.String r0 = "backup_account_storage_percent:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ IOException -> 0x019d }
            X.C17880vN.A1C(r2, r0, r5)     // Catch:{ IOException -> 0x019d }
            goto L_0x01c5
        L_0x017f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0186 }
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ IOException -> 0x019d }
            goto L_0x019c
        L_0x018d:
            java.lang.String r2 = X.AnonymousClass8BT.A0w(r4)     // Catch:{ IOException -> 0x019d }
            X.9uB r1 = r1.A08     // Catch:{ IOException -> 0x019d }
            r0 = 3
            r1.A01(r0, r3, r2, r6)     // Catch:{ IOException -> 0x019d }
            X.8gd r1 = new X.8gd     // Catch:{ IOException -> 0x019d }
            r1.<init>(r2)     // Catch:{ IOException -> 0x019d }
        L_0x019c:
            throw r1     // Catch:{ IOException -> 0x019d }
        L_0x019d:
            r1 = move-exception
            goto L_0x01a3
        L_0x019f:
            r0 = move-exception
            goto L_0x01b2
        L_0x01a1:
            r1 = move-exception
            r4 = r5
        L_0x01a3:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x01ac }
            X.8gq r0 = new X.8gq     // Catch:{ all -> 0x01ac }
            r0.<init>(r1)     // Catch:{ all -> 0x01ac }
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r0 = move-exception
            if (r4 == 0) goto L_0x01b2
            r4.disconnect()
        L_0x01b2:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01b6:
            java.lang.String r0 = "No transaction to commit"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x01bd:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x01c3:
            r1 = 0
            goto L_0x01cc
        L_0x01c5:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r1 = 1
        L_0x01cc:
            r0 = 0
            if (r1 == 0) goto L_0x01d3
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
        L_0x01d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167458gL.A01(int):java.lang.Object");
    }
}
