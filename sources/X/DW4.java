package X;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;

public final class DW4 implements ThreadFactory {
    public final String A00;
    public final Thread.UncaughtExceptionHandler A01;
    public final boolean A02;

    public Thread newThread(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        Thread thread = new Thread(runnable);
        if (this.A02) {
            thread.setPriority(10);
        }
        thread.setName(this.A00);
        thread.setUncaughtExceptionHandler(this.A01);
        return thread;
    }

    public DW4(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.A00 = str;
        this.A01 = uncaughtExceptionHandler;
        this.A02 = z;
    }
}
