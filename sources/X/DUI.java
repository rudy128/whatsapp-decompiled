package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class DUI implements Comparator {
    public final boolean A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        A5W a5w = ((C6R) obj).A00;
        A5W a5w2 = ((C6R) obj2).A00;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long A03 = a5w.A03(timeUnit);
        long A02 = a5w.A02(timeUnit);
        long A032 = a5w2.A03(timeUnit);
        long A022 = a5w2.A02(timeUnit);
        if (this.A00) {
            int i = (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
            if (i == 0) {
                return (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
            }
            return i;
        }
        int i2 = (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
        if (i2 == 0) {
            return (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
        }
        return i2;
    }

    public DUI(boolean z) {
        this.A00 = z;
    }
}
