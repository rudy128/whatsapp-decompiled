package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dc6  reason: case insensitive filesystem */
public class C27334Dc6 extends AbstractExecutorService implements ScheduledExecutorService {
    public static C27334Dc6 A01;
    public final Handler A00 = C17890vO.A0D();

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        DW0 dw0 = new DW0(handler, (Object) null, runnable);
        handler.postDelayed(dw0, timeUnit.toMillis(j));
        return dw0;
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new DW0(this.A00, obj, runnable);
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        if (runnable != null) {
            DW0 dw0 = new DW0(this.A00, obj, runnable);
            execute(dw0);
            return dw0;
        }
        throw BE6.A0m();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C17880vN.A0y();
    }

    public void execute(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C17880vN.A0y();
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C17880vN.A0y();
    }

    public void shutdown() {
        throw C17880vN.A0y();
    }

    public List shutdownNow() {
        throw C17880vN.A0y();
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new DW0(this.A00, callable);
    }

    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        DW0 dw0 = new DW0(handler, callable);
        handler.postDelayed(dw0, timeUnit.toMillis(j));
        return dw0;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        if (runnable != null) {
            DW0 dw0 = new DW0(this.A00, (Object) null, runnable);
            execute(dw0);
            return dw0;
        }
        throw BE6.A0m();
    }

    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        if (callable != null) {
            DW0 dw0 = new DW0(this.A00, callable);
            execute(dw0);
            return dw0;
        }
        throw BE6.A0m();
    }
}
