package X;

import java.util.concurrent.Callable;

public class DVQ implements Callable {
    public final int A00;

    public DVQ(int i) {
        this.A00 = i;
    }

    public final Object call() {
        if (2 - this.A00 != 0) {
            return null;
        }
        C25798CmA cmA = DRK.A04;
        AnonymousClass1AK.A00("c++_shared");
        AnonymousClass1AK.A00("gifimage");
        return AnonymousClass000.A0i();
    }
}
