package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class DUN implements Comparator {
    public static final DUN A00 = new Object();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        A5W a5w = ((C25774Cll) obj).A01;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long A02 = a5w.A02(timeUnit);
        long A03 = ((C25774Cll) obj2).A01.A03(timeUnit);
        if (A02 < A03) {
            return -1;
        }
        return AnonymousClass000.A1R((A02 > A03 ? 1 : (A02 == A03 ? 0 : -1))) ? 1 : 0;
    }
}
