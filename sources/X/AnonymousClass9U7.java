package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9U7  reason: invalid class name */
public abstract class AnonymousClass9U7 {
    public static final ThreadPoolExecutor A00;
    public static final BlockingQueue A01;
    public static final ThreadFactory A02;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(4);
        A01 = linkedBlockingQueue;
        C21507AlG alG = new C21507AlG();
        A02 = alG;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 1, TimeUnit.SECONDS, linkedBlockingQueue, alG);
        A00 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new C21505AlE(1));
    }
}
