package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.0Zv  reason: invalid class name and case insensitive filesystem */
public final class C06830Zv implements List<C15710r4>, C18450wR {
    public final List A00 = new C06820Zu();

    public boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public ListIterator listIterator() {
        return this.A00.listIterator();
    }

    public ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
    }

    public List subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public final void A00(C15710r4 r2) {
        this.A00.add(r2);
    }

    public final void A01(C15710r4 r2) {
        this.A00.remove(r2);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C15710r4)) {
            return false;
        }
        return this.A00.contains(obj);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C15710r4)) {
            return -1;
        }
        return this.A00.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C15710r4)) {
            return -1;
        }
        return this.A00.lastIndexOf(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass000.A12();
    }

    public void clear() {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw AnonymousClass000.A12();
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw AnonymousClass000.A12();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw AnonymousClass000.A12();
    }

    public void sort(Comparator comparator) {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A12();
    }
}
