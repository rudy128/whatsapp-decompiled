package X;

import java.util.concurrent.ThreadFactory;

public final class DW8 implements ThreadFactory {
    public static final DW8 A00 = new DW8();

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IOScheduler-duplex-write-");
        thread.setName(C17880vN.A0u(A10, thread.getId()));
        return thread;
    }
}
