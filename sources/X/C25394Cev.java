package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Cev  reason: case insensitive filesystem */
public abstract class C25394Cev {
    public static AtomicBoolean A00 = C108965cb.A0w();

    public static void A00() {
        boolean isEnabled = Trace.isEnabled();
        if (A00.compareAndSet(!isEnabled, isEnabled)) {
            C25927Coq.A00(false);
        }
    }
}
