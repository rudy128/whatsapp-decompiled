package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A6o  reason: case insensitive filesystem */
public abstract class C20086A6o {
    public static double A01(List list, int i) {
        long A05 = C17880vN.A05(list.get(0));
        long A052 = C17880vN.A05(list.get(1));
        long j = (long) (2 << (i - 1));
        double d = 360.0d / ((double) j);
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(Double.valueOf(A00(A052, j, true)));
        A13.add(Double.valueOf((((double) A05) * d) - 180.0d));
        A13.add(Double.valueOf(A00(A052, j, false)));
        A13.add(Double.valueOf((d * ((double) (A05 + 1))) - 180.0d));
        return (double) (AnonymousClass8BX.A0D(AnonymousClass8BV.A09((Number) A13.get(1), AnonymousClass8BR.A00(A13.get(0))), "origin").distanceTo(AnonymousClass8BX.A0D(AnonymousClass8BV.A09((Number) A13.get(3), AnonymousClass8BR.A00(A13.get(2))), "destination")) / 2.0f);
    }

    public static double A00(long j, long j2, boolean z) {
        if (z) {
            j++;
        }
        double exp = Math.exp((((((double) j) * 1.0d) / ((double) j2)) - 0.5d) * 4.0d * 3.141592653589793d);
        return -((Math.asin((exp - 1.0d) / (exp + 1.0d)) * 180.0d) / 3.141592653589793d);
    }

    public static ArrayList A03(double d, double d2, int i) {
        if (i <= 0 || d < -85.05112878d || d > 85.05112878d || d2 < -180.0d || d2 > 180.0d) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        long j = (long) (2 << (i - 1));
        double d3 = (double) j;
        C17880vN.A1R(A13, (long) Math.min(Math.max(((d2 + 180.0d) / 360.0d) * d3, 0.0d), (double) (j - 1)));
        double sin = Math.sin((Math.min(Math.max(d, -85.05112878d), 85.05112878d) * 3.141592653589793d) / 180.0d);
        C17880vN.A1R(A13, (long) Math.min(Math.max((0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d)) * d3, 0.0d), d3 - 1.0d));
        return A13;
    }

    public static ArrayList A04(int i, long j, long j2) {
        long j3 = (long) (2 << (i - 1));
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(Double.valueOf((A00(j2, j3, true) + A00(j2, j3, false)) / 2.0d));
        A13.add(Double.valueOf(((360.0d / ((double) j3)) * (((double) j) + 0.5d)) - 180.0d));
        return A13;
    }

    public static String A02(Long l, Long l2, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        while (i > 0) {
            int i2 = 1 << (i - 1);
            char c = '0';
            if ((l.longValue() & ((long) i2)) != 0) {
                c = '1';
            }
            if ((l2.longValue() & ((long) i2)) != 0) {
                c = (char) (((char) (c + 1)) + 1);
            }
            A10.append(c);
            i--;
        }
        return A10.toString();
    }
}
