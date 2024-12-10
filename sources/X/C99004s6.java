package X;

import java.util.Iterator;

/* renamed from: X.4s6  reason: invalid class name and case insensitive filesystem */
public final class C99004s6 implements Iterator, C18450wR {
    public int A00;
    public final Iterator A01;

    public C99004s6(Iterator it) {
        C18070vi.A0d(it, 1);
        this.A01 = it;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= 0) {
            return new C194139rE(i, this.A01.next());
        }
        AnonymousClass1ZU.A0B();
        throw null;
    }
}
