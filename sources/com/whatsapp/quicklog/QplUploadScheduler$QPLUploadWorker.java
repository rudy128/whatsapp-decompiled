package com.whatsapp.quicklog;

import X.AnonymousClass10E;
import X.C17890vO;
import X.C56002gj;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class QplUploadScheduler$QPLUploadWorker extends Worker {
    public final C56002gj A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.8Jk} */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Lg, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0103, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.A04.BKY(r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.A04.BKY(r0.getMessage());
        r5.A00 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01dd A[ExcHandler: Exception | OutOfMemoryError (r0v21 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:27:0x0098] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r29 = this;
            r0 = r29
            X.2gj r5 = r0.A00
            X.19M r4 = r5.A02
            java.util.concurrent.Semaphore r0 = r4.A04     // Catch:{ InterruptedException -> 0x022d }
            r28 = r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x022d }
            r1 = 5
            boolean r0 = r0.tryAcquire(r1, r3)     // Catch:{ InterruptedException -> 0x022d }
            if (r0 == 0) goto L_0x022d
            r3 = 0
            r5.A00 = r3     // Catch:{ all -> 0x0228 }
            java.lang.String r10 = ".txt"
            java.io.File[] r9 = X.AnonymousClass19M.A00(r4, r10)     // Catch:{ all -> 0x0228 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0228 }
            long r0 = X.AnonymousClass19M.A07     // Catch:{ all -> 0x0228 }
            long r7 = r7 - r0
            r6 = 0
        L_0x0025:
            int r0 = r9.length     // Catch:{ all -> 0x0228 }
            if (r6 >= r0) goto L_0x003a
            r0 = r9[r6]     // Catch:{ all -> 0x0228 }
            long r1 = r0.lastModified()     // Catch:{ all -> 0x0228 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0037
            r0 = r9[r6]     // Catch:{ all -> 0x0228 }
            r4.A01(r0)     // Catch:{ all -> 0x0228 }
        L_0x0037:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x003a:
            java.io.File[] r8 = X.AnonymousClass19M.A00(r4, r10)     // Catch:{ all -> 0x0228 }
            X.118 r0 = r4.A00     // Catch:{ all -> 0x0228 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0228 }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "qpl"
            java.io.File r7 = X.C17880vN.A0e(r1, r0)     // Catch:{ all -> 0x0228 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0228 }
            int r11 = r8.length     // Catch:{ all -> 0x0228 }
            r2 = 0
        L_0x0052:
            if (r2 >= r11) goto L_0x0071
            r1 = r8[r2]     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = r1.getName()     // Catch:{ IOException -> 0x0064 }
            java.io.File r0 = X.C64062u9.A05(r1, r7, r0)     // Catch:{ IOException -> 0x0064 }
            if (r0 == 0) goto L_0x006e
            r6.add(r0)     // Catch:{ IOException -> 0x0064 }
            goto L_0x006e
        L_0x0064:
            r0 = move-exception
            X.19A r1 = r4.A03     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0228 }
            r1.BKV(r0)     // Catch:{ all -> 0x0228 }
        L_0x006e:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0071:
            java.io.File[] r0 = new java.io.File[r3]     // Catch:{ all -> 0x0228 }
            java.lang.Object[] r2 = r6.toArray(r0)     // Catch:{ all -> 0x0228 }
            java.io.File[] r2 = (java.io.File[]) r2     // Catch:{ all -> 0x0228 }
            int r7 = r2.length     // Catch:{ all -> 0x0228 }
            if (r7 != 0) goto L_0x0098
            X.199 r0 = r5.A05     // Catch:{ all -> 0x0228 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0228 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0228 }
            X.0z4 r0 = X.C17880vN.A0K(r0)     // Catch:{ all -> 0x0228 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "qpl_last_upload_ts"
            X.C17880vN.A1D(r1, r0, r2)     // Catch:{ all -> 0x0228 }
            X.8Jk r0 = new X.8Jk     // Catch:{ all -> 0x0228 }
            r0.<init>()     // Catch:{ all -> 0x0228 }
            goto L_0x0224
        L_0x0098:
            android.os.ConditionVariable r10 = new android.os.ConditionVariable     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r10.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r0 = 4
            X.AUa r9 = new X.AUa     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r9.<init>(r10, r5, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r0 = 17
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            X.18j r1 = r5.A06     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            X.11W r0 = r5.A07     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r21 = r0.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            X.181 r0 = r5.A01     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r20 = "https://graph.whatsapp.net/wa_qpl_data"
            r24 = 8
            r14 = 0
            X.A7N r6 = new X.A7N     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r22 = r14
            r23 = r14
            r26 = r3
            r27 = r3
            r17 = r9
            r18 = r14
            r19 = r1
            r25 = r3
            r15 = r6
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r6.A06(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            X.19G r9 = r5.A03     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = X.C197569wu.A0D     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r0 = "app_id"
            r6.A06(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r0 = 0
        L_0x00e0:
            r1 = r2[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            r13.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r17 = "batches[]"
            java.lang.String r18 = r1.getName()     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            long r22 = r1.length()     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            r20 = 0
            java.util.List r12 = r6.A0E     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            X.9gD r1 = new X.9gD     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            r15 = r1
            r16 = r13
            r19 = r3
            r15.<init>(r16, r17, r18, r19, r20, r22)     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            r12.add(r1)     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01dd }
            goto L_0x010d
        L_0x0103:
            r1 = move-exception
            X.19A r12 = r5.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r12.BKY(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
        L_0x010d:
            int r0 = r0 + 1
            if (r0 < r7) goto L_0x00e0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r0 = "upload_time"
            r6.A06(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            X.199 r0 = r9.A06     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            long r0 = r0.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r0 = "user_id"
            r6.A06(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            org.json.JSONObject r13 = X.C17880vN.A15()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            X.11C r12 = r9.A01     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            android.telephony.TelephonyManager r15 = r12.A0K()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            if (r15 == 0) goto L_0x014d
            java.lang.String r1 = "carrier"
            java.lang.String r0 = r15.getNetworkOperatorName()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = "country"
            java.lang.String r0 = r15.getSimCountryIso()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
        L_0x014d:
            java.lang.String r15 = "device_name"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r0.append(r1)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = "-"
            r0.append(r1)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r15, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r15 = "device_code_name"
            java.lang.String r0 = android.os.Build.DEVICE     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r15, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r15 = "device_manufacturer"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r15, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r0 = "device_model"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = "year_class"
            X.0vc r0 = r9.A04     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            int r0 = X.C24191Jf.A02(r12, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = "mem_class"
            int r0 = X.C24161Jc.A00(r12)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = "device_os_version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r0 = "is_employee"
            r13.put(r0, r3)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            X.11S r0 = r9.A00     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = r0.A0B()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            if (r1 == 0) goto L_0x01b0
            java.lang.String r0 = "1[0-9]{3}555[0-9]{4}"
            boolean r0 = r1.matches(r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r1 = "is_tester"
            r0 = 1
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
        L_0x01b0:
            java.lang.String r12 = "oc_version"
            X.118 r0 = r9.A02     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            long r0 = X.C24201Jg.A00(r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            r13.put(r12, r0)     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            java.lang.String r1 = r13.toString()     // Catch:{ Exception -> 0x01c2, Exception | OutOfMemoryError -> 0x01dd }
            goto L_0x01ce
        L_0x01c2:
            r0 = move-exception
            X.19A r9 = r9.A05     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r1 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r9.BhE(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r1 = 0
        L_0x01ce:
            java.lang.String r0 = "batch_info"
            r6.A06(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r6.A04(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            r0 = 100000(0x186a0, double:4.94066E-319)
            r10.block(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01dd }
            goto L_0x01e9
        L_0x01dd:
            r0 = move-exception
            X.19A r1 = r5.A04     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0228 }
            r1.BKY(r0)     // Catch:{ all -> 0x0228 }
            r5.A00 = r3     // Catch:{ all -> 0x0228 }
        L_0x01e9:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x0228 }
            r1 = 0
        L_0x01ed:
            r0 = r2[r1]     // Catch:{ all -> 0x0228 }
            r4.A01(r0)     // Catch:{ all -> 0x0228 }
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x01ed
            boolean r0 = r5.A00     // Catch:{ all -> 0x0228 }
            if (r0 != 0) goto L_0x0200
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x0228 }
            r0.<init>()     // Catch:{ all -> 0x0228 }
            goto L_0x0224
        L_0x0200:
            if (r3 >= r11) goto L_0x020a
            r0 = r8[r3]     // Catch:{ all -> 0x0228 }
            r4.A01(r0)     // Catch:{ all -> 0x0228 }
            int r3 = r3 + 1
            goto L_0x0200
        L_0x020a:
            X.199 r0 = r5.A05     // Catch:{ all -> 0x0228 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0228 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0228 }
            X.0z4 r0 = X.C17880vN.A0K(r0)     // Catch:{ all -> 0x0228 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "qpl_last_upload_ts"
            X.C17880vN.A1D(r1, r0, r2)     // Catch:{ all -> 0x0228 }
            X.8Jk r0 = new X.8Jk     // Catch:{ all -> 0x0228 }
            r0.<init>()     // Catch:{ all -> 0x0228 }
        L_0x0224:
            r28.release()
            return r0
        L_0x0228:
            r0 = move-exception
            r28.release()
            throw r0
        L_0x022d:
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.A0B():X.9Lg");
    }

    public QplUploadScheduler$QPLUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (C56002gj) ((AnonymousClass10E) C17890vO.A0H(context)).Ao8.A00.A47.get();
    }
}
