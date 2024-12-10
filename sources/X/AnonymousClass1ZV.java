package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1ZV  reason: invalid class name */
public final class AnonymousClass1ZV<T> implements Collection<T>, C18450wR {
    public final Object[] A00;
    public final boolean A01;

    public boolean add(Object obj) {
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
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
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

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        return C25916Coa.A01(this, objArr);
    }

    public boolean contains(Object obj) {
        return C200410p.A0U(obj, this.A00);
    }

    public boolean isEmpty() {
        if (this.A00.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return AnonymousClass4I0.A00(this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.A00;
        if (this.A01 && C18070vi.A18(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        C18070vi.A0X(copyOf);
        return copyOf;
    }

    public AnonymousClass1ZV(Object[] objArr, boolean z) {
        this.A00 = objArr;
        this.A01 = z;
    }
}
