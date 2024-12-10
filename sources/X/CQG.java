package X;

import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

public final class CQG {
    public C25011CTl A00 = null;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public CQG(DOZ doz, CYO cyo, C25011CTl cTl, Map map) {
        this.A01 = new FutureTask(new C27125DVm(cTl, doz, cyo, map, 2));
    }
}
