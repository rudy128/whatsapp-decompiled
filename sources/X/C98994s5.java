package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.4s5  reason: invalid class name and case insensitive filesystem */
public final class C98994s5 implements Iterator, C18450wR {
    public final /* synthetic */ Enumeration A00;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C98994s5(Enumeration enumeration) {
        this.A00 = enumeration;
    }

    public boolean hasNext() {
        return this.A00.hasMoreElements();
    }

    public Object next() {
        return this.A00.nextElement();
    }
}
