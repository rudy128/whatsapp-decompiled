package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1x9  reason: invalid class name and case insensitive filesystem */
public abstract class C41841x9 extends AnonymousClass1AP {
    public static final LinkedHashSet A04(Iterable iterable, Set set) {
        int size;
        C18070vi.A0d(set, 0);
        C18070vi.A0d(iterable, 1);
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (Integer.valueOf(size2) != null) {
                size = set.size() + size2;
                LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(size));
                linkedHashSet.addAll(set);
                C29401cD.A0J(iterable, linkedHashSet);
                return linkedHashSet;
            }
        }
        size = set.size() * 2;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(C200610r.A03(size));
        linkedHashSet2.addAll(set);
        C29401cD.A0J(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final LinkedHashSet A05(Object obj, Set set) {
        C18070vi.A0d(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final Set A06(Iterable iterable, Set set) {
        LinkedHashSet linkedHashSet;
        C18070vi.A0d(set, 0);
        C18070vi.A0d(iterable, 1);
        if (!(iterable instanceof Collection)) {
            iterable = C29431cG.A0t(iterable);
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return C29431cG.A12(set);
        }
        if (collection instanceof Set) {
            for (Object next : set) {
                if (!collection.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collection);
        }
        return linkedHashSet;
    }

    public static final Set A07(Object obj, Set set) {
        C18070vi.A0d(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(set.size()));
        boolean z = false;
        for (Object next : set) {
            if (z || !C18070vi.A18(next, obj)) {
                linkedHashSet.add(next);
            } else {
                z = true;
            }
        }
        return linkedHashSet;
    }
}
