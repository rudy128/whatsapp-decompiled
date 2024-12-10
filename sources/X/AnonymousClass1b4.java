package X;

import java.util.Iterator;

/* renamed from: X.1b4  reason: invalid class name */
public final class AnonymousClass1b4 implements Iterator, C18450wR {
    public final Iterator A00;
    public final /* synthetic */ AnonymousClass1b3 A01;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AnonymousClass1b4(AnonymousClass1b3 r2) {
        this.A01 = r2;
        this.A00 = r2.A01.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A01.A00.invoke(this.A00.next());
    }
}
