package X;

import java.util.Comparator;

/* renamed from: X.7Rl  reason: invalid class name and case insensitive filesystem */
public final class C147007Rl implements Comparator {
    public static final C147007Rl A00 = new Object();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        C18070vi.A0h(comparable, obj2);
        return comparable.compareTo(obj2);
    }

    public final Comparator reversed() {
        return C147017Rm.A00;
    }
}
