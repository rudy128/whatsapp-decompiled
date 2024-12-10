package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0Zy  reason: invalid class name and case insensitive filesystem */
public final class C06860Zy<T> implements List<T>, AnonymousClass1JB {
    public final C06970a9 A00;

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
        this.A00.A0B(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return this.A00.A0E(i, collection);
    }

    public void clear() {
        this.A00.A08();
    }

    public boolean contains(Object obj) {
        return this.A00.A0G(obj);
    }

    public boolean containsAll(Collection collection) {
        C06970a9 r2 = this.A00;
        for (Object A0G : collection) {
            if (!r2.A0G(A0G)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(Object obj) {
        return this.A00.A04(obj);
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.A00.A00);
    }

    public int lastIndexOf(Object obj) {
        return this.A00.A05(obj);
    }

    public ListIterator listIterator(int i) {
        return new C06890a1(this, i);
    }

    public boolean removeAll(Collection collection) {
        C06970a9 r4 = this.A00;
        if (collection.isEmpty()) {
            return false;
        }
        int i = r4.A00;
        for (Object A0H : collection) {
            r4.A0H(A0H);
        }
        if (i != r4.A00) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C06970a9 r4 = this.A00;
        int i = r4.A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(r4.A01[i2])) {
                r4.A06(i2);
            }
        }
        if (i == r4.A00) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public C06860Zy(C06970a9 r1) {
        this.A00 = r1;
    }

    public Object get(int i) {
        AnonymousClass0LA.A00(this, i);
        return this.A00.A01[i];
    }

    public final /* bridge */ Object remove(int i) {
        AnonymousClass0LA.A00(this, i);
        return this.A00.A06(i);
    }

    public Object set(int i, Object obj) {
        AnonymousClass0LA.A00(this, i);
        Object[] objArr = this.A00.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public List subList(int i, int i2) {
        AnonymousClass0LA.A01(this, i, i2);
        return new C06870Zz(this, i, i2);
    }

    public boolean add(Object obj) {
        return this.A00.A0F(obj);
    }

    public boolean addAll(Collection collection) {
        C06970a9 r1 = this.A00;
        return r1.A0E(r1.A00, collection);
    }

    public ListIterator listIterator() {
        return new C06890a1(this, 0);
    }

    public boolean remove(Object obj) {
        return this.A00.A0H(obj);
    }
}
