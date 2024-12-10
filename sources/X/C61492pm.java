package X;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.2pm  reason: invalid class name and case insensitive filesystem */
public class C61492pm {
    public A2B A00;
    public A2B A01;
    public final Set A02;

    public C61492pm(A2B a2b, A2B a2b2, Set set) {
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(new C147027Rn(14));
        this.A02 = concurrentSkipListSet;
        concurrentSkipListSet.addAll(set);
        this.A00 = a2b;
        this.A01 = a2b2;
    }

    public C61492pm() {
        this.A02 = new ConcurrentSkipListSet(new C147027Rn(14));
    }
}
