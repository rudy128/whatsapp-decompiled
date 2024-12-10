package X;

import java.util.concurrent.ThreadFactory;

public final class DW6 implements ThreadFactory {
    public static final DW6 A00 = new DW6();

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
