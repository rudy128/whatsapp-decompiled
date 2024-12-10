package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0ar  reason: invalid class name and case insensitive filesystem */
public final class C07390ar<K, V> extends C27358DcU<K> implements Set<K>, C23171Ey {
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
        return this.A00.containsKey(obj);
    }

    public Iterator iterator() {
        return new AnonymousClass088(this.A00);
    }

    public boolean remove(Object obj) {
        C07370ap r1 = this.A00;
        if (!r1.containsKey(obj)) {
            return false;
        }
        r1.remove(obj);
        return true;
    }

    public C07390ar(C07370ap r1) {
        this.A00 = r1;
    }
}
