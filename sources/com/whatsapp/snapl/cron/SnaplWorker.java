package com.whatsapp.snapl.cron;

import X.AnonymousClass7S4;
import X.C18070vi;
import X.C18100vl;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class SnaplWorker extends CoroutineWorker {
    public final C18100vl A00;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        if (r2 != 4) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d7, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01da, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.snapl.cron.SnaplWorker r15, java.util.List r16, X.C30391dr r17) {
        /*
            r8 = r15
            r3 = r17
            r9 = r16
            boolean r0 = r3 instanceof X.AnonymousClass7V5
            if (r0 == 0) goto L_0x01ac
            r6 = r3
            X.7V5 r6 = (X.AnonymousClass7V5) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01ac
            int r2 = r2 - r1
            r6.label = r2
        L_0x0017:
            java.lang.Object r2 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r13 = 0
            r16 = 3
            r7 = 0
            r4 = 3
            r12 = 1
            r10 = 2
            if (r0 == 0) goto L_0x0030
            if (r0 == r12) goto L_0x00e2
            if (r0 == r10) goto L_0x018a
            if (r0 != r4) goto L_0x01b3
            X.C30691eM.A01(r2)
        L_0x002f:
            return r2
        L_0x0030:
            X.C30691eM.A01(r2)
            r9.size()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00fe
            androidx.work.WorkerParameters r0 = r15.A01
            int r0 = r0.A00
            long r0 = (long) r0
            r14 = 1
            java.lang.String r2 = "SNAPL"
            int r3 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0081
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0081
            X.0vl r0 = r8.A00
            java.lang.Object r0 = r0.getValue()
            X.00c r0 = (X.C000100c) r0
            X.190 r1 = r0.BG6()
            java.lang.String r0 = "retry"
            r1.A0G(r2, r0, r13)
        L_0x005e:
            java.util.ArrayList r1 = X.C29351c6.A0E(r9)
            java.util.Iterator r11 = r9.iterator()
        L_0x0066:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r11.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.first
            long r2 = X.C17880vN.A05(r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r1.add(r0)
            goto L_0x0066
        L_0x0081:
            int r3 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x005e
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x005e
            X.0vl r0 = r8.A00
            java.lang.Object r0 = r0.getValue()
            X.00c r0 = (X.C000100c) r0
            X.190 r1 = r0.BG6()
            java.lang.String r0 = "retry_maxout"
            r1.A0G(r2, r0, r13)
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            goto L_0x005e
        L_0x00a3:
            java.util.ArrayList r2 = X.C29351c6.A0E(r9)
            java.util.Iterator r3 = r9.iterator()
        L_0x00ab:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r3.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.second
            r2.add(r0)
            goto L_0x00ab
        L_0x00bd:
            X.0vl r0 = r8.A00
            java.lang.Object r0 = r0.getValue()
            X.00c r0 = (X.C000100c) r0
            X.10E r0 = (X.AnonymousClass10E) r0
            X.10E r0 = r0.Ao8
            X.10G r0 = r0.A00
            X.00S r0 = r0.A4Y
            java.lang.Object r0 = r0.get()
            com.whatsapp.snapl.client.SnaplOhaiHttpClient r0 = (com.whatsapp.snapl.client.SnaplOhaiHttpClient) r0
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r1
            r6.label = r12
            java.lang.Object r2 = r0.A00(r2, r6)
            if (r2 != r5) goto L_0x00f1
            return r5
        L_0x00e2:
            java.lang.Object r1 = r6.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r9 = r6.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r6.L$0
            com.whatsapp.snapl.cron.SnaplWorker r8 = (com.whatsapp.snapl.cron.SnaplWorker) r8
            X.C30691eM.A01(r2)
        L_0x00f1:
            int r2 = X.AnonymousClass000.A0M(r2)
            if (r2 == r12) goto L_0x0104
            if (r2 == r10) goto L_0x0170
            if (r2 == r4) goto L_0x01b8
            r0 = 4
            if (r2 == r0) goto L_0x01c7
        L_0x00fe:
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x0104:
            X.0vl r11 = r8.A00
            java.lang.Object r0 = r11.getValue()
            X.00c r0 = (X.C000100c) r0
            X.10E r0 = (X.AnonymousClass10E) r0
            X.10E r0 = r0.Ao8
            X.10G r0 = r0.A00
            X.6cf r0 = X.AnonymousClass10G.ADV(r0)
            X.C18070vi.A0d(r1, r13)
            X.1WI r0 = r0.A00
            X.1au r9 = r0.A06()
            X.1xA r10 = r9.BD0()     // Catch:{ all -> 0x01d4 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x01cd }
        L_0x0127:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0145
            long r5 = X.C17890vO.A07(r8)     // Catch:{ all -> 0x01cd }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01cd }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "snapl_payload"
            java.lang.String r2 = "id = ?"
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x01cd }
            X.C17880vN.A1V(r1, r13, r5)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "SnaplPayloadStore/DELETE"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x01cd }
            goto L_0x0127
        L_0x0145:
            r10.A00()     // Catch:{ all -> 0x01cd }
            r10.close()     // Catch:{ all -> 0x01d4 }
            r9.close()
            java.lang.Object r0 = r11.getValue()
            X.00c r0 = (X.C000100c) r0
            X.10E r0 = (X.AnonymousClass10E) r0
            X.10E r0 = r0.Ao8
            X.10G r0 = r0.A00
            X.00S r0 = r0.A3n
            java.lang.Object r0 = r0.get()
            X.6er r0 = (X.C127746er) r0
            r0.A00 = r7
            X.0z4 r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "pref_music_persistent_id"
            X.C17880vN.A1E(r1, r0, r7)
            goto L_0x00fe
        L_0x0170:
            int r1 = r9.size()
            int r1 = r1 / r10
            java.util.List r0 = r9.subList(r13, r1)
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r7
            r6.I$0 = r1
            r6.label = r10
            java.lang.Object r0 = A00(r8, r0, r6)
            if (r0 != r5) goto L_0x0197
            return r5
        L_0x018a:
            int r1 = r6.I$0
            java.lang.Object r9 = r6.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r6.L$0
            com.whatsapp.snapl.cron.SnaplWorker r8 = (com.whatsapp.snapl.cron.SnaplWorker) r8
            X.C30691eM.A01(r2)
        L_0x0197:
            int r0 = r9.size()
            java.util.List r0 = r9.subList(r1, r0)
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r4
            java.lang.Object r2 = A00(r8, r0, r6)
            if (r2 != r5) goto L_0x002f
            return r5
        L_0x01ac:
            X.7V5 r6 = new X.7V5
            r6.<init>(r15, r3)
            goto L_0x0017
        L_0x01b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x01b8:
            androidx.work.WorkerParameters r0 = r8.A01
            int r0 = r0.A00
            long r1 = (long) r0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c7
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            return r0
        L_0x01c7:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        L_0x01cd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x01d4 }
            throw r0     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            X.CDX.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.snapl.cron.SnaplWorker.A00(com.whatsapp.snapl.cron.SnaplWorker, java.util.List, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0127, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0A(X.C30391dr r25) {
        /*
            r24 = this;
            r12 = r24
            X.0vl r3 = r12.A00
            java.lang.Object r0 = r3.getValue()
            X.00c r0 = (X.C000100c) r0
            X.0ve r2 = r0.BAL()
            r1 = 10970(0x2ada, float:1.5372E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001e
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x001e:
            java.lang.Object r0 = r3.getValue()
            X.00c r0 = (X.C000100c) r0
            X.10E r0 = (X.AnonymousClass10E) r0
            X.10E r0 = r0.Ao8
            X.10G r0 = r0.A00
            X.6cf r0 = X.AnonymousClass10G.ADV(r0)
            r1 = 10000(0x2710, float:1.4013E-41)
            X.1WI r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0128 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "SELECT * FROM snapl_payload ORDER BY id ASC LIMIT ?"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0128 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0128 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "SnaplPayloadStore/GET_ALL_PAYLOADS"
            android.database.Cursor r3 = r5.A0A(r3, r0, r2)     // Catch:{ all -> 0x0128 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0121 }
        L_0x0052:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "payload_json"
            java.lang.String r5 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "id"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x0121 }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r5 = X.C17880vN.A16(r5)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "required_metadata"
            org.json.JSONObject r1 = r5.getJSONObject(r0)     // Catch:{ all -> 0x0121 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "media_id"
            long r14 = r1.getLong(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "tracking_type"
            java.lang.String r18 = X.C18070vi.A0J(r0, r1)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "current_watching_module"
            java.lang.String r17 = X.C18070vi.A0J(r0, r1)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "persistent_id"
            java.lang.String r16 = X.C18070vi.A0J(r0, r1)     // Catch:{ all -> 0x0121 }
            X.6su r1 = new X.6su     // Catch:{ all -> 0x0121 }
            r13 = r1
            r13.<init>(r14, r16, r17, r18)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "events"
            org.json.JSONArray r9 = r5.getJSONArray(r0)     // Catch:{ all -> 0x0121 }
            int r8 = r9.length()     // Catch:{ all -> 0x0121 }
            java.util.ArrayList r7 = X.C17880vN.A0z(r8)     // Catch:{ all -> 0x0121 }
            r6 = 0
        L_0x00a2:
            if (r6 >= r8) goto L_0x010a
            org.json.JSONObject r10 = r9.getJSONObject(r6)     // Catch:{ all -> 0x0121 }
            X.C18070vi.A0X(r10)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "tag_metadata"
            org.json.JSONObject r15 = r10.optJSONObject(r0)     // Catch:{ all -> 0x0121 }
            r17 = 0
            if (r15 == 0) goto L_0x00d5
            X.6oh r5 = new X.6oh     // Catch:{ all -> 0x0121 }
            r5.<init>()     // Catch:{ all -> 0x0121 }
            java.util.Iterator r16 = r15.keys()     // Catch:{ all -> 0x0121 }
            X.C18070vi.A0X(r16)     // Catch:{ all -> 0x0121 }
        L_0x00c1:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r14 = X.C17880vN.A0v(r16)     // Catch:{ all -> 0x0121 }
            java.util.Map r13 = r5.A00     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r15.get(r14)     // Catch:{ all -> 0x0121 }
            r13.put(r14, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00c1
        L_0x00d5:
            r5 = r17
        L_0x00d7:
            java.lang.String r0 = "event_name"
            java.lang.String r19 = X.C18070vi.A0J(r0, r10)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "media_time_ms"
            long r20 = r10.getLong(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "client_time_ms"
            long r22 = r10.getLong(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "video_client_duration"
            long r15 = r10.optLong(r0)     // Catch:{ all -> 0x0121 }
            java.lang.Long r18 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0121 }
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00fb
            r18 = r17
        L_0x00fb:
            X.6t7 r0 = new X.6t7     // Catch:{ all -> 0x0121 }
            r17 = r5
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r22)     // Catch:{ all -> 0x0121 }
            r7.add(r0)     // Catch:{ all -> 0x0121 }
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x010a:
            X.6rO r0 = new X.6rO     // Catch:{ all -> 0x0121 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0121 }
            X.AnonymousClass1D6.A02(r11, r0, r2)     // Catch:{ all -> 0x0121 }
            goto L_0x0052
        L_0x0114:
            r3.close()     // Catch:{ all -> 0x0128 }
            r4.close()
            r0 = r25
            java.lang.Object r0 = A00(r12, r2, r0)
            return r0
        L_0x0121:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0128 }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.snapl.cron.SnaplWorker.A0A(X.1dr):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnaplWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = AnonymousClass7S4.A02(context, 19);
    }
}
