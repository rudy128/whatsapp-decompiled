package X;

import java.util.Iterator;

/* renamed from: X.DUm  reason: case insensitive filesystem */
public final class C27105DUm implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ C27291DbK A01;

    public C27105DUm(C27291DbK dbK) {
        this.A01 = dbK;
        this.A00 = dbK.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }
}
