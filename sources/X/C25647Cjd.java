package X;

import android.os.ConditionVariable;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Cjd  reason: case insensitive filesystem */
public final class C25647Cjd {
    public C30671eK A00;
    public final ConditionVariable A01 = new ConditionVariable();

    public static void A00(C25647Cjd cjd, Object obj) {
        cjd.A00 = new C30671eK(obj);
        cjd.A01.open();
    }

    public final Object A01() {
        if (this.A01.block(10000)) {
            C30671eK r0 = this.A00;
            if (r0 != null) {
                Object obj = r0.value;
                C30691eM.A01(obj);
                return obj;
            }
            throw AnonymousClass000.A0n("Result not assigned but condition variable opened");
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
