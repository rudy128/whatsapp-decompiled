package X;

import java.util.Comparator;

/* renamed from: X.Cf5  reason: case insensitive filesystem */
public final class C25403Cf5 {
    public static final Comparator A00;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(BE7.A0l(C25403Cf5.class).concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = C18.A01;
        }
        A00 = comparator;
    }
}
