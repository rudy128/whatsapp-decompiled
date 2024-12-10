package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;

public final class DTR implements Runnable {
    public static final DTR A00 = new DTR();

    public final void run() {
        float andSet = (float) C25466CgL.A05.getAndSet(0);
        float andSet2 = (float) C25466CgL.A04.getAndSet(0);
        float andSet3 = (float) C25466CgL.A03.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f > 0.25f || f3 > 0.1f) {
                Iterator A0i = C17890vO.A0i(C25466CgL.A02);
                while (A0i.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                    C25466CgL.A00((CN9) A16.getKey(), -BE9.A0J(A16));
                }
            } else if (f2 > 0.98f) {
                Iterator A0i2 = C17890vO.A0i(C25466CgL.A02);
                while (A0i2.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A0i2);
                    C25466CgL.A00((CN9) A162.getKey(), BE9.A0J(A162));
                }
            }
            C25466CgL.A02.clear();
        }
        ((Handler) C25466CgL.A06.getValue()).postDelayed(C25466CgL.A00, 2000);
    }
}
