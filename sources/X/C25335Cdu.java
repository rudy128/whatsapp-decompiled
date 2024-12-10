package X;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: X.Cdu  reason: case insensitive filesystem */
public abstract class C25335Cdu {
    public static Comparator comparator(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return DUS.natural();
        }
        return comparator;
    }

    public static boolean hasSameComparator(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        C199610h.A04(comparator);
        C199610h.A04(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else if (!(iterable instanceof C28675EDs)) {
            return false;
        } else {
            comparator2 = ((C28675EDs) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
