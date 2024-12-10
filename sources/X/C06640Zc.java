package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: X.0Zc  reason: invalid class name and case insensitive filesystem */
public final class C06640Zc implements Collection<Object>, C18450wR {
    public final Set A00 = new LinkedHashSet();

    public boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public /* synthetic */ C06640Zc(Set set, AnonymousClass1Y1 r3, int i) {
    }

    public final void A00(Object obj) {
        this.A00.add(obj);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    public final void clear() {
        this.A00.clear();
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.remove(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public boolean removeIf(Predicate predicate) {
        throw AnonymousClass000.A12();
    }

    public C06640Zc() {
    }
}
