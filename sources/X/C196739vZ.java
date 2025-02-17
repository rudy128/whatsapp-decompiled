package X;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.9vZ  reason: invalid class name and case insensitive filesystem */
public abstract class C196739vZ {
    public static String A00(long j) {
        if (j < 10000) {
            return null;
        }
        int log = (int) (Math.log((double) j) / Math.log(1000.0d));
        if (log > 3) {
            log = 3;
        }
        return String.valueOf("KMB".charAt(log - 1));
    }

    public static String A01(C18000vb r8, long j) {
        if (j < 10000) {
            Locale A0N = r8.A0N();
            Object[] objArr = new Object[1];
            AnonymousClass3MX.A1S(objArr, 0, j);
            return String.format(A0N, "%,d", objArr);
        }
        double d = (double) j;
        double pow = Math.pow(1000.0d, (double) ((int) (Math.log(d) / Math.log(1000.0d))));
        double d2 = d / pow;
        long j2 = j / ((long) pow);
        if (d2 == ((double) j2) || ((int) (d2 * 10.0d)) % 10 == 0) {
            return String.valueOf(j2);
        }
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMinimumFractionDigits(1);
        instance.setMaximumFractionDigits(1);
        instance.setRoundingMode(RoundingMode.DOWN);
        return instance.format(d2);
    }
}
