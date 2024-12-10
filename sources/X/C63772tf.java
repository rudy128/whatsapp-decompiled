package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2tf  reason: invalid class name and case insensitive filesystem */
public abstract class C63772tf {
    public static boolean equalsImpl(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static HashSet newHashSet(Object... objArr) {
        HashSet newHashSetWithExpectedSize = newHashSetWithExpectedSize(objArr.length);
        Collections.addAll(newHashSetWithExpectedSize, objArr);
        return newHashSetWithExpectedSize;
    }

    public static int hashCodeImpl(Set set) {
        int i = 0;
        for (Object A0l : set) {
            i = ((i + AnonymousClass001.A0l(A0l)) ^ -1) ^ -1;
        }
        return i;
    }

    public static HashSet newHashSetWithExpectedSize(int i) {
        return new HashSet(C62742ru.capacity(i));
    }

    public static boolean removeAllImpl(Set set, Collection collection) {
        C199610h.A04(collection);
        if (collection instanceof C28677EDz) {
            collection = ((C28677EDz) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return removeAllImpl(set, collection.iterator());
        }
        return C23921Id.removeAll(set.iterator(), collection);
    }

    public static boolean removeAllImpl(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
