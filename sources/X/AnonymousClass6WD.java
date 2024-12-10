package X;

import java.util.ArrayList;

/* renamed from: X.6WD  reason: invalid class name */
public abstract class AnonymousClass6WD {
    public static ArrayList A00(Long l, int[] iArr) {
        long longValue;
        ArrayList A13 = AnonymousClass000.A13();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            j += (long) iArr[i];
            if (i != length - 1 || l == null) {
                if (j > j2) {
                    int i2 = (int) ((((j - j2) + 15) / 16) * 16);
                    C17890vO.A1D(A13, i2);
                    j3 = j2;
                    j2 = ((long) i2) + j2;
                }
                i++;
            } else {
                if (j > j2) {
                    longValue = l.longValue() - j2;
                } else {
                    A13.remove(AnonymousClass000.A0Q(A13));
                    longValue = l.longValue() - j3;
                }
                C17890vO.A1D(A13, (int) longValue);
            }
        }
        return A13;
    }
}
