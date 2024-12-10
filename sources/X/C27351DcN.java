package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.DcN  reason: case insensitive filesystem */
public final class C27351DcN<V> extends C27289DbI<V> implements Collection<V>, C23161Ex {
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
        return this.A00.containsValue(obj);
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
        int i = dvm.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (dvm.presenceArray[i] >= 0) {
                Object[] objArr = dvm.valuesArray;
                C18070vi.A0b(objArr);
                if (C18070vi.A18(objArr[i], obj)) {
                    DVM.A03(dvm, i);
                    return true;
                }
            }
        }
    }

    public C27351DcN(DVM dvm) {
        this.A00 = dvm;
    }

    public boolean add(Object obj) {
        throw C17880vN.A0y();
    }

    public boolean addAll(Collection collection) {
        throw C17880vN.A0y();
    }
}
