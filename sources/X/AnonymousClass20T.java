package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.20T  reason: invalid class name */
public abstract class AnonymousClass20T implements Iterator, C18450wR {
    public int A00() {
        AnonymousClass20U r2 = (AnonymousClass20U) this;
        int i = r2.A00;
        if (i != r2.A02) {
            r2.A00 = r2.A03 + i;
            return i;
        } else if (r2.A01) {
            r2.A01 = false;
            return i;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(A00());
    }
}
