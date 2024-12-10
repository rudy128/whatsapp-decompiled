package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0aA  reason: invalid class name and case insensitive filesystem */
public final class C06980aA implements Set<K> {
    public final /* synthetic */ AnonymousClass00P A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C06980aA(AnonymousClass00P r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public boolean containsAll(Collection collection) {
        AnonymousClass00P r2 = this.A00;
        for (Object containsKey : collection) {
            if (!r2.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass00P r3 = this.A00;
        int i = 0;
        for (int size = r3.size() - 1; size >= 0; size--) {
            i += AnonymousClass001.A0k(r3.A04(size));
        }
        return i;
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C010506t(this.A00);
    }

    public boolean remove(Object obj) {
        AnonymousClass00P r1 = this.A00;
        int A02 = r1.A02(obj);
        if (A02 < 0) {
            return false;
        }
        r1.A05(A02);
        return true;
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass00P r3 = this.A00;
        int size = r3.size();
        for (Object remove : collection) {
            r3.remove(remove);
        }
        return AnonymousClass000.A1S(size, r3.size());
    }

    public boolean retainAll(Collection collection) {
        return this.A00.A0A(collection);
    }

    public int size() {
        return this.A00.size();
    }

    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.A00.A04(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public Object[] toArray() {
        AnonymousClass00P r4 = this.A00;
        int size = r4.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = r4.A04(i);
        }
        return objArr;
    }
}
