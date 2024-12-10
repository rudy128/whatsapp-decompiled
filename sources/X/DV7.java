package X;

import java.util.ListIterator;

public final class DV7 implements ListIterator {
    public final ListIterator A00;
    public final /* synthetic */ C27291DbK A01;

    public DV7(C27291DbK dbK, int i) {
        this.A01 = dbK;
        this.A00 = dbK.A00.listIterator(i);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    public final /* synthetic */ void add(Object obj) {
        throw C17880vN.A0y();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }

    public final /* synthetic */ void set(Object obj) {
        throw C17880vN.A0y();
    }
}
