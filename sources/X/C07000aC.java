package X;

import java.util.Set;

/* renamed from: X.0aC  reason: invalid class name and case insensitive filesystem */
public abstract class C07000aC<K, V, E> implements Set<E>, C23171Ey {
    public final C06960a8 A00;

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public C07000aC(C06960a8 r1) {
        this.A00 = r1;
    }

    public final C06960a8 A00() {
        return this.A00;
    }
}
