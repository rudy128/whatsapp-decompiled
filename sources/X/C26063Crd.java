package X;

import java.util.Collection;

/* renamed from: X.Crd  reason: case insensitive filesystem */
public abstract class C26063Crd {
    public static Collection castOrCopyToCollection(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C220618l.newArrayList(iterable.iterator());
    }

    public static Iterable partition(Iterable iterable, int i) {
        C199610h.A04(iterable);
        return new C23545BlY(iterable, 200);
    }

    public static Object[] toArray(Iterable iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    public static String toString(Iterable iterable) {
        return C23921Id.toString(iterable.iterator());
    }
}
