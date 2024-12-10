package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.AlD  reason: case insensitive filesystem */
public class C21504AlD implements Executor {
    public Runnable A00;
    public final Object A01 = C17880vN.A0p();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.A01) {
            this.A02.add(new C21471Akc((Object) runnable, (Object) this, 25));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public C21504AlD(Executor executor) {
        this.A03 = executor;
    }
}
