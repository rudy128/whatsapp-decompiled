package X;

import java.util.Comparator;

/* renamed from: X.7Rm  reason: invalid class name and case insensitive filesystem */
public final class C147017Rm implements Comparator {
    public static final C147017Rm A00 = new Object();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        C18070vi.A0h(obj, comparable);
        return comparable.compareTo(obj);
    }

    public final Comparator reversed() {
        return C147007Rl.A00;
    }
}
