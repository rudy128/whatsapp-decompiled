package X;

import java.util.NoSuchElementException;

/* renamed from: X.2Up  reason: invalid class name and case insensitive filesystem */
public abstract class C50482Up {
    public static final AnonymousClass200 A00(int i) {
        for (AnonymousClass200 r1 : AnonymousClass200.A00) {
            if (r1.value == i) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
