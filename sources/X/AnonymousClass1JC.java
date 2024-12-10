package X;

import java.util.AbstractList;
import java.util.List;

/* renamed from: X.1JC  reason: invalid class name */
public abstract class AnonymousClass1JC<E> extends AbstractList<E> implements List<E>, AnonymousClass1JB {
    public int A0R() {
        return ((AnonymousClass1JD) this).A01;
    }

    public abstract Object A0S(int i);

    public abstract void add(int i, Object obj);

    public abstract Object set(int i, Object obj);

    public final /* bridge */ Object remove(int i) {
        return A0S(i);
    }

    public final /* bridge */ int size() {
        return A0R();
    }
}
