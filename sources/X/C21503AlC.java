package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.AlC  reason: case insensitive filesystem */
public final class C21503AlC implements Executor {
    public Runnable A00;
    public final Object A01 = C17880vN.A0p();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public void execute(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        synchronized (this.A01) {
            this.A02.offer(new C21471Akc((Object) runnable, (Object) this, 11));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public final void A00() {
        synchronized (this.A01) {
            Object poll = this.A02.poll();
            Runnable runnable = (Runnable) poll;
            this.A00 = runnable;
            if (poll != null) {
                this.A03.execute(runnable);
            }
        }
    }

    public C21503AlC(Executor executor) {
        this.A03 = executor;
    }
}
