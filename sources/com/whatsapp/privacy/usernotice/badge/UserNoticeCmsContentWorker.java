package com.whatsapp.privacy.usernotice.badge;

import X.AnonymousClass10E;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.C17890vO;
import X.C18070vi;
import X.C220418j;
import X.C26106CsQ;
import X.C33531iy;
import X.C40701v8;
import X.C62582rd;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class UserNoticeCmsContentWorker extends Worker {
    public final AnonymousClass181 A00;
    public final C40701v8 A01;
    public final C26106CsQ A02;
    public final C62582rd A03;
    public final C33531iy A04;
    public final AnonymousClass1D9 A05;
    public final C220418j A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.8Jk} */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0223, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0227, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3 A[Catch:{ IOException | JSONException -> 0x00d5, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ff A[Catch:{ IOException | JSONException -> 0x00d5, all -> 0x020e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r33 = this;
            r9 = r33
            androidx.work.WorkerParameters r2 = r9.A01
            X.A6Y r1 = r2.A01
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "notices_id"
            int[] r10 = r1.A04(r0)
            if (r10 == 0) goto L_0x0245
            int r0 = r10.length
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = "url"
            java.lang.String r3 = r1.A03(r0)
            if (r3 == 0) goto L_0x0245
            int r1 = r2.A00
            r0 = 4
            if (r1 > r0) goto L_0x0245
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.1D9 r1 = r9.A05     // Catch:{ IOException -> 0x0228 }
            X.18j r0 = r9.A06     // Catch:{ IOException -> 0x0228 }
            r2 = 0
            X.AUZ r8 = r1.A05(r2, r0, r3, r2)     // Catch:{ IOException -> 0x0228 }
            X.C18070vi.A0b(r8)     // Catch:{ all -> 0x0221 }
            java.net.HttpURLConnection r0 = r8.A01     // Catch:{ all -> 0x020e }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x020e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0050
            X.CsQ r1 = r9.A02     // Catch:{ all -> 0x020e }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x020e }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x020e }
            r8.close()     // Catch:{ all -> 0x020e }
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            goto L_0x021d
        L_0x0050:
            X.181 r1 = r9.A00     // Catch:{ all -> 0x020e }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020e }
            X.9Hb r0 = r8.BMP(r1, r2, r0)     // Catch:{ all -> 0x020e }
            byte[] r0 = X.AnonymousClass1EY.A04(r0)     // Catch:{ all -> 0x020e }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x020e }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x020e }
            r1.<init>(r0)     // Catch:{ all -> 0x020e }
            X.1v8 r14 = r9.A01     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "results"
            java.lang.String r13 = "Failed to parse user notice content list"
            r0 = 27
            X.7Rn r12 = new X.7Rn     // Catch:{ all -> 0x020e }
            r12.<init>(r0)     // Catch:{ all -> 0x020e }
            java.util.LinkedHashMap r11 = X.C17880vN.A13()     // Catch:{ all -> 0x020e }
            org.json.JSONObject r1 = X.AnonymousClass1EY.A01(r1)     // Catch:{ IOException | JSONException -> 0x00d5 }
            X.C17960vV.A07(r1)     // Catch:{ IOException | JSONException -> 0x00d5 }
            X.C18070vi.A0X(r1)     // Catch:{ IOException | JSONException -> 0x00d5 }
            boolean r0 = r1.has(r2)     // Catch:{ IOException | JSONException -> 0x00d5 }
            if (r0 != 0) goto L_0x008e
            java.util.Map r1 = X.AnonymousClass1D7.A0F(r11)     // Catch:{ IOException | JSONException -> 0x00d5 }
            goto L_0x00dd
        L_0x008e:
            org.json.JSONArray r7 = r1.getJSONArray(r2)     // Catch:{ IOException | JSONException -> 0x00d5 }
            int r6 = r7.length()     // Catch:{ IOException | JSONException -> 0x00d5 }
            r5 = 0
        L_0x0097:
            if (r5 >= r6) goto L_0x00d9
            org.json.JSONObject r2 = r7.getJSONObject(r5)     // Catch:{ IOException | JSONException -> 0x00d5 }
            java.lang.String r0 = "notice_id"
            int r1 = r2.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00d5 }
            java.lang.String r0 = "channel"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ IOException | JSONException -> 0x00d5 }
            if (r4 != 0) goto L_0x00ad
            java.lang.String r4 = "default"
        L_0x00ad:
            X.2mq r3 = X.C40701v8.A00(r14, r2, r1)     // Catch:{ IOException | JSONException -> 0x00d5 }
            if (r3 == 0) goto L_0x00d2
            java.lang.Object r2 = r11.get(r4)     // Catch:{ IOException | JSONException -> 0x00d5 }
            r1 = 1
            if (r2 != 0) goto L_0x00bf
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00d5 }
            r2.<init>(r1, r12)     // Catch:{ IOException | JSONException -> 0x00d5 }
        L_0x00bf:
            java.util.PriorityQueue r2 = (java.util.PriorityQueue) r2     // Catch:{ IOException | JSONException -> 0x00d5 }
            java.lang.Object r0 = r11.get(r4)     // Catch:{ IOException | JSONException -> 0x00d5 }
            if (r0 != 0) goto L_0x00cc
            java.util.PriorityQueue r0 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00d5 }
            r0.<init>(r1, r12)     // Catch:{ IOException | JSONException -> 0x00d5 }
        L_0x00cc:
            r2.offer(r3)     // Catch:{ IOException | JSONException -> 0x00d5 }
            r11.put(r4, r2)     // Catch:{ IOException | JSONException -> 0x00d5 }
        L_0x00d2:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00d5:
            r0 = move-exception
            com.whatsapp.util.Log.e(r13, r0)     // Catch:{ all -> 0x020e }
        L_0x00d9:
            java.util.Map r1 = X.AnonymousClass1D7.A0F(r11)     // Catch:{ all -> 0x020e }
        L_0x00dd:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "UserNoticeCmsContentWorker/storeUserNoticeContent/cannot parse response for notice: "
            X.C17900vP.A0X(r10, r0, r1)     // Catch:{ all -> 0x020e }
            X.CsQ r1 = r9.A02     // Catch:{ all -> 0x020e }
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ all -> 0x020e }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x020e }
            r8.close()     // Catch:{ all -> 0x020e }
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            goto L_0x021d
        L_0x00ff:
            X.2rd r7 = r9.A03     // Catch:{ all -> 0x020e }
            r6 = 0
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x020e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x01e3
            X.0vl r0 = r7.A07     // Catch:{ all -> 0x020e }
            r32 = r0
            X.C17890vO.A1E(r32)     // Catch:{ all -> 0x020e }
            X.0vl r0 = r7.A06     // Catch:{ all -> 0x020e }
            r31 = r0
            X.C17890vO.A1E(r31)     // Catch:{ all -> 0x020e }
            X.0vl r0 = r7.A08     // Catch:{ all -> 0x020e }
            r30 = r0
            X.C17890vO.A1E(r30)     // Catch:{ all -> 0x020e }
            java.util.Iterator r17 = X.AnonymousClass000.A15(r1)     // Catch:{ all -> 0x020e }
        L_0x0125:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x01b8
            java.util.Map$Entry r16 = X.AnonymousClass000.A16(r17)     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r16.getValue()     // Catch:{ all -> 0x020e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x020e }
            r5 = 0
            X.2mq[] r0 = new X.C59762mq[r6]     // Catch:{ all -> 0x020e }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ all -> 0x020e }
            int r10 = r4.length     // Catch:{ all -> 0x020e }
        L_0x013d:
            if (r5 >= r10) goto L_0x0125
            r3 = r4[r5]     // Catch:{ all -> 0x020e }
            X.2mq r3 = (X.C59762mq) r3     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r30.getValue()     // Catch:{ all -> 0x020e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x020e }
            java.lang.Object r0 = r16.getKey()     // Catch:{ all -> 0x020e }
            java.lang.Object r12 = r1.get(r0)     // Catch:{ all -> 0x020e }
            if (r12 != 0) goto L_0x0159
            r0 = 1
            java.util.PriorityQueue r12 = new java.util.PriorityQueue     // Catch:{ all -> 0x020e }
            r12.<init>(r0)     // Catch:{ all -> 0x020e }
        L_0x0159:
            java.util.PriorityQueue r12 = (java.util.PriorityQueue) r12     // Catch:{ all -> 0x020e }
            int r0 = r3.A00     // Catch:{ all -> 0x020e }
            r22 = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x020e }
            r12.offer(r2)     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r30.getValue()     // Catch:{ all -> 0x020e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x020e }
            java.lang.Object r0 = r16.getKey()     // Catch:{ all -> 0x020e }
            r1.put(r0, r12)     // Catch:{ all -> 0x020e }
            X.2ma r13 = r3.A05     // Catch:{ all -> 0x020e }
            if (r13 == 0) goto L_0x01ac
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x020e }
            X.11P r0 = r7.A01     // Catch:{ all -> 0x020e }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x020e }
            long r26 = r12.toSeconds(r0)     // Catch:{ all -> 0x020e }
            java.lang.String r15 = r13.A03     // Catch:{ all -> 0x020e }
            java.lang.String r14 = r13.A02     // Catch:{ all -> 0x020e }
            int r12 = r13.A00     // Catch:{ all -> 0x020e }
            X.1vP r1 = r13.A01     // Catch:{ all -> 0x020e }
            r28 = -1
            r23 = 100
            r24 = 1
            X.2rB r0 = new X.2rB     // Catch:{ all -> 0x020e }
            r18 = r0
            r19 = r1
            r20 = r15
            r21 = r14
            r25 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x020e }
            r11.add(r0)     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x020e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x020e }
            r1.put(r2, r0)     // Catch:{ all -> 0x020e }
        L_0x01ac:
            java.lang.Object r0 = r32.getValue()     // Catch:{ all -> 0x020e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x020e }
            r0.put(r2, r3)     // Catch:{ all -> 0x020e }
            int r5 = r5 + 1
            goto L_0x013d
        L_0x01b8:
            X.00H r2 = r7.A05     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x020e }
            X.2st r1 = (X.C63332st) r1     // Catch:{ all -> 0x020e }
            X.0vl r0 = r7.A09     // Catch:{ all -> 0x020e }
            java.util.Collection r0 = X.C17890vO.A0g(r0)     // Catch:{ all -> 0x020e }
            r1.A06(r0)     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x020e }
            X.2st r1 = (X.C63332st) r1     // Catch:{ all -> 0x020e }
            java.util.Collection r0 = X.C17890vO.A0g(r31)     // Catch:{ all -> 0x020e }
            r1.A04(r0)     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x020e }
            X.2st r1 = (X.C63332st) r1     // Catch:{ all -> 0x020e }
            java.util.Collection r0 = X.C17890vO.A0g(r32)     // Catch:{ all -> 0x020e }
            r1.A05(r0)     // Catch:{ all -> 0x020e }
        L_0x01e3:
            r8.close()     // Catch:{ all -> 0x020e }
            java.util.Iterator r7 = r11.iterator()     // Catch:{ all -> 0x020e }
        L_0x01ea:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0218
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x020e }
            X.2rB r5 = (X.C62302rB) r5     // Catch:{ all -> 0x020e }
            X.1iy r4 = r9.A04     // Catch:{ all -> 0x020e }
            X.2mZ r0 = r5.A05     // Catch:{ all -> 0x020e }
            int r3 = r0.A00     // Catch:{ all -> 0x020e }
            r2 = 1
            X.1iu r1 = r4.A03     // Catch:{ all -> 0x020e }
            r1.A00(r3, r2, r6)     // Catch:{ all -> 0x020e }
            r0 = 100
            r1.A00(r3, r0, r6)     // Catch:{ all -> 0x020e }
            r4.A00(r5, r2)     // Catch:{ all -> 0x020e }
            r4.A00(r5, r0)     // Catch:{ all -> 0x020e }
            goto L_0x01ea
        L_0x020e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "UserNoticeCmsContentWorker/parseResponse caught throwable "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x0221 }
        L_0x0218:
            X.8Jk r0 = new X.8Jk     // Catch:{ all -> 0x0221 }
            r0.<init>()     // Catch:{ all -> 0x0221 }
        L_0x021d:
            r8.close()     // Catch:{ IOException -> 0x0228 }
            goto L_0x023c
        L_0x0221:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ IOException -> 0x0228 }
            throw r0     // Catch:{ IOException -> 0x0228 }
        L_0x0228:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0240 }
            X.CsQ r1 = r9.A02     // Catch:{ all -> 0x0240 }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x0240 }
            X.C26106CsQ.A02(r1, r0)     // Catch:{ all -> 0x0240 }
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x0240 }
            r0.<init>()     // Catch:{ all -> 0x0240 }
        L_0x023c:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x0240:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0245:
            X.CsQ r1 = r9.A02
            java.lang.Integer r0 = X.C17880vN.A0i()
            X.C26106CsQ.A02(r1, r0)
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.A0B():X.9Lg");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeCmsContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        this.A00 = (AnonymousClass181) r1.AA9.get();
        this.A02 = (C26106CsQ) r1.ABI.get();
        this.A06 = (C220418j) r1.A9d.get();
        this.A05 = (AnonymousClass1D9) r1.A0n.get();
        this.A04 = (C33531iy) r1.ABF.get();
        this.A03 = (C62582rd) r1.ABE.get();
        this.A01 = (C40701v8) r1.ABH.get();
    }
}
