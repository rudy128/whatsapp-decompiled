package X;

import java.util.ListIterator;

public class DVA implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C27297DbS A01;

    public DVA(C27297DbS dbS, int i) {
        this.A01 = dbS;
        this.A00 = dbS.A00.listIterator(i);
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public int nextIndex() {
        return this.A00.nextIndex();
    }

    public /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public int previousIndex() {
        return this.A00.previousIndex();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw C17880vN.A0y();
    }

    public void remove() {
        throw C17880vN.A0y();
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw C17880vN.A0y();
    }
}
