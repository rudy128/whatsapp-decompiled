package X;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class BJN extends DMr implements ScheduledFuture {
    public final ScheduledFuture A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(obj);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.A00.getDelay(timeUnit);
    }

    public BJN(E64 e64) {
        this.A00 = e64.BB5(new CLT(this));
    }
}
