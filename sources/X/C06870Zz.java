package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0Zz  reason: invalid class name and case insensitive filesystem */
public final class C06870Zz<T> implements List<T>, AnonymousClass1JB {
    public int A00;
    public final int A01;
    public final List A02;

    public Iterator iterator() {
        return new C06890a1(this, 0);
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public void add(int i, Object obj) {
        this.A02.add(i + this.A01, obj);
        this.A00++;
    }

    public boolean addAll(int i, Collection collection) {
        this.A02.addAll(i + this.A01, collection);
        this.A00 += collection.size();
        return AnonymousClass000.A1R(collection.size());
    }

    public void clear() {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 <= i) {
            while (true) {
                this.A02.remove(i);
                if (i == i2) {
                    break;
                }
                i--;
            }
        }
        this.A00 = i2;
    }

    public boolean contains(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            if (C18070vi.A18(this.A02.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        int i = this.A01;
        int i2 = i;
        int i3 = this.A00;
        while (i < i3) {
            if (C18070vi.A18(this.A02.get(i), obj)) {
                return i - i2;
            }
            i++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public int lastIndexOf(Object obj) {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 > i) {
            return -1;
        }
        while (!C18070vi.A18(this.A02.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    public ListIterator listIterator(int i) {
        return new C06890a1(this, i);
    }

    public boolean remove(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            List list = this.A02;
            if (C18070vi.A18(list.get(i2), obj)) {
                list.remove(i2);
                this.A00--;
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        int i = this.A00;
        for (Object remove : collection) {
            remove(remove);
        }
        return AnonymousClass000.A1S(i, this.A00);
    }

    public boolean retainAll(Collection collection) {
        int i = this.A00;
        int i2 = i - 1;
        int i3 = this.A01;
        if (i3 <= i2) {
            while (true) {
                List list = this.A02;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.A00--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return AnonymousClass000.A1S(i, this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public C06870Zz(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        AnonymousClass0LA.A00(this, i);
        return this.A02.get(i + this.A01);
    }

    public Object set(int i, Object obj) {
        AnonymousClass0LA.A00(this, i);
        return this.A02.set(i + this.A01, obj);
    }

    public List subList(int i, int i2) {
        AnonymousClass0LA.A01(this, i, i2);
        return new C06870Zz(this, i, i2);
    }

    public boolean add(Object obj) {
        List list = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        list.add(i, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        this.A02.addAll(this.A00, collection);
        this.A00 += collection.size();
        return AnonymousClass000.A1R(collection.size());
    }

    public ListIterator listIterator() {
        return new C06890a1(this, 0);
    }

    public final /* bridge */ Object remove(int i) {
        AnonymousClass0LA.A00(this, i);
        this.A00--;
        return this.A02.remove(i + this.A01);
    }
}
