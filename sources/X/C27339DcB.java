package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DcB  reason: case insensitive filesystem */
public class C27339DcB extends FutureTask implements EEC {
    public final C25544Chh A00 = new Object();

    public void BBG(Runnable runnable, Executor executor) {
        C25544Chh chh = this.A00;
        C199610h.A05(runnable, "Runnable was null.");
        C199610h.A05(executor, "Executor was null.");
        synchronized (chh) {
            if (!chh.A01) {
                chh.A00 = new CQD(chh.A00, runnable, executor);
                return;
            }
            try {
                executor.execute(runnable);
            } catch (Exception e) {
                BEB.A1I(runnable, executor, e, C25544Chh.A02.A00());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r0 = r1.A00;
        r1.A00 = r4;
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r3 = r4.A01;
        r2 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.execute(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        X.BEB.A1I(r3, r2, r1, X.C25544Chh.A02.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void done() {
        /*
            r5 = this;
            X.Chh r2 = r5.A00
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x0033 }
            X.CQD r1 = r2.A00     // Catch:{ all -> 0x0033 }
            r4 = 0
            r2.A00 = r4     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
        L_0x0012:
            if (r1 == 0) goto L_0x001b
            X.CQD r0 = r1.A00
            r1.A00 = r4
            r4 = r1
            r1 = r0
            goto L_0x0012
        L_0x001b:
            if (r4 == 0) goto L_0x0032
            java.lang.Runnable r3 = r4.A01
            java.util.concurrent.Executor r2 = r4.A02
            r2.execute(r3)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002f
        L_0x0025:
            r1 = move-exception
            X.CVs r0 = X.C25544Chh.A02
            java.util.logging.Logger r0 = r0.A00()
            X.BEB.A1I(r3, r2, r1, r0)
        L_0x002f:
            X.CQD r4 = r4.A00
            goto L_0x001b
        L_0x0032:
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27339DcB.done():void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Chh, java.lang.Object] */
    public C27339DcB(Callable callable) {
        super(callable);
    }

    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos > 2147483647999999999L) {
            j = Math.min(nanos, 2147483647999999999L);
            timeUnit = TimeUnit.NANOSECONDS;
        }
        return super.get(j, timeUnit);
    }
}
