package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.Amu  reason: case insensitive filesystem */
public class C21605Amu extends FutureTask {
    public final /* synthetic */ C167258fi A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21605Amu(C167258fi r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        C167258fi r2 = this.A00;
        if (r2.A02.isCancelled()) {
            r2.A00.A04(AnonymousClass000.A0i());
        }
        r2.A01.countDown();
    }
}
