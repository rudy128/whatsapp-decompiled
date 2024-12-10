package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class DW5 implements ThreadFactory {
    public int A00 = 10;
    public final String A01;
    public final ThreadGroup A02 = Thread.currentThread().getThreadGroup();
    public final AtomicInteger A03 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.A02;
        C27076DTa dTa = new C27076DTa(this, runnable, 25);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        Thread thread = new Thread(threadGroup, dTa, C17880vN.A0t(A10, this.A03.getAndIncrement()), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public DW5(Integer num) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("cask-");
        switch (num.intValue()) {
            case 0:
                str = "CONCURRENT";
                break;
            case 1:
                str = "SERIAL";
                break;
            default:
                str = "IDLE";
                break;
        }
        A10.append(str);
        this.A01 = AnonymousClass000.A0y("-pool--thread-", A10);
        if (num == AnonymousClass00R.A0C) {
            this.A00 = 19;
        }
    }
}
