package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.00x  reason: invalid class name and case insensitive filesystem */
public class C001900x implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ C001800w A01;

    public C001900x(C001800w r3) {
        this.A01 = r3;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append("arch_disk_io_");
        sb.append(this.A00.getAndIncrement());
        thread.setName(sb.toString());
        return thread;
    }
}
