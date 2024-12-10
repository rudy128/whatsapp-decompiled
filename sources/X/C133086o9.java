package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6o9  reason: invalid class name and case insensitive filesystem */
public class C133086o9 {
    public C26981Ug A00;
    public final C218617r A01;
    public final AnonymousClass181 A02;
    public final C19830z4 A03;
    public final AnonymousClass1D9 A04;
    public final C220418j A05;
    public final AnonymousClass1KG A06;
    public final AtomicBoolean A07 = C108965cb.A0w();

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0115 A[Catch:{ all -> 0x0188 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:97:0x01c5=Splitter:B:97:0x01c5, B:102:0x01cf=Splitter:B:102:0x01cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r29 = this;
            r5 = r29
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A07
            r0 = 1
            r3 = 0
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L_0x0213
            X.1Ug r0 = new X.1Ug
            r0.<init>()
            r5.A00 = r0
            java.lang.String r27 = "PaymentBackgroundBatchFetcher: "
            r0 = 18
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r2 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0050
            r1 = 0
        L_0x0023:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "/payments/background"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0037:
            r2.append(r0)
            java.lang.String r0 = "/all.zip"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r6 = r0.toString()
            goto L_0x0063
        L_0x004d:
            java.lang.String r0 = "https://static.whatsapp.net/payments/background"
            goto L_0x0037
        L_0x0050:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://www."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".facebook.com/cdn/cacheable/whatsapp"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0023
        L_0x0063:
            X.1D9 r7 = r5.A04     // Catch:{ Exception -> 0x01e7 }
            X.18j r2 = r5.A05     // Catch:{ Exception -> 0x01e7 }
            X.0z4 r10 = r5.A03     // Catch:{ Exception -> 0x01e7 }
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r10)     // Catch:{ Exception -> 0x01e7 }
            java.lang.String r8 = "payment_background_batch_etag"
            r1 = 0
            java.lang.String r0 = r0.getString(r8, r1)     // Catch:{ Exception -> 0x01e7 }
            X.AUZ r2 = r7.A05(r1, r2, r6, r0)     // Catch:{ Exception -> 0x01e7 }
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x01dd }
            r28 = r0
            int r1 = r28.getResponseCode()     // Catch:{ all -> 0x01dd }
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r11 = "payment_backgrounds_batch_last_fetch_timestamp"
            if (r1 != r0) goto L_0x008f
            r10.A1i(r11)     // Catch:{ all -> 0x01dd }
            java.util.HashSet r9 = X.C17880vN.A12()     // Catch:{ all -> 0x01dd }
            goto L_0x01c5
        L_0x008f:
            int r1 = r28.getResponseCode()     // Catch:{ all -> 0x01dd }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x009c
            r28.getResponseCode()     // Catch:{ all -> 0x01dd }
            goto L_0x01cf
        L_0x009c:
            X.181 r7 = r5.A02     // Catch:{ all -> 0x01dd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01dd }
            r0 = 14
            X.9Hb r0 = X.C108955ca.A0N(r7, r2, r1, r0)     // Catch:{ all -> 0x01dd }
            byte[] r0 = X.AnonymousClass1EY.A04(r0)     // Catch:{ all -> 0x01dd }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x01dd }
            r7.<init>(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r26 = "PAY: PaymentBackgroundBatchFetcher/unzipBatchBackgrounds"
            java.util.zip.ZipInputStream r12 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException | IOException -> 0x0192 }
            r12.<init>(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0192 }
            X.17r r0 = r5.A01     // Catch:{ all -> 0x0188 }
            java.io.File r25 = r0.A0H()     // Catch:{ all -> 0x0188 }
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ all -> 0x0188 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r0]     // Catch:{ all -> 0x0188 }
            r23 = 0
            r9 = 0
        L_0x00c9:
            java.util.zip.ZipEntry r17 = r12.getNextEntry()     // Catch:{ all -> 0x0188 }
            if (r17 == 0) goto L_0x017f
            java.lang.String r1 = r25.getCanonicalPath()     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = r17.getName()     // Catch:{ all -> 0x0188 }
            java.io.File r16 = X.C64062u9.A06(r1, r0)     // Catch:{ all -> 0x0188 }
            if (r16 == 0) goto L_0x0172
            java.lang.String r1 = r16.getCanonicalPath()     // Catch:{ all -> 0x0188 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = r25.getCanonicalPath()     // Catch:{ all -> 0x0188 }
            r15.append(r0)     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = "/backgrounds"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r15)     // Catch:{ all -> 0x0188 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0188 }
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver/invalid zip content"
        L_0x00fa:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0188 }
            r0 = 0
            goto L_0x0113
        L_0x00ff:
            java.lang.String r0 = r16.getAbsolutePath()     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = X.C64062u9.A09(r0)     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = "webp"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0188 }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver/store: Zip entry not webp"
            goto L_0x00fa
        L_0x0112:
            r0 = 1
        L_0x0113:
            if (r0 == 0) goto L_0x0172
            java.lang.String r1 = r16.getName()     // Catch:{ all -> 0x0188 }
            r0 = r25
            java.io.File r22 = X.C17880vN.A0e(r0, r1)     // Catch:{ all -> 0x0188 }
            r20 = 0
            java.io.FileOutputStream r15 = X.C108945cZ.A19(r22)     // Catch:{ FileNotFoundException -> 0x0157 }
        L_0x0125:
            int r1 = r12.read(r14)     // Catch:{ all -> 0x014d }
            r0 = -1
            if (r1 == r0) goto L_0x013e
            r15.write(r14, r3, r1)     // Catch:{ all -> 0x014d }
            long r0 = (long) r1     // Catch:{ all -> 0x014d }
            long r20 = r20 + r0
            r18 = 8192(0x2000, double:4.0474E-320)
            long r18 = r18 + r20
            r16 = 524288000(0x1f400000, double:2.590326893E-315)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            goto L_0x0125
        L_0x013e:
            java.lang.String r0 = r22.getName()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = X.C64062u9.A0A(r0)     // Catch:{ all -> 0x014d }
            r13.add(r0)     // Catch:{ all -> 0x014d }
            r15.close()     // Catch:{ FileNotFoundException -> 0x0157 }
            goto L_0x015d
        L_0x014d:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0152 }
            goto L_0x0156
        L_0x0152:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x0157 }
        L_0x0156:
            throw r1     // Catch:{ FileNotFoundException -> 0x0157 }
        L_0x0157:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0188 }
        L_0x015d:
            long r23 = r23 + r20
            r17 = 8192(0x2000, double:4.0474E-320)
            long r17 = r17 + r23
            r15 = 524288000(0x1f400000, double:2.590326893E-315)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x016b
            goto L_0x017a
        L_0x016b:
            int r9 = r9 + 1
            r0 = 100
            if (r9 <= r0) goto L_0x00c9
            goto L_0x0177
        L_0x0172:
            r17.getName()     // Catch:{ all -> 0x0188 }
            goto L_0x00c9
        L_0x0177:
            java.lang.String r0 = "SafeZipEntrySaver: Too many files to unzip."
            goto L_0x017c
        L_0x017a:
            java.lang.String r0 = "SafeZipEntrySaver: File being unzipped is too big."
        L_0x017c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0188 }
        L_0x017f:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0188 }
            r9.<init>(r13)     // Catch:{ all -> 0x0188 }
            r12.close()     // Catch:{ FileNotFoundException | IOException -> 0x0192 }
            goto L_0x0199
        L_0x0188:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x018d }
            goto L_0x0191
        L_0x018d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0192 }
        L_0x0191:
            throw r1     // Catch:{ FileNotFoundException | IOException -> 0x0192 }
        L_0x0192:
            r1 = move-exception
            r0 = r26
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01d3 }
            r9 = 0
        L_0x0199:
            if (r9 == 0) goto L_0x01cc
            r10.A1i(r11)     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = "etag"
            r0 = r28
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch:{ all -> 0x01d3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01d3 }
            if (r0 != 0) goto L_0x01c2
            if (r1 != 0) goto L_0x01b7
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r10)     // Catch:{ all -> 0x01d3 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)     // Catch:{ all -> 0x01d3 }
            goto L_0x01bf
        L_0x01b7:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r10)     // Catch:{ all -> 0x01d3 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r8, r1)     // Catch:{ all -> 0x01d3 }
        L_0x01bf:
            r0.apply()     // Catch:{ all -> 0x01d3 }
        L_0x01c2:
            r7.close()     // Catch:{ all -> 0x01dd }
        L_0x01c5:
            r2.close()     // Catch:{ Exception -> 0x01e7 }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x01f8
        L_0x01cc:
            r7.close()     // Catch:{ all -> 0x01dd }
        L_0x01cf:
            r2.close()     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01f4
        L_0x01d3:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01d8 }
            goto L_0x01dc
        L_0x01d8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01dd }
        L_0x01dc:
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x01e7 }
        L_0x01e6:
            throw r1     // Catch:{ Exception -> 0x01e7 }
        L_0x01e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r27)     // Catch:{ all -> 0x020e }
            r1.append(r6)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = " Exception: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x020e }
        L_0x01f4:
            android.net.TrafficStats.clearThreadStatsTag()
            r9 = 0
        L_0x01f8:
            X.1Ug r2 = r5.A00
            if (r9 != 0) goto L_0x020a
            java.lang.String r1 = "PAY: PaymentBackgroundBatchFetcher/batch background download failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r2.BrC(r0)
        L_0x0206:
            r4.set(r3)
            return r9
        L_0x020a:
            r2.BrF(r9)
            goto L_0x0206
        L_0x020e:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0213:
            r1 = 0
            X.1Ug r0 = r5.A00     // Catch:{ InterruptedException | ExecutionException -> 0x021f }
            if (r0 == 0) goto L_0x021f
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x021f }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ InterruptedException | ExecutionException -> 0x021f }
            return r0
        L_0x021f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133086o9.A00():java.util.Set");
    }

    public C133086o9(C218617r r2, AnonymousClass181 r3, C19830z4 r4, AnonymousClass1D9 r5, AnonymousClass1KG r6, C220418j r7) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r6;
    }
}
