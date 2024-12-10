package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.DbL  reason: case insensitive filesystem */
public abstract class C27292DbL<E> extends AbstractList<E> implements EE7<E> {
    public boolean A00 = true;

    public boolean add(Object obj) {
        A01();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        A01();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        A01();
        return super.addAll(collection);
    }

    public void clear() {
        A01();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    int i = 0;
                    while (i < size) {
                        if (BE8.A1Y(get(i), list, i)) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        A01();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        A01();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        A01();
        return super.retainAll(collection);
    }

    public final void A01() {
        if (!this.A00) {
            throw C17880vN.A0y();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass000.A0O(get(i2), i * 31);
        }
        return i;
    }
}
