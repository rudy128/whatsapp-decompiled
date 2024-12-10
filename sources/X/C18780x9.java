package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: X.0x9  reason: invalid class name and case insensitive filesystem */
public final class C18780x9 implements Executor {
    public static final Logger A05 = Logger.getLogger(C18780x9.class.getName());
    public long A00 = 0;
    public Integer A01 = AnonymousClass00R.A00;
    public final Deque A02 = new ArrayDeque();
    public final C448825d A03 = new C448825d(this);
    public final Executor A04;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SequentialExecutor@");
        sb.append(System.identityHashCode(this));
        sb.append("{");
        sb.append(this.A04);
        sb.append("}");
        return sb.toString();
    }

    public C18780x9(Executor executor) {
        C18210vx.A00(executor);
        this.A04 = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r9.A04.execute(r9.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r9.A01 != r6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r9.A00 != r3) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r9.A01 != r6) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r9.A01 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (r5.removeLastOccurrence(r7) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
        if ((r2 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(java.lang.Runnable r10) {
        /*
            r9 = this;
            X.C18210vx.A00(r10)
            java.util.Deque r5 = r9.A02
            monitor-enter(r5)
            java.lang.Integer r1 = r9.A01     // Catch:{ all -> 0x0061 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0061 }
            if (r1 == r0) goto L_0x005c
            java.lang.Integer r8 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0061 }
            if (r1 == r8) goto L_0x005c
            long r3 = r9.A00     // Catch:{ all -> 0x0061 }
            r0 = 14
            X.3Cf r7 = new X.3Cf     // Catch:{ all -> 0x0061 }
            r7.<init>(r9, r10, r0)     // Catch:{ all -> 0x0061 }
            r5.add(r7)     // Catch:{ all -> 0x0061 }
            java.lang.Integer r6 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0061 }
            r9.A01 = r6     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            java.util.concurrent.Executor r1 = r9.A04     // Catch:{ Error | RuntimeException -> 0x003e }
            X.25d r0 = r9.A03     // Catch:{ Error | RuntimeException -> 0x003e }
            r1.execute(r0)     // Catch:{ Error | RuntimeException -> 0x003e }
            java.lang.Integer r0 = r9.A01
            if (r0 != r6) goto L_0x0060
            monitor-enter(r5)
            long r1 = r9.A00     // Catch:{ all -> 0x003b }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            java.lang.Integer r0 = r9.A01     // Catch:{ all -> 0x003b }
            if (r0 != r6) goto L_0x0039
            r9.A01 = r8     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r2 = move-exception
            monitor-enter(r5)
            java.lang.Integer r1 = r9.A01     // Catch:{ all -> 0x0059 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0059 }
            if (r1 == r0) goto L_0x0048
            if (r1 != r6) goto L_0x004f
        L_0x0048:
            boolean r0 = r5.removeLastOccurrence(r7)     // Catch:{ all -> 0x0059 }
            r1 = 1
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            boolean r0 = r2 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0058
            if (r1 != 0) goto L_0x0058
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            return
        L_0x0058:
            throw r2     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            r5.add(r10)     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
        L_0x0060:
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18780x9.execute(java.lang.Runnable):void");
    }
}
