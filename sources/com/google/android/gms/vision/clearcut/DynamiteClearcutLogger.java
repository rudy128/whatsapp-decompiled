package com.google.android.gms.vision.clearcut;

import X.C185399cW;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DynamiteClearcutLogger {
    public static final ExecutorService zza;
    public C185399cW zzb = new C185399cW();
    public VisionClearcutLogger zzc;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        android.util.Log.v("Vision", java.lang.String.format("Skipping image analysis log due to rate limiting", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r3 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (android.util.Log.isLoggable("Vision", 2) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r10, X.C23478Bhi r11) {
        /*
            r9 = this;
            r0 = 3
            if (r10 != r0) goto L_0x0033
            X.9cW r8 = r9.zzb
            java.lang.Object r7 = r8.A02
            monitor-enter(r7)
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            long r1 = r8.A00     // Catch:{ all -> 0x0030 }
            long r5 = r8.A01     // Catch:{ all -> 0x0030 }
            long r1 = r1 + r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            r0 = 0
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "Skipping image analysis log due to rate limiting"
            r0 = 2
            java.lang.String r1 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = java.lang.String.format(r2, r3)
            android.util.Log.v(r1, r0)
        L_0x002b:
            return
        L_0x002c:
            r8.A00 = r3     // Catch:{ all -> 0x0030 }
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            java.util.concurrent.ExecutorService r1 = zza
            r0 = 7
            X.C21470Akb.A00(r11, r9, r1, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.clearcut.DynamiteClearcutLogger.zza(int, X.Bhi):void");
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }
}
