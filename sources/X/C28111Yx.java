package X;

import java.util.Locale;

/* renamed from: X.1Yx  reason: invalid class name and case insensitive filesystem */
public abstract class C28111Yx {
    public static void A01(int i, int i2, String str, int i3) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    public static void A00(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void A02(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }
}
