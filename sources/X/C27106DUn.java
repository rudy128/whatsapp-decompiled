package X;

import java.util.Iterator;

/* renamed from: X.DUn  reason: case insensitive filesystem */
public final class C27106DUn implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C27293DbM A01;

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public C27106DUn(C27293DbM dbM) {
        this.A01 = dbM;
        this.A00 = dbM.A00.iterator();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }
}
