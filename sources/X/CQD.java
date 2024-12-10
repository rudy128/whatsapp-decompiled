package X;

import java.util.concurrent.Executor;

public final class CQD {
    public CQD A00;
    public final Runnable A01;
    public final Executor A02;

    public CQD(CQD cqd, Runnable runnable, Executor executor) {
        this.A01 = runnable;
        this.A02 = executor;
        this.A00 = cqd;
    }
}
