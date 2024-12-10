package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DcT  reason: case insensitive filesystem */
public final class C27357DcT<E> extends C27358DcU<E> implements Set<E>, C23171Ey {
    public final DVM A00;

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.A00.A05();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.A00.A05();
        return super.retainAll(collection);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Cbt, java.util.Iterator] */
    public Iterator iterator() {
        return new C25254Cbt(this.A00);
    }

    public boolean remove(Object obj) {
        DVM dvm = this.A00;
        dvm.A05();
        int A002 = DVM.A00(obj, dvm);
        if (A002 < 0) {
            return false;
        }
        DVM.A03(dvm, A002);
        return true;
    }

    public C27357DcT(DVM dvm) {
        this.A00 = dvm;
    }

    public boolean add(Object obj) {
        throw C17880vN.A0y();
    }

    public boolean addAll(Collection collection) {
        throw C17880vN.A0y();
    }
}
