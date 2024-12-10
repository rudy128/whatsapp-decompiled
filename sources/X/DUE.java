package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public final class DUE implements Collection<C25756ClR>, C18450wR {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DUE) && C18070vi.A18(this.A01, ((DUE) obj).A01));
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C25756ClR)) {
            return false;
        }
        return this.A01.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.A01.containsAll(collection);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public Iterator iterator() {
        return this.A01.iterator();
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public DUE(List list) {
        this.A01 = list;
        this.A00 = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public void clear() {
        throw AnonymousClass000.A12();
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public boolean removeIf(Predicate predicate) {
        throw AnonymousClass000.A12();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LocaleList(localeList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
