package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Om  reason: invalid class name and case insensitive filesystem */
public final class C25511Om implements Set, Serializable, C18450wR {
    public static final C25511Om A00 = new Object();
    public static final long serialVersionUID = 3406603774387020532L;

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return collection.isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        return C25916Coa.A01(this, objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    private final Object readResolve() {
        return A00;
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public Iterator iterator() {
        return C18470wT.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }
}
