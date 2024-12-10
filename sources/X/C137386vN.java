package X;

import java.util.Arrays;

/* renamed from: X.6vN  reason: invalid class name and case insensitive filesystem */
public abstract class C137386vN {
    public static void A01(AnonymousClass19Y r2, Integer num, String str) {
        if (num != null) {
            r2.markerPoint(926875649, num.intValue(), str);
        }
    }

    public static int A00(int i) {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = Long.valueOf(System.nanoTime());
        C17880vN.A1T(A1b, i, 1);
        return Arrays.hashCode(A1b);
    }
}
