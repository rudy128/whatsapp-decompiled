package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class DMq implements EEC {
    public static final EEC A01 = new DMq((Object) null);
    public static final C25060CVs A02 = new C25060CVs(DMq.class);
    public final Object A00;

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public void BBG(Runnable runnable, Executor executor) {
        C199610h.A05(runnable, "Runnable was null.");
        C199610h.A05(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            BEB.A1I(runnable, executor, e, A02.A00());
        }
    }

    public DMq(Object obj) {
        this.A00 = obj;
    }

    public Object get(long j, TimeUnit timeUnit) {
        C199610h.A04(timeUnit);
        return get();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        A10.append("[status=SUCCESS, result=[");
        A10.append(this.A00);
        return AnonymousClass000.A0y("]]", A10);
    }

    public Object get() {
        return this.A00;
    }
}
