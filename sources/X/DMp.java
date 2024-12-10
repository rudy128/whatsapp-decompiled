package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class DMp implements EEC {
    public final DMr A00 = new BJM(this);
    public final WeakReference A01;

    public void BBG(Runnable runnable, Executor executor) {
        this.A00.BBG(runnable, executor);
    }

    public boolean cancel(boolean z) {
        C25113CYi cYi = (C25113CYi) this.A01.get();
        boolean cancel = this.A00.cancel(z);
        if (cancel && cYi != null) {
            cYi.A02 = null;
            cYi.A00 = null;
            cYi.A01.A04((Object) null);
        }
        return cancel;
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

    public String toString() {
        return this.A00.toString();
    }

    public DMp(C25113CYi cYi) {
        this.A01 = AnonymousClass3MW.A0z(cYi);
    }

    public Object get() {
        return this.A00.get();
    }
}
