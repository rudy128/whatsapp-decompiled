package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DcS  reason: case insensitive filesystem */
public final class C27356DcS<E> extends C27358DcU<E> implements Set<E>, Serializable, C23171Ey {
    public static final C27356DcS A00 = new C27356DcS(DVM.A00);
    public final DVM backing;

    public C27356DcS(DVM dvm) {
        C18070vi.A0d(dvm, 1);
        this.backing = dvm;
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.backing.A05();
        return super.addAll(collection);
    }

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.backing.A05();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.backing.A05();
        return super.retainAll(collection);
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly) {
            return new DRP(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(Object obj) {
        return AnonymousClass000.A1Q(this.backing.A04(obj));
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Cbt, java.util.Iterator] */
    public Iterator iterator() {
        return new C25254Cbt(this.backing);
    }

    public boolean remove(Object obj) {
        DVM dvm = this.backing;
        dvm.A05();
        int A002 = DVM.A00(obj, dvm);
        if (A002 < 0) {
            return false;
        }
        DVM.A03(dvm, A002);
        return true;
    }

    public C27356DcS() {
        this(new DVM());
    }
}
