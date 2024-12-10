package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class DW2 implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(1);

    public DW2(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        C27076DTa dTa = new C27076DTa(runnable, this, 7);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append('-');
        return new Thread(dTa, C17880vN.A0t(A10, this.A01.getAndIncrement()));
    }
}
