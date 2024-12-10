package X;

import java.util.concurrent.ThreadFactory;

public final class DW9 implements ThreadFactory {
    public static final DW9 A00 = new DW9();

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IOScheduler-duplex-read-");
        thread.setName(C17880vN.A0u(A10, thread.getId()));
        return thread;
    }
}
