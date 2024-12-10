package X;

import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.9PG  reason: invalid class name */
public abstract class AnonymousClass9PG {
    public static final BigDecimal A00(AE5 ae5, BigDecimal bigDecimal, Date date) {
        C18070vi.A0d(date, 2);
        if (bigDecimal == null) {
            return null;
        }
        if (ae5 == null || !ae5.A00(date)) {
            return bigDecimal;
        }
        return ae5.A00;
    }
}
