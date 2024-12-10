package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Dc5  reason: case insensitive filesystem */
public class C27333Dc5 extends AbstractExecutorService {
    public final String A00 = "SerialExecutor";
    public final BlockingQueue A01;
    public final AtomicInteger A02;
    public final C27082DTh A03;
    public final Executor A04;
    public final AtomicInteger A05;
    public volatile int A06;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public C27333Dc5(BlockingQueue blockingQueue, Executor executor) {
        this.A04 = executor;
        this.A06 = 1;
        this.A01 = blockingQueue;
        this.A03 = C27082DTh.A00(this, 6);
        this.A02 = new AtomicInteger(0);
        this.A05 = new AtomicInteger(0);
    }

    public static void A00(C27333Dc5 dc5) {
        AtomicInteger atomicInteger = dc5.A02;
        while (true) {
            int i = atomicInteger.get();
            if (i < dc5.A06) {
                int i2 = i + 1;
                Class<C27333Dc5> cls = C27333Dc5.class;
                if (atomicInteger.compareAndSet(i, i2)) {
                    C26265CwA.A00(cls, dc5.A00, Integer.valueOf(i2), Integer.valueOf(dc5.A06), "%s: starting worker %d of %d");
                    dc5.A04.execute(dc5.A03);
                    return;
                }
                C26265CwA.A02(cls, dc5.A00, "%s: race in startWorkerIfNeeded; retrying");
            } else {
                return;
            }
        }
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A01;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A05;
                int i = atomicInteger.get();
                if (size > i && atomicInteger.compareAndSet(i, size)) {
                    C26265CwA.A01(C27333Dc5.class, this.A00, Integer.valueOf(size), "%s: max pending work in queue = %d");
                }
                A00(this);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A00);
            A10.append(" queue is full, size=");
            throw new RejectedExecutionException(C17880vN.A0t(A10, blockingQueue.size()));
        }
        throw AnonymousClass000.A0s("runnable parameter is null");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C17880vN.A0y();
    }

    public void shutdown() {
        throw C17880vN.A0y();
    }

    public List shutdownNow() {
        throw C17880vN.A0y();
    }
}
