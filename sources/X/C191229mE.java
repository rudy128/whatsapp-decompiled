package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9mE  reason: invalid class name and case insensitive filesystem */
public final class C191229mE {
    public final long A00;
    public final B4N A01;
    public final C22399B6c A02;
    public final Object A03 = C17880vN.A0p();
    public final Map A04 = C17880vN.A13();

    public C191229mE(B4N b4n, C22399B6c b6c) {
        C18070vi.A0d(b4n, 1);
        long millis = TimeUnit.MINUTES.toMillis(90);
        this.A01 = b4n;
        this.A02 = b6c;
        this.A00 = millis;
    }

    public final void A00(AnonymousClass9UL r4) {
        Runnable runnable;
        C18070vi.A0d(r4, 0);
        synchronized (this.A03) {
            runnable = (Runnable) this.A04.remove(r4);
        }
        if (runnable != null) {
            ((C20348AHe) this.A01).A00.removeCallbacks(runnable);
        }
    }
}
