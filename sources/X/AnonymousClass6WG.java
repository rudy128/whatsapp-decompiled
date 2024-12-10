package X;

import java.util.NoSuchElementException;

/* renamed from: X.6WG  reason: invalid class name */
public abstract class AnonymousClass6WG {
    public static final C122646Re A00(int i) {
        for (C122646Re r1 : C122646Re.A00) {
            if (r1.databaseValue == i) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
