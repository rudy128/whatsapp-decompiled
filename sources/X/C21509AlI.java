package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AlI  reason: case insensitive filesystem */
public final class C21509AlI implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(0);

    public Thread newThread(Runnable runnable) {
        C21457AkO akO = new C21457AkO((Object) runnable, 22);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        return new C201010v(akO, C17880vN.A0t(A10, this.A01.getAndIncrement()));
    }

    public C21509AlI(String str) {
        this.A00 = str;
    }
}
