package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.9wU  reason: invalid class name and case insensitive filesystem */
public abstract class C197309wU {
    public static final BigDecimal A00 = new BigDecimal("1000");

    public static BigDecimal A00(A6S a6s, long j) {
        int i = 0;
        while (true) {
            String str = a6s.A00;
            if (i >= 3 - A6S.A00(str)) {
                return new BigDecimal(new BigInteger(Long.toString(j)), A6S.A00(str));
            }
            j /= 10;
            i++;
        }
    }
}
