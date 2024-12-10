package X;

import java.util.NoSuchElementException;

/* renamed from: X.2UH  reason: invalid class name */
public abstract class AnonymousClass2UH {
    public static final AnonymousClass201 A00(Integer num) {
        if (num == null) {
            return AnonymousClass201.DEFAULT_ALL_MESSAGES;
        }
        for (AnonymousClass201 r2 : AnonymousClass201.A00) {
            if (r2.value == num.intValue()) {
                return r2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
