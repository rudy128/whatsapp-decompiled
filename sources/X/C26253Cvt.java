package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Cvt  reason: case insensitive filesystem */
public abstract class C26253Cvt {
    public static boolean equalsImpl(C28677EDz eDz, Object obj) {
        if (obj != eDz) {
            if (obj instanceof C28677EDz) {
                C28677EDz eDz2 = (C28677EDz) obj;
                if (eDz.size() == eDz2.size() && eDz.entrySet().size() == eDz2.entrySet().size()) {
                    for (C25259Cby cby : eDz2.entrySet()) {
                        if (eDz.count(cby.getElement()) != cby.getCount()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean addAllImpl(C28677EDz eDz, C28677EDz eDz2) {
        if (eDz2 instanceof C23543BlW) {
            return addAllImpl(eDz, (C23543BlW) eDz2);
        }
        if (eDz2.isEmpty()) {
            return false;
        }
        for (C25259Cby cby : eDz2.entrySet()) {
            eDz.add(cby.getElement(), cby.getCount());
        }
        return true;
    }

    public static boolean removeAllImpl(C28677EDz eDz, Collection collection) {
        if (collection instanceof C28677EDz) {
            collection = ((C28677EDz) collection).elementSet();
        }
        return eDz.elementSet().removeAll(collection);
    }

    public static Iterator iteratorImpl(C28677EDz eDz) {
        return new C27112DUv(eDz, eDz.entrySet().iterator());
    }

    public static boolean retainAllImpl(C28677EDz eDz, Collection collection) {
        C199610h.A04(collection);
        if (collection instanceof C28677EDz) {
            collection = ((C28677EDz) collection).elementSet();
        }
        return eDz.elementSet().retainAll(collection);
    }

    public static C28677EDz cast(Iterable iterable) {
        return (C28677EDz) iterable;
    }

    public static boolean addAllImpl(C28677EDz eDz, Collection collection) {
        C199610h.A04(eDz);
        C199610h.A04(collection);
        if (collection instanceof C28677EDz) {
            return addAllImpl(eDz, cast(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C23921Id.addAll(eDz, collection.iterator());
    }

    public static boolean addAllImpl(C28677EDz eDz, C23543BlW blW) {
        if (blW.isEmpty()) {
            return false;
        }
        blW.addTo(eDz);
        return true;
    }
}
