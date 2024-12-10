package X;

import java.util.NoSuchElementException;

/* renamed from: X.6XM  reason: invalid class name */
public abstract class AnonymousClass6XM {
    public static final Integer A00(int i) {
        for (Integer num : AnonymousClass00R.A00(5)) {
            if (AnonymousClass6XN.A00(num) == i) {
                return num;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
