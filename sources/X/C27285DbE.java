package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DbE  reason: case insensitive filesystem */
public abstract class C27285DbE<E> extends AbstractCollection<E> implements C28677EDz<E> {
    public transient Set elementSet;
    public transient Set entrySet;

    public abstract int add(Object obj, int i);

    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    public abstract void clear();

    public abstract int distinctElements();

    public abstract Iterator elementIterator();

    public abstract Iterator entryIterator();

    public abstract int remove(Object obj, int i);

    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.Blq] */
    public Set createElementSet() {
        return new C23562Blq(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.Blp] */
    public Set createEntrySet() {
        return new C23561Blp(this);
    }

    public Set elementSet() {
        Set set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public final boolean addAll(Collection collection) {
        return C26253Cvt.addAllImpl((C28677EDz) this, collection);
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1R(count(obj));
    }

    public final boolean equals(Object obj) {
        return C26253Cvt.equalsImpl(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final boolean removeAll(Collection collection) {
        return C26253Cvt.removeAllImpl(this, collection);
    }

    public final boolean retainAll(Collection collection) {
        return C26253Cvt.retainAllImpl(this, collection);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
