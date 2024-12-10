package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
public class C19550yO implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new C449025f(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public C19550yO(String str) {
        this.A00 = str;
    }
}
