package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class CRX {
    public final Executor A00;
    public final Executor A01;
    public final AtomicInteger A02 = new AtomicInteger();
    public final AtomicLong A03 = new AtomicLong(-1);

    public CRX(Executor executor, Executor executor2) {
        this.A01 = executor;
        this.A00 = executor2;
    }
}
