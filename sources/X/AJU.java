package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class AJU implements EEC {
    public final C113975oM A00;
    public final AnonymousClass1OB A01;

    public void BBG(Runnable runnable, Executor executor) {
        this.A00.BBG(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public Object get() {
        return this.A00.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public AJU(C113975oM r2, AnonymousClass1OB r3) {
        this.A01 = r3;
        this.A00 = r2;
        r3.Bdy(new C22090AxU(this));
    }
}
