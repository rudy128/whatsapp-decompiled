package X;

import java.util.NoSuchElementException;

/* renamed from: X.9QH  reason: invalid class name */
public abstract class AnonymousClass9QH {
    public static final C179509Ig A00(int i) {
        for (C179509Ig r1 : C179509Ig.A00) {
            if (r1.value == i) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
