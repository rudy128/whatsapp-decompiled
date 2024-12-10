package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.015  reason: invalid class name */
public class AnonymousClass015 implements Executor {
    public Runnable A00;
    public final Queue A01 = new ArrayDeque();
    public final Executor A02;
    public final Object A03 = new Object();

    public void A00() {
        synchronized (this.A03) {
            Runnable runnable = (Runnable) this.A01.poll();
            this.A00 = runnable;
            if (runnable != null) {
                this.A02.execute(runnable);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.A03) {
            this.A01.add(new AnonymousClass0ZE(this, runnable));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public AnonymousClass015(Executor executor) {
        this.A02 = executor;
    }
}
