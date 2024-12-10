package X;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cqi  reason: case insensitive filesystem */
public class C26024Cqi {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public DRJ A03 = null;
    public Integer A04 = AnonymousClass00R.A00;
    public final E19 A05;
    public final Runnable A06 = C27082DTh.A00(this, 15);
    public final Executor A07;
    public final Runnable A08 = C27082DTh.A00(this, 16);

    public void A02() {
        DRJ drj;
        synchronized (this) {
            drj = this.A03;
            this.A03 = null;
            this.A00 = 0;
        }
        if (drj != null) {
            drj.close();
        }
    }

    public boolean A04(DRJ drj, int i) {
        DRJ drj2;
        DRJ drj3;
        if ((i & 1) != 1 && (i & 4) != 4 && (drj == null || !drj.A0A())) {
            return false;
        }
        synchronized (this) {
            drj2 = this.A03;
            if (drj != null) {
                drj3 = drj.A07();
            } else {
                drj3 = null;
            }
            this.A03 = drj3;
            this.A00 = i;
        }
        if (drj2 == null) {
            return true;
        }
        drj2.close();
        return true;
    }

    private void A00(long j) {
        Runnable runnable = this.A08;
        if (j > 0) {
            ScheduledExecutorService scheduledExecutorService = C24449C4o.A00;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
                C24449C4o.A00 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            return;
        }
        runnable.run();
    }

    public C26024Cqi(E19 e19, Executor executor) {
        this.A07 = executor;
        this.A05 = e19;
    }

    public static void A01(C26024Cqi cqi) {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (cqi) {
            if (cqi.A04 == AnonymousClass00R.A0N) {
                j = Math.max(cqi.A01 + 100, uptimeMillis);
                cqi.A02 = uptimeMillis;
                cqi.A04 = AnonymousClass00R.A01;
                z = true;
            } else {
                cqi.A04 = AnonymousClass00R.A00;
                j = 0;
                z = false;
            }
        }
        if (z) {
            cqi.A00(j - uptimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        A00(r1 - r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r6 = this;
            long r4 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r6)
            X.DRJ r3 = r6.A03     // Catch:{ all -> 0x0048 }
            int r2 = r6.A00     // Catch:{ all -> 0x0048 }
            r1 = 1
            r0 = r2 & 1
            if (r0 == r1) goto L_0x001b
            r1 = 4
            r0 = r2 & 4
            if (r0 == r1) goto L_0x001b
            if (r3 == 0) goto L_0x0046
            boolean r0 = r3.A0A()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0046
        L_0x001b:
            r3 = 0
            java.lang.Integer r0 = r6.A04     // Catch:{ all -> 0x0048 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0048 }
            if (r1 == r3) goto L_0x002e
            r0 = 2
            if (r1 != r0) goto L_0x002b
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0048 }
            r6.A04 = r0     // Catch:{ all -> 0x0048 }
        L_0x002b:
            r1 = 0
            goto L_0x003e
        L_0x002e:
            long r2 = r6.A01     // Catch:{ all -> 0x0048 }
            r0 = 100
            long r2 = r2 + r0
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x0048 }
            r6.A02 = r4     // Catch:{ all -> 0x0048 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0048 }
            r6.A04 = r0     // Catch:{ all -> 0x0048 }
            r3 = 1
        L_0x003e:
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0045
            long r1 = r1 - r4
            r6.A00(r1)
        L_0x0045:
            return
        L_0x0046:
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26024Cqi.A03():void");
    }
}
