package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class DWA implements ThreadFactory {
    public final int A00;
    public final Object A01;

    public DWA(AtomicInteger atomicInteger) {
        this.A00 = 1;
        this.A01 = atomicInteger;
    }

    public Thread newThread(Runnable runnable) {
        if (this.A00 != 0) {
            Thread thread = new Thread(runnable, "reCaptcha");
            thread.setDaemon(true);
            return thread;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModernAsyncTask #");
        return new Thread(runnable, C17880vN.A0t(A10, ((AtomicInteger) this.A01).getAndIncrement()));
    }

    public DWA() {
        this.A00 = 0;
        this.A01 = new AtomicInteger(1);
    }
}
