package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class CNQ {
    public final C189119iX A00;
    public final ScheduledExecutorService A01;

    public CNQ(C189119iX r2) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A00 = r2;
        this.A01 = newSingleThreadScheduledExecutor;
    }
}
