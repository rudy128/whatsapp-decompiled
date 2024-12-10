package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AlH  reason: case insensitive filesystem */
public class C21508AlH implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        C21357Aim aim = new C21357Aim(runnable, this, 16);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JobRunner");
        A10.append(" #");
        return new Thread(aim, C17880vN.A0t(A10, this.A00.getAndIncrement()));
    }
}
