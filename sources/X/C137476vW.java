package X;

import java.util.Collection;

/* renamed from: X.6vW  reason: invalid class name and case insensitive filesystem */
public abstract class C137476vW {
    public static boolean A01(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A00(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
