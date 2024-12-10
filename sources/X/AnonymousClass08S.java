package X;

import java.util.Iterator;

/* renamed from: X.08S  reason: invalid class name */
public final class AnonymousClass08S extends AnonymousClass0KV implements Iterator, C18450wR {
    public AnonymousClass08S(C06960a8 r1, Iterator it) {
        super(r1, it);
    }

    public /* bridge */ /* synthetic */ Object next() {
        A01();
        if (this.A01 != null) {
            return new C06950a7(this);
        }
        throw new IllegalStateException();
    }
}
