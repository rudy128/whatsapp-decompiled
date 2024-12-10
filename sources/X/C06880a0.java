package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0a0  reason: invalid class name and case insensitive filesystem */
public final class C06880a0<T> implements List<T>, AnonymousClass1JB {
    public int A00;
    public int A01;
    public final int A02;
    public final C06820Zu A03;

    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    private final void A00() {
        if (this.A03.A02() != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw AnonymousClass000.A0k("fromIndex or toIndex are out of bounds");
        }
        A00();
        C06820Zu r1 = this.A03;
        int i3 = this.A02;
        return new C06880a0(r1, i + i3, i2 + i3);
    }

    public C06880a0(C06820Zu r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = i;
        this.A01 = r2.A02();
        this.A00 = i2 - i;
    }

    public void add(int i, Object obj) {
        A00();
        C06820Zu r1 = this.A03;
        r1.add(this.A02 + i, obj);
        this.A00 = size() + 1;
        this.A01 = r1.A02();
    }

    public boolean addAll(int i, Collection collection) {
        A00();
        C06820Zu r3 = this.A03;
        boolean addAll = r3.addAll(i + this.A02, collection);
        if (addAll) {
            this.A00 = size() + collection.size();
            this.A01 = r3.A02();
        }
        return addAll;
    }

    public void clear() {
        if (size() > 0) {
            A00();
            C06820Zu r2 = this.A03;
            int i = this.A02;
            r2.A06(i, size() + i);
            this.A00 = 0;
            this.A01 = r2.A02();
        }
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Q(indexOf(obj));
    }

    public Object get(int i) {
        A00();
        C04110Lw.A00(i, size());
        return this.A03.get(this.A02 + i);
    }

    public int indexOf(Object obj) {
        A00();
        int i = this.A02;
        Iterator it = C28851b7.A08(i, size() + i).iterator();
        while (it.hasNext()) {
            int A002 = ((AnonymousClass20T) it).A00();
            if (C18070vi.A18(obj, this.A03.get(A002))) {
                return A002 - i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!C18070vi.A18(obj, this.A03.get(size)));
        return size - i;
    }

    public ListIterator listIterator(int i) {
        A00();
        C98474rD r1 = new C98474rD();
        r1.element = i - 1;
        return new C06900a2(this, r1);
    }

    public final /* bridge */ Object remove(int i) {
        A00();
        C06820Zu r2 = this.A03;
        Object remove = r2.remove(this.A02 + i);
        this.A00 = size() - 1;
        this.A01 = r2.A02();
        return remove;
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        A00();
        C06820Zu r2 = this.A03;
        int i = this.A02;
        int A032 = r2.A03(collection, i, size() + i);
        if (A032 <= 0) {
            return false;
        }
        this.A01 = r2.A02();
        this.A00 = size() - A032;
        return true;
    }

    public Object set(int i, Object obj) {
        C04110Lw.A00(i, size());
        A00();
        C06820Zu r2 = this.A03;
        Object obj2 = r2.set(i + this.A02, obj);
        this.A01 = r2.A02();
        return obj2;
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public boolean add(Object obj) {
        A00();
        C06820Zu r2 = this.A03;
        r2.add(this.A02 + size(), obj);
        this.A00 = size() + 1;
        this.A01 = r2.A02();
        return true;
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
