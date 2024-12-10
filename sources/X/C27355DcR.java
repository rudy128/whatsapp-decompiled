package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.AbstractMapBuilderEntrySet;

/* renamed from: X.DcR  reason: case insensitive filesystem */
public final class C27355DcR<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    public final DVM A00;

    public boolean containsAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        DVM dvm = this.A00;
        for (Object next : collection) {
            if (next == null) {
                return false;
            }
            try {
                if (!dvm.A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DcR, java.util.AbstractSet] */
    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.A00.A05();
        return C27355DcR.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.DcR] */
    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.A00.A05();
        return C27355DcR.super.retainAll(collection);
    }

    public void clear() {
        this.A00.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.A00.A06(BE8.A0p(obj));
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Cbt, java.util.Iterator] */
    public Iterator iterator() {
        return new C25254Cbt(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry A0p = BE8.A0p(obj);
        DVM dvm = this.A00;
        dvm.A05();
        int A002 = DVM.A00(A0p.getKey(), dvm);
        if (A002 < 0) {
            return false;
        }
        Object[] objArr = dvm.valuesArray;
        C18070vi.A0b(objArr);
        if (!C18070vi.A18(objArr[A002], A0p.getValue())) {
            return false;
        }
        DVM.A03(dvm, A002);
        return true;
    }

    public C27355DcR(DVM dvm) {
        this.A00 = dvm;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C17880vN.A0y();
    }

    public boolean addAll(Collection collection) {
        throw C17880vN.A0y();
    }

    public C27355DcR() {
    }
}
