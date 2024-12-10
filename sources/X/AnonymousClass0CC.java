package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.0CC  reason: invalid class name */
public final class AnonymousClass0CC extends C03510In {
    public final long A00;
    public volatile C04220Mi A01;

    public final C04220Mi A02() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = this.A00;
        }
        if (runnableFuture == null || runnableFuture.isDone()) {
            return (C04220Mi) A00();
        }
        return this.A01;
    }

    /* renamed from: A03 */
    public void A01(C04220Mi r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = null;
    }

    public AnonymousClass0CC(C04220Mi r1, Callable callable, long j) {
        super(callable);
        this.A01 = r1;
        this.A00 = j;
    }
}
