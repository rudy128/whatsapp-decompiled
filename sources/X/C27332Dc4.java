package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dc4  reason: case insensitive filesystem */
public class C27332Dc4 extends AbstractExecutorService {
    public static final C27332Dc4 A00 = new AbstractExecutorService();

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
    }

    public List shutdownNow() {
        return Collections.emptyList();
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
