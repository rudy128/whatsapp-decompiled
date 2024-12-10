package X;

import java.util.ListIterator;

public final class DV8 implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C27293DbM A01;

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    public DV8(C27293DbM dbM, int i) {
        this.A01 = dbM;
        this.A00 = dbM.A00.listIterator(i);
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
