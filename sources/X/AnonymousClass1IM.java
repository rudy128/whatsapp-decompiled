package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1IM  reason: invalid class name */
public final class AnonymousClass1IM extends AnonymousClass1IL implements Runnable {
    public static final AnonymousClass1IM A00;
    public static final long A01;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    private final synchronized void A01() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AnonymousClass1IL.A02.set(this, (Object) null);
            AnonymousClass1IL.A01.set(this, (Object) null);
            notifyAll();
        }
    }

    public void A0F() {
        debugStatus = 4;
        super.A0F();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1IJ, X.1IM, X.1IL] */
    static {
        Long l;
        ? r4 = new AnonymousClass1IL();
        A00 = r4;
        r4.A00++;
        r4.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A01 = timeUnit.toNanos(l.longValue());
    }

    public void A0L(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A0L(runnable);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 149 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.lang.ThreadLocal r0 = X.C37591po.A00
            r0.set(r14)
            r13 = 0
            r2 = r14
            monitor-enter(r2)     // Catch:{ all -> 0x006f }
            int r1 = debugStatus     // Catch:{ all -> 0x006c }
            r0 = 2
            if (r1 == r0) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x005c
            r0 = 1
            debugStatus = r0     // Catch:{ all -> 0x006c }
            r14.notifyAll()     // Catch:{ all -> 0x006c }
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0025
        L_0x0022:
            java.util.concurrent.locks.LockSupport.parkNanos(r14, r5)     // Catch:{ all -> 0x006f }
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x006f }
            long r5 = r14.A0E()     // Catch:{ all -> 0x006f }
            r7 = 0
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x003e
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006f }
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0044
            long r0 = A01     // Catch:{ all -> 0x006f }
            long r0 = r0 + r3
            goto L_0x0044
        L_0x003e:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x004f
        L_0x0044:
            long r9 = r0 - r3
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x005d
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x004f
            r5 = r9
        L_0x004f:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0025
            int r3 = debugStatus     // Catch:{ all -> 0x006f }
            r2 = 2
            if (r3 == r2) goto L_0x005d
            r2 = 3
            if (r3 == r2) goto L_0x005d
            goto L_0x0022
        L_0x005c:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
        L_0x005d:
            _thread = r13
            r14.A01()
            boolean r0 = r14.A0N()
            if (r0 != 0) goto L_0x006b
            r14.A0J()
        L_0x006b:
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r1 = move-exception
            _thread = r13
            r14.A01()
            boolean r0 = r14.A0N()
            if (r0 != 0) goto L_0x007e
            r14.A0J()
        L_0x007e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IM.run():void");
    }
}
