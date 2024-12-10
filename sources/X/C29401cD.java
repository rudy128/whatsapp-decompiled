package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.1cD  reason: invalid class name and case insensitive filesystem */
public abstract class C29401cD extends C29391cC {
    public static final Object A0I(List list) {
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final void A0J(Iterable iterable, Collection collection) {
        C18070vi.A0d(collection, 0);
        C18070vi.A0d(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final void A0K(Iterable iterable, C22821Di r2) {
        C18070vi.A0d(iterable, 0);
        A0M(iterable, r2, true);
    }

    public static final void A0L(Collection collection, Object[] objArr) {
        C18070vi.A0d(objArr, 1);
        List asList = Arrays.asList(objArr);
        C18070vi.A0X(asList);
        collection.addAll(asList);
    }

    public static final boolean A0N(List list, C22821Di r2) {
        C18070vi.A0d(list, 0);
        C18070vi.A0d(r2, 1);
        return A0O(list, r2, true);
    }

    public static final boolean A0O(List list, C22821Di r7, boolean z) {
        int i;
        if (list instanceof RandomAccess) {
            int size = list.size() - 1;
            int i2 = 0;
            if (size >= 0) {
                int i3 = 0;
                while (true) {
                    Object obj = list.get(i3);
                    if (((Boolean) r7.invoke(obj)).booleanValue() != z) {
                        if (i2 != i3) {
                            list.set(i2, obj);
                        }
                        i2++;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
            if (i2 >= list.size()) {
                return false;
            }
            int size2 = list.size() - 1;
            if (i2 > size2) {
                return true;
            }
            do {
                list.remove(size2);
                i = size2;
                size2--;
            } while (i != i2);
            return true;
        } else if (!(list instanceof C18450wR) || (list instanceof C23151Ew)) {
            return A0M(list, r7, z);
        } else {
            C41681wt.A05(list, "kotlin.collections.MutableIterable");
            throw null;
        }
    }

    public static final boolean A0M(Iterable iterable, C22821Di r3, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) r3.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
