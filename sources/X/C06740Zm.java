package X;

import java.util.Iterator;

/* renamed from: X.0Zm  reason: invalid class name and case insensitive filesystem */
public final class C06740Zm implements Iterator, C18450wR {
    public final Iterator A00;

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public C06740Zm(AnonymousClass0AC r2) {
        this.A00 = r2.A08.iterator();
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }
}
