package X;

import android.content.Context;

/* renamed from: X.BPi  reason: case insensitive filesystem */
public class C22795BPi extends C27087DTm {
    public long A00 = 0;
    public final E92 A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.9zp[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.9zp[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.9zp[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: X.9zp[]} */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r2v13, types: [X.9zp, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r0.importance == 100) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.C26138Ct1.A07.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        android.util.Log.e("MapConfig", "Unable to download config", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e6, code lost:
        if (r2 == null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0240, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0241, code lost:
        if (r2 != null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0246, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0247, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0248, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x01da */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01da A[EDGE_INSN: B:59:0x01da->B:60:? ?: BREAK  , PHI: r2 
      PHI: (r2v10 java.io.InputStream) = (r2v4 java.io.InputStream), (r2v4 java.io.InputStream), (r2v4 java.io.InputStream), (r2v11 java.io.InputStream), (r2v12 java.io.InputStream), (r2v12 java.io.InputStream) binds: [B:24:0x0087, B:25:?, B:26:0x009d, B:56:0x01d5, B:27:?, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:59:0x01da] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e0 A[ExcHandler: IOException (r1v5 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r2 
      PHI: (r2v9 java.io.InputStream) = (r2v4 java.io.InputStream), (r2v4 java.io.InputStream), (r2v11 java.io.InputStream), (r2v12 java.io.InputStream) binds: [B:24:0x0087, B:25:?, B:56:0x01d5, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:24:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0247 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:24:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r32 = this;
            r6 = r32
            long r2 = r6.A00
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            java.util.concurrent.Semaphore r0 = X.C26101CsL.A09
            boolean r0 = r0.tryAcquire()
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r2 = X.C26101CsL.A03
            java.lang.String r3 = "MapConfig"
            if (r2 == 0) goto L_0x002c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "&country="
            java.lang.String r5 = X.AnonymousClass001.A1H(r0, r2, r1)
        L_0x0028:
            r0 = 512(0x200, float:7.175E-43)
            r2 = 0
            goto L_0x0087
        L_0x002c:
            X.E92 r2 = r6.A01
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0028
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0046
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r1 = r0.importance
            r0 = 100
            if (r1 != r0) goto L_0x0028
        L_0x0046:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0060
            android.content.Context r1 = X.C26101CsL.A02
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0028
            android.content.Context r1 = X.C26101CsL.A02
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0028
        L_0x0060:
            android.location.Location r4 = r2.BPy(r3)
            if (r4 == 0) goto L_0x0028
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = "&latitude="
            r2.append(r0)
            double r0 = r4.getLatitude()
            r2.append(r0)
            java.lang.String r0 = "&longitude="
            r2.append(r0)
            double r0 = r4.getLongitude()
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            goto L_0x0028
        L_0x0087:
            byte[] r7 = new byte[r0]     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            java.lang.String r0 = X.C26101CsL.A0D     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            r1.append(r0)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            java.lang.String r0 = X.C26101CsL.A0C     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            java.io.InputStream r2 = r0.openStream()     // Catch:{ IOException -> 0x01d2, Exception -> 0x01da, all -> 0x0247 }
            r4 = 0
            r5 = 0
        L_0x00a3:
            int r0 = r7.length     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            int r0 = r0 - r5
            int r1 = r2.read(r7, r5, r0)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            r0 = -1
            if (r1 == r0) goto L_0x00bb
            int r5 = r5 + r1
            int r0 = r7.length     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            if (r5 < r0) goto L_0x00a3
            int r0 = r7.length     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            int r0 = r0 << 1
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            int r0 = r7.length     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            java.lang.System.arraycopy(r7, r4, r1, r4, r0)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            r7 = r1
            goto L_0x00a3
        L_0x00bb:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            r0.<init>(r7, r4, r5)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            org.json.JSONObject r9 = r0.getJSONObject(r4)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da }
            r2.close()     // Catch:{ IOException -> 0x00d1 }
        L_0x00d1:
            if (r9 == 0) goto L_0x01eb
            java.lang.String r25 = "south"
            java.lang.String r24 = "east"
            java.lang.String r23 = "north"
            java.lang.String r22 = "west"
            java.lang.String r21 = "rectangles"
            X.CTC r0 = X.C26101CsL.A0B
            java.lang.String r1 = r0.A01
            java.lang.String r20 = "base_url"
            r0 = r20
            java.lang.String r26 = r9.optString(r0, r1)
            X.CTC r0 = X.C26101CsL.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "static_base_url"
            java.lang.String r27 = r9.optString(r0, r1)
            java.lang.String r0 = "osm_config"
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x0155 }
            java.lang.String r0 = "zoom_threshold"
            int r16 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0155 }
            r0 = r21
            org.json.JSONArray r15 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0155 }
            int r8 = r15.length()     // Catch:{ JSONException -> 0x0155 }
            android.graphics.Rect[] r0 = new android.graphics.Rect[r8]     // Catch:{ JSONException -> 0x0155 }
            r19 = r0
            r7 = 1
            int r7 = r7 << r16
            r5 = 0
        L_0x0111:
            if (r5 >= r8) goto L_0x0161
            org.json.JSONObject r4 = r15.getJSONObject(r5)     // Catch:{ JSONException -> 0x0155 }
            double r2 = (double) r7     // Catch:{ JSONException -> 0x0155 }
            r0 = r22
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0155 }
            double r13 = X.C26152CtJ.A01(r0)     // Catch:{ JSONException -> 0x0155 }
            double r0 = r2 * r13
            int r14 = (int) r0     // Catch:{ JSONException -> 0x0155 }
            r0 = r23
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0155 }
            double r17 = X.C26152CtJ.A00(r0)     // Catch:{ JSONException -> 0x0155 }
            double r0 = r2 * r17
            int r10 = (int) r0     // Catch:{ JSONException -> 0x0155 }
            r0 = r24
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0155 }
            double r17 = X.C26152CtJ.A01(r0)     // Catch:{ JSONException -> 0x0155 }
            double r0 = r2 * r17
            int r13 = (int) r0     // Catch:{ JSONException -> 0x0155 }
            r0 = r25
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0155 }
            double r0 = X.C26152CtJ.A00(r0)     // Catch:{ JSONException -> 0x0155 }
            double r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ JSONException -> 0x0155 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ JSONException -> 0x0155 }
            r1.<init>(r14, r10, r13, r0)     // Catch:{ JSONException -> 0x0155 }
            r19[r5] = r1     // Catch:{ JSONException -> 0x0155 }
            int r5 = r5 + 1
            goto L_0x0111
        L_0x0155:
            X.CTC r0 = X.C26101CsL.A0B
            int r0 = r0.A00
            r16 = r0
            X.CTC r0 = X.C26101CsL.A0B
            android.graphics.Rect[] r0 = r0.A04
            r19 = r0
        L_0x0161:
            java.lang.String r0 = "url_override_config"
            org.json.JSONArray r14 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x020e }
            int r7 = r14.length()     // Catch:{ JSONException -> 0x020e }
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ JSONException -> 0x020e }
            X.9zp[][] r5 = new X.C199339zp[r7][]     // Catch:{ JSONException -> 0x020e }
            r4 = 0
        L_0x0170:
            if (r4 >= r7) goto L_0x0216
            org.json.JSONObject r1 = r14.getJSONObject(r4)     // Catch:{ JSONException -> 0x020e }
            r0 = r20
            java.lang.String r0 = r1.getString(r0)     // Catch:{ JSONException -> 0x020e }
            r10[r4] = r0     // Catch:{ JSONException -> 0x020e }
            r0 = r21
            org.json.JSONArray r13 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x020e }
            int r8 = r13.length()     // Catch:{ JSONException -> 0x020e }
            X.9zp[] r0 = new X.C199339zp[r8]     // Catch:{ JSONException -> 0x020e }
            r5[r4] = r0     // Catch:{ JSONException -> 0x020e }
            r3 = 0
        L_0x018d:
            if (r3 >= r8) goto L_0x01cf
            X.9zp r2 = new X.9zp     // Catch:{ JSONException -> 0x020e }
            r2.<init>()     // Catch:{ JSONException -> 0x020e }
            org.json.JSONObject r9 = r13.getJSONObject(r3)     // Catch:{ JSONException -> 0x020e }
            r0 = r22
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x020e }
            double r0 = X.C26152CtJ.A01(r0)     // Catch:{ JSONException -> 0x020e }
            r2.A01 = r0     // Catch:{ JSONException -> 0x020e }
            r0 = r23
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x020e }
            double r0 = X.C26152CtJ.A00(r0)     // Catch:{ JSONException -> 0x020e }
            r2.A03 = r0     // Catch:{ JSONException -> 0x020e }
            r0 = r24
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x020e }
            double r0 = X.C26152CtJ.A01(r0)     // Catch:{ JSONException -> 0x020e }
            r2.A02 = r0     // Catch:{ JSONException -> 0x020e }
            r0 = r25
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x020e }
            double r0 = X.C26152CtJ.A00(r0)     // Catch:{ JSONException -> 0x020e }
            r2.A00 = r0     // Catch:{ JSONException -> 0x020e }
            r0 = r5[r4]     // Catch:{ JSONException -> 0x020e }
            r0[r3] = r2     // Catch:{ JSONException -> 0x020e }
            int r3 = r3 + 1
            goto L_0x018d
        L_0x01cf:
            int r4 = r4 + 1
            goto L_0x0170
        L_0x01d2:
            r1 = move-exception
            java.lang.String r0 = "Exception while loading map config"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
            throw r0     // Catch:{ IOException -> 0x01e0, Exception -> 0x01da, all -> 0x0247 }
        L_0x01da:
            X.Ct1 r0 = X.C26138Ct1.A07     // Catch:{ all -> 0x0240 }
            r0.A02()     // Catch:{ all -> 0x0240 }
            goto L_0x01e6
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "Unable to download config"
            android.util.Log.e(r3, r0, r1)     // Catch:{ all -> 0x0240 }
        L_0x01e6:
            if (r2 == 0) goto L_0x01eb
            r2.close()     // Catch:{ IOException -> 0x01eb }
        L_0x01eb:
            long r2 = r6.A00
            r4 = 3
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0235
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "MapConfigUpdateDispatchable"
            X.C27087DTm.A00(r6)
            r6.A02 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 + r2
            r6.A01 = r0
            X.CMr r0 = X.C26096CsG.A00()
            java.util.concurrent.BlockingQueue r0 = r0.A00
            r0.add(r6)
            return
        L_0x020e:
            X.CTC r0 = X.C26101CsL.A0B
            java.lang.String[] r10 = r0.A05
            X.CTC r0 = X.C26101CsL.A0B
            X.9zp[][] r5 = r0.A06
        L_0x0216:
            X.CTC r25 = new X.CTC
            r28 = r19
            r29 = r10
            r30 = r5
            r31 = r16
            r25.<init>(r26, r27, r28, r29, r30, r31)
            X.C26101CsL.A0B = r25
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C26101CsL.A00 = r0
            X.BPZ r1 = new X.BPZ
            r1.<init>()
            android.os.Handler r0 = X.C26096CsG.A01
            r0.post(r1)
        L_0x0235:
            r6.A00 = r11
            r0 = 0
            X.C26101CsL.A06 = r0
            java.util.concurrent.Semaphore r0 = X.C26101CsL.A09
            r0.release()
            return
        L_0x0240:
            r0 = move-exception
            if (r2 == 0) goto L_0x0248
            r2.close()     // Catch:{ IOException -> 0x0248 }
            throw r0
        L_0x0247:
            r0 = move-exception
        L_0x0248:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22795BPi.run():void");
    }

    public C22795BPi(Context context) {
        E92 e92 = null;
        if (C26101CsL.A03 == null) {
            try {
                CEQ.A00(context);
                e92 = CEQ.A00.BFw();
            } catch (DZY unused) {
                C26138Ct1.A07.A02();
            }
        }
        this.A01 = e92;
    }
}
