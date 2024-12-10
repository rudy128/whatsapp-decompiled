package X;

import java.util.Locale;

/* renamed from: X.9zY  reason: invalid class name and case insensitive filesystem */
public class C199169zY {
    public final A7B A00;
    public final Integer A01;

    public String toString() {
        String str;
        int intValue;
        A7B a7b = this.A00;
        if (a7b != null) {
            str = "NETWORK";
            intValue = a7b.A00;
        } else {
            str = "CLIENT";
            Integer num = this.A01;
            C17960vV.A07(num);
            intValue = num.intValue();
        }
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        C17880vN.A1T(A1a, intValue, 1);
        return String.format(locale, "[type=%s, code=%d]", A1a);
    }

    public C199169zY(int i) {
        this.A00 = null;
        this.A01 = Integer.valueOf(i);
    }

    public C199169zY(A7B a7b) {
        this.A00 = a7b;
        this.A01 = null;
    }
}
