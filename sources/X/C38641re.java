package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1re  reason: invalid class name and case insensitive filesystem */
public class C38641re implements ThreadFactory {
    public static final AtomicInteger A03 = new AtomicInteger(1);
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(this.A02.getAndIncrement());
        Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public C38641re() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.A01 = threadGroup;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie-");
        sb.append(A03.getAndIncrement());
        sb.append("-thread-");
        this.A00 = sb.toString();
    }
}
