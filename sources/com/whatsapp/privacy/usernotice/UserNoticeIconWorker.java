package com.whatsapp.privacy.usernotice;

import X.AnonymousClass10E;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.C17890vO;
import X.C18070vi;
import X.C220418j;
import X.C26106CsQ;
import X.C33421in;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class UserNoticeIconWorker extends Worker {
    public final AnonymousClass181 A00;
    public final AnonymousClass1D9 A01;
    public final C33421in A02;
    public final C26106CsQ A03;
    public final C220418j A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.8Jj} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r13 = this;
            androidx.work.WorkerParameters r4 = r13.A01
            X.A6Y r3 = r4.A01
            X.C18070vi.A0X(r3)
            java.lang.String r0 = "notice_id"
            r2 = -1
            int r9 = r3.A02(r0, r2)
            java.lang.String r1 = "file_name_list"
            java.util.Map r0 = r3.A00
            java.lang.Object r8 = r0.get(r1)
            boolean r0 = r8 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x008e
            java.lang.String[] r8 = (java.lang.String[]) r8
        L_0x001c:
            java.lang.String r1 = "url_list"
            java.util.Map r0 = r3.A00
            java.lang.Object r7 = r0.get(r1)
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x008c
            java.lang.String[] r7 = (java.lang.String[]) r7
        L_0x002b:
            if (r9 == r2) goto L_0x00be
            if (r7 == 0) goto L_0x00be
            if (r8 == 0) goto L_0x00be
            int r1 = r4.A00
            r0 = 4
            if (r1 > r0) goto L_0x00be
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            int r6 = r7.length
            r5 = 0
            r12 = 0
        L_0x003e:
            if (r5 >= r6) goto L_0x00b8
            r2 = r7[r5]
            int r11 = r12 + 1
            X.1D9 r1 = r13.A01     // Catch:{ IOException -> 0x009b }
            X.18j r0 = r13.A04     // Catch:{ IOException -> 0x009b }
            r10 = 0
            X.AUZ r4 = r1.A05(r10, r0, r2, r10)     // Catch:{ IOException -> 0x009b }
            java.net.HttpURLConnection r0 = r4.A01     // Catch:{ all -> 0x0094 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x0094 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0066
            X.CsQ r1 = r13.A03     // Catch:{ all -> 0x0094 }
            java.lang.Integer r0 = X.C17880vN.A0k()     // Catch:{ all -> 0x0094 }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x0094 }
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            goto L_0x0090
        L_0x0066:
            X.1in r3 = r13.A02     // Catch:{ all -> 0x0094 }
            r2 = r8[r12]     // Catch:{ all -> 0x0094 }
            X.181 r1 = r13.A00     // Catch:{ all -> 0x0094 }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0094 }
            X.9Hb r0 = r4.BMP(r1, r10, r0)     // Catch:{ all -> 0x0094 }
            boolean r0 = r3.A07(r0, r2, r9)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0082
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            goto L_0x0090
        L_0x0082:
            r4.close()     // Catch:{ IOException -> 0x009b }
            android.net.TrafficStats.clearThreadStatsTag()
            int r5 = r5 + 1
            r12 = r11
            goto L_0x003e
        L_0x008c:
            r7 = 0
            goto L_0x002b
        L_0x008e:
            r8 = 0
            goto L_0x001c
        L_0x0090:
            r4.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00af
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x009b }
            throw r0     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b3 }
            X.CsQ r1 = r13.A03     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r0 = X.C17880vN.A0k()     // Catch:{ all -> 0x00b3 }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x00b3 }
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x00b3 }
            r0.<init>()     // Catch:{ all -> 0x00b3 }
        L_0x00af:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00b3:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00b8:
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x00be:
            X.CsQ r1 = r13.A03
            java.lang.Integer r0 = X.C17880vN.A0k()
            X.C26106CsQ.A02(r1, r0)
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.usernotice.UserNoticeIconWorker.A0B():X.9Lg");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeIconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(applicationContext);
        this.A00 = (AnonymousClass181) r1.AA9.get();
        this.A03 = (C26106CsQ) r1.ABI.get();
        this.A04 = (C220418j) r1.A9d.get();
        this.A01 = (AnonymousClass1D9) r1.A0n.get();
        this.A02 = (C33421in) r1.ABG.get();
    }
}
