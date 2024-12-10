package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class CSZ {
    public long A00 = System.currentTimeMillis();
    public long A01;
    public final long A02;
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService A04 = Executors.newSingleThreadScheduledExecutor();

    public CSZ(long j) {
        this.A02 = j;
    }
}
