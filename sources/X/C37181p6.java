package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1p6  reason: invalid class name and case insensitive filesystem */
public final class C37181p6 implements Set<AnonymousClass205>, C23171Ey {
    public final /* synthetic */ C71303Es A00 = new C71303Es();

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        C18070vi.A0d(obj, 0);
        return this.A00.add(obj);
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A00.addAll(collection);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean containsAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A00.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        Iterator it = this.A00.iterator();
        C18070vi.A0X(it);
        return it;
    }

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A00.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        return this.A00.retainAll(collection);
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        return C25916Coa.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass205)) {
            return false;
        }
        C18070vi.A0d(obj, 0);
        return this.A00.contains(obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof AnonymousClass205)) {
            return false;
        }
        C18070vi.A0d(obj, 0);
        return this.A00.remove(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }
}
