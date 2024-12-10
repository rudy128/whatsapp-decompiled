package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.1th  reason: invalid class name and case insensitive filesystem */
public class C39821th extends FutureTask {
    public final /* synthetic */ C39811tg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39821th(C39811tg r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        if (!isCancelled()) {
            try {
                C39811tg.A00((C42891yu) get(), this.A00);
            } catch (InterruptedException | ExecutionException e) {
                C39811tg.A00(new C42891yu(e), this.A00);
            }
        }
    }
}
