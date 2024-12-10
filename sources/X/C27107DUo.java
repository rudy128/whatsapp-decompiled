package X;

import java.util.Iterator;

/* renamed from: X.DUo  reason: case insensitive filesystem */
public final class C27107DUo implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C27295DbO A01;

    public C27107DUo(C27295DbO dbO) {
        this.A01 = dbO;
        this.A00 = dbO.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }
}
