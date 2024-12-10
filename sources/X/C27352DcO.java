package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.DcO  reason: case insensitive filesystem */
public final class C27352DcO<T> extends AnonymousClass1JC<T> {
    public final List A00;

    public Iterator iterator() {
        return listIterator(0);
    }

    public int A0R() {
        return this.A00.size();
    }

    public Object A0S(int i) {
        return this.A00.remove(C29411cE.A0P(this, i));
    }

    public void add(int i, Object obj) {
        this.A00.add(C29411cE.A0Q(this, i), obj);
    }

    public void clear() {
        this.A00.clear();
    }

    public Object get(int i) {
        return this.A00.get(C29411cE.A0P(this, i));
    }

    public ListIterator listIterator(int i) {
        return new DVC(this, i);
    }

    public Object set(int i, Object obj) {
        return this.A00.set(C29411cE.A0P(this, i), obj);
    }

    public C27352DcO(List list) {
        this.A00 = list;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
