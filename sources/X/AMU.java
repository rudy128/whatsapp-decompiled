package X;

import java.util.concurrent.atomic.AtomicLong;

public final /* synthetic */ class AMU implements B73 {
    public final /* synthetic */ AtomicLong A00;

    public final void Bqp(long j) {
        this.A00.addAndGet(j);
    }

    public /* synthetic */ AMU(AtomicLong atomicLong) {
        this.A00 = atomicLong;
    }
}
