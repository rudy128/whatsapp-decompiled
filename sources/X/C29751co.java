package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1co  reason: invalid class name and case insensitive filesystem */
public class C29751co implements Iterator, C18450wR {
    public int A00;
    public final /* synthetic */ C19800z1 A01;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C29751co(C19800z1 r1) {
        this.A01 = r1;
    }

    public boolean hasNext() {
        if (this.A00 < this.A01.size()) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (hasNext()) {
            C19800z1 r2 = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return r2.get(i);
        }
        throw new NoSuchElementException();
    }
}
