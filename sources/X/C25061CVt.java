package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CVt  reason: case insensitive filesystem */
public abstract class C25061CVt {
    public final CLS A00;
    public volatile Object A01;

    public String toString() {
        double micros;
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass3MW.A1a();
        Object obj = this.A01;
        if (obj == null) {
            synchronized (this) {
                obj = this.A01;
                if (obj == null) {
                    obj = C17880vN.A0p();
                    this.A01 = obj;
                }
            }
        }
        synchronized (obj) {
            micros = ((double) TimeUnit.SECONDS.toMicros(1)) / ((C23569Blx) this).A01;
        }
        A1a[0] = Double.valueOf(micros);
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", A1a);
    }

    public C25061CVt(CLS cls) {
        this.A00 = cls;
    }
}
