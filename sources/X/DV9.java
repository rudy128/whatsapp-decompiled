package X;

import java.util.ListIterator;

public final class DV9 implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C27295DbO A01;

    public DV9(C27295DbO dbO, int i) {
        this.A01 = dbO;
        this.A00 = dbO.A00.listIterator(i);
    }

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
