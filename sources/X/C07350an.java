package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0an  reason: invalid class name and case insensitive filesystem */
public final class C07350an<K, V> extends C27289DbI<V> implements Collection<V>, C23161Ex {
    public final C07370ap A00;

    public int A00() {
        return this.A00.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public Iterator iterator() {
        return new AnonymousClass089(this.A00);
    }

    public C07350an(C07370ap r1) {
        this.A00 = r1;
    }
}
