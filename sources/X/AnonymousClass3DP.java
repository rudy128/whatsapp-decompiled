package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3DP  reason: invalid class name */
public class AnonymousClass3DP implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new C449025f(runnable));
        int andIncrement = this.A01.getAndIncrement();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GAC_Executor");
        A10.append("[");
        A10.append(andIncrement);
        newThread.setName(AnonymousClass000.A0z(A10));
        return newThread;
    }
}
