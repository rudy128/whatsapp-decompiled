package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.DCr  reason: case insensitive filesystem */
public final class C26762DCr implements E18 {
    public final Executor A00;
    public final Executor A01;
    public final Executor A02;
    public final Executor A03;
    public final ScheduledExecutorService A04;

    public C26762DCr(int i) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new DW2("FrescoIoBoundExecutor"));
        C18070vi.A0X(newFixedThreadPool);
        this.A02 = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i, new DW2("FrescoDecodeExecutor"));
        C18070vi.A0X(newFixedThreadPool2);
        this.A01 = newFixedThreadPool2;
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i, new DW2("FrescoBackgroundExecutor"));
        C18070vi.A0X(newFixedThreadPool3);
        this.A00 = newFixedThreadPool3;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new DW2("FrescoLightWeightBackgroundExecutor"));
        C18070vi.A0X(newFixedThreadPool4);
        this.A03 = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, new DW2("FrescoBackgroundExecutor"));
        C18070vi.A0X(newScheduledThreadPool);
        this.A04 = newScheduledThreadPool;
    }
}
