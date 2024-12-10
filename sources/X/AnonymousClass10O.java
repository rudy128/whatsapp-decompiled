package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.10O  reason: invalid class name */
public class AnonymousClass10O implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        C448825d r2 = new C448825d(this, runnable, 17);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" #");
        sb.append(this.A02.getAndIncrement());
        C201010v r1 = new C201010v(r2, sb.toString());
        Boolean bool = C17970vW.A03;
        return r1;
    }

    public AnonymousClass10O(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
