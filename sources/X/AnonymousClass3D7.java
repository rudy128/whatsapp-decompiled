package X;

import java.util.Iterator;

/* renamed from: X.3D7  reason: invalid class name */
public abstract class AnonymousClass3D7 implements Iterator, C18450wR {
    public abstract long A00();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(A00());
    }
}
