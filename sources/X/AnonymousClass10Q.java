package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.10Q  reason: invalid class name */
public class AnonymousClass10Q implements RejectedExecutionHandler {
    public final AtomicBoolean A00 = new AtomicBoolean();

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AnonymousClass190 r2;
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (!this.A00.getAndSet(true) && (r2 = AnonymousClass10J.A04) != null) {
            r2.A0G("waworkers-task-queued", String.valueOf(threadPoolExecutor.getActiveCount()), true);
        }
    }
}
