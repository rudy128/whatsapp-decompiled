package com.whatsapp.privacy.usernotice;

import X.AnonymousClass10E;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.C000100c;
import X.C17890vO;
import X.C18070vi;
import X.C220418j;
import X.C26106CsQ;
import X.C33421in;
import X.C40701v8;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class UserNoticeContentWorker extends Worker {
    public final C000100c A00;
    public final AnonymousClass181 A01;
    public final AnonymousClass1D9 A02;
    public final C33421in A03;
    public final C40701v8 A04;
    public final C26106CsQ A05;
    public final C220418j A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: X.8Jk} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r7 = this;
            androidx.work.WorkerParameters r4 = r7.A01
            X.A6Y r2 = r4.A01
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "notice_id"
            r1 = -1
            int r6 = r2.A02(r0, r1)
            java.lang.String r0 = "url"
            java.lang.String r3 = r2.A03(r0)
            if (r6 == r1) goto L_0x0133
            if (r3 == 0) goto L_0x0133
            int r1 = r4.A00
            r0 = 4
            if (r1 > r0) goto L_0x0133
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.1D9 r1 = r7.A02     // Catch:{ IOException -> 0x0116 }
            X.18j r0 = r7.A06     // Catch:{ IOException -> 0x0116 }
            r2 = 0
            X.AUZ r5 = r1.A05(r2, r0, r3, r2)     // Catch:{ IOException -> 0x0116 }
            java.net.HttpURLConnection r0 = r5.A01     // Catch:{ all -> 0x010f }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x010f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0046
            X.CsQ r1 = r7.A05     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x010f }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x010f }
            X.8Ji r1 = new X.8Ji     // Catch:{ all -> 0x010f }
            r1.<init>()     // Catch:{ all -> 0x010f }
            goto L_0x0108
        L_0x0046:
            X.181 r1 = r7.A01     // Catch:{ all -> 0x010f }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010f }
            X.9Hb r0 = r5.BMP(r1, r2, r0)     // Catch:{ all -> 0x010f }
            byte[] r4 = X.AnonymousClass1EY.A04(r0)     // Catch:{ all -> 0x010f }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x010f }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x010f }
            r1.<init>(r4)     // Catch:{ all -> 0x010f }
            X.1v8 r0 = r7.A04     // Catch:{ all -> 0x010f }
            X.2mq r3 = r0.A03(r1, r6)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "UserNoticeContentManager/storeUserNoticeContent/cannot parse response for notice: "
            X.C17900vP.A0j(r0, r1, r6)     // Catch:{ all -> 0x010f }
            X.CsQ r1 = r7.A05     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ all -> 0x010f }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x010f }
            X.8Ji r1 = new X.8Ji     // Catch:{ all -> 0x010f }
            r1.<init>()     // Catch:{ all -> 0x010f }
            goto L_0x0108
        L_0x007f:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x010f }
            r2.<init>(r4)     // Catch:{ all -> 0x010f }
            X.1in r1 = r7.A03     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "content.json"
            boolean r0 = r1.A07(r2, r0, r6)     // Catch:{ all -> 0x010f }
            if (r0 != 0) goto L_0x0094
            X.8Ji r1 = new X.8Ji     // Catch:{ all -> 0x010f }
            r1.<init>()     // Catch:{ all -> 0x010f }
            goto L_0x0108
        L_0x0094:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x010f }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x010f }
            X.2Lt r1 = r3.A02     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = "banner_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x010f }
            r6.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "banner_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x010f }
            r6.add(r0)     // Catch:{ all -> 0x010f }
        L_0x00b4:
            X.2Lu r1 = r3.A04     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = "modal_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x010f }
            r6.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "modal_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x010f }
            r6.add(r0)     // Catch:{ all -> 0x010f }
        L_0x00cc:
            X.2Lu r1 = r3.A03     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x00e4
            java.lang.String r0 = "blocking_modal_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x010f }
            r6.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "blocking_modal_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x010f }
            r6.add(r0)     // Catch:{ all -> 0x010f }
        L_0x00e4:
            X.9pH r4 = new X.9pH     // Catch:{ all -> 0x010f }
            r4.<init>()     // Catch:{ all -> 0x010f }
            r3 = 0
            java.lang.String[] r1 = X.C17890vO.A1b(r2, r3)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "file_name_list"
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x010f }
            r2.put(r0, r1)     // Catch:{ all -> 0x010f }
            java.lang.String[] r1 = X.C17890vO.A1b(r6, r3)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "url_list"
            r2.put(r0, r1)     // Catch:{ all -> 0x010f }
            X.A6Y r0 = r4.A00()     // Catch:{ all -> 0x010f }
            X.8Jk r1 = new X.8Jk     // Catch:{ all -> 0x010f }
            r1.<init>(r0)     // Catch:{ all -> 0x010f }
        L_0x0108:
            r5.close()     // Catch:{ IOException -> 0x0116 }
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L_0x010f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x0116 }
            throw r0     // Catch:{ IOException -> 0x0116 }
        L_0x0116:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x012e }
            X.CsQ r1 = r7.A05     // Catch:{ all -> 0x012e }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x012e }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x012e }
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x012e }
            r0.<init>()     // Catch:{ all -> 0x012e }
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x012e:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0133:
            X.CsQ r1 = r7.A05
            java.lang.Integer r0 = X.C17880vN.A0i()
            X.C26106CsQ.A02(r1, r0)
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.usernotice.UserNoticeContentWorker.A0B():X.9Lg");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H;
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = (AnonymousClass181) r1.AA9.get();
        this.A05 = (C26106CsQ) r1.ABI.get();
        this.A06 = (C220418j) r1.A9d.get();
        this.A02 = (AnonymousClass1D9) r1.A0n.get();
        this.A03 = (C33421in) r1.ABG.get();
        this.A04 = (C40701v8) r1.ABH.get();
    }
}
