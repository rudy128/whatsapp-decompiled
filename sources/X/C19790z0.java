package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0z0  reason: invalid class name and case insensitive filesystem */
public abstract class C19790z0<E> implements Collection<E>, C18450wR {
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

    public Iterator iterator() {
        return new C29751co((C19800z1) this);
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

    public int A0B() {
        if (this instanceof C19820z3) {
            return ((C19820z3) this).entries.length;
        }
        if (this instanceof AnonymousClass3F3) {
            return ((AnonymousClass3F3) this).A00.length;
        }
        return ((AnonymousClass3F2) this).A00;
    }

    public boolean contains(Object obj) {
        if (!(this instanceof Collection) || !isEmpty()) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (C18070vi.A18(it.next(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return C29431cG.A0g(", ", "[", "]", this, new AnonymousClass3IV(this));
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return A0B();
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }
}
