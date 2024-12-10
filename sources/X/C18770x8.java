package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0x8  reason: invalid class name and case insensitive filesystem */
public class C18770x8 implements ScheduledExecutorService {
    public final ExecutorService A00;
    public final ScheduledExecutorService A01;

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.A00.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.A00.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.A00.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.A00.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.A00.isShutdown();
    }

    public boolean isTerminated() {
        return this.A00.isTerminated();
    }

    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z = DMr.A02;
        return new BJN(new C65582wm(this, runnable, timeUnit, 0, j));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        boolean z = DMr.A02;
        return new BJN(new C65592wn(this, runnable, timeUnit, 0, j, j2));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        boolean z = DMr.A02;
        return new BJN(new C65592wn(this, runnable, timeUnit, 1, j, j2));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Runnable runnable) {
        return this.A00.submit(runnable);
    }

    public C18770x8(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = executorService;
        this.A01 = scheduledExecutorService;
    }

    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.A00.invokeAll(collection, j, timeUnit);
    }

    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.A00.invokeAny(collection, j, timeUnit);
    }

    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        boolean z = DMr.A02;
        return new BJN(new C65582wm(this, callable, timeUnit, 1, j));
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.A00.submit(runnable, obj);
    }

    public Future submit(Callable callable) {
        return this.A00.submit(callable);
    }
}
