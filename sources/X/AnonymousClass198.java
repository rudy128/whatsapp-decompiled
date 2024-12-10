package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.198  reason: invalid class name */
public class AnonymousClass198 {
    public boolean A00;
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final Context A02;
    public final C17930vS A03;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00() {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.A00     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "whatsappsoloader/init: already initialized"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ba }
            goto L_0x00a5
        L_0x000d:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ba }
            r0 = 23
            if (r1 >= r0) goto L_0x0037
            java.lang.String r1 = X.C62912sC.A02()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "x86"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x0037
            android.content.Context r2 = r8.A02     // Catch:{ all -> 0x00ba }
            X.19v r1 = X.C224219v.A00()     // Catch:{ all -> 0x00ba }
            java.lang.String[] r0 = X.AnonymousClass1A8.A09     // Catch:{ all -> 0x00ba }
            X.AnonymousClass1A8.A01(r2, r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x0033:
            r4 = 1
            X.0vS r0 = r8.A03     // Catch:{ all -> 0x00ba }
            goto L_0x0040
        L_0x0037:
            android.content.Context r2 = r8.A02     // Catch:{ all -> 0x00ba }
            r1 = 0
            java.lang.String[] r0 = X.AnonymousClass1A8.A09     // Catch:{ all -> 0x00ba }
            X.AnonymousClass1A8.A01(r2, r1, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0033
        L_0x0040:
            java.io.File r2 = r0.A01()     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "decompressed/libs.spo"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00b8 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00b8 }
            X.1AL r6 = new X.1AL     // Catch:{ all -> 0x00ba }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = "SoLoader"
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = X.AnonymousClass1A8.A08     // Catch:{ all -> 0x00ba }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.writeLock()     // Catch:{ all -> 0x00ba }
            r0.lock()     // Catch:{ all -> 0x00ba }
            boolean r0 = X.AnonymousClass1A8.A03()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00a7
            int r0 = X.AnonymousClass1A8.A00()     // Catch:{ all -> 0x00af }
            r6.A03(r0)     // Catch:{ all -> 0x00af }
            X.1AB[] r0 = X.AnonymousClass1A8.A0C     // Catch:{ all -> 0x00af }
            int r0 = r0.length     // Catch:{ all -> 0x00af }
            int r0 = r0 + 1
            X.1AB[] r3 = new X.AnonymousClass1AB[r0]     // Catch:{ all -> 0x00af }
            r2 = 0
            r3[r2] = r6     // Catch:{ all -> 0x00af }
            X.1AB[] r1 = X.AnonymousClass1A8.A0C     // Catch:{ all -> 0x00af }
            X.1AB[] r0 = X.AnonymousClass1A8.A0C     // Catch:{ all -> 0x00af }
            int r0 = r0.length     // Catch:{ all -> 0x00af }
            java.lang.System.arraycopy(r1, r2, r3, r4, r0)     // Catch:{ all -> 0x00af }
            X.AnonymousClass1A8.A0C = r3     // Catch:{ all -> 0x00af }
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass1A8.A07     // Catch:{ all -> 0x00af }
            r0.getAndIncrement()     // Catch:{ all -> 0x00af }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "Prepended to SO sources: "
            r1.append(r0)     // Catch:{ all -> 0x00af }
            r1.append(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00af }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x00af }
        L_0x009c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.writeLock()     // Catch:{ all -> 0x00ba }
            r0.unlock()     // Catch:{ all -> 0x00ba }
            r8.A00 = r4     // Catch:{ all -> 0x00ba }
        L_0x00a5:
            monitor-exit(r8)
            return
        L_0x00a7:
            java.lang.String r1 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00af }
            r0.<init>(r1)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.writeLock()     // Catch:{ all -> 0x00ba }
            r0.unlock()     // Catch:{ all -> 0x00ba }
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00b8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass198.A00():void");
    }

    public AnonymousClass198(Context context, C17930vS r4) {
        this.A02 = context;
        this.A03 = r4;
    }
}
